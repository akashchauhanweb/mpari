package com.zepto;

import java.io.File;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public class yk4 implements eq3 {
    @Override // com.zepto.eq3
    public xm6 a(Class cls) {
        String name = cls.getName();
        return name.startsWith("java.lang") ? d(cls) : name.startsWith("java.util") ? h(cls) : name.startsWith("java.net") ? g(cls) : name.startsWith("java.io") ? c(cls) : name.startsWith("java.sql") ? f(cls) : name.startsWith("java.math") ? e(cls) : b(cls);
    }

    public final xm6 b(Class cls) {
        Class superclass = cls.getSuperclass();
        if (superclass == null) {
            return null;
        }
        if (superclass.isEnum() || cls.isEnum()) {
            return new v22(cls);
        }
        return null;
    }

    public final xm6 c(Class cls) {
        if (cls == File.class) {
            return new ub2();
        }
        return null;
    }

    public final xm6 d(Class cls) {
        if (cls == Boolean.class) {
            return new f70();
        }
        if (cls == Integer.class) {
            return new p03();
        }
        if (cls == Long.class) {
            return new jo3();
        }
        if (cls == Double.class) {
            return new ju1();
        }
        if (cls == Float.class) {
            return new kd2();
        }
        if (cls == Short.class) {
            return new l16();
        }
        if (cls == Byte.class) {
            return new v80();
        }
        if (cls == Character.class) {
            return new zi0();
        }
        if (cls == String.class) {
            return new f86();
        }
        if (cls == Class.class) {
            return new cq0();
        }
        return null;
    }

    public final xm6 e(Class cls) {
        if (cls == BigDecimal.class) {
            return new r50();
        }
        if (cls == BigInteger.class) {
            return new s50();
        }
        return null;
    }

    public final xm6 f(Class cls) {
        if (cls == Time.class || cls == Date.class || cls == Timestamp.class) {
            return new ae1(cls);
        }
        return null;
    }

    public final xm6 g(Class cls) {
        if (cls == URL.class) {
            return new ip6();
        }
        return null;
    }

    public final xm6 h(Class cls) {
        if (cls == java.util.Date.class) {
            return new ae1(cls);
        }
        if (cls == Locale.class) {
            return new pm3();
        }
        if (cls == Currency.class) {
            return new w31();
        }
        if (cls == GregorianCalendar.class) {
            return new lk2();
        }
        if (cls == TimeZone.class) {
            return new bg6();
        }
        if (cls == AtomicInteger.class) {
            return new jy();
        }
        if (cls == AtomicLong.class) {
            return new ly();
        }
        return null;
    }
}
