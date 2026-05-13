package com.zepto;

import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class wv4 {
    public static String a;
    public static int b;

    public static String a() throws Throwable {
        BufferedReader bufferedReader;
        String str;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads;
        if (a == null) {
            int iMyPid = b;
            if (iMyPid == 0) {
                iMyPid = Process.myPid();
                b = iMyPid;
            }
            String strTrim = null;
            strTrim = null;
            strTrim = null;
            BufferedReader bufferedReader2 = null;
            if (iMyPid > 0) {
                try {
                    str = "/proc/" + iMyPid + "/cmdline";
                    threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                } catch (IOException unused) {
                    bufferedReader = null;
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    bufferedReader = new BufferedReader(new FileReader(str));
                    try {
                        String line = bufferedReader.readLine();
                        iu4.i(line);
                        strTrim = line.trim();
                    } catch (IOException unused2) {
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader2 = bufferedReader;
                        uw2.a(bufferedReader2);
                        throw th;
                    }
                    uw2.a(bufferedReader);
                } finally {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                }
            }
            a = strTrim;
        }
        return a;
    }
}
