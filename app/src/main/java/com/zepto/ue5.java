package com.zepto;

import android.content.Context;
import android.util.Log;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class ue5 {
    public static final a a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            pe5 pe5Var = new pe5(context);
            boolean zIsRooted = pe5Var.isRooted();
            boolean zDetectRootManagementApps = pe5Var.detectRootManagementApps();
            boolean zCheckForSuBinary = pe5Var.checkForSuBinary();
            boolean zDetectPotentiallyDangerousApps = pe5Var.detectPotentiallyDangerousApps();
            pe5Var.checkForNativeLibraryReadAccess();
            boolean zDetectRootCloakingApps = pe5Var.detectRootCloakingApps();
            boolean zCheckForDangerousProps = pe5Var.checkForDangerousProps();
            boolean zCheckForRWPaths = pe5Var.checkForRWPaths();
            boolean zCheckForBusyBoxBinary = pe5Var.checkForBusyBoxBinary();
            Log.e("isRooted", String.valueOf(zIsRooted));
            Log.e("hasSuBinary", String.valueOf(zDetectRootManagementApps));
            Log.e("hasRootManagementApps", String.valueOf(zCheckForSuBinary));
            Log.e("hasDangerousApps", String.valueOf(zDetectPotentiallyDangerousApps));
            Log.e("hasRootNativeBinary", String.valueOf(zDetectRootCloakingApps));
            Log.e("hasDangerousProps", String.valueOf(zCheckForDangerousProps));
            Log.e("hasRWPaths", String.valueOf(zCheckForRWPaths));
            Log.e("hasBusyBoxBinary", String.valueOf(zCheckForBusyBoxBinary));
            return zIsRooted || zDetectRootManagementApps || zCheckForSuBinary || zDetectPotentiallyDangerousApps || zDetectRootCloakingApps || zCheckForDangerousProps || zCheckForRWPaths || zCheckForBusyBoxBinary;
        }
    }
}
