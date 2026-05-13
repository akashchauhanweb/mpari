package retrofit2;

import com.zepto.lc5;
import com.zepto.nd5;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Unit;
import retrofit2.Converter;
import retrofit2.http.Streaming;

/* JADX INFO: loaded from: classes3.dex */
final class BuiltInConverters extends Converter.Factory {
    private boolean checkForKotlinUnit = true;

    public static final class BufferingResponseBodyConverter implements Converter<nd5, nd5> {
        static final BufferingResponseBodyConverter INSTANCE = new BufferingResponseBodyConverter();

        @Override // retrofit2.Converter
        public nd5 convert(nd5 nd5Var) throws IOException {
            try {
                return Utils.buffer(nd5Var);
            } finally {
                nd5Var.close();
            }
        }
    }

    public static final class RequestBodyConverter implements Converter<lc5, lc5> {
        static final RequestBodyConverter INSTANCE = new RequestBodyConverter();

        @Override // retrofit2.Converter
        public lc5 convert(lc5 lc5Var) {
            return lc5Var;
        }
    }

    public static final class StreamingResponseBodyConverter implements Converter<nd5, nd5> {
        static final StreamingResponseBodyConverter INSTANCE = new StreamingResponseBodyConverter();

        @Override // retrofit2.Converter
        public nd5 convert(nd5 nd5Var) {
            return nd5Var;
        }
    }

    public static final class ToStringConverter implements Converter<Object, String> {
        static final ToStringConverter INSTANCE = new ToStringConverter();

        @Override // retrofit2.Converter
        public String convert(Object obj) {
            return obj.toString();
        }
    }

    public static final class UnitResponseBodyConverter implements Converter<nd5, Unit> {
        static final UnitResponseBodyConverter INSTANCE = new UnitResponseBodyConverter();

        @Override // retrofit2.Converter
        public Unit convert(nd5 nd5Var) {
            nd5Var.close();
            return Unit.INSTANCE;
        }
    }

    public static final class VoidResponseBodyConverter implements Converter<nd5, Void> {
        static final VoidResponseBodyConverter INSTANCE = new VoidResponseBodyConverter();

        @Override // retrofit2.Converter
        public Void convert(nd5 nd5Var) {
            nd5Var.close();
            return null;
        }
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, lc5> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        if (lc5.class.isAssignableFrom(Utils.getRawType(type))) {
            return RequestBodyConverter.INSTANCE;
        }
        return null;
    }

    @Override // retrofit2.Converter.Factory
    public Converter<nd5, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (type == nd5.class) {
            return Utils.isAnnotationPresent(annotationArr, Streaming.class) ? StreamingResponseBodyConverter.INSTANCE : BufferingResponseBodyConverter.INSTANCE;
        }
        if (type == Void.class) {
            return VoidResponseBodyConverter.INSTANCE;
        }
        if (!this.checkForKotlinUnit || type != Unit.class) {
            return null;
        }
        try {
            return UnitResponseBodyConverter.INSTANCE;
        } catch (NoClassDefFoundError unused) {
            this.checkForKotlinUnit = false;
            return null;
        }
    }
}
