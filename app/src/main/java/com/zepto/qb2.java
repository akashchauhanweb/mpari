package com.zepto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qb2 {
    public static final a a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(String str, File file) {
            try {
                URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
                Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                httpURLConnection.connect();
                InputStream inputStream = httpURLConnection.getInputStream();
                Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                httpURLConnection.getContentLength();
                byte[] bArr = new byte[1048576];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i <= 0) {
                        fileOutputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (MalformedURLException e2) {
                e2.printStackTrace();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        }
    }
}
