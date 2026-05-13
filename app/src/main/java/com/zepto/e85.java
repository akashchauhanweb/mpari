package com.zepto;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class e85 {

    public static class a {
        public static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(e85 e85Var) {
            throw null;
        }

        public static Bundle c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    public static RemoteInput a(e85 e85Var) {
        return a.b(e85Var);
    }

    public static RemoteInput[] b(e85[] e85VarArr) {
        if (e85VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[e85VarArr.length];
        for (int i = 0; i < e85VarArr.length; i++) {
            e85 e85Var = e85VarArr[i];
            remoteInputArr[i] = a(null);
        }
        return remoteInputArr;
    }
}
