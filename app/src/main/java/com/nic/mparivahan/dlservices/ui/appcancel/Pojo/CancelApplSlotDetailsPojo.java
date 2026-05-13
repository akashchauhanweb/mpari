package com.nic.mparivahan.dlservices.ui.appcancel.Pojo;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011¢\u0006\u0002\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u0019\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u0091\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011HÆ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u00020/HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001J\u0019\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020/HÖ\u0001R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R!\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014¨\u0006;"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/appcancel/Pojo/CancelApplSlotDetailsPojo;", "Landroid/os/Parcelable;", "rtoName", "", "rtoCd", "gender", "dob", "applName", "applno", "swdName", "slotDate", "slotTimings", "age", "relation", "reqObjlst", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/dlservices/ui/appcancel/Pojo/CancelApplReqObjList;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "getAge", "()Ljava/lang/String;", "getApplName", "getApplno", "getDob", "getGender", "getRelation", "getReqObjlst", "()Ljava/util/ArrayList;", "getRtoCd", "getRtoName", "getSlotDate", "getSlotTimings", "getSwdName", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CancelApplSlotDetailsPojo implements Parcelable {
    public static final Parcelable.Creator<CancelApplSlotDetailsPojo> CREATOR = new a();
    private final String age;
    private final String applName;
    private final String applno;
    private final String dob;
    private final String gender;
    private final String relation;
    private final ArrayList<CancelApplReqObjList> reqObjlst;
    private final String rtoCd;
    private final String rtoName;
    private final String slotDate;
    private final String slotTimings;
    private final String swdName;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CancelApplSlotDetailsPojo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(CancelApplReqObjList.CREATOR.createFromParcel(parcel));
            }
            return new CancelApplSlotDetailsPojo(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CancelApplSlotDetailsPojo[] newArray(int i) {
            return new CancelApplSlotDetailsPojo[i];
        }
    }

    public CancelApplSlotDetailsPojo(String rtoName, String rtoCd, String gender, String dob, String applName, String applno, String swdName, String slotDate, String slotTimings, String age, String relation, ArrayList<CancelApplReqObjList> reqObjlst) {
        Intrinsics.checkNotNullParameter(rtoName, "rtoName");
        Intrinsics.checkNotNullParameter(rtoCd, "rtoCd");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(applName, "applName");
        Intrinsics.checkNotNullParameter(applno, "applno");
        Intrinsics.checkNotNullParameter(swdName, "swdName");
        Intrinsics.checkNotNullParameter(slotDate, "slotDate");
        Intrinsics.checkNotNullParameter(slotTimings, "slotTimings");
        Intrinsics.checkNotNullParameter(age, "age");
        Intrinsics.checkNotNullParameter(relation, "relation");
        Intrinsics.checkNotNullParameter(reqObjlst, "reqObjlst");
        this.rtoName = rtoName;
        this.rtoCd = rtoCd;
        this.gender = gender;
        this.dob = dob;
        this.applName = applName;
        this.applno = applno;
        this.swdName = swdName;
        this.slotDate = slotDate;
        this.slotTimings = slotTimings;
        this.age = age;
        this.relation = relation;
        this.reqObjlst = reqObjlst;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRtoName() {
        return this.rtoName;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getAge() {
        return this.age;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getRelation() {
        return this.relation;
    }

    public final ArrayList<CancelApplReqObjList> component12() {
        return this.reqObjlst;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRtoCd() {
        return this.rtoCd;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDob() {
        return this.dob;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getApplName() {
        return this.applName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getApplno() {
        return this.applno;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSwdName() {
        return this.swdName;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSlotDate() {
        return this.slotDate;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSlotTimings() {
        return this.slotTimings;
    }

    public final CancelApplSlotDetailsPojo copy(String rtoName, String rtoCd, String gender, String dob, String applName, String applno, String swdName, String slotDate, String slotTimings, String age, String relation, ArrayList<CancelApplReqObjList> reqObjlst) {
        Intrinsics.checkNotNullParameter(rtoName, "rtoName");
        Intrinsics.checkNotNullParameter(rtoCd, "rtoCd");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(applName, "applName");
        Intrinsics.checkNotNullParameter(applno, "applno");
        Intrinsics.checkNotNullParameter(swdName, "swdName");
        Intrinsics.checkNotNullParameter(slotDate, "slotDate");
        Intrinsics.checkNotNullParameter(slotTimings, "slotTimings");
        Intrinsics.checkNotNullParameter(age, "age");
        Intrinsics.checkNotNullParameter(relation, "relation");
        Intrinsics.checkNotNullParameter(reqObjlst, "reqObjlst");
        return new CancelApplSlotDetailsPojo(rtoName, rtoCd, gender, dob, applName, applno, swdName, slotDate, slotTimings, age, relation, reqObjlst);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CancelApplSlotDetailsPojo)) {
            return false;
        }
        CancelApplSlotDetailsPojo cancelApplSlotDetailsPojo = (CancelApplSlotDetailsPojo) other;
        return Intrinsics.areEqual(this.rtoName, cancelApplSlotDetailsPojo.rtoName) && Intrinsics.areEqual(this.rtoCd, cancelApplSlotDetailsPojo.rtoCd) && Intrinsics.areEqual(this.gender, cancelApplSlotDetailsPojo.gender) && Intrinsics.areEqual(this.dob, cancelApplSlotDetailsPojo.dob) && Intrinsics.areEqual(this.applName, cancelApplSlotDetailsPojo.applName) && Intrinsics.areEqual(this.applno, cancelApplSlotDetailsPojo.applno) && Intrinsics.areEqual(this.swdName, cancelApplSlotDetailsPojo.swdName) && Intrinsics.areEqual(this.slotDate, cancelApplSlotDetailsPojo.slotDate) && Intrinsics.areEqual(this.slotTimings, cancelApplSlotDetailsPojo.slotTimings) && Intrinsics.areEqual(this.age, cancelApplSlotDetailsPojo.age) && Intrinsics.areEqual(this.relation, cancelApplSlotDetailsPojo.relation) && Intrinsics.areEqual(this.reqObjlst, cancelApplSlotDetailsPojo.reqObjlst);
    }

    public final String getAge() {
        return this.age;
    }

    public final String getApplName() {
        return this.applName;
    }

    public final String getApplno() {
        return this.applno;
    }

    public final String getDob() {
        return this.dob;
    }

    public final String getGender() {
        return this.gender;
    }

    public final String getRelation() {
        return this.relation;
    }

    public final ArrayList<CancelApplReqObjList> getReqObjlst() {
        return this.reqObjlst;
    }

    public final String getRtoCd() {
        return this.rtoCd;
    }

    public final String getRtoName() {
        return this.rtoName;
    }

    public final String getSlotDate() {
        return this.slotDate;
    }

    public final String getSlotTimings() {
        return this.slotTimings;
    }

    public final String getSwdName() {
        return this.swdName;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.rtoName.hashCode() * 31) + this.rtoCd.hashCode()) * 31) + this.gender.hashCode()) * 31) + this.dob.hashCode()) * 31) + this.applName.hashCode()) * 31) + this.applno.hashCode()) * 31) + this.swdName.hashCode()) * 31) + this.slotDate.hashCode()) * 31) + this.slotTimings.hashCode()) * 31) + this.age.hashCode()) * 31) + this.relation.hashCode()) * 31) + this.reqObjlst.hashCode();
    }

    public String toString() {
        return "CancelApplSlotDetailsPojo(rtoName=" + this.rtoName + ", rtoCd=" + this.rtoCd + ", gender=" + this.gender + ", dob=" + this.dob + ", applName=" + this.applName + ", applno=" + this.applno + ", swdName=" + this.swdName + ", slotDate=" + this.slotDate + ", slotTimings=" + this.slotTimings + ", age=" + this.age + ", relation=" + this.relation + ", reqObjlst=" + this.reqObjlst + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.rtoName);
        parcel.writeString(this.rtoCd);
        parcel.writeString(this.gender);
        parcel.writeString(this.dob);
        parcel.writeString(this.applName);
        parcel.writeString(this.applno);
        parcel.writeString(this.swdName);
        parcel.writeString(this.slotDate);
        parcel.writeString(this.slotTimings);
        parcel.writeString(this.age);
        parcel.writeString(this.relation);
        ArrayList<CancelApplReqObjList> arrayList = this.reqObjlst;
        parcel.writeInt(arrayList.size());
        Iterator<CancelApplReqObjList> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ CancelApplSlotDetailsPojo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, arrayList);
    }
}
