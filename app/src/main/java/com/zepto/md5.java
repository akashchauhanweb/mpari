package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class md5 {
    private String blockListApp;
    private boolean clearDataFlag;
    private int forceCloseTime;
    private String recommendation;
    private String redirecturl;
    private String shortdescription;
    private String status;
    private String statusDesc;
    private String vulnerabilityActionRequired;
    private Integer vulnerabilityCode;
    private String vulnerabilityMessage;
    private String vulnerabilityResponse;
    private String vulnerabilityTitle;

    public md5(Integer num) {
        this.forceCloseTime = 5000;
        this.vulnerabilityCode = num;
    }

    public final String getBlockListApp() {
        return this.blockListApp;
    }

    public final boolean getClearDataFlag() {
        return this.clearDataFlag;
    }

    public final int getForceCloseTime() {
        return this.forceCloseTime;
    }

    public final String getRecommendation() {
        return this.recommendation;
    }

    public final String getRedirecturl() {
        return this.redirecturl;
    }

    public final String getShortdescription() {
        return this.shortdescription;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final String getVulnerabilityActionRequired() {
        return this.vulnerabilityActionRequired;
    }

    public final Integer getVulnerabilityCode() {
        return this.vulnerabilityCode;
    }

    public final String getVulnerabilityMessage() {
        return this.vulnerabilityMessage;
    }

    public final String getVulnerabilityResponse() {
        return this.vulnerabilityResponse;
    }

    public final String getVulnerabilityTitle() {
        return this.vulnerabilityTitle;
    }

    public final void setBlockListApp(String str) {
        this.blockListApp = str;
    }

    public final void setClearDataFlag(boolean z) {
        this.clearDataFlag = z;
    }

    public final void setForceCloseTime(int i) {
        this.forceCloseTime = i;
    }

    public final void setRecommendation(String str) {
        this.recommendation = str;
    }

    public final void setRedirecturl(String str) {
        this.redirecturl = str;
    }

    public final void setShortdescription(String str) {
        this.shortdescription = str;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public final void setStatusDesc(String str) {
        this.statusDesc = str;
    }

    public final void setVulnerabilityActionRequired(String str) {
        this.vulnerabilityActionRequired = str;
    }

    public final void setVulnerabilityCode(Integer num) {
        this.vulnerabilityCode = num;
    }

    public final void setVulnerabilityMessage(String str) {
        this.vulnerabilityMessage = str;
    }

    public final void setVulnerabilityResponse(String str) {
        this.vulnerabilityResponse = str;
    }

    public final void setVulnerabilityTitle(String str) {
        this.vulnerabilityTitle = str;
    }

    public md5(String str, String str2) {
        this.vulnerabilityCode = 0;
        this.forceCloseTime = 5000;
        this.status = str;
        this.statusDesc = str2;
    }

    public md5(int i, String str, String str2) {
        this.vulnerabilityCode = 0;
        this.forceCloseTime = 5000;
        this.vulnerabilityCode = Integer.valueOf(i);
        this.status = str;
        this.statusDesc = str2;
    }

    public md5(Integer num, String str, String str2, String str3, String str4) {
        this.forceCloseTime = 5000;
        this.vulnerabilityCode = num;
        this.vulnerabilityTitle = str;
        this.vulnerabilityResponse = str2;
        this.vulnerabilityMessage = str3;
        this.vulnerabilityActionRequired = str4;
    }

    public md5(Integer num, String str, String str2, String str3) {
        this.forceCloseTime = 5000;
        this.vulnerabilityCode = num;
        this.vulnerabilityResponse = str;
        this.vulnerabilityTitle = str2;
        this.statusDesc = str3;
    }

    public md5(Integer num, String str, String str2, String str3, String str4, String str5) {
        this.forceCloseTime = 5000;
        this.vulnerabilityCode = num;
        this.vulnerabilityTitle = str;
        this.vulnerabilityResponse = str2;
        this.vulnerabilityMessage = str3;
        this.vulnerabilityActionRequired = str4;
        this.blockListApp = str5;
    }

    public md5(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, boolean z) {
        this.vulnerabilityCode = num;
        this.vulnerabilityTitle = str;
        this.vulnerabilityResponse = str2;
        this.vulnerabilityMessage = str3;
        this.vulnerabilityActionRequired = str4;
        this.shortdescription = str5;
        this.recommendation = str6;
        this.redirecturl = str7;
        this.forceCloseTime = i;
        this.clearDataFlag = z;
    }

    public md5(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, boolean z) {
        this.vulnerabilityCode = num;
        this.vulnerabilityTitle = str;
        this.vulnerabilityResponse = str2;
        this.vulnerabilityMessage = str3;
        this.vulnerabilityActionRequired = str4;
        this.blockListApp = str5;
        this.shortdescription = str6;
        this.recommendation = str7;
        this.redirecturl = str8;
        this.forceCloseTime = i;
        this.clearDataFlag = z;
    }
}
