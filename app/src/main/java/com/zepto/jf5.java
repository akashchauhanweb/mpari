package com.zepto;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class jf5 {

    @xy5("channelDtls")
    private ni0 channelDtls;

    @xy5("isSafetyNetDone")
    private Boolean isSafetyNetDone;

    @xy5("lastRuleModify")
    private String lastRuleModify;

    @xy5("ruleList")
    private List<if5> ruleList;

    @xy5("skipMessage")
    private boolean skipMessage;

    @xy5("status")
    private String status;

    @xy5("statusDesc")
    private String statusDesc;

    public jf5() {
        this(null, false, null, null, null, null, null, 127, null);
    }

    public final ni0 getChannelDtls() {
        return this.channelDtls;
    }

    public final String getLastRuleModify() {
        return this.lastRuleModify;
    }

    public final List<if5> getRuleList() {
        return this.ruleList;
    }

    public final boolean getSkipMessage() {
        return this.skipMessage;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final Boolean isSafetyNetDone() {
        return this.isSafetyNetDone;
    }

    public final void setChannelDtls(ni0 ni0Var) {
        this.channelDtls = ni0Var;
    }

    public final void setLastRuleModify(String str) {
        this.lastRuleModify = str;
    }

    public final void setRuleList(List<if5> list) {
        this.ruleList = list;
    }

    public final void setSafetyNetDone(Boolean bool) {
        this.isSafetyNetDone = bool;
    }

    public final void setSkipMessage(boolean z) {
        this.skipMessage = z;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public final void setStatusDesc(String str) {
        this.statusDesc = str;
    }

    public jf5(Boolean bool, boolean z, List<if5> list, String str, String str2, String str3, ni0 ni0Var) {
        this.isSafetyNetDone = bool;
        this.skipMessage = z;
        this.ruleList = list;
        this.status = str;
        this.statusDesc = str2;
        this.lastRuleModify = str3;
        this.channelDtls = ni0Var;
    }

    public /* synthetic */ jf5(Boolean bool, boolean z, List list, String str, String str2, String str3, ni0 ni0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) == 0 ? ni0Var : null);
    }
}
