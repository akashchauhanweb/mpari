package com.zepto;

import ai.protectt.app.security.main.scan.ScanCore;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zepto.jt;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class nq extends RecyclerView.h {
    public final String d;
    public final md5 e;
    public final int f;
    public ArrayList g;

    public static final class a extends RecyclerView.d0 {
        public final TextView u;
        public final ImageView v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(Q("item_text_view"));
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "itemView.findViewById(getViewID(\"item_text_view\"))");
            this.u = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(Q("b_iv_image"));
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "itemView.findViewById(getViewID(\"b_iv_image\"))");
            this.v = (ImageView) viewFindViewById2;
        }

        public final ImageView O() {
            return this.v;
        }

        public final TextView P() {
            return this.u;
        }

        public final int Q(String str) {
            jt.a aVar = jt.c;
            return aVar.C().getResources().getIdentifier(str, "id", aVar.C().getPackageName());
        }
    }

    public nq(md5 rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        this.d = "AppBlackListingCustomAdapter";
        this.e = rule;
        jt.a aVar = jt.c;
        this.f = aVar.C().getResources().getIdentifier("app_list_alert_item_view", "layout", aVar.C().getPackageName());
        this.g = new ArrayList();
    }

    public static final void F(tf3 detailsOfApp, nq this$0, View view) {
        String appPackageName;
        Intrinsics.checkNotNullParameter(detailsOfApp, "$detailsOfApp");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String typeOfPermission = detailsOfApp.getTypeOfPermission();
        Intrinsics.checkNotNull(typeOfPermission);
        if (Intrinsics.areEqual(typeOfPermission, "isAnyInstalledAppHaveAccessibilityPermission")) {
            if (ScanCore.a.U0()) {
                return;
            }
            Intent intent = new Intent("android.settings.ACCESSIBILITY_SETTINGS");
            String appPackageName2 = detailsOfApp.getAppPackageName();
            Intrinsics.checkNotNull(appPackageName2);
            this$0.B(intent, appPackageName2);
            return;
        }
        String typeOfPermission2 = detailsOfApp.getTypeOfPermission();
        Intrinsics.checkNotNull(typeOfPermission2);
        if (Intrinsics.areEqual(typeOfPermission2, "AppBlockListing")) {
            String appPackageName3 = detailsOfApp.getAppPackageName();
            if (appPackageName3 == null) {
                return;
            }
            this$0.H(jt.c.C(), appPackageName3);
            return;
        }
        String typeOfPermission3 = detailsOfApp.getTypeOfPermission();
        Intrinsics.checkNotNull(typeOfPermission3);
        if (Intrinsics.areEqual(typeOfPermission3, "detectScreenMirroring")) {
            String appPackageName4 = detailsOfApp.getAppPackageName();
            if (appPackageName4 == null) {
                return;
            }
            this$0.H(jt.c.C(), appPackageName4);
            return;
        }
        String typeOfPermission4 = detailsOfApp.getTypeOfPermission();
        Intrinsics.checkNotNull(typeOfPermission4);
        if (Intrinsics.areEqual(typeOfPermission4, "isAdminPermissionEnable")) {
            if (ScanCore.a.U0()) {
                return;
            }
            Intent component = new Intent().setComponent(new ComponentName("com.android.settings", "com.android.settings.DeviceAdminSettings"));
            Intrinsics.checkNotNullExpressionValue(component, "Intent().setComponent(\n …                        )");
            String appPackageName5 = detailsOfApp.getAppPackageName();
            Intrinsics.checkNotNull(appPackageName5);
            this$0.B(component, appPackageName5);
            return;
        }
        String typeOfPermission5 = detailsOfApp.getTypeOfPermission();
        Intrinsics.checkNotNull(typeOfPermission5);
        if (Intrinsics.areEqual(typeOfPermission5, "isHookingAppInstalled")) {
            String appPackageName6 = detailsOfApp.getAppPackageName();
            if (appPackageName6 == null) {
                return;
            }
            this$0.H(jt.c.C(), appPackageName6);
            return;
        }
        String typeOfPermission6 = detailsOfApp.getTypeOfPermission();
        Intrinsics.checkNotNull(typeOfPermission6);
        if (!Intrinsics.areEqual(typeOfPermission6, "detectRootManagementApps") || (appPackageName = detailsOfApp.getAppPackageName()) == null) {
            return;
        }
        this$0.H(jt.c.C(), appPackageName);
    }

    public final void B(Intent intent, String str) {
        try {
            jt.a aVar = jt.c;
            Activity activityR = aVar.r();
            Intrinsics.checkNotNull(activityR);
            if (intent.resolveActivity(activityR.getPackageManager()) == null) {
                nn3.a.f("CustomAdapter", "No Activity to handle Intent action");
                H(aVar.C(), str);
            } else {
                Activity activityR2 = aVar.r();
                Intrinsics.checkNotNull(activityR2);
                activityR2.startActivity(intent);
            }
        } catch (Exception e) {
            nn3.a.b("CustomAdapter", e.toString(), e);
        }
    }

    public final ArrayList C() {
        return this.g;
    }

    public final tf3 D(Context context, String str, md5 md5Var) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 128);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            PackageManager packageManager = context.getPackageManager();
            Intrinsics.checkNotNull(packageManager);
            String string = applicationInfo.loadLabel(packageManager).toString();
            Drawable applicationIcon = context.getPackageManager().getApplicationIcon(packageInfo.packageName);
            Intrinsics.checkNotNullExpressionValue(applicationIcon, "appContext.packageManage…(packageInfo.packageName)");
            if (string.length() == 0) {
                this.g.remove(str);
                j();
            }
            tf3 tf3Var = new tf3();
            tf3Var.setAppIName(string);
            tf3Var.setAppIcon(applicationIcon);
            tf3Var.setAppPackageName(packageInfo.packageName);
            Integer vulnerabilityCode = md5Var.getVulnerabilityCode();
            if (vulnerabilityCode != null && vulnerabilityCode.intValue() == 215) {
                tf3Var.setTypeOfPermission("AppBlockListing");
            } else if (vulnerabilityCode != null && vulnerabilityCode.intValue() == 12) {
                tf3Var.setTypeOfPermission("detectScreenMirroring");
            } else if (vulnerabilityCode != null && vulnerabilityCode.intValue() == 44) {
                tf3Var.setTypeOfPermission("isAnyInstalledAppHaveAccessibilityPermission");
            } else if (vulnerabilityCode != null && vulnerabilityCode.intValue() == 35) {
                tf3Var.setTypeOfPermission("isAdminPermissionEnable");
            } else if (vulnerabilityCode != null && vulnerabilityCode.intValue() == 6) {
                tf3Var.setTypeOfPermission("isHookingAppInstalled");
            } else if (vulnerabilityCode != null && vulnerabilityCode.intValue() == 226) {
                tf3Var.setTypeOfPermission("detectRootManagementApps");
            }
            return tf3Var;
        } catch (PackageManager.NameNotFoundException unused) {
            nn3.c(nn3.a, this.d, "Package not found.", null, 4, null);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060 A[Catch: Exception -> 0x0056, TryCatch #0 {Exception -> 0x0056, blocks: (B:3:0x0005, B:6:0x0021, B:8:0x0046, B:16:0x0068, B:13:0x0058, B:15:0x0060), top: B:20:0x0005 }] */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void p(com.zepto.nq.a r3, int r4) {
        /*
            r2 = this;
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            com.zepto.jt$a r0 = com.zepto.jt.c     // Catch: java.lang.Exception -> L56
            android.content.Context r0 = r0.C()     // Catch: java.lang.Exception -> L56
            java.util.ArrayList r1 = r2.g     // Catch: java.lang.Exception -> L56
            java.lang.Object r4 = r1.get(r4)     // Catch: java.lang.Exception -> L56
            java.lang.String r1 = "data[position]"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)     // Catch: java.lang.Exception -> L56
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L56
            com.zepto.md5 r1 = r2.e     // Catch: java.lang.Exception -> L56
            com.zepto.tf3 r4 = r2.D(r0, r4, r1)     // Catch: java.lang.Exception -> L56
            if (r4 != 0) goto L21
            return
        L21:
            android.widget.TextView r0 = r3.P()     // Catch: java.lang.Exception -> L56
            java.lang.String r1 = r4.getAppIName()     // Catch: java.lang.Exception -> L56
            r0.setText(r1)     // Catch: java.lang.Exception -> L56
            android.widget.ImageView r0 = r3.O()     // Catch: java.lang.Exception -> L56
            android.graphics.drawable.Drawable r1 = r4.getAppIcon()     // Catch: java.lang.Exception -> L56
            r0.setImageDrawable(r1)     // Catch: java.lang.Exception -> L56
            java.lang.String r0 = r4.getTypeOfPermission()     // Catch: java.lang.Exception -> L56
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch: java.lang.Exception -> L56
            java.lang.String r1 = "isAnyInstalledAppHaveAccessibilityPermission"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)     // Catch: java.lang.Exception -> L56
            if (r0 != 0) goto L58
            java.lang.String r0 = r4.getTypeOfPermission()     // Catch: java.lang.Exception -> L56
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch: java.lang.Exception -> L56
            java.lang.String r1 = "isAdminPermissionEnable"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)     // Catch: java.lang.Exception -> L56
            if (r0 == 0) goto L68
            goto L58
        L56:
            r3 = move-exception
            goto L73
        L58:
            ai.protectt.app.security.main.scan.ScanCore r0 = ai.protectt.app.security.main.scan.ScanCore.a     // Catch: java.lang.Exception -> L56
            boolean r0 = r0.U0()     // Catch: java.lang.Exception -> L56
            if (r0 == 0) goto L68
            android.widget.TextView r0 = r3.P()     // Catch: java.lang.Exception -> L56
            r1 = 0
            r0.setCompoundDrawablesWithIntrinsicBounds(r1, r1, r1, r1)     // Catch: java.lang.Exception -> L56
        L68:
            android.view.View r3 = r3.a     // Catch: java.lang.Exception -> L56
            com.zepto.mq r0 = new com.zepto.mq     // Catch: java.lang.Exception -> L56
            r0.<init>()     // Catch: java.lang.Exception -> L56
            r3.setOnClickListener(r0)     // Catch: java.lang.Exception -> L56
            goto L7e
        L73:
            com.zepto.nn3 r4 = com.zepto.nn3.a
            java.lang.String r0 = "CustomAdapter"
            java.lang.String r1 = r3.toString()
            r4.b(r0, r1, r3)
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.nq.p(com.zepto.nq$a, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(this.f, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "from(parent.context).inf…wLayoutId, parent, false)");
        return new a(viewInflate);
    }

    public final void H(Context context, String packageName) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Activity activityR = jt.c.r();
        Intrinsics.checkNotNull(activityR);
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", packageName, null));
        activityR.startActivity(intent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.g.size();
    }
}
