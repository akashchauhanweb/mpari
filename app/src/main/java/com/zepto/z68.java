package com.zepto;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class z68 {
    public final String a;

    public z68(String str) {
        int iMyUid = Process.myUid();
        int iMyPid = Process.myPid();
        StringBuilder sb = new StringBuilder(39);
        sb.append("UID: [");
        sb.append(iMyUid);
        sb.append("]  PID: [");
        sb.append(iMyPid);
        sb.append("] ");
        String string = sb.toString();
        String strValueOf = String.valueOf(str);
        this.a = strValueOf.length() != 0 ? string.concat(strValueOf) : new String(string);
    }

    public static String f(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                String strValueOf = String.valueOf(str2);
                Log.e("PlayCore", strValueOf.length() != 0 ? "Unable to format ".concat(strValueOf) : new String("Unable to format "), e);
                String strJoin = TextUtils.join(", ", objArr);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(strJoin).length());
                sb.append(str2);
                sb.append(" [");
                sb.append(strJoin);
                sb.append("]");
                str2 = sb.toString();
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(" : ");
        sb2.append(str2);
        return sb2.toString();
    }

    public final int a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            return Log.d("PlayCore", f(this.a, str, objArr));
        }
        return 0;
    }

    public final int b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", f(this.a, str, objArr));
        }
        return 0;
    }

    public final int c(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", f(this.a, str, objArr), th);
        }
        return 0;
    }

    public final int d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", f(this.a, str, objArr));
        }
        return 0;
    }

    public final int e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", f(this.a, str, objArr));
        }
        return 0;
    }
}
