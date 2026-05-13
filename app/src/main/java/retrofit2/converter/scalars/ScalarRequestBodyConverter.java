package retrofit2.converter.scalars;

import com.zepto.lc5;
import com.zepto.ls3;
import java.io.IOException;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes3.dex */
final class ScalarRequestBodyConverter<T> implements Converter<T, lc5> {
    static final ScalarRequestBodyConverter<Object> INSTANCE = new ScalarRequestBodyConverter<>();
    private static final ls3 MEDIA_TYPE = ls3.e("text/plain; charset=UTF-8");

    private ScalarRequestBodyConverter() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // retrofit2.Converter
    public lc5 convert(T t) throws IOException {
        return lc5.create(MEDIA_TYPE, String.valueOf(t));
    }
}
