package com.nic.mparivahan.dlservices.data.model.temp;

import android.net.Uri;
import androidx.annotation.Keep;
import com.zepto.xy5;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0006\"\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0006\"\u0004\b\u000f\u0010\nR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\nR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\nR\u001a\u0010\u0016\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\nR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\nR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\nR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\nR\u001c\u0010\"\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\nR\u001a\u0010%\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0006\"\u0004\b'\u0010\nR\u0016\u0010(\u001a\u00020\u00048\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0006R\u001a\u0010*\u001a\u00020+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u00020+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010,\"\u0004\b0\u0010.R\u001a\u00101\u001a\u00020+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.R\u001a\u00103\u001a\u00020+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010,\"\u0004\b4\u0010.R\u001a\u00105\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0006\"\u0004\b7\u0010\nR\u001a\u00108\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0006\"\u0004\b:\u0010\nR\u0016\u0010;\u001a\u00020\u00048\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\u0006R\u001c\u0010=\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0006\"\u0004\b?\u0010\nR\"\u0010@\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010AX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001c\u0010G\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u0006\"\u0004\bI\u0010\nR\u001c\u0010J\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u0006\"\u0004\bL\u0010\nR\u001c\u0010M\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u0006\"\u0004\bO\u0010\nR\u001c\u0010P\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\u0006\"\u0004\bR\u0010\nR\u001c\u0010S\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\u0006\"\u0004\bU\u0010\nR\u001c\u0010V\u001a\u0004\u0018\u00010WX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u001c\u0010\\\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010\u0006\"\u0004\b^\u0010\n¨\u0006_"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/temp/DocumentListItem;", "", "()V", "abbrv", "", "getAbbrv", "()Ljava/lang/String;", "application_no", "getApplication_no", "setApplication_no", "(Ljava/lang/String;)V", "code", "getCode", "contactNo", "getContactNo", "setContactNo", "docCode", "getDocCode", "setDocCode", "docName", "getDocName", "setDocName", "docNo", "getDocNo", "setDocNo", "docStatus", "getDocStatus", "setDocStatus", "docURL", "getDocURL", "setDocURL", "docseqNo", "getDocseqNo", "setDocseqNo", "fileNmae", "getFileNmae", "setFileNmae", "fileToUpload", "getFileToUpload", "setFileToUpload", "id", "getId", "isBrowseStatus", "", "()Z", "setBrowseStatus", "(Z)V", "isDocInsertedStatus", "setDocInsertedStatus", "isPutUpCase", "setPutUpCase", "isSelectdatestatus", "setSelectdatestatus", "issueAuthDesg", "getIssueAuthDesg", "setIssueAuthDesg", "issueDate", "getIssueDate", "setIssueDate", "name", "getName", "proofCode", "getProofCode", "setProofCode", "proofLists", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/dlservices/data/model/temp/ProofList;", "getProofLists", "()Ljava/util/ArrayList;", "setProofLists", "(Ljava/util/ArrayList;)V", "proofName", "getProofName", "setProofName", "remarks", "getRemarks", "setRemarks", "reuploaded", "getReuploaded", "setReuploaded", "stateCode", "getStateCode", "setStateCode", "transationCode", "getTransationCode", "setTransationCode", "uRI", "Landroid/net/Uri;", "getURI", "()Landroid/net/Uri;", "setURI", "(Landroid/net/Uri;)V", "verifyStatus", "getVerifyStatus", "setVerifyStatus", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DocumentListItem {
    private String application_no;
    private String contactNo;
    private String docCode;
    private String docName;
    private String docStatus;
    private String docURL;
    private String docseqNo;
    private String fileNmae;
    private boolean isBrowseStatus;
    private boolean isDocInsertedStatus;
    private boolean isPutUpCase;
    private boolean isSelectdatestatus;
    private String proofCode;
    private ArrayList<ProofList> proofLists;
    private String proofName;
    private String remarks;
    private String reuploaded;
    private String stateCode;
    private String transationCode;
    private Uri uRI;
    private String verifyStatus;

    @xy5("abbrv")
    private final String abbrv = "";

    @xy5("code")
    private final String code = "";

    @xy5("name")
    private final String name = "";

    @xy5("id")
    private final String id = "";
    private String docNo = "";
    private String issueDate = "";
    private String issueAuthDesg = "";
    private String fileToUpload = "";

    public final String getAbbrv() {
        return this.abbrv;
    }

    public final String getApplication_no() {
        return this.application_no;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getContactNo() {
        return this.contactNo;
    }

    public final String getDocCode() {
        return this.docCode;
    }

    public final String getDocName() {
        return this.docName;
    }

    public final String getDocNo() {
        return this.docNo;
    }

    public final String getDocStatus() {
        return this.docStatus;
    }

    public final String getDocURL() {
        return this.docURL;
    }

    public final String getDocseqNo() {
        return this.docseqNo;
    }

    public final String getFileNmae() {
        return this.fileNmae;
    }

    public final String getFileToUpload() {
        return this.fileToUpload;
    }

    public final String getId() {
        return this.id;
    }

    public final String getIssueAuthDesg() {
        return this.issueAuthDesg;
    }

    public final String getIssueDate() {
        return this.issueDate;
    }

    public final String getName() {
        return this.name;
    }

    public final String getProofCode() {
        return this.proofCode;
    }

    public final ArrayList<ProofList> getProofLists() {
        return this.proofLists;
    }

    public final String getProofName() {
        return this.proofName;
    }

    public final String getRemarks() {
        return this.remarks;
    }

    public final String getReuploaded() {
        return this.reuploaded;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public final String getTransationCode() {
        return this.transationCode;
    }

    public final Uri getURI() {
        return this.uRI;
    }

    public final String getVerifyStatus() {
        return this.verifyStatus;
    }

    /* JADX INFO: renamed from: isBrowseStatus, reason: from getter */
    public final boolean getIsBrowseStatus() {
        return this.isBrowseStatus;
    }

    /* JADX INFO: renamed from: isDocInsertedStatus, reason: from getter */
    public final boolean getIsDocInsertedStatus() {
        return this.isDocInsertedStatus;
    }

    /* JADX INFO: renamed from: isPutUpCase, reason: from getter */
    public final boolean getIsPutUpCase() {
        return this.isPutUpCase;
    }

    /* JADX INFO: renamed from: isSelectdatestatus, reason: from getter */
    public final boolean getIsSelectdatestatus() {
        return this.isSelectdatestatus;
    }

    public final void setApplication_no(String str) {
        this.application_no = str;
    }

    public final void setBrowseStatus(boolean z) {
        this.isBrowseStatus = z;
    }

    public final void setContactNo(String str) {
        this.contactNo = str;
    }

    public final void setDocCode(String str) {
        this.docCode = str;
    }

    public final void setDocInsertedStatus(boolean z) {
        this.isDocInsertedStatus = z;
    }

    public final void setDocName(String str) {
        this.docName = str;
    }

    public final void setDocNo(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.docNo = str;
    }

    public final void setDocStatus(String str) {
        this.docStatus = str;
    }

    public final void setDocURL(String str) {
        this.docURL = str;
    }

    public final void setDocseqNo(String str) {
        this.docseqNo = str;
    }

    public final void setFileNmae(String str) {
        this.fileNmae = str;
    }

    public final void setFileToUpload(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fileToUpload = str;
    }

    public final void setIssueAuthDesg(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.issueAuthDesg = str;
    }

    public final void setIssueDate(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.issueDate = str;
    }

    public final void setProofCode(String str) {
        this.proofCode = str;
    }

    public final void setProofLists(ArrayList<ProofList> arrayList) {
        this.proofLists = arrayList;
    }

    public final void setProofName(String str) {
        this.proofName = str;
    }

    public final void setPutUpCase(boolean z) {
        this.isPutUpCase = z;
    }

    public final void setRemarks(String str) {
        this.remarks = str;
    }

    public final void setReuploaded(String str) {
        this.reuploaded = str;
    }

    public final void setSelectdatestatus(boolean z) {
        this.isSelectdatestatus = z;
    }

    public final void setStateCode(String str) {
        this.stateCode = str;
    }

    public final void setTransationCode(String str) {
        this.transationCode = str;
    }

    public final void setURI(Uri uri) {
        this.uRI = uri;
    }

    public final void setVerifyStatus(String str) {
        this.verifyStatus = str;
    }
}
