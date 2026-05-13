package com.google.gson;

import com.google.gson.reflect.TypeToken;
import com.zepto.a66;
import com.zepto.b63;
import com.zepto.ce1;
import com.zepto.ei6;
import com.zepto.f53;
import com.zepto.ff4;
import com.zepto.go3;
import com.zepto.gp3;
import com.zepto.gv4;
import com.zepto.h75;
import com.zepto.hb2;
import com.zepto.hi6;
import com.zepto.i53;
import com.zepto.k53;
import com.zepto.kb2;
import com.zepto.kb3;
import com.zepto.le4;
import com.zepto.mr0;
import com.zepto.n75;
import com.zepto.no6;
import com.zepto.po6;
import com.zepto.qp3;
import com.zepto.rx0;
import com.zepto.s53;
import com.zepto.so6;
import com.zepto.sx;
import com.zepto.u53;
import com.zepto.uy5;
import com.zepto.v52;
import com.zepto.v53;
import com.zepto.v76;
import com.zepto.w53;
import com.zepto.x43;
import com.zepto.x53;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes.dex */
public final class Gson {
    static final boolean DEFAULT_COMPLEX_MAP_KEYS = false;
    static final String DEFAULT_DATE_PATTERN = null;
    static final boolean DEFAULT_ESCAPE_HTML = true;
    static final boolean DEFAULT_JSON_NON_EXECUTABLE = false;
    static final boolean DEFAULT_LENIENT = false;
    static final boolean DEFAULT_PRETTY_PRINT = false;
    static final boolean DEFAULT_SERIALIZE_NULLS = false;
    static final boolean DEFAULT_SPECIALIZE_FLOAT_VALUES = false;
    static final boolean DEFAULT_USE_JDK_UNSAFE = true;
    private static final String JSON_NON_EXECUTABLE_PREFIX = ")]}'\n";
    final List<po6> builderFactories;
    final List<po6> builderHierarchyFactories;
    private final ThreadLocal<Map<TypeToken<?>, FutureTypeAdapter<?>>> calls;
    final boolean complexMapKeySerialization;
    private final rx0 constructorConstructor;
    final String datePattern;
    final int dateStyle;
    final v52 excluder;
    final List<po6> factories;
    final kb2 fieldNamingStrategy;
    final boolean generateNonExecutableJson;
    final boolean htmlSafe;
    final Map<Type, Object> instanceCreators;
    private final x43 jsonAdapterFactory;
    final boolean lenient;
    final go3 longSerializationPolicy;
    final hi6 numberToNumberStrategy;
    final hi6 objectToNumberStrategy;
    final boolean prettyPrinting;
    final List<h75> reflectionFilters;
    final boolean serializeNulls;
    final boolean serializeSpecialFloatingPointValues;
    final int timeStyle;
    private final ConcurrentMap<TypeToken<?>, no6> typeTokenCache;
    final boolean useJdkUnsafe;
    static final kb2 DEFAULT_FIELD_NAMING_STRATEGY = hb2.c;
    static final hi6 DEFAULT_OBJECT_TO_NUMBER_STRATEGY = ei6.c;
    static final hi6 DEFAULT_NUMBER_TO_NUMBER_STRATEGY = ei6.e;

    public static class FutureTypeAdapter<T> extends uy5 {
        private no6 delegate;

        private no6 delegate() {
            no6 no6Var = this.delegate;
            if (no6Var != null) {
                return no6Var;
            }
            throw new IllegalStateException("Delegate has not been set yet");
        }

        @Override // com.zepto.uy5
        public no6 getSerializationDelegate() {
            return delegate();
        }

        @Override // com.zepto.no6
        public T read(s53 s53Var) throws IOException {
            return (T) delegate().read(s53Var);
        }

        public void setDelegate(no6 no6Var) {
            if (this.delegate != null) {
                throw new AssertionError();
            }
            this.delegate = no6Var;
        }

        @Override // com.zepto.no6
        public void write(b63 b63Var, T t) throws IOException {
            delegate().write(b63Var, t);
        }
    }

    public Gson() {
        this(v52.j, DEFAULT_FIELD_NAMING_STRATEGY, Collections.emptyMap(), false, false, false, true, false, false, false, true, go3.c, DEFAULT_DATE_PATTERN, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), DEFAULT_OBJECT_TO_NUMBER_STRATEGY, DEFAULT_NUMBER_TO_NUMBER_STRATEGY, Collections.emptyList());
    }

    private static void assertFullConsumption(Object obj, s53 s53Var) {
        if (obj != null) {
            try {
                if (s53Var.G0() == v53.END_DOCUMENT) {
                } else {
                    throw new u53("JSON document was not fully consumed.");
                }
            } catch (gp3 e) {
                throw new u53(e);
            } catch (IOException e2) {
                throw new i53(e2);
            }
        }
    }

    private static no6 atomicLongAdapter(final no6 no6Var) {
        return new no6() { // from class: com.google.gson.Gson.4
            @Override // com.zepto.no6
            public AtomicLong read(s53 s53Var) throws IOException {
                return new AtomicLong(((Number) no6Var.read(s53Var)).longValue());
            }

            @Override // com.zepto.no6
            public void write(b63 b63Var, AtomicLong atomicLong) throws IOException {
                no6Var.write(b63Var, Long.valueOf(atomicLong.get()));
            }
        }.nullSafe();
    }

    private static no6 atomicLongArrayAdapter(final no6 no6Var) {
        return new no6() { // from class: com.google.gson.Gson.5
            @Override // com.zepto.no6
            public AtomicLongArray read(s53 s53Var) throws IOException {
                ArrayList arrayList = new ArrayList();
                s53Var.d();
                while (s53Var.d0()) {
                    arrayList.add(Long.valueOf(((Number) no6Var.read(s53Var)).longValue()));
                }
                s53Var.w();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
            }

            @Override // com.zepto.no6
            public void write(b63 b63Var, AtomicLongArray atomicLongArray) throws IOException {
                b63Var.j();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    no6Var.write(b63Var, Long.valueOf(atomicLongArray.get(i)));
                }
                b63Var.w();
            }
        }.nullSafe();
    }

    public static void checkValidFloatingPoint(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private no6 doubleAdapter(boolean z) {
        return z ? so6.v : new no6() { // from class: com.google.gson.Gson.1
            @Override // com.zepto.no6
            public Double read(s53 s53Var) throws IOException {
                if (s53Var.G0() != v53.NULL) {
                    return Double.valueOf(s53Var.x0());
                }
                s53Var.C0();
                return null;
            }

            @Override // com.zepto.no6
            public void write(b63 b63Var, Number number) throws IOException {
                if (number == null) {
                    b63Var.m0();
                    return;
                }
                double dDoubleValue = number.doubleValue();
                Gson.checkValidFloatingPoint(dDoubleValue);
                b63Var.F0(dDoubleValue);
            }
        };
    }

    private no6 floatAdapter(boolean z) {
        return z ? so6.u : new no6() { // from class: com.google.gson.Gson.2
            @Override // com.zepto.no6
            public Float read(s53 s53Var) throws IOException {
                if (s53Var.G0() != v53.NULL) {
                    return Float.valueOf((float) s53Var.x0());
                }
                s53Var.C0();
                return null;
            }

            @Override // com.zepto.no6
            public void write(b63 b63Var, Number number) throws IOException {
                if (number == null) {
                    b63Var.m0();
                    return;
                }
                float fFloatValue = number.floatValue();
                Gson.checkValidFloatingPoint(fFloatValue);
                if (!(number instanceof Float)) {
                    number = Float.valueOf(fFloatValue);
                }
                b63Var.I0(number);
            }
        };
    }

    private static no6 longAdapter(go3 go3Var) {
        return go3Var == go3.c ? so6.t : new no6() { // from class: com.google.gson.Gson.3
            @Override // com.zepto.no6
            public Number read(s53 s53Var) throws IOException {
                if (s53Var.G0() != v53.NULL) {
                    return Long.valueOf(s53Var.z0());
                }
                s53Var.C0();
                return null;
            }

            @Override // com.zepto.no6
            public void write(b63 b63Var, Number number) throws IOException {
                if (number == null) {
                    b63Var.m0();
                } else {
                    b63Var.J0(number.toString());
                }
            }
        };
    }

    @Deprecated
    public v52 excluder() {
        return this.excluder;
    }

    public kb2 fieldNamingStrategy() {
        return this.fieldNamingStrategy;
    }

    public <T> T fromJson(String str, Class<T> cls) throws u53 {
        return (T) gv4.b(cls).cast(fromJson(str, TypeToken.get((Class) cls)));
    }

    public <T> no6 getAdapter(TypeToken<T> typeToken) {
        boolean z;
        Objects.requireNonNull(typeToken, "type must not be null");
        no6 no6Var = this.typeTokenCache.get(typeToken);
        if (no6Var != null) {
            return no6Var;
        }
        Map<TypeToken<?>, FutureTypeAdapter<?>> map = this.calls.get();
        if (map == null) {
            map = new HashMap<>();
            this.calls.set(map);
            z = true;
        } else {
            z = false;
        }
        FutureTypeAdapter<?> futureTypeAdapter = map.get(typeToken);
        if (futureTypeAdapter != null) {
            return futureTypeAdapter;
        }
        try {
            FutureTypeAdapter<?> futureTypeAdapter2 = new FutureTypeAdapter<>();
            map.put(typeToken, futureTypeAdapter2);
            Iterator<po6> it = this.factories.iterator();
            while (it.hasNext()) {
                no6 no6VarA = it.next().a(this, typeToken);
                if (no6VarA != null) {
                    no6 no6VarPutIfAbsent = this.typeTokenCache.putIfAbsent(typeToken, no6VarA);
                    if (no6VarPutIfAbsent != null) {
                        no6VarA = no6VarPutIfAbsent;
                    }
                    futureTypeAdapter2.setDelegate(no6VarA);
                    return no6VarA;
                }
            }
            throw new IllegalArgumentException("GSON (2.10) cannot handle " + typeToken);
        } finally {
            map.remove(typeToken);
            if (z) {
                this.calls.remove();
            }
        }
    }

    public <T> no6 getDelegateAdapter(po6 po6Var, TypeToken<T> typeToken) {
        if (!this.factories.contains(po6Var)) {
            po6Var = this.jsonAdapterFactory;
        }
        boolean z = false;
        for (po6 po6Var2 : this.factories) {
            if (z) {
                no6 no6VarA = po6Var2.a(this, typeToken);
                if (no6VarA != null) {
                    return no6VarA;
                }
            } else if (po6Var2 == po6Var) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + typeToken);
    }

    public boolean htmlSafe() {
        return this.htmlSafe;
    }

    public GsonBuilder newBuilder() {
        return new GsonBuilder(this);
    }

    public s53 newJsonReader(Reader reader) {
        s53 s53Var = new s53(reader);
        s53Var.L0(this.lenient);
        return s53Var;
    }

    public b63 newJsonWriter(Writer writer) throws IOException {
        if (this.generateNonExecutableJson) {
            writer.write(JSON_NON_EXECUTABLE_PREFIX);
        }
        b63 b63Var = new b63(writer);
        if (this.prettyPrinting) {
            b63Var.B0("  ");
        }
        b63Var.A0(this.htmlSafe);
        b63Var.C0(this.lenient);
        b63Var.D0(this.serializeNulls);
        return b63Var;
    }

    public boolean serializeNulls() {
        return this.serializeNulls;
    }

    public String toJson(Object obj) {
        return obj == null ? toJson((f53) k53.c) : toJson(obj, obj.getClass());
    }

    public f53 toJsonTree(Object obj) {
        return obj == null ? k53.c : toJsonTree(obj, obj.getClass());
    }

    public String toString() {
        return "{serializeNulls:" + this.serializeNulls + ",factories:" + this.factories + ",instanceCreators:" + this.constructorConstructor + "}";
    }

    public <T> T fromJson(String str, Type type) throws u53 {
        return (T) fromJson(str, TypeToken.get(type));
    }

    public String toJson(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        toJson(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public f53 toJsonTree(Object obj, Type type) {
        x53 x53Var = new x53();
        toJson(obj, type, x53Var);
        return x53Var.M0();
    }

    public <T> T fromJson(String str, TypeToken<T> typeToken) throws u53 {
        if (str == null) {
            return null;
        }
        return (T) fromJson(new StringReader(str), typeToken);
    }

    public <T> T fromJson(Reader reader, Class<T> cls) throws i53, u53 {
        return (T) gv4.b(cls).cast(fromJson(reader, TypeToken.get((Class) cls)));
    }

    public void toJson(Object obj, Appendable appendable) throws i53 {
        if (obj != null) {
            toJson(obj, obj.getClass(), appendable);
        } else {
            toJson((f53) k53.c, appendable);
        }
    }

    public Gson(v52 v52Var, kb2 kb2Var, Map<Type, Object> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, go3 go3Var, String str, int i, int i2, List<po6> list, List<po6> list2, List<po6> list3, hi6 hi6Var, hi6 hi6Var2, List<h75> list4) {
        this.calls = new ThreadLocal<>();
        this.typeTokenCache = new ConcurrentHashMap();
        this.excluder = v52Var;
        this.fieldNamingStrategy = kb2Var;
        this.instanceCreators = map;
        rx0 rx0Var = new rx0(map, z8, list4);
        this.constructorConstructor = rx0Var;
        this.serializeNulls = z;
        this.complexMapKeySerialization = z2;
        this.generateNonExecutableJson = z3;
        this.htmlSafe = z4;
        this.prettyPrinting = z5;
        this.lenient = z6;
        this.serializeSpecialFloatingPointValues = z7;
        this.useJdkUnsafe = z8;
        this.longSerializationPolicy = go3Var;
        this.datePattern = str;
        this.dateStyle = i;
        this.timeStyle = i2;
        this.builderFactories = list;
        this.builderHierarchyFactories = list2;
        this.objectToNumberStrategy = hi6Var;
        this.numberToNumberStrategy = hi6Var2;
        this.reflectionFilters = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(so6.W);
        arrayList.add(ff4.a(hi6Var));
        arrayList.add(v52Var);
        arrayList.addAll(list3);
        arrayList.add(so6.C);
        arrayList.add(so6.m);
        arrayList.add(so6.g);
        arrayList.add(so6.i);
        arrayList.add(so6.k);
        no6 no6VarLongAdapter = longAdapter(go3Var);
        arrayList.add(so6.c(Long.TYPE, Long.class, no6VarLongAdapter));
        arrayList.add(so6.c(Double.TYPE, Double.class, doubleAdapter(z7)));
        arrayList.add(so6.c(Float.TYPE, Float.class, floatAdapter(z7)));
        arrayList.add(le4.a(hi6Var2));
        arrayList.add(so6.o);
        arrayList.add(so6.q);
        arrayList.add(so6.b(AtomicLong.class, atomicLongAdapter(no6VarLongAdapter)));
        arrayList.add(so6.b(AtomicLongArray.class, atomicLongArrayAdapter(no6VarLongAdapter)));
        arrayList.add(so6.s);
        arrayList.add(so6.x);
        arrayList.add(so6.E);
        arrayList.add(so6.G);
        arrayList.add(so6.b(BigDecimal.class, so6.z));
        arrayList.add(so6.b(BigInteger.class, so6.A));
        arrayList.add(so6.b(kb3.class, so6.B));
        arrayList.add(so6.I);
        arrayList.add(so6.K);
        arrayList.add(so6.O);
        arrayList.add(so6.Q);
        arrayList.add(so6.U);
        arrayList.add(so6.M);
        arrayList.add(so6.d);
        arrayList.add(ce1.b);
        arrayList.add(so6.S);
        if (a66.a) {
            arrayList.add(a66.e);
            arrayList.add(a66.d);
            arrayList.add(a66.f);
        }
        arrayList.add(sx.c);
        arrayList.add(so6.b);
        arrayList.add(new mr0(rx0Var));
        arrayList.add(new qp3(rx0Var, z2));
        x43 x43Var = new x43(rx0Var);
        this.jsonAdapterFactory = x43Var;
        arrayList.add(x43Var);
        arrayList.add(so6.X);
        arrayList.add(new n75(rx0Var, kb2Var, v52Var, x43Var, list4));
        this.factories = Collections.unmodifiableList(arrayList);
    }

    public <T> T fromJson(Reader reader, Type type) throws i53, u53 {
        return (T) fromJson(reader, TypeToken.get(type));
    }

    public void toJson(Object obj, Type type, Appendable appendable) throws i53 {
        try {
            toJson(obj, type, newJsonWriter(v76.c(appendable)));
        } catch (IOException e) {
            throw new i53(e);
        }
    }

    public <T> T fromJson(Reader reader, TypeToken<T> typeToken) throws i53, u53 {
        s53 s53VarNewJsonReader = newJsonReader(reader);
        T t = (T) fromJson(s53VarNewJsonReader, typeToken);
        assertFullConsumption(t, s53VarNewJsonReader);
        return t;
    }

    public void toJson(Object obj, Type type, b63 b63Var) throws i53 {
        no6 adapter = getAdapter(TypeToken.get(type));
        boolean zU = b63Var.U();
        b63Var.C0(true);
        boolean zP = b63Var.P();
        b63Var.A0(this.htmlSafe);
        boolean zD = b63Var.D();
        b63Var.D0(this.serializeNulls);
        try {
            try {
                adapter.write(b63Var, obj);
            } catch (IOException e) {
                throw new i53(e);
            } catch (AssertionError e2) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.10): " + e2.getMessage());
                assertionError.initCause(e2);
                throw assertionError;
            }
        } finally {
            b63Var.C0(zU);
            b63Var.A0(zP);
            b63Var.D0(zD);
        }
    }

    public <T> T fromJson(s53 s53Var, Type type) throws i53, u53 {
        return (T) fromJson(s53Var, TypeToken.get(type));
    }

    public <T> T fromJson(s53 s53Var, TypeToken<T> typeToken) throws i53, u53 {
        boolean zE0 = s53Var.e0();
        boolean z = true;
        s53Var.L0(true);
        try {
            try {
                try {
                    s53Var.G0();
                    z = false;
                    return (T) getAdapter(typeToken).read(s53Var);
                } catch (EOFException e) {
                    if (z) {
                        s53Var.L0(zE0);
                        return null;
                    }
                    throw new u53(e);
                } catch (IOException e2) {
                    throw new u53(e2);
                }
            } catch (AssertionError e3) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.10): " + e3.getMessage());
                assertionError.initCause(e3);
                throw assertionError;
            } catch (IllegalStateException e4) {
                throw new u53(e4);
            }
        } finally {
            s53Var.L0(zE0);
        }
    }

    public <T> no6 getAdapter(Class<T> cls) {
        return getAdapter(TypeToken.get((Class) cls));
    }

    public <T> T fromJson(f53 f53Var, Class<T> cls) throws u53 {
        return (T) gv4.b(cls).cast(fromJson(f53Var, TypeToken.get((Class) cls)));
    }

    public <T> T fromJson(f53 f53Var, Type type) throws u53 {
        return (T) fromJson(f53Var, TypeToken.get(type));
    }

    public String toJson(f53 f53Var) {
        StringWriter stringWriter = new StringWriter();
        toJson(f53Var, (Appendable) stringWriter);
        return stringWriter.toString();
    }

    public <T> T fromJson(f53 f53Var, TypeToken<T> typeToken) throws u53 {
        if (f53Var == null) {
            return null;
        }
        return (T) fromJson(new w53(f53Var), typeToken);
    }

    public void toJson(f53 f53Var, Appendable appendable) throws i53 {
        try {
            toJson(f53Var, newJsonWriter(v76.c(appendable)));
        } catch (IOException e) {
            throw new i53(e);
        }
    }

    public void toJson(f53 f53Var, b63 b63Var) throws i53 {
        boolean zU = b63Var.U();
        b63Var.C0(true);
        boolean zP = b63Var.P();
        b63Var.A0(this.htmlSafe);
        boolean zD = b63Var.D();
        b63Var.D0(this.serializeNulls);
        try {
            try {
                v76.b(f53Var, b63Var);
            } catch (IOException e) {
                throw new i53(e);
            } catch (AssertionError e2) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.10): " + e2.getMessage());
                assertionError.initCause(e2);
                throw assertionError;
            }
        } finally {
            b63Var.C0(zU);
            b63Var.A0(zP);
            b63Var.D0(zD);
        }
    }
}
