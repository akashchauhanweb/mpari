package com.zepto;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class bd5 extends z31 {
    public int i;
    public int j;
    public LayoutInflater k;

    public bd5(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.j = i;
        this.i = i;
        this.k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // com.zepto.z31
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.k.inflate(this.j, viewGroup, false);
    }

    @Override // com.zepto.z31
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.k.inflate(this.i, viewGroup, false);
    }
}
