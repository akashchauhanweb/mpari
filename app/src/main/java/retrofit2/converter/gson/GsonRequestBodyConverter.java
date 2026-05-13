package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.zepto.b63;
import com.zepto.lc5;
import com.zepto.ls3;
import com.zepto.no6;
import com.zepto.u70;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes3.dex */
final class GsonRequestBodyConverter<T> implements Converter<T, lc5> {
    private static final ls3 MEDIA_TYPE = ls3.e("application/json; charset=UTF-8");
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final no6 adapter;
    private final Gson gson;

    public GsonRequestBodyConverter(Gson gson, no6 no6Var) {
        this.gson = gson;
        this.adapter = no6Var;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // retrofit2.Converter
    public lc5 convert(T t) throws IOException {
        u70 u70Var = new u70();
        b63 b63VarNewJsonWriter = this.gson.newJsonWriter(new OutputStreamWriter(u70Var.B0(), UTF_8));
        this.adapter.write(b63VarNewJsonWriter, t);
        b63VarNewJsonWriter.close();
        return lc5.create(MEDIA_TYPE, u70Var.p());
    }
}
