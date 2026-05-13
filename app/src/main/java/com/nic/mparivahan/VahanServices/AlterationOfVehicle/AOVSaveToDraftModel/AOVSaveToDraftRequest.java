package com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVSaveToDraftModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\bN\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bõ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\n\u0012\u0006\u0010\u001a\u001a\u00020\n\u0012\u0006\u0010\u001b\u001a\u00020\n\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0016\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\n\u0012\u0006\u0010\"\u001a\u00020\n¢\u0006\u0002\u0010#J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\nHÆ\u0003J\t\u0010G\u001a\u00020\nHÆ\u0003J\t\u0010H\u001a\u00020\nHÆ\u0003J\t\u0010I\u001a\u00020\nHÆ\u0003J\t\u0010J\u001a\u00020\nHÆ\u0003J\t\u0010K\u001a\u00020\nHÆ\u0003J\t\u0010L\u001a\u00020\nHÆ\u0003J\t\u0010M\u001a\u00020\nHÆ\u0003J\t\u0010N\u001a\u00020\u0016HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\nHÆ\u0003J\t\u0010S\u001a\u00020\nHÆ\u0003J\t\u0010T\u001a\u00020\nHÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0016HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0016HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\nHÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\nHÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\t\u0010_\u001a\u00020\u0003HÆ\u0003J\t\u0010`\u001a\u00020\nHÆ\u0003J\t\u0010a\u001a\u00020\u0003HÆ\u0003J\t\u0010b\u001a\u00020\u0003HÆ\u0003Jµ\u0002\u0010c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\n2\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00162\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00162\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\n2\b\b\u0002\u0010\"\u001a\u00020\nHÆ\u0001J\u0013\u0010d\u001a\u00020e2\b\u0010f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010g\u001a\u00020\u0016HÖ\u0001J\t\u0010h\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010%R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010%R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010%R\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b/\u0010,R\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b0\u0010,R\u0011\u0010\u000f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b1\u0010,R\u0011\u0010\u0010\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b2\u0010,R\u0011\u0010\u0011\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b3\u0010,R\u0011\u0010\u0012\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b4\u0010,R\u0011\u0010\u0013\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b5\u0010,R\u0011\u0010\u0014\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b6\u0010,R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010%R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010%R\u0011\u0010\u0019\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b;\u0010,R\u0011\u0010\u001a\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b<\u0010,R\u0011\u0010\u001b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b=\u0010,R\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010%R\u0011\u0010\u001d\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b?\u00108R\u0011\u0010\u001e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010%R\u0011\u0010\u001f\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\bA\u00108R\u0011\u0010 \u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010%R\u0011\u0010!\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bC\u0010,R\u0011\u0010\"\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bD\u0010,¨\u0006i"}, d2 = {"Lcom/nic/mparivahan/VahanServices/AlterationOfVehicle/AOVSaveToDraftModel/AOVSaveToDraftRequest;", "", "acFitted", "", "applNo", "audioFitted", "bodyType", "chasiNo", "color", "cubicCap", "", "engNo", "fitUpto", "floorArea", "fuel", "gcw", "height", "horsePower", "ldWt", "length", "noCyl", "offCd", "", "opDt", "regnNo", "seatCap", "sleeperCap", "standCap", "stateCd", "unldWt", "vchCatg", "vhClass", "videoFitted", "wheelbase", "width", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;DDDDDDDDILjava/lang/String;Ljava/lang/String;DDDLjava/lang/String;ILjava/lang/String;ILjava/lang/String;DD)V", "getAcFitted", "()Ljava/lang/String;", "getApplNo", "getAudioFitted", "getBodyType", "getChasiNo", "getColor", "getCubicCap", "()D", "getEngNo", "getFitUpto", "getFloorArea", "getFuel", "getGcw", "getHeight", "getHorsePower", "getLdWt", "getLength", "getNoCyl", "getOffCd", "()I", "getOpDt", "getRegnNo", "getSeatCap", "getSleeperCap", "getStandCap", "getStateCd", "getUnldWt", "getVchCatg", "getVhClass", "getVideoFitted", "getWheelbase", "getWidth", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AOVSaveToDraftRequest {
    private final String acFitted;
    private final String applNo;
    private final String audioFitted;
    private final String bodyType;
    private final String chasiNo;
    private final String color;
    private final double cubicCap;
    private final String engNo;
    private final String fitUpto;
    private final double floorArea;
    private final double fuel;
    private final double gcw;
    private final double height;
    private final double horsePower;
    private final double ldWt;
    private final double length;
    private final double noCyl;
    private final int offCd;
    private final String opDt;
    private final String regnNo;
    private final double seatCap;
    private final double sleeperCap;
    private final double standCap;
    private final String stateCd;
    private final int unldWt;
    private final String vchCatg;
    private final int vhClass;
    private final String videoFitted;
    private final double wheelbase;
    private final double width;

    public AOVSaveToDraftRequest(String acFitted, String applNo, String audioFitted, String bodyType, String chasiNo, String color, double d, String engNo, String fitUpto, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, int i, String opDt, String regnNo, double d10, double d11, double d12, String stateCd, int i2, String vchCatg, int i3, String videoFitted, double d13, double d14) {
        Intrinsics.checkNotNullParameter(acFitted, "acFitted");
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(audioFitted, "audioFitted");
        Intrinsics.checkNotNullParameter(bodyType, "bodyType");
        Intrinsics.checkNotNullParameter(chasiNo, "chasiNo");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(engNo, "engNo");
        Intrinsics.checkNotNullParameter(fitUpto, "fitUpto");
        Intrinsics.checkNotNullParameter(opDt, "opDt");
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        Intrinsics.checkNotNullParameter(vchCatg, "vchCatg");
        Intrinsics.checkNotNullParameter(videoFitted, "videoFitted");
        this.acFitted = acFitted;
        this.applNo = applNo;
        this.audioFitted = audioFitted;
        this.bodyType = bodyType;
        this.chasiNo = chasiNo;
        this.color = color;
        this.cubicCap = d;
        this.engNo = engNo;
        this.fitUpto = fitUpto;
        this.floorArea = d2;
        this.fuel = d3;
        this.gcw = d4;
        this.height = d5;
        this.horsePower = d6;
        this.ldWt = d7;
        this.length = d8;
        this.noCyl = d9;
        this.offCd = i;
        this.opDt = opDt;
        this.regnNo = regnNo;
        this.seatCap = d10;
        this.sleeperCap = d11;
        this.standCap = d12;
        this.stateCd = stateCd;
        this.unldWt = i2;
        this.vchCatg = vchCatg;
        this.vhClass = i3;
        this.videoFitted = videoFitted;
        this.wheelbase = d13;
        this.width = d14;
    }

    public static /* synthetic */ AOVSaveToDraftRequest copy$default(AOVSaveToDraftRequest aOVSaveToDraftRequest, String str, String str2, String str3, String str4, String str5, String str6, double d, String str7, String str8, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, int i, String str9, String str10, double d10, double d11, double d12, String str11, int i2, String str12, int i3, String str13, double d13, double d14, int i4, Object obj) {
        String str14 = (i4 & 1) != 0 ? aOVSaveToDraftRequest.acFitted : str;
        String str15 = (i4 & 2) != 0 ? aOVSaveToDraftRequest.applNo : str2;
        String str16 = (i4 & 4) != 0 ? aOVSaveToDraftRequest.audioFitted : str3;
        String str17 = (i4 & 8) != 0 ? aOVSaveToDraftRequest.bodyType : str4;
        String str18 = (i4 & 16) != 0 ? aOVSaveToDraftRequest.chasiNo : str5;
        String str19 = (i4 & 32) != 0 ? aOVSaveToDraftRequest.color : str6;
        double d15 = (i4 & 64) != 0 ? aOVSaveToDraftRequest.cubicCap : d;
        String str20 = (i4 & 128) != 0 ? aOVSaveToDraftRequest.engNo : str7;
        String str21 = (i4 & 256) != 0 ? aOVSaveToDraftRequest.fitUpto : str8;
        double d16 = (i4 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? aOVSaveToDraftRequest.floorArea : d2;
        double d17 = (i4 & 1024) != 0 ? aOVSaveToDraftRequest.fuel : d3;
        double d18 = (i4 & 2048) != 0 ? aOVSaveToDraftRequest.gcw : d4;
        double d19 = (i4 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? aOVSaveToDraftRequest.height : d5;
        double d20 = (i4 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? aOVSaveToDraftRequest.horsePower : d6;
        double d21 = (i4 & 16384) != 0 ? aOVSaveToDraftRequest.ldWt : d7;
        double d22 = (i4 & 32768) != 0 ? aOVSaveToDraftRequest.length : d8;
        double d23 = (i4 & 65536) != 0 ? aOVSaveToDraftRequest.noCyl : d9;
        int i5 = (i4 & 131072) != 0 ? aOVSaveToDraftRequest.offCd : i;
        return aOVSaveToDraftRequest.copy(str14, str15, str16, str17, str18, str19, d15, str20, str21, d16, d17, d18, d19, d20, d21, d22, d23, i5, (262144 & i4) != 0 ? aOVSaveToDraftRequest.opDt : str9, (i4 & 524288) != 0 ? aOVSaveToDraftRequest.regnNo : str10, (i4 & 1048576) != 0 ? aOVSaveToDraftRequest.seatCap : d10, (i4 & 2097152) != 0 ? aOVSaveToDraftRequest.sleeperCap : d11, (i4 & 4194304) != 0 ? aOVSaveToDraftRequest.standCap : d12, (i4 & 8388608) != 0 ? aOVSaveToDraftRequest.stateCd : str11, (16777216 & i4) != 0 ? aOVSaveToDraftRequest.unldWt : i2, (i4 & 33554432) != 0 ? aOVSaveToDraftRequest.vchCatg : str12, (i4 & 67108864) != 0 ? aOVSaveToDraftRequest.vhClass : i3, (i4 & 134217728) != 0 ? aOVSaveToDraftRequest.videoFitted : str13, (i4 & 268435456) != 0 ? aOVSaveToDraftRequest.wheelbase : d13, (i4 & 536870912) != 0 ? aOVSaveToDraftRequest.width : d14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAcFitted() {
        return this.acFitted;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final double getFloorArea() {
        return this.floorArea;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final double getFuel() {
        return this.fuel;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final double getGcw() {
        return this.gcw;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final double getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final double getHorsePower() {
        return this.horsePower;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final double getLdWt() {
        return this.ldWt;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final double getLength() {
        return this.length;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final double getNoCyl() {
        return this.noCyl;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getOffCd() {
        return this.offCd;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getOpDt() {
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
    public final double getSeatCap() {
        return this.seatCap;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final double getSleeperCap() {
        return this.sleeperCap;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final double getStandCap() {
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
    public final double getWheelbase() {
        return this.wheelbase;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAudioFitted() {
        return this.audioFitted;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final double getWidth() {
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
    public final double getCubicCap() {
        return this.cubicCap;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getEngNo() {
        return this.engNo;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getFitUpto() {
        return this.fitUpto;
    }

    public final AOVSaveToDraftRequest copy(String acFitted, String applNo, String audioFitted, String bodyType, String chasiNo, String color, double cubicCap, String engNo, String fitUpto, double floorArea, double fuel, double gcw, double height, double horsePower, double ldWt, double length, double noCyl, int offCd, String opDt, String regnNo, double seatCap, double sleeperCap, double standCap, String stateCd, int unldWt, String vchCatg, int vhClass, String videoFitted, double wheelbase, double width) {
        Intrinsics.checkNotNullParameter(acFitted, "acFitted");
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(audioFitted, "audioFitted");
        Intrinsics.checkNotNullParameter(bodyType, "bodyType");
        Intrinsics.checkNotNullParameter(chasiNo, "chasiNo");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(engNo, "engNo");
        Intrinsics.checkNotNullParameter(fitUpto, "fitUpto");
        Intrinsics.checkNotNullParameter(opDt, "opDt");
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        Intrinsics.checkNotNullParameter(vchCatg, "vchCatg");
        Intrinsics.checkNotNullParameter(videoFitted, "videoFitted");
        return new AOVSaveToDraftRequest(acFitted, applNo, audioFitted, bodyType, chasiNo, color, cubicCap, engNo, fitUpto, floorArea, fuel, gcw, height, horsePower, ldWt, length, noCyl, offCd, opDt, regnNo, seatCap, sleeperCap, standCap, stateCd, unldWt, vchCatg, vhClass, videoFitted, wheelbase, width);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AOVSaveToDraftRequest)) {
            return false;
        }
        AOVSaveToDraftRequest aOVSaveToDraftRequest = (AOVSaveToDraftRequest) other;
        return Intrinsics.areEqual(this.acFitted, aOVSaveToDraftRequest.acFitted) && Intrinsics.areEqual(this.applNo, aOVSaveToDraftRequest.applNo) && Intrinsics.areEqual(this.audioFitted, aOVSaveToDraftRequest.audioFitted) && Intrinsics.areEqual(this.bodyType, aOVSaveToDraftRequest.bodyType) && Intrinsics.areEqual(this.chasiNo, aOVSaveToDraftRequest.chasiNo) && Intrinsics.areEqual(this.color, aOVSaveToDraftRequest.color) && Double.compare(this.cubicCap, aOVSaveToDraftRequest.cubicCap) == 0 && Intrinsics.areEqual(this.engNo, aOVSaveToDraftRequest.engNo) && Intrinsics.areEqual(this.fitUpto, aOVSaveToDraftRequest.fitUpto) && Double.compare(this.floorArea, aOVSaveToDraftRequest.floorArea) == 0 && Double.compare(this.fuel, aOVSaveToDraftRequest.fuel) == 0 && Double.compare(this.gcw, aOVSaveToDraftRequest.gcw) == 0 && Double.compare(this.height, aOVSaveToDraftRequest.height) == 0 && Double.compare(this.horsePower, aOVSaveToDraftRequest.horsePower) == 0 && Double.compare(this.ldWt, aOVSaveToDraftRequest.ldWt) == 0 && Double.compare(this.length, aOVSaveToDraftRequest.length) == 0 && Double.compare(this.noCyl, aOVSaveToDraftRequest.noCyl) == 0 && this.offCd == aOVSaveToDraftRequest.offCd && Intrinsics.areEqual(this.opDt, aOVSaveToDraftRequest.opDt) && Intrinsics.areEqual(this.regnNo, aOVSaveToDraftRequest.regnNo) && Double.compare(this.seatCap, aOVSaveToDraftRequest.seatCap) == 0 && Double.compare(this.sleeperCap, aOVSaveToDraftRequest.sleeperCap) == 0 && Double.compare(this.standCap, aOVSaveToDraftRequest.standCap) == 0 && Intrinsics.areEqual(this.stateCd, aOVSaveToDraftRequest.stateCd) && this.unldWt == aOVSaveToDraftRequest.unldWt && Intrinsics.areEqual(this.vchCatg, aOVSaveToDraftRequest.vchCatg) && this.vhClass == aOVSaveToDraftRequest.vhClass && Intrinsics.areEqual(this.videoFitted, aOVSaveToDraftRequest.videoFitted) && Double.compare(this.wheelbase, aOVSaveToDraftRequest.wheelbase) == 0 && Double.compare(this.width, aOVSaveToDraftRequest.width) == 0;
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

    public final double getCubicCap() {
        return this.cubicCap;
    }

    public final String getEngNo() {
        return this.engNo;
    }

    public final String getFitUpto() {
        return this.fitUpto;
    }

    public final double getFloorArea() {
        return this.floorArea;
    }

    public final double getFuel() {
        return this.fuel;
    }

    public final double getGcw() {
        return this.gcw;
    }

    public final double getHeight() {
        return this.height;
    }

    public final double getHorsePower() {
        return this.horsePower;
    }

    public final double getLdWt() {
        return this.ldWt;
    }

    public final double getLength() {
        return this.length;
    }

    public final double getNoCyl() {
        return this.noCyl;
    }

    public final int getOffCd() {
        return this.offCd;
    }

    public final String getOpDt() {
        return this.opDt;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final double getSeatCap() {
        return this.seatCap;
    }

    public final double getSleeperCap() {
        return this.sleeperCap;
    }

    public final double getStandCap() {
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

    public final double getWheelbase() {
        return this.wheelbase;
    }

    public final double getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.acFitted.hashCode() * 31) + this.applNo.hashCode()) * 31) + this.audioFitted.hashCode()) * 31) + this.bodyType.hashCode()) * 31) + this.chasiNo.hashCode()) * 31) + this.color.hashCode()) * 31) + Double.hashCode(this.cubicCap)) * 31) + this.engNo.hashCode()) * 31) + this.fitUpto.hashCode()) * 31) + Double.hashCode(this.floorArea)) * 31) + Double.hashCode(this.fuel)) * 31) + Double.hashCode(this.gcw)) * 31) + Double.hashCode(this.height)) * 31) + Double.hashCode(this.horsePower)) * 31) + Double.hashCode(this.ldWt)) * 31) + Double.hashCode(this.length)) * 31) + Double.hashCode(this.noCyl)) * 31) + Integer.hashCode(this.offCd)) * 31) + this.opDt.hashCode()) * 31) + this.regnNo.hashCode()) * 31) + Double.hashCode(this.seatCap)) * 31) + Double.hashCode(this.sleeperCap)) * 31) + Double.hashCode(this.standCap)) * 31) + this.stateCd.hashCode()) * 31) + Integer.hashCode(this.unldWt)) * 31) + this.vchCatg.hashCode()) * 31) + Integer.hashCode(this.vhClass)) * 31) + this.videoFitted.hashCode()) * 31) + Double.hashCode(this.wheelbase)) * 31) + Double.hashCode(this.width);
    }

    public String toString() {
        return "AOVSaveToDraftRequest(acFitted=" + this.acFitted + ", applNo=" + this.applNo + ", audioFitted=" + this.audioFitted + ", bodyType=" + this.bodyType + ", chasiNo=" + this.chasiNo + ", color=" + this.color + ", cubicCap=" + this.cubicCap + ", engNo=" + this.engNo + ", fitUpto=" + this.fitUpto + ", floorArea=" + this.floorArea + ", fuel=" + this.fuel + ", gcw=" + this.gcw + ", height=" + this.height + ", horsePower=" + this.horsePower + ", ldWt=" + this.ldWt + ", length=" + this.length + ", noCyl=" + this.noCyl + ", offCd=" + this.offCd + ", opDt=" + this.opDt + ", regnNo=" + this.regnNo + ", seatCap=" + this.seatCap + ", sleeperCap=" + this.sleeperCap + ", standCap=" + this.standCap + ", stateCd=" + this.stateCd + ", unldWt=" + this.unldWt + ", vchCatg=" + this.vchCatg + ", vhClass=" + this.vhClass + ", videoFitted=" + this.videoFitted + ", wheelbase=" + this.wheelbase + ", width=" + this.width + ')';
    }
}
