package com.zepto;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class n72 {
    public static final a a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context context, xy3 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            j60 j60VarG = j60.g(context);
            Intrinsics.checkNotNullExpressionValue(j60VarG, "from(...)");
            int iA = j60VarG.a(33023);
            if (iA == -2) {
                binding.h.setVisibility(8);
                return;
            }
            if (iA == -1) {
                binding.h.setVisibility(8);
                return;
            }
            if (iA == 0) {
                ws6 ws6Var = new ws6(context);
                if (!ws6Var.u() || ws6Var.m() == null) {
                    binding.h.setVisibility(8);
                    return;
                } else {
                    binding.h.setVisibility(0);
                    return;
                }
            }
            if (iA == 1) {
                binding.h.setVisibility(8);
                return;
            }
            if (iA == 11) {
                binding.h.setVisibility(8);
            } else if (iA == 12) {
                binding.h.setVisibility(8);
            } else {
                if (iA != 15) {
                    return;
                }
                binding.h.setVisibility(8);
            }
        }
    }
}
