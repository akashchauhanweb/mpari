package com.zepto;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class tp7 implements yz0 {
    public static final tp7 e = new tp7();
    public static e43 f;
    public final /* synthetic */ yz0 c = zz0.b();

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[xl5.values().length];
            try {
                iArr[xl5.downloads.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[xl5.pictures.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public static final class b extends SuspendLambda implements Function2 {
        public Object c;
        public Object e;
        public Object f;
        public Object g;
        public int h;
        public boolean i;
        public int j;
        public /* synthetic */ Object k;
        public final /* synthetic */ Context l;
        public final /* synthetic */ g16 m;
        public final /* synthetic */ boolean n;
        public final /* synthetic */ xv0 o;
        public final /* synthetic */ int p;
        public final /* synthetic */ Ref.ObjectRef q;
        public final /* synthetic */ List r;
        public final /* synthetic */ jv0 s;

        public static final class a extends SuspendLambda implements Function2 {
            public int c;
            public final /* synthetic */ Context e;
            public final /* synthetic */ List f;
            public final /* synthetic */ int g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context, List list, int i, Continuation continuation) {
                super(2, continuation);
                this.e = context;
                this.f = list;
                this.g = i;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(yz0 yz0Var, Continuation continuation) {
                return ((a) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.e, this.f, this.g, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return tp7.e.f(this.e, (Uri) this.f.get(this.g));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, g16 g16Var, vu vuVar, boolean z, xv0 xv0Var, int i, Ref.ObjectRef objectRef, List list, jv0 jv0Var, Continuation continuation) {
            super(2, continuation);
            this.l = context;
            this.m = g16Var;
            this.n = z;
            this.o = xv0Var;
            this.p = i;
            this.q = objectRef;
            this.r = list;
            this.s = jv0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((b) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = new b(this.l, this.m, null, this.n, this.o, this.p, this.q, this.r, this.s, continuation);
            bVar.k = obj;
            return bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:27:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0157  */
        /* JADX WARN: Type inference failed for: r0v15, types: [T, java.io.File] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 357
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zepto.tp7.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class c extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ int e;
        public final /* synthetic */ Context f;
        public final /* synthetic */ Uri g;
        public final /* synthetic */ String h;
        public final /* synthetic */ String i;
        public final /* synthetic */ xv0 j;
        public final /* synthetic */ jv0 k;

        public static final class a implements kv0 {
            public final /* synthetic */ jv0 a;

            public a(jv0 jv0Var) {
                this.a = jv0Var;
            }

            @Override // com.zepto.kv0
            public void a(int i) {
                this.a.a(i);
            }

            @Override // com.zepto.kv0
            public void b(int i, float f) {
                this.a.b(i, f);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i, Context context, Uri uri, String str, String str2, xv0 xv0Var, jv0 jv0Var, Continuation continuation) {
            super(2, continuation);
            this.e = i;
            this.f = context;
            this.g = uri;
            this.h = str;
            this.i = str2;
            this.j = xv0Var;
            this.k = jv0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((c) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.e, this.f, this.g, this.h, this.i, this.j, this.k, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ov0 ov0Var = ov0.a;
                int i2 = this.e;
                Context context = this.f;
                Uri uri = this.g;
                String str = this.h;
                String str2 = this.i;
                xv0 xv0Var = this.j;
                a aVar = new a(this.k);
                this.c = 1;
                obj = ov0Var.b(i2, context, uri, str, str2, xv0Var, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    public static final void i(Context context, List uris, boolean z, g16 g16Var, vu vuVar, xv0 configureWith, jv0 listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uris, "uris");
        Intrinsics.checkNotNullParameter(configureWith, "configureWith");
        Intrinsics.checkNotNullParameter(listener, "listener");
        configureWith.f().size();
        uris.size();
        e.e(context, uris, z, g16Var, vuVar, configureWith, listener);
    }

    public static /* synthetic */ void j(Context context, List list, boolean z, g16 g16Var, vu vuVar, xv0 xv0Var, jv0 jv0Var, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        i(context, list, z, (i & 8) != 0 ? null : g16Var, (i & 16) != 0 ? null : vuVar, xv0Var, jv0Var);
    }

    @Override // com.zepto.yz0
    public CoroutineContext c() {
        return this.c.c();
    }

    public final void e(Context context, List list, boolean z, g16 g16Var, vu vuVar, xv0 xv0Var, jv0 jv0Var) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            f = f80.d(this, null, null, new b(context, g16Var, vuVar, z, xv0Var, i, objectRef, list, jv0Var, null), 3, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009e  */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.ContentResolver] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String f(android.content.Context r10, android.net.Uri r11) throws java.lang.Throwable {
        /*
            r9 = this;
            android.content.ContentResolver r6 = r10.getContentResolver()
            java.lang.String r7 = "_data"
            java.lang.String[] r2 = new java.lang.String[]{r7}
            r3 = 0
            r4 = 0
            r5 = 0
            r8 = 0
            r0 = r6
            r1 = r11
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            if (r0 == 0) goto L2e
            int r1 = r0.getColumnIndexOrThrow(r7)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L37
            r0.moveToFirst()     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L37
            java.lang.String r1 = r0.getString(r1)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L37
            java.lang.String r2 = "{\n                val co…lumnIndex)\n\n            }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L37
            r0.close()
            return r1
        L2a:
            r10 = move-exception
            r8 = r0
            goto L9c
        L2e:
            java.lang.Exception r1 = new java.lang.Exception     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L37
            r1.<init>()     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L37
            throw r1     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L37
        L34:
            r10 = move-exception
            goto L9c
        L36:
            r0 = r8
        L37:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a
            r1.<init>()     // Catch: java.lang.Throwable -> L2a
            android.content.pm.ApplicationInfo r10 = r10.getApplicationInfo()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r10 = r10.dataDir     // Catch: java.lang.Throwable -> L2a
            r1.append(r10)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r10 = java.io.File.separator     // Catch: java.lang.Throwable -> L2a
            r1.append(r10)     // Catch: java.lang.Throwable -> L2a
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L2a
            r1.append(r2)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r10 = r1.toString()     // Catch: java.lang.Throwable -> L2a
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L2a
            r1.<init>(r10)     // Catch: java.lang.Throwable -> L2a
            java.io.InputStream r10 = r6.openInputStream(r11)     // Catch: java.lang.Throwable -> L2a
            if (r10 == 0) goto L8d
            java.io.FileOutputStream r11 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L7f
            r11.<init>(r1)     // Catch: java.lang.Throwable -> L7f
            r2 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L74
        L69:
            int r3 = r10.read(r2)     // Catch: java.lang.Throwable -> L74
            if (r3 <= 0) goto L76
            r4 = 0
            r11.write(r2, r4, r3)     // Catch: java.lang.Throwable -> L74
            goto L69
        L74:
            r1 = move-exception
            goto L81
        L76:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L74
            kotlin.io.CloseableKt.closeFinally(r11, r8)     // Catch: java.lang.Throwable -> L7f
            kotlin.io.CloseableKt.closeFinally(r10, r8)     // Catch: java.lang.Throwable -> L2a
            goto L8d
        L7f:
            r11 = move-exception
            goto L87
        L81:
            throw r1     // Catch: java.lang.Throwable -> L82
        L82:
            r2 = move-exception
            kotlin.io.CloseableKt.closeFinally(r11, r1)     // Catch: java.lang.Throwable -> L7f
            throw r2     // Catch: java.lang.Throwable -> L7f
        L87:
            throw r11     // Catch: java.lang.Throwable -> L88
        L88:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r10, r11)     // Catch: java.lang.Throwable -> L2a
            throw r1     // Catch: java.lang.Throwable -> L2a
        L8d:
            java.lang.String r10 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r11 = "file.absolutePath"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r11)     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L9b
            r0.close()
        L9b:
            return r10
        L9c:
            if (r8 == 0) goto La1
            r8.close()
        La1:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.tp7.f(android.content.Context, android.net.Uri):java.lang.String");
    }

    public final File g(Context context, String str, g16 g16Var, vu vuVar, Boolean bool, String str2, Boolean bool2) throws FileNotFoundException {
        String path;
        FileInputStream fileInputStream;
        byte[] bArr;
        if (str == null) {
            return null;
        }
        File file = new File(str);
        if (g16Var == null) {
            e.l(str2, bool);
            Intrinsics.checkNotNull(vuVar);
            throw null;
        }
        tp7 tp7Var = e;
        String strL = tp7Var.l(str2, bool);
        xl5 xl5VarA = g16Var.a();
        int i = xl5VarA == null ? -1 : a.a[xl5VarA.ordinal()];
        String fullPath = i != 1 ? i != 2 ? Environment.DIRECTORY_MOVIES : Environment.DIRECTORY_PICTURES : Environment.DIRECTORY_DOWNLOADS;
        if (Build.VERSION.SDK_INT >= 29) {
            if (g16Var.b() != null) {
                fullPath = fullPath + '/' + g16Var.b();
            }
            if (Intrinsics.areEqual(bool2, Boolean.TRUE)) {
                Intrinsics.checkNotNullExpressionValue(fullPath, "fullPath");
                tp7Var.h(context, strL, fullPath, file);
            }
            return new File(context.getFilesDir(), strL);
        }
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(fullPath);
        if (g16Var.b() != null) {
            path = externalStoragePublicDirectory + '/' + g16Var.b();
        } else {
            path = externalStoragePublicDirectory.getPath();
        }
        File file2 = new File(path, strL);
        if (!file2.exists()) {
            try {
                File parentFile = file2.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        if (Intrinsics.areEqual(bool2, Boolean.TRUE)) {
            FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput(strL, 0);
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    bArr = new byte[ConstantsKt.DEFAULT_BLOCK_SIZE];
                } finally {
                }
            } finally {
            }
            while (true) {
                int i2 = fileInputStream.read(bArr);
                if (i2 <= 0) {
                    break;
                }
                fileOutputStreamOpenFileOutput.write(bArr, 0, i2);
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileInputStream, null);
            CloseableKt.closeFinally(fileOutputStreamOpenFileOutput, null);
        }
        return file2;
    }

    public final void h(Context context, String str, String str2, File file) throws FileNotFoundException {
        FileInputStream fileInputStream;
        byte[] bArr;
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", "video/mp4");
        contentValues.put("relative_path", str2);
        contentValues.put("is_pending", (Integer) 1);
        Uri contentUri = MediaStore.Video.Media.getContentUri("external_primary");
        if (Intrinsics.areEqual(str2, Environment.DIRECTORY_DOWNLOADS)) {
            contentUri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
        }
        Uri uriInsert = context.getContentResolver().insert(contentUri, contentValues);
        if (uriInsert != null) {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uriInsert, "rw");
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        fileInputStream = new FileInputStream(file);
                        try {
                            bArr = new byte[ConstantsKt.DEFAULT_BLOCK_SIZE];
                        } finally {
                        }
                    } finally {
                    }
                    while (true) {
                        int i = fileInputStream.read(bArr);
                        if (i <= 0) {
                            break;
                        } else {
                            fileOutputStream.write(bArr, 0, i);
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileInputStream, null);
                    CloseableKt.closeFinally(fileOutputStream, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(parcelFileDescriptorOpenFileDescriptor, th);
                        throw th2;
                    }
                }
            }
            CloseableKt.closeFinally(parcelFileDescriptorOpenFileDescriptor, null);
            contentValues.clear();
            contentValues.put("is_pending", (Integer) 0);
            context.getContentResolver().update(uriInsert, contentValues, null, null);
        }
    }

    public final Object k(int i, Context context, Uri uri, String str, String str2, xv0 xv0Var, jv0 jv0Var, Continuation continuation) {
        return e80.e(qk1.a(), new c(i, context, uri, str, str2, xv0Var, jv0Var, null), continuation);
    }

    public final String l(String str, Boolean bool) {
        if (bool != null && bool.booleanValue()) {
            str = str + "_temp";
        }
        if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "mp4", false, 2, (Object) null)) {
            return str;
        }
        return str + ".mp4";
    }
}
