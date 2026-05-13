package com.zepto;

import android.app.Application;
import com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem;
import com.nic.mparivahan.dlservices.ui.dms.uploadmodel.DocUploadRequest;
import com.nic.mparivahan.dlservices.ui.dms.uploadmodel.UploadDocsBeanItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class uo1 {
    public Application a;
    public String b;
    public List c;
    public final oy3 d;

    public static final class a extends SuspendLambda implements Function2 {
        public int c;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((a) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return uo1.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                uo1 uo1Var = uo1.this;
                this.c = 1;
                if (uo1Var.b(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class b extends ContinuationImpl {
        public Object c;
        public Object e;
        public /* synthetic */ Object f;
        public int h;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f = obj;
            this.h |= IntCompanionObject.MIN_VALUE;
            return uo1.this.b(this);
        }
    }

    public uo1(Application mApp, String lastEndorseRTOCode, List docs) {
        Intrinsics.checkNotNullParameter(mApp, "mApp");
        Intrinsics.checkNotNullParameter(lastEndorseRTOCode, "lastEndorseRTOCode");
        Intrinsics.checkNotNullParameter(docs, "docs");
        this.a = mApp;
        this.b = lastEndorseRTOCode;
        this.c = docs;
        this.d = new oy3();
        f80.d(zz0.a(qk1.b()), null, null, new a(null), 3, null);
    }

    public final oy3 a() {
        return this.d;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(3:11|36|12)(2:14|15))(4:16|(4:18|38|19|(1:21)(1:22))|31|32)|23|34|24|31|32|(1:(1:37))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ab, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ac, code lost:
    
        r8.printStackTrace();
        r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.INSTANCE;
        r2 = r0.a;
        r8 = com.zepto.hz0.a;
        r1.a(r2, r8.A(), "manageDocs", r8.C(), r8.D());
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.uo1.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final DocUploadRequest c(List list) {
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DocumentListItem documentListItem = (DocumentListItem) it.next();
                UploadDocsBeanItem uploadDocsBeanItem = new UploadDocsBeanItem(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
                if ((documentListItem != null ? documentListItem.getURI() : null) != null) {
                    Boolean bool = Boolean.FALSE;
                    uploadDocsBeanItem.setForMultiple(bool);
                    uploadDocsBeanItem.setSavedInDMS(bool);
                    uploadDocsBeanItem.setRtoCode(this.b);
                    uploadDocsBeanItem.setTemp(Boolean.TRUE);
                    uploadDocsBeanItem.setApplNo(documentListItem.getApplication_no());
                    uploadDocsBeanItem.setDocCode(documentListItem.getId());
                    uploadDocsBeanItem.setStateCode(documentListItem.getStateCode());
                    uploadDocsBeanItem.setTransCode(documentListItem.getTransationCode());
                    uploadDocsBeanItem.setIssuerDesg(documentListItem.getIssueAuthDesg());
                    uploadDocsBeanItem.setIssueDate(documentListItem.getIssueDate());
                    uploadDocsBeanItem.setDocNo(documentListItem.getDocNo());
                    uploadDocsBeanItem.setProofCode(documentListItem.getProofCode());
                    if (documentListItem.getDocStatus() != null) {
                        uploadDocsBeanItem.setDocUpStatus(documentListItem.getDocStatus());
                    } else {
                        uploadDocsBeanItem.setDocUpStatus("I");
                    }
                    uploadDocsBeanItem.setFileName(documentListItem.getFileNmae());
                    uploadDocsBeanItem.setFolderName(documentListItem.getApplication_no());
                    uploadDocsBeanItem.setFileToUpload(documentListItem.getFileToUpload());
                    uploadDocsBeanItem.setContactNo(documentListItem.getContactNo());
                    arrayList.add(uploadDocsBeanItem);
                }
            }
        }
        return new DocUploadRequest(arrayList, "mobSARATHI", "657d1c758e2e95af0014e16f5109f933");
    }
}
