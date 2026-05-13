package com.nic.mparivahan.Sarathithreeservices.model;

import androidx.annotation.Keep;
import com.zepto.xy5;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\bR\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B½\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010&J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010&J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0005HÆ\u0003JÆ\u0002\u0010X\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010YJ\u0013\u0010Z\u001a\u00020[2\b\u0010\\\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010]\u001a\u00020\u0003HÖ\u0001J\t\u0010^\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010!R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010$R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010$R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010$R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010!R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010!R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010!R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010!R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010!R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010!R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010!R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010!R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010!R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010$R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010!R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010!R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010!R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010$R\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010'\u001a\u0004\b=\u0010&¨\u0006_"}, d2 = {"Lcom/nic/mparivahan/Sarathithreeservices/model/OlaMast;", "Ljava/io/Serializable;", "omDistCode", "", "omRtoFullname", "", "omFax", "omOffCdNum", "", "omInstalloffice", "omPostaladd4", "olaScope", "olaCat", "omEmailid", "omPostaladd1", "omPhone", "omPostaladd3", "omPostaladd2", "omStCode", "omTokenId", "omOfficeTownname", "omOfficecd", "omCheckUsertoken", "omOffType", "omOfficename", "omRtoShortname", "omPincodeCov", "omOffdesig", "omMaplink", "omRepOffice", "omUserId", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;)V", "getOlaCat", "()Ljava/lang/String;", "getOlaScope", "getOmCheckUsertoken", "()Ljava/lang/Object;", "getOmDistCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOmEmailid", "getOmFax", "getOmInstalloffice", "getOmMaplink", "getOmOffCdNum", "getOmOffType", "getOmOffdesig", "getOmOfficeTownname", "getOmOfficecd", "getOmOfficename", "getOmPhone", "getOmPincodeCov", "getOmPostaladd1", "getOmPostaladd2", "getOmPostaladd3", "getOmPostaladd4", "getOmRepOffice", "getOmRtoFullname", "getOmRtoShortname", "getOmStCode", "getOmTokenId", "getOmUserId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;)Lcom/nic/mparivahan/Sarathithreeservices/model/OlaMast;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class OlaMast implements Serializable {

    @xy5("olaCat")
    private final String olaCat;

    @xy5("olaScope")
    private final String olaScope;

    @xy5("omCheckUsertoken")
    private final Object omCheckUsertoken;

    @xy5("omDistCode")
    private final Integer omDistCode;

    @xy5("omEmailid")
    private final String omEmailid;

    @xy5("omFax")
    private final String omFax;

    @xy5("omInstalloffice")
    private final Object omInstalloffice;

    @xy5("omMaplink")
    private final Object omMaplink;

    @xy5("omOffCdNum")
    private final Object omOffCdNum;

    @xy5("omOffType")
    private final String omOffType;

    @xy5("omOffdesig")
    private final String omOffdesig;

    @xy5("omOfficeTownname")
    private final String omOfficeTownname;

    @xy5("omOfficecd")
    private final String omOfficecd;

    @xy5("omOfficename")
    private final String omOfficename;

    @xy5("omPhone")
    private final String omPhone;

    @xy5("omPincodeCov")
    private final String omPincodeCov;

    @xy5("omPostaladd1")
    private final String omPostaladd1;

    @xy5("omPostaladd2")
    private final String omPostaladd2;

    @xy5("omPostaladd3")
    private final String omPostaladd3;

    @xy5("omPostaladd4")
    private final String omPostaladd4;

    @xy5("omRepOffice")
    private final Object omRepOffice;

    @xy5("omRtoFullname")
    private final String omRtoFullname;

    @xy5("omRtoShortname")
    private final String omRtoShortname;

    @xy5("omStCode")
    private final String omStCode;

    @xy5("omTokenId")
    private final Object omTokenId;

    @xy5("omUserId")
    private final Integer omUserId;

    public OlaMast() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108863, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getOmDistCode() {
        return this.omDistCode;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getOmPostaladd1() {
        return this.omPostaladd1;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getOmPhone() {
        return this.omPhone;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getOmPostaladd3() {
        return this.omPostaladd3;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getOmPostaladd2() {
        return this.omPostaladd2;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getOmStCode() {
        return this.omStCode;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Object getOmTokenId() {
        return this.omTokenId;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getOmOfficeTownname() {
        return this.omOfficeTownname;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getOmOfficecd() {
        return this.omOfficecd;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Object getOmCheckUsertoken() {
        return this.omCheckUsertoken;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getOmOffType() {
        return this.omOffType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOmRtoFullname() {
        return this.omRtoFullname;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getOmOfficename() {
        return this.omOfficename;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getOmRtoShortname() {
        return this.omRtoShortname;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getOmPincodeCov() {
        return this.omPincodeCov;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getOmOffdesig() {
        return this.omOffdesig;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Object getOmMaplink() {
        return this.omMaplink;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Object getOmRepOffice() {
        return this.omRepOffice;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Integer getOmUserId() {
        return this.omUserId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOmFax() {
        return this.omFax;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Object getOmOffCdNum() {
        return this.omOffCdNum;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Object getOmInstalloffice() {
        return this.omInstalloffice;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOmPostaladd4() {
        return this.omPostaladd4;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOlaScope() {
        return this.olaScope;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getOlaCat() {
        return this.olaCat;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getOmEmailid() {
        return this.omEmailid;
    }

    public final OlaMast copy(Integer omDistCode, String omRtoFullname, String omFax, Object omOffCdNum, Object omInstalloffice, String omPostaladd4, String olaScope, String olaCat, String omEmailid, String omPostaladd1, String omPhone, String omPostaladd3, String omPostaladd2, String omStCode, Object omTokenId, String omOfficeTownname, String omOfficecd, Object omCheckUsertoken, String omOffType, String omOfficename, String omRtoShortname, String omPincodeCov, String omOffdesig, Object omMaplink, Object omRepOffice, Integer omUserId) {
        return new OlaMast(omDistCode, omRtoFullname, omFax, omOffCdNum, omInstalloffice, omPostaladd4, olaScope, olaCat, omEmailid, omPostaladd1, omPhone, omPostaladd3, omPostaladd2, omStCode, omTokenId, omOfficeTownname, omOfficecd, omCheckUsertoken, omOffType, omOfficename, omRtoShortname, omPincodeCov, omOffdesig, omMaplink, omRepOffice, omUserId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OlaMast)) {
            return false;
        }
        OlaMast olaMast = (OlaMast) other;
        return Intrinsics.areEqual(this.omDistCode, olaMast.omDistCode) && Intrinsics.areEqual(this.omRtoFullname, olaMast.omRtoFullname) && Intrinsics.areEqual(this.omFax, olaMast.omFax) && Intrinsics.areEqual(this.omOffCdNum, olaMast.omOffCdNum) && Intrinsics.areEqual(this.omInstalloffice, olaMast.omInstalloffice) && Intrinsics.areEqual(this.omPostaladd4, olaMast.omPostaladd4) && Intrinsics.areEqual(this.olaScope, olaMast.olaScope) && Intrinsics.areEqual(this.olaCat, olaMast.olaCat) && Intrinsics.areEqual(this.omEmailid, olaMast.omEmailid) && Intrinsics.areEqual(this.omPostaladd1, olaMast.omPostaladd1) && Intrinsics.areEqual(this.omPhone, olaMast.omPhone) && Intrinsics.areEqual(this.omPostaladd3, olaMast.omPostaladd3) && Intrinsics.areEqual(this.omPostaladd2, olaMast.omPostaladd2) && Intrinsics.areEqual(this.omStCode, olaMast.omStCode) && Intrinsics.areEqual(this.omTokenId, olaMast.omTokenId) && Intrinsics.areEqual(this.omOfficeTownname, olaMast.omOfficeTownname) && Intrinsics.areEqual(this.omOfficecd, olaMast.omOfficecd) && Intrinsics.areEqual(this.omCheckUsertoken, olaMast.omCheckUsertoken) && Intrinsics.areEqual(this.omOffType, olaMast.omOffType) && Intrinsics.areEqual(this.omOfficename, olaMast.omOfficename) && Intrinsics.areEqual(this.omRtoShortname, olaMast.omRtoShortname) && Intrinsics.areEqual(this.omPincodeCov, olaMast.omPincodeCov) && Intrinsics.areEqual(this.omOffdesig, olaMast.omOffdesig) && Intrinsics.areEqual(this.omMaplink, olaMast.omMaplink) && Intrinsics.areEqual(this.omRepOffice, olaMast.omRepOffice) && Intrinsics.areEqual(this.omUserId, olaMast.omUserId);
    }

    public final String getOlaCat() {
        return this.olaCat;
    }

    public final String getOlaScope() {
        return this.olaScope;
    }

    public final Object getOmCheckUsertoken() {
        return this.omCheckUsertoken;
    }

    public final Integer getOmDistCode() {
        return this.omDistCode;
    }

    public final String getOmEmailid() {
        return this.omEmailid;
    }

    public final String getOmFax() {
        return this.omFax;
    }

    public final Object getOmInstalloffice() {
        return this.omInstalloffice;
    }

    public final Object getOmMaplink() {
        return this.omMaplink;
    }

    public final Object getOmOffCdNum() {
        return this.omOffCdNum;
    }

    public final String getOmOffType() {
        return this.omOffType;
    }

    public final String getOmOffdesig() {
        return this.omOffdesig;
    }

    public final String getOmOfficeTownname() {
        return this.omOfficeTownname;
    }

    public final String getOmOfficecd() {
        return this.omOfficecd;
    }

    public final String getOmOfficename() {
        return this.omOfficename;
    }

    public final String getOmPhone() {
        return this.omPhone;
    }

    public final String getOmPincodeCov() {
        return this.omPincodeCov;
    }

    public final String getOmPostaladd1() {
        return this.omPostaladd1;
    }

    public final String getOmPostaladd2() {
        return this.omPostaladd2;
    }

    public final String getOmPostaladd3() {
        return this.omPostaladd3;
    }

    public final String getOmPostaladd4() {
        return this.omPostaladd4;
    }

    public final Object getOmRepOffice() {
        return this.omRepOffice;
    }

    public final String getOmRtoFullname() {
        return this.omRtoFullname;
    }

    public final String getOmRtoShortname() {
        return this.omRtoShortname;
    }

    public final String getOmStCode() {
        return this.omStCode;
    }

    public final Object getOmTokenId() {
        return this.omTokenId;
    }

    public final Integer getOmUserId() {
        return this.omUserId;
    }

    public int hashCode() {
        Integer num = this.omDistCode;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.omRtoFullname;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.omFax;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj = this.omOffCdNum;
        int iHashCode4 = (iHashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.omInstalloffice;
        int iHashCode5 = (iHashCode4 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        String str3 = this.omPostaladd4;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.olaScope;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.olaCat;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.omEmailid;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.omPostaladd1;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.omPhone;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.omPostaladd3;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.omPostaladd2;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.omStCode;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Object obj3 = this.omTokenId;
        int iHashCode15 = (iHashCode14 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        String str12 = this.omOfficeTownname;
        int iHashCode16 = (iHashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.omOfficecd;
        int iHashCode17 = (iHashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Object obj4 = this.omCheckUsertoken;
        int iHashCode18 = (iHashCode17 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        String str14 = this.omOffType;
        int iHashCode19 = (iHashCode18 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.omOfficename;
        int iHashCode20 = (iHashCode19 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.omRtoShortname;
        int iHashCode21 = (iHashCode20 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.omPincodeCov;
        int iHashCode22 = (iHashCode21 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.omOffdesig;
        int iHashCode23 = (iHashCode22 + (str18 == null ? 0 : str18.hashCode())) * 31;
        Object obj5 = this.omMaplink;
        int iHashCode24 = (iHashCode23 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
        Object obj6 = this.omRepOffice;
        int iHashCode25 = (iHashCode24 + (obj6 == null ? 0 : obj6.hashCode())) * 31;
        Integer num2 = this.omUserId;
        return iHashCode25 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "OlaMast(omDistCode=" + this.omDistCode + ", omRtoFullname=" + this.omRtoFullname + ", omFax=" + this.omFax + ", omOffCdNum=" + this.omOffCdNum + ", omInstalloffice=" + this.omInstalloffice + ", omPostaladd4=" + this.omPostaladd4 + ", olaScope=" + this.olaScope + ", olaCat=" + this.olaCat + ", omEmailid=" + this.omEmailid + ", omPostaladd1=" + this.omPostaladd1 + ", omPhone=" + this.omPhone + ", omPostaladd3=" + this.omPostaladd3 + ", omPostaladd2=" + this.omPostaladd2 + ", omStCode=" + this.omStCode + ", omTokenId=" + this.omTokenId + ", omOfficeTownname=" + this.omOfficeTownname + ", omOfficecd=" + this.omOfficecd + ", omCheckUsertoken=" + this.omCheckUsertoken + ", omOffType=" + this.omOffType + ", omOfficename=" + this.omOfficename + ", omRtoShortname=" + this.omRtoShortname + ", omPincodeCov=" + this.omPincodeCov + ", omOffdesig=" + this.omOffdesig + ", omMaplink=" + this.omMaplink + ", omRepOffice=" + this.omRepOffice + ", omUserId=" + this.omUserId + ')';
    }

    public OlaMast(Integer num, String str, String str2, Object obj, Object obj2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Object obj3, String str12, String str13, Object obj4, String str14, String str15, String str16, String str17, String str18, Object obj5, Object obj6, Integer num2) {
        this.omDistCode = num;
        this.omRtoFullname = str;
        this.omFax = str2;
        this.omOffCdNum = obj;
        this.omInstalloffice = obj2;
        this.omPostaladd4 = str3;
        this.olaScope = str4;
        this.olaCat = str5;
        this.omEmailid = str6;
        this.omPostaladd1 = str7;
        this.omPhone = str8;
        this.omPostaladd3 = str9;
        this.omPostaladd2 = str10;
        this.omStCode = str11;
        this.omTokenId = obj3;
        this.omOfficeTownname = str12;
        this.omOfficecd = str13;
        this.omCheckUsertoken = obj4;
        this.omOffType = str14;
        this.omOfficename = str15;
        this.omRtoShortname = str16;
        this.omPincodeCov = str17;
        this.omOffdesig = str18;
        this.omMaplink = obj5;
        this.omRepOffice = obj6;
        this.omUserId = num2;
    }

    public /* synthetic */ OlaMast(Integer num, String str, String str2, Object obj, Object obj2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Object obj3, String str12, String str13, Object obj4, String str14, String str15, String str16, String str17, String str18, Object obj5, Object obj6, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : obj, (i & 16) != 0 ? null : obj2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : str9, (i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? null : str10, (i & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? null : str11, (i & 16384) != 0 ? null : obj3, (i & 32768) != 0 ? null : str12, (i & 65536) != 0 ? null : str13, (i & 131072) != 0 ? null : obj4, (i & 262144) != 0 ? null : str14, (i & 524288) != 0 ? null : str15, (i & 1048576) != 0 ? null : str16, (i & 2097152) != 0 ? null : str17, (i & 4194304) != 0 ? null : str18, (i & 8388608) != 0 ? null : obj5, (i & 16777216) != 0 ? null : obj6, (i & 33554432) != 0 ? null : num2);
    }
}
