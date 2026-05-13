package com.zepto;

import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.telephony.TelephonyManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes.dex */
public abstract class s12 {
    public static int a = -1;
    public static String[] b = {"fstab.nox", "init.nox.rc", "ueventd.nox.rc"};
    public static String[] c = {"/dev/socket/genyd", "/dev/socket/baseband_genyd"};
    public static String[] d = {"/dev/socket/qemud", "/dev/qemu_pipe"};
    public static String[] e = {"ueventd.android_x86.rc", "x86.prop", "ueventd.ttVM_x86.rc", "init.ttVM_x86.rc", "fstab.ttVM_x86", "fstab.vbox86", "init.vbox86.rc", "ueventd.vbox86.rc"};
    public static String[] f = {"fstab.andy", "ueventd.andy.rc"};

    public static boolean a() {
        String[] strArr = {"/sys/devices/virtual/misc/qemu_pipe", "/sys/devices/virtual/misc/qemud", "/dev/socket/qemud", "/dev/socket/qemu_pipe", "/system/lib/libc_malloc_debug_qemu.so", "/system/bin/qemu-props", "/dev/qemu_pipe"};
        for (int i = 0; i < 7; i++) {
            if (new File(strArr[i]).exists()) {
                return true;
            }
        }
        return false;
    }

    public static boolean b() {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        String str = Build.SUPPORTED_ABIS[0];
        return iAvailableProcessors <= 1 || str.equals("x86") || str.equals("x86_64");
    }

    public static boolean c() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (!inetAddressNextElement.isLoopbackAddress()) {
                        String string = inetAddressNextElement.getHostAddress().toString();
                        if (string.startsWith("10.0.2.") || string.startsWith("10.0.3.")) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (SocketException unused) {
            return false;
        }
    }

    public static boolean d(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        return "Android".equals(telephonyManager.getNetworkOperatorName()) || "Android".equals(telephonyManager.getSimOperatorName());
    }

    public static Boolean e(String[] strArr) {
        for (String str : strArr) {
            if (new File(str).exists()) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public static boolean f() {
        String[] strArr = {"/dev/socket/qemud", "/dev/qemu_pipe"};
        for (int i = 0; i < 2; i++) {
            if (new File(strArr[i]).exists()) {
                return true;
            }
        }
        return false;
    }

    public static boolean g(Context context) {
        return i() || h() || j();
    }

    public static boolean h() {
        BufferedReader bufferedReader;
        String line;
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/self/status"));
        } catch (IOException unused) {
        }
        do {
            line = bufferedReader.readLine();
            if (line == null) {
                bufferedReader.close();
                return false;
            }
        } while (!line.startsWith("TracerPid:"));
        return Integer.parseInt(line.split(":")[1].trim()) != 0;
    }

    public static boolean i() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    public static boolean j() {
        String[] strArr = {"/data/local/tmp/frida-server", "/data/local/tmp/re.frida.server", "/data/local/tmp/frida-server-12.0.8-android-arm", "/data/local/tmp/riru", "/data/local/tmp/magisk"};
        for (int i = 0; i < 5; i++) {
            if (new File(strArr[i]).exists()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x020f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean k() {
        /*
            Method dump skipped, instruction units count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.s12.k():boolean");
    }

    public static boolean l() {
        String str = Build.FINGERPRINT;
        String str2 = Build.MODEL;
        String str3 = Build.MANUFACTURER;
        String str4 = Build.BRAND;
        String str5 = Build.DEVICE;
        String str6 = Build.PRODUCT;
        if (str.startsWith("generic") || str.startsWith("unknown") || str2.contains("google_sdk") || str2.contains("Emulator") || str2.contains("Android SDK built for x86") || str3.contains("Genymotion")) {
            return true;
        }
        return (str4.startsWith("generic") && str5.startsWith("generic")) || str6.equals("google_sdk");
    }

    public static boolean m(Context context) {
        return l() || f() || a() || c() || d(context) || b();
    }
}
