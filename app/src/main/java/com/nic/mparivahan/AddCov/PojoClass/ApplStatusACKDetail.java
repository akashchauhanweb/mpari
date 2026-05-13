package com.nic.mparivahan.AddCov.PojoClass;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\bN\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c\u0012\u0006\u0010\u001d\u001a\u00020\n\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u001c\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\u0003¢\u0006\u0002\u0010$J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0017HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\u000f\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00030\u001cHÆ\u0003J\t\u0010W\u001a\u00020\nHÆ\u0003J\u000f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00030\u001cHÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\u000f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00030\u001cHÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\t\u0010_\u001a\u00020\u0003HÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\t\u0010a\u001a\u00020\u0003HÆ\u0003J\t\u0010b\u001a\u00020\nHÆ\u0003J\t\u0010c\u001a\u00020\nHÆ\u0003J\t\u0010d\u001a\u00020\u0003HÆ\u0003JÇ\u0002\u0010e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\n2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u001c2\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u0003HÆ\u0001J\u0013\u0010f\u001a\u00020\n2\b\u0010g\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010h\u001a\u00020\u0017HÖ\u0001J\t\u0010i\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010&R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010&R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010&R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010&R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010&R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010&R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010&R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010&R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010&R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010&R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010&R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010&R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010&R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010&R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010&R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010&R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0011\u0010\u001d\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b@\u0010-R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\b\n\u0000\u001a\u0004\bA\u0010?R\u0011\u0010\u001f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010&R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\b\n\u0000\u001a\u0004\bC\u0010?R\u0011\u0010!\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010&R\u0011\u0010\"\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010&R\u0011\u0010#\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010&¨\u0006j"}, d2 = {"Lcom/nic/mparivahan/AddCov/PojoClass/ApplStatusACKDetail;", "", "App_Full_Name", "", "DOB", "MSG", "QRCodeImg", "StCodeAck", "ackGender", "addCovsInNewLL", "", "addTransInLLServices", "applBlGr", "applSwdName", "applicationdate", "biomobileno", "biotempAdd1", "biotempAdd2", "biotempAdd3", "biotempdistName", "biotempstName", "biotempvillName", "dltransapplno", "", "dltranspages", "dltranspages2", "dltranspages3", "docs4dltransactions", "", "individualPrint", "mp_trnsact", "relationType", "rto", "selectedCovs", "smsNoDLServices", "smsNoToDisplay", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApp_Full_Name", "()Ljava/lang/String;", "getDOB", "getMSG", "getQRCodeImg", "getStCodeAck", "getAckGender", "getAddCovsInNewLL", "()Z", "getAddTransInLLServices", "getApplBlGr", "getApplSwdName", "getApplicationdate", "getBiomobileno", "getBiotempAdd1", "getBiotempAdd2", "getBiotempAdd3", "getBiotempdistName", "getBiotempstName", "getBiotempvillName", "getDltransapplno", "()I", "getDltranspages", "getDltranspages2", "getDltranspages3", "getDocs4dltransactions", "()Ljava/util/List;", "getIndividualPrint", "getMp_trnsact", "getRelationType", "getRto", "getSelectedCovs", "getSmsNoDLServices", "getSmsNoToDisplay", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ApplStatusACKDetail {
    private final String App_Full_Name;
    private final String DOB;
    private final String MSG;
    private final String QRCodeImg;
    private final String StCodeAck;
    private final String ackGender;
    private final boolean addCovsInNewLL;
    private final boolean addTransInLLServices;
    private final String applBlGr;
    private final String applSwdName;
    private final String applicationdate;
    private final String biomobileno;
    private final String biotempAdd1;
    private final String biotempAdd2;
    private final String biotempAdd3;
    private final String biotempdistName;
    private final String biotempstName;
    private final String biotempvillName;
    private final int dltransapplno;
    private final String dltranspages;
    private final String dltranspages2;
    private final String dltranspages3;
    private final List<String> docs4dltransactions;
    private final boolean individualPrint;
    private final List<String> mp_trnsact;
    private final String relationType;
    private final List<String> rto;
    private final String selectedCovs;
    private final String smsNoDLServices;
    private final String smsNoToDisplay;

    public ApplStatusACKDetail(String App_Full_Name, String DOB, String MSG, String QRCodeImg, String StCodeAck, String ackGender, boolean z, boolean z2, String applBlGr, String applSwdName, String applicationdate, String biomobileno, String biotempAdd1, String biotempAdd2, String biotempAdd3, String biotempdistName, String biotempstName, String biotempvillName, int i, String dltranspages, String dltranspages2, String dltranspages3, List<String> docs4dltransactions, boolean z3, List<String> mp_trnsact, String relationType, List<String> rto, String selectedCovs, String smsNoDLServices, String smsNoToDisplay) {
        Intrinsics.checkNotNullParameter(App_Full_Name, "App_Full_Name");
        Intrinsics.checkNotNullParameter(DOB, "DOB");
        Intrinsics.checkNotNullParameter(MSG, "MSG");
        Intrinsics.checkNotNullParameter(QRCodeImg, "QRCodeImg");
        Intrinsics.checkNotNullParameter(StCodeAck, "StCodeAck");
        Intrinsics.checkNotNullParameter(ackGender, "ackGender");
        Intrinsics.checkNotNullParameter(applBlGr, "applBlGr");
        Intrinsics.checkNotNullParameter(applSwdName, "applSwdName");
        Intrinsics.checkNotNullParameter(applicationdate, "applicationdate");
        Intrinsics.checkNotNullParameter(biomobileno, "biomobileno");
        Intrinsics.checkNotNullParameter(biotempAdd1, "biotempAdd1");
        Intrinsics.checkNotNullParameter(biotempAdd2, "biotempAdd2");
        Intrinsics.checkNotNullParameter(biotempAdd3, "biotempAdd3");
        Intrinsics.checkNotNullParameter(biotempdistName, "biotempdistName");
        Intrinsics.checkNotNullParameter(biotempstName, "biotempstName");
        Intrinsics.checkNotNullParameter(biotempvillName, "biotempvillName");
        Intrinsics.checkNotNullParameter(dltranspages, "dltranspages");
        Intrinsics.checkNotNullParameter(dltranspages2, "dltranspages2");
        Intrinsics.checkNotNullParameter(dltranspages3, "dltranspages3");
        Intrinsics.checkNotNullParameter(docs4dltransactions, "docs4dltransactions");
        Intrinsics.checkNotNullParameter(mp_trnsact, "mp_trnsact");
        Intrinsics.checkNotNullParameter(relationType, "relationType");
        Intrinsics.checkNotNullParameter(rto, "rto");
        Intrinsics.checkNotNullParameter(selectedCovs, "selectedCovs");
        Intrinsics.checkNotNullParameter(smsNoDLServices, "smsNoDLServices");
        Intrinsics.checkNotNullParameter(smsNoToDisplay, "smsNoToDisplay");
        this.App_Full_Name = App_Full_Name;
        this.DOB = DOB;
        this.MSG = MSG;
        this.QRCodeImg = QRCodeImg;
        this.StCodeAck = StCodeAck;
        this.ackGender = ackGender;
        this.addCovsInNewLL = z;
        this.addTransInLLServices = z2;
        this.applBlGr = applBlGr;
        this.applSwdName = applSwdName;
        this.applicationdate = applicationdate;
        this.biomobileno = biomobileno;
        this.biotempAdd1 = biotempAdd1;
        this.biotempAdd2 = biotempAdd2;
        this.biotempAdd3 = biotempAdd3;
        this.biotempdistName = biotempdistName;
        this.biotempstName = biotempstName;
        this.biotempvillName = biotempvillName;
        this.dltransapplno = i;
        this.dltranspages = dltranspages;
        this.dltranspages2 = dltranspages2;
        this.dltranspages3 = dltranspages3;
        this.docs4dltransactions = docs4dltransactions;
        this.individualPrint = z3;
        this.mp_trnsact = mp_trnsact;
        this.relationType = relationType;
        this.rto = rto;
        this.selectedCovs = selectedCovs;
        this.smsNoDLServices = smsNoDLServices;
        this.smsNoToDisplay = smsNoToDisplay;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApp_Full_Name() {
        return this.App_Full_Name;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getApplSwdName() {
        return this.applSwdName;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getApplicationdate() {
        return this.applicationdate;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getBiomobileno() {
        return this.biomobileno;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getBiotempAdd1() {
        return this.biotempAdd1;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getBiotempAdd2() {
        return this.biotempAdd2;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getBiotempAdd3() {
        return this.biotempAdd3;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getBiotempdistName() {
        return this.biotempdistName;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getBiotempstName() {
        return this.biotempstName;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getBiotempvillName() {
        return this.biotempvillName;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getDltransapplno() {
        return this.dltransapplno;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDOB() {
        return this.DOB;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getDltranspages() {
        return this.dltranspages;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getDltranspages2() {
        return this.dltranspages2;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getDltranspages3() {
        return this.dltranspages3;
    }

    public final List<String> component23() {
        return this.docs4dltransactions;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final boolean getIndividualPrint() {
        return this.individualPrint;
    }

    public final List<String> component25() {
        return this.mp_trnsact;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getRelationType() {
        return this.relationType;
    }

    public final List<String> component27() {
        return this.rto;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getSelectedCovs() {
        return this.selectedCovs;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getSmsNoDLServices() {
        return this.smsNoDLServices;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMSG() {
        return this.MSG;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getSmsNoToDisplay() {
        return this.smsNoToDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getQRCodeImg() {
        return this.QRCodeImg;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStCodeAck() {
        return this.StCodeAck;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAckGender() {
        return this.ackGender;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getAddCovsInNewLL() {
        return this.addCovsInNewLL;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getAddTransInLLServices() {
        return this.addTransInLLServices;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getApplBlGr() {
        return this.applBlGr;
    }

    public final ApplStatusACKDetail copy(String App_Full_Name, String DOB, String MSG, String QRCodeImg, String StCodeAck, String ackGender, boolean addCovsInNewLL, boolean addTransInLLServices, String applBlGr, String applSwdName, String applicationdate, String biomobileno, String biotempAdd1, String biotempAdd2, String biotempAdd3, String biotempdistName, String biotempstName, String biotempvillName, int dltransapplno, String dltranspages, String dltranspages2, String dltranspages3, List<String> docs4dltransactions, boolean individualPrint, List<String> mp_trnsact, String relationType, List<String> rto, String selectedCovs, String smsNoDLServices, String smsNoToDisplay) {
        Intrinsics.checkNotNullParameter(App_Full_Name, "App_Full_Name");
        Intrinsics.checkNotNullParameter(DOB, "DOB");
        Intrinsics.checkNotNullParameter(MSG, "MSG");
        Intrinsics.checkNotNullParameter(QRCodeImg, "QRCodeImg");
        Intrinsics.checkNotNullParameter(StCodeAck, "StCodeAck");
        Intrinsics.checkNotNullParameter(ackGender, "ackGender");
        Intrinsics.checkNotNullParameter(applBlGr, "applBlGr");
        Intrinsics.checkNotNullParameter(applSwdName, "applSwdName");
        Intrinsics.checkNotNullParameter(applicationdate, "applicationdate");
        Intrinsics.checkNotNullParameter(biomobileno, "biomobileno");
        Intrinsics.checkNotNullParameter(biotempAdd1, "biotempAdd1");
        Intrinsics.checkNotNullParameter(biotempAdd2, "biotempAdd2");
        Intrinsics.checkNotNullParameter(biotempAdd3, "biotempAdd3");
        Intrinsics.checkNotNullParameter(biotempdistName, "biotempdistName");
        Intrinsics.checkNotNullParameter(biotempstName, "biotempstName");
        Intrinsics.checkNotNullParameter(biotempvillName, "biotempvillName");
        Intrinsics.checkNotNullParameter(dltranspages, "dltranspages");
        Intrinsics.checkNotNullParameter(dltranspages2, "dltranspages2");
        Intrinsics.checkNotNullParameter(dltranspages3, "dltranspages3");
        Intrinsics.checkNotNullParameter(docs4dltransactions, "docs4dltransactions");
        Intrinsics.checkNotNullParameter(mp_trnsact, "mp_trnsact");
        Intrinsics.checkNotNullParameter(relationType, "relationType");
        Intrinsics.checkNotNullParameter(rto, "rto");
        Intrinsics.checkNotNullParameter(selectedCovs, "selectedCovs");
        Intrinsics.checkNotNullParameter(smsNoDLServices, "smsNoDLServices");
        Intrinsics.checkNotNullParameter(smsNoToDisplay, "smsNoToDisplay");
        return new ApplStatusACKDetail(App_Full_Name, DOB, MSG, QRCodeImg, StCodeAck, ackGender, addCovsInNewLL, addTransInLLServices, applBlGr, applSwdName, applicationdate, biomobileno, biotempAdd1, biotempAdd2, biotempAdd3, biotempdistName, biotempstName, biotempvillName, dltransapplno, dltranspages, dltranspages2, dltranspages3, docs4dltransactions, individualPrint, mp_trnsact, relationType, rto, selectedCovs, smsNoDLServices, smsNoToDisplay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplStatusACKDetail)) {
            return false;
        }
        ApplStatusACKDetail applStatusACKDetail = (ApplStatusACKDetail) other;
        return Intrinsics.areEqual(this.App_Full_Name, applStatusACKDetail.App_Full_Name) && Intrinsics.areEqual(this.DOB, applStatusACKDetail.DOB) && Intrinsics.areEqual(this.MSG, applStatusACKDetail.MSG) && Intrinsics.areEqual(this.QRCodeImg, applStatusACKDetail.QRCodeImg) && Intrinsics.areEqual(this.StCodeAck, applStatusACKDetail.StCodeAck) && Intrinsics.areEqual(this.ackGender, applStatusACKDetail.ackGender) && this.addCovsInNewLL == applStatusACKDetail.addCovsInNewLL && this.addTransInLLServices == applStatusACKDetail.addTransInLLServices && Intrinsics.areEqual(this.applBlGr, applStatusACKDetail.applBlGr) && Intrinsics.areEqual(this.applSwdName, applStatusACKDetail.applSwdName) && Intrinsics.areEqual(this.applicationdate, applStatusACKDetail.applicationdate) && Intrinsics.areEqual(this.biomobileno, applStatusACKDetail.biomobileno) && Intrinsics.areEqual(this.biotempAdd1, applStatusACKDetail.biotempAdd1) && Intrinsics.areEqual(this.biotempAdd2, applStatusACKDetail.biotempAdd2) && Intrinsics.areEqual(this.biotempAdd3, applStatusACKDetail.biotempAdd3) && Intrinsics.areEqual(this.biotempdistName, applStatusACKDetail.biotempdistName) && Intrinsics.areEqual(this.biotempstName, applStatusACKDetail.biotempstName) && Intrinsics.areEqual(this.biotempvillName, applStatusACKDetail.biotempvillName) && this.dltransapplno == applStatusACKDetail.dltransapplno && Intrinsics.areEqual(this.dltranspages, applStatusACKDetail.dltranspages) && Intrinsics.areEqual(this.dltranspages2, applStatusACKDetail.dltranspages2) && Intrinsics.areEqual(this.dltranspages3, applStatusACKDetail.dltranspages3) && Intrinsics.areEqual(this.docs4dltransactions, applStatusACKDetail.docs4dltransactions) && this.individualPrint == applStatusACKDetail.individualPrint && Intrinsics.areEqual(this.mp_trnsact, applStatusACKDetail.mp_trnsact) && Intrinsics.areEqual(this.relationType, applStatusACKDetail.relationType) && Intrinsics.areEqual(this.rto, applStatusACKDetail.rto) && Intrinsics.areEqual(this.selectedCovs, applStatusACKDetail.selectedCovs) && Intrinsics.areEqual(this.smsNoDLServices, applStatusACKDetail.smsNoDLServices) && Intrinsics.areEqual(this.smsNoToDisplay, applStatusACKDetail.smsNoToDisplay);
    }

    public final String getAckGender() {
        return this.ackGender;
    }

    public final boolean getAddCovsInNewLL() {
        return this.addCovsInNewLL;
    }

    public final boolean getAddTransInLLServices() {
        return this.addTransInLLServices;
    }

    public final String getApp_Full_Name() {
        return this.App_Full_Name;
    }

    public final String getApplBlGr() {
        return this.applBlGr;
    }

    public final String getApplSwdName() {
        return this.applSwdName;
    }

    public final String getApplicationdate() {
        return this.applicationdate;
    }

    public final String getBiomobileno() {
        return this.biomobileno;
    }

    public final String getBiotempAdd1() {
        return this.biotempAdd1;
    }

    public final String getBiotempAdd2() {
        return this.biotempAdd2;
    }

    public final String getBiotempAdd3() {
        return this.biotempAdd3;
    }

    public final String getBiotempdistName() {
        return this.biotempdistName;
    }

    public final String getBiotempstName() {
        return this.biotempstName;
    }

    public final String getBiotempvillName() {
        return this.biotempvillName;
    }

    public final String getDOB() {
        return this.DOB;
    }

    public final int getDltransapplno() {
        return this.dltransapplno;
    }

    public final String getDltranspages() {
        return this.dltranspages;
    }

    public final String getDltranspages2() {
        return this.dltranspages2;
    }

    public final String getDltranspages3() {
        return this.dltranspages3;
    }

    public final List<String> getDocs4dltransactions() {
        return this.docs4dltransactions;
    }

    public final boolean getIndividualPrint() {
        return this.individualPrint;
    }

    public final String getMSG() {
        return this.MSG;
    }

    public final List<String> getMp_trnsact() {
        return this.mp_trnsact;
    }

    public final String getQRCodeImg() {
        return this.QRCodeImg;
    }

    public final String getRelationType() {
        return this.relationType;
    }

    public final List<String> getRto() {
        return this.rto;
    }

    public final String getSelectedCovs() {
        return this.selectedCovs;
    }

    public final String getSmsNoDLServices() {
        return this.smsNoDLServices;
    }

    public final String getSmsNoToDisplay() {
        return this.smsNoToDisplay;
    }

    public final String getStCodeAck() {
        return this.StCodeAck;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((((((((this.App_Full_Name.hashCode() * 31) + this.DOB.hashCode()) * 31) + this.MSG.hashCode()) * 31) + this.QRCodeImg.hashCode()) * 31) + this.StCodeAck.hashCode()) * 31) + this.ackGender.hashCode()) * 31;
        boolean z = this.addCovsInNewLL;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.addTransInLLServices;
        ?? r12 = z2;
        if (z2) {
            r12 = 1;
        }
        int iHashCode2 = (((((((((((((((((((((((((((((((i + r12) * 31) + this.applBlGr.hashCode()) * 31) + this.applSwdName.hashCode()) * 31) + this.applicationdate.hashCode()) * 31) + this.biomobileno.hashCode()) * 31) + this.biotempAdd1.hashCode()) * 31) + this.biotempAdd2.hashCode()) * 31) + this.biotempAdd3.hashCode()) * 31) + this.biotempdistName.hashCode()) * 31) + this.biotempstName.hashCode()) * 31) + this.biotempvillName.hashCode()) * 31) + Integer.hashCode(this.dltransapplno)) * 31) + this.dltranspages.hashCode()) * 31) + this.dltranspages2.hashCode()) * 31) + this.dltranspages3.hashCode()) * 31) + this.docs4dltransactions.hashCode()) * 31;
        boolean z3 = this.individualPrint;
        return ((((((((((((iHashCode2 + (z3 ? 1 : z3)) * 31) + this.mp_trnsact.hashCode()) * 31) + this.relationType.hashCode()) * 31) + this.rto.hashCode()) * 31) + this.selectedCovs.hashCode()) * 31) + this.smsNoDLServices.hashCode()) * 31) + this.smsNoToDisplay.hashCode();
    }

    public String toString() {
        return "ApplStatusACKDetail(App_Full_Name=" + this.App_Full_Name + ", DOB=" + this.DOB + ", MSG=" + this.MSG + ", QRCodeImg=" + this.QRCodeImg + ", StCodeAck=" + this.StCodeAck + ", ackGender=" + this.ackGender + ", addCovsInNewLL=" + this.addCovsInNewLL + ", addTransInLLServices=" + this.addTransInLLServices + ", applBlGr=" + this.applBlGr + ", applSwdName=" + this.applSwdName + ", applicationdate=" + this.applicationdate + ", biomobileno=" + this.biomobileno + ", biotempAdd1=" + this.biotempAdd1 + ", biotempAdd2=" + this.biotempAdd2 + ", biotempAdd3=" + this.biotempAdd3 + ", biotempdistName=" + this.biotempdistName + ", biotempstName=" + this.biotempstName + ", biotempvillName=" + this.biotempvillName + ", dltransapplno=" + this.dltransapplno + ", dltranspages=" + this.dltranspages + ", dltranspages2=" + this.dltranspages2 + ", dltranspages3=" + this.dltranspages3 + ", docs4dltransactions=" + this.docs4dltransactions + ", individualPrint=" + this.individualPrint + ", mp_trnsact=" + this.mp_trnsact + ", relationType=" + this.relationType + ", rto=" + this.rto + ", selectedCovs=" + this.selectedCovs + ", smsNoDLServices=" + this.smsNoDLServices + ", smsNoToDisplay=" + this.smsNoToDisplay + ')';
    }
}
