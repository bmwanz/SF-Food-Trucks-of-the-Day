package com.maxscrub.bw.sffoodtrucksoftheday.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.maxscrub.bw.sffoodtrucksoftheday.R
import com.maxscrub.bw.sffoodtrucksoftheday.databinding.ListItemTruckBinding
import com.maxscrub.bw.sffoodtrucksoftheday.model.Truck
import java.util.*
import kotlin.collections.ArrayList

class TruckListAdapter(val truckList: ArrayList<Truck>) :
    RecyclerView.Adapter<TruckListAdapter.TruckViewHolder>(), TruckClickListener {

    private lateinit var currentTruck : Truck

    fun updateTruckList(newTruckList: List<Truck>) {
        // when we get new data from backend
        truckList.clear()

        val openTruckList = mutableListOf<Truck>()
        val currentTimeHour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY)

        for (truck in newTruckList) {
            if (truck.start24?.substring(0,2)?.toInt()!! <= currentTimeHour
                && truck.end24?.substring(0,2)?.toInt()!! > currentTimeHour
            ) {
                openTruckList.add(truck)
            }
        }

        truckList.addAll(openTruckList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TruckViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view =
            DataBindingUtil.inflate<ListItemTruckBinding>(inflater, R.layout.list_item_truck, parent, false)
        return TruckViewHolder(view)
    }

    override fun getItemCount(): Int {
        return truckList.size
    }

    override fun onBindViewHolder(holder: TruckViewHolder, position: Int) {
        holder.view.truck = truckList[position]
        holder.view.listener = this
        currentTruck = truckList[position]
    }

    override fun onTruckClicked(v: View) {
        val action = currentTruck.applicant?.let { it ->
            currentTruck.latitude?.let { it1 ->
                currentTruck.longitude?.let { it2 ->
                    TruckListFragmentDirections.actionToMapFrag(
                        it, it1, it2
                    )
                }
            }
        }

        if (action != null) {
            Navigation.findNavController(v).navigate(action)
        }
    }

    class TruckViewHolder(var view: ListItemTruckBinding) : RecyclerView.ViewHolder(view.root)
}
