package com.nic.mparivahan.NewDlScreen.Modal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.nic.mparivahan.LLServices.GetLlPojo.BloodGroup;
import com.nic.mparivahan.LLServices.GetLlPojo.CountryOfBirth;
import com.nic.mparivahan.LLServices.GetLlPojo.DrivingSchoolDet;
import com.nic.mparivahan.LLServices.GetLlPojo.EduQual;
import com.nic.mparivahan.LLServices.GetLlPojo.Gender;
import com.nic.mparivahan.LLServices.GetLlPojo.LlFromRTO1;
import com.nic.mparivahan.LLServices.GetLlPojo.LlFromState1;
import com.nic.mparivahan.LLServices.GetLlPojo.LlstoDisplayMap;
import com.nic.mparivahan.LLServices.GetLlPojo.PermCity;
import com.nic.mparivahan.LLServices.GetLlPojo.PermDistrict;
import com.nic.mparivahan.LLServices.GetLlPojo.PermState;
import com.nic.mparivahan.LLServices.GetLlPojo.PermSubDistrict;
import com.nic.mparivahan.LLServices.GetLlPojo.PresCity;
import com.nic.mparivahan.LLServices.GetLlPojo.PresDistrict;
import com.nic.mparivahan.LLServices.GetLlPojo.PresState;
import com.nic.mparivahan.LLServices.GetLlPojo.PresSubDistrict;
import com.nic.mparivahan.LLServices.GetLlPojo.RelationType;
import com.zepto.xy5;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000Á\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0003\bË\u0001\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0007\u0012\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0003j\b\u0012\u0004\u0012\u00020\n`\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\u0018\b\u0002\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u0003j\b\u0012\u0004\u0012\u00020\u0010`\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\u0018\b\u0002\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0003j\b\u0012\u0004\u0012\u00020\u0013`\u0005\u0012\u0018\b\u0002\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0003j\b\u0012\u0004\u0012\u00020\u0015`\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0007\u0012\u0018\b\u0002\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u0003j\b\u0012\u0004\u0012\u00020\u001e`\u0005\u0012\u0018\b\u0002\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020 0\u0003j\b\u0012\u0004\u0012\u00020 `\u0005\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\"\u001a\u00020\u0007\u0012\b\b\u0002\u0010#\u001a\u00020\u0007\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0007\u0012\u0018\b\u0002\u0010%\u001a\u0012\u0012\u0004\u0012\u00020&0\u0003j\b\u0012\u0004\u0012\u00020&`\u0005\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010(\u001a\u00020\u0007\u0012\b\b\u0002\u0010)\u001a\u00020\u0007\u0012\b\b\u0002\u0010*\u001a\u00020\u0007\u0012\b\b\u0002\u0010+\u001a\u00020\u0007\u0012\u0018\b\u0002\u0010,\u001a\u0012\u0012\u0004\u0012\u00020-0\u0003j\b\u0012\u0004\u0012\u00020-`\u0005\u0012\b\b\u0002\u0010.\u001a\u00020\u0007\u0012\b\b\u0002\u0010/\u001a\u00020\u0007\u0012\u0018\b\u0002\u00100\u001a\u0012\u0012\u0004\u0012\u0002010\u0003j\b\u0012\u0004\u0012\u000201`\u0005\u0012\u0018\b\u0002\u00102\u001a\u0012\u0012\u0004\u0012\u0002030\u0003j\b\u0012\u0004\u0012\u000203`\u0005\u0012\b\b\u0002\u00104\u001a\u00020\u0007\u0012\b\b\u0002\u00105\u001a\u00020\u0007\u0012\u0018\b\u0002\u00106\u001a\u0012\u0012\u0004\u0012\u0002070\u0003j\b\u0012\u0004\u0012\u000207`\u0005\u0012\u0018\b\u0002\u00108\u001a\u0012\u0012\u0004\u0012\u0002090\u0003j\b\u0012\u0004\u0012\u000209`\u0005\u0012\b\b\u0002\u0010:\u001a\u00020\u0007\u0012\b\b\u0002\u0010;\u001a\u00020\u0007\u0012\b\b\u0002\u0010<\u001a\u00020\u0007\u0012\b\b\u0002\u0010=\u001a\u00020\u0007\u0012\u0018\b\u0002\u0010>\u001a\u0012\u0012\u0004\u0012\u00020?0\u0003j\b\u0012\u0004\u0012\u00020?`\u0005\u0012\b\b\u0002\u0010@\u001a\u00020\u0007\u0012\b\b\u0002\u0010A\u001a\u00020\u0007\u0012\u0018\b\u0002\u0010B\u001a\u0012\u0012\u0004\u0012\u00020C0\u0003j\b\u0012\u0004\u0012\u00020C`\u0005\u0012\b\b\u0002\u0010D\u001a\u00020\u0007\u0012\b\b\u0002\u0010E\u001a\u00020\u0007\u0012\u0018\b\u0002\u0010F\u001a\u0012\u0012\u0004\u0012\u00020G0\u0003j\b\u0012\u0004\u0012\u00020G`\u0005\u0012\u0018\b\u0002\u0010H\u001a\u0012\u0012\u0004\u0012\u00020I0\u0003j\b\u0012\u0004\u0012\u00020I`\u0005\u0012\u0018\b\u0002\u0010J\u001a\u0012\u0012\u0004\u0012\u00020K0\u0003j\b\u0012\u0004\u0012\u00020K`\u0005\u0012\b\b\u0002\u0010L\u001a\u00020\u0007\u0012\b\b\u0002\u0010M\u001a\u00020\u0007\u0012\b\b\u0002\u0010N\u001a\u00020\u0007\u0012\b\b\u0002\u0010O\u001a\u00020\u0007\u0012\b\b\u0002\u0010P\u001a\u00020\u0007\u0012\b\b\u0002\u0010Q\u001a\u00020\u0007\u0012\b\b\u0002\u0010R\u001a\u00020\u0007\u0012\b\b\u0002\u0010S\u001a\u00020\u0007\u0012\b\b\u0002\u0010T\u001a\u00020\u0007¢\u0006\u0002\u0010UJ\u001a\u0010×\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\n\u0010Ø\u0001\u001a\u00020\u0007HÆ\u0003J\u001a\u0010Ù\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0003j\b\u0012\u0004\u0012\u00020\u0013`\u0005HÆ\u0003J\u001a\u0010Ú\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0003j\b\u0012\u0004\u0012\u00020\u0015`\u0005HÆ\u0003J\u0011\u0010Û\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010WJ\n\u0010Ü\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010Ý\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010Þ\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010ß\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010à\u0001\u001a\u00020\u0007HÆ\u0003J\u001a\u0010á\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u0003j\b\u0012\u0004\u0012\u00020\u001e`\u0005HÆ\u0003J\n\u0010â\u0001\u001a\u00020\u0007HÆ\u0003J\u001a\u0010ã\u0001\u001a\u0012\u0012\u0004\u0012\u00020 0\u0003j\b\u0012\u0004\u0012\u00020 `\u0005HÆ\u0003J\u0011\u0010ä\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010WJ\n\u0010å\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010æ\u0001\u001a\u00020\u0007HÆ\u0003J\f\u0010ç\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u001a\u0010è\u0001\u001a\u0012\u0012\u0004\u0012\u00020&0\u0003j\b\u0012\u0004\u0012\u00020&`\u0005HÆ\u0003J\u0011\u0010é\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010WJ\n\u0010ê\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010ë\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010ì\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010í\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010î\u0001\u001a\u00020\u0007HÆ\u0003J\u001a\u0010ï\u0001\u001a\u0012\u0012\u0004\u0012\u00020-0\u0003j\b\u0012\u0004\u0012\u00020-`\u0005HÆ\u0003J\n\u0010ð\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010ñ\u0001\u001a\u00020\u0007HÆ\u0003J\u001a\u0010ò\u0001\u001a\u0012\u0012\u0004\u0012\u0002010\u0003j\b\u0012\u0004\u0012\u000201`\u0005HÆ\u0003J\u001a\u0010ó\u0001\u001a\u0012\u0012\u0004\u0012\u0002030\u0003j\b\u0012\u0004\u0012\u000203`\u0005HÆ\u0003J\n\u0010ô\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010õ\u0001\u001a\u00020\u0007HÆ\u0003J\u001a\u0010ö\u0001\u001a\u0012\u0012\u0004\u0012\u0002070\u0003j\b\u0012\u0004\u0012\u000207`\u0005HÆ\u0003J\u001a\u0010÷\u0001\u001a\u0012\u0012\u0004\u0012\u0002090\u0003j\b\u0012\u0004\u0012\u000209`\u0005HÆ\u0003J\u001a\u0010ø\u0001\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0003j\b\u0012\u0004\u0012\u00020\n`\u0005HÆ\u0003J\n\u0010ù\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010ú\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010û\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010ü\u0001\u001a\u00020\u0007HÆ\u0003J\u001a\u0010ý\u0001\u001a\u0012\u0012\u0004\u0012\u00020?0\u0003j\b\u0012\u0004\u0012\u00020?`\u0005HÆ\u0003J\n\u0010þ\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010ÿ\u0001\u001a\u00020\u0007HÆ\u0003J\u001a\u0010\u0080\u0002\u001a\u0012\u0012\u0004\u0012\u00020C0\u0003j\b\u0012\u0004\u0012\u00020C`\u0005HÆ\u0003J\n\u0010\u0081\u0002\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0082\u0002\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0083\u0002\u001a\u00020\u0007HÆ\u0003J\u001a\u0010\u0084\u0002\u001a\u0012\u0012\u0004\u0012\u00020G0\u0003j\b\u0012\u0004\u0012\u00020G`\u0005HÆ\u0003J\u001a\u0010\u0085\u0002\u001a\u0012\u0012\u0004\u0012\u00020I0\u0003j\b\u0012\u0004\u0012\u00020I`\u0005HÆ\u0003J\u001a\u0010\u0086\u0002\u001a\u0012\u0012\u0004\u0012\u00020K0\u0003j\b\u0012\u0004\u0012\u00020K`\u0005HÆ\u0003J\n\u0010\u0087\u0002\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0088\u0002\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0089\u0002\u001a\u00020\u0007HÆ\u0003J\n\u0010\u008a\u0002\u001a\u00020\u0007HÆ\u0003J\n\u0010\u008b\u0002\u001a\u00020\u0007HÆ\u0003J\n\u0010\u008c\u0002\u001a\u00020\u0007HÆ\u0003J\n\u0010\u008d\u0002\u001a\u00020\u0007HÆ\u0003J\n\u0010\u008e\u0002\u001a\u00020\u0007HÆ\u0003J\n\u0010\u008f\u0002\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0090\u0002\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0091\u0002\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0092\u0002\u001a\u00020\u0007HÆ\u0003J\u001a\u0010\u0093\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u0003j\b\u0012\u0004\u0012\u00020\u0010`\u0005HÆ\u0003J\u009a\u0007\u0010\u0094\u0002\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0003j\b\u0012\u0004\u0012\u00020\n`\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\u0018\b\u0002\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u0003j\b\u0012\u0004\u0012\u00020\u0010`\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00072\u0018\b\u0002\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0003j\b\u0012\u0004\u0012\u00020\u0013`\u00052\u0018\b\u0002\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0003j\b\u0012\u0004\u0012\u00020\u0015`\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\u0018\b\u0002\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u0003j\b\u0012\u0004\u0012\u00020\u001e`\u00052\u0018\b\u0002\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020 0\u0003j\b\u0012\u0004\u0012\u00020 `\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\"\u001a\u00020\u00072\b\b\u0002\u0010#\u001a\u00020\u00072\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00072\u0018\b\u0002\u0010%\u001a\u0012\u0012\u0004\u0012\u00020&0\u0003j\b\u0012\u0004\u0012\u00020&`\u00052\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010(\u001a\u00020\u00072\b\b\u0002\u0010)\u001a\u00020\u00072\b\b\u0002\u0010*\u001a\u00020\u00072\b\b\u0002\u0010+\u001a\u00020\u00072\u0018\b\u0002\u0010,\u001a\u0012\u0012\u0004\u0012\u00020-0\u0003j\b\u0012\u0004\u0012\u00020-`\u00052\b\b\u0002\u0010.\u001a\u00020\u00072\b\b\u0002\u0010/\u001a\u00020\u00072\u0018\b\u0002\u00100\u001a\u0012\u0012\u0004\u0012\u0002010\u0003j\b\u0012\u0004\u0012\u000201`\u00052\u0018\b\u0002\u00102\u001a\u0012\u0012\u0004\u0012\u0002030\u0003j\b\u0012\u0004\u0012\u000203`\u00052\b\b\u0002\u00104\u001a\u00020\u00072\b\b\u0002\u00105\u001a\u00020\u00072\u0018\b\u0002\u00106\u001a\u0012\u0012\u0004\u0012\u0002070\u0003j\b\u0012\u0004\u0012\u000207`\u00052\u0018\b\u0002\u00108\u001a\u0012\u0012\u0004\u0012\u0002090\u0003j\b\u0012\u0004\u0012\u000209`\u00052\b\b\u0002\u0010:\u001a\u00020\u00072\b\b\u0002\u0010;\u001a\u00020\u00072\b\b\u0002\u0010<\u001a\u00020\u00072\b\b\u0002\u0010=\u001a\u00020\u00072\u0018\b\u0002\u0010>\u001a\u0012\u0012\u0004\u0012\u00020?0\u0003j\b\u0012\u0004\u0012\u00020?`\u00052\b\b\u0002\u0010@\u001a\u00020\u00072\b\b\u0002\u0010A\u001a\u00020\u00072\u0018\b\u0002\u0010B\u001a\u0012\u0012\u0004\u0012\u00020C0\u0003j\b\u0012\u0004\u0012\u00020C`\u00052\b\b\u0002\u0010D\u001a\u00020\u00072\b\b\u0002\u0010E\u001a\u00020\u00072\u0018\b\u0002\u0010F\u001a\u0012\u0012\u0004\u0012\u00020G0\u0003j\b\u0012\u0004\u0012\u00020G`\u00052\u0018\b\u0002\u0010H\u001a\u0012\u0012\u0004\u0012\u00020I0\u0003j\b\u0012\u0004\u0012\u00020I`\u00052\u0018\b\u0002\u0010J\u001a\u0012\u0012\u0004\u0012\u00020K0\u0003j\b\u0012\u0004\u0012\u00020K`\u00052\b\b\u0002\u0010L\u001a\u00020\u00072\b\b\u0002\u0010M\u001a\u00020\u00072\b\b\u0002\u0010N\u001a\u00020\u00072\b\b\u0002\u0010O\u001a\u00020\u00072\b\b\u0002\u0010P\u001a\u00020\u00072\b\b\u0002\u0010Q\u001a\u00020\u00072\b\b\u0002\u0010R\u001a\u00020\u00072\b\b\u0002\u0010S\u001a\u00020\u00072\b\b\u0002\u0010T\u001a\u00020\u0007HÆ\u0001¢\u0006\u0003\u0010\u0095\u0002J\u000b\u0010\u0096\u0002\u001a\u00030\u0097\u0002HÖ\u0001J\u0016\u0010\u0098\u0002\u001a\u00020\u00172\n\u0010\u0099\u0002\u001a\u0005\u0018\u00010\u009a\u0002HÖ\u0003J\u000b\u0010\u009b\u0002\u001a\u00030\u0097\u0002HÖ\u0001J\n\u0010\u009c\u0002\u001a\u00020\u0007HÖ\u0001J\u001f\u0010\u009d\u0002\u001a\u00030\u009e\u00022\b\u0010\u009f\u0002\u001a\u00030 \u00022\b\u0010¡\u0002\u001a\u00030\u0097\u0002HÖ\u0001R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010Z\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u001e\u0010<\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u001e\u0010#\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\\\"\u0004\b`\u0010^R\u001e\u0010L\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010\\\"\u0004\bb\u0010^R\u001e\u0010R\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010\\\"\u0004\bd\u0010^R\u001e\u0010S\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010\\\"\u0004\bf\u0010^R\u001e\u0010(\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010\\\"\u0004\bh\u0010^R.\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u0003j\b\u0012\u0004\u0012\u00020\u0010`\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR.\u0010B\u001a\u0012\u0012\u0004\u0012\u00020C0\u0003j\b\u0012\u0004\u0012\u00020C`\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010j\"\u0004\bn\u0010lR.\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0003j\b\u0012\u0004\u0012\u00020\u0015`\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010j\"\u0004\bp\u0010lR\u001e\u0010P\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010\\\"\u0004\br\u0010^R\u001e\u0010A\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010\\\"\u0004\bt\u0010^R\u001e\u0010T\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bu\u0010\\\"\u0004\bv\u0010^R\u001e\u0010O\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010\\\"\u0004\bx\u0010^R.\u00102\u001a\u0012\u0012\u0004\u0012\u0002030\u0003j\b\u0012\u0004\u0012\u000203`\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010j\"\u0004\bz\u0010lR\"\u0010'\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010Z\u001a\u0004\b{\u0010W\"\u0004\b|\u0010YR.\u0010%\u001a\u0012\u0012\u0004\u0012\u00020&0\u0003j\b\u0012\u0004\u0012\u00020&`\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b}\u0010j\"\u0004\b~\u0010lR\u001f\u0010;\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b\u007f\u0010\\\"\u0005\b\u0080\u0001\u0010^R \u0010N\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0001\u0010\\\"\u0005\b\u0082\u0001\u0010^R \u0010\u001a\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0083\u0001\u0010\\\"\u0005\b\u0084\u0001\u0010^R0\u00100\u001a\u0012\u0012\u0004\u0012\u0002010\u0003j\b\u0012\u0004\u0012\u000201`\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0001\u0010j\"\u0005\b\u0086\u0001\u0010lR \u0010\u0018\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0001\u0010\\\"\u0005\b\u0088\u0001\u0010^R \u0010\u0019\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0089\u0001\u0010\\\"\u0005\b\u008a\u0001\u0010^R \u0010Q\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0001\u0010\\\"\u0005\b\u008c\u0001\u0010^R0\u00106\u001a\u0012\u0012\u0004\u0012\u0002070\u0003j\b\u0012\u0004\u0012\u000207`\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008d\u0001\u0010j\"\u0005\b\u008e\u0001\u0010lR0\u0010J\u001a\u0012\u0012\u0004\u0012\u00020K0\u0003j\b\u0012\u0004\u0012\u00020K`\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008f\u0001\u0010j\"\u0005\b\u0090\u0001\u0010lR0\u0010H\u001a\u0012\u0012\u0004\u0012\u00020I0\u0003j\b\u0012\u0004\u0012\u00020I`\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0091\u0001\u0010j\"\u0005\b\u0092\u0001\u0010lR \u0010:\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0093\u0001\u0010\\\"\u0005\b\u0094\u0001\u0010^R \u00104\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0095\u0001\u0010\\\"\u0005\b\u0096\u0001\u0010^R \u0010\u000b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0097\u0001\u0010\\\"\u0005\b\u0098\u0001\u0010^R \u0010.\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0099\u0001\u0010\\\"\u0005\b\u009a\u0001\u0010^R$\u0010!\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0002\u0010Z\u001a\u0005\b\u009b\u0001\u0010W\"\u0005\b\u009c\u0001\u0010YR0\u0010F\u001a\u0012\u0012\u0004\u0012\u00020G0\u0003j\b\u0012\u0004\u0012\u00020G`\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009d\u0001\u0010j\"\u0005\b\u009e\u0001\u0010lR0\u0010,\u001a\u0012\u0012\u0004\u0012\u00020-0\u0003j\b\u0012\u0004\u0012\u00020-`\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009f\u0001\u0010j\"\u0005\b \u0001\u0010lR \u0010/\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¡\u0001\u0010\\\"\u0005\b¢\u0001\u0010^R \u0010\"\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b£\u0001\u0010\\\"\u0005\b¤\u0001\u0010^R \u0010*\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¥\u0001\u0010\\\"\u0005\b¦\u0001\u0010^R0\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0003j\b\u0012\u0004\u0012\u00020\u0013`\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b§\u0001\u0010j\"\u0005\b¨\u0001\u0010lR \u0010)\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b©\u0001\u0010\\\"\u0005\bª\u0001\u0010^R0\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020 0\u0003j\b\u0012\u0004\u0012\u00020 `\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b«\u0001\u0010j\"\u0005\b¬\u0001\u0010lR \u0010\u001c\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u00ad\u0001\u0010\\\"\u0005\b®\u0001\u0010^R \u0010=\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¯\u0001\u0010\\\"\u0005\b°\u0001\u0010^R0\u0010>\u001a\u0012\u0012\u0004\u0012\u00020?0\u0003j\b\u0012\u0004\u0012\u00020?`\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b±\u0001\u0010j\"\u0005\b²\u0001\u0010lR0\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0003j\b\u0012\u0004\u0012\u00020\n`\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b³\u0001\u0010j\"\u0005\b´\u0001\u0010lR \u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bµ\u0001\u0010\\\"\u0005\b¶\u0001\u0010^R \u0010E\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b·\u0001\u0010\\\"\u0005\b¸\u0001\u0010^R \u0010\r\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¹\u0001\u0010\\\"\u0005\bº\u0001\u0010^R \u0010@\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b»\u0001\u0010\\\"\u0005\b¼\u0001\u0010^R \u0010\u0011\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b½\u0001\u0010\\\"\u0005\b¾\u0001\u0010^R0\u00108\u001a\u0012\u0012\u0004\u0012\u0002090\u0003j\b\u0012\u0004\u0012\u000209`\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¿\u0001\u0010j\"\u0005\bÀ\u0001\u0010lR \u0010\u001b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÁ\u0001\u0010\\\"\u0005\bÂ\u0001\u0010^R \u0010\f\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÃ\u0001\u0010\\\"\u0005\bÄ\u0001\u0010^R \u00105\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÅ\u0001\u0010\\\"\u0005\bÆ\u0001\u0010^R0\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u0003j\b\u0012\u0004\u0012\u00020\u001e`\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÇ\u0001\u0010j\"\u0005\bÈ\u0001\u0010lR \u0010+\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÉ\u0001\u0010\\\"\u0005\bÊ\u0001\u0010^R0\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bË\u0001\u0010j\"\u0005\bÌ\u0001\u0010lR\"\u0010$\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÍ\u0001\u0010\\\"\u0005\bÎ\u0001\u0010^R \u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÏ\u0001\u0010\\\"\u0005\bÐ\u0001\u0010^R \u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÑ\u0001\u0010\\\"\u0005\bÒ\u0001\u0010^R \u0010M\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÓ\u0001\u0010\\\"\u0005\bÔ\u0001\u0010^R \u0010D\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÕ\u0001\u0010\\\"\u0005\bÖ\u0001\u0010^¨\u0006¢\u0002"}, d2 = {"Lcom/nic/mparivahan/NewDlScreen/Modal/LLDetailsResultModal;", "Landroid/os/Parcelable;", "relationType", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/LLServices/GetLlPojo/RelationType;", "Lkotlin/collections/ArrayList;", "selectedCovs", "", "swdfName", "presDistrict", "Lcom/nic/mparivahan/LLServices/GetLlPojo/PresDistrict;", "mobileNumber", "presStayYears", "presPhoneNumber", "presHouseNo", "bloodGroup", "Lcom/nic/mparivahan/LLServices/GetLlPojo/BloodGroup;", "presSameAsPerm", "permState", "Lcom/nic/mparivahan/LLServices/GetLlPojo/PermState;", "countryOfBirth", "Lcom/nic/mparivahan/LLServices/GetLlPojo/CountryOfBirth;", "DisableStForMp", "", "idMarks1", "idMarks2", "fname", "presStayMonths", "permVillageOrTown", "presSubDistrict", "Lcom/nic/mparivahan/LLServices/GetLlPojo/PresSubDistrict;", "permSubDistrict", "Lcom/nic/mparivahan/LLServices/GetLlPojo/PermSubDistrict;", "onlyEditAddressLL", "permLocation", "aadhaarNumber", "selectAll", "eduQual", "Lcom/nic/mparivahan/LLServices/GetLlPojo/EduQual;", "editAddressLL", "alternatemobileNumber", "permStreet", "permPinCode", "refStateEqiCovsMessage", "permDistrict", "Lcom/nic/mparivahan/LLServices/GetLlPojo/PermDistrict;", "newFullName", "permHouseNo", "gender", "Lcom/nic/mparivahan/LLServices/GetLlPojo/Gender;", "drivingSchoolDet", "Lcom/nic/mparivahan/LLServices/GetLlPojo/DrivingSchoolDet;", "mname", "presStreet", "llFromRTO1", "Lcom/nic/mparivahan/LLServices/GetLlPojo/LlFromRTO1;", "presState", "Lcom/nic/mparivahan/LLServices/GetLlPojo/PresState;", "lname", "email", "PresVillageOrTown", "placeOfBirth", "presCity", "Lcom/nic/mparivahan/LLServices/GetLlPojo/PresCity;", "presPinCode", "dateOfBirth", "checkCovs", "Lcom/nic/mparivahan/NewDlScreen/Modal/CheckCovs;", "swdmName", "presLocation", "permCity", "Lcom/nic/mparivahan/LLServices/GetLlPojo/PermCity;", "llstoDisplayMap", "Lcom/nic/mparivahan/LLServices/GetLlPojo/LlstoDisplayMap;", "llFromState1", "Lcom/nic/mparivahan/LLServices/GetLlPojo/LlFromState1;", "age", "swdlName", "error", "dobError", "dateNotMatchError", "invalidLLNo", "alreadyApplied", "alreadyHavingDL", "dlAppliedAfterFewDays", "(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDisableStForMp", "()Ljava/lang/Boolean;", "setDisableStForMp", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getPresVillageOrTown", "()Ljava/lang/String;", "setPresVillageOrTown", "(Ljava/lang/String;)V", "getAadhaarNumber", "setAadhaarNumber", "getAge", "setAge", "getAlreadyApplied", "setAlreadyApplied", "getAlreadyHavingDL", "setAlreadyHavingDL", "getAlternatemobileNumber", "setAlternatemobileNumber", "getBloodGroup", "()Ljava/util/ArrayList;", "setBloodGroup", "(Ljava/util/ArrayList;)V", "getCheckCovs", "setCheckCovs", "getCountryOfBirth", "setCountryOfBirth", "getDateNotMatchError", "setDateNotMatchError", "getDateOfBirth", "setDateOfBirth", "getDlAppliedAfterFewDays", "setDlAppliedAfterFewDays", "getDobError", "setDobError", "getDrivingSchoolDet", "setDrivingSchoolDet", "getEditAddressLL", "setEditAddressLL", "getEduQual", "setEduQual", "getEmail", "setEmail", "getError", "setError", "getFname", "setFname", "getGender", "setGender", "getIdMarks1", "setIdMarks1", "getIdMarks2", "setIdMarks2", "getInvalidLLNo", "setInvalidLLNo", "getLlFromRTO1", "setLlFromRTO1", "getLlFromState1", "setLlFromState1", "getLlstoDisplayMap", "setLlstoDisplayMap", "getLname", "setLname", "getMname", "setMname", "getMobileNumber", "setMobileNumber", "getNewFullName", "setNewFullName", "getOnlyEditAddressLL", "setOnlyEditAddressLL", "getPermCity", "setPermCity", "getPermDistrict", "setPermDistrict", "getPermHouseNo", "setPermHouseNo", "getPermLocation", "setPermLocation", "getPermPinCode", "setPermPinCode", "getPermState", "setPermState", "getPermStreet", "setPermStreet", "getPermSubDistrict", "setPermSubDistrict", "getPermVillageOrTown", "setPermVillageOrTown", "getPlaceOfBirth", "setPlaceOfBirth", "getPresCity", "setPresCity", "getPresDistrict", "setPresDistrict", "getPresHouseNo", "setPresHouseNo", "getPresLocation", "setPresLocation", "getPresPhoneNumber", "setPresPhoneNumber", "getPresPinCode", "setPresPinCode", "getPresSameAsPerm", "setPresSameAsPerm", "getPresState", "setPresState", "getPresStayMonths", "setPresStayMonths", "getPresStayYears", "setPresStayYears", "getPresStreet", "setPresStreet", "getPresSubDistrict", "setPresSubDistrict", "getRefStateEqiCovsMessage", "setRefStateEqiCovsMessage", "getRelationType", "setRelationType", "getSelectAll", "setSelectAll", "getSelectedCovs", "setSelectedCovs", "getSwdfName", "setSwdfName", "getSwdlName", "setSwdlName", "getSwdmName", "setSwdmName", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component60", "component61", "component7", "component8", "component9", "copy", "(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/nic/mparivahan/NewDlScreen/Modal/LLDetailsResultModal;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class LLDetailsResultModal implements Parcelable {
    public static final Parcelable.Creator<LLDetailsResultModal> CREATOR = new a();

    @xy5("DisableStForMp")
    private Boolean DisableStForMp;

    @xy5("PresVillageOrTown")
    private String PresVillageOrTown;

    @xy5("aadhaarNumber")
    private String aadhaarNumber;

    @xy5("age")
    private String age;

    @xy5("UC01-E255")
    private String alreadyApplied;

    @xy5("UC01-E253")
    private String alreadyHavingDL;

    @xy5("alternatemobileNumber")
    private String alternatemobileNumber;

    @xy5("bloodGroup")
    private ArrayList<BloodGroup> bloodGroup;

    @xy5("checkCovs")
    private ArrayList<CheckCovs> checkCovs;

    @xy5("countryOfBirth")
    private ArrayList<CountryOfBirth> countryOfBirth;

    @xy5("UC95-E10")
    private String dateNotMatchError;

    @xy5("dateOfBirth")
    private String dateOfBirth;

    @xy5("UC01-E256")
    private String dlAppliedAfterFewDays;

    @xy5("UC01-E257")
    private String dobError;

    @xy5("drivingSchoolDet")
    private ArrayList<DrivingSchoolDet> drivingSchoolDet;

    @xy5("editAddressLL")
    private Boolean editAddressLL;

    @xy5("eduQual")
    private ArrayList<EduQual> eduQual;

    @xy5("email")
    private String email;

    @xy5("UC01-E254")
    private String error;

    @xy5("fname")
    private String fname;

    @xy5("gender")
    private ArrayList<Gender> gender;

    @xy5("idMarks1")
    private String idMarks1;

    @xy5("idMarks2")
    private String idMarks2;

    @xy5("UC01-E258")
    private String invalidLLNo;

    @xy5("llFromRTO1")
    private ArrayList<LlFromRTO1> llFromRTO1;

    @xy5("llFromState1")
    private ArrayList<LlFromState1> llFromState1;

    @xy5("llstoDisplayMap")
    private ArrayList<LlstoDisplayMap> llstoDisplayMap;

    @xy5("lname")
    private String lname;

    @xy5("mname")
    private String mname;

    @xy5("mobileNumber")
    private String mobileNumber;

    @xy5("newFullName")
    private String newFullName;

    @xy5("onlyEditAddressLL")
    private Boolean onlyEditAddressLL;

    @xy5("permCity")
    private ArrayList<PermCity> permCity;

    @xy5("permDistrict")
    private ArrayList<PermDistrict> permDistrict;

    @xy5("permHouseNo")
    private String permHouseNo;

    @xy5("permLocation")
    private String permLocation;

    @xy5("permPinCode")
    private String permPinCode;

    @xy5("permState")
    private ArrayList<PermState> permState;

    @xy5("permStreet")
    private String permStreet;

    @xy5("permSubDistrict")
    private ArrayList<PermSubDistrict> permSubDistrict;

    @xy5("permVillageOrTown")
    private String permVillageOrTown;

    @xy5("placeOfBirth")
    private String placeOfBirth;

    @xy5("presCity")
    private ArrayList<PresCity> presCity;

    @xy5("presDistrict")
    private ArrayList<PresDistrict> presDistrict;

    @xy5("presHouseNo")
    private String presHouseNo;

    @xy5("presLocation")
    private String presLocation;

    @xy5("presPhoneNumber")
    private String presPhoneNumber;

    @xy5("presPinCode")
    private String presPinCode;

    @xy5("presSameAsPerm")
    private String presSameAsPerm;

    @xy5("presState")
    private ArrayList<PresState> presState;

    @xy5("presStayMonths")
    private String presStayMonths;

    @xy5("presStayYears")
    private String presStayYears;

    @xy5("presStreet")
    private String presStreet;

    @xy5("presSubDistrict")
    private ArrayList<PresSubDistrict> presSubDistrict;

    @xy5("refStateEqiCovsMessage")
    private String refStateEqiCovsMessage;

    @xy5("relationType")
    private ArrayList<RelationType> relationType;

    @xy5("selectAll")
    private String selectAll;

    @xy5("selectedCovs")
    private String selectedCovs;

    @xy5("swdfName")
    private String swdfName;

    @xy5("swdlName")
    private String swdlName;

    @xy5("swdmName")
    private String swdmName;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LLDetailsResultModal createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readSerializable());
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(parcel.readSerializable());
            }
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            int i5 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                arrayList3.add(parcel.readSerializable());
            }
            String string7 = parcel.readString();
            int i7 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i7);
            for (int i8 = 0; i8 != i7; i8++) {
                arrayList4.add(parcel.readSerializable());
            }
            int i9 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(i9);
            for (int i10 = 0; i10 != i9; i10++) {
                arrayList5.add(parcel.readSerializable());
            }
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            int i11 = parcel.readInt();
            Boolean bool = boolValueOf;
            ArrayList arrayList6 = new ArrayList(i11);
            int i12 = 0;
            while (i12 != i11) {
                arrayList6.add(parcel.readSerializable());
                i12++;
                i11 = i11;
            }
            int i13 = parcel.readInt();
            ArrayList arrayList7 = new ArrayList(i13);
            int i14 = 0;
            while (i14 != i13) {
                arrayList7.add(parcel.readSerializable());
                i14++;
                i13 = i13;
            }
            Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            int i15 = parcel.readInt();
            Boolean bool2 = boolValueOf2;
            ArrayList arrayList8 = new ArrayList(i15);
            int i16 = 0;
            while (i16 != i15) {
                arrayList8.add(parcel.readSerializable());
                i16++;
                i15 = i15;
            }
            Boolean boolValueOf3 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            String string19 = parcel.readString();
            int i17 = parcel.readInt();
            ArrayList arrayList9 = new ArrayList(i17);
            int i18 = 0;
            while (i18 != i17) {
                arrayList9.add(parcel.readSerializable());
                i18++;
                i17 = i17;
            }
            String string20 = parcel.readString();
            String string21 = parcel.readString();
            int i19 = parcel.readInt();
            ArrayList arrayList10 = new ArrayList(i19);
            int i20 = 0;
            while (i20 != i19) {
                arrayList10.add(parcel.readSerializable());
                i20++;
                i19 = i19;
            }
            int i21 = parcel.readInt();
            ArrayList arrayList11 = new ArrayList(i21);
            int i22 = 0;
            while (i22 != i21) {
                arrayList11.add(parcel.readSerializable());
                i22++;
                i21 = i21;
            }
            String string22 = parcel.readString();
            String string23 = parcel.readString();
            int i23 = parcel.readInt();
            ArrayList arrayList12 = new ArrayList(i23);
            int i24 = 0;
            while (i24 != i23) {
                arrayList12.add(parcel.readSerializable());
                i24++;
                i23 = i23;
            }
            int i25 = parcel.readInt();
            ArrayList arrayList13 = new ArrayList(i25);
            int i26 = 0;
            while (i26 != i25) {
                arrayList13.add(parcel.readSerializable());
                i26++;
                i25 = i25;
            }
            String string24 = parcel.readString();
            String string25 = parcel.readString();
            String string26 = parcel.readString();
            String string27 = parcel.readString();
            int i27 = parcel.readInt();
            ArrayList arrayList14 = new ArrayList(i27);
            int i28 = 0;
            while (i28 != i27) {
                arrayList14.add(parcel.readSerializable());
                i28++;
                i27 = i27;
            }
            String string28 = parcel.readString();
            String string29 = parcel.readString();
            int i29 = parcel.readInt();
            ArrayList arrayList15 = new ArrayList(i29);
            int i30 = 0;
            while (i30 != i29) {
                arrayList15.add(CheckCovs.CREATOR.createFromParcel(parcel));
                i30++;
                i29 = i29;
            }
            String string30 = parcel.readString();
            String string31 = parcel.readString();
            int i31 = parcel.readInt();
            ArrayList arrayList16 = new ArrayList(i31);
            int i32 = 0;
            while (i32 != i31) {
                arrayList16.add(parcel.readSerializable());
                i32++;
                i31 = i31;
            }
            int i33 = parcel.readInt();
            ArrayList arrayList17 = new ArrayList(i33);
            int i34 = 0;
            while (i34 != i33) {
                arrayList17.add(parcel.readSerializable());
                i34++;
                i33 = i33;
            }
            int i35 = parcel.readInt();
            ArrayList arrayList18 = new ArrayList(i35);
            int i36 = 0;
            while (i36 != i35) {
                arrayList18.add(parcel.readSerializable());
                i36++;
                i35 = i35;
            }
            return new LLDetailsResultModal(arrayList, string, string2, arrayList2, string3, string4, string5, string6, arrayList3, string7, arrayList4, arrayList5, bool, string8, string9, string10, string11, string12, arrayList6, arrayList7, bool2, string13, string14, string15, arrayList8, boolValueOf3, string16, string17, string18, string19, arrayList9, string20, string21, arrayList10, arrayList11, string22, string23, arrayList12, arrayList13, string24, string25, string26, string27, arrayList14, string28, string29, arrayList15, string30, string31, arrayList16, arrayList17, arrayList18, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LLDetailsResultModal[] newArray(int i) {
            return new LLDetailsResultModal[i];
        }
    }

    public LLDetailsResultModal() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 536870911, null);
    }

    public final ArrayList<RelationType> component1() {
        return this.relationType;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPresSameAsPerm() {
        return this.presSameAsPerm;
    }

    public final ArrayList<PermState> component11() {
        return this.permState;
    }

    public final ArrayList<CountryOfBirth> component12() {
        return this.countryOfBirth;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getDisableStForMp() {
        return this.DisableStForMp;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getIdMarks1() {
        return this.idMarks1;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getIdMarks2() {
        return this.idMarks2;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getFname() {
        return this.fname;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getPresStayMonths() {
        return this.presStayMonths;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getPermVillageOrTown() {
        return this.permVillageOrTown;
    }

    public final ArrayList<PresSubDistrict> component19() {
        return this.presSubDistrict;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSelectedCovs() {
        return this.selectedCovs;
    }

    public final ArrayList<PermSubDistrict> component20() {
        return this.permSubDistrict;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Boolean getOnlyEditAddressLL() {
        return this.onlyEditAddressLL;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getPermLocation() {
        return this.permLocation;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getAadhaarNumber() {
        return this.aadhaarNumber;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getSelectAll() {
        return this.selectAll;
    }

    public final ArrayList<EduQual> component25() {
        return this.eduQual;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Boolean getEditAddressLL() {
        return this.editAddressLL;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getAlternatemobileNumber() {
        return this.alternatemobileNumber;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getPermStreet() {
        return this.permStreet;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getPermPinCode() {
        return this.permPinCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSwdfName() {
        return this.swdfName;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getRefStateEqiCovsMessage() {
        return this.refStateEqiCovsMessage;
    }

    public final ArrayList<PermDistrict> component31() {
        return this.permDistrict;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getNewFullName() {
        return this.newFullName;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getPermHouseNo() {
        return this.permHouseNo;
    }

    public final ArrayList<Gender> component34() {
        return this.gender;
    }

    public final ArrayList<DrivingSchoolDet> component35() {
        return this.drivingSchoolDet;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getMname() {
        return this.mname;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getPresStreet() {
        return this.presStreet;
    }

    public final ArrayList<LlFromRTO1> component38() {
        return this.llFromRTO1;
    }

    public final ArrayList<PresState> component39() {
        return this.presState;
    }

    public final ArrayList<PresDistrict> component4() {
        return this.presDistrict;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final String getLname() {
        return this.lname;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final String getPresVillageOrTown() {
        return this.PresVillageOrTown;
    }

    /* JADX INFO: renamed from: component43, reason: from getter */
    public final String getPlaceOfBirth() {
        return this.placeOfBirth;
    }

    public final ArrayList<PresCity> component44() {
        return this.presCity;
    }

    /* JADX INFO: renamed from: component45, reason: from getter */
    public final String getPresPinCode() {
        return this.presPinCode;
    }

    /* JADX INFO: renamed from: component46, reason: from getter */
    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final ArrayList<CheckCovs> component47() {
        return this.checkCovs;
    }

    /* JADX INFO: renamed from: component48, reason: from getter */
    public final String getSwdmName() {
        return this.swdmName;
    }

    /* JADX INFO: renamed from: component49, reason: from getter */
    public final String getPresLocation() {
        return this.presLocation;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    public final ArrayList<PermCity> component50() {
        return this.permCity;
    }

    public final ArrayList<LlstoDisplayMap> component51() {
        return this.llstoDisplayMap;
    }

    public final ArrayList<LlFromState1> component52() {
        return this.llFromState1;
    }

    /* JADX INFO: renamed from: component53, reason: from getter */
    public final String getAge() {
        return this.age;
    }

    /* JADX INFO: renamed from: component54, reason: from getter */
    public final String getSwdlName() {
        return this.swdlName;
    }

    /* JADX INFO: renamed from: component55, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: component56, reason: from getter */
    public final String getDobError() {
        return this.dobError;
    }

    /* JADX INFO: renamed from: component57, reason: from getter */
    public final String getDateNotMatchError() {
        return this.dateNotMatchError;
    }

    /* JADX INFO: renamed from: component58, reason: from getter */
    public final String getInvalidLLNo() {
        return this.invalidLLNo;
    }

    /* JADX INFO: renamed from: component59, reason: from getter */
    public final String getAlreadyApplied() {
        return this.alreadyApplied;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPresStayYears() {
        return this.presStayYears;
    }

    /* JADX INFO: renamed from: component60, reason: from getter */
    public final String getAlreadyHavingDL() {
        return this.alreadyHavingDL;
    }

    /* JADX INFO: renamed from: component61, reason: from getter */
    public final String getDlAppliedAfterFewDays() {
        return this.dlAppliedAfterFewDays;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPresPhoneNumber() {
        return this.presPhoneNumber;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPresHouseNo() {
        return this.presHouseNo;
    }

    public final ArrayList<BloodGroup> component9() {
        return this.bloodGroup;
    }

    public final LLDetailsResultModal copy(ArrayList<RelationType> relationType, String selectedCovs, String swdfName, ArrayList<PresDistrict> presDistrict, String mobileNumber, String presStayYears, String presPhoneNumber, String presHouseNo, ArrayList<BloodGroup> bloodGroup, String presSameAsPerm, ArrayList<PermState> permState, ArrayList<CountryOfBirth> countryOfBirth, Boolean DisableStForMp, String idMarks1, String idMarks2, String fname, String presStayMonths, String permVillageOrTown, ArrayList<PresSubDistrict> presSubDistrict, ArrayList<PermSubDistrict> permSubDistrict, Boolean onlyEditAddressLL, String permLocation, String aadhaarNumber, String selectAll, ArrayList<EduQual> eduQual, Boolean editAddressLL, String alternatemobileNumber, String permStreet, String permPinCode, String refStateEqiCovsMessage, ArrayList<PermDistrict> permDistrict, String newFullName, String permHouseNo, ArrayList<Gender> gender, ArrayList<DrivingSchoolDet> drivingSchoolDet, String mname, String presStreet, ArrayList<LlFromRTO1> llFromRTO1, ArrayList<PresState> presState, String lname, String email, String PresVillageOrTown, String placeOfBirth, ArrayList<PresCity> presCity, String presPinCode, String dateOfBirth, ArrayList<CheckCovs> checkCovs, String swdmName, String presLocation, ArrayList<PermCity> permCity, ArrayList<LlstoDisplayMap> llstoDisplayMap, ArrayList<LlFromState1> llFromState1, String age, String swdlName, String error, String dobError, String dateNotMatchError, String invalidLLNo, String alreadyApplied, String alreadyHavingDL, String dlAppliedAfterFewDays) {
        Intrinsics.checkNotNullParameter(relationType, "relationType");
        Intrinsics.checkNotNullParameter(selectedCovs, "selectedCovs");
        Intrinsics.checkNotNullParameter(swdfName, "swdfName");
        Intrinsics.checkNotNullParameter(presDistrict, "presDistrict");
        Intrinsics.checkNotNullParameter(mobileNumber, "mobileNumber");
        Intrinsics.checkNotNullParameter(presStayYears, "presStayYears");
        Intrinsics.checkNotNullParameter(presPhoneNumber, "presPhoneNumber");
        Intrinsics.checkNotNullParameter(presHouseNo, "presHouseNo");
        Intrinsics.checkNotNullParameter(bloodGroup, "bloodGroup");
        Intrinsics.checkNotNullParameter(presSameAsPerm, "presSameAsPerm");
        Intrinsics.checkNotNullParameter(permState, "permState");
        Intrinsics.checkNotNullParameter(countryOfBirth, "countryOfBirth");
        Intrinsics.checkNotNullParameter(idMarks1, "idMarks1");
        Intrinsics.checkNotNullParameter(idMarks2, "idMarks2");
        Intrinsics.checkNotNullParameter(fname, "fname");
        Intrinsics.checkNotNullParameter(presStayMonths, "presStayMonths");
        Intrinsics.checkNotNullParameter(permVillageOrTown, "permVillageOrTown");
        Intrinsics.checkNotNullParameter(presSubDistrict, "presSubDistrict");
        Intrinsics.checkNotNullParameter(permSubDistrict, "permSubDistrict");
        Intrinsics.checkNotNullParameter(permLocation, "permLocation");
        Intrinsics.checkNotNullParameter(aadhaarNumber, "aadhaarNumber");
        Intrinsics.checkNotNullParameter(eduQual, "eduQual");
        Intrinsics.checkNotNullParameter(alternatemobileNumber, "alternatemobileNumber");
        Intrinsics.checkNotNullParameter(permStreet, "permStreet");
        Intrinsics.checkNotNullParameter(permPinCode, "permPinCode");
        Intrinsics.checkNotNullParameter(refStateEqiCovsMessage, "refStateEqiCovsMessage");
        Intrinsics.checkNotNullParameter(permDistrict, "permDistrict");
        Intrinsics.checkNotNullParameter(newFullName, "newFullName");
        Intrinsics.checkNotNullParameter(permHouseNo, "permHouseNo");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(drivingSchoolDet, "drivingSchoolDet");
        Intrinsics.checkNotNullParameter(mname, "mname");
        Intrinsics.checkNotNullParameter(presStreet, "presStreet");
        Intrinsics.checkNotNullParameter(llFromRTO1, "llFromRTO1");
        Intrinsics.checkNotNullParameter(presState, "presState");
        Intrinsics.checkNotNullParameter(lname, "lname");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(PresVillageOrTown, "PresVillageOrTown");
        Intrinsics.checkNotNullParameter(placeOfBirth, "placeOfBirth");
        Intrinsics.checkNotNullParameter(presCity, "presCity");
        Intrinsics.checkNotNullParameter(presPinCode, "presPinCode");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(checkCovs, "checkCovs");
        Intrinsics.checkNotNullParameter(swdmName, "swdmName");
        Intrinsics.checkNotNullParameter(presLocation, "presLocation");
        Intrinsics.checkNotNullParameter(permCity, "permCity");
        Intrinsics.checkNotNullParameter(llstoDisplayMap, "llstoDisplayMap");
        Intrinsics.checkNotNullParameter(llFromState1, "llFromState1");
        Intrinsics.checkNotNullParameter(age, "age");
        Intrinsics.checkNotNullParameter(swdlName, "swdlName");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(dobError, "dobError");
        Intrinsics.checkNotNullParameter(dateNotMatchError, "dateNotMatchError");
        Intrinsics.checkNotNullParameter(invalidLLNo, "invalidLLNo");
        Intrinsics.checkNotNullParameter(alreadyApplied, "alreadyApplied");
        Intrinsics.checkNotNullParameter(alreadyHavingDL, "alreadyHavingDL");
        Intrinsics.checkNotNullParameter(dlAppliedAfterFewDays, "dlAppliedAfterFewDays");
        return new LLDetailsResultModal(relationType, selectedCovs, swdfName, presDistrict, mobileNumber, presStayYears, presPhoneNumber, presHouseNo, bloodGroup, presSameAsPerm, permState, countryOfBirth, DisableStForMp, idMarks1, idMarks2, fname, presStayMonths, permVillageOrTown, presSubDistrict, permSubDistrict, onlyEditAddressLL, permLocation, aadhaarNumber, selectAll, eduQual, editAddressLL, alternatemobileNumber, permStreet, permPinCode, refStateEqiCovsMessage, permDistrict, newFullName, permHouseNo, gender, drivingSchoolDet, mname, presStreet, llFromRTO1, presState, lname, email, PresVillageOrTown, placeOfBirth, presCity, presPinCode, dateOfBirth, checkCovs, swdmName, presLocation, permCity, llstoDisplayMap, llFromState1, age, swdlName, error, dobError, dateNotMatchError, invalidLLNo, alreadyApplied, alreadyHavingDL, dlAppliedAfterFewDays);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LLDetailsResultModal)) {
            return false;
        }
        LLDetailsResultModal lLDetailsResultModal = (LLDetailsResultModal) other;
        return Intrinsics.areEqual(this.relationType, lLDetailsResultModal.relationType) && Intrinsics.areEqual(this.selectedCovs, lLDetailsResultModal.selectedCovs) && Intrinsics.areEqual(this.swdfName, lLDetailsResultModal.swdfName) && Intrinsics.areEqual(this.presDistrict, lLDetailsResultModal.presDistrict) && Intrinsics.areEqual(this.mobileNumber, lLDetailsResultModal.mobileNumber) && Intrinsics.areEqual(this.presStayYears, lLDetailsResultModal.presStayYears) && Intrinsics.areEqual(this.presPhoneNumber, lLDetailsResultModal.presPhoneNumber) && Intrinsics.areEqual(this.presHouseNo, lLDetailsResultModal.presHouseNo) && Intrinsics.areEqual(this.bloodGroup, lLDetailsResultModal.bloodGroup) && Intrinsics.areEqual(this.presSameAsPerm, lLDetailsResultModal.presSameAsPerm) && Intrinsics.areEqual(this.permState, lLDetailsResultModal.permState) && Intrinsics.areEqual(this.countryOfBirth, lLDetailsResultModal.countryOfBirth) && Intrinsics.areEqual(this.DisableStForMp, lLDetailsResultModal.DisableStForMp) && Intrinsics.areEqual(this.idMarks1, lLDetailsResultModal.idMarks1) && Intrinsics.areEqual(this.idMarks2, lLDetailsResultModal.idMarks2) && Intrinsics.areEqual(this.fname, lLDetailsResultModal.fname) && Intrinsics.areEqual(this.presStayMonths, lLDetailsResultModal.presStayMonths) && Intrinsics.areEqual(this.permVillageOrTown, lLDetailsResultModal.permVillageOrTown) && Intrinsics.areEqual(this.presSubDistrict, lLDetailsResultModal.presSubDistrict) && Intrinsics.areEqual(this.permSubDistrict, lLDetailsResultModal.permSubDistrict) && Intrinsics.areEqual(this.onlyEditAddressLL, lLDetailsResultModal.onlyEditAddressLL) && Intrinsics.areEqual(this.permLocation, lLDetailsResultModal.permLocation) && Intrinsics.areEqual(this.aadhaarNumber, lLDetailsResultModal.aadhaarNumber) && Intrinsics.areEqual(this.selectAll, lLDetailsResultModal.selectAll) && Intrinsics.areEqual(this.eduQual, lLDetailsResultModal.eduQual) && Intrinsics.areEqual(this.editAddressLL, lLDetailsResultModal.editAddressLL) && Intrinsics.areEqual(this.alternatemobileNumber, lLDetailsResultModal.alternatemobileNumber) && Intrinsics.areEqual(this.permStreet, lLDetailsResultModal.permStreet) && Intrinsics.areEqual(this.permPinCode, lLDetailsResultModal.permPinCode) && Intrinsics.areEqual(this.refStateEqiCovsMessage, lLDetailsResultModal.refStateEqiCovsMessage) && Intrinsics.areEqual(this.permDistrict, lLDetailsResultModal.permDistrict) && Intrinsics.areEqual(this.newFullName, lLDetailsResultModal.newFullName) && Intrinsics.areEqual(this.permHouseNo, lLDetailsResultModal.permHouseNo) && Intrinsics.areEqual(this.gender, lLDetailsResultModal.gender) && Intrinsics.areEqual(this.drivingSchoolDet, lLDetailsResultModal.drivingSchoolDet) && Intrinsics.areEqual(this.mname, lLDetailsResultModal.mname) && Intrinsics.areEqual(this.presStreet, lLDetailsResultModal.presStreet) && Intrinsics.areEqual(this.llFromRTO1, lLDetailsResultModal.llFromRTO1) && Intrinsics.areEqual(this.presState, lLDetailsResultModal.presState) && Intrinsics.areEqual(this.lname, lLDetailsResultModal.lname) && Intrinsics.areEqual(this.email, lLDetailsResultModal.email) && Intrinsics.areEqual(this.PresVillageOrTown, lLDetailsResultModal.PresVillageOrTown) && Intrinsics.areEqual(this.placeOfBirth, lLDetailsResultModal.placeOfBirth) && Intrinsics.areEqual(this.presCity, lLDetailsResultModal.presCity) && Intrinsics.areEqual(this.presPinCode, lLDetailsResultModal.presPinCode) && Intrinsics.areEqual(this.dateOfBirth, lLDetailsResultModal.dateOfBirth) && Intrinsics.areEqual(this.checkCovs, lLDetailsResultModal.checkCovs) && Intrinsics.areEqual(this.swdmName, lLDetailsResultModal.swdmName) && Intrinsics.areEqual(this.presLocation, lLDetailsResultModal.presLocation) && Intrinsics.areEqual(this.permCity, lLDetailsResultModal.permCity) && Intrinsics.areEqual(this.llstoDisplayMap, lLDetailsResultModal.llstoDisplayMap) && Intrinsics.areEqual(this.llFromState1, lLDetailsResultModal.llFromState1) && Intrinsics.areEqual(this.age, lLDetailsResultModal.age) && Intrinsics.areEqual(this.swdlName, lLDetailsResultModal.swdlName) && Intrinsics.areEqual(this.error, lLDetailsResultModal.error) && Intrinsics.areEqual(this.dobError, lLDetailsResultModal.dobError) && Intrinsics.areEqual(this.dateNotMatchError, lLDetailsResultModal.dateNotMatchError) && Intrinsics.areEqual(this.invalidLLNo, lLDetailsResultModal.invalidLLNo) && Intrinsics.areEqual(this.alreadyApplied, lLDetailsResultModal.alreadyApplied) && Intrinsics.areEqual(this.alreadyHavingDL, lLDetailsResultModal.alreadyHavingDL) && Intrinsics.areEqual(this.dlAppliedAfterFewDays, lLDetailsResultModal.dlAppliedAfterFewDays);
    }

    public final String getAadhaarNumber() {
        return this.aadhaarNumber;
    }

    public final String getAge() {
        return this.age;
    }

    public final String getAlreadyApplied() {
        return this.alreadyApplied;
    }

    public final String getAlreadyHavingDL() {
        return this.alreadyHavingDL;
    }

    public final String getAlternatemobileNumber() {
        return this.alternatemobileNumber;
    }

    public final ArrayList<BloodGroup> getBloodGroup() {
        return this.bloodGroup;
    }

    public final ArrayList<CheckCovs> getCheckCovs() {
        return this.checkCovs;
    }

    public final ArrayList<CountryOfBirth> getCountryOfBirth() {
        return this.countryOfBirth;
    }

    public final String getDateNotMatchError() {
        return this.dateNotMatchError;
    }

    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final Boolean getDisableStForMp() {
        return this.DisableStForMp;
    }

    public final String getDlAppliedAfterFewDays() {
        return this.dlAppliedAfterFewDays;
    }

    public final String getDobError() {
        return this.dobError;
    }

    public final ArrayList<DrivingSchoolDet> getDrivingSchoolDet() {
        return this.drivingSchoolDet;
    }

    public final Boolean getEditAddressLL() {
        return this.editAddressLL;
    }

    public final ArrayList<EduQual> getEduQual() {
        return this.eduQual;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getError() {
        return this.error;
    }

    public final String getFname() {
        return this.fname;
    }

    public final ArrayList<Gender> getGender() {
        return this.gender;
    }

    public final String getIdMarks1() {
        return this.idMarks1;
    }

    public final String getIdMarks2() {
        return this.idMarks2;
    }

    public final String getInvalidLLNo() {
        return this.invalidLLNo;
    }

    public final ArrayList<LlFromRTO1> getLlFromRTO1() {
        return this.llFromRTO1;
    }

    public final ArrayList<LlFromState1> getLlFromState1() {
        return this.llFromState1;
    }

    public final ArrayList<LlstoDisplayMap> getLlstoDisplayMap() {
        return this.llstoDisplayMap;
    }

    public final String getLname() {
        return this.lname;
    }

    public final String getMname() {
        return this.mname;
    }

    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    public final String getNewFullName() {
        return this.newFullName;
    }

    public final Boolean getOnlyEditAddressLL() {
        return this.onlyEditAddressLL;
    }

    public final ArrayList<PermCity> getPermCity() {
        return this.permCity;
    }

    public final ArrayList<PermDistrict> getPermDistrict() {
        return this.permDistrict;
    }

    public final String getPermHouseNo() {
        return this.permHouseNo;
    }

    public final String getPermLocation() {
        return this.permLocation;
    }

    public final String getPermPinCode() {
        return this.permPinCode;
    }

    public final ArrayList<PermState> getPermState() {
        return this.permState;
    }

    public final String getPermStreet() {
        return this.permStreet;
    }

    public final ArrayList<PermSubDistrict> getPermSubDistrict() {
        return this.permSubDistrict;
    }

    public final String getPermVillageOrTown() {
        return this.permVillageOrTown;
    }

    public final String getPlaceOfBirth() {
        return this.placeOfBirth;
    }

    public final ArrayList<PresCity> getPresCity() {
        return this.presCity;
    }

    public final ArrayList<PresDistrict> getPresDistrict() {
        return this.presDistrict;
    }

    public final String getPresHouseNo() {
        return this.presHouseNo;
    }

    public final String getPresLocation() {
        return this.presLocation;
    }

    public final String getPresPhoneNumber() {
        return this.presPhoneNumber;
    }

    public final String getPresPinCode() {
        return this.presPinCode;
    }

    public final String getPresSameAsPerm() {
        return this.presSameAsPerm;
    }

    public final ArrayList<PresState> getPresState() {
        return this.presState;
    }

    public final String getPresStayMonths() {
        return this.presStayMonths;
    }

    public final String getPresStayYears() {
        return this.presStayYears;
    }

    public final String getPresStreet() {
        return this.presStreet;
    }

    public final ArrayList<PresSubDistrict> getPresSubDistrict() {
        return this.presSubDistrict;
    }

    public final String getPresVillageOrTown() {
        return this.PresVillageOrTown;
    }

    public final String getRefStateEqiCovsMessage() {
        return this.refStateEqiCovsMessage;
    }

    public final ArrayList<RelationType> getRelationType() {
        return this.relationType;
    }

    public final String getSelectAll() {
        return this.selectAll;
    }

    public final String getSelectedCovs() {
        return this.selectedCovs;
    }

    public final String getSwdfName() {
        return this.swdfName;
    }

    public final String getSwdlName() {
        return this.swdlName;
    }

    public final String getSwdmName() {
        return this.swdmName;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((this.relationType.hashCode() * 31) + this.selectedCovs.hashCode()) * 31) + this.swdfName.hashCode()) * 31) + this.presDistrict.hashCode()) * 31) + this.mobileNumber.hashCode()) * 31) + this.presStayYears.hashCode()) * 31) + this.presPhoneNumber.hashCode()) * 31) + this.presHouseNo.hashCode()) * 31) + this.bloodGroup.hashCode()) * 31) + this.presSameAsPerm.hashCode()) * 31) + this.permState.hashCode()) * 31) + this.countryOfBirth.hashCode()) * 31;
        Boolean bool = this.DisableStForMp;
        int iHashCode2 = (((((((((((((((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.idMarks1.hashCode()) * 31) + this.idMarks2.hashCode()) * 31) + this.fname.hashCode()) * 31) + this.presStayMonths.hashCode()) * 31) + this.permVillageOrTown.hashCode()) * 31) + this.presSubDistrict.hashCode()) * 31) + this.permSubDistrict.hashCode()) * 31;
        Boolean bool2 = this.onlyEditAddressLL;
        int iHashCode3 = (((((iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + this.permLocation.hashCode()) * 31) + this.aadhaarNumber.hashCode()) * 31;
        String str = this.selectAll;
        int iHashCode4 = (((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.eduQual.hashCode()) * 31;
        Boolean bool3 = this.editAddressLL;
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode4 + (bool3 != null ? bool3.hashCode() : 0)) * 31) + this.alternatemobileNumber.hashCode()) * 31) + this.permStreet.hashCode()) * 31) + this.permPinCode.hashCode()) * 31) + this.refStateEqiCovsMessage.hashCode()) * 31) + this.permDistrict.hashCode()) * 31) + this.newFullName.hashCode()) * 31) + this.permHouseNo.hashCode()) * 31) + this.gender.hashCode()) * 31) + this.drivingSchoolDet.hashCode()) * 31) + this.mname.hashCode()) * 31) + this.presStreet.hashCode()) * 31) + this.llFromRTO1.hashCode()) * 31) + this.presState.hashCode()) * 31) + this.lname.hashCode()) * 31) + this.email.hashCode()) * 31) + this.PresVillageOrTown.hashCode()) * 31) + this.placeOfBirth.hashCode()) * 31) + this.presCity.hashCode()) * 31) + this.presPinCode.hashCode()) * 31) + this.dateOfBirth.hashCode()) * 31) + this.checkCovs.hashCode()) * 31) + this.swdmName.hashCode()) * 31) + this.presLocation.hashCode()) * 31) + this.permCity.hashCode()) * 31) + this.llstoDisplayMap.hashCode()) * 31) + this.llFromState1.hashCode()) * 31) + this.age.hashCode()) * 31) + this.swdlName.hashCode()) * 31) + this.error.hashCode()) * 31) + this.dobError.hashCode()) * 31) + this.dateNotMatchError.hashCode()) * 31) + this.invalidLLNo.hashCode()) * 31) + this.alreadyApplied.hashCode()) * 31) + this.alreadyHavingDL.hashCode()) * 31) + this.dlAppliedAfterFewDays.hashCode();
    }

    public final void setAadhaarNumber(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhaarNumber = str;
    }

    public final void setAge(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.age = str;
    }

    public final void setAlreadyApplied(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.alreadyApplied = str;
    }

    public final void setAlreadyHavingDL(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.alreadyHavingDL = str;
    }

    public final void setAlternatemobileNumber(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.alternatemobileNumber = str;
    }

    public final void setBloodGroup(ArrayList<BloodGroup> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.bloodGroup = arrayList;
    }

    public final void setCheckCovs(ArrayList<CheckCovs> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.checkCovs = arrayList;
    }

    public final void setCountryOfBirth(ArrayList<CountryOfBirth> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.countryOfBirth = arrayList;
    }

    public final void setDateNotMatchError(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dateNotMatchError = str;
    }

    public final void setDateOfBirth(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dateOfBirth = str;
    }

    public final void setDisableStForMp(Boolean bool) {
        this.DisableStForMp = bool;
    }

    public final void setDlAppliedAfterFewDays(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dlAppliedAfterFewDays = str;
    }

    public final void setDobError(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dobError = str;
    }

    public final void setDrivingSchoolDet(ArrayList<DrivingSchoolDet> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.drivingSchoolDet = arrayList;
    }

    public final void setEditAddressLL(Boolean bool) {
        this.editAddressLL = bool;
    }

    public final void setEduQual(ArrayList<EduQual> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.eduQual = arrayList;
    }

    public final void setEmail(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.email = str;
    }

    public final void setError(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.error = str;
    }

    public final void setFname(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fname = str;
    }

    public final void setGender(ArrayList<Gender> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.gender = arrayList;
    }

    public final void setIdMarks1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.idMarks1 = str;
    }

    public final void setIdMarks2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.idMarks2 = str;
    }

    public final void setInvalidLLNo(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.invalidLLNo = str;
    }

    public final void setLlFromRTO1(ArrayList<LlFromRTO1> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.llFromRTO1 = arrayList;
    }

    public final void setLlFromState1(ArrayList<LlFromState1> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.llFromState1 = arrayList;
    }

    public final void setLlstoDisplayMap(ArrayList<LlstoDisplayMap> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.llstoDisplayMap = arrayList;
    }

    public final void setLname(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lname = str;
    }

    public final void setMname(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mname = str;
    }

    public final void setMobileNumber(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mobileNumber = str;
    }

    public final void setNewFullName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.newFullName = str;
    }

    public final void setOnlyEditAddressLL(Boolean bool) {
        this.onlyEditAddressLL = bool;
    }

    public final void setPermCity(ArrayList<PermCity> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.permCity = arrayList;
    }

    public final void setPermDistrict(ArrayList<PermDistrict> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.permDistrict = arrayList;
    }

    public final void setPermHouseNo(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.permHouseNo = str;
    }

    public final void setPermLocation(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.permLocation = str;
    }

    public final void setPermPinCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.permPinCode = str;
    }

    public final void setPermState(ArrayList<PermState> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.permState = arrayList;
    }

    public final void setPermStreet(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.permStreet = str;
    }

    public final void setPermSubDistrict(ArrayList<PermSubDistrict> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.permSubDistrict = arrayList;
    }

    public final void setPermVillageOrTown(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.permVillageOrTown = str;
    }

    public final void setPlaceOfBirth(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.placeOfBirth = str;
    }

    public final void setPresCity(ArrayList<PresCity> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.presCity = arrayList;
    }

    public final void setPresDistrict(ArrayList<PresDistrict> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.presDistrict = arrayList;
    }

    public final void setPresHouseNo(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.presHouseNo = str;
    }

    public final void setPresLocation(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.presLocation = str;
    }

    public final void setPresPhoneNumber(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.presPhoneNumber = str;
    }

    public final void setPresPinCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.presPinCode = str;
    }

    public final void setPresSameAsPerm(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.presSameAsPerm = str;
    }

    public final void setPresState(ArrayList<PresState> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.presState = arrayList;
    }

    public final void setPresStayMonths(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.presStayMonths = str;
    }

    public final void setPresStayYears(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.presStayYears = str;
    }

    public final void setPresStreet(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.presStreet = str;
    }

    public final void setPresSubDistrict(ArrayList<PresSubDistrict> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.presSubDistrict = arrayList;
    }

    public final void setPresVillageOrTown(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.PresVillageOrTown = str;
    }

    public final void setRefStateEqiCovsMessage(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.refStateEqiCovsMessage = str;
    }

    public final void setRelationType(ArrayList<RelationType> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.relationType = arrayList;
    }

    public final void setSelectAll(String str) {
        this.selectAll = str;
    }

    public final void setSelectedCovs(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.selectedCovs = str;
    }

    public final void setSwdfName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.swdfName = str;
    }

    public final void setSwdlName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.swdlName = str;
    }

    public final void setSwdmName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.swdmName = str;
    }

    public String toString() {
        return "LLDetailsResultModal(relationType=" + this.relationType + ", selectedCovs=" + this.selectedCovs + ", swdfName=" + this.swdfName + ", presDistrict=" + this.presDistrict + ", mobileNumber=" + this.mobileNumber + ", presStayYears=" + this.presStayYears + ", presPhoneNumber=" + this.presPhoneNumber + ", presHouseNo=" + this.presHouseNo + ", bloodGroup=" + this.bloodGroup + ", presSameAsPerm=" + this.presSameAsPerm + ", permState=" + this.permState + ", countryOfBirth=" + this.countryOfBirth + ", DisableStForMp=" + this.DisableStForMp + ", idMarks1=" + this.idMarks1 + ", idMarks2=" + this.idMarks2 + ", fname=" + this.fname + ", presStayMonths=" + this.presStayMonths + ", permVillageOrTown=" + this.permVillageOrTown + ", presSubDistrict=" + this.presSubDistrict + ", permSubDistrict=" + this.permSubDistrict + ", onlyEditAddressLL=" + this.onlyEditAddressLL + ", permLocation=" + this.permLocation + ", aadhaarNumber=" + this.aadhaarNumber + ", selectAll=" + this.selectAll + ", eduQual=" + this.eduQual + ", editAddressLL=" + this.editAddressLL + ", alternatemobileNumber=" + this.alternatemobileNumber + ", permStreet=" + this.permStreet + ", permPinCode=" + this.permPinCode + ", refStateEqiCovsMessage=" + this.refStateEqiCovsMessage + ", permDistrict=" + this.permDistrict + ", newFullName=" + this.newFullName + ", permHouseNo=" + this.permHouseNo + ", gender=" + this.gender + ", drivingSchoolDet=" + this.drivingSchoolDet + ", mname=" + this.mname + ", presStreet=" + this.presStreet + ", llFromRTO1=" + this.llFromRTO1 + ", presState=" + this.presState + ", lname=" + this.lname + ", email=" + this.email + ", PresVillageOrTown=" + this.PresVillageOrTown + ", placeOfBirth=" + this.placeOfBirth + ", presCity=" + this.presCity + ", presPinCode=" + this.presPinCode + ", dateOfBirth=" + this.dateOfBirth + ", checkCovs=" + this.checkCovs + ", swdmName=" + this.swdmName + ", presLocation=" + this.presLocation + ", permCity=" + this.permCity + ", llstoDisplayMap=" + this.llstoDisplayMap + ", llFromState1=" + this.llFromState1 + ", age=" + this.age + ", swdlName=" + this.swdlName + ", error=" + this.error + ", dobError=" + this.dobError + ", dateNotMatchError=" + this.dateNotMatchError + ", invalidLLNo=" + this.invalidLLNo + ", alreadyApplied=" + this.alreadyApplied + ", alreadyHavingDL=" + this.alreadyHavingDL + ", dlAppliedAfterFewDays=" + this.dlAppliedAfterFewDays + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        ArrayList<RelationType> arrayList = this.relationType;
        parcel.writeInt(arrayList.size());
        Iterator<RelationType> it = arrayList.iterator();
        while (it.hasNext()) {
            parcel.writeSerializable(it.next());
        }
        parcel.writeString(this.selectedCovs);
        parcel.writeString(this.swdfName);
        ArrayList<PresDistrict> arrayList2 = this.presDistrict;
        parcel.writeInt(arrayList2.size());
        Iterator<PresDistrict> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            parcel.writeSerializable(it2.next());
        }
        parcel.writeString(this.mobileNumber);
        parcel.writeString(this.presStayYears);
        parcel.writeString(this.presPhoneNumber);
        parcel.writeString(this.presHouseNo);
        ArrayList<BloodGroup> arrayList3 = this.bloodGroup;
        parcel.writeInt(arrayList3.size());
        Iterator<BloodGroup> it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            parcel.writeSerializable(it3.next());
        }
        parcel.writeString(this.presSameAsPerm);
        ArrayList<PermState> arrayList4 = this.permState;
        parcel.writeInt(arrayList4.size());
        Iterator<PermState> it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            parcel.writeSerializable(it4.next());
        }
        ArrayList<CountryOfBirth> arrayList5 = this.countryOfBirth;
        parcel.writeInt(arrayList5.size());
        Iterator<CountryOfBirth> it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            parcel.writeSerializable(it5.next());
        }
        Boolean bool = this.DisableStForMp;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.idMarks1);
        parcel.writeString(this.idMarks2);
        parcel.writeString(this.fname);
        parcel.writeString(this.presStayMonths);
        parcel.writeString(this.permVillageOrTown);
        ArrayList<PresSubDistrict> arrayList6 = this.presSubDistrict;
        parcel.writeInt(arrayList6.size());
        Iterator<PresSubDistrict> it6 = arrayList6.iterator();
        while (it6.hasNext()) {
            parcel.writeSerializable(it6.next());
        }
        ArrayList<PermSubDistrict> arrayList7 = this.permSubDistrict;
        parcel.writeInt(arrayList7.size());
        Iterator<PermSubDistrict> it7 = arrayList7.iterator();
        while (it7.hasNext()) {
            parcel.writeSerializable(it7.next());
        }
        Boolean bool2 = this.onlyEditAddressLL;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.permLocation);
        parcel.writeString(this.aadhaarNumber);
        parcel.writeString(this.selectAll);
        ArrayList<EduQual> arrayList8 = this.eduQual;
        parcel.writeInt(arrayList8.size());
        Iterator<EduQual> it8 = arrayList8.iterator();
        while (it8.hasNext()) {
            parcel.writeSerializable(it8.next());
        }
        Boolean bool3 = this.editAddressLL;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.alternatemobileNumber);
        parcel.writeString(this.permStreet);
        parcel.writeString(this.permPinCode);
        parcel.writeString(this.refStateEqiCovsMessage);
        ArrayList<PermDistrict> arrayList9 = this.permDistrict;
        parcel.writeInt(arrayList9.size());
        Iterator<PermDistrict> it9 = arrayList9.iterator();
        while (it9.hasNext()) {
            parcel.writeSerializable(it9.next());
        }
        parcel.writeString(this.newFullName);
        parcel.writeString(this.permHouseNo);
        ArrayList<Gender> arrayList10 = this.gender;
        parcel.writeInt(arrayList10.size());
        Iterator<Gender> it10 = arrayList10.iterator();
        while (it10.hasNext()) {
            parcel.writeSerializable(it10.next());
        }
        ArrayList<DrivingSchoolDet> arrayList11 = this.drivingSchoolDet;
        parcel.writeInt(arrayList11.size());
        Iterator<DrivingSchoolDet> it11 = arrayList11.iterator();
        while (it11.hasNext()) {
            parcel.writeSerializable(it11.next());
        }
        parcel.writeString(this.mname);
        parcel.writeString(this.presStreet);
        ArrayList<LlFromRTO1> arrayList12 = this.llFromRTO1;
        parcel.writeInt(arrayList12.size());
        Iterator<LlFromRTO1> it12 = arrayList12.iterator();
        while (it12.hasNext()) {
            parcel.writeSerializable(it12.next());
        }
        ArrayList<PresState> arrayList13 = this.presState;
        parcel.writeInt(arrayList13.size());
        Iterator<PresState> it13 = arrayList13.iterator();
        while (it13.hasNext()) {
            parcel.writeSerializable(it13.next());
        }
        parcel.writeString(this.lname);
        parcel.writeString(this.email);
        parcel.writeString(this.PresVillageOrTown);
        parcel.writeString(this.placeOfBirth);
        ArrayList<PresCity> arrayList14 = this.presCity;
        parcel.writeInt(arrayList14.size());
        Iterator<PresCity> it14 = arrayList14.iterator();
        while (it14.hasNext()) {
            parcel.writeSerializable(it14.next());
        }
        parcel.writeString(this.presPinCode);
        parcel.writeString(this.dateOfBirth);
        ArrayList<CheckCovs> arrayList15 = this.checkCovs;
        parcel.writeInt(arrayList15.size());
        Iterator<CheckCovs> it15 = arrayList15.iterator();
        while (it15.hasNext()) {
            it15.next().writeToParcel(parcel, flags);
        }
        parcel.writeString(this.swdmName);
        parcel.writeString(this.presLocation);
        ArrayList<PermCity> arrayList16 = this.permCity;
        parcel.writeInt(arrayList16.size());
        Iterator<PermCity> it16 = arrayList16.iterator();
        while (it16.hasNext()) {
            parcel.writeSerializable(it16.next());
        }
        ArrayList<LlstoDisplayMap> arrayList17 = this.llstoDisplayMap;
        parcel.writeInt(arrayList17.size());
        Iterator<LlstoDisplayMap> it17 = arrayList17.iterator();
        while (it17.hasNext()) {
            parcel.writeSerializable(it17.next());
        }
        ArrayList<LlFromState1> arrayList18 = this.llFromState1;
        parcel.writeInt(arrayList18.size());
        Iterator<LlFromState1> it18 = arrayList18.iterator();
        while (it18.hasNext()) {
            parcel.writeSerializable(it18.next());
        }
        parcel.writeString(this.age);
        parcel.writeString(this.swdlName);
        parcel.writeString(this.error);
        parcel.writeString(this.dobError);
        parcel.writeString(this.dateNotMatchError);
        parcel.writeString(this.invalidLLNo);
        parcel.writeString(this.alreadyApplied);
        parcel.writeString(this.alreadyHavingDL);
        parcel.writeString(this.dlAppliedAfterFewDays);
    }

    public LLDetailsResultModal(ArrayList<RelationType> relationType, String selectedCovs, String swdfName, ArrayList<PresDistrict> presDistrict, String mobileNumber, String presStayYears, String presPhoneNumber, String presHouseNo, ArrayList<BloodGroup> bloodGroup, String presSameAsPerm, ArrayList<PermState> permState, ArrayList<CountryOfBirth> countryOfBirth, Boolean bool, String idMarks1, String idMarks2, String fname, String presStayMonths, String permVillageOrTown, ArrayList<PresSubDistrict> presSubDistrict, ArrayList<PermSubDistrict> permSubDistrict, Boolean bool2, String permLocation, String aadhaarNumber, String str, ArrayList<EduQual> eduQual, Boolean bool3, String alternatemobileNumber, String permStreet, String permPinCode, String refStateEqiCovsMessage, ArrayList<PermDistrict> permDistrict, String newFullName, String permHouseNo, ArrayList<Gender> gender, ArrayList<DrivingSchoolDet> drivingSchoolDet, String mname, String presStreet, ArrayList<LlFromRTO1> llFromRTO1, ArrayList<PresState> presState, String lname, String email, String PresVillageOrTown, String placeOfBirth, ArrayList<PresCity> presCity, String presPinCode, String dateOfBirth, ArrayList<CheckCovs> checkCovs, String swdmName, String presLocation, ArrayList<PermCity> permCity, ArrayList<LlstoDisplayMap> llstoDisplayMap, ArrayList<LlFromState1> llFromState1, String age, String swdlName, String error, String dobError, String dateNotMatchError, String invalidLLNo, String alreadyApplied, String alreadyHavingDL, String dlAppliedAfterFewDays) {
        Intrinsics.checkNotNullParameter(relationType, "relationType");
        Intrinsics.checkNotNullParameter(selectedCovs, "selectedCovs");
        Intrinsics.checkNotNullParameter(swdfName, "swdfName");
        Intrinsics.checkNotNullParameter(presDistrict, "presDistrict");
        Intrinsics.checkNotNullParameter(mobileNumber, "mobileNumber");
        Intrinsics.checkNotNullParameter(presStayYears, "presStayYears");
        Intrinsics.checkNotNullParameter(presPhoneNumber, "presPhoneNumber");
        Intrinsics.checkNotNullParameter(presHouseNo, "presHouseNo");
        Intrinsics.checkNotNullParameter(bloodGroup, "bloodGroup");
        Intrinsics.checkNotNullParameter(presSameAsPerm, "presSameAsPerm");
        Intrinsics.checkNotNullParameter(permState, "permState");
        Intrinsics.checkNotNullParameter(countryOfBirth, "countryOfBirth");
        Intrinsics.checkNotNullParameter(idMarks1, "idMarks1");
        Intrinsics.checkNotNullParameter(idMarks2, "idMarks2");
        Intrinsics.checkNotNullParameter(fname, "fname");
        Intrinsics.checkNotNullParameter(presStayMonths, "presStayMonths");
        Intrinsics.checkNotNullParameter(permVillageOrTown, "permVillageOrTown");
        Intrinsics.checkNotNullParameter(presSubDistrict, "presSubDistrict");
        Intrinsics.checkNotNullParameter(permSubDistrict, "permSubDistrict");
        Intrinsics.checkNotNullParameter(permLocation, "permLocation");
        Intrinsics.checkNotNullParameter(aadhaarNumber, "aadhaarNumber");
        Intrinsics.checkNotNullParameter(eduQual, "eduQual");
        Intrinsics.checkNotNullParameter(alternatemobileNumber, "alternatemobileNumber");
        Intrinsics.checkNotNullParameter(permStreet, "permStreet");
        Intrinsics.checkNotNullParameter(permPinCode, "permPinCode");
        Intrinsics.checkNotNullParameter(refStateEqiCovsMessage, "refStateEqiCovsMessage");
        Intrinsics.checkNotNullParameter(permDistrict, "permDistrict");
        Intrinsics.checkNotNullParameter(newFullName, "newFullName");
        Intrinsics.checkNotNullParameter(permHouseNo, "permHouseNo");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(drivingSchoolDet, "drivingSchoolDet");
        Intrinsics.checkNotNullParameter(mname, "mname");
        Intrinsics.checkNotNullParameter(presStreet, "presStreet");
        Intrinsics.checkNotNullParameter(llFromRTO1, "llFromRTO1");
        Intrinsics.checkNotNullParameter(presState, "presState");
        Intrinsics.checkNotNullParameter(lname, "lname");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(PresVillageOrTown, "PresVillageOrTown");
        Intrinsics.checkNotNullParameter(placeOfBirth, "placeOfBirth");
        Intrinsics.checkNotNullParameter(presCity, "presCity");
        Intrinsics.checkNotNullParameter(presPinCode, "presPinCode");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(checkCovs, "checkCovs");
        Intrinsics.checkNotNullParameter(swdmName, "swdmName");
        Intrinsics.checkNotNullParameter(presLocation, "presLocation");
        Intrinsics.checkNotNullParameter(permCity, "permCity");
        Intrinsics.checkNotNullParameter(llstoDisplayMap, "llstoDisplayMap");
        Intrinsics.checkNotNullParameter(llFromState1, "llFromState1");
        Intrinsics.checkNotNullParameter(age, "age");
        Intrinsics.checkNotNullParameter(swdlName, "swdlName");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(dobError, "dobError");
        Intrinsics.checkNotNullParameter(dateNotMatchError, "dateNotMatchError");
        Intrinsics.checkNotNullParameter(invalidLLNo, "invalidLLNo");
        Intrinsics.checkNotNullParameter(alreadyApplied, "alreadyApplied");
        Intrinsics.checkNotNullParameter(alreadyHavingDL, "alreadyHavingDL");
        Intrinsics.checkNotNullParameter(dlAppliedAfterFewDays, "dlAppliedAfterFewDays");
        this.relationType = relationType;
        this.selectedCovs = selectedCovs;
        this.swdfName = swdfName;
        this.presDistrict = presDistrict;
        this.mobileNumber = mobileNumber;
        this.presStayYears = presStayYears;
        this.presPhoneNumber = presPhoneNumber;
        this.presHouseNo = presHouseNo;
        this.bloodGroup = bloodGroup;
        this.presSameAsPerm = presSameAsPerm;
        this.permState = permState;
        this.countryOfBirth = countryOfBirth;
        this.DisableStForMp = bool;
        this.idMarks1 = idMarks1;
        this.idMarks2 = idMarks2;
        this.fname = fname;
        this.presStayMonths = presStayMonths;
        this.permVillageOrTown = permVillageOrTown;
        this.presSubDistrict = presSubDistrict;
        this.permSubDistrict = permSubDistrict;
        this.onlyEditAddressLL = bool2;
        this.permLocation = permLocation;
        this.aadhaarNumber = aadhaarNumber;
        this.selectAll = str;
        this.eduQual = eduQual;
        this.editAddressLL = bool3;
        this.alternatemobileNumber = alternatemobileNumber;
        this.permStreet = permStreet;
        this.permPinCode = permPinCode;
        this.refStateEqiCovsMessage = refStateEqiCovsMessage;
        this.permDistrict = permDistrict;
        this.newFullName = newFullName;
        this.permHouseNo = permHouseNo;
        this.gender = gender;
        this.drivingSchoolDet = drivingSchoolDet;
        this.mname = mname;
        this.presStreet = presStreet;
        this.llFromRTO1 = llFromRTO1;
        this.presState = presState;
        this.lname = lname;
        this.email = email;
        this.PresVillageOrTown = PresVillageOrTown;
        this.placeOfBirth = placeOfBirth;
        this.presCity = presCity;
        this.presPinCode = presPinCode;
        this.dateOfBirth = dateOfBirth;
        this.checkCovs = checkCovs;
        this.swdmName = swdmName;
        this.presLocation = presLocation;
        this.permCity = permCity;
        this.llstoDisplayMap = llstoDisplayMap;
        this.llFromState1 = llFromState1;
        this.age = age;
        this.swdlName = swdlName;
        this.error = error;
        this.dobError = dobError;
        this.dateNotMatchError = dateNotMatchError;
        this.invalidLLNo = invalidLLNo;
        this.alreadyApplied = alreadyApplied;
        this.alreadyHavingDL = alreadyHavingDL;
        this.dlAppliedAfterFewDays = dlAppliedAfterFewDays;
    }

    public /* synthetic */ LLDetailsResultModal(ArrayList arrayList, String str, String str2, ArrayList arrayList2, String str3, String str4, String str5, String str6, ArrayList arrayList3, String str7, ArrayList arrayList4, ArrayList arrayList5, Boolean bool, String str8, String str9, String str10, String str11, String str12, ArrayList arrayList6, ArrayList arrayList7, Boolean bool2, String str13, String str14, String str15, ArrayList arrayList8, Boolean bool3, String str16, String str17, String str18, String str19, ArrayList arrayList9, String str20, String str21, ArrayList arrayList10, ArrayList arrayList11, String str22, String str23, ArrayList arrayList12, ArrayList arrayList13, String str24, String str25, String str26, String str27, ArrayList arrayList14, String str28, String str29, ArrayList arrayList15, String str30, String str31, ArrayList arrayList16, ArrayList arrayList17, ArrayList arrayList18, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : arrayList, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? new ArrayList() : arrayList2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? new ArrayList() : arrayList3, (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? "" : str7, (i & 1024) != 0 ? new ArrayList() : arrayList4, (i & 2048) != 0 ? new ArrayList() : arrayList5, (i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? null : bool, (i & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? "" : str8, (i & 16384) != 0 ? "" : str9, (i & 32768) != 0 ? "" : str10, (i & 65536) != 0 ? "" : str11, (i & 131072) != 0 ? "" : str12, (i & 262144) != 0 ? new ArrayList() : arrayList6, (i & 524288) != 0 ? new ArrayList() : arrayList7, (i & 1048576) != 0 ? null : bool2, (i & 2097152) != 0 ? "" : str13, (i & 4194304) != 0 ? "" : str14, (i & 8388608) != 0 ? null : str15, (i & 16777216) != 0 ? new ArrayList() : arrayList8, (i & 33554432) == 0 ? bool3 : null, (i & 67108864) != 0 ? "" : str16, (i & 134217728) != 0 ? "" : str17, (i & 268435456) != 0 ? "" : str18, (i & 536870912) != 0 ? "" : str19, (i & 1073741824) != 0 ? new ArrayList() : arrayList9, (i & IntCompanionObject.MIN_VALUE) != 0 ? "" : str20, (i2 & 1) != 0 ? "" : str21, (i2 & 2) != 0 ? new ArrayList() : arrayList10, (i2 & 4) != 0 ? new ArrayList() : arrayList11, (i2 & 8) != 0 ? "" : str22, (i2 & 16) != 0 ? "" : str23, (i2 & 32) != 0 ? new ArrayList() : arrayList12, (i2 & 64) != 0 ? new ArrayList() : arrayList13, (i2 & 128) != 0 ? "" : str24, (i2 & 256) != 0 ? "" : str25, (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? "" : str26, (i2 & 1024) != 0 ? "" : str27, (i2 & 2048) != 0 ? new ArrayList() : arrayList14, (i2 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? "" : str28, (i2 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? "" : str29, (i2 & 16384) != 0 ? new ArrayList() : arrayList15, (i2 & 32768) != 0 ? "" : str30, (i2 & 65536) != 0 ? "" : str31, (i2 & 131072) != 0 ? new ArrayList() : arrayList16, (i2 & 262144) != 0 ? new ArrayList() : arrayList17, (i2 & 524288) != 0 ? new ArrayList() : arrayList18, (i2 & 1048576) != 0 ? "" : str32, (i2 & 2097152) != 0 ? "" : str33, (i2 & 4194304) != 0 ? "" : str34, (i2 & 8388608) != 0 ? "" : str35, (i2 & 16777216) != 0 ? "" : str36, (i2 & 33554432) != 0 ? "" : str37, (i2 & 67108864) != 0 ? "" : str38, (i2 & 134217728) != 0 ? "" : str39, (i2 & 268435456) != 0 ? "" : str40);
    }
}
