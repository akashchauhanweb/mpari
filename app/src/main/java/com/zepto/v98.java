package com.zepto;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class v98 extends gc8 {
    public final File c;
    public final File e;
    public final NavigableMap f = new TreeMap();

    public v98(File file, File file2) throws IOException {
        this.c = file;
        this.e = file2;
        List<File> listA = jg8.a(file, file2);
        if (listA.isEmpty()) {
            throw new bc8(String.format("Virtualized slice archive empty for %s, %s", file, file2));
        }
        long length = 0;
        for (File file3 : listA) {
            this.f.put(Long.valueOf(length), file3);
            length += file3.length();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.zepto.gc8
    public final long d() {
        Map.Entry entryLastEntry = this.f.lastEntry();
        return ((Long) entryLastEntry.getKey()).longValue() + ((File) entryLastEntry.getValue()).length();
    }

    @Override // com.zepto.gc8
    public final InputStream e(long j, long j2) {
        if (j < 0 || j2 < 0) {
            throw new bc8(String.format("Invalid input parameters %s, %s", Long.valueOf(j), Long.valueOf(j2)));
        }
        long j3 = j + j2;
        if (j3 > d()) {
            throw new bc8(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", Long.valueOf(d()), Long.valueOf(j3)));
        }
        Long l = (Long) this.f.floorKey(Long.valueOf(j));
        Long l2 = (Long) this.f.floorKey(Long.valueOf(j3));
        if (l.equals(l2)) {
            return new u98(m(j, l), j2);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(m(j, l));
        Collection collectionValues = this.f.subMap(l, false, l2, false).values();
        if (!collectionValues.isEmpty()) {
            arrayList.add(new xe8(Collections.enumeration(collectionValues)));
        }
        arrayList.add(new u98(new FileInputStream((File) this.f.get(l2)), j2 - (l2.longValue() - j)));
        return new SequenceInputStream(Collections.enumeration(arrayList));
    }

    public final InputStream m(long j, Long l) {
        FileInputStream fileInputStream = new FileInputStream((File) this.f.get(l));
        if (fileInputStream.skip(j - l.longValue()) == j - l.longValue()) {
            return fileInputStream;
        }
        throw new bc8(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", l));
    }
}
