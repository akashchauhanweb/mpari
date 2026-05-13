package com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.DetailModle;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\bY\b\u0087\b\u0018\u00002\u00020\u0001Bí\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\u0007¢\u0006\u0002\u0010#J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\tHÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\tHÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\tHÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0007HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0007HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0007HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0007HÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\u0007HÆ\u0003J\t\u0010]\u001a\u00020\tHÆ\u0003J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\t\u0010_\u001a\u00020\tHÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\t\u0010a\u001a\u00020\u000eHÆ\u0003J«\u0002\u0010b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u0007HÆ\u0001J\u0013\u0010c\u001a\u00020\u00072\b\u0010d\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010e\u001a\u00020\tHÖ\u0001J\t\u0010f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010%R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b-\u0010+R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010%R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b1\u0010+R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010%R\u0011\u0010\u0011\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b3\u0010+R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010%R\u0011\u0010\u0013\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b5\u0010+R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010%R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010%R\u0011\u0010\u0016\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b8\u0010)R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010%R\u0011\u0010\u0018\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b:\u0010)R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010%R\u0011\u0010\u001a\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b<\u0010)R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010%R\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010%R\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010%R\u0011\u0010\u001e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010%R\u0011\u0010\u001f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010%R\u0011\u0010 \u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010%R\u0011\u0010!\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010%R\u0011\u0010\"\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bD\u0010)¨\u0006g"}, d2 = {"Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/DetailModle/TmConfigurationTempPmt;", "Ljava/io/Serializable;", "allowedVehicleCondition", "", "fitLgnChk", "insLgnChk", "interIntraStateSelection", "", "maxDaysTemp", "", "maxDaysTempConditionally", "maxMonthsTemp", "maxMonthsTempConditionally", "maxValidUptoConsider", "", "maxWeeksTemp", "maxWeeksTempConditionally", "minDaysTemp", "minDaysTempConditionally", "minWeeksTemp", "minWeeksTempConditionally", "passengerListTemp", "perDayRouteDescTemp", "permanentPermitValid", "pmtTypeSelectTemp", "renewTempPmt", "routeRegionListWithinstate", "skipFitLgnChk", "skipInsLgnChk", "skipTaxLgnChk", "stateCd", "taxLgnChk", "tempPeriodMode", "tempTaxOnRoute", "tempTaxOnRouteLen", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;ILjava/lang/String;Ljava/lang/Object;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAllowedVehicleCondition", "()Ljava/lang/String;", "getFitLgnChk", "getInsLgnChk", "getInterIntraStateSelection", "()Z", "getMaxDaysTemp", "()I", "getMaxDaysTempConditionally", "getMaxMonthsTemp", "getMaxMonthsTempConditionally", "getMaxValidUptoConsider", "()Ljava/lang/Object;", "getMaxWeeksTemp", "getMaxWeeksTempConditionally", "getMinDaysTemp", "getMinDaysTempConditionally", "getMinWeeksTemp", "getMinWeeksTempConditionally", "getPassengerListTemp", "getPerDayRouteDescTemp", "getPermanentPermitValid", "getPmtTypeSelectTemp", "getRenewTempPmt", "getRouteRegionListWithinstate", "getSkipFitLgnChk", "getSkipInsLgnChk", "getSkipTaxLgnChk", "getStateCd", "getTaxLgnChk", "getTempPeriodMode", "getTempTaxOnRoute", "getTempTaxOnRouteLen", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class TmConfigurationTempPmt implements Serializable {
    private final String allowedVehicleCondition;
    private final String fitLgnChk;
    private final String insLgnChk;
    private final boolean interIntraStateSelection;
    private final int maxDaysTemp;
    private final String maxDaysTempConditionally;
    private final int maxMonthsTemp;
    private final String maxMonthsTempConditionally;
    private final Object maxValidUptoConsider;
    private final int maxWeeksTemp;
    private final String maxWeeksTempConditionally;
    private final int minDaysTemp;
    private final String minDaysTempConditionally;
    private final int minWeeksTemp;
    private final String minWeeksTempConditionally;
    private final String passengerListTemp;
    private final boolean perDayRouteDescTemp;
    private final String permanentPermitValid;
    private final boolean pmtTypeSelectTemp;
    private final String renewTempPmt;
    private final boolean routeRegionListWithinstate;
    private final String skipFitLgnChk;
    private final String skipInsLgnChk;
    private final String skipTaxLgnChk;
    private final String stateCd;
    private final String taxLgnChk;
    private final String tempPeriodMode;
    private final String tempTaxOnRoute;
    private final boolean tempTaxOnRouteLen;

    public TmConfigurationTempPmt(String allowedVehicleCondition, String fitLgnChk, String insLgnChk, boolean z, int i, String maxDaysTempConditionally, int i2, String maxMonthsTempConditionally, Object maxValidUptoConsider, int i3, String maxWeeksTempConditionally, int i4, String minDaysTempConditionally, int i5, String minWeeksTempConditionally, String passengerListTemp, boolean z2, String permanentPermitValid, boolean z3, String renewTempPmt, boolean z4, String skipFitLgnChk, String skipInsLgnChk, String skipTaxLgnChk, String stateCd, String taxLgnChk, String tempPeriodMode, String tempTaxOnRoute, boolean z5) {
        Intrinsics.checkNotNullParameter(allowedVehicleCondition, "allowedVehicleCondition");
        Intrinsics.checkNotNullParameter(fitLgnChk, "fitLgnChk");
        Intrinsics.checkNotNullParameter(insLgnChk, "insLgnChk");
        Intrinsics.checkNotNullParameter(maxDaysTempConditionally, "maxDaysTempConditionally");
        Intrinsics.checkNotNullParameter(maxMonthsTempConditionally, "maxMonthsTempConditionally");
        Intrinsics.checkNotNullParameter(maxValidUptoConsider, "maxValidUptoConsider");
        Intrinsics.checkNotNullParameter(maxWeeksTempConditionally, "maxWeeksTempConditionally");
        Intrinsics.checkNotNullParameter(minDaysTempConditionally, "minDaysTempConditionally");
        Intrinsics.checkNotNullParameter(minWeeksTempConditionally, "minWeeksTempConditionally");
        Intrinsics.checkNotNullParameter(passengerListTemp, "passengerListTemp");
        Intrinsics.checkNotNullParameter(permanentPermitValid, "permanentPermitValid");
        Intrinsics.checkNotNullParameter(renewTempPmt, "renewTempPmt");
        Intrinsics.checkNotNullParameter(skipFitLgnChk, "skipFitLgnChk");
        Intrinsics.checkNotNullParameter(skipInsLgnChk, "skipInsLgnChk");
        Intrinsics.checkNotNullParameter(skipTaxLgnChk, "skipTaxLgnChk");
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        Intrinsics.checkNotNullParameter(taxLgnChk, "taxLgnChk");
        Intrinsics.checkNotNullParameter(tempPeriodMode, "tempPeriodMode");
        Intrinsics.checkNotNullParameter(tempTaxOnRoute, "tempTaxOnRoute");
        this.allowedVehicleCondition = allowedVehicleCondition;
        this.fitLgnChk = fitLgnChk;
        this.insLgnChk = insLgnChk;
        this.interIntraStateSelection = z;
        this.maxDaysTemp = i;
        this.maxDaysTempConditionally = maxDaysTempConditionally;
        this.maxMonthsTemp = i2;
        this.maxMonthsTempConditionally = maxMonthsTempConditionally;
        this.maxValidUptoConsider = maxValidUptoConsider;
        this.maxWeeksTemp = i3;
        this.maxWeeksTempConditionally = maxWeeksTempConditionally;
        this.minDaysTemp = i4;
        this.minDaysTempConditionally = minDaysTempConditionally;
        this.minWeeksTemp = i5;
        this.minWeeksTempConditionally = minWeeksTempConditionally;
        this.passengerListTemp = passengerListTemp;
        this.perDayRouteDescTemp = z2;
        this.permanentPermitValid = permanentPermitValid;
        this.pmtTypeSelectTemp = z3;
        this.renewTempPmt = renewTempPmt;
        this.routeRegionListWithinstate = z4;
        this.skipFitLgnChk = skipFitLgnChk;
        this.skipInsLgnChk = skipInsLgnChk;
        this.skipTaxLgnChk = skipTaxLgnChk;
        this.stateCd = stateCd;
        this.taxLgnChk = taxLgnChk;
        this.tempPeriodMode = tempPeriodMode;
        this.tempTaxOnRoute = tempTaxOnRoute;
        this.tempTaxOnRouteLen = z5;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAllowedVehicleCondition() {
        return this.allowedVehicleCondition;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getMaxWeeksTemp() {
        return this.maxWeeksTemp;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getMaxWeeksTempConditionally() {
        return this.maxWeeksTempConditionally;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getMinDaysTemp() {
        return this.minDaysTemp;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getMinDaysTempConditionally() {
        return this.minDaysTempConditionally;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getMinWeeksTemp() {
        return this.minWeeksTemp;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getMinWeeksTempConditionally() {
        return this.minWeeksTempConditionally;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getPassengerListTemp() {
        return this.passengerListTemp;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getPerDayRouteDescTemp() {
        return this.perDayRouteDescTemp;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getPermanentPermitValid() {
        return this.permanentPermitValid;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final boolean getPmtTypeSelectTemp() {
        return this.pmtTypeSelectTemp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFitLgnChk() {
        return this.fitLgnChk;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getRenewTempPmt() {
        return this.renewTempPmt;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final boolean getRouteRegionListWithinstate() {
        return this.routeRegionListWithinstate;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getSkipFitLgnChk() {
        return this.skipFitLgnChk;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getSkipInsLgnChk() {
        return this.skipInsLgnChk;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getSkipTaxLgnChk() {
        return this.skipTaxLgnChk;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getStateCd() {
        return this.stateCd;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getTaxLgnChk() {
        return this.taxLgnChk;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getTempPeriodMode() {
        return this.tempPeriodMode;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getTempTaxOnRoute() {
        return this.tempTaxOnRoute;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final boolean getTempTaxOnRouteLen() {
        return this.tempTaxOnRouteLen;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getInsLgnChk() {
        return this.insLgnChk;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getInterIntraStateSelection() {
        return this.interIntraStateSelection;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMaxDaysTemp() {
        return this.maxDaysTemp;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMaxDaysTempConditionally() {
        return this.maxDaysTempConditionally;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getMaxMonthsTemp() {
        return this.maxMonthsTemp;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMaxMonthsTempConditionally() {
        return this.maxMonthsTempConditionally;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Object getMaxValidUptoConsider() {
        return this.maxValidUptoConsider;
    }

    public final TmConfigurationTempPmt copy(String allowedVehicleCondition, String fitLgnChk, String insLgnChk, boolean interIntraStateSelection, int maxDaysTemp, String maxDaysTempConditionally, int maxMonthsTemp, String maxMonthsTempConditionally, Object maxValidUptoConsider, int maxWeeksTemp, String maxWeeksTempConditionally, int minDaysTemp, String minDaysTempConditionally, int minWeeksTemp, String minWeeksTempConditionally, String passengerListTemp, boolean perDayRouteDescTemp, String permanentPermitValid, boolean pmtTypeSelectTemp, String renewTempPmt, boolean routeRegionListWithinstate, String skipFitLgnChk, String skipInsLgnChk, String skipTaxLgnChk, String stateCd, String taxLgnChk, String tempPeriodMode, String tempTaxOnRoute, boolean tempTaxOnRouteLen) {
        Intrinsics.checkNotNullParameter(allowedVehicleCondition, "allowedVehicleCondition");
        Intrinsics.checkNotNullParameter(fitLgnChk, "fitLgnChk");
        Intrinsics.checkNotNullParameter(insLgnChk, "insLgnChk");
        Intrinsics.checkNotNullParameter(maxDaysTempConditionally, "maxDaysTempConditionally");
        Intrinsics.checkNotNullParameter(maxMonthsTempConditionally, "maxMonthsTempConditionally");
        Intrinsics.checkNotNullParameter(maxValidUptoConsider, "maxValidUptoConsider");
        Intrinsics.checkNotNullParameter(maxWeeksTempConditionally, "maxWeeksTempConditionally");
        Intrinsics.checkNotNullParameter(minDaysTempConditionally, "minDaysTempConditionally");
        Intrinsics.checkNotNullParameter(minWeeksTempConditionally, "minWeeksTempConditionally");
        Intrinsics.checkNotNullParameter(passengerListTemp, "passengerListTemp");
        Intrinsics.checkNotNullParameter(permanentPermitValid, "permanentPermitValid");
        Intrinsics.checkNotNullParameter(renewTempPmt, "renewTempPmt");
        Intrinsics.checkNotNullParameter(skipFitLgnChk, "skipFitLgnChk");
        Intrinsics.checkNotNullParameter(skipInsLgnChk, "skipInsLgnChk");
        Intrinsics.checkNotNullParameter(skipTaxLgnChk, "skipTaxLgnChk");
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        Intrinsics.checkNotNullParameter(taxLgnChk, "taxLgnChk");
        Intrinsics.checkNotNullParameter(tempPeriodMode, "tempPeriodMode");
        Intrinsics.checkNotNullParameter(tempTaxOnRoute, "tempTaxOnRoute");
        return new TmConfigurationTempPmt(allowedVehicleCondition, fitLgnChk, insLgnChk, interIntraStateSelection, maxDaysTemp, maxDaysTempConditionally, maxMonthsTemp, maxMonthsTempConditionally, maxValidUptoConsider, maxWeeksTemp, maxWeeksTempConditionally, minDaysTemp, minDaysTempConditionally, minWeeksTemp, minWeeksTempConditionally, passengerListTemp, perDayRouteDescTemp, permanentPermitValid, pmtTypeSelectTemp, renewTempPmt, routeRegionListWithinstate, skipFitLgnChk, skipInsLgnChk, skipTaxLgnChk, stateCd, taxLgnChk, tempPeriodMode, tempTaxOnRoute, tempTaxOnRouteLen);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TmConfigurationTempPmt)) {
            return false;
        }
        TmConfigurationTempPmt tmConfigurationTempPmt = (TmConfigurationTempPmt) other;
        return Intrinsics.areEqual(this.allowedVehicleCondition, tmConfigurationTempPmt.allowedVehicleCondition) && Intrinsics.areEqual(this.fitLgnChk, tmConfigurationTempPmt.fitLgnChk) && Intrinsics.areEqual(this.insLgnChk, tmConfigurationTempPmt.insLgnChk) && this.interIntraStateSelection == tmConfigurationTempPmt.interIntraStateSelection && this.maxDaysTemp == tmConfigurationTempPmt.maxDaysTemp && Intrinsics.areEqual(this.maxDaysTempConditionally, tmConfigurationTempPmt.maxDaysTempConditionally) && this.maxMonthsTemp == tmConfigurationTempPmt.maxMonthsTemp && Intrinsics.areEqual(this.maxMonthsTempConditionally, tmConfigurationTempPmt.maxMonthsTempConditionally) && Intrinsics.areEqual(this.maxValidUptoConsider, tmConfigurationTempPmt.maxValidUptoConsider) && this.maxWeeksTemp == tmConfigurationTempPmt.maxWeeksTemp && Intrinsics.areEqual(this.maxWeeksTempConditionally, tmConfigurationTempPmt.maxWeeksTempConditionally) && this.minDaysTemp == tmConfigurationTempPmt.minDaysTemp && Intrinsics.areEqual(this.minDaysTempConditionally, tmConfigurationTempPmt.minDaysTempConditionally) && this.minWeeksTemp == tmConfigurationTempPmt.minWeeksTemp && Intrinsics.areEqual(this.minWeeksTempConditionally, tmConfigurationTempPmt.minWeeksTempConditionally) && Intrinsics.areEqual(this.passengerListTemp, tmConfigurationTempPmt.passengerListTemp) && this.perDayRouteDescTemp == tmConfigurationTempPmt.perDayRouteDescTemp && Intrinsics.areEqual(this.permanentPermitValid, tmConfigurationTempPmt.permanentPermitValid) && this.pmtTypeSelectTemp == tmConfigurationTempPmt.pmtTypeSelectTemp && Intrinsics.areEqual(this.renewTempPmt, tmConfigurationTempPmt.renewTempPmt) && this.routeRegionListWithinstate == tmConfigurationTempPmt.routeRegionListWithinstate && Intrinsics.areEqual(this.skipFitLgnChk, tmConfigurationTempPmt.skipFitLgnChk) && Intrinsics.areEqual(this.skipInsLgnChk, tmConfigurationTempPmt.skipInsLgnChk) && Intrinsics.areEqual(this.skipTaxLgnChk, tmConfigurationTempPmt.skipTaxLgnChk) && Intrinsics.areEqual(this.stateCd, tmConfigurationTempPmt.stateCd) && Intrinsics.areEqual(this.taxLgnChk, tmConfigurationTempPmt.taxLgnChk) && Intrinsics.areEqual(this.tempPeriodMode, tmConfigurationTempPmt.tempPeriodMode) && Intrinsics.areEqual(this.tempTaxOnRoute, tmConfigurationTempPmt.tempTaxOnRoute) && this.tempTaxOnRouteLen == tmConfigurationTempPmt.tempTaxOnRouteLen;
    }

    public final String getAllowedVehicleCondition() {
        return this.allowedVehicleCondition;
    }

    public final String getFitLgnChk() {
        return this.fitLgnChk;
    }

    public final String getInsLgnChk() {
        return this.insLgnChk;
    }

    public final boolean getInterIntraStateSelection() {
        return this.interIntraStateSelection;
    }

    public final int getMaxDaysTemp() {
        return this.maxDaysTemp;
    }

    public final String getMaxDaysTempConditionally() {
        return this.maxDaysTempConditionally;
    }

    public final int getMaxMonthsTemp() {
        return this.maxMonthsTemp;
    }

    public final String getMaxMonthsTempConditionally() {
        return this.maxMonthsTempConditionally;
    }

    public final Object getMaxValidUptoConsider() {
        return this.maxValidUptoConsider;
    }

    public final int getMaxWeeksTemp() {
        return this.maxWeeksTemp;
    }

    public final String getMaxWeeksTempConditionally() {
        return this.maxWeeksTempConditionally;
    }

    public final int getMinDaysTemp() {
        return this.minDaysTemp;
    }

    public final String getMinDaysTempConditionally() {
        return this.minDaysTempConditionally;
    }

    public final int getMinWeeksTemp() {
        return this.minWeeksTemp;
    }

    public final String getMinWeeksTempConditionally() {
        return this.minWeeksTempConditionally;
    }

    public final String getPassengerListTemp() {
        return this.passengerListTemp;
    }

    public final boolean getPerDayRouteDescTemp() {
        return this.perDayRouteDescTemp;
    }

    public final String getPermanentPermitValid() {
        return this.permanentPermitValid;
    }

    public final boolean getPmtTypeSelectTemp() {
        return this.pmtTypeSelectTemp;
    }

    public final String getRenewTempPmt() {
        return this.renewTempPmt;
    }

    public final boolean getRouteRegionListWithinstate() {
        return this.routeRegionListWithinstate;
    }

    public final String getSkipFitLgnChk() {
        return this.skipFitLgnChk;
    }

    public final String getSkipInsLgnChk() {
        return this.skipInsLgnChk;
    }

    public final String getSkipTaxLgnChk() {
        return this.skipTaxLgnChk;
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    public final String getTaxLgnChk() {
        return this.taxLgnChk;
    }

    public final String getTempPeriodMode() {
        return this.tempPeriodMode;
    }

    public final String getTempTaxOnRoute() {
        return this.tempTaxOnRoute;
    }

    public final boolean getTempTaxOnRouteLen() {
        return this.tempTaxOnRouteLen;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v31, types: [int] */
    /* JADX WARN: Type inference failed for: r1v35, types: [int] */
    /* JADX WARN: Type inference failed for: r1v39, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((this.allowedVehicleCondition.hashCode() * 31) + this.fitLgnChk.hashCode()) * 31) + this.insLgnChk.hashCode()) * 31;
        boolean z = this.interIntraStateSelection;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode2 = (((((((((((((((((((((((((iHashCode + r1) * 31) + Integer.hashCode(this.maxDaysTemp)) * 31) + this.maxDaysTempConditionally.hashCode()) * 31) + Integer.hashCode(this.maxMonthsTemp)) * 31) + this.maxMonthsTempConditionally.hashCode()) * 31) + this.maxValidUptoConsider.hashCode()) * 31) + Integer.hashCode(this.maxWeeksTemp)) * 31) + this.maxWeeksTempConditionally.hashCode()) * 31) + Integer.hashCode(this.minDaysTemp)) * 31) + this.minDaysTempConditionally.hashCode()) * 31) + Integer.hashCode(this.minWeeksTemp)) * 31) + this.minWeeksTempConditionally.hashCode()) * 31) + this.passengerListTemp.hashCode()) * 31;
        boolean z2 = this.perDayRouteDescTemp;
        ?? r12 = z2;
        if (z2) {
            r12 = 1;
        }
        int iHashCode3 = (((iHashCode2 + r12) * 31) + this.permanentPermitValid.hashCode()) * 31;
        boolean z3 = this.pmtTypeSelectTemp;
        ?? r13 = z3;
        if (z3) {
            r13 = 1;
        }
        int iHashCode4 = (((iHashCode3 + r13) * 31) + this.renewTempPmt.hashCode()) * 31;
        boolean z4 = this.routeRegionListWithinstate;
        ?? r14 = z4;
        if (z4) {
            r14 = 1;
        }
        int iHashCode5 = (((((((((((((((iHashCode4 + r14) * 31) + this.skipFitLgnChk.hashCode()) * 31) + this.skipInsLgnChk.hashCode()) * 31) + this.skipTaxLgnChk.hashCode()) * 31) + this.stateCd.hashCode()) * 31) + this.taxLgnChk.hashCode()) * 31) + this.tempPeriodMode.hashCode()) * 31) + this.tempTaxOnRoute.hashCode()) * 31;
        boolean z5 = this.tempTaxOnRouteLen;
        return iHashCode5 + (z5 ? 1 : z5);
    }

    public String toString() {
        return "TmConfigurationTempPmt(allowedVehicleCondition=" + this.allowedVehicleCondition + ", fitLgnChk=" + this.fitLgnChk + ", insLgnChk=" + this.insLgnChk + ", interIntraStateSelection=" + this.interIntraStateSelection + ", maxDaysTemp=" + this.maxDaysTemp + ", maxDaysTempConditionally=" + this.maxDaysTempConditionally + ", maxMonthsTemp=" + this.maxMonthsTemp + ", maxMonthsTempConditionally=" + this.maxMonthsTempConditionally + ", maxValidUptoConsider=" + this.maxValidUptoConsider + ", maxWeeksTemp=" + this.maxWeeksTemp + ", maxWeeksTempConditionally=" + this.maxWeeksTempConditionally + ", minDaysTemp=" + this.minDaysTemp + ", minDaysTempConditionally=" + this.minDaysTempConditionally + ", minWeeksTemp=" + this.minWeeksTemp + ", minWeeksTempConditionally=" + this.minWeeksTempConditionally + ", passengerListTemp=" + this.passengerListTemp + ", perDayRouteDescTemp=" + this.perDayRouteDescTemp + ", permanentPermitValid=" + this.permanentPermitValid + ", pmtTypeSelectTemp=" + this.pmtTypeSelectTemp + ", renewTempPmt=" + this.renewTempPmt + ", routeRegionListWithinstate=" + this.routeRegionListWithinstate + ", skipFitLgnChk=" + this.skipFitLgnChk + ", skipInsLgnChk=" + this.skipInsLgnChk + ", skipTaxLgnChk=" + this.skipTaxLgnChk + ", stateCd=" + this.stateCd + ", taxLgnChk=" + this.taxLgnChk + ", tempPeriodMode=" + this.tempPeriodMode + ", tempTaxOnRoute=" + this.tempTaxOnRoute + ", tempTaxOnRouteLen=" + this.tempTaxOnRouteLen + ')';
    }
}
