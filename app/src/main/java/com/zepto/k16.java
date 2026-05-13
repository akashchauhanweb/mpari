package com.zepto;

import ai.protectt.app.security.main.scan.ScanAlerts;
import ai.protectt.app.security.main.scan.ScanUtils;
import android.app.ActivityManager;
import android.content.Context;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class k16 {
    public static final k16 a = new k16();
    public static final String b = "Shell";

    public final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        ActivityManager activityManager = (ActivityManager) (applicationContext == null ? null : applicationContext.getSystemService("activity"));
        Intrinsics.checkNotNull(activityManager);
        activityManager.clearApplicationUserData();
        throw new RuntimeException(StringsKt___StringsKt.reversed((CharSequence) "snoitpecxEdiknLnU").toString());
    }

    public final String b(String command, boolean z) {
        Process processExec;
        Intrinsics.checkNotNullParameter(command, "command");
        StringBuffer stringBuffer = new StringBuffer();
        try {
            if (z) {
                processExec = Runtime.getRuntime().exec(new String[]{"/bin/sh", "-c", command});
                Intrinsics.checkNotNullExpressionValue(processExec, "getRuntime().exec(cmd)");
            } else {
                processExec = Runtime.getRuntime().exec(command);
                Intrinsics.checkNotNullExpressionValue(processExec, "getRuntime().exec(command)");
            }
            int iWaitFor = processExec.waitFor();
            if (iWaitFor != 0) {
                nn3.c(nn3.a, b, Intrinsics.stringPlus("Command execution failed with exit code: ", Integer.valueOf(iWaitFor)), null, 4, null);
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()), 128);
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    String string = stringBuffer.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "output.toString()");
                    return string;
                }
                Appendable appendableAppend = stringBuffer.append((CharSequence) line);
                Intrinsics.checkNotNullExpressionValue(appendableAppend, "append(value)");
                Appendable appendableAppend2 = appendableAppend.append('\n');
                Intrinsics.checkNotNullExpressionValue(appendableAppend2, "append('\\n')");
                appendableAppend2.append("\n");
            }
        } catch (IOException e) {
            nn3.a.f(b, Intrinsics.stringPlus("Exception : ", e.getLocalizedMessage()));
            StackTraceElement[] stackTrace = e.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "e.stackTrace");
            int length = stackTrace.length;
            int i = 0;
            while (i < length) {
                StackTraceElement stackTraceElement = stackTrace[i];
                i++;
                String className = stackTraceElement.getClassName();
                Intrinsics.checkNotNullExpressionValue(className, "stackTraceElement.className");
                if (!StringsKt__StringsKt.contains$default((CharSequence) className, (CharSequence) "com.devadvance.rootcloak2.RootCloak$13", false, 2, (Object) null)) {
                    String className2 = stackTraceElement.getClassName();
                    Intrinsics.checkNotNullExpressionValue(className2, "stackTraceElement.className");
                    if (!StringsKt__StringsKt.contains((CharSequence) className2, (CharSequence) "RootCloak", true)) {
                        String className3 = stackTraceElement.getClassName();
                        Intrinsics.checkNotNullExpressionValue(className3, "stackTraceElement.className");
                        if (!StringsKt__StringsKt.contains((CharSequence) className3, (CharSequence) "de.robv.android.xposed.XposedBridge", true)) {
                            String className4 = stackTraceElement.getClassName();
                            Intrinsics.checkNotNullExpressionValue(className4, "stackTraceElement.className");
                            if (!StringsKt__StringsKt.contains((CharSequence) className4, (CharSequence) "xposed", true)) {
                                String className5 = stackTraceElement.getClassName();
                                Intrinsics.checkNotNullExpressionValue(className5, "stackTraceElement.className");
                                if (StringsKt__StringsKt.contains((CharSequence) className5, (CharSequence) "LSPHooker", true)) {
                                }
                            }
                        }
                    }
                }
                ScanAlerts scanAlertsL = jt.c.L();
                Intrinsics.checkNotNull(scanAlertsL);
                if5 if5VarQ = scanAlertsL.Q(47);
                if (if5VarQ != null) {
                    ScanUtils.a.b0(if5VarQ, "RootCloak&&LSPHooker&&xposed");
                }
            }
            return String.valueOf(e.getMessage());
        } catch (Exception e2) {
            nn3.a.f(b, Intrinsics.stringPlus("Exception2: ", e2.getLocalizedMessage()));
            return String.valueOf(e2.getMessage());
        }
    }

    public final String c(String command, boolean z) {
        Process processExec;
        Intrinsics.checkNotNullParameter(command, "command");
        StringBuffer stringBuffer = new StringBuffer();
        try {
            if (z) {
                processExec = Runtime.getRuntime().exec(new String[]{"/bin/sh", "-c", command});
                Intrinsics.checkNotNullExpressionValue(processExec, "getRuntime().exec(cmd)");
            } else {
                processExec = Runtime.getRuntime().exec(command);
                Intrinsics.checkNotNullExpressionValue(processExec, "getRuntime().exec(command)");
            }
            int iWaitFor = processExec.waitFor();
            if (iWaitFor == 0) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()), 128);
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    stringBuffer.append(line);
                    stringBuffer.append("\n");
                }
            } else {
                nn3.a.f("executorV2", Intrinsics.stringPlus("Process failed with exit code ", Integer.valueOf(iWaitFor)));
            }
        } catch (IOException e) {
            nn3.a.f(b, Intrinsics.stringPlus("", e));
        } catch (Exception e2) {
            nn3.a.f(b, Intrinsics.stringPlus("", e2));
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "output.toString()");
        if (string.length() <= 0) {
            return "";
        }
        nn3.a.f("V2ShellExecutor", string);
        return string;
    }
}
