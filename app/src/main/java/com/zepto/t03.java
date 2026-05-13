package com.zepto;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class t03 implements Parcelable {
    public final IntentSender c;
    public final Intent e;
    public final int f;
    public final int g;
    public static final c h = new c(null);

    @JvmField
    public static final Parcelable.Creator<t03> CREATOR = new b();

    public static final class a {
        public final IntentSender a;
        public Intent b;
        public int c;
        public int d;

        public a(IntentSender intentSender) {
            Intrinsics.checkNotNullParameter(intentSender, "intentSender");
            this.a = intentSender;
        }

        public final t03 a() {
            return new t03(this.a, this.b, this.c, this.d);
        }

        public final a b(Intent intent) {
            this.b = intent;
            return this;
        }

        public final a c(int i, int i2) {
            this.d = i;
            this.c = i2;
            return this;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(PendingIntent pendingIntent) {
            Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
            IntentSender intentSender = pendingIntent.getIntentSender();
            Intrinsics.checkNotNullExpressionValue(intentSender, "pendingIntent.intentSender");
            this(intentSender);
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public t03 createFromParcel(Parcel inParcel) {
            Intrinsics.checkNotNullParameter(inParcel, "inParcel");
            return new t03(inParcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public t03[] newArray(int i) {
            return new t03[i];
        }
    }

    public static final class c {
        public c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public t03(IntentSender intentSender, Intent intent, int i, int i2) {
        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
        this.c = intentSender;
        this.e = intent;
        this.f = i;
        this.g = i2;
    }

    public final Intent c() {
        return this.e;
    }

    public final int d() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int e() {
        return this.g;
    }

    public final IntentSender f() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.c, i);
        dest.writeParcelable(this.e, i);
        dest.writeInt(this.f);
        dest.writeInt(this.g);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public t03(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        Intrinsics.checkNotNull(parcelable);
        this((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }
}
