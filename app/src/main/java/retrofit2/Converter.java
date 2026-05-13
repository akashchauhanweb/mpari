package retrofit2;

import com.zepto.lc5;
import com.zepto.nd5;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public interface Converter<F, T> {

    public static abstract class Factory {
        public static Type getParameterUpperBound(int i, ParameterizedType parameterizedType) {
            return Utils.getParameterUpperBound(i, parameterizedType);
        }

        public static Class<?> getRawType(Type type) {
            return Utils.getRawType(type);
        }

        public Converter<?, lc5> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
            return null;
        }

        public Converter<nd5, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
            return null;
        }

        public Converter<?, String> stringConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
            return null;
        }
    }

    T convert(F f) throws IOException;
}
