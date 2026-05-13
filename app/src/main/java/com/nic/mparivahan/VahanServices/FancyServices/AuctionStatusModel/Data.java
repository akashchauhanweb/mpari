package com.nic.mparivahan.VahanServices.FancyServices.AuctionStatusModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b3\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÎ\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00109J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020\u0007HÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b$\u0010\u001aR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0016¨\u0006?"}, d2 = {"Lcom/nic/mparivahan/VahanServices/FancyServices/AuctionStatusModel/Data;", "", "ack_no", "", "address", "allotted_to", "auction_amt", "", "fancy_no", "father_name", "mobile_no", "op_dt", "owner_name", "pincode", "recp_no", "regn_no", "reserve_amt", "rto", "state", "status", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAck_no", "()Ljava/lang/String;", "getAddress", "getAllotted_to", "getAuction_amt", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFancy_no", "getFather_name", "getMobile_no", "getOp_dt", "getOwner_name", "getPincode", "getRecp_no", "getRegn_no", "getReserve_amt", "getRto", "getState", "getStatus", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/nic/mparivahan/VahanServices/FancyServices/AuctionStatusModel/Data;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Data {
    private final String ack_no;
    private final String address;
    private final String allotted_to;
    private final Integer auction_amt;
    private final String fancy_no;
    private final String father_name;
    private final String mobile_no;
    private final String op_dt;
    private final String owner_name;
    private final String pincode;
    private final String recp_no;
    private final String regn_no;
    private final Integer reserve_amt;
    private final String rto;
    private final String state;
    private final String status;

    public Data(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num2, String str12, String str13, String str14) {
        this.ack_no = str;
        this.address = str2;
        this.allotted_to = str3;
        this.auction_amt = num;
        this.fancy_no = str4;
        this.father_name = str5;
        this.mobile_no = str6;
        this.op_dt = str7;
        this.owner_name = str8;
        this.pincode = str9;
        this.recp_no = str10;
        this.regn_no = str11;
        this.reserve_amt = num2;
        this.rto = str12;
        this.state = str13;
        this.status = str14;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAck_no() {
        return this.ack_no;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPincode() {
        return this.pincode;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getRecp_no() {
        return this.recp_no;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getRegn_no() {
        return this.regn_no;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getReserve_amt() {
        return this.reserve_amt;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getRto() {
        return this.rto;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAllotted_to() {
        return this.allotted_to;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getAuction_amt() {
        return this.auction_amt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFancy_no() {
        return this.fancy_no;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFather_name() {
        return this.father_name;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMobile_no() {
        return this.mobile_no;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getOp_dt() {
        return this.op_dt;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getOwner_name() {
        return this.owner_name;
    }

    public final Data copy(String ack_no, String address, String allotted_to, Integer auction_amt, String fancy_no, String father_name, String mobile_no, String op_dt, String owner_name, String pincode, String recp_no, String regn_no, Integer reserve_amt, String rto, String state, String status) {
        return new Data(ack_no, address, allotted_to, auction_amt, fancy_no, father_name, mobile_no, op_dt, owner_name, pincode, recp_no, regn_no, reserve_amt, rto, state, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Data)) {
            return false;
        }
        Data data = (Data) other;
        return Intrinsics.areEqual(this.ack_no, data.ack_no) && Intrinsics.areEqual(this.address, data.address) && Intrinsics.areEqual(this.allotted_to, data.allotted_to) && Intrinsics.areEqual(this.auction_amt, data.auction_amt) && Intrinsics.areEqual(this.fancy_no, data.fancy_no) && Intrinsics.areEqual(this.father_name, data.father_name) && Intrinsics.areEqual(this.mobile_no, data.mobile_no) && Intrinsics.areEqual(this.op_dt, data.op_dt) && Intrinsics.areEqual(this.owner_name, data.owner_name) && Intrinsics.areEqual(this.pincode, data.pincode) && Intrinsics.areEqual(this.recp_no, data.recp_no) && Intrinsics.areEqual(this.regn_no, data.regn_no) && Intrinsics.areEqual(this.reserve_amt, data.reserve_amt) && Intrinsics.areEqual(this.rto, data.rto) && Intrinsics.areEqual(this.state, data.state) && Intrinsics.areEqual(this.status, data.status);
    }

    public final String getAck_no() {
        return this.ack_no;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getAllotted_to() {
        return this.allotted_to;
    }

    public final Integer getAuction_amt() {
        return this.auction_amt;
    }

    public final String getFancy_no() {
        return this.fancy_no;
    }

    public final String getFather_name() {
        return this.father_name;
    }

    public final String getMobile_no() {
        return this.mobile_no;
    }

    public final String getOp_dt() {
        return this.op_dt;
    }

    public final String getOwner_name() {
        return this.owner_name;
    }

    public final String getPincode() {
        return this.pincode;
    }

    public final String getRecp_no() {
        return this.recp_no;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final Integer getReserve_amt() {
        return this.reserve_amt;
    }

    public final String getRto() {
        return this.rto;
    }

    public final String getState() {
        return this.state;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.ack_no;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.address;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.allotted_to;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.auction_amt;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.fancy_no;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.father_name;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.mobile_no;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.op_dt;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.owner_name;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.pincode;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.recp_no;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.regn_no;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num2 = this.reserve_amt;
        int iHashCode13 = (iHashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str12 = this.rto;
        int iHashCode14 = (iHashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.state;
        int iHashCode15 = (iHashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.status;
        return iHashCode15 + (str14 != null ? str14.hashCode() : 0);
    }

    public String toString() {
        return "Data(ack_no=" + this.ack_no + ", address=" + this.address + ", allotted_to=" + this.allotted_to + ", auction_amt=" + this.auction_amt + ", fancy_no=" + this.fancy_no + ", father_name=" + this.father_name + ", mobile_no=" + this.mobile_no + ", op_dt=" + this.op_dt + ", owner_name=" + this.owner_name + ", pincode=" + this.pincode + ", recp_no=" + this.recp_no + ", regn_no=" + this.regn_no + ", reserve_amt=" + this.reserve_amt + ", rto=" + this.rto + ", state=" + this.state + ", status=" + this.status + ')';
    }
}
