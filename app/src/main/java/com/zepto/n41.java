package com.zepto;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class n41 {
    public static final void a(n96 db) {
        Intrinsics.checkNotNullParameter(db, "db");
        List listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        Cursor cursorR0 = db.r0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorR0.moveToNext()) {
            try {
                listCreateListBuilder.add(cursorR0.getString(0));
            } finally {
            }
        }
        Unit unit = Unit.INSTANCE;
        CloseableKt.closeFinally(cursorR0, null);
        for (String triggerName : CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder)) {
            Intrinsics.checkNotNullExpressionValue(triggerName, "triggerName");
            if (StringsKt__StringsJVMKt.startsWith$default(triggerName, "room_fts_content_sync_", false, 2, null)) {
                db.r("DROP TRIGGER IF EXISTS " + triggerName);
            }
        }
    }

    public static final Cursor b(je5 db, q96 sqLiteQuery, boolean z, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(sqLiteQuery, "sqLiteQuery");
        Cursor cursorX = db.x(sqLiteQuery, cancellationSignal);
        if (!z || !(cursorX instanceof AbstractWindowedCursor)) {
            return cursorX;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorX;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? b41.a(cursorX) : cursorX;
    }

    public static final int c(File databaseFile) {
        Intrinsics.checkNotNullParameter(databaseFile, "databaseFile");
        FileChannel channel = new FileInputStream(databaseFile).getChannel();
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i = byteBufferAllocate.getInt();
            CloseableKt.closeFinally(channel, null);
            return i;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(channel, th);
                throw th2;
            }
        }
    }
}
