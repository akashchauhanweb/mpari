package com.scottyab.rootbeer;

import com.zepto.cy4;

/* JADX INFO: loaded from: classes2.dex */
public class RootBeerNative {
    private static boolean libraryLoaded;

    static {
        try {
            System.loadLibrary("tool-checker");
            libraryLoaded = true;
        } catch (UnsatisfiedLinkError e) {
            cy4.e(e);
        }
    }

    public native int checkForRoot(Object[] objArr);

    public native int setLogDebugMessages(boolean z);

    public boolean wasNativeLibraryLoaded() {
        return libraryLoaded;
    }
}
