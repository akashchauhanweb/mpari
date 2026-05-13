package com.zepto;

import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class ve4 {
    public static Logger a = Logger.getLogger(ve4.class.getName());
    public static Map b = new HashMap();

    static {
        HashSet<Class> hashSet = new HashSet();
        hashSet.add(te1.class);
        hashSet.add(mg5.class);
        hashSet.add(q40.class);
        hashSet.add(c72.class);
        hashSet.add(ue4.class);
        hashSet.add(nw4.class);
        hashSet.add(qz.class);
        hashSet.add(e72.class);
        hashSet.add(sy1.class);
        hashSet.add(qe1.class);
        for (Class cls : hashSet) {
            qi1 qi1Var = (qi1) cls.getAnnotation(qi1.class);
            int[] iArrTags = qi1Var.tags();
            int iObjectTypeIndication = qi1Var.objectTypeIndication();
            Map map = (Map) b.get(Integer.valueOf(iObjectTypeIndication));
            if (map == null) {
                map = new HashMap();
            }
            for (int i : iArrTags) {
                map.put(Integer.valueOf(i), cls);
            }
            b.put(Integer.valueOf(iObjectTypeIndication), map);
        }
    }

    public static q40 a(int i, ByteBuffer byteBuffer) {
        q40 tp6Var;
        int iL = m13.l(byteBuffer);
        Map map = (Map) b.get(Integer.valueOf(i));
        if (map == null) {
            map = (Map) b.get(-1);
        }
        Class cls = (Class) map.get(Integer.valueOf(iL));
        if (cls == null || cls.isInterface() || Modifier.isAbstract(cls.getModifiers())) {
            a.warning("No ObjectDescriptor found for objectTypeIndication " + Integer.toHexString(i) + " and tag " + Integer.toHexString(iL) + " found: " + cls);
            tp6Var = new tp6();
        } else {
            try {
                tp6Var = (q40) cls.newInstance();
            } catch (Exception e) {
                a.log(Level.SEVERE, "Couldn't instantiate BaseDescriptor class " + cls + " for objectTypeIndication " + i + " and tag " + iL, (Throwable) e);
                throw new RuntimeException(e);
            }
        }
        tp6Var.d(iL, byteBuffer);
        return tp6Var;
    }
}
