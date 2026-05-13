package ai.protectt.app.security.common.helper;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Process;
import android.util.Log;
import com.zepto.nn3;
import com.zepto.qw2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes.dex */
public class IsolatedService extends Service {
    public final qw2.a a = new a();

    public class a extends qw2.a {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v11 */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.io.BufferedReader] */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00e7 -> B:42:0x0115). Please report as a decompilation issue!!! */
        @Override // com.zepto.qw2
        public boolean Q() throws Throwable {
            ?? r0;
            BufferedReader bufferedReader;
            nn3 nn3Var = nn3.a;
            nn3Var.f("DetectIsolated", "" + Process.myPid());
            nn3Var.f("DetectIsolated", "" + Process.myUid());
            StringBuilder sb = new StringBuilder();
            NativeInteractor nativeInteractor = NativeInteractor.a;
            sb.append(nativeInteractor.h0());
            sb.append(Process.myPid());
            sb.append(nativeInteractor.i0());
            File file = new File(sb.toString());
            boolean zC0 = false;
            try {
                try {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                        int i = 0;
                        while (true) {
                            try {
                                String line = bufferedReader.readLine();
                                if (line == null || i != 0) {
                                    break;
                                }
                                String[] strArrG0 = NativeInteractor.a.g0();
                                int length = strArrG0.length;
                                int i2 = 0;
                                while (true) {
                                    if (i2 < length) {
                                        String str = strArrG0[i2];
                                        if (line.contains(str)) {
                                            Log.d("DetectIsolated", "Blacklisted Path found " + str);
                                            i++;
                                            break;
                                        }
                                        i2++;
                                    }
                                }
                            } catch (IOException e) {
                                e = e;
                                nn3.a.b("DetectIsolated", "Exception IIsolatedService :: " + e.getMessage(), e);
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                return zC0;
                            }
                        }
                        bufferedReader.close();
                        fileInputStream.close();
                        IsolatedService.a(fileInputStream);
                        Log.d("DetectIsolated", "Count of detected paths " + i);
                        if (i > 0) {
                            Log.d("DetectIsolated", "Found m in atleast 1 mount path ");
                            zC0 = true;
                        } else {
                            zC0 = NativeInteractor.a.c0();
                            Log.d("DetectIsolated", "Found m in Native " + zC0);
                        }
                        bufferedReader.close();
                    } catch (IOException e2) {
                        e = e2;
                        bufferedReader = null;
                    } catch (Throwable th) {
                        th = th;
                        r0 = 0;
                        if (r0 != 0) {
                            try {
                                r0.close();
                            } catch (Exception e3) {
                                nn3.a.b("DetectIsolated", e3.toString(), null);
                            }
                        }
                        throw th;
                    }
                } catch (Exception e4) {
                    nn3.a.b("DetectIsolated", e4.toString(), null);
                }
                return zC0;
            } catch (Throwable th2) {
                th = th2;
                r0 = file;
            }
        }
    }

    public static void a(FileInputStream fileInputStream) {
        if (fileInputStream != null) {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                nn3.a.b("TAG", e.toString(), e);
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.a;
    }
}
