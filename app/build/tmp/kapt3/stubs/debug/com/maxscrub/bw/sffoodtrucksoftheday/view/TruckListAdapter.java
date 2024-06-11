package com.maxscrub.bw.sffoodtrucksoftheday.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001cB\u001d\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0014\u0010\u0019\u001a\u00020\u000f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u001bR\u000e\u0010\t\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u001d"}, d2 = {"Lcom/maxscrub/bw/sffoodtrucksoftheday/view/TruckListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/maxscrub/bw/sffoodtrucksoftheday/view/TruckListAdapter$TruckViewHolder;", "Lcom/maxscrub/bw/sffoodtrucksoftheday/view/TruckClickListener;", "truckList", "Ljava/util/ArrayList;", "Lcom/maxscrub/bw/sffoodtrucksoftheday/model/Truck;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "currentTruck", "getTruckList", "()Ljava/util/ArrayList;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onTruckClicked", "v", "Landroid/view/View;", "updateTruckList", "newTruckList", "", "TruckViewHolder", "app_debug"})
public final class TruckListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.maxscrub.bw.sffoodtrucksoftheday.view.TruckListAdapter.TruckViewHolder> implements com.maxscrub.bw.sffoodtrucksoftheday.view.TruckClickListener {
    private com.maxscrub.bw.sffoodtrucksoftheday.model.Truck currentTruck;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.maxscrub.bw.sffoodtrucksoftheday.model.Truck> truckList = null;
    
    public final void updateTruckList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.maxscrub.bw.sffoodtrucksoftheday.model.Truck> newTruckList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.maxscrub.bw.sffoodtrucksoftheday.view.TruckListAdapter.TruckViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.maxscrub.bw.sffoodtrucksoftheday.view.TruckListAdapter.TruckViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public void onTruckClicked(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.maxscrub.bw.sffoodtrucksoftheday.model.Truck> getTruckList() {
        return null;
    }
    
    public TruckListAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.maxscrub.bw.sffoodtrucksoftheday.model.Truck> truckList) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\b"}, d2 = {"Lcom/maxscrub/bw/sffoodtrucksoftheday/view/TruckListAdapter$TruckViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Lcom/maxscrub/bw/sffoodtrucksoftheday/databinding/ListItemTruckBinding;", "(Lcom/maxscrub/bw/sffoodtrucksoftheday/databinding/ListItemTruckBinding;)V", "getView", "()Lcom/maxscrub/bw/sffoodtrucksoftheday/databinding/ListItemTruckBinding;", "setView", "app_debug"})
    public static final class TruckViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.maxscrub.bw.sffoodtrucksoftheday.databinding.ListItemTruckBinding view;
        
        @org.jetbrains.annotations.NotNull()
        public final com.maxscrub.bw.sffoodtrucksoftheday.databinding.ListItemTruckBinding getView() {
            return null;
        }
        
        public final void setView(@org.jetbrains.annotations.NotNull()
        com.maxscrub.bw.sffoodtrucksoftheday.databinding.ListItemTruckBinding p0) {
        }
        
        public TruckViewHolder(@org.jetbrains.annotations.NotNull()
        com.maxscrub.bw.sffoodtrucksoftheday.databinding.ListItemTruckBinding view) {
            super(null);
        }
    }
}