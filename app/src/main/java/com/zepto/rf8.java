package com.zepto;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class rf8 implements s03 {
    public final /* synthetic */ Activity a;

    public rf8(ug8 ug8Var, Activity activity) {
        this.a = activity;
    }

    @Override // com.zepto.s03
    public final void a(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        this.a.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
