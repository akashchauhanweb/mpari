package com.zepto;

import android.os.SystemClock;
import android.text.TextUtils;
import com.zepto.g90;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public class fk1 implements g90 {
    private static final int CACHE_MAGIC = 538247942;
    private static final int DEFAULT_DISK_USAGE_BYTES = 5242880;
    static final float HYSTERESIS_FACTOR = 0.9f;
    private final Map<String, b> mEntries;
    private final int mMaxCacheSizeInBytes;
    private final d mRootDirectorySupplier;
    private long mTotalSize;

    public class a implements d {
        final /* synthetic */ File val$rootDirectory;

        public a(File file) {
            this.val$rootDirectory = file;
        }

        @Override // com.zepto.fk1.d
        public File get() {
            return this.val$rootDirectory;
        }
    }

    public static class c extends FilterInputStream {
        private long bytesRead;
        private final long length;

        public c(InputStream inputStream, long j) {
            super(inputStream);
            this.length = j;
        }

        public long bytesRead() {
            return this.bytesRead;
        }

        public long bytesRemaining() {
            return this.length - this.bytesRead;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int i = super.read();
            if (i != -1) {
                this.bytesRead++;
            }
            return i;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int i3 = super.read(bArr, i, i2);
            if (i3 != -1) {
                this.bytesRead += (long) i3;
            }
            return i3;
        }
    }

    public interface d {
        File get();
    }

    public fk1(File file, int i) {
        this.mEntries = new LinkedHashMap(16, 0.75f, true);
        this.mTotalSize = 0L;
        this.mRootDirectorySupplier = new a(file);
        this.mMaxCacheSizeInBytes = i;
    }

    private String getFilenameForKey(String str) {
        int length = str.length() / 2;
        return String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode());
    }

    private void initializeIfRootDirectoryDeleted() {
        if (this.mRootDirectorySupplier.get().exists()) {
            return;
        }
        cu7.d("Re-initializing cache after external clearing.", new Object[0]);
        this.mEntries.clear();
        this.mTotalSize = 0L;
        initialize();
    }

    private void pruneIfNeeded() {
        if (this.mTotalSize < this.mMaxCacheSizeInBytes) {
            return;
        }
        int i = 0;
        if (cu7.DEBUG) {
            cu7.v("Pruning old cache entries.", new Object[0]);
        }
        long j = this.mTotalSize;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Iterator<Map.Entry<String, b>> it = this.mEntries.entrySet().iterator();
        while (it.hasNext()) {
            b value = it.next().getValue();
            if (getFileForKey(value.key).delete()) {
                this.mTotalSize -= value.size;
            } else {
                String str = value.key;
                cu7.d("Could not delete cache entry for key=%s, filename=%s", str, getFilenameForKey(str));
            }
            it.remove();
            i++;
            if (this.mTotalSize < this.mMaxCacheSizeInBytes * HYSTERESIS_FACTOR) {
                break;
            }
        }
        if (cu7.DEBUG) {
            cu7.v("pruned %d files, %d bytes, %d ms", Integer.valueOf(i), Long.valueOf(this.mTotalSize - j), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
        }
    }

    private void putEntry(String str, b bVar) {
        if (this.mEntries.containsKey(str)) {
            this.mTotalSize += bVar.size - this.mEntries.get(str).size;
        } else {
            this.mTotalSize += bVar.size;
        }
        this.mEntries.put(str, bVar);
    }

    private static int read(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i != -1) {
            return i;
        }
        throw new EOFException();
    }

    public static List<ml2> readHeaderList(c cVar) throws IOException {
        int i = readInt(cVar);
        if (i < 0) {
            throw new IOException("readHeaderList size=" + i);
        }
        List<ml2> listEmptyList = i == 0 ? Collections.emptyList() : new ArrayList<>();
        for (int i2 = 0; i2 < i; i2++) {
            listEmptyList.add(new ml2(readString(cVar).intern(), readString(cVar).intern()));
        }
        return listEmptyList;
    }

    public static int readInt(InputStream inputStream) throws IOException {
        return (read(inputStream) << 24) | read(inputStream) | (read(inputStream) << 8) | (read(inputStream) << 16);
    }

    public static long readLong(InputStream inputStream) throws IOException {
        return (((long) read(inputStream)) & 255) | ((((long) read(inputStream)) & 255) << 8) | ((((long) read(inputStream)) & 255) << 16) | ((((long) read(inputStream)) & 255) << 24) | ((((long) read(inputStream)) & 255) << 32) | ((((long) read(inputStream)) & 255) << 40) | ((((long) read(inputStream)) & 255) << 48) | ((255 & ((long) read(inputStream))) << 56);
    }

    public static String readString(c cVar) throws IOException {
        return new String(streamToBytes(cVar, readLong(cVar)), "UTF-8");
    }

    private void removeEntry(String str) {
        b bVarRemove = this.mEntries.remove(str);
        if (bVarRemove != null) {
            this.mTotalSize -= bVarRemove.size;
        }
    }

    public static byte[] streamToBytes(c cVar, long j) throws IOException {
        long jBytesRemaining = cVar.bytesRemaining();
        if (j >= 0 && j <= jBytesRemaining) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(cVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j + ", maxLength=" + jBytesRemaining);
    }

    public static void writeHeaderList(List<ml2> list, OutputStream outputStream) throws IOException {
        if (list == null) {
            writeInt(outputStream, 0);
            return;
        }
        writeInt(outputStream, list.size());
        for (ml2 ml2Var : list) {
            writeString(outputStream, ml2Var.getName());
            writeString(outputStream, ml2Var.getValue());
        }
    }

    public static void writeInt(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & KotlinVersion.MAX_COMPONENT_VALUE);
        outputStream.write((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        outputStream.write((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        outputStream.write((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static void writeLong(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    public static void writeString(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        writeLong(outputStream, bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    @Override // com.zepto.g90
    public synchronized void clear() {
        try {
            File[] fileArrListFiles = this.mRootDirectorySupplier.get().listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    file.delete();
                }
            }
            this.mEntries.clear();
            this.mTotalSize = 0L;
            cu7.d("Cache cleared.", new Object[0]);
        } catch (Throwable th) {
            throw th;
        }
    }

    public InputStream createInputStream(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    public OutputStream createOutputStream(File file) throws FileNotFoundException {
        return new FileOutputStream(file);
    }

    @Override // com.zepto.g90
    public synchronized g90.a get(String str) {
        b bVar = this.mEntries.get(str);
        if (bVar == null) {
            return null;
        }
        File fileForKey = getFileForKey(str);
        try {
            c cVar = new c(new BufferedInputStream(createInputStream(fileForKey)), fileForKey.length());
            try {
                b header = b.readHeader(cVar);
                if (TextUtils.equals(str, header.key)) {
                    return bVar.toCacheEntry(streamToBytes(cVar, cVar.bytesRemaining()));
                }
                cu7.d("%s: key=%s, found=%s", fileForKey.getAbsolutePath(), str, header.key);
                removeEntry(str);
                return null;
            } finally {
                cVar.close();
            }
        } catch (IOException e) {
            cu7.d("%s: %s", fileForKey.getAbsolutePath(), e.toString());
            remove(str);
            return null;
        }
    }

    public File getFileForKey(String str) {
        return new File(this.mRootDirectorySupplier.get(), getFilenameForKey(str));
    }

    @Override // com.zepto.g90
    public synchronized void initialize() {
        File file = this.mRootDirectorySupplier.get();
        if (!file.exists()) {
            if (!file.mkdirs()) {
                cu7.e("Unable to create cache dir %s", file.getAbsolutePath());
            }
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            try {
                long length = file2.length();
                c cVar = new c(new BufferedInputStream(createInputStream(file2)), length);
                try {
                    b header = b.readHeader(cVar);
                    header.size = length;
                    putEntry(header.key, header);
                    cVar.close();
                } catch (Throwable th) {
                    cVar.close();
                    throw th;
                }
            } catch (IOException unused) {
                file2.delete();
            }
        }
    }

    @Override // com.zepto.g90
    public synchronized void invalidate(String str, boolean z) {
        try {
            g90.a aVar = get(str);
            if (aVar != null) {
                aVar.softTtl = 0L;
                if (z) {
                    aVar.ttl = 0L;
                }
                put(str, aVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.zepto.g90
    public synchronized void put(String str, g90.a aVar) {
        BufferedOutputStream bufferedOutputStream;
        b bVar;
        long length = this.mTotalSize + ((long) aVar.data.length);
        int i = this.mMaxCacheSizeInBytes;
        if (length <= i || r2.length <= i * HYSTERESIS_FACTOR) {
            File fileForKey = getFileForKey(str);
            try {
                bufferedOutputStream = new BufferedOutputStream(createOutputStream(fileForKey));
                bVar = new b(str, aVar);
            } catch (IOException unused) {
                if (!fileForKey.delete()) {
                    cu7.d("Could not clean up file %s", fileForKey.getAbsolutePath());
                }
                initializeIfRootDirectoryDeleted();
            }
            if (!bVar.writeHeader(bufferedOutputStream)) {
                bufferedOutputStream.close();
                cu7.d("Failed to write header for %s", fileForKey.getAbsolutePath());
                throw new IOException();
            }
            bufferedOutputStream.write(aVar.data);
            bufferedOutputStream.close();
            bVar.size = fileForKey.length();
            putEntry(str, bVar);
            pruneIfNeeded();
        }
    }

    @Override // com.zepto.g90
    public synchronized void remove(String str) {
        boolean zDelete = getFileForKey(str).delete();
        removeEntry(str);
        if (!zDelete) {
            cu7.d("Could not delete cache entry for key=%s, filename=%s", str, getFilenameForKey(str));
        }
    }

    public static class b {
        final List<ml2> allResponseHeaders;
        final String etag;
        final String key;
        final long lastModified;
        final long serverDate;
        long size;
        final long softTtl;
        final long ttl;

        private b(String str, String str2, long j, long j2, long j3, long j4, List<ml2> list) {
            this.key = str;
            this.etag = "".equals(str2) ? null : str2;
            this.serverDate = j;
            this.lastModified = j2;
            this.ttl = j3;
            this.softTtl = j4;
            this.allResponseHeaders = list;
        }

        private static List<ml2> getAllResponseHeaders(g90.a aVar) {
            List<ml2> list = aVar.allResponseHeaders;
            return list != null ? list : xr2.toAllHeaderList(aVar.responseHeaders);
        }

        public static b readHeader(c cVar) throws IOException {
            if (fk1.readInt(cVar) == fk1.CACHE_MAGIC) {
                return new b(fk1.readString(cVar), fk1.readString(cVar), fk1.readLong(cVar), fk1.readLong(cVar), fk1.readLong(cVar), fk1.readLong(cVar), fk1.readHeaderList(cVar));
            }
            throw new IOException();
        }

        public g90.a toCacheEntry(byte[] bArr) {
            g90.a aVar = new g90.a();
            aVar.data = bArr;
            aVar.etag = this.etag;
            aVar.serverDate = this.serverDate;
            aVar.lastModified = this.lastModified;
            aVar.ttl = this.ttl;
            aVar.softTtl = this.softTtl;
            aVar.responseHeaders = xr2.toHeaderMap(this.allResponseHeaders);
            aVar.allResponseHeaders = Collections.unmodifiableList(this.allResponseHeaders);
            return aVar;
        }

        public boolean writeHeader(OutputStream outputStream) {
            try {
                fk1.writeInt(outputStream, fk1.CACHE_MAGIC);
                fk1.writeString(outputStream, this.key);
                String str = this.etag;
                if (str == null) {
                    str = "";
                }
                fk1.writeString(outputStream, str);
                fk1.writeLong(outputStream, this.serverDate);
                fk1.writeLong(outputStream, this.lastModified);
                fk1.writeLong(outputStream, this.ttl);
                fk1.writeLong(outputStream, this.softTtl);
                fk1.writeHeaderList(this.allResponseHeaders, outputStream);
                outputStream.flush();
                return true;
            } catch (IOException e) {
                cu7.d("%s", e.toString());
                return false;
            }
        }

        public b(String str, g90.a aVar) {
            this(str, aVar.etag, aVar.serverDate, aVar.lastModified, aVar.ttl, aVar.softTtl, getAllResponseHeaders(aVar));
        }
    }

    public fk1(d dVar, int i) {
        this.mEntries = new LinkedHashMap(16, 0.75f, true);
        this.mTotalSize = 0L;
        this.mRootDirectorySupplier = dVar;
        this.mMaxCacheSizeInBytes = i;
    }

    public fk1(File file) {
        this(file, DEFAULT_DISK_USAGE_BYTES);
    }

    public fk1(d dVar) {
        this(dVar, DEFAULT_DISK_USAGE_BYTES);
    }
}
