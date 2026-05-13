package retrofit2.converter.simplexml;

import com.zepto.lc5;
import com.zepto.ls3;
import com.zepto.u70;
import com.zepto.yy5;
import java.io.IOException;
import java.io.OutputStreamWriter;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes3.dex */
final class SimpleXmlRequestBodyConverter<T> implements Converter<T, lc5> {
    private static final String CHARSET = "UTF-8";
    private static final ls3 MEDIA_TYPE = ls3.g("application/xml; charset=UTF-8");
    private final yy5 serializer;

    public SimpleXmlRequestBodyConverter(yy5 yy5Var) {
        this.serializer = yy5Var;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // retrofit2.Converter
    public lc5 convert(T t) throws IOException {
        u70 u70Var = new u70();
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(u70Var.B0(), CHARSET);
            this.serializer.b(t, outputStreamWriter);
            outputStreamWriter.flush();
            return lc5.create(MEDIA_TYPE, u70Var.p());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
