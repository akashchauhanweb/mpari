package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.zepto.yy0;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class FileProvider extends ContentProvider {
    public static final String[] c = {"_display_name", "_size"};
    public static final File d = new File("/");
    public static final HashMap e = new HashMap();
    public b a;
    public int b = 0;

    public static class a {
        public static File[] a(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    public interface b {
        File a(Uri uri);

        Uri b(File file);
    }

    public static class c implements b {
        public final String a;
        public final HashMap b = new HashMap();

        public c(String str) {
            this.a = str;
        }

        @Override // androidx.core.content.FileProvider.b
        public File a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int iIndexOf = encodedPath.indexOf(47, 1);
            String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
            String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
            File file = (File) this.b.get(strDecode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            File file2 = new File(file, strDecode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (canonicalFile.getPath().startsWith(file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }

        @Override // androidx.core.content.FileProvider.b
        public Uri b(File file) {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry entry = null;
                for (Map.Entry entry2 : this.b.entrySet()) {
                    String path = ((File) entry2.getValue()).getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
                }
                String path2 = ((File) entry.getValue()).getPath();
                return new Uri.Builder().scheme("content").authority(this.a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        public void c(String str, File file) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                this.b.put(str, file.getCanonicalFile());
            } catch (IOException e) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e);
            }
        }
    }

    public static File a(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    public static Object[] b(Object[] objArr, int i) {
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }

    public static String[] c(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    public static XmlResourceParser d(Context context, String str, ProviderInfo providerInfo, int i) {
        if (providerInfo == null) {
            throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
        }
        if (providerInfo.metaData == null && i != 0) {
            Bundle bundle = new Bundle(1);
            providerInfo.metaData = bundle;
            bundle.putInt("android.support.FILE_PROVIDER_PATHS", i);
        }
        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (xmlResourceParserLoadXmlMetaData != null) {
            return xmlResourceParserLoadXmlMetaData;
        }
        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    }

    public static b e(Context context, String str, int i) {
        b bVarH;
        HashMap map = e;
        synchronized (map) {
            try {
                bVarH = (b) map.get(str);
                if (bVarH == null) {
                    try {
                        try {
                            bVarH = h(context, str, i);
                            map.put(str, bVarH);
                        } catch (XmlPullParserException e2) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                        }
                    } catch (IOException e3) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVarH;
    }

    public static Uri f(Context context, String str, File file) {
        return e(context, str, 0).b(file);
    }

    public static int g(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    public static b h(Context context, String str, int i) throws XmlPullParserException, IOException {
        c cVar = new c(str);
        XmlResourceParser xmlResourceParserD = d(context, str, context.getPackageManager().resolveContentProvider(str, 128), i);
        while (true) {
            int next = xmlResourceParserD.next();
            if (next == 1) {
                return cVar;
            }
            if (next == 2) {
                String name = xmlResourceParserD.getName();
                File externalStorageDirectory = null;
                String attributeValue = xmlResourceParserD.getAttributeValue(null, "name");
                String attributeValue2 = xmlResourceParserD.getAttributeValue(null, "path");
                if ("root-path".equals(name)) {
                    externalStorageDirectory = d;
                } else if ("files-path".equals(name)) {
                    externalStorageDirectory = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    externalStorageDirectory = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    externalStorageDirectory = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    File[] fileArrG = yy0.g(context, null);
                    if (fileArrG.length > 0) {
                        externalStorageDirectory = fileArrG[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    File[] fileArrF = yy0.f(context);
                    if (fileArrF.length > 0) {
                        externalStorageDirectory = fileArrF[0];
                    }
                } else if ("external-media-path".equals(name)) {
                    File[] fileArrA = a.a(context);
                    if (fileArrA.length > 0) {
                        externalStorageDirectory = fileArrA[0];
                    }
                }
                if (externalStorageDirectory != null) {
                    cVar.c(attributeValue, a(externalStorageDirectory, attributeValue2));
                }
            }
        }
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority.split(";")[0];
        HashMap map = e;
        synchronized (map) {
            map.remove(str);
        }
        this.a = e(context, str, this.b);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return this.a.a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        File fileA = this.a.a(uri);
        int iLastIndexOf = fileA.getName().lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileA.getName().substring(iLastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return ParcelFileDescriptor.open(this.a.a(uri), g(str));
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        File fileA = this.a.a(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = c;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = queryParameter == null ? fileA.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(fileA.length());
            }
            i2 = i;
        }
        String[] strArrC = c(strArr3, i2);
        Object[] objArrB = b(objArr, i2);
        MatrixCursor matrixCursor = new MatrixCursor(strArrC, 1);
        matrixCursor.addRow(objArrB);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
