package com.lucky.smartclinicdoctors.ui.fragments.pateint;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0014J\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/lucky/smartclinicdoctors/ui/fragments/pateint/PatientsViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "context", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_patients", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/xwray/groupie/kotlinandroidextensions/Item;", "listener", "Lcom/google/firebase/firestore/ListenerRegistration;", "onCleared", "", "patients", "doctor_debug"})
public final class PatientsViewModel extends androidx.lifecycle.AndroidViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.xwray.groupie.kotlinandroidextensions.Item>> _patients = null;
    private com.google.firebase.firestore.ListenerRegistration listener;
    private final android.app.Application context = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.xwray.groupie.kotlinandroidextensions.Item>> patients() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public PatientsViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application context) {
        super(null);
    }
}