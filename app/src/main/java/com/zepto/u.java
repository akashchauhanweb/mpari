package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class u implements Parcelable {
    public static final a CREATOR = new a(null);

    @xy5("channelId")
    private String channelId;

    @xy5("encryptedRequest")
    private String encryptedRequest;

    @xy5("flag")
    private String flag;

    @xy5("key")
    private String key;

    @xy5("sessionId")
    private String sessionId;

    public static final class a implements Parcelable.Creator {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public u createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new u(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public u[] newArray(int i) {
            return new u[i];
        }
    }

    public u() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ u copy$default(u uVar, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uVar.key;
        }
        if ((i & 2) != 0) {
            str2 = uVar.channelId;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = uVar.encryptedRequest;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = uVar.sessionId;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = uVar.flag;
        }
        return uVar.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.channelId;
    }

    public final String component3() {
        return this.encryptedRequest;
    }

    public final String component4() {
        return this.sessionId;
    }

    public final String component5() {
        return this.flag;
    }

    public final u copy(String str, String str2, String str3, String str4, String str5) {
        return new u(str, str2, str3, str4, str5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.areEqual(this.key, uVar.key) && Intrinsics.areEqual(this.channelId, uVar.channelId) && Intrinsics.areEqual(this.encryptedRequest, uVar.encryptedRequest) && Intrinsics.areEqual(this.sessionId, uVar.sessionId) && Intrinsics.areEqual(this.flag, uVar.flag);
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final String getEncryptedRequest() {
        return this.encryptedRequest;
    }

    public final String getFlag() {
        return this.flag;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        String str = this.key;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.channelId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.encryptedRequest;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sessionId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.flag;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setChannelId(String str) {
        this.channelId = str;
    }

    public final void setEncryptedRequest(String str) {
        this.encryptedRequest = str;
    }

    public final void setFlag(String str) {
        this.flag = str;
    }

    public final void setKey(String str) {
        this.key = str;
    }

    public final void setSessionId(String str) {
        this.sessionId = str;
    }

    public String toString() {
        return "APIRequest(key=" + ((Object) this.key) + ", channelId=" + ((Object) this.channelId) + ", encryptedRequest=" + ((Object) this.encryptedRequest) + ", sessionId=" + ((Object) this.sessionId) + ", flag=" + ((Object) this.flag) + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.key);
        parcel.writeString(this.channelId);
        parcel.writeString(this.encryptedRequest);
        parcel.writeString(this.sessionId);
        parcel.writeString(this.flag);
    }

    public u(String str, String str2, String str3, String str4, String str5) {
        this.key = str;
        this.channelId = str2;
        this.encryptedRequest = str3;
        this.sessionId = str4;
        this.flag = str5;
    }

    public /* synthetic */ u(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
