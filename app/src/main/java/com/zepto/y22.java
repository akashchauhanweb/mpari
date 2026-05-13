package com.zepto;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public enum y22 {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    SETTINGS_TIMEOUT(4),
    STREAM_CLOSED(5),
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);

    public static final a t = new a(null);
    public final int c;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final y22 a(int i) {
            for (y22 y22Var : y22.values()) {
                if (y22Var.a() == i) {
                    return y22Var;
                }
            }
            return null;
        }
    }

    y22(int i) {
        this.c = i;
    }

    public final int a() {
        return this.c;
    }
}
