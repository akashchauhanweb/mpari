package com.zepto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class l82 {
    public static final l82 a = new l82();

    public final Object a(String str, ClassLoader classLoader, Class cls) throws ClassNotFoundException {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    public final List b(Class cls, ClassLoader classLoader) {
        try {
            return d(cls, classLoader);
        } catch (Throwable unused) {
            return CollectionsKt___CollectionsKt.toList(ServiceLoader.load(cls, classLoader));
        }
    }

    public final List c() {
        cp3 cp3Var;
        if (!m82.a()) {
            return b(cp3.class, cp3.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            cp3 cp3Var2 = null;
            try {
                cp3Var = (cp3) cp3.class.cast(Class.forName("com.zepto.ap", true, cp3.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                cp3Var = null;
            }
            if (cp3Var != null) {
                arrayList.add(cp3Var);
            }
            try {
                cp3Var2 = (cp3) cp3.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, cp3.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (cp3Var2 == null) {
                return arrayList;
            }
            arrayList.add(cp3Var2);
            return arrayList;
        } catch (Throwable unused3) {
            return b(cp3.class, cp3.class.getClassLoader());
        }
    }

    public final List d(Class cls, ClassLoader classLoader) {
        ArrayList list = Collections.list(classLoader.getResources("META-INF/services/" + cls.getName()));
        Intrinsics.checkNotNullExpressionValue(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, a.e((URL) it.next()));
        }
        Set set = CollectionsKt___CollectionsKt.toSet(arrayList);
        if (!(!set.isEmpty())) {
            throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10));
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList2.add(a.a((String) it2.next(), classLoader, cls));
        }
        return arrayList2;
    }

    public final List e(URL url) throws IOException {
        BufferedReader bufferedReader;
        String string = url.toString();
        if (!StringsKt__StringsJVMKt.startsWith$default(string, "jar", false, 2, null)) {
            bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            try {
                List listF = a.f(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, null);
                return listF;
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        }
        String strSubstringBefore$default = StringsKt__StringsKt.substringBefore$default(StringsKt__StringsKt.substringAfter$default(string, "jar:file:", (String) null, 2, (Object) null), '!', (String) null, 2, (Object) null);
        String strSubstringAfter$default = StringsKt__StringsKt.substringAfter$default(string, "!/", (String) null, 2, (Object) null);
        JarFile jarFile = new JarFile(strSubstringBefore$default, false);
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(strSubstringAfter$default)), "UTF-8"));
            try {
                List listF2 = a.f(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, null);
                jarFile.close();
                return listF2;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    jarFile.close();
                    throw th3;
                } catch (Throwable th4) {
                    ExceptionsKt__ExceptionsKt.addSuppressed(th2, th4);
                    throw th2;
                }
            }
        }
    }

    public final List f(BufferedReader bufferedReader) throws IOException {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return CollectionsKt___CollectionsKt.toList(linkedHashSet);
            }
            String string = StringsKt__StringsKt.trim((CharSequence) StringsKt__StringsKt.substringBefore$default(line, "#", (String) null, 2, (Object) null)).toString();
            for (int i = 0; i < string.length(); i++) {
                char cCharAt = string.charAt(i);
                if (cCharAt != '.' && !Character.isJavaIdentifierPart(cCharAt)) {
                    throw new IllegalArgumentException(("Illegal service provider class name: " + string).toString());
                }
            }
            if (string.length() > 0) {
                linkedHashSet.add(string);
            }
        }
    }
}
