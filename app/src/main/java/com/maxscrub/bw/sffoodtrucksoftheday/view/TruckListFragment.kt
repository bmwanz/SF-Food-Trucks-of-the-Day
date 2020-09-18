package com.maxscrub.bw.sffoodtrucksoftheday.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.maxscrub.bw.sffoodtrucksoftheday.R
import com.maxscrub.bw.sffoodtrucksoftheday.model.TruckDatabase
import com.maxscrub.bw.sffoodtrucksoftheday.viewmodel.TruckListViewModel
import kotlinx.android.synthetic.main.fragment_truck_list.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import java.util.*
import kotlin.coroutines.CoroutineContext


class TruckListFragment : Fragment(), CoroutineScope {

    private val job = Job()

    private lateinit var truckListViewModel : TruckListViewModel
    private val truckListAdapter = TruckListAdapter(arrayListOf())

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_truck_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // instantiate view model
        truckListViewModel = ViewModelProviders.of(this).get(TruckListViewModel::class.java)
        truckListViewModel.refresh()

        // instantiate truck list
        truckList.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = truckListAdapter
        }

        refreshLayout.setOnRefreshListener {
            truckList.visibility = View.GONE
            listError.visibility = View.GONE
            loadingView.visibility = View.VISIBLE

            truckListViewModel.fetchFromRemote()

            // make default spinner disappear, use our own spinner
            refreshLayout.isRefreshing = false
        }

        observeViewModel()
    }

    private fun observeViewModel() {
        // observe mutable live data variables
        truckListViewModel.trucks.observe(this, Observer { trucks ->
            trucks?.let {
                launch {
                    val curatedTrucks = activity?.application?.let { it1 ->
                        TruckDatabase(it1)
                            .truckDataObject()
                            .getAllTrucks()
                    }
                    truckList.visibility = View.VISIBLE
                    curatedTrucks?.let { it1 -> truckListAdapter.updateTruckList(it1) }
                }
            }
        })

        truckListViewModel.truckLoadError.observe(this, Observer { isError ->
            isError?.let {
                listError.visibility = if(it) View.VISIBLE else View.GONE
            }
        })

        truckListViewModel.isLoading.observe(this, Observer { isLoading ->
            isLoading?.let {
                // if is loading, show spinner, else hide
                loadingView.visibility = if(it) View.VISIBLE else View.GONE

                if (it) {
                    // if is loading, hide everything else
                    listError.visibility = View.GONE
                    truckList.visibility = View.GONE
                }
            }
        })
    }

    override val coroutineContext: CoroutineContext
        get() = job + Dispatchers.Main

}