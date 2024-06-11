package com.maxscrub.bw.sffoodtrucksoftheday.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0006\u0010\u0019\u001a\u00020\u0018J\b\u0010\u001a\u001a\u00020\u0018H\u0014J\u0006\u0010\u001b\u001a\u00020\u0018J\u0016\u0010\u001c\u001a\u00020\u00182\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\u0016\u0010\u001e\u001a\u00020\u00182\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\n\u00a8\u0006\u001f"}, d2 = {"Lcom/maxscrub/bw/sffoodtrucksoftheday/viewmodel/TruckListViewModel;", "Lcom/maxscrub/bw/sffoodtrucksoftheday/viewmodel/BaseViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "isLoading", "Landroidx/lifecycle/MutableLiveData;", "", "()Landroidx/lifecycle/MutableLiveData;", "prefHelper", "Lcom/maxscrub/bw/sffoodtrucksoftheday/model/SharedPreferencesHelper;", "refreshTime", "", "truckLoadError", "getTruckLoadError", "truckService", "Lcom/maxscrub/bw/sffoodtrucksoftheday/model/TruckApiService;", "trucks", "", "Lcom/maxscrub/bw/sffoodtrucksoftheday/model/Truck;", "getTrucks", "fetchFromDatabase", "", "fetchFromRemote", "onCleared", "refresh", "storeTrucksLocally", "truckList", "trucksRetrieved", "app_debug"})
public final class TruckListViewModel extends com.maxscrub.bw.sffoodtrucksoftheday.viewmodel.BaseViewModel {
    private final com.maxscrub.bw.sffoodtrucksoftheday.model.TruckApiService truckService = null;
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    private com.maxscrub.bw.sffoodtrucksoftheday.model.SharedPreferencesHelper prefHelper;
    private long refreshTime = 300000000000L;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.maxscrub.bw.sffoodtrucksoftheday.model.Truck>> trucks = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> truckLoadError = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.maxscrub.bw.sffoodtrucksoftheday.model.Truck>> getTrucks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getTruckLoadError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    public final void refresh() {
    }
    
    public final void fetchFromRemote() {
    }
    
    private final void fetchFromDatabase() {
    }
    
    private final void trucksRetrieved(java.util.List<com.maxscrub.bw.sffoodtrucksoftheday.model.Truck> truckList) {
    }
    
    private final void storeTrucksLocally(java.util.List<com.maxscrub.bw.sffoodtrucksoftheday.model.Truck> truckList) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public TruckListViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}