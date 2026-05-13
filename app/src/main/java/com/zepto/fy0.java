package com.zepto;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import com.zepto.ds4;
import com.zepto.pc5;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class fy0 extends pc5 {
    public static final UriMatcher b;
    public final Context a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    public fy0(Context context) {
        this.a = context;
    }

    private InputStream j(jc5 jc5Var) {
        ContentResolver contentResolver = this.a.getContentResolver();
        Uri uriLookupContact = jc5Var.d;
        int iMatch = b.match(uriLookupContact);
        if (iMatch != 1) {
            if (iMatch != 2) {
                if (iMatch != 3) {
                    if (iMatch != 4) {
                        throw new IllegalStateException("Invalid uri: " + uriLookupContact);
                    }
                }
            }
            return contentResolver.openInputStream(uriLookupContact);
        }
        uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uriLookupContact);
        if (uriLookupContact == null) {
            return null;
        }
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uriLookupContact, true);
    }

    @Override // com.zepto.pc5
    public boolean c(jc5 jc5Var) {
        Uri uri = jc5Var.d;
        return "content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && b.match(jc5Var.d) != -1;
    }

    @Override // com.zepto.pc5
    public pc5.a f(jc5 jc5Var, int i) {
        InputStream inputStreamJ = j(jc5Var);
        if (inputStreamJ == null) {
            return null;
        }
        return new pc5.a(zf4.k(inputStreamJ), ds4.e.DISK);
    }
}
