package retrofit2.converter.simplexml;

import com.zepto.jr4;
import com.zepto.lc5;
import com.zepto.nd5;
import com.zepto.yy5;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes3.dex */
public final class SimpleXmlConverterFactory extends Converter.Factory {
    private final yy5 serializer;
    private final boolean strict;

    private SimpleXmlConverterFactory(yy5 yy5Var, boolean z) {
        if (yy5Var == null) {
            throw new NullPointerException("serializer == null");
        }
        this.serializer = yy5Var;
        this.strict = z;
    }

    public static SimpleXmlConverterFactory create() {
        return create(new jr4());
    }

    public static SimpleXmlConverterFactory createNonStrict() {
        return createNonStrict(new jr4());
    }

    public boolean isStrict() {
        return this.strict;
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, lc5> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        if (type instanceof Class) {
            return new SimpleXmlRequestBodyConverter(this.serializer);
        }
        return null;
    }

    @Override // retrofit2.Converter.Factory
    public Converter<nd5, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (type instanceof Class) {
            return new SimpleXmlResponseBodyConverter((Class) type, this.serializer, this.strict);
        }
        return null;
    }

    public static SimpleXmlConverterFactory create(yy5 yy5Var) {
        return new SimpleXmlConverterFactory(yy5Var, true);
    }

    public static SimpleXmlConverterFactory createNonStrict(yy5 yy5Var) {
        return new SimpleXmlConverterFactory(yy5Var, false);
    }
}
