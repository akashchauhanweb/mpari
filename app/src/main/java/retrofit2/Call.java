package retrofit2;

import com.zepto.cg6;
import com.zepto.kc5;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public interface Call<T> extends Cloneable {
    void cancel();

    Call<T> clone();

    void enqueue(Callback<T> callback);

    Response<T> execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    kc5 request();

    cg6 timeout();
}
