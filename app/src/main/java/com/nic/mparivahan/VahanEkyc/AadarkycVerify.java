package com.nic.mparivahan.VahanEkyc;

import androidx.annotation.Keep;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/nic/mparivahan/VahanEkyc/AadarkycVerify;", "", "()V", "DoAadhaarResponse", "Response", "dOEkyc", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AadarkycVerify {

    @Keep
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/nic/mparivahan/VahanEkyc/AadarkycVerify$DoAadhaarResponse;", "", "()V", "aadhaarNo", "", "getAadhaarNo", "()Ljava/lang/String;", "setAadhaarNo", "(Ljava/lang/String;)V", "dOAuthOTP", "Lcom/nic/mparivahan/VahanEkyc/AadarkycVerify$dOEkyc;", "getDOAuthOTP", "()Lcom/nic/mparivahan/VahanEkyc/AadarkycVerify$dOEkyc;", "setDOAuthOTP", "(Lcom/nic/mparivahan/VahanEkyc/AadarkycVerify$dOEkyc;)V", "reason", "getReason", "setReason", "status", "getStatus", "setStatus", "txnNo", "getTxnNo", "setTxnNo", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DoAadhaarResponse {
        private String aadhaarNo;
        private dOEkyc dOAuthOTP;
        private String reason;
        private String status;
        private String txnNo;

        public final String getAadhaarNo() {
            return this.aadhaarNo;
        }

        public final dOEkyc getDOAuthOTP() {
            return this.dOAuthOTP;
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

        public final void setAadhaarNo(String str) {
            this.aadhaarNo = str;
        }

        public final void setDOAuthOTP(dOEkyc doekyc) {
            this.dOAuthOTP = doekyc;
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
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/nic/mparivahan/VahanEkyc/AadarkycVerify$Response;", "", "()V", "doAadhaarResponse", "Lcom/nic/mparivahan/VahanEkyc/AadarkycVerify$DoAadhaarResponse;", "getDoAadhaarResponse", "()Lcom/nic/mparivahan/VahanEkyc/AadarkycVerify$DoAadhaarResponse;", "setDoAadhaarResponse", "(Lcom/nic/mparivahan/VahanEkyc/AadarkycVerify$DoAadhaarResponse;)V", "responseBody", "", "getResponseBody", "()Ljava/lang/String;", "setResponseBody", "(Ljava/lang/String;)V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    @Keep
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/nic/mparivahan/VahanEkyc/AadarkycVerify$dOEkyc;", "", "()V", "last_four_mobile", "", "getLast_four_mobile", "()Ljava/lang/String;", "setLast_four_mobile", "(Ljava/lang/String;)V", "mobileverify", "", "getMobileverify", "()Ljava/lang/Boolean;", "setMobileverify", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "status", "getStatus", "setStatus", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class dOEkyc {
        private String last_four_mobile;
        private Boolean mobileverify = Boolean.FALSE;
        private String status;

        public final String getLast_four_mobile() {
            return this.last_four_mobile;
        }

        public final Boolean getMobileverify() {
            return this.mobileverify;
        }

        public final String getStatus() {
            return this.status;
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
}
