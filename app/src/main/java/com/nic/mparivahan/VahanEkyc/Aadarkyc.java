package com.nic.mparivahan.VahanEkyc;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0007"}, d2 = {"Lcom/nic/mparivahan/VahanEkyc/Aadarkyc;", "", "()V", "DOAuthOTP", "DOEkyc", "DoAadhaarResponse", "Response", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Aadarkyc {

    @Keep
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0006\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0006R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\u000eR\u0014\u0010\u001b\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006¨\u0006\u001d"}, d2 = {"Lcom/nic/mparivahan/VahanEkyc/Aadarkyc$DOAuthOTP;", "", "()V", "actionErrorCode", "", "getActionErrorCode", "()Ljava/lang/String;", "email", "getEmail", "errorCode", "getErrorCode", "last_four_mobile", "getLast_four_mobile", "setLast_four_mobile", "(Ljava/lang/String;)V", "mobileverify", "", "getMobileverify", "()Ljava/lang/Boolean;", "setMobileverify", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "reason", "getReason", "status", "getStatus", "setStatus", "uidtkn", "getUidtkn", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DOAuthOTP {
        private Boolean mobileverify = Boolean.FALSE;
        private String status = " ";
        private String last_four_mobile = " ";
        private final String actionErrorCode = " ";
        private final String email = " ";
        private final String errorCode = "";
        private final String reason = " ";
        private final String uidtkn = "";

        public final String getActionErrorCode() {
            return this.actionErrorCode;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getErrorCode() {
            return this.errorCode;
        }

        public final String getLast_four_mobile() {
            return this.last_four_mobile;
        }

        public final Boolean getMobileverify() {
            return this.mobileverify;
        }

        public final String getReason() {
            return this.reason;
        }

        public final String getStatus() {
            return this.status;
        }

        public final String getUidtkn() {
            return this.uidtkn;
        }

        public final void setLast_four_mobile(String str) {
            this.last_four_mobile = str;
        }

        public final void setMobileverify(Boolean bool) {
            this.mobileverify = bool;
        }

        public final void setStatus(String str) {
            this.status = str;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b8\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BÑ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003¢\u0006\u0002\u0010\u0017J\t\u0010B\u001a\u00020\u000bHÖ\u0001J\u0019\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u000bHÖ\u0001R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001d\"\u0004\b'\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001d\"\u0004\b)\u0010\u001fR\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001d\"\u0004\b+\u0010\u001fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001d\"\u0004\b-\u0010\u001fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001d\"\u0004\b/\u0010\u001fR\u001a\u0010\u0011\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0019\"\u0004\b1\u0010\u001bR\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001d\"\u0004\b3\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001d\"\u0004\b5\u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001d\"\u0004\b7\u0010\u001fR\u001a\u0010\u0013\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001d\"\u0004\b9\u0010\u001fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u001d\"\u0004\b;\u0010\u001fR\u001a\u0010\u0016\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u001d\"\u0004\b=\u0010\u001fR\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u001d\"\u0004\b?\u0010\u001fR\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001d\"\u0004\bA\u0010\u001f¨\u0006H"}, d2 = {"Lcom/nic/mparivahan/VahanEkyc/Aadarkyc$DOEkyc;", "Landroid/os/Parcelable;", "name", "", "localityIfAny", "house", "street", "state", "pincode", "dist", "aadhaarNo", "", "careOf", "code", "dob", "gender", "landMark", "phone", "pht", "status", "villageTownCity", "xmlUID", "subDist", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAadhaarNo", "()I", "setAadhaarNo", "(I)V", "getCareOf", "()Ljava/lang/String;", "setCareOf", "(Ljava/lang/String;)V", "getCode", "setCode", "getDist", "setDist", "getDob", "setDob", "getGender", "setGender", "getHouse", "setHouse", "getLandMark", "setLandMark", "getLocalityIfAny", "setLocalityIfAny", "getName", "setName", "getPhone", "setPhone", "getPht", "setPht", "getPincode", "setPincode", "getState", "setState", "getStatus", "setStatus", "getStreet", "setStreet", "getSubDist", "setSubDist", "getVillageTownCity", "setVillageTownCity", "getXmlUID", "setXmlUID", "describeContents", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DOEkyc implements Parcelable {
        public static final Parcelable.Creator<DOEkyc> CREATOR = new a();
        private int aadhaarNo;
        private String careOf;
        private String code;
        private String dist;
        private String dob;
        private String gender;
        private String house;
        private String landMark;
        private String localityIfAny;
        private String name;
        private int phone;
        private String pht;
        private String pincode;
        private String state;
        private String status;
        private String street;
        private String subDist;
        private String villageTownCity;
        private String xmlUID;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DOEkyc createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DOEkyc(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final DOEkyc[] newArray(int i) {
                return new DOEkyc[i];
            }
        }

        public DOEkyc() {
            this(null, null, null, null, null, null, null, 0, null, null, null, null, null, 0, null, null, null, null, null, 524287, null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final int getAadhaarNo() {
            return this.aadhaarNo;
        }

        public final String getCareOf() {
            return this.careOf;
        }

        public final String getCode() {
            return this.code;
        }

        public final String getDist() {
            return this.dist;
        }

        public final String getDob() {
            return this.dob;
        }

        public final String getGender() {
            return this.gender;
        }

        public final String getHouse() {
            return this.house;
        }

        public final String getLandMark() {
            return this.landMark;
        }

        public final String getLocalityIfAny() {
            return this.localityIfAny;
        }

        public final String getName() {
            return this.name;
        }

        public final int getPhone() {
            return this.phone;
        }

        public final String getPht() {
            return this.pht;
        }

        public final String getPincode() {
            return this.pincode;
        }

        public final String getState() {
            return this.state;
        }

        public final String getStatus() {
            return this.status;
        }

        public final String getStreet() {
            return this.street;
        }

        public final String getSubDist() {
            return this.subDist;
        }

        public final String getVillageTownCity() {
            return this.villageTownCity;
        }

        public final String getXmlUID() {
            return this.xmlUID;
        }

        public final void setAadhaarNo(int i) {
            this.aadhaarNo = i;
        }

        public final void setCareOf(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.careOf = str;
        }

        public final void setCode(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.code = str;
        }

        public final void setDist(String str) {
            this.dist = str;
        }

        public final void setDob(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.dob = str;
        }

        public final void setGender(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.gender = str;
        }

        public final void setHouse(String str) {
            this.house = str;
        }

        public final void setLandMark(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.landMark = str;
        }

        public final void setLocalityIfAny(String str) {
            this.localityIfAny = str;
        }

        public final void setName(String str) {
            this.name = str;
        }

        public final void setPhone(int i) {
            this.phone = i;
        }

        public final void setPht(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.pht = str;
        }

        public final void setPincode(String str) {
            this.pincode = str;
        }

        public final void setState(String str) {
            this.state = str;
        }

        public final void setStatus(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.status = str;
        }

        public final void setStreet(String str) {
            this.street = str;
        }

        public final void setSubDist(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.subDist = str;
        }

        public final void setVillageTownCity(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.villageTownCity = str;
        }

        public final void setXmlUID(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.xmlUID = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.name);
            parcel.writeString(this.localityIfAny);
            parcel.writeString(this.house);
            parcel.writeString(this.street);
            parcel.writeString(this.state);
            parcel.writeString(this.pincode);
            parcel.writeString(this.dist);
            parcel.writeInt(this.aadhaarNo);
            parcel.writeString(this.careOf);
            parcel.writeString(this.code);
            parcel.writeString(this.dob);
            parcel.writeString(this.gender);
            parcel.writeString(this.landMark);
            parcel.writeInt(this.phone);
            parcel.writeString(this.pht);
            parcel.writeString(this.status);
            parcel.writeString(this.villageTownCity);
            parcel.writeString(this.xmlUID);
            parcel.writeString(this.subDist);
        }

        public DOEkyc(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String careOf, String code, String dob, String gender, String landMark, int i2, String pht, String status, String villageTownCity, String xmlUID, String subDist) {
            Intrinsics.checkNotNullParameter(careOf, "careOf");
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(dob, "dob");
            Intrinsics.checkNotNullParameter(gender, "gender");
            Intrinsics.checkNotNullParameter(landMark, "landMark");
            Intrinsics.checkNotNullParameter(pht, "pht");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(villageTownCity, "villageTownCity");
            Intrinsics.checkNotNullParameter(xmlUID, "xmlUID");
            Intrinsics.checkNotNullParameter(subDist, "subDist");
            this.name = str;
            this.localityIfAny = str2;
            this.house = str3;
            this.street = str4;
            this.state = str5;
            this.pincode = str6;
            this.dist = str7;
            this.aadhaarNo = i;
            this.careOf = careOf;
            this.code = code;
            this.dob = dob;
            this.gender = gender;
            this.landMark = landMark;
            this.phone = i2;
            this.pht = pht;
            this.status = status;
            this.villageTownCity = villageTownCity;
            this.xmlUID = xmlUID;
            this.subDist = subDist;
        }

        public /* synthetic */ DOEkyc(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, String str9, String str10, String str11, String str12, int i2, String str13, String str14, String str15, String str16, String str17, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? "" : str5, (i3 & 32) != 0 ? "" : str6, (i3 & 64) != 0 ? "" : str7, (i3 & 128) != 0 ? 0 : i, (i3 & 256) != 0 ? "" : str8, (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? "" : str9, (i3 & 1024) != 0 ? "" : str10, (i3 & 2048) != 0 ? "" : str11, (i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? "" : str12, (i3 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? 0 : i2, (i3 & 16384) != 0 ? "" : str13, (i3 & 32768) != 0 ? "" : str14, (i3 & 65536) != 0 ? "" : str15, (i3 & 131072) != 0 ? "" : str16, (i3 & 262144) != 0 ? "" : str17);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/nic/mparivahan/VahanEkyc/Aadarkyc$DoAadhaarResponse;", "", "()V", "dOAuthOTP", "Lcom/nic/mparivahan/VahanEkyc/Aadarkyc$DOAuthOTP;", "getDOAuthOTP", "()Lcom/nic/mparivahan/VahanEkyc/Aadarkyc$DOAuthOTP;", "setDOAuthOTP", "(Lcom/nic/mparivahan/VahanEkyc/Aadarkyc$DOAuthOTP;)V", "dOEkyc", "Lcom/nic/mparivahan/VahanEkyc/Aadarkyc$DOEkyc;", "getDOEkyc", "()Lcom/nic/mparivahan/VahanEkyc/Aadarkyc$DOEkyc;", "setDOEkyc", "(Lcom/nic/mparivahan/VahanEkyc/Aadarkyc$DOEkyc;)V", "finalxml", "", "getFinalxml", "()Ljava/lang/String;", "setFinalxml", "(Ljava/lang/String;)V", "reason", "getReason", "setReason", "status", "getStatus", "setStatus", "txnNo", "getTxnNo", "setTxnNo", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DoAadhaarResponse {
        private DOAuthOTP dOAuthOTP;
        private DOEkyc dOEkyc;
        private String finalxml;
        private String reason;
        private String status;
        private String txnNo;

        public final DOAuthOTP getDOAuthOTP() {
            return this.dOAuthOTP;
        }

        public final DOEkyc getDOEkyc() {
            return this.dOEkyc;
        }

        public final String getFinalxml() {
            return this.finalxml;
        }

        public final String getReason() {
            return this.reason;
        }

        public final String getStatus() {
            return this.status;
        }

        public final String getTxnNo() {
            return this.txnNo;
        }

        public final void setDOAuthOTP(DOAuthOTP dOAuthOTP) {
            this.dOAuthOTP = dOAuthOTP;
        }

        public final void setDOEkyc(DOEkyc dOEkyc) {
            this.dOEkyc = dOEkyc;
        }

        public final void setFinalxml(String str) {
            this.finalxml = str;
        }

        public final void setReason(String str) {
            this.reason = str;
        }

        public final void setStatus(String str) {
            this.status = str;
        }

        public final void setTxnNo(String str) {
            this.txnNo = str;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/nic/mparivahan/VahanEkyc/Aadarkyc$Response;", "", "()V", "doAadhaarResponse", "Lcom/nic/mparivahan/VahanEkyc/Aadarkyc$DoAadhaarResponse;", "getDoAadhaarResponse", "()Lcom/nic/mparivahan/VahanEkyc/Aadarkyc$DoAadhaarResponse;", "setDoAadhaarResponse", "(Lcom/nic/mparivahan/VahanEkyc/Aadarkyc$DoAadhaarResponse;)V", "responseBody", "", "getResponseBody", "()Ljava/lang/String;", "setResponseBody", "(Ljava/lang/String;)V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Response {
        private DoAadhaarResponse doAadhaarResponse;
        private String responseBody;

        public final DoAadhaarResponse getDoAadhaarResponse() {
            return this.doAadhaarResponse;
        }

        public final String getResponseBody() {
            return this.responseBody;
        }

        public final void setDoAadhaarResponse(DoAadhaarResponse doAadhaarResponse) {
            this.doAadhaarResponse = doAadhaarResponse;
        }

        public final void setResponseBody(String str) {
            this.responseBody = str;
        }
    }
}
