package com.zepto;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o75 {
    public static Class a(Type type) {
        Class clsC = c(((GenericArrayType) type).getGenericComponentType());
        if (clsC != null) {
            return Array.newInstance((Class<?>) clsC, 0).getClass();
        }
        return null;
    }

    public static Class b(ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (actualTypeArguments.length > 0) {
            return c(actualTypeArguments[0]);
        }
        return null;
    }

    public static Class c(Type type) {
        return type instanceof Class ? (Class) type : f(type);
    }

    public static Class[] d(ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Class[] clsArr = new Class[actualTypeArguments.length];
        for (int i = 0; i < actualTypeArguments.length; i++) {
            clsArr[i] = c(actualTypeArguments[i]);
        }
        return clsArr;
    }

    public static Class[] e(Field field) {
        ParameterizedType parameterizedTypeN = n(field);
        return parameterizedTypeN != null ? d(parameterizedTypeN) : new Class[0];
    }

    public static Class f(Type type) {
        return type instanceof GenericArrayType ? a(type) : Object.class;
    }

    public static String g(String str) {
        if (str.length() <= 0) {
            return str;
        }
        char[] charArray = str.toCharArray();
        char c = charArray[0];
        if (!o(charArray)) {
            charArray[0] = q(c);
        }
        return new String(charArray);
    }

    public static Class h(Method method, int i) {
        ParameterizedType parameterizedTypeJ = j(method, i);
        return parameterizedTypeJ != null ? b(parameterizedTypeJ) : Object.class;
    }

    public static Class[] i(Method method, int i) {
        ParameterizedType parameterizedTypeJ = j(method, i);
        return parameterizedTypeJ != null ? d(parameterizedTypeJ) : new Class[0];
    }

    public static ParameterizedType j(Method method, int i) {
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        if (genericParameterTypes.length <= i) {
            return null;
        }
        Type type = genericParameterTypes[i];
        if (type instanceof ParameterizedType) {
            return (ParameterizedType) type;
        }
        return null;
    }

    public static Class k(Method method) {
        ParameterizedType parameterizedTypeM = m(method);
        return parameterizedTypeM != null ? b(parameterizedTypeM) : Object.class;
    }

    public static Class[] l(Method method) {
        ParameterizedType parameterizedTypeM = m(method);
        return parameterizedTypeM != null ? d(parameterizedTypeM) : new Class[0];
    }

    public static ParameterizedType m(Method method) {
        Type genericReturnType = method.getGenericReturnType();
        if (genericReturnType instanceof ParameterizedType) {
            return (ParameterizedType) genericReturnType;
        }
        return null;
    }

    public static ParameterizedType n(Field field) {
        Type genericType = field.getGenericType();
        if (genericType instanceof ParameterizedType) {
            return (ParameterizedType) genericType;
        }
        return null;
    }

    public static boolean o(char[] cArr) {
        if (cArr.length >= 2 && p(cArr[0])) {
            return p(cArr[1]);
        }
        return false;
    }

    public static boolean p(char c) {
        return Character.isUpperCase(c);
    }

    public static char q(char c) {
        return Character.toLowerCase(c);
    }
}
