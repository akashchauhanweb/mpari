package com.zepto;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bk4 {
    public static void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    public static String b() {
        try {
            return new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        } catch (Exception e) {
            e.printStackTrace();
            return "--";
        }
    }

    public static void c(File file, Context context) {
        AssetManager assets = context.getAssets();
        Log.e("SAVE_FILE_FROM_ASSETS", file.getName());
        try {
            InputStream inputStreamOpen = assets.open("fonts/" + file.getName());
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            a(inputStreamOpen, bufferedOutputStream);
            inputStreamOpen.close();
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
        } catch (Exception e) {
            Log.e("SAVE_FILE_FROM_ASSETS", e.getMessage());
        }
    }
}
