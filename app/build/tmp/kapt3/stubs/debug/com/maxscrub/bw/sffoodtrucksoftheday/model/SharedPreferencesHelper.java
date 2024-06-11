package com.maxscrub.bw.sffoodtrucksoftheday.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u0007\u00a8\u0006\n"}, d2 = {"Lcom/maxscrub/bw/sffoodtrucksoftheday/model/SharedPreferencesHelper;", "", "()V", "getUpdateTime", "", "()Ljava/lang/Long;", "saveUpdateTime", "", "time", "Companion", "app_debug"})
public final class SharedPreferencesHelper {
    private static final java.lang.String PREF_TIME = "Pref time";
    private static android.content.SharedPreferences prefs;
    private static volatile com.maxscrub.bw.sffoodtrucksoftheday.model.SharedPreferencesHelper instance;
    private static final java.lang.Object LOCK = null;
    public static final com.maxscrub.bw.sffoodtrucksoftheday.model.SharedPreferencesHelper.Companion Companion = null;
    
    @android.annotation.SuppressLint(value = {"CommitPrefEdits"})
    public final void saveUpdateTime(long time) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getUpdateTime() {
        return null;
    }
    
    public SharedPreferencesHelper() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0011\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0086\u0002R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/maxscrub/bw/sffoodtrucksoftheday/model/SharedPreferencesHelper$Companion;", "", "()V", "LOCK", "PREF_TIME", "", "instance", "Lcom/maxscrub/bw/sffoodtrucksoftheday/model/SharedPreferencesHelper;", "prefs", "Landroid/content/SharedPreferences;", "buildHelper", "context", "Landroid/content/Context;", "invoke", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.maxscrub.bw.sffoodtrucksoftheday.model.SharedPreferencesHelper invoke(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final com.maxscrub.bw.sffoodtrucksoftheday.model.SharedPreferencesHelper buildHelper(android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}