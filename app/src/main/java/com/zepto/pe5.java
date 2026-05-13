package com.zepto;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.scottyab.rootbeer.RootBeerNative;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

/* JADX INFO: loaded from: classes2.dex */
public class pe5 {
    private boolean loggingEnabled = true;
    private final Context mContext;

    public pe5(Context context) {
        this.mContext = context;
    }

    private boolean isAnyPackageFromListInstalled(List<String> list) {
        PackageManager packageManager = this.mContext.getPackageManager();
        boolean z = false;
        for (String str : list) {
            try {
                packageManager.getPackageInfo(str, 0);
                cy4.e(str + " ROOT management app detected!");
                z = true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return z;
    }

    private String[] mountReader() {
        try {
            InputStream inputStream = Runtime.getRuntime().exec("mount").getInputStream();
            if (inputStream == null) {
                return null;
            }
            return new Scanner(inputStream).useDelimiter("\\A").next().split("\n");
        } catch (IOException | NoSuchElementException e) {
            cy4.e(e);
            return null;
        }
    }

    private String[] propsReader() {
        try {
            InputStream inputStream = Runtime.getRuntime().exec("getprop").getInputStream();
            if (inputStream == null) {
                return null;
            }
            return new Scanner(inputStream).useDelimiter("\\A").next().split("\n");
        } catch (IOException | NoSuchElementException e) {
            cy4.e(e);
            return null;
        }
    }

    public boolean canLoadNativeLibrary() {
        return new RootBeerNative().wasNativeLibraryLoaded();
    }

    public boolean checkForBinary(String str) {
        boolean z = false;
        for (String str2 : vw0.getPaths()) {
            String str3 = str2 + str;
            if (new File(str2, str).exists()) {
                cy4.v(str3 + " binary detected!");
                z = true;
            }
        }
        return z;
    }

    public boolean checkForBusyBoxBinary() {
        return checkForBinary(vw0.BINARY_BUSYBOX);
    }

    public boolean checkForDangerousProps() {
        HashMap map = new HashMap();
        map.put("ro.debuggable", VContant.MAINSCREEN);
        map.put("ro.secure", "0");
        String[] strArrPropsReader = propsReader();
        if (strArrPropsReader == null) {
            return false;
        }
        boolean z = false;
        for (String str : strArrPropsReader) {
            for (String str2 : map.keySet()) {
                if (str.contains(str2)) {
                    String str3 = "[" + ((String) map.get(str2)) + "]";
                    if (str.contains(str3)) {
                        cy4.v(str2 + " = " + str3 + " detected!");
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    public boolean checkForMagiskBinary() {
        return checkForBinary("magisk");
    }

    public boolean checkForNativeLibraryReadAccess() {
        try {
            new RootBeerNative().setLogDebugMessages(this.loggingEnabled);
            return true;
        } catch (UnsatisfiedLinkError unused) {
            return false;
        }
    }

    public boolean checkForRWPaths() {
        String[] strArrMountReader = mountReader();
        int i = 0;
        if (strArrMountReader == null) {
            return false;
        }
        int length = strArrMountReader.length;
        int i2 = 0;
        boolean z = false;
        while (i2 < length) {
            String str = strArrMountReader[i2];
            String[] strArrSplit = str.split(" ");
            if (strArrSplit.length < 4) {
                cy4.e("Error formatting mount line: " + str);
            } else {
                String str2 = strArrSplit[1];
                String str3 = strArrSplit[3];
                String[] strArr = vw0.pathsThatShouldNotBeWritable;
                int length2 = strArr.length;
                int i3 = i;
                while (i3 < length2) {
                    String str4 = strArr[i3];
                    if (str2.equalsIgnoreCase(str4)) {
                        String[] strArrSplit2 = str3.split(",");
                        int length3 = strArrSplit2.length;
                        int i4 = i;
                        while (true) {
                            if (i4 >= length3) {
                                break;
                            }
                            if (strArrSplit2[i4].equalsIgnoreCase("rw")) {
                                cy4.v(str4 + " path is mounted with rw permissions! " + str);
                                z = true;
                                break;
                            }
                            i4++;
                        }
                    }
                    i3++;
                    i = 0;
                }
            }
            i2++;
            i = 0;
        }
        return z;
    }

    public boolean checkForRootNative() {
        if (!canLoadNativeLibrary()) {
            cy4.e("We could not load the native library to test for root");
            return false;
        }
        String[] paths = vw0.getPaths();
        int length = paths.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = paths[i] + vw0.BINARY_SU;
        }
        RootBeerNative rootBeerNative = new RootBeerNative();
        try {
            rootBeerNative.setLogDebugMessages(this.loggingEnabled);
            return rootBeerNative.checkForRoot(strArr) > 0;
        } catch (UnsatisfiedLinkError unused) {
            return false;
        }
    }

    public boolean checkForSuBinary() {
        return checkForBinary(vw0.BINARY_SU);
    }

    public boolean checkSuExists() {
        Process processExec = null;
        try {
            processExec = Runtime.getRuntime().exec(new String[]{"which", vw0.BINARY_SU});
            boolean z = new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() != null;
            processExec.destroy();
            return z;
        } catch (Throwable unused) {
            if (processExec != null) {
                processExec.destroy();
            }
            return false;
        }
    }

    public boolean detectPotentiallyDangerousApps() {
        return detectPotentiallyDangerousApps(null);
    }

    public boolean detectRootCloakingApps() {
        return detectRootCloakingApps(null) || (canLoadNativeLibrary() && !checkForNativeLibraryReadAccess());
    }

    public boolean detectRootManagementApps() {
        return detectRootManagementApps(null);
    }

    public boolean detectTestKeys() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    public boolean isRooted() {
        return detectRootManagementApps() || detectPotentiallyDangerousApps() || checkForBinary(vw0.BINARY_SU) || checkForDangerousProps() || checkForRWPaths() || detectTestKeys() || checkSuExists() || checkForRootNative() || checkForMagiskBinary();
    }

    public boolean isRootedWithBusyBoxCheck() {
        return detectRootManagementApps() || detectPotentiallyDangerousApps() || checkForBinary(vw0.BINARY_SU) || checkForBinary(vw0.BINARY_BUSYBOX) || checkForDangerousProps() || checkForRWPaths() || detectTestKeys() || checkSuExists() || checkForRootNative() || checkForMagiskBinary();
    }

    public boolean isRootedWithoutBusyBoxCheck() {
        return isRooted();
    }

    public void setLogging(boolean z) {
        this.loggingEnabled = z;
        cy4.LOGGING_LEVEL = z ? 5 : 0;
    }

    public boolean detectPotentiallyDangerousApps(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(vw0.knownDangerousAppsPackages));
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        return isAnyPackageFromListInstalled(arrayList);
    }

    public boolean detectRootCloakingApps(String[] strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(vw0.knownRootCloakingPackages));
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        return isAnyPackageFromListInstalled(arrayList);
    }

    public boolean detectRootManagementApps(String[] strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(vw0.knownRootAppsPackages));
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        return isAnyPackageFromListInstalled(arrayList);
    }
}
