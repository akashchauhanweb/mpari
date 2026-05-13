package com.google.gson;

import com.google.gson.reflect.TypeToken;
import com.zepto.a66;
import com.zepto.b;
import com.zepto.ef1;
import com.zepto.go3;
import com.zepto.h75;
import com.zepto.hb2;
import com.zepto.hi6;
import com.zepto.kb2;
import com.zepto.no6;
import com.zepto.po6;
import com.zepto.so6;
import com.zepto.v52;
import com.zepto.w52;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class GsonBuilder {
    private boolean complexMapKeySerialization;
    private String datePattern;
    private int dateStyle;
    private boolean escapeHtmlChars;
    private v52 excluder;
    private final List<po6> factories;
    private kb2 fieldNamingPolicy;
    private boolean generateNonExecutableJson;
    private final List<po6> hierarchyFactories;
    private final Map<Type, Object> instanceCreators;
    private boolean lenient;
    private go3 longSerializationPolicy;
    private hi6 numberToNumberStrategy;
    private hi6 objectToNumberStrategy;
    private boolean prettyPrinting;
    private final LinkedList<h75> reflectionFilters;
    private boolean serializeNulls;
    private boolean serializeSpecialFloatingPointValues;
    private int timeStyle;
    private boolean useJdkUnsafe;

    public GsonBuilder() {
        this.excluder = v52.j;
        this.longSerializationPolicy = go3.c;
        this.fieldNamingPolicy = hb2.c;
        this.instanceCreators = new HashMap();
        this.factories = new ArrayList();
        this.hierarchyFactories = new ArrayList();
        this.serializeNulls = false;
        this.datePattern = Gson.DEFAULT_DATE_PATTERN;
        this.dateStyle = 2;
        this.timeStyle = 2;
        this.complexMapKeySerialization = false;
        this.serializeSpecialFloatingPointValues = false;
        this.escapeHtmlChars = true;
        this.prettyPrinting = false;
        this.generateNonExecutableJson = false;
        this.lenient = false;
        this.useJdkUnsafe = true;
        this.objectToNumberStrategy = Gson.DEFAULT_OBJECT_TO_NUMBER_STRATEGY;
        this.numberToNumberStrategy = Gson.DEFAULT_NUMBER_TO_NUMBER_STRATEGY;
        this.reflectionFilters = new LinkedList<>();
    }

    private void addTypeAdaptersForDate(String str, int i, int i2, List<po6> list) {
        po6 po6VarB;
        po6 po6VarB2;
        boolean z = a66.a;
        po6 po6VarA = null;
        if (str != null && !str.trim().isEmpty()) {
            po6VarB = ef1.b.b.b(str);
            if (z) {
                po6VarA = a66.c.b(str);
                po6VarB2 = a66.b.b(str);
            } else {
                po6VarB2 = null;
            }
        } else {
            if (i == 2 || i2 == 2) {
                return;
            }
            po6 po6VarA2 = ef1.b.b.a(i, i2);
            if (z) {
                po6VarA = a66.c.a(i, i2);
                po6 po6VarA3 = a66.b.a(i, i2);
                po6VarB = po6VarA2;
                po6VarB2 = po6VarA3;
            } else {
                po6VarB = po6VarA2;
                po6VarB2 = null;
            }
        }
        list.add(po6VarB);
        if (z) {
            list.add(po6VarA);
            list.add(po6VarB2);
        }
    }

    public GsonBuilder addDeserializationExclusionStrategy(w52 w52Var) {
        Objects.requireNonNull(w52Var);
        this.excluder = this.excluder.r(w52Var, false, true);
        return this;
    }

    public GsonBuilder addReflectionAccessFilter(h75 h75Var) {
        Objects.requireNonNull(h75Var);
        this.reflectionFilters.addFirst(h75Var);
        return this;
    }

    public GsonBuilder addSerializationExclusionStrategy(w52 w52Var) {
        Objects.requireNonNull(w52Var);
        this.excluder = this.excluder.r(w52Var, true, false);
        return this;
    }

    public Gson create() {
        List<po6> arrayList = new ArrayList<>(this.factories.size() + this.hierarchyFactories.size() + 3);
        arrayList.addAll(this.factories);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.hierarchyFactories);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        addTypeAdaptersForDate(this.datePattern, this.dateStyle, this.timeStyle, arrayList);
        return new Gson(this.excluder, this.fieldNamingPolicy, new HashMap(this.instanceCreators), this.serializeNulls, this.complexMapKeySerialization, this.generateNonExecutableJson, this.escapeHtmlChars, this.prettyPrinting, this.lenient, this.serializeSpecialFloatingPointValues, this.useJdkUnsafe, this.longSerializationPolicy, this.datePattern, this.dateStyle, this.timeStyle, new ArrayList(this.factories), new ArrayList(this.hierarchyFactories), arrayList, this.objectToNumberStrategy, this.numberToNumberStrategy, new ArrayList(this.reflectionFilters));
    }

    public GsonBuilder disableHtmlEscaping() {
        this.escapeHtmlChars = false;
        return this;
    }

    public GsonBuilder disableInnerClassSerialization() {
        this.excluder = this.excluder.c();
        return this;
    }

    public GsonBuilder disableJdkUnsafe() {
        this.useJdkUnsafe = false;
        return this;
    }

    public GsonBuilder enableComplexMapKeySerialization() {
        this.complexMapKeySerialization = true;
        return this;
    }

    public GsonBuilder excludeFieldsWithModifiers(int... iArr) {
        Objects.requireNonNull(iArr);
        this.excluder = this.excluder.s(iArr);
        return this;
    }

    public GsonBuilder excludeFieldsWithoutExposeAnnotation() {
        this.excluder = this.excluder.h();
        return this;
    }

    public GsonBuilder generateNonExecutableJson() {
        this.generateNonExecutableJson = true;
        return this;
    }

    public GsonBuilder registerTypeAdapter(Type type, Object obj) {
        Objects.requireNonNull(type);
        b.a(obj instanceof no6);
        if (obj instanceof no6) {
            this.factories.add(so6.a(TypeToken.get(type), (no6) obj));
        }
        return this;
    }

    public GsonBuilder registerTypeAdapterFactory(po6 po6Var) {
        Objects.requireNonNull(po6Var);
        this.factories.add(po6Var);
        return this;
    }

    public GsonBuilder registerTypeHierarchyAdapter(Class<?> cls, Object obj) {
        Objects.requireNonNull(cls);
        b.a(obj instanceof no6);
        if (obj instanceof no6) {
            this.factories.add(so6.e(cls, (no6) obj));
        }
        return this;
    }

    public GsonBuilder serializeNulls() {
        this.serializeNulls = true;
        return this;
    }

    public GsonBuilder serializeSpecialFloatingPointValues() {
        this.serializeSpecialFloatingPointValues = true;
        return this;
    }

    public GsonBuilder setDateFormat(int i) {
        this.dateStyle = i;
        this.datePattern = null;
        return this;
    }

    public GsonBuilder setExclusionStrategies(w52... w52VarArr) {
        Objects.requireNonNull(w52VarArr);
        for (w52 w52Var : w52VarArr) {
            this.excluder = this.excluder.r(null, true, true);
        }
        return this;
    }

    public GsonBuilder setFieldNamingPolicy(hb2 hb2Var) {
        return setFieldNamingStrategy(hb2Var);
    }

    public GsonBuilder setFieldNamingStrategy(kb2 kb2Var) {
        Objects.requireNonNull(kb2Var);
        this.fieldNamingPolicy = kb2Var;
        return this;
    }

    public GsonBuilder setLenient() {
        this.lenient = true;
        return this;
    }

    public GsonBuilder setLongSerializationPolicy(go3 go3Var) {
        Objects.requireNonNull(go3Var);
        this.longSerializationPolicy = go3Var;
        return this;
    }

    public GsonBuilder setNumberToNumberStrategy(hi6 hi6Var) {
        Objects.requireNonNull(hi6Var);
        this.numberToNumberStrategy = hi6Var;
        return this;
    }

    public GsonBuilder setObjectToNumberStrategy(hi6 hi6Var) {
        Objects.requireNonNull(hi6Var);
        this.objectToNumberStrategy = hi6Var;
        return this;
    }

    public GsonBuilder setPrettyPrinting() {
        this.prettyPrinting = true;
        return this;
    }

    public GsonBuilder setVersion(double d) {
        if (!Double.isNaN(d) && d >= 0.0d) {
            this.excluder = this.excluder.t(d);
            return this;
        }
        throw new IllegalArgumentException("Invalid version: " + d);
    }

    public GsonBuilder setDateFormat(int i, int i2) {
        this.dateStyle = i;
        this.timeStyle = i2;
        this.datePattern = null;
        return this;
    }

    public GsonBuilder setDateFormat(String str) {
        this.datePattern = str;
        return this;
    }

    public GsonBuilder(Gson gson) {
        this.excluder = v52.j;
        this.longSerializationPolicy = go3.c;
        this.fieldNamingPolicy = hb2.c;
        HashMap map = new HashMap();
        this.instanceCreators = map;
        ArrayList arrayList = new ArrayList();
        this.factories = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.hierarchyFactories = arrayList2;
        this.serializeNulls = false;
        this.datePattern = Gson.DEFAULT_DATE_PATTERN;
        this.dateStyle = 2;
        this.timeStyle = 2;
        this.complexMapKeySerialization = false;
        this.serializeSpecialFloatingPointValues = false;
        this.escapeHtmlChars = true;
        this.prettyPrinting = false;
        this.generateNonExecutableJson = false;
        this.lenient = false;
        this.useJdkUnsafe = true;
        this.objectToNumberStrategy = Gson.DEFAULT_OBJECT_TO_NUMBER_STRATEGY;
        this.numberToNumberStrategy = Gson.DEFAULT_NUMBER_TO_NUMBER_STRATEGY;
        LinkedList<h75> linkedList = new LinkedList<>();
        this.reflectionFilters = linkedList;
        this.excluder = gson.excluder;
        this.fieldNamingPolicy = gson.fieldNamingStrategy;
        map.putAll(gson.instanceCreators);
        this.serializeNulls = gson.serializeNulls;
        this.complexMapKeySerialization = gson.complexMapKeySerialization;
        this.generateNonExecutableJson = gson.generateNonExecutableJson;
        this.escapeHtmlChars = gson.htmlSafe;
        this.prettyPrinting = gson.prettyPrinting;
        this.lenient = gson.lenient;
        this.serializeSpecialFloatingPointValues = gson.serializeSpecialFloatingPointValues;
        this.longSerializationPolicy = gson.longSerializationPolicy;
        this.datePattern = gson.datePattern;
        this.dateStyle = gson.dateStyle;
        this.timeStyle = gson.timeStyle;
        arrayList.addAll(gson.builderFactories);
        arrayList2.addAll(gson.builderHierarchyFactories);
        this.useJdkUnsafe = gson.useJdkUnsafe;
        this.objectToNumberStrategy = gson.objectToNumberStrategy;
        this.numberToNumberStrategy = gson.numberToNumberStrategy;
        linkedList.addAll(gson.reflectionFilters);
    }
}
