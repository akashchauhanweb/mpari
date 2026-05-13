package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.zepto.i53;
import com.zepto.nd5;
import com.zepto.no6;
import com.zepto.s53;
import com.zepto.v53;
import java.io.IOException;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes3.dex */
final class GsonResponseBodyConverter<T> implements Converter<nd5, T> {
    private final no6 adapter;
    private final Gson gson;

    public GsonResponseBodyConverter(Gson gson, no6 no6Var) {
        this.gson = gson;
        this.adapter = no6Var;
    }

    @Override // retrofit2.Converter
    public T convert(nd5 nd5Var) throws IOException {
        s53 s53VarNewJsonReader = this.gson.newJsonReader(nd5Var.charStream());
        try {
            T t = (T) this.adapter.read(s53VarNewJsonReader);
            if (s53VarNewJsonReader.G0() == v53.END_DOCUMENT) {
                return t;
            }
            throw new i53("JSON document was not fully consumed.");
        } finally {
            nd5Var.close();
        }
    }
}
