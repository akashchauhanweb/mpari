package com.zepto;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class m96 {
    public static final m96 a = new m96();

    public static final List a(Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        List<Uri> notificationUris = cursor.getNotificationUris();
        Intrinsics.checkNotNull(notificationUris);
        return notificationUris;
    }

    public static final void b(Cursor cursor, ContentResolver cr, List uris) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Intrinsics.checkNotNullParameter(cr, "cr");
        Intrinsics.checkNotNullParameter(uris, "uris");
        cursor.setNotificationUris(cr, uris);
    }
}
