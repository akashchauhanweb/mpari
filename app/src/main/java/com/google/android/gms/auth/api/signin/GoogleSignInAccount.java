package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.zepto.b28;
import com.zepto.bf1;
import com.zepto.iu4;
import com.zepto.ki5;
import com.zepto.p2;
import com.zepto.vq0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class GoogleSignInAccount extends p2 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new b28();
    public static vq0 q = bf1.b();
    public final int c;
    public String e;
    public String f;
    public String g;
    public String h;
    public Uri i;
    public String j;
    public long k;
    public String l;
    public List m;
    public String n;
    public String o;
    public Set p = new HashSet();

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List list, String str7, String str8) {
        this.c = i;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = uri;
        this.j = str5;
        this.k = j;
        this.l = str6;
        this.m = list;
        this.n = str7;
        this.o = str8;
    }

    public static GoogleSignInAccount l(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l.longValue(), iu4.e(str7), new ArrayList((Collection) iu4.i(set)), str5, str6);
    }

    public static GoogleSignInAccount m(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount googleSignInAccountL = l(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, uri, Long.valueOf(j), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        googleSignInAccountL.j = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccountL;
    }

    public String c() {
        return this.h;
    }

    public String d() {
        return this.g;
    }

    public String e() {
        return this.o;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.l.equals(this.l) && googleSignInAccount.j().equals(j());
    }

    public String f() {
        return this.n;
    }

    public String g() {
        return this.e;
    }

    public String h() {
        return this.f;
    }

    public int hashCode() {
        return ((this.l.hashCode() + 527) * 31) + j().hashCode();
    }

    public Uri i() {
        return this.i;
    }

    public Set j() {
        HashSet hashSet = new HashSet(this.m);
        hashSet.addAll(this.p);
        return hashSet;
    }

    public String k() {
        return this.j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iA = ki5.a(parcel);
        ki5.j(parcel, 1, this.c);
        ki5.o(parcel, 2, g(), false);
        ki5.o(parcel, 3, h(), false);
        ki5.o(parcel, 4, d(), false);
        ki5.o(parcel, 5, c(), false);
        ki5.n(parcel, 6, i(), i, false);
        ki5.o(parcel, 7, k(), false);
        ki5.m(parcel, 8, this.k);
        ki5.o(parcel, 9, this.l, false);
        ki5.r(parcel, 10, this.m, false);
        ki5.o(parcel, 11, f(), false);
        ki5.o(parcel, 12, e(), false);
        ki5.b(parcel, iA);
    }
}
