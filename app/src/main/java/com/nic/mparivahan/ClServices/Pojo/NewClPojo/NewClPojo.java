package com.nic.mparivahan.ClServices.Pojo.NewClPojo;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0019\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J7\u0010\u0012\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/nic/mparivahan/ClServices/Pojo/NewClPojo/NewClPojo;", "", "NewCLAcknowledgement", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/ClServices/Pojo/NewClPojo/NewCLAcknowledgement;", "Lkotlin/collections/ArrayList;", "status_code", "", "status_desc", "(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V", "getNewCLAcknowledgement", "()Ljava/util/ArrayList;", "getStatus_code", "()Ljava/lang/String;", "getStatus_desc", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class NewClPojo {
    private final ArrayList<NewCLAcknowledgement> NewCLAcknowledgement;
    private final String status_code;
    private final String status_desc;

    public NewClPojo(ArrayList<NewCLAcknowledgement> NewCLAcknowledgement, String status_code, String status_desc) {
        Intrinsics.checkNotNullParameter(NewCLAcknowledgement, "NewCLAcknowledgement");
        Intrinsics.checkNotNullParameter(status_code, "status_code");
        Intrinsics.checkNotNullParameter(status_desc, "status_desc");
        this.NewCLAcknowledgement = NewCLAcknowledgement;
        this.status_code = status_code;
        this.status_desc = status_desc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewClPojo copy$default(NewClPojo newClPojo, ArrayList arrayList, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = newClPojo.NewCLAcknowledgement;
        }
        if ((i & 2) != 0) {
            str = newClPojo.status_code;
        }
        if ((i & 4) != 0) {
            str2 = newClPojo.status_desc;
        }
        return newClPojo.copy(arrayList, str, str2);
    }

    public final ArrayList<NewCLAcknowledgement> component1() {
        return this.NewCLAcknowledgement;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus_code() {
        return this.status_code;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatus_desc() {
        return this.status_desc;
    }

    public final NewClPojo copy(ArrayList<NewCLAcknowledgement> NewCLAcknowledgement, String status_code, String status_desc) {
        Intrinsics.checkNotNullParameter(NewCLAcknowledgement, "NewCLAcknowledgement");
        Intrinsics.checkNotNullParameter(status_code, "status_code");
        Intrinsics.checkNotNullParameter(status_desc, "status_desc");
        return new NewClPojo(NewCLAcknowledgement, status_code, status_desc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewClPojo)) {
            return false;
        }
        NewClPojo newClPojo = (NewClPojo) other;
        return Intrinsics.areEqual(this.NewCLAcknowledgement, newClPojo.NewCLAcknowledgement) && Intrinsics.areEqual(this.status_code, newClPojo.status_code) && Intrinsics.areEqual(this.status_desc, newClPojo.status_desc);
    }

    public final ArrayList<NewCLAcknowledgement> getNewCLAcknowledgement() {
        return this.NewCLAcknowledgement;
    }

    public final String getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_desc() {
        return this.status_desc;
    }

    public int hashCode() {
        return (((this.NewCLAcknowledgement.hashCode() * 31) + this.status_code.hashCode()) * 31) + this.status_desc.hashCode();
    }

    public String toString() {
        return "NewClPojo(NewCLAcknowledgement=" + this.NewCLAcknowledgement + ", status_code=" + this.status_code + ", status_desc=" + this.status_desc + ')';
    }
}
