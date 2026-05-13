package com.zepto;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: loaded from: classes.dex */
public abstract class ln3 {
    public static ln3 a(long j) {
        return new d10(j);
    }

    public static ln3 b(Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    return jsonReader.peek() == JsonToken.STRING ? a(Long.parseLong(jsonReader.nextString())) : a(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    public abstract long c();
}
