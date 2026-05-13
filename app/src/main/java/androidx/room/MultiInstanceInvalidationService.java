package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import com.zepto.sw2;
import com.zepto.tw2;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\r\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR&\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0007\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001a¨\u0006\u001e"}, d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "", "a", "I", "c", "()I", "d", "(I)V", "maxClientId", "", "", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "clientNames", "Landroid/os/RemoteCallbackList;", "Lcom/zepto/sw2;", "Landroid/os/RemoteCallbackList;", "()Landroid/os/RemoteCallbackList;", "callbackList", "Lcom/zepto/tw2$a;", "Lcom/zepto/tw2$a;", "binder", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int maxClientId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Map clientNames = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final RemoteCallbackList callbackList = new b();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final tw2.a binder = new a();

    public static final class a extends tw2.a {
        public a() {
        }

        @Override // com.zepto.tw2
        public void g0(int i, String[] tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            RemoteCallbackList callbackList = MultiInstanceInvalidationService.this.getCallbackList();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (callbackList) {
                String str = (String) multiInstanceInvalidationService.getClientNames().get(Integer.valueOf(i));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int iBeginBroadcast = multiInstanceInvalidationService.getCallbackList().beginBroadcast();
                for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService.getCallbackList().getBroadcastCookie(i2);
                        Intrinsics.checkNotNull(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        int iIntValue = ((Integer) broadcastCookie).intValue();
                        String str2 = (String) multiInstanceInvalidationService.getClientNames().get(Integer.valueOf(iIntValue));
                        if (i != iIntValue && Intrinsics.areEqual(str, str2)) {
                            try {
                                ((sw2) multiInstanceInvalidationService.getCallbackList().getBroadcastItem(i2)).C(tables);
                            } catch (RemoteException e) {
                                Log.w("ROOM", "Error invoking a remote callback", e);
                            }
                        }
                    } catch (Throwable th) {
                        multiInstanceInvalidationService.getCallbackList().finishBroadcast();
                        throw th;
                    }
                }
                multiInstanceInvalidationService.getCallbackList().finishBroadcast();
                Unit unit = Unit.INSTANCE;
            }
        }

        @Override // com.zepto.tw2
        public int o(sw2 callback, String str) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            int i = 0;
            if (str == null) {
                return 0;
            }
            RemoteCallbackList callbackList = MultiInstanceInvalidationService.this.getCallbackList();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (callbackList) {
                try {
                    multiInstanceInvalidationService.d(multiInstanceInvalidationService.getMaxClientId() + 1);
                    int maxClientId = multiInstanceInvalidationService.getMaxClientId();
                    if (multiInstanceInvalidationService.getCallbackList().register(callback, Integer.valueOf(maxClientId))) {
                        multiInstanceInvalidationService.getClientNames().put(Integer.valueOf(maxClientId), str);
                        i = maxClientId;
                    } else {
                        multiInstanceInvalidationService.d(multiInstanceInvalidationService.getMaxClientId() - 1);
                        multiInstanceInvalidationService.getMaxClientId();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return i;
        }

        @Override // com.zepto.tw2
        public void z(sw2 callback, int i) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            RemoteCallbackList callbackList = MultiInstanceInvalidationService.this.getCallbackList();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (callbackList) {
                multiInstanceInvalidationService.getCallbackList().unregister(callback);
            }
        }
    }

    public static final class b extends RemoteCallbackList {
        public b() {
        }

        @Override // android.os.RemoteCallbackList
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onCallbackDied(sw2 callback, Object cookie) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(cookie, "cookie");
            MultiInstanceInvalidationService.this.getClientNames().remove((Integer) cookie);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final RemoteCallbackList getCallbackList() {
        return this.callbackList;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Map getClientNames() {
        return this.clientNames;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getMaxClientId() {
        return this.maxClientId;
    }

    public final void d(int i) {
        this.maxClientId = i;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return this.binder;
    }
}
