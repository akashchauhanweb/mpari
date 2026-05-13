package com.zepto;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.h;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b24 implements Parcelable {
    public final String c;
    public final int e;
    public final Bundle f;
    public final Bundle g;
    public static final b h = new b(null);

    @JvmField
    public static final Parcelable.Creator<b24> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b24 createFromParcel(Parcel inParcel) {
            Intrinsics.checkNotNullParameter(inParcel, "inParcel");
            return new b24(inParcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b24[] newArray(int i) {
            return new b24[i];
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public b24(a24 entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.c = entry.f();
        this.e = entry.e().P();
        this.f = entry.c();
        Bundle bundle = new Bundle();
        this.g = bundle;
        entry.i(bundle);
    }

    public final int c() {
        return this.e;
    }

    public final String d() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final a24 e(Context context, j24 destination, h.b hostLifecycleState, f24 f24Var) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(hostLifecycleState, "hostLifecycleState");
        Bundle bundle = this.f;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        return a24.o.a(context, destination, bundle, hostLifecycleState, f24Var, this.c, this.g);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.c);
        parcel.writeInt(this.e);
        parcel.writeBundle(this.f);
        parcel.writeBundle(this.g);
    }

    public b24(Parcel inParcel) {
        Intrinsics.checkNotNullParameter(inParcel, "inParcel");
        String string = inParcel.readString();
        Intrinsics.checkNotNull(string);
        this.c = string;
        this.e = inParcel.readInt();
        this.f = inParcel.readBundle(b24.class.getClassLoader());
        Bundle bundle = inParcel.readBundle(b24.class.getClassLoader());
        Intrinsics.checkNotNull(bundle);
        this.g = bundle;
    }
}
