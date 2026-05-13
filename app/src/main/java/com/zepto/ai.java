package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ai implements Parcelable {
    public static final a CREATOR = new a(null);
    private String conditionalmsg;
    private String conditionaltitle;
    private String nomessage;
    private Integer ruleId;
    private Integer timeperiod;
    private String yesmessage;

    public static final class a implements Parcelable.Creator {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public ai createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ai(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ai[] newArray(int i) {
            return new ai[i];
        }
    }

    public ai() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ai(Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.conditionaltitle = parcel.readString();
        this.yesmessage = parcel.readString();
        this.nomessage = parcel.readString();
        Object value = parcel.readValue(Integer.TYPE.getClassLoader());
        this.timeperiod = value instanceof Integer ? (Integer) value : null;
        this.conditionalmsg = parcel.readString();
        this.ruleId = Integer.valueOf(parcel.readInt());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getConditionalmsg() {
        return this.conditionalmsg;
    }

    public final String getConditionaltitle() {
        return this.conditionaltitle;
    }

    public final String getNomessage() {
        return this.nomessage;
    }

    public final Integer getRuleId() {
        return this.ruleId;
    }

    public final Integer getTimeperiod() {
        return this.timeperiod;
    }

    public final String getYesmessage() {
        return this.yesmessage;
    }

    public final void setConditionalmsg(String str) {
        this.conditionalmsg = str;
    }

    public final void setConditionaltitle(String str) {
        this.conditionaltitle = str;
    }

    public final void setNomessage(String str) {
        this.nomessage = str;
    }

    public final void setRuleId(Integer num) {
        this.ruleId = num;
    }

    public final void setTimeperiod(Integer num) {
        this.timeperiod = num;
    }

    public final void setYesmessage(String str) {
        this.yesmessage = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel p0, int i) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        p0.writeString(this.conditionaltitle);
        p0.writeString(this.yesmessage);
        p0.writeString(this.nomessage);
        p0.writeValue(this.timeperiod);
        p0.writeString(this.conditionalmsg);
        Integer num = this.ruleId;
        Intrinsics.checkNotNull(num);
        p0.writeInt(num.intValue());
    }
}
