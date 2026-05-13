package com.zepto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.session.PlaybackStateCompat;
import com.github.dhaval2404.imagepicker.ImagePickerActivity;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class ox2 {
    public static final b a = new b(null);

    public static final class a {
        public qx2 a;
        public String[] b;
        public float c;
        public float d;
        public boolean e;
        public int f;
        public int g;
        public long h;
        public Function1 i;
        public String j;
        public final Activity k;

        /* JADX INFO: renamed from: com.zepto.ox2$a$a, reason: collision with other inner class name */
        public static final class C0112a implements wd5 {
            public final /* synthetic */ Function1 b;

            public C0112a(Function1 function1) {
                this.b = function1;
            }

            @Override // com.zepto.wd5
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(qx2 qx2Var) {
                if (qx2Var != null) {
                    a.this.a = qx2Var;
                    Function1 function1 = a.this.i;
                    if (function1 != null) {
                    }
                    this.b.invoke(a.this.g());
                }
            }
        }

        public a(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.k = activity;
            this.a = qx2.BOTH;
            this.b = new String[0];
        }

        public final a e() {
            this.a = qx2.CAMERA;
            return this;
        }

        public final a f(int i) {
            this.h = ((long) i) * PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
            return this;
        }

        public final Intent g() {
            Intent intent = new Intent(this.k, (Class<?>) ImagePickerActivity.class);
            intent.putExtras(k());
            return intent;
        }

        public final void h(Function1 onResult) {
            Intrinsics.checkNotNullParameter(onResult, "onResult");
            if (this.a == qx2.BOTH) {
                vj1.a.a(this.k, new C0112a(onResult), null);
            } else {
                onResult.invoke(g());
            }
        }

        public final a i() {
            this.e = true;
            return this;
        }

        public final a j() {
            this.a = qx2.GALLERY;
            return this;
        }

        public final Bundle k() {
            Bundle bundle = new Bundle();
            bundle.putSerializable("extra.image_provider", this.a);
            bundle.putStringArray("extra.mime_types", this.b);
            bundle.putBoolean("extra.crop", this.e);
            bundle.putFloat("extra.crop_x", this.c);
            bundle.putFloat("extra.crop_y", this.d);
            bundle.putInt("extra.max_width", this.f);
            bundle.putInt("extra.max_height", this.g);
            bundle.putLong("extra.image_max_size", this.h);
            bundle.putString("extra.save_directory", this.j);
            return bundle;
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(Intent intent) {
            String stringExtra = intent != null ? intent.getStringExtra("extra.error") : null;
            return stringExtra != null ? stringExtra : "Unknown Error!";
        }

        public final a b(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return new a(activity);
        }
    }
}
