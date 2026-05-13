package retrofit2.converter.simplexml;

import com.zepto.nd5;
import com.zepto.yy5;
import java.io.IOException;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes3.dex */
final class SimpleXmlResponseBodyConverter<T> implements Converter<nd5, T> {
    private final Class<T> cls;
    private final yy5 serializer;
    private final boolean strict;

    public SimpleXmlResponseBodyConverter(Class<T> cls, yy5 yy5Var, boolean z) {
        this.cls = cls;
        this.serializer = yy5Var;
        this.strict = z;
    }

    @Override // retrofit2.Converter
    public T convert(nd5 nd5Var) throws IOException {
        try {
            try {
                T t = (T) this.serializer.a(this.cls, nd5Var.charStream(), this.strict);
                if (t != null) {
                    return t;
                }
                throw new IllegalStateException("Could not deserialize body as " + this.cls);
            } catch (IOException e) {
                throw e;
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception e3) {
                throw new RuntimeException(e3);
            }
        } finally {
            nd5Var.close();
        }
    }
}
