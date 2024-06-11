package com.maxscrub.bw.sffoodtrucksoftheday.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'\u00a8\u0006\b"}, d2 = {"Lcom/maxscrub/bw/sffoodtrucksoftheday/model/TruckApi;", "", "getTrucks", "Lio/reactivex/Single;", "", "Lcom/maxscrub/bw/sffoodtrucksoftheday/model/Truck;", "dayorder", "", "app_debug"})
public abstract interface TruckApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "resource/jjew-r69b.json")
    @retrofit2.http.Headers(value = {"X-App-Token: dANrEghQNAdGQQp4ad8AUtJUZ"})
    public abstract io.reactivex.Single<java.util.List<com.maxscrub.bw.sffoodtrucksoftheday.model.Truck>> getTrucks(@retrofit2.http.Query(value = "dayorder")
    int dayorder);
}