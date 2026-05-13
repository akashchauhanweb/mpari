package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import com.zepto.xy5;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0081\u0001\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006+"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/ServicesRequested;", "Ljava/io/Serializable;", "jsonMember514", "", "jsonMember513", "jsonMember515", "jsonMember516", "jsonMember523", "jsonMember524", "jsonMember548", "jsonMember525", "jsonMember537", "jsonMember526", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getJsonMember513", "()Ljava/lang/String;", "getJsonMember514", "getJsonMember515", "getJsonMember516", "getJsonMember523", "getJsonMember524", "getJsonMember525", "getJsonMember526", "getJsonMember537", "getJsonMember548", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ServicesRequested implements Serializable {

    @xy5("513")
    private final String jsonMember513;

    @xy5("514")
    private final String jsonMember514;

    @xy5("515")
    private final String jsonMember515;

    @xy5("516")
    private final String jsonMember516;

    @xy5("523")
    private final String jsonMember523;

    @xy5("524")
    private final String jsonMember524;

    @xy5("525")
    private final String jsonMember525;

    @xy5("526")
    private final String jsonMember526;

    @xy5("537")
    private final String jsonMember537;

    @xy5("548")
    private final String jsonMember548;

    public ServicesRequested() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getJsonMember514() {
        return this.jsonMember514;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getJsonMember526() {
        return this.jsonMember526;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getJsonMember513() {
        return this.jsonMember513;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getJsonMember515() {
        return this.jsonMember515;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getJsonMember516() {
        return this.jsonMember516;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getJsonMember523() {
        return this.jsonMember523;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getJsonMember524() {
        return this.jsonMember524;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getJsonMember548() {
        return this.jsonMember548;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getJsonMember525() {
        return this.jsonMember525;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getJsonMember537() {
        return this.jsonMember537;
    }

    public final ServicesRequested copy(String jsonMember514, String jsonMember513, String jsonMember515, String jsonMember516, String jsonMember523, String jsonMember524, String jsonMember548, String jsonMember525, String jsonMember537, String jsonMember526) {
        return new ServicesRequested(jsonMember514, jsonMember513, jsonMember515, jsonMember516, jsonMember523, jsonMember524, jsonMember548, jsonMember525, jsonMember537, jsonMember526);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServicesRequested)) {
            return false;
        }
        ServicesRequested servicesRequested = (ServicesRequested) other;
        return Intrinsics.areEqual(this.jsonMember514, servicesRequested.jsonMember514) && Intrinsics.areEqual(this.jsonMember513, servicesRequested.jsonMember513) && Intrinsics.areEqual(this.jsonMember515, servicesRequested.jsonMember515) && Intrinsics.areEqual(this.jsonMember516, servicesRequested.jsonMember516) && Intrinsics.areEqual(this.jsonMember523, servicesRequested.jsonMember523) && Intrinsics.areEqual(this.jsonMember524, servicesRequested.jsonMember524) && Intrinsics.areEqual(this.jsonMember548, servicesRequested.jsonMember548) && Intrinsics.areEqual(this.jsonMember525, servicesRequested.jsonMember525) && Intrinsics.areEqual(this.jsonMember537, servicesRequested.jsonMember537) && Intrinsics.areEqual(this.jsonMember526, servicesRequested.jsonMember526);
    }

    public final String getJsonMember513() {
        return this.jsonMember513;
    }

    public final String getJsonMember514() {
        return this.jsonMember514;
    }

    public final String getJsonMember515() {
        return this.jsonMember515;
    }

    public final String getJsonMember516() {
        return this.jsonMember516;
    }

    public final String getJsonMember523() {
        return this.jsonMember523;
    }

    public final String getJsonMember524() {
        return this.jsonMember524;
    }

    public final String getJsonMember525() {
        return this.jsonMember525;
    }

    public final String getJsonMember526() {
        return this.jsonMember526;
    }

    public final String getJsonMember537() {
        return this.jsonMember537;
    }

    public final String getJsonMember548() {
        return this.jsonMember548;
    }

    public int hashCode() {
        String str = this.jsonMember514;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.jsonMember513;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.jsonMember515;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.jsonMember516;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.jsonMember523;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.jsonMember524;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.jsonMember548;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.jsonMember525;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.jsonMember537;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.jsonMember526;
        return iHashCode9 + (str10 != null ? str10.hashCode() : 0);
    }

    public String toString() {
        return "ServicesRequested(jsonMember514=" + this.jsonMember514 + ", jsonMember513=" + this.jsonMember513 + ", jsonMember515=" + this.jsonMember515 + ", jsonMember516=" + this.jsonMember516 + ", jsonMember523=" + this.jsonMember523 + ", jsonMember524=" + this.jsonMember524 + ", jsonMember548=" + this.jsonMember548 + ", jsonMember525=" + this.jsonMember525 + ", jsonMember537=" + this.jsonMember537 + ", jsonMember526=" + this.jsonMember526 + ')';
    }

    public ServicesRequested(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.jsonMember514 = str;
        this.jsonMember513 = str2;
        this.jsonMember515 = str3;
        this.jsonMember516 = str4;
        this.jsonMember523 = str5;
        this.jsonMember524 = str6;
        this.jsonMember548 = str7;
        this.jsonMember525 = str8;
        this.jsonMember537 = str9;
        this.jsonMember526 = str10;
    }

    public /* synthetic */ ServicesRequested(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 ? str10 : null);
    }
}
