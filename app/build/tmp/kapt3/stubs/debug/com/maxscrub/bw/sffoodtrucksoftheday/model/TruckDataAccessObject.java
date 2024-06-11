package com.maxscrub.bw.sffoodtrucksoftheday.model;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ+\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u000f\"\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/maxscrub/bw/sffoodtrucksoftheday/model/TruckDataAccessObject;", "", "deleteAllTrucks", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllTrucks", "", "Lcom/maxscrub/bw/sffoodtrucksoftheday/model/Truck;", "getTodayTrucksAlphabetical", "dayOfWeek", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertAll", "", "trucks", "", "([Lcom/maxscrub/bw/sffoodtrucksoftheday/model/Truck;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface TruckDataAccessObject {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Object insertAll(@org.jetbrains.annotations.NotNull()
    com.maxscrub.bw.sffoodtrucksoftheday.model.Truck[] trucks, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.Long>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM truck ORDER BY Applicant ASC")
    public abstract java.lang.Object getAllTrucks(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.maxscrub.bw.sffoodtrucksoftheday.model.Truck>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM truck WHERE :dayOfWeek = DayOrder ORDER BY Applicant ASC")
    public abstract java.lang.Object getTodayTrucksAlphabetical(int dayOfWeek, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.maxscrub.bw.sffoodtrucksoftheday.model.Truck>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM truck")
    public abstract java.lang.Object deleteAllTrucks(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0);
}