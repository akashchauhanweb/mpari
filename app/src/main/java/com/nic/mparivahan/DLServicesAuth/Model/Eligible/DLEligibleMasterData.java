package com.nic.mparivahan.DLServicesAuth.Model.Eligible;

import androidx.annotation.Keep;
import com.zepto.xy5;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0005¢\u0006\u0002\u0010\u0002¨\u0006\n"}, d2 = {"Lcom/nic/mparivahan/DLServicesAuth/Model/Eligible/DLEligibleMasterData;", "Ljava/io/Serializable;", "()V", "DLCOVList", "DlservicesValidationdto", "EligibleDLSerList", "LMV", "MCWG", "Result", "Root", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DLEligibleMasterData implements Serializable {

    @Keep
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/nic/mparivahan/DLServicesAuth/Model/Eligible/DLEligibleMasterData$DLCOVList;", "Ljava/io/Serializable;", "()V", "lMV", "Lcom/nic/mparivahan/DLServicesAuth/Model/Eligible/DLEligibleMasterData$LMV;", "getLMV", "()Lcom/nic/mparivahan/DLServicesAuth/Model/Eligible/DLEligibleMasterData$LMV;", "setLMV", "(Lcom/nic/mparivahan/DLServicesAuth/Model/Eligible/DLEligibleMasterData$LMV;)V", "mCWG", "Lcom/nic/mparivahan/DLServicesAuth/Model/Eligible/DLEligibleMasterData$MCWG;", "getMCWG", "()Lcom/nic/mparivahan/DLServicesAuth/Model/Eligible/DLEligibleMasterData$MCWG;", "setMCWG", "(Lcom/nic/mparivahan/DLServicesAuth/Model/Eligible/DLEligibleMasterData$MCWG;)V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DLCOVList implements Serializable {
        private LMV lMV;
        private MCWG mCWG;

        public final LMV getLMV() {
            return this.lMV;
        }

        public final MCWG getMCWG() {
            return this.mCWG;
        }

        public final void setLMV(LMV lmv) {
            this.lMV = lmv;
        }

        public final void setMCWG(MCWG mcwg) {
            this.mCWG = mcwg;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/nic/mparivahan/DLServicesAuth/Model/Eligible/DLEligibleMasterData$DlservicesValidationdto;", "Ljava/io/Serializable;", "()V", "Msg", "", "getMsg", "()Ljava/lang/String;", "setMsg", "(Ljava/lang/String;)V", "ReqStatus", "getReqStatus", "setReqStatus", "Result", "", "Lcom/nic/mparivahan/DLServicesAuth/Model/Eligible/DLEligibleMasterData$Result;", "getResult", "()Ljava/util/List;", "setResult", "(Ljava/util/List;)V", "status_code", "getStatus_code", "setStatus_code", "status_desc", "getStatus_desc", "setStatus_desc", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DlservicesValidationdto implements Serializable {
        private String Msg;
        private String ReqStatus;
        private List<Result> Result;
        private String status_code;
        private String status_desc;

        public final String getMsg() {
            return this.Msg;
        }

        public final String getReqStatus() {
            return this.ReqStatus;
        }

        public final List<Result> getResult() {
            return this.Result;
        }

        public final String getStatus_code() {
            return this.status_code;
        }

        public final String getStatus_desc() {
            return this.status_desc;
        }

        public final void setMsg(String str) {
            this.Msg = str;
        }

        public final void setReqStatus(String str) {
            this.ReqStatus = str;
        }

        public final void setResult(List<Result> list) {
            this.Result = list;
        }

        public final void setStatus_code(String str) {
            this.status_code = str;
        }

        public final void setStatus_desc(String str) {
            this.status_desc = str;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b \b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR \u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR \u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR \u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR \u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR \u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR \u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR \u0010!\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\b¨\u0006$"}, d2 = {"Lcom/nic/mparivahan/DLServicesAuth/Model/Eligible/DLEligibleMasterData$EligibleDLSerList;", "Ljava/io/Serializable;", "()V", "_513", "", "get_513", "()Ljava/lang/String;", "set_513", "(Ljava/lang/String;)V", "_514", "get_514", "set_514", "_515", "get_515", "set_515", "_516", "get_516", "set_516", "_523", "get_523", "set_523", "_524", "get_524", "set_524", "_525", "get_525", "set_525", "_526", "get_526", "set_526", "_537", "get_537", "set_537", "_548", "get_548", "set_548", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EligibleDLSerList implements Serializable {

        @xy5("513")
        private String _513;

        @xy5("514")
        private String _514;

        @xy5("515")
        private String _515;

        @xy5("516")
        private String _516;

        @xy5("523")
        private String _523;

        @xy5("524")
        private String _524;

        @xy5("525")
        private String _525;

        @xy5("526")
        private String _526;

        @xy5("537")
        private String _537;

        @xy5("548")
        private String _548;

        public final String get_513() {
            return this._513;
        }

        public final String get_514() {
            return this._514;
        }

        public final String get_515() {
            return this._515;
        }

        public final String get_516() {
            return this._516;
        }

        public final String get_523() {
            return this._523;
        }

        public final String get_524() {
            return this._524;
        }

        public final String get_525() {
            return this._525;
        }

        public final String get_526() {
            return this._526;
        }

        public final String get_537() {
            return this._537;
        }

        public final String get_548() {
            return this._548;
        }

        public final void set_513(String str) {
            this._513 = str;
        }

        public final void set_514(String str) {
            this._514 = str;
        }

        public final void set_515(String str) {
            this._515 = str;
        }

        public final void set_516(String str) {
            this._516 = str;
        }

        public final void set_523(String str) {
            this._523 = str;
        }

        public final void set_524(String str) {
            this._524 = str;
        }

        public final void set_525(String str) {
            this._525 = str;
        }

        public final void set_526(String str) {
            this._526 = str;
        }

        public final void set_537(String str) {
            this._537 = str;
        }

        public final void set_548(String str) {
            this._548 = str;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b \b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\b¨\u0006$"}, d2 = {"Lcom/nic/mparivahan/DLServicesAuth/Model/Eligible/DLEligibleMasterData$LMV;", "Ljava/io/Serializable;", "()V", "covIssueAuthCode", "", "getCovIssueAuthCode", "()Ljava/lang/String;", "setCovIssueAuthCode", "(Ljava/lang/String;)V", "covabbrv", "getCovabbrv", "setCovabbrv", "covdesc", "getCovdesc", "setCovdesc", "dcCovStatus", "getDcCovStatus", "setDcCovStatus", "dcCovcd", "getDcCovcd", "setDcCovcd", "dcIssRtocode", "getDcIssRtocode", "setDcIssRtocode", "dcIssuedt", "getDcIssuedt", "setDcIssuedt", "olaName", "getOlaName", "setOlaName", "psvBadgeElg", "getPsvBadgeElg", "setPsvBadgeElg", "vecatg", "getVecatg", "setVecatg", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LMV implements Serializable {
        private String covIssueAuthCode;
        private String covabbrv;
        private String covdesc;
        private String dcCovStatus;
        private String dcCovcd;
        private String dcIssRtocode;
        private String dcIssuedt;
        private String olaName;
        private String psvBadgeElg;
        private String vecatg;

        public final String getCovIssueAuthCode() {
            return this.covIssueAuthCode;
        }

        public final String getCovabbrv() {
            return this.covabbrv;
        }

        public final String getCovdesc() {
            return this.covdesc;
        }

        public final String getDcCovStatus() {
            return this.dcCovStatus;
        }

        public final String getDcCovcd() {
            return this.dcCovcd;
        }

        public final String getDcIssRtocode() {
            return this.dcIssRtocode;
        }

        public final String getDcIssuedt() {
            return this.dcIssuedt;
        }

        public final String getOlaName() {
            return this.olaName;
        }

        public final String getPsvBadgeElg() {
            return this.psvBadgeElg;
        }

        public final String getVecatg() {
            return this.vecatg;
        }

        public final void setCovIssueAuthCode(String str) {
            this.covIssueAuthCode = str;
        }

        public final void setCovabbrv(String str) {
            this.covabbrv = str;
        }

        public final void setCovdesc(String str) {
            this.covdesc = str;
        }

        public final void setDcCovStatus(String str) {
            this.dcCovStatus = str;
        }

        public final void setDcCovcd(String str) {
            this.dcCovcd = str;
        }

        public final void setDcIssRtocode(String str) {
            this.dcIssRtocode = str;
        }

        public final void setDcIssuedt(String str) {
            this.dcIssuedt = str;
        }

        public final void setOlaName(String str) {
            this.olaName = str;
        }

        public final void setPsvBadgeElg(String str) {
            this.psvBadgeElg = str;
        }

        public final void setVecatg(String str) {
            this.vecatg = str;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b \b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\b¨\u0006$"}, d2 = {"Lcom/nic/mparivahan/DLServicesAuth/Model/Eligible/DLEligibleMasterData$MCWG;", "Ljava/io/Serializable;", "()V", "covIssueAuthCode", "", "getCovIssueAuthCode", "()Ljava/lang/String;", "setCovIssueAuthCode", "(Ljava/lang/String;)V", "covabbrv", "getCovabbrv", "setCovabbrv", "covdesc", "getCovdesc", "setCovdesc", "dcCovStatus", "getDcCovStatus", "setDcCovStatus", "dcCovcd", "getDcCovcd", "setDcCovcd", "dcIssRtocode", "getDcIssRtocode", "setDcIssRtocode", "dcIssuedt", "getDcIssuedt", "setDcIssuedt", "olaName", "getOlaName", "setOlaName", "psvBadgeElg", "getPsvBadgeElg", "setPsvBadgeElg", "vecatg", "getVecatg", "setVecatg", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MCWG implements Serializable {
        private String covIssueAuthCode;
        private String covabbrv;
        private String covdesc;
        private String dcCovStatus;
        private String dcCovcd;
        private String dcIssRtocode;
        private String dcIssuedt;
        private String olaName;
        private String psvBadgeElg;
        private String vecatg;

        public final String getCovIssueAuthCode() {
            return this.covIssueAuthCode;
        }

        public final String getCovabbrv() {
            return this.covabbrv;
        }

        public final String getCovdesc() {
            return this.covdesc;
        }

        public final String getDcCovStatus() {
            return this.dcCovStatus;
        }

        public final String getDcCovcd() {
            return this.dcCovcd;
        }

        public final String getDcIssRtocode() {
            return this.dcIssRtocode;
        }

        public final String getDcIssuedt() {
            return this.dcIssuedt;
        }

        public final String getOlaName() {
            return this.olaName;
        }

        public final String getPsvBadgeElg() {
            return this.psvBadgeElg;
        }

        public final String getVecatg() {
            return this.vecatg;
        }

        public final void setCovIssueAuthCode(String str) {
            this.covIssueAuthCode = str;
        }

        public final void setCovabbrv(String str) {
            this.covabbrv = str;
        }

        public final void setCovdesc(String str) {
            this.covdesc = str;
        }

        public final void setDcCovStatus(String str) {
            this.dcCovStatus = str;
        }

        public final void setDcCovcd(String str) {
            this.dcCovcd = str;
        }

        public final void setDcIssRtocode(String str) {
            this.dcIssRtocode = str;
        }

        public final void setDcIssuedt(String str) {
            this.dcIssuedt = str;
        }

        public final void setOlaName(String str) {
            this.olaName = str;
        }

        public final void setPsvBadgeElg(String str) {
            this.psvBadgeElg = str;
        }

        public final void setVecatg(String str) {
            this.vecatg = str;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR\u001a\u0010'\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0018\"\u0004\b)\u0010\u001aR\u001c\u0010*\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001c\u0010-\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001c\u00100\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001c\u00103\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001c\u00106\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR\u001c\u00109\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR\u001c\u0010<\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR\u001c\u0010?\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0006\"\u0004\bA\u0010\bR\u001c\u0010B\u001a\u0004\u0018\u00010CX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001c\u0010H\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0006\"\u0004\bJ\u0010\bR\u001c\u0010K\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0006\"\u0004\bM\u0010\bR\u001c\u0010N\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0006\"\u0004\bP\u0010\bR\u001c\u0010Q\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u0006\"\u0004\bS\u0010\bR\u001c\u0010T\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0006\"\u0004\bV\u0010\bR\u001c\u0010W\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\u0006\"\u0004\bY\u0010\bR\u001a\u0010Z\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\u0018\"\u0004\b\\\u0010\u001aR\u001c\u0010]\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\u0006\"\u0004\b_\u0010\bR\u001c\u0010`\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010\u0006\"\u0004\bb\u0010\bR\u001c\u0010c\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010\u0006\"\u0004\be\u0010\bR\u001c\u0010f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010\u0006\"\u0004\bh\u0010\bR\u001c\u0010i\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010\u0006\"\u0004\bk\u0010\bR\u001c\u0010l\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010\u0006\"\u0004\bn\u0010\bR\u001c\u0010o\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010\u0006\"\u0004\bq\u0010\bR\u001c\u0010r\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010\u0006\"\u0004\bt\u0010\bR\u001c\u0010u\u001a\u0004\u0018\u00010vX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\u001a\u0010{\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b|\u0010\u0018\"\u0004\b}\u0010\u001aR\u001d\u0010~\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b\u007f\u0010\u0006\"\u0005\b\u0080\u0001\u0010\bR\u001f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u0010\u0006\"\u0005\b\u0083\u0001\u0010\bR\u001f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0001\u0010\u0006\"\u0005\b\u0086\u0001\u0010\b¨\u0006\u0087\u0001"}, d2 = {"Lcom/nic/mparivahan/DLServicesAuth/Model/Eligible/DLEligibleMasterData$Result;", "Ljava/io/Serializable;", "()V", "AllowIDPfromIndEmb", "", "getAllowIDPfromIndEmb", "()Ljava/lang/String;", "setAllowIDPfromIndEmb", "(Ljava/lang/String;)V", "apdNaturalName", "getApdNaturalName", "setApdNaturalName", "apdPermAdd1", "getApdPermAdd1", "setApdPermAdd1", "apdPermAdd2", "getApdPermAdd2", "setApdPermAdd2", "apdPermAdd3", "getApdPermAdd3", "setApdPermAdd3", "apdPermPin", "", "getApdPermPin", "()I", "setApdPermPin", "(I)V", "apdTempAdd1", "getApdTempAdd1", "setApdTempAdd1", "apdTempAdd2", "getApdTempAdd2", "setApdTempAdd2", "apdTempAdd3", "getApdTempAdd3", "setApdTempAdd3", "apdTempPin", "getApdTempPin", "setApdTempPin", "applEmpCatg", "getApplEmpCatg", "setApplEmpCatg", "applFirstName", "getApplFirstName", "setApplFirstName", "applFullName", "getApplFullName", "setApplFullName", "applLastName", "getApplLastName", "setApplLastName", "applQualName", "getApplQualName", "setApplQualName", "bioId", "getBioId", "setBioId", "biocitizen", "getBiocitizen", "setBiocitizen", "bioorgdonor", "getBioorgdonor", "setBioorgdonor", "bloodGroup", "getBloodGroup", "setBloodGroup", "dLCOVList", "Lcom/nic/mparivahan/DLServicesAuth/Model/Eligible/DLEligibleMasterData$DLCOVList;", "getDLCOVList", "()Lcom/nic/mparivahan/DLServicesAuth/Model/Eligible/DLEligibleMasterData$DLCOVList;", "setDLCOVList", "(Lcom/nic/mparivahan/DLServicesAuth/Model/Eligible/DLEligibleMasterData$DLCOVList;)V", "dlDispatchStatus", "getDlDispatchStatus", "setDlDispatchStatus", "dlEndorseAuth", "getDlEndorseAuth", "setDlEndorseAuth", "dlEndorsedt", "getDlEndorsedt", "setDlEndorsedt", "dlEndorsetime", "getDlEndorsetime", "setDlEndorsetime", "dlIssueauth", "getDlIssueauth", "setDlIssueauth", "dlIssuedt", "getDlIssuedt", "setDlIssuedt", "dlLatestTrcode", "getDlLatestTrcode", "setDlLatestTrcode", "dlNtValdfrDt", "getDlNtValdfrDt", "setDlNtValdfrDt", "dlNtValdtoDt", "getDlNtValdtoDt", "setDlNtValdtoDt", "dlPrintStatus", "getDlPrintStatus", "setDlPrintStatus", "dlRecGenesis", "getDlRecGenesis", "setDlRecGenesis", "dlRemarks", "getDlRemarks", "setDlRemarks", "dlSeqno", "getDlSeqno", "setDlSeqno", "dlStatus", "getDlStatus", "setDlStatus", "dlno", "getDlno", "setDlno", "eligibleDLSerList", "Lcom/nic/mparivahan/DLServicesAuth/Model/Eligible/DLEligibleMasterData$EligibleDLSerList;", "getEligibleDLSerList", "()Lcom/nic/mparivahan/DLServicesAuth/Model/Eligible/DLEligibleMasterData$EligibleDLSerList;", "setEligibleDLSerList", "(Lcom/nic/mparivahan/DLServicesAuth/Model/Eligible/DLEligibleMasterData$EligibleDLSerList;)V", "haz_issueinstt_code", "getHaz_issueinstt_code", "setHaz_issueinstt_code", "relFirstName", "getRelFirstName", "setRelFirstName", "relLastName", "getRelLastName", "setRelLastName", "relationType", "getRelationType", "setRelationType", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Result implements Serializable {
        private String AllowIDPfromIndEmb;
        private String apdNaturalName;
        private String apdPermAdd1;
        private String apdPermAdd2;
        private String apdPermAdd3;
        private int apdPermPin;
        private String apdTempAdd1;
        private String apdTempAdd2;
        private String apdTempAdd3;
        private int apdTempPin;
        private int applEmpCatg;
        private String applFirstName;
        private String applFullName;
        private String applLastName;
        private String applQualName;
        private String bioId;
        private String biocitizen;
        private String bioorgdonor;
        private String bloodGroup;
        private DLCOVList dLCOVList;
        private String dlDispatchStatus;
        private String dlEndorseAuth;
        private String dlEndorsedt;
        private String dlEndorsetime;
        private String dlIssueauth;
        private String dlIssuedt;
        private int dlLatestTrcode;
        private String dlNtValdfrDt;
        private String dlNtValdtoDt;
        private String dlPrintStatus;
        private String dlRecGenesis;
        private String dlRemarks;
        private String dlSeqno;
        private String dlStatus;
        private String dlno;
        private EligibleDLSerList eligibleDLSerList;
        private int haz_issueinstt_code;
        private String relFirstName;
        private String relLastName;
        private String relationType;

        public final String getAllowIDPfromIndEmb() {
            return this.AllowIDPfromIndEmb;
        }

        public final String getApdNaturalName() {
            return this.apdNaturalName;
        }

        public final String getApdPermAdd1() {
            return this.apdPermAdd1;
        }

        public final String getApdPermAdd2() {
            return this.apdPermAdd2;
        }

        public final String getApdPermAdd3() {
            return this.apdPermAdd3;
        }

        public final int getApdPermPin() {
            return this.apdPermPin;
        }

        public final String getApdTempAdd1() {
            return this.apdTempAdd1;
        }

        public final String getApdTempAdd2() {
            return this.apdTempAdd2;
        }

        public final String getApdTempAdd3() {
            return this.apdTempAdd3;
        }

        public final int getApdTempPin() {
            return this.apdTempPin;
        }

        public final int getApplEmpCatg() {
            return this.applEmpCatg;
        }

        public final String getApplFirstName() {
            return this.applFirstName;
        }

        public final String getApplFullName() {
            return this.applFullName;
        }

        public final String getApplLastName() {
            return this.applLastName;
        }

        public final String getApplQualName() {
            return this.applQualName;
        }

        public final String getBioId() {
            return this.bioId;
        }

        public final String getBiocitizen() {
            return this.biocitizen;
        }

        public final String getBioorgdonor() {
            return this.bioorgdonor;
        }

        public final String getBloodGroup() {
            return this.bloodGroup;
        }

        public final DLCOVList getDLCOVList() {
            return this.dLCOVList;
        }

        public final String getDlDispatchStatus() {
            return this.dlDispatchStatus;
        }

        public final String getDlEndorseAuth() {
            return this.dlEndorseAuth;
        }

        public final String getDlEndorsedt() {
            return this.dlEndorsedt;
        }

        public final String getDlEndorsetime() {
            return this.dlEndorsetime;
        }

        public final String getDlIssueauth() {
            return this.dlIssueauth;
        }

        public final String getDlIssuedt() {
            return this.dlIssuedt;
        }

        public final int getDlLatestTrcode() {
            return this.dlLatestTrcode;
        }

        public final String getDlNtValdfrDt() {
            return this.dlNtValdfrDt;
        }

        public final String getDlNtValdtoDt() {
            return this.dlNtValdtoDt;
        }

        public final String getDlPrintStatus() {
            return this.dlPrintStatus;
        }

        public final String getDlRecGenesis() {
            return this.dlRecGenesis;
        }

        public final String getDlRemarks() {
            return this.dlRemarks;
        }

        public final String getDlSeqno() {
            return this.dlSeqno;
        }

        public final String getDlStatus() {
            return this.dlStatus;
        }

        public final String getDlno() {
            return this.dlno;
        }

        public final EligibleDLSerList getEligibleDLSerList() {
            return this.eligibleDLSerList;
        }

        public final int getHaz_issueinstt_code() {
            return this.haz_issueinstt_code;
        }

        public final String getRelFirstName() {
            return this.relFirstName;
        }

        public final String getRelLastName() {
            return this.relLastName;
        }

        public final String getRelationType() {
            return this.relationType;
        }

        public final void setAllowIDPfromIndEmb(String str) {
            this.AllowIDPfromIndEmb = str;
        }

        public final void setApdNaturalName(String str) {
            this.apdNaturalName = str;
        }

        public final void setApdPermAdd1(String str) {
            this.apdPermAdd1 = str;
        }

        public final void setApdPermAdd2(String str) {
            this.apdPermAdd2 = str;
        }

        public final void setApdPermAdd3(String str) {
            this.apdPermAdd3 = str;
        }

        public final void setApdPermPin(int i) {
            this.apdPermPin = i;
        }

        public final void setApdTempAdd1(String str) {
            this.apdTempAdd1 = str;
        }

        public final void setApdTempAdd2(String str) {
            this.apdTempAdd2 = str;
        }

        public final void setApdTempAdd3(String str) {
            this.apdTempAdd3 = str;
        }

        public final void setApdTempPin(int i) {
            this.apdTempPin = i;
        }

        public final void setApplEmpCatg(int i) {
            this.applEmpCatg = i;
        }

        public final void setApplFirstName(String str) {
            this.applFirstName = str;
        }

        public final void setApplFullName(String str) {
            this.applFullName = str;
        }

        public final void setApplLastName(String str) {
            this.applLastName = str;
        }

        public final void setApplQualName(String str) {
            this.applQualName = str;
        }

        public final void setBioId(String str) {
            this.bioId = str;
        }

        public final void setBiocitizen(String str) {
            this.biocitizen = str;
        }

        public final void setBioorgdonor(String str) {
            this.bioorgdonor = str;
        }

        public final void setBloodGroup(String str) {
            this.bloodGroup = str;
        }

        public final void setDLCOVList(DLCOVList dLCOVList) {
            this.dLCOVList = dLCOVList;
        }

        public final void setDlDispatchStatus(String str) {
            this.dlDispatchStatus = str;
        }

        public final void setDlEndorseAuth(String str) {
            this.dlEndorseAuth = str;
        }

        public final void setDlEndorsedt(String str) {
            this.dlEndorsedt = str;
        }

        public final void setDlEndorsetime(String str) {
            this.dlEndorsetime = str;
        }

        public final void setDlIssueauth(String str) {
            this.dlIssueauth = str;
        }

        public final void setDlIssuedt(String str) {
            this.dlIssuedt = str;
        }

        public final void setDlLatestTrcode(int i) {
            this.dlLatestTrcode = i;
        }

        public final void setDlNtValdfrDt(String str) {
            this.dlNtValdfrDt = str;
        }

        public final void setDlNtValdtoDt(String str) {
            this.dlNtValdtoDt = str;
        }

        public final void setDlPrintStatus(String str) {
            this.dlPrintStatus = str;
        }

        public final void setDlRecGenesis(String str) {
            this.dlRecGenesis = str;
        }

        public final void setDlRemarks(String str) {
            this.dlRemarks = str;
        }

        public final void setDlSeqno(String str) {
            this.dlSeqno = str;
        }

        public final void setDlStatus(String str) {
            this.dlStatus = str;
        }

        public final void setDlno(String str) {
            this.dlno = str;
        }

        public final void setEligibleDLSerList(EligibleDLSerList eligibleDLSerList) {
            this.eligibleDLSerList = eligibleDLSerList;
        }

        public final void setHaz_issueinstt_code(int i) {
            this.haz_issueinstt_code = i;
        }

        public final void setRelFirstName(String str) {
            this.relFirstName = str;
        }

        public final void setRelLastName(String str) {
            this.relLastName = str;
        }

        public final void setRelationType(String str) {
            this.relationType = str;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/nic/mparivahan/DLServicesAuth/Model/Eligible/DLEligibleMasterData$Root;", "Ljava/io/Serializable;", "()V", "dlservicesValidationdto", "Lcom/nic/mparivahan/DLServicesAuth/Model/Eligible/DLEligibleMasterData$DlservicesValidationdto;", "getDlservicesValidationdto", "()Lcom/nic/mparivahan/DLServicesAuth/Model/Eligible/DLEligibleMasterData$DlservicesValidationdto;", "setDlservicesValidationdto", "(Lcom/nic/mparivahan/DLServicesAuth/Model/Eligible/DLEligibleMasterData$DlservicesValidationdto;)V", "param", "", "getParam", "()Ljava/lang/String;", "setParam", "(Ljava/lang/String;)V", "responseBody", "getResponseBody", "setResponseBody", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Root implements Serializable {
        private DlservicesValidationdto dlservicesValidationdto;
        private String param;
        private String responseBody;

        public final DlservicesValidationdto getDlservicesValidationdto() {
            return this.dlservicesValidationdto;
        }

        public final String getParam() {
            return this.param;
        }

        public final String getResponseBody() {
            return this.responseBody;
        }

        public final void setDlservicesValidationdto(DlservicesValidationdto dlservicesValidationdto) {
            this.dlservicesValidationdto = dlservicesValidationdto;
        }

        public final void setParam(String str) {
            this.param = str;
        }

        public final void setResponseBody(String str) {
            this.responseBody = str;
        }
    }
}
