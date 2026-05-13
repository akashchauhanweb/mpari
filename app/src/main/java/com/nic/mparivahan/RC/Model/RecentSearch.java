package com.nic.mparivahan.RC.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/nic/mparivahan/RC/Model/RecentSearch;", "", "()V", "driverImage", "", "getDriverImage", "()Ljava/lang/String;", "setDriverImage", "(Ljava/lang/String;)V", "searchNumber", "getSearchNumber", "setSearchNumber", "searchTimeStamp", "getSearchTimeStamp", "setSearchTimeStamp", "searchType", "getSearchType", "setSearchType", "searchUserName", "getSearchUserName", "setSearchUserName", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RecentSearch {
    private String driverImage;
    private String searchNumber;
    private String searchTimeStamp;
    private String searchType;
    private String searchUserName;

    public final String getDriverImage() {
        return this.driverImage;
    }

    public final String getSearchNumber() {
        return this.searchNumber;
    }

    public final String getSearchTimeStamp() {
        return this.searchTimeStamp;
    }

    public final String getSearchType() {
        return this.searchType;
    }

    public final String getSearchUserName() {
        return this.searchUserName;
    }

    public final void setDriverImage(String str) {
        this.driverImage = str;
    }

    public final void setSearchNumber(String str) {
        this.searchNumber = str;
    }

    public final void setSearchTimeStamp(String str) {
        this.searchTimeStamp = str;
    }

    public final void setSearchType(String str) {
        this.searchType = str;
    }

    public final void setSearchUserName(String str) {
        this.searchUserName = str;
    }
}
