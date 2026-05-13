package retrofit2;

import com.zepto.nd5;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes3.dex */
@IgnoreJRERequirement
final class OptionalConverterFactory extends Converter.Factory {
    static final Converter.Factory INSTANCE = new OptionalConverterFactory();

    @IgnoreJRERequirement
    public static final class OptionalConverter<T> implements Converter<nd5, Optional<T>> {
        final Converter<nd5, T> delegate;

        public OptionalConverter(Converter<nd5, T> converter) {
            this.delegate = converter;
        }

        @Override // retrofit2.Converter
        public Optional<T> convert(nd5 nd5Var) throws IOException {
            return Optional.ofNullable(this.delegate.convert(nd5Var));
        }
    }

    @Override // retrofit2.Converter.Factory
    public Converter<nd5, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (Converter.Factory.getRawType(type) != Optional.class) {
            return null;
        }
        return new OptionalConverter(retrofit.responseBodyConverter(Converter.Factory.getParameterUpperBound(0, (ParameterizedType) type), annotationArr));
    }
}
