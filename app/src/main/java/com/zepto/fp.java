package com.zepto;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class fp {
    public static final Map b;
    public static final fp c = new fp();
    public static final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = yf4.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = yf4.class.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = qr2.class.getName();
        Intrinsics.checkNotNullExpressionValue(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = cd6.class.getName();
        Intrinsics.checkNotNullExpressionValue(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        b = MapsKt__MapsKt.toMap(linkedHashMap);
    }

    public final void a(String loggerName, int i, String message, Throwable th) {
        int iMin;
        Intrinsics.checkNotNullParameter(loggerName, "loggerName");
        Intrinsics.checkNotNullParameter(message, "message");
        String strD = d(loggerName);
        if (Log.isLoggable(strD, i)) {
            if (th != null) {
                message = message + "\n" + Log.getStackTraceString(th);
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) message, '\n', i2, false, 4, (Object) null);
                if (iIndexOf$default == -1) {
                    iIndexOf$default = length;
                }
                while (true) {
                    iMin = Math.min(iIndexOf$default, i2 + 4000);
                    String strSubstring = message.substring(i2, iMin);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Log.println(i, strD, strSubstring);
                    if (iMin >= iIndexOf$default) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }
    }

    public final void b() {
        for (Map.Entry entry : b.entrySet()) {
            c((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public final void c(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (a.add(logger)) {
            Intrinsics.checkNotNullExpressionValue(logger, "logger");
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(gp.a);
        }
    }

    public final String d(String str) {
        String str2 = (String) b.get(str);
        return str2 != null ? str2 : StringsKt___StringsKt.take(str, 23);
    }
}
