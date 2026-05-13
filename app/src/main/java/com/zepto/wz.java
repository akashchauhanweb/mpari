package com.zepto;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import com.zepto.ec2;
import com.zepto.k60;

/* JADX INFO: loaded from: classes.dex */
public class wz {
    public BiometricPrompt$AuthenticationCallback a;
    public ec2.c b;
    public final d c;

    public class a extends ec2.c {
        public a() {
        }

        @Override // com.zepto.ec2.c
        public void a(int i, CharSequence charSequence) {
            wz.this.c.a(i, charSequence);
        }

        @Override // com.zepto.ec2.c
        public void b() {
            wz.this.c.b();
        }

        @Override // com.zepto.ec2.c
        public void c(int i, CharSequence charSequence) {
            wz.this.c.c(charSequence);
        }

        @Override // com.zepto.ec2.c
        public void d(ec2.d dVar) {
            wz.this.c.d(new k60.b(dVar != null ? s31.c(dVar.a()) : null, 2));
        }
    }

    public static class b {

        public class a extends BiometricPrompt$AuthenticationCallback {
            public final /* synthetic */ d a;

            public a(d dVar) {
                this.a = dVar;
            }

            public void onAuthenticationError(int i, CharSequence charSequence) {
                this.a.a(i, charSequence);
            }

            public void onAuthenticationFailed() {
                this.a.b();
            }

            public void onAuthenticationHelp(int i, CharSequence charSequence) {
            }

            public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
                k60.c cVarB = authenticationResult != null ? s31.b(b.b(authenticationResult)) : null;
                int i = Build.VERSION.SDK_INT;
                int iA = -1;
                if (i >= 30) {
                    if (authenticationResult != null) {
                        iA = c.a(authenticationResult);
                    }
                } else if (i != 29) {
                    iA = 2;
                }
                this.a.d(new k60.b(cVarB, iA));
            }
        }

        public static BiometricPrompt$AuthenticationCallback a(d dVar) {
            return new a(dVar);
        }

        public static BiometricPrompt.CryptoObject b(BiometricPrompt.AuthenticationResult authenticationResult) {
            return authenticationResult.getCryptoObject();
        }
    }

    public static class c {
        public static int a(BiometricPrompt.AuthenticationResult authenticationResult) {
            return authenticationResult.getAuthenticationType();
        }
    }

    public static class d {
        public abstract void a(int i, CharSequence charSequence);

        public abstract void b();

        public abstract void c(CharSequence charSequence);

        public abstract void d(k60.b bVar);
    }

    public wz(d dVar) {
        this.c = dVar;
    }

    public BiometricPrompt$AuthenticationCallback a() {
        if (this.a == null) {
            this.a = b.a(this.c);
        }
        return this.a;
    }

    public ec2.c b() {
        if (this.b == null) {
            this.b = new a();
        }
        return this.b;
    }
}
