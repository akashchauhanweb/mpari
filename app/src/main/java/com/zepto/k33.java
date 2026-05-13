package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k33 implements Parcelable {
    public static final a CREATOR = new a(null);

    @xy5("client_id")
    private String client_id;

    @xy5("client_secret")
    private String client_secret;

    @xy5("password")
    private String password;

    @xy5("username")
    private String username;

    public static final class a implements Parcelable.Creator {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public k33 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new k33(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public k33[] newArray(int i) {
            return new k33[i];
        }
    }

    public k33() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k33(Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.username = parcel.readString();
        this.password = parcel.readString();
        this.client_id = parcel.readString();
        this.client_secret = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getClient_id() {
        return this.client_id;
    }

    public final String getClient_secret() {
        return this.client_secret;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getUsername() {
        return this.username;
    }

    public final void setClient_id(String str) {
        this.client_id = str;
    }

    public final void setClient_secret(String str) {
        this.client_secret = str;
    }

    public final void setPassword(String str) {
        this.password = str;
    }

    public final void setUsername(String str) {
        this.username = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.username);
        parcel.writeString(this.password);
        parcel.writeString(this.client_id);
        parcel.writeString(this.client_secret);
    }
}
