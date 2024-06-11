package com.maxscrub.bw.sffoodtrucksoftheday.databinding;
import com.maxscrub.bw.sffoodtrucksoftheday.R;
import com.maxscrub.bw.sffoodtrucksoftheday.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemTruckBindingImpl extends ListItemTruckBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.timeDivider, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mListenerOnTruckClickedAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ListItemTruckBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ListItemTruckBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[4]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.vendorAddress.setTag(null);
        this.vendorCloseTime.setTag(null);
        this.vendorDescription.setTag(null);
        this.vendorName.setTag(null);
        this.vendorOpenTime.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.listener == variableId) {
            setListener((com.maxscrub.bw.sffoodtrucksoftheday.view.TruckClickListener) variable);
        }
        else if (BR.truck == variableId) {
            setTruck((com.maxscrub.bw.sffoodtrucksoftheday.model.Truck) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setListener(@Nullable com.maxscrub.bw.sffoodtrucksoftheday.view.TruckClickListener Listener) {
        this.mListener = Listener;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.listener);
        super.requestRebind();
    }
    public void setTruck(@Nullable com.maxscrub.bw.sffoodtrucksoftheday.model.Truck Truck) {
        this.mTruck = Truck;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.truck);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String truckOptionalText = null;
        java.lang.String truckLocation = null;
        android.view.View.OnClickListener listenerOnTruckClickedAndroidViewViewOnClickListener = null;
        com.maxscrub.bw.sffoodtrucksoftheday.view.TruckClickListener listener = mListener;
        com.maxscrub.bw.sffoodtrucksoftheday.model.Truck truck = mTruck;
        java.lang.String truckEnd24 = null;
        java.lang.String truckApplicant = null;
        java.lang.String truckStart24 = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (listener != null) {
                    // read listener::onTruckClicked
                    listenerOnTruckClickedAndroidViewViewOnClickListener = (((mListenerOnTruckClickedAndroidViewViewOnClickListener == null) ? (mListenerOnTruckClickedAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mListenerOnTruckClickedAndroidViewViewOnClickListener).setValue(listener));
                }
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (truck != null) {
                    // read truck.optionalText
                    truckOptionalText = truck.getOptionalText();
                    // read truck.location
                    truckLocation = truck.getLocation();
                    // read truck.end24
                    truckEnd24 = truck.getEnd24();
                    // read truck.applicant
                    truckApplicant = truck.getApplicant();
                    // read truck.start24
                    truckStart24 = truck.getStart24();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(listenerOnTruckClickedAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.vendorAddress, truckLocation);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.vendorCloseTime, truckEnd24);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.vendorDescription, truckOptionalText);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.vendorName, truckApplicant);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.vendorOpenTime, truckStart24);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.maxscrub.bw.sffoodtrucksoftheday.view.TruckClickListener value;
        public OnClickListenerImpl setValue(com.maxscrub.bw.sffoodtrucksoftheday.view.TruckClickListener value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onTruckClicked(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): listener
        flag 1 (0x2L): truck
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}