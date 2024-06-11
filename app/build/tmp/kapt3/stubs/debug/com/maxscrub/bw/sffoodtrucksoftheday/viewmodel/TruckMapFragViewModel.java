package com.maxscrub.bw.sffoodtrucksoftheday.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lcom/maxscrub/bw/sffoodtrucksoftheday/viewmodel/TruckMapFragViewModel;", "Lcom/maxscrub/bw/sffoodtrucksoftheday/viewmodel/BaseViewModel;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "truck", "Landroidx/lifecycle/MutableLiveData;", "Lcom/maxscrub/bw/sffoodtrucksoftheday/model/Truck;", "getTruck", "()Landroidx/lifecycle/MutableLiveData;", "onMapReady", "", "googleMap", "Lcom/google/android/gms/maps/GoogleMap;", "app_debug"})
public final class TruckMapFragViewModel extends com.maxscrub.bw.sffoodtrucksoftheday.viewmodel.BaseViewModel implements com.google.android.gms.maps.OnMapReadyCallback {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maxscrub.bw.sffoodtrucksoftheday.model.Truck> truck = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.maxscrub.bw.sffoodtrucksoftheday.model.Truck> getTruck() {
        return null;
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    public TruckMapFragViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}