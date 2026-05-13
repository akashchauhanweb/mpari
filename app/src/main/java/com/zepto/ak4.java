package com.zepto;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.pdfview.PDFView;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ak4 implements rx2 {
    public final PDFView a;
    public final File b;
    public final float c;
    public final int d;
    public ParcelFileDescriptor e;
    public PdfRenderer f;
    public int g;
    public int h;

    public ak4(PDFView view, File file, float f, int i) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(file, "file");
        this.a = view;
        this.b = file;
        this.c = f;
        this.d = i;
    }

    @Override // com.zepto.rx2
    public boolean a() {
        return this.g > 0 && this.h > 0;
    }

    @Override // com.zepto.rx2
    public Bitmap b(Rect rect, int i) {
        Rect rect2 = rect;
        Intrinsics.checkNotNullParameter(rect2, "rect");
        int iFloor = (int) Math.floor(((double) rect2.top) / ((double) this.h));
        int iCeil = ((int) Math.ceil(((double) rect2.bottom) / ((double) this.h))) - 1;
        Bitmap bitmap = Bitmap.createBitmap(rect.width() / i, rect.height() / i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(this.d);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        if (iFloor <= iCeil) {
            int i2 = 0;
            int i3 = iFloor;
            while (true) {
                int i4 = i2 + 1;
                int i5 = i3 + 1;
                PdfRenderer pdfRenderer = this.f;
                if (pdfRenderer == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("renderer");
                    throw null;
                }
                synchronized (pdfRenderer) {
                    PdfRenderer pdfRenderer2 = this.f;
                    if (pdfRenderer2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("renderer");
                        throw null;
                    }
                    PdfRenderer.Page pageOpenPage = pdfRenderer2.openPage(i3);
                    Matrix matrix = new Matrix();
                    float f = this.c;
                    float f2 = i;
                    matrix.setScale(f / f2, f / f2);
                    float f3 = (-rect2.left) / i;
                    int i6 = rect2.top;
                    matrix.postTranslate(f3, (-((i6 - (r0 * iFloor)) / i)) + ((this.h / f2) * i2));
                    pageOpenPage.render(bitmap, null, matrix, 1);
                    pageOpenPage.close();
                    Unit unit = Unit.INSTANCE;
                }
                if (i3 == iCeil) {
                    break;
                }
                i2 = i4;
                i3 = i5;
                rect2 = rect;
            }
        }
        Intrinsics.checkNotNullExpressionValue(bitmap, "bitmap");
        return bitmap;
    }

    @Override // com.zepto.rx2
    public void c() throws IOException {
        PdfRenderer pdfRenderer = this.f;
        if (pdfRenderer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("renderer");
            throw null;
        }
        pdfRenderer.close();
        ParcelFileDescriptor parcelFileDescriptor = this.e;
        if (parcelFileDescriptor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("descriptor");
            throw null;
        }
        parcelFileDescriptor.close();
        this.g = 0;
        this.h = 0;
    }

    @Override // com.zepto.rx2
    public Point d(Context context, Uri uri) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(this.b, 268435456);
        Intrinsics.checkNotNullExpressionValue(parcelFileDescriptorOpen, "open(file, ParcelFileDescriptor.MODE_READ_ONLY)");
        this.e = parcelFileDescriptorOpen;
        ParcelFileDescriptor parcelFileDescriptor = this.e;
        if (parcelFileDescriptor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("descriptor");
            throw null;
        }
        PdfRenderer pdfRenderer = new PdfRenderer(parcelFileDescriptor);
        this.f = pdfRenderer;
        PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(0);
        this.g = (int) (pageOpenPage.getWidth() * this.c);
        this.h = (int) (pageOpenPage.getHeight() * this.c);
        PdfRenderer pdfRenderer2 = this.f;
        if (pdfRenderer2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("renderer");
            throw null;
        }
        if (pdfRenderer2.getPageCount() > 15) {
            this.a.setHasBaseLayerTiles(false);
        } else {
            PdfRenderer pdfRenderer3 = this.f;
            if (pdfRenderer3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("renderer");
                throw null;
            }
            if (pdfRenderer3.getPageCount() == 1) {
                this.a.setMinimumScaleType(1);
            }
        }
        pageOpenPage.close();
        int i = this.g;
        int i2 = this.h;
        PdfRenderer pdfRenderer4 = this.f;
        if (pdfRenderer4 != null) {
            return new Point(i, i2 * pdfRenderer4.getPageCount());
        }
        Intrinsics.throwUninitializedPropertyAccessException("renderer");
        throw null;
    }

    public /* synthetic */ ak4(PDFView pDFView, File file, float f, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(pDFView, file, f, (i2 & 8) != 0 ? -1 : i);
    }
}
