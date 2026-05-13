package com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVSaveToDraftModel;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\bW\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\n\u0012\u0006\u0010\u0016\u001a\u00020\n\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0019\u001a\u00020\n\u0012\u0006\u0010\u001a\u001a\u00020\n\u0012\u0006\u0010\u001b\u001a\u00020\n\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001d\u001a\u00020\n\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001f\u001a\u00020\n\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010!\u001a\u00020\n\u0012\u0006\u0010\"\u001a\u00020\n¢\u0006\u0002\u0010#J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010F\u001a\u00020\nHÆ\u0003J\t\u0010G\u001a\u00020\nHÆ\u0003J\t\u0010H\u001a\u00020\nHÆ\u0003J\t\u0010I\u001a\u00020\nHÆ\u0003J\t\u0010J\u001a\u00020\nHÆ\u0003J\t\u0010K\u001a\u00020\nHÆ\u0003J\t\u0010L\u001a\u00020\nHÆ\u0003J\t\u0010M\u001a\u00020\nHÆ\u0003J\t\u0010N\u001a\u00020\nHÆ\u0003J\t\u0010O\u001a\u00020\rHÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010R\u001a\u00020\nHÆ\u0003J\t\u0010S\u001a\u00020\nHÆ\u0003J\t\u0010T\u001a\u00020\nHÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010V\u001a\u00020\nHÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010X\u001a\u00020\nHÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\nHÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\nHÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010`\u001a\u00020\nHÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010b\u001a\u00020\rHÆ\u0003JË\u0002\u0010c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\r2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\n2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001d\u001a\u00020\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001f\u001a\u00020\n2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010!\u001a\u00020\n2\b\b\u0002\u0010\"\u001a\u00020\nHÆ\u0001J\u0013\u0010d\u001a\u00020e2\b\u0010f\u001a\u0004\u0018\u00010gHÖ\u0003J\t\u0010h\u001a\u00020\nHÖ\u0001J\t\u0010i\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010%R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010%R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b0\u0010,R\u0011\u0010\u000f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b1\u0010,R\u0011\u0010\u0010\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b2\u0010,R\u0011\u0010\u0011\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b3\u0010,R\u0011\u0010\u0012\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b4\u0010,R\u0011\u0010\u0013\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b5\u0010,R\u0011\u0010\u0014\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b6\u0010,R\u0011\u0010\u0015\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b7\u0010,R\u0011\u0010\u0016\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b8\u0010,R\u0011\u0010\u0017\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b9\u0010/R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010%R\u0011\u0010\u0019\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b;\u0010,R\u0011\u0010\u001a\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b<\u0010,R\u0011\u0010\u001b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b=\u0010,R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010%R\u0011\u0010\u001d\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b?\u0010,R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010%R\u0011\u0010\u001f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bA\u0010,R\u0013\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010%R\u0011\u0010!\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bC\u0010,R\u0011\u0010\"\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bD\u0010,¨\u0006j"}, d2 = {"Lcom/nic/mparivahan/VahanServices/AlterationOfVehicle/AOVSaveToDraftModel/Data;", "Ljava/io/Serializable;", "acFitted", "", "applNo", "audioFitted", "bodyType", "chasiNo", "color", "cubicCap", "", "engNo", "fitUpto", "", "floorArea", "fuel", "gcw", "height", "horsePower", "ldWt", "length", "noCyl", "offCd", "opDt", "regnNo", "seatCap", "sleeperCap", "standCap", "stateCd", "unldWt", "vchCatg", "vhClass", "videoFitted", "wheelbase", "width", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;JIIIIIIIIIJLjava/lang/String;IIILjava/lang/String;ILjava/lang/String;ILjava/lang/String;II)V", "getAcFitted", "()Ljava/lang/String;", "getApplNo", "getAudioFitted", "getBodyType", "getChasiNo", "getColor", "getCubicCap", "()I", "getEngNo", "getFitUpto", "()J", "getFloorArea", "getFuel", "getGcw", "getHeight", "getHorsePower", "getLdWt", "getLength", "getNoCyl", "getOffCd", "getOpDt", "getRegnNo", "getSeatCap", "getSleeperCap", "getStandCap", "getStateCd", "getUnldWt", "getVchCatg", "getVhClass", "getVideoFitted", "getWheelbase", "getWidth", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Data implements Serializable {
    private final String acFitted;
    private final String applNo;
    private final String audioFitted;
    private final String bodyType;
    private final String chasiNo;
    private final String color;
    private final int cubicCap;
    private final String engNo;
    private final long fitUpto;
    private final int floorArea;
    private final int fuel;
    private final int gcw;
    private final int height;
    private final int horsePower;
    private final int ldWt;
    private final int length;
    private final int noCyl;
    private final int offCd;
    private final long opDt;
    private final String regnNo;
    private final int seatCap;
    private final int sleeperCap;
    private final int standCap;
    private final String stateCd;
    private final int unldWt;
    private final String vchCatg;
    private final int vhClass;
    private final String videoFitted;
    private final int wheelbase;
    private final int width;

    public Data(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, long j, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, long j2, String str8, int i11, int i12, int i13, String str9, int i14, String str10, int i15, String str11, int i16, int i17) {
        this.acFitted = str;
        this.applNo = str2;
        this.audioFitted = str3;
        this.bodyType = str4;
        this.chasiNo = str5;
        this.color = str6;
        this.cubicCap = i;
        this.engNo = str7;
        this.fitUpto = j;
        this.floorArea = i2;
        this.fuel = i3;
        this.gcw = i4;
        this.height = i5;
        this.horsePower = i6;
        this.ldWt = i7;
        this.length = i8;
        this.noCyl = i9;
        this.offCd = i10;
        this.opDt = j2;
        this.regnNo = str8;
        this.seatCap = i11;
        this.sleeperCap = i12;
        this.standCap = i13;
        this.stateCd = str9;
        this.unldWt = i14;
        this.vchCatg = str10;
        this.vhClass = i15;
        this.videoFitted = str11;
        this.wheelbase = i16;
        this.width = i17;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAcFitted() {
        return this.acFitted;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getFloorArea() {
        return this.floorArea;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getFuel() {
        return this.fuel;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getGcw() {
        return this.gcw;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getHorsePower() {
        return this.horsePower;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getLdWt() {
        return this.ldWt;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getLength() {
        return this.length;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getNoCyl() {
        return this.noCyl;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getOffCd() {
        return this.offCd;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final long getOpDt() {
        return this.opDt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getApplNo() {
        return this.applNo;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getRegnNo() {
        return this.regnNo;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final int getSeatCap() {
        return this.seatCap;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final int getSleeperCap() {
        return this.sleeperCap;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final int getStandCap() {
        return this.standCap;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getStateCd() {
        return this.stateCd;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final int getUnldWt() {
        return this.unldWt;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getVchCatg() {
        return this.vchCatg;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final int getVhClass() {
        return this.vhClass;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getVideoFitted() {
        return this.videoFitted;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final int getWheelbase() {
        return this.wheelbase;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAudioFitted() {
        return this.audioFitted;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBodyType() {
        return this.bodyType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getChasiNo() {
        return this.chasiNo;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getCubicCap() {
        return this.cubicCap;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getEngNo() {
        return this.engNo;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getFitUpto() {
        return this.fitUpto;
    }

    public final Data copy(String acFitted, String applNo, String audioFitted, String bodyType, String chasiNo, String color, int cubicCap, String engNo, long fitUpto, int floorArea, int fuel, int gcw, int height, int horsePower, int ldWt, int length, int noCyl, int offCd, long opDt, String regnNo, int seatCap, int sleeperCap, int standCap, String stateCd, int unldWt, String vchCatg, int vhClass, String videoFitted, int wheelbase, int width) {
        return new Data(acFitted, applNo, audioFitted, bodyType, chasiNo, color, cubicCap, engNo, fitUpto, floorArea, fuel, gcw, height, horsePower, ldWt, length, noCyl, offCd, opDt, regnNo, seatCap, sleeperCap, standCap, stateCd, unldWt, vchCatg, vhClass, videoFitted, wheelbase, width);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Data)) {
            return false;
        }
        Data data = (Data) other;
        return Intrinsics.areEqual(this.acFitted, data.acFitted) && Intrinsics.areEqual(this.applNo, data.applNo) && Intrinsics.areEqual(this.audioFitted, data.audioFitted) && Intrinsics.areEqual(this.bodyType, data.bodyType) && Intrinsics.areEqual(this.chasiNo, data.chasiNo) && Intrinsics.areEqual(this.color, data.color) && this.cubicCap == data.cubicCap && Intrinsics.areEqual(this.engNo, data.engNo) && this.fitUpto == data.fitUpto && this.floorArea == data.floorArea && this.fuel == data.fuel && this.gcw == data.gcw && this.height == data.height && this.horsePower == data.horsePower && this.ldWt == data.ldWt && this.length == data.length && this.noCyl == data.noCyl && this.offCd == data.offCd && this.opDt == data.opDt && Intrinsics.areEqual(this.regnNo, data.regnNo) && this.seatCap == data.seatCap && this.sleeperCap == data.sleeperCap && this.standCap == data.standCap && Intrinsics.areEqual(this.stateCd, data.stateCd) && this.unldWt == data.unldWt && Intrinsics.areEqual(this.vchCatg, data.vchCatg) && this.vhClass == data.vhClass && Intrinsics.areEqual(this.videoFitted, data.videoFitted) && this.wheelbase == data.wheelbase && this.width == data.width;
    }

    public final String getAcFitted() {
        return this.acFitted;
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getAudioFitted() {
        return this.audioFitted;
    }

    public final String getBodyType() {
        return this.bodyType;
    }

    public final String getChasiNo() {
        return this.chasiNo;
    }

    public final String getColor() {
        return this.color;
    }

    public final int getCubicCap() {
        return this.cubicCap;
    }

    public final String getEngNo() {
        return this.engNo;
    }

    public final long getFitUpto() {
        return this.fitUpto;
    }

    public final int getFloorArea() {
        return this.floorArea;
    }

    public final int getFuel() {
        return this.fuel;
    }

    public final int getGcw() {
        return this.gcw;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getHorsePower() {
        return this.horsePower;
    }

    public final int getLdWt() {
        return this.ldWt;
    }

    public final int getLength() {
        return this.length;
    }

    public final int getNoCyl() {
        return this.noCyl;
    }

    public final int getOffCd() {
        return this.offCd;
    }

    public final long getOpDt() {
        return this.opDt;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final int getSeatCap() {
        return this.seatCap;
    }

    public final int getSleeperCap() {
        return this.sleeperCap;
    }

    public final int getStandCap() {
        return this.standCap;
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    public final int getUnldWt() {
        return this.unldWt;
    }

    public final String getVchCatg() {
        return this.vchCatg;
    }

    public final int getVhClass() {
        return this.vhClass;
    }

    public final String getVideoFitted() {
        return this.videoFitted;
    }

    public final int getWheelbase() {
        return this.wheelbase;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        String str = this.acFitted;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.applNo;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.audioFitted;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bodyType;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.chasiNo;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.color;
        int iHashCode6 = (((iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31) + Integer.hashCode(this.cubicCap)) * 31;
        String str7 = this.engNo;
        int iHashCode7 = (((((((((((((((((((((((iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31) + Long.hashCode(this.fitUpto)) * 31) + Integer.hashCode(this.floorArea)) * 31) + Integer.hashCode(this.fuel)) * 31) + Integer.hashCode(this.gcw)) * 31) + Integer.hashCode(this.height)) * 31) + Integer.hashCode(this.horsePower)) * 31) + Integer.hashCode(this.ldWt)) * 31) + Integer.hashCode(this.length)) * 31) + Integer.hashCode(this.noCyl)) * 31) + Integer.hashCode(this.offCd)) * 31) + Long.hashCode(this.opDt)) * 31;
        String str8 = this.regnNo;
        int iHashCode8 = (((((((iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31) + Integer.hashCode(this.seatCap)) * 31) + Integer.hashCode(this.sleeperCap)) * 31) + Integer.hashCode(this.standCap)) * 31;
        String str9 = this.stateCd;
        int iHashCode9 = (((iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31) + Integer.hashCode(this.unldWt)) * 31;
        String str10 = this.vchCatg;
        int iHashCode10 = (((iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31) + Integer.hashCode(this.vhClass)) * 31;
        String str11 = this.videoFitted;
        return ((((iHashCode10 + (str11 != null ? str11.hashCode() : 0)) * 31) + Integer.hashCode(this.wheelbase)) * 31) + Integer.hashCode(this.width);
    }

    public String toString() {
        return "Data(acFitted=" + this.acFitted + ", applNo=" + this.applNo + ", audioFitted=" + this.audioFitted + ", bodyType=" + this.bodyType + ", chasiNo=" + this.chasiNo + ", color=" + this.color + ", cubicCap=" + this.cubicCap + ", engNo=" + this.engNo + ", fitUpto=" + this.fitUpto + ", floorArea=" + this.floorArea + ", fuel=" + this.fuel + ", gcw=" + this.gcw + ", height=" + this.height + ", horsePower=" + this.horsePower + ", ldWt=" + this.ldWt + ", length=" + this.length + ", noCyl=" + this.noCyl + ", offCd=" + this.offCd + ", opDt=" + this.opDt + ", regnNo=" + this.regnNo + ", seatCap=" + this.seatCap + ", sleeperCap=" + this.sleeperCap + ", standCap=" + this.standCap + ", stateCd=" + this.stateCd + ", unldWt=" + this.unldWt + ", vchCatg=" + this.vchCatg + ", vhClass=" + this.vhClass + ", videoFitted=" + this.videoFitted + ", wheelbase=" + this.wheelbase + ", width=" + this.width + ')';
    }
}
