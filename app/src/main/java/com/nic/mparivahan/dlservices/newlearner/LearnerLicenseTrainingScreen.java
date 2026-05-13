package com.nic.mparivahan.dlservices.newlearner;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.nic.mparivahan.CheckFormOne.SubmitFormOne.Other.SubmitInterface;
import com.nic.mparivahan.CheckFormOne.SubmitFormOne.Other.SubmitRequest;
import com.nic.mparivahan.CheckFormOne.SubmitFormOne.Pojo.SubmitResponse;
import com.nic.mparivahan.DLServicesAuth.CheckEligibility.FormOneRequest;
import com.nic.mparivahan.DLServicesAuth.CheckEligibility.FromEligCheck;
import com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi.DOEkycX;
import com.nic.mparivahan.NewDlScreen.Modal.DrivingSchoolDetRequestModal;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.AppCatPojo;
import com.nic.mparivahan.dlservices.newlearner.DataClass.LlDrivingSchoolDetRequestModal;
import com.nic.mparivahan.dlservices.newlearner.DataClass.NewLLAcknowledgement;
import com.nic.mparivahan.dlservices.newlearner.DataClass.SubmittedLLResponseModal;
import com.nic.mparivahan.dlservices.newlearner.LearnerLicenseTrainingScreen;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.LearnerLicenceClasDatasModal;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.LearnerLicenceClassResponseModal;
import com.nic.mparivahan.dlservices.ui.newlearner.Service.NewLLServices;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.zepto.cf2;
import com.zepto.de;
import com.zepto.df2;
import com.zepto.ef2;
import com.zepto.ff2;
import com.zepto.i94;
import com.zepto.j94;
import com.zepto.k94;
import com.zepto.kt6;
import com.zepto.mf4;
import com.zepto.oq;
import com.zepto.pq;
import com.zepto.q86;
import com.zepto.r86;
import com.zepto.s86;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.wb0;
import com.zepto.wl5;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Ù\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0003\b\u0091\u0001\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\t¢\u0006\u0006\b\u0095\u0002\u0010\u0096\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J \u0010\n\u001a\u00020\u00032\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0003J\b\u0010\f\u001a\u00020\u0003H\u0002J\b\u0010\r\u001a\u00020\u0003H\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0002J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0003J\b\u0010\u0014\u001a\u00020\u0003H\u0002J\b\u0010\u0015\u001a\u00020\u0003H\u0002J\b\u0010\u0016\u001a\u00020\u0003H\u0002J\u001c\u0010\u001b\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0002J\u001c\u0010\u001e\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002J\u0012\u0010!\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0014J\u001a\u0010&\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010%\u001a\u00020$H\u0016R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=R&\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R&\u0010B\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010@R&\u0010D\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0006j\b\u0012\u0004\u0012\u00020\u0011`\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010@R&\u0010F\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u0006j\b\u0012\u0004\u0012\u00020\u0019`\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010@R&\u0010H\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u0006j\b\u0012\u0004\u0012\u00020\u0019`\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010@R&\u0010J\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u0006j\b\u0012\u0004\u0012\u00020\u0019`\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010@R\u001e\u0010O\u001a\n L*\u0004\u0018\u00010K0K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010R\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010V\u001a\u00020S8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010UR&\u0010Y\u001a\u0012\u0012\u0004\u0012\u00020W0\u0006j\b\u0012\u0004\u0012\u00020W`\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010@R\"\u0010a\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010i\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010q\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010y\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR\"\u0010\u007f\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010Q\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R&\u0010\u0083\u0001\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010Q\u001a\u0005\b\u0081\u0001\u0010|\"\u0005\b\u0082\u0001\u0010~R&\u0010\u0087\u0001\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010Q\u001a\u0005\b\u0085\u0001\u0010|\"\u0005\b\u0086\u0001\u0010~R&\u0010\u008b\u0001\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0088\u0001\u0010Q\u001a\u0005\b\u0089\u0001\u0010|\"\u0005\b\u008a\u0001\u0010~R&\u0010\u008f\u0001\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008c\u0001\u0010Q\u001a\u0005\b\u008d\u0001\u0010|\"\u0005\b\u008e\u0001\u0010~R&\u0010\u0093\u0001\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0090\u0001\u0010Q\u001a\u0005\b\u0091\u0001\u0010|\"\u0005\b\u0092\u0001\u0010~R&\u0010\u0097\u0001\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0094\u0001\u0010Q\u001a\u0005\b\u0095\u0001\u0010|\"\u0005\b\u0096\u0001\u0010~R&\u0010\u009b\u0001\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0098\u0001\u0010Q\u001a\u0005\b\u0099\u0001\u0010|\"\u0005\b\u009a\u0001\u0010~R&\u0010\u009f\u0001\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009c\u0001\u0010Q\u001a\u0005\b\u009d\u0001\u0010|\"\u0005\b\u009e\u0001\u0010~R\u0018\u0010¡\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b \u0001\u0010QR\u0018\u0010£\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¢\u0001\u0010QR\u0018\u0010¥\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¤\u0001\u0010QR\u0018\u0010§\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¦\u0001\u0010QR\u0018\u0010©\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¨\u0001\u0010QR\u0018\u0010«\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bª\u0001\u0010QR\u0018\u0010\u00ad\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¬\u0001\u0010QR\u0018\u0010¯\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b®\u0001\u0010QR\u0018\u0010±\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b°\u0001\u0010QR\u0018\u0010³\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b²\u0001\u0010QR\u0018\u0010µ\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b´\u0001\u0010QR\u0018\u0010·\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¶\u0001\u0010QR\u0018\u0010¹\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¸\u0001\u0010QR\u0018\u0010»\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bº\u0001\u0010QR\u0018\u0010½\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¼\u0001\u0010QR\u0018\u0010¿\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¾\u0001\u0010QR\u0018\u0010Á\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÀ\u0001\u0010QR\u0018\u0010Ã\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÂ\u0001\u0010QR\u0018\u0010Å\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÄ\u0001\u0010QR\u0018\u0010Ç\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÆ\u0001\u0010QR\u0018\u0010É\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÈ\u0001\u0010QR\u0018\u0010Ë\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÊ\u0001\u0010QR\u0018\u0010Í\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÌ\u0001\u0010QR\u0018\u0010Ï\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÎ\u0001\u0010?R\u0018\u0010Ñ\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÐ\u0001\u0010QR\u0018\u0010Ó\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÒ\u0001\u0010QR\u0018\u0010Õ\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÔ\u0001\u0010QR\u0018\u0010×\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÖ\u0001\u0010QR\u0018\u0010Ù\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bØ\u0001\u0010QR\u0018\u0010Û\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÚ\u0001\u0010QR\u0018\u0010Ý\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÜ\u0001\u0010QR\u0018\u0010ß\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÞ\u0001\u0010QR\u0018\u0010á\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bà\u0001\u0010QR\u0018\u0010ã\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bâ\u0001\u0010QR\u0018\u0010å\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bä\u0001\u0010QR\u0018\u0010ç\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bæ\u0001\u0010QR\u0018\u0010é\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bè\u0001\u0010QR\u0018\u0010ë\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bê\u0001\u0010QR\u0018\u0010í\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bì\u0001\u0010QR\u0018\u0010ï\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bî\u0001\u0010QR\u0018\u0010ñ\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bð\u0001\u0010QR\u0018\u0010ó\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bò\u0001\u0010QR\u0018\u0010õ\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bô\u0001\u0010QR\u0018\u0010÷\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bö\u0001\u0010QR&\u0010û\u0001\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bø\u0001\u0010Q\u001a\u0005\bù\u0001\u0010|\"\u0005\bú\u0001\u0010~R&\u0010ÿ\u0001\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bü\u0001\u0010Q\u001a\u0005\bý\u0001\u0010|\"\u0005\bþ\u0001\u0010~R\u0018\u0010\u0081\u0002\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0002\u0010QR\u0018\u0010\u0083\u0002\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0082\u0002\u0010QR\u0019\u0010\u0086\u0002\u001a\u00030\u0084\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0002\u0010AR\u0019\u0010\u0088\u0002\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0002\u0010\u0088\u0001R\u0018\u0010\u008a\u0002\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0089\u0002\u0010QR\u0019\u0010\u008c\u0002\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0002\u0010\u0088\u0001R\u0019\u0010\u008e\u0002\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0002\u0010\u0088\u0001R\u0018\u0010\u0090\u0002\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008f\u0002\u0010QR\u001a\u0010\u0094\u0002\u001a\u00030\u0091\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0092\u0002\u0010\u0093\u0002¨\u0006\u0097\u0002"}, d2 = {"Lcom/nic/mparivahan/dlservices/newlearner/LearnerLicenseTrainingScreen;", "Lcom/zepto/pq;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "", "a2", "f2", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/dlservices/ui/newlearner/DataClass/LearnerLicenceClasDatasModal;", "Lkotlin/collections/ArrayList;", "serviceClass", "X2", "l2", "a3", "W2", "Lcom/nic/mparivahan/DLServicesAuth/CheckEligibility/FormOneRequest;", "b2", "c2", "", "forWhichDate", "Y2", "g2", "d2", "z2", "Landroid/content/Context;", "context", "", "message", "O2", "Lcom/nic/mparivahan/CheckFormOne/SubmitFormOne/Other/SubmitRequest;", "e2", "x2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/widget/CompoundButton;", "buttonView", "", "isChecked", "onCheckedChanged", "Lcom/zepto/j94;", "C", "Lcom/zepto/j94;", "learnerLicenceVM", "Lcom/zepto/de;", "D", "Lcom/zepto/de;", "binding", "Landroid/app/ProgressDialog;", "E", "Landroid/app/ProgressDialog;", "pDialog", "Lcom/zepto/wa3;", "F", "Lcom/zepto/wa3;", "session", "Lcom/nic/mparivahan/dlservices/ui/newlearner/Service/NewLLServices;", "G", "Lcom/nic/mparivahan/dlservices/ui/newlearner/Service/NewLLServices;", "service", "Lcom/zepto/wl5;", "H", "Lcom/zepto/wl5;", "sarthiSession", "I", "Ljava/util/ArrayList;", "J", "selectedServiceClass", "K", "selectedServiceId", "L", "apiSelectedServiceId", "M", "apiSelectedServiceName", "N", "dlStatusList", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "O", "Ljava/util/Calendar;", "cal", "P", "Ljava/lang/String;", "selectedDonationValue", "Landroid/content/SharedPreferences;", "Q", "Landroid/content/SharedPreferences;", "pref", "Lcom/nic/mparivahan/NewDlScreen/Modal/DrivingSchoolDetRequestModal;", "R", "addedDSchoolData", "Lcom/zepto/ef2;", "S", "Lcom/zepto/ef2;", "h2", "()Lcom/zepto/ef2;", "S2", "(Lcom/zepto/ef2;)V", "mFormEligVM", "Lcom/nic/mparivahan/DLServicesAuth/CheckEligibility/FromEligCheck;", "T", "Lcom/nic/mparivahan/DLServicesAuth/CheckEligibility/FromEligCheck;", "i2", "()Lcom/nic/mparivahan/DLServicesAuth/CheckEligibility/FromEligCheck;", "T2", "(Lcom/nic/mparivahan/DLServicesAuth/CheckEligibility/FromEligCheck;)V", "mFormsInterface", "Lcom/zepto/s86;", "U", "Lcom/zepto/s86;", "j2", "()Lcom/zepto/s86;", "U2", "(Lcom/zepto/s86;)V", "mSubmitFormVM", "Lcom/nic/mparivahan/CheckFormOne/SubmitFormOne/Other/SubmitInterface;", "V", "Lcom/nic/mparivahan/CheckFormOne/SubmitFormOne/Other/SubmitInterface;", "k2", "()Lcom/nic/mparivahan/CheckFormOne/SubmitFormOne/Other/SubmitInterface;", "V2", "(Lcom/nic/mparivahan/CheckFormOne/SubmitFormOne/Other/SubmitInterface;)V", "mSubmitInterface", "W", "getForm1FlagDLserReq", "()Ljava/lang/String;", "setForm1FlagDLserReq", "(Ljava/lang/String;)V", "form1FlagDLserReq", "X", "getSubmitFormOne", "setSubmitFormOne", "submitFormOne", "Y", "getAString", "setAString", "aString", "Z", "getBString", "setBString", "bString", "a0", "getCString", "setCString", "cString", "b0", "getDString", "setDString", "dString", "c0", "getEString", "setEString", "eString", "d0", "getFString", "setFString", "fString", "e0", "getGString", "setGString", "gString", "f0", "stateCd", "g0", "rtoCd", "h0", "rtoName", "i0", "applicantFName", "j0", "applicantMName", "k0", "applicantLName", "l0", "fullName", "m0", "relationShipCd", "n0", "relationFName", "o0", "relationMName", "p0", "relationLName", "q0", "gender", "r0", "dob", "s0", "placeOfBirth", "t0", "country", "u0", "eduQualification", "v0", "bloodGroup", "w0", "mobileNo", "x0", "emailID", "y0", "altMobileNo", "z0", "idMark1", "A0", "idMark2", "B0", "landlineNo", "C0", "enteredAge", "D0", "presState", "E0", "presDistrict", "F0", "presSubDistrict", "G0", "presVillOrTownCode", "H0", "presHouseNo", "I0", "presStreet", "J0", "presLandmark", "K0", "presPinCode", "L0", "presSelectedVillOrTownCd", "M0", "presStayYear", "N0", "presStayMonth", "O0", "permState", "P0", "permDistrict", "Q0", "permSubDistrict", "R0", "permVillOrTownCode", "S0", "permHouseNo", "T0", "permStreet", "U0", "permLandmark", "V0", "permPinCode", "W0", "permSelectedVillOrTownCd", "X0", "getAppCategory", "Q2", "appCategory", "Y0", "getAppCategoryForApi", "R2", "appCategoryForApi", "Z0", "cmCampDesc", "a1", "cmType", "", "b1", "ekycID", "c1", "haveAadhaarData", "d1", "aadhaarPhoto", "e1", "form1Submitted", "f1", "form1Visible", "g1", "form1DecChecked", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewAdharApi/DOEkycX;", "h1", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewAdharApi/DOEkycX;", "adharData", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class LearnerLicenseTrainingScreen extends pq implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public j94 learnerLicenceVM;

    /* JADX INFO: renamed from: C0, reason: from kotlin metadata */
    public int enteredAge;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public de binding;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public NewLLServices service;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public SharedPreferences pref;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public ef2 mFormEligVM;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public FromEligCheck mFormsInterface;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public s86 mSubmitFormVM;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public SubmitInterface mSubmitInterface;

    /* JADX INFO: renamed from: b1, reason: from kotlin metadata */
    public long ekycID;

    /* JADX INFO: renamed from: c1, reason: from kotlin metadata */
    public boolean haveAadhaarData;

    /* JADX INFO: renamed from: e1, reason: from kotlin metadata */
    public boolean form1Submitted;

    /* JADX INFO: renamed from: f1, reason: from kotlin metadata */
    public boolean form1Visible;

    /* JADX INFO: renamed from: h1, reason: from kotlin metadata */
    public DOEkycX adharData;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public ArrayList serviceClass = new ArrayList();

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public ArrayList selectedServiceClass = new ArrayList();

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public ArrayList selectedServiceId = new ArrayList();

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public ArrayList apiSelectedServiceId = new ArrayList();

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public ArrayList apiSelectedServiceName = new ArrayList();

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public ArrayList dlStatusList = new ArrayList();

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String selectedDonationValue = "true";

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public ArrayList addedDSchoolData = new ArrayList();

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public String form1FlagDLserReq = "N";

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String submitFormOne = "N";

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public String aString = "";

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public String bString = "";

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public String cString = "";

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public String dString = "";

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public String eString = "";

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public String fString = "";

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public String gString = "N";

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public String stateCd = "";

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public String rtoCd = "";

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public String rtoName = "";

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public String applicantFName = "";

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public String applicantMName = "";

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public String applicantLName = "";

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public String fullName = "";

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public String relationShipCd = "";

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public String relationFName = "";

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    public String relationMName = "";

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public String relationLName = "";

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    public String gender = "";

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    public String dob = "";

    /* JADX INFO: renamed from: s0, reason: from kotlin metadata */
    public String placeOfBirth = "";

    /* JADX INFO: renamed from: t0, reason: from kotlin metadata */
    public String country = "";

    /* JADX INFO: renamed from: u0, reason: from kotlin metadata */
    public String eduQualification = "";

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    public String bloodGroup = "";

    /* JADX INFO: renamed from: w0, reason: from kotlin metadata */
    public String mobileNo = "";

    /* JADX INFO: renamed from: x0, reason: from kotlin metadata */
    public String emailID = "";

    /* JADX INFO: renamed from: y0, reason: from kotlin metadata */
    public String altMobileNo = "";

    /* JADX INFO: renamed from: z0, reason: from kotlin metadata */
    public String idMark1 = "";

    /* JADX INFO: renamed from: A0, reason: from kotlin metadata */
    public String idMark2 = "";

    /* JADX INFO: renamed from: B0, reason: from kotlin metadata */
    public String landlineNo = "";

    /* JADX INFO: renamed from: D0, reason: from kotlin metadata */
    public String presState = "";

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    public String presDistrict = "";

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    public String presSubDistrict = "";

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    public String presVillOrTownCode = "";

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    public String presHouseNo = "";

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    public String presStreet = "";

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    public String presLandmark = "";

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    public String presPinCode = "";

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public String presSelectedVillOrTownCd = "";

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    public String presStayYear = "";

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    public String presStayMonth = "";

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    public String permState = "";

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    public String permDistrict = "";

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    public String permSubDistrict = "";

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    public String permVillOrTownCode = "";

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    public String permHouseNo = "";

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    public String permStreet = "";

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    public String permLandmark = "";

    /* JADX INFO: renamed from: V0, reason: from kotlin metadata */
    public String permPinCode = "";

    /* JADX INFO: renamed from: W0, reason: from kotlin metadata */
    public String permSelectedVillOrTownCd = "";

    /* JADX INFO: renamed from: X0, reason: from kotlin metadata */
    public String appCategory = "G";

    /* JADX INFO: renamed from: Y0, reason: from kotlin metadata */
    public String appCategoryForApi = "";

    /* JADX INFO: renamed from: Z0, reason: from kotlin metadata */
    public String cmCampDesc = "";

    /* JADX INFO: renamed from: a1, reason: from kotlin metadata */
    public String cmType = "";

    /* JADX INFO: renamed from: d1, reason: from kotlin metadata */
    public String aadhaarPhoto = "";

    /* JADX INFO: renamed from: g1, reason: from kotlin metadata */
    public String form1DecChecked = "";

    public static final class a implements AdapterView.OnItemSelectedListener {
        public final /* synthetic */ ArrayList b;

        public a(ArrayList arrayList) {
            this.b = arrayList;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            LearnerLicenseTrainingScreen.this.Q2(((AppCatPojo) this.b.get(i)).getAppCode());
            LearnerLicenseTrainingScreen.this.R2(((AppCatPojo) this.b.get(i)).getAppCode());
            LearnerLicenseTrainingScreen.this.g2();
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(ff2 ff2Var) {
            try {
                throw null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            wb0.a(obj);
            a(null);
            return Unit.INSTANCE;
        }
    }

    public static final class c implements AdapterView.OnItemSelectedListener {
        public c() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            if (StringsKt__StringsJVMKt.equals((String) LearnerLicenseTrainingScreen.this.dlStatusList.get(i), "Select", true)) {
                return;
            }
            de deVar = LearnerLicenseTrainingScreen.this.binding;
            de deVar2 = null;
            if (deVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                deVar = null;
            }
            deVar.H.setText(((String) LearnerLicenseTrainingScreen.this.dlStatusList.get(i)) + ' ' + LearnerLicenseTrainingScreen.this.getString(R.string.from_date_ll));
            de deVar3 = LearnerLicenseTrainingScreen.this.binding;
            if (deVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                deVar3 = null;
            }
            deVar3.Z.setText(((String) LearnerLicenseTrainingScreen.this.dlStatusList.get(i)) + ' ' + LearnerLicenseTrainingScreen.this.getString(R.string.to_date_ll));
            de deVar4 = LearnerLicenseTrainingScreen.this.binding;
            if (deVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                deVar2 = deVar4;
            }
            deVar2.K.setText(((String) LearnerLicenseTrainingScreen.this.dlStatusList.get(i)) + ' ' + LearnerLicenseTrainingScreen.this.getString(R.string.issue_authority_sarthi));
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
            super(1);
        }

        public final void a(LearnerLicenceClassResponseModal learnerLicenceClassResponseModal) {
            try {
                ProgressDialog progressDialog = LearnerLicenseTrainingScreen.this.pDialog;
                ProgressDialog progressDialog2 = null;
                if (progressDialog == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                    progressDialog = null;
                }
                if (progressDialog.isShowing()) {
                    ProgressDialog progressDialog3 = LearnerLicenseTrainingScreen.this.pDialog;
                    if (progressDialog3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                    } else {
                        progressDialog2 = progressDialog3;
                    }
                    progressDialog2.dismiss();
                }
                if (StringsKt__StringsJVMKt.equals(learnerLicenceClassResponseModal.getStatusCode(), "00", true)) {
                    LearnerLicenseTrainingScreen.this.serviceClass = new ArrayList();
                    LearnerLicenseTrainingScreen learnerLicenseTrainingScreen = LearnerLicenseTrainingScreen.this;
                    ArrayList<LearnerLicenceClasDatasModal> llCovs = learnerLicenceClassResponseModal.getLlCovs();
                    Intrinsics.checkNotNull(llCovs);
                    learnerLicenseTrainingScreen.serviceClass = llCovs;
                    if (LearnerLicenseTrainingScreen.this.serviceClass.size() > 0) {
                        LearnerLicenseTrainingScreen learnerLicenseTrainingScreen2 = LearnerLicenseTrainingScreen.this;
                        learnerLicenseTrainingScreen2.X2(learnerLicenseTrainingScreen2.serviceClass);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((LearnerLicenceClassResponseModal) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        public final void a(SubmittedLLResponseModal submittedLLResponseModal) {
            ProgressDialog progressDialog = LearnerLicenseTrainingScreen.this.pDialog;
            ProgressDialog progressDialog2 = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog3 = LearnerLicenseTrainingScreen.this.pDialog;
                if (progressDialog3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                } else {
                    progressDialog2 = progressDialog3;
                }
                progressDialog2.dismiss();
            }
            if (Intrinsics.areEqual(submittedLLResponseModal.getStatus_desc(), "Success")) {
                Intent intent = new Intent(LearnerLicenseTrainingScreen.this, (Class<?>) LLApplicationScreen.class);
                ArrayList<NewLLAcknowledgement> newLLAcknowledgement = submittedLLResponseModal.getNewLLAcknowledgement();
                Intrinsics.checkNotNull(newLLAcknowledgement);
                intent.putExtra("appNumber", newLLAcknowledgement.get(0).getApplicationNo());
                intent.putExtra("dobValue", submittedLLResponseModal.getNewLLAcknowledgement().get(0).getDob());
                intent.putExtra("rtoCd", LearnerLicenseTrainingScreen.this.rtoCd);
                intent.putExtra("stateCd", LearnerLicenseTrainingScreen.this.stateCd);
                intent.putExtra("mobileNo", LearnerLicenseTrainingScreen.this.mobileNo);
                intent.putExtra("rtoName", LearnerLicenseTrainingScreen.this.rtoName);
                intent.putExtra("aadharPhoto", LearnerLicenseTrainingScreen.this.aadhaarPhoto);
                LearnerLicenseTrainingScreen.this.startActivity(intent);
                LearnerLicenseTrainingScreen.this.finish();
                return;
            }
            if (!StringsKt__StringsJVMKt.equals(submittedLLResponseModal.getStatus_desc(), "failure", true)) {
                Toast.makeText(LearnerLicenseTrainingScreen.this, "Service is temporary unavailable. Try After some time", 1).show();
                return;
            }
            ArrayList<NewLLAcknowledgement> newLLAcknowledgement2 = submittedLLResponseModal.getNewLLAcknowledgement();
            Intrinsics.checkNotNull(newLLAcknowledgement2);
            if (kt6.d(newLLAcknowledgement2.get(0).getVehicleClassError())) {
                LearnerLicenseTrainingScreen learnerLicenseTrainingScreen = LearnerLicenseTrainingScreen.this;
                learnerLicenseTrainingScreen.x2(learnerLicenseTrainingScreen, submittedLLResponseModal.getNewLLAcknowledgement().get(0).getVehicleClassError());
                return;
            }
            if (kt6.d(submittedLLResponseModal.getNewLLAcknowledgement().get(0).getValidLocationError())) {
                LearnerLicenseTrainingScreen learnerLicenseTrainingScreen2 = LearnerLicenseTrainingScreen.this;
                learnerLicenseTrainingScreen2.x2(learnerLicenseTrainingScreen2, submittedLLResponseModal.getNewLLAcknowledgement().get(0).getValidLocationError());
                return;
            }
            if (kt6.d(submittedLLResponseModal.getNewLLAcknowledgement().get(0).getNameMismatchError())) {
                LearnerLicenseTrainingScreen learnerLicenseTrainingScreen3 = LearnerLicenseTrainingScreen.this;
                learnerLicenseTrainingScreen3.x2(learnerLicenseTrainingScreen3, submittedLLResponseModal.getNewLLAcknowledgement().get(0).getNameMismatchError());
                return;
            }
            if (kt6.d(submittedLLResponseModal.getNewLLAcknowledgement().get(0).getValidSubDistrictInPermanent())) {
                LearnerLicenseTrainingScreen learnerLicenseTrainingScreen4 = LearnerLicenseTrainingScreen.this;
                learnerLicenseTrainingScreen4.x2(learnerLicenseTrainingScreen4, submittedLLResponseModal.getNewLLAcknowledgement().get(0).getValidSubDistrictInPermanent());
                return;
            }
            if (kt6.d(submittedLLResponseModal.getNewLLAcknowledgement().get(0).getFreshLLNotSaved())) {
                LearnerLicenseTrainingScreen learnerLicenseTrainingScreen5 = LearnerLicenseTrainingScreen.this;
                learnerLicenseTrainingScreen5.x2(learnerLicenseTrainingScreen5, submittedLLResponseModal.getNewLLAcknowledgement().get(0).getFreshLLNotSaved());
            } else if (kt6.d(submittedLLResponseModal.getNewLLAcknowledgement().get(0).getBloodGroupError())) {
                LearnerLicenseTrainingScreen learnerLicenseTrainingScreen6 = LearnerLicenseTrainingScreen.this;
                learnerLicenseTrainingScreen6.x2(learnerLicenseTrainingScreen6, submittedLLResponseModal.getNewLLAcknowledgement().get(0).getBloodGroupError());
            } else if (kt6.d(submittedLLResponseModal.getNewLLAcknowledgement().get(0).getMobileError())) {
                LearnerLicenseTrainingScreen learnerLicenseTrainingScreen7 = LearnerLicenseTrainingScreen.this;
                learnerLicenseTrainingScreen7.x2(learnerLicenseTrainingScreen7, submittedLLResponseModal.getNewLLAcknowledgement().get(0).getMobileError());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SubmittedLLResponseModal) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class f extends Lambda implements Function1 {
        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            ProgressDialog progressDialog = LearnerLicenseTrainingScreen.this.pDialog;
            wa3 wa3Var = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog2 = LearnerLicenseTrainingScreen.this.pDialog;
                if (progressDialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                    progressDialog2 = null;
                }
                progressDialog2.dismiss();
            }
            LearnerLicenseTrainingScreen learnerLicenseTrainingScreen = LearnerLicenseTrainingScreen.this;
            wa3 wa3Var2 = learnerLicenseTrainingScreen.session;
            if (wa3Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
            } else {
                wa3Var = wa3Var2;
            }
            Toast.makeText(learnerLicenseTrainingScreen, wa3Var.b("service_is_not_present", "Service is temporary unavailable. Try After some time"), 0).show();
        }
    }

    public static final class g extends Lambda implements Function1 {
        public g() {
            super(1);
        }

        public final void a(SubmitResponse submitResponse) {
            if (StringsKt__StringsJVMKt.equals(submitResponse.getStatus_desc(), "Success", true)) {
                LearnerLicenseTrainingScreen.this.form1Submitted = true;
                try {
                    if (Intrinsics.areEqual(submitResponse.getFoneObject().get(0).getMsg(), "")) {
                        return;
                    }
                    Toast.makeText(LearnerLicenseTrainingScreen.this, submitResponse.getFoneObject().get(0).getMsg(), 0).show();
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
            if (StringsKt__StringsJVMKt.equals(submitResponse.getStatus_desc(), "Failure", true)) {
                LearnerLicenseTrainingScreen.this.form1Submitted = false;
                try {
                    if (Intrinsics.areEqual(submitResponse.getFoneObject().get(0).getMsg(), "")) {
                        return;
                    }
                    LearnerLicenseTrainingScreen learnerLicenseTrainingScreen = LearnerLicenseTrainingScreen.this;
                    learnerLicenseTrainingScreen.x2(learnerLicenseTrainingScreen, submitResponse.getFoneObject().get(0).getMsg());
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SubmitResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class h implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public h(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.a = function;
        }

        @Override // com.zepto.mf4
        public final /* synthetic */ void a(Object obj) {
            this.a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof mf4) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public static final void A2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void B2(RadioButton aY, RadioButton aN, LearnerLicenseTrainingScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(aY, "$aY");
        Intrinsics.checkNotNullParameter(aN, "$aN");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        aY.setChecked(true);
        aN.setChecked(false);
        this$0.aString = "Y";
    }

    public static final void C2(RadioButton bY, RadioButton bN, LearnerLicenseTrainingScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(bY, "$bY");
        Intrinsics.checkNotNullParameter(bN, "$bN");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        bY.setChecked(true);
        bN.setChecked(false);
        this$0.bString = "Y";
    }

    public static final void D2(RadioButton cY, RadioButton cN, LearnerLicenseTrainingScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(cY, "$cY");
        Intrinsics.checkNotNullParameter(cN, "$cN");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        cY.setChecked(true);
        cN.setChecked(false);
        this$0.cString = "Y";
    }

    public static final void E2(RadioButton dY, RadioButton dN, LearnerLicenseTrainingScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(dY, "$dY");
        Intrinsics.checkNotNullParameter(dN, "$dN");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        dY.setChecked(true);
        dN.setChecked(false);
        this$0.dString = "Y";
    }

    public static final void F2(RadioButton eY, RadioButton eN, LearnerLicenseTrainingScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(eY, "$eY");
        Intrinsics.checkNotNullParameter(eN, "$eN");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        eY.setChecked(true);
        eN.setChecked(false);
        this$0.eString = "Y";
    }

    public static final void G2(RadioButton fY, RadioButton fN, LearnerLicenseTrainingScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(fY, "$fY");
        Intrinsics.checkNotNullParameter(fN, "$fN");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        fY.setChecked(true);
        fN.setChecked(false);
        this$0.fString = "Y";
    }

    public static final void H2(RadioButton aN, RadioButton aY, LearnerLicenseTrainingScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(aN, "$aN");
        Intrinsics.checkNotNullParameter(aY, "$aY");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        aN.setChecked(true);
        aY.setChecked(false);
        this$0.aString = "N";
    }

    public static final void I2(RadioButton bN, RadioButton bY, LearnerLicenseTrainingScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(bN, "$bN");
        Intrinsics.checkNotNullParameter(bY, "$bY");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        bN.setChecked(true);
        bY.setChecked(false);
        this$0.bString = "N";
    }

    public static final void J2(RadioButton cN, RadioButton cY, LearnerLicenseTrainingScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(cN, "$cN");
        Intrinsics.checkNotNullParameter(cY, "$cY");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        cN.setChecked(true);
        cY.setChecked(false);
        this$0.cString = "N";
    }

    public static final void K2(RadioButton dN, RadioButton dY, LearnerLicenseTrainingScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(dN, "$dN");
        Intrinsics.checkNotNullParameter(dY, "$dY");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        dN.setChecked(true);
        dY.setChecked(false);
        this$0.dString = "N";
    }

    public static final void L2(RadioButton eN, RadioButton eY, LearnerLicenseTrainingScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(eN, "$eN");
        Intrinsics.checkNotNullParameter(eY, "$eY");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        eN.setChecked(true);
        eY.setChecked(false);
        this$0.eString = "N";
    }

    public static final void M2(RadioButton fN, RadioButton fY, LearnerLicenseTrainingScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(fN, "$fN");
        Intrinsics.checkNotNullParameter(fY, "$fY");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        fN.setChecked(true);
        fY.setChecked(false);
        this$0.fString = "N";
    }

    public static final void N2(LearnerLicenseTrainingScreen this$0, CheckBox form_dec_check, Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(form_dec_check, "$form_dec_check");
        Intrinsics.checkNotNullParameter(d2, "$d");
        if (Intrinsics.areEqual(this$0.aString, "")) {
            this$0.O2(this$0, "Please select Yes/No option in Point A");
            return;
        }
        if (Intrinsics.areEqual(this$0.bString, "")) {
            this$0.O2(this$0, "Please select Yes/No option in Point B");
            return;
        }
        if (Intrinsics.areEqual(this$0.cString, "")) {
            this$0.O2(this$0, "Please select Yes/No option in Point C");
            return;
        }
        if (Intrinsics.areEqual(this$0.dString, "")) {
            this$0.O2(this$0, "Please select Yes/No option in Point D");
            return;
        }
        if (Intrinsics.areEqual(this$0.eString, "")) {
            this$0.O2(this$0, "Please select Yes/No option in Point E");
            return;
        }
        if (Intrinsics.areEqual(this$0.fString, "")) {
            this$0.O2(this$0, "Please select Yes/No option in Point F");
        } else {
            if (!form_dec_check.isChecked()) {
                this$0.O2(this$0, "Please click the checkbox to confirm the declaration");
                return;
            }
            d2.dismiss();
            this$0.j2().g(this$0.e2());
        }
    }

    public static final void P2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final void W2() {
        de deVar = this.binding;
        if (deVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            deVar = null;
        }
        deVar.T.removeAllViews();
        int size = this.selectedServiceClass.size();
        for (int i = 0; i < size; i++) {
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            linearLayout.setOrientation(1);
            TextView textView = new TextView(this);
            textView.setPadding(16, 5, 16, 5);
            textView.setTextColor(getColor(R.color.black));
            textView.setTextSize(16.0f);
            textView.setId(Integer.parseInt(((LearnerLicenceClasDatasModal) this.selectedServiceClass.get(i)).getCovCode()));
            textView.setText(((LearnerLicenceClasDatasModal) this.selectedServiceClass.get(i)).getCovName());
            linearLayout.addView(textView);
            de deVar2 = this.binding;
            if (deVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                deVar2 = null;
            }
            deVar2.T.addView(linearLayout);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X2(ArrayList serviceClass) {
        de deVar = this.binding;
        if (deVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            deVar = null;
        }
        deVar.S.removeAllViews();
        this.apiSelectedServiceId = new ArrayList();
        this.apiSelectedServiceName = new ArrayList();
        this.selectedServiceId = new ArrayList();
        this.selectedServiceClass = new ArrayList();
        int size = serviceClass.size();
        for (int i = 0; i < size; i++) {
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            linearLayout.setOrientation(1);
            CheckBox checkBox = new CheckBox(this);
            checkBox.setOnCheckedChangeListener(this);
            checkBox.setId(Integer.parseInt(((LearnerLicenceClasDatasModal) serviceClass.get(i)).getCovCode()));
            checkBox.setText(((LearnerLicenceClasDatasModal) serviceClass.get(i)).getCovName());
            linearLayout.addView(checkBox);
            de deVar2 = this.binding;
            if (deVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                deVar2 = null;
            }
            deVar2.S.addView(linearLayout);
        }
    }

    public static final void Z2(LearnerLicenseTrainingScreen this$0, int i, DatePicker datePicker, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cal.set(1, i2);
        this$0.cal.set(2, i3);
        this$0.cal.set(5, i4);
        CharSequence charSequence = DateFormat.format("dd", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence, "null cannot be cast to non-null type kotlin.String");
        String str = (String) charSequence;
        CharSequence charSequence2 = DateFormat.format("MM", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) charSequence2;
        CharSequence charSequence3 = DateFormat.format("yyyy", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence3, "null cannot be cast to non-null type kotlin.String");
        String str3 = (String) charSequence3;
        de deVar = null;
        if (i == 1) {
            de deVar2 = this$0.binding;
            if (deVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                deVar = deVar2;
            }
            deVar.N.setText(str + '-' + str2 + '-' + str3);
            return;
        }
        if (i == 2) {
            de deVar3 = this$0.binding;
            if (deVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                deVar = deVar3;
            }
            deVar.I.setText(str + '-' + str2 + '-' + str3);
            return;
        }
        if (i != 3) {
            return;
        }
        de deVar4 = this$0.binding;
        if (deVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            deVar = deVar4;
        }
        deVar.a0.setText(str + '-' + str2 + '-' + str3);
    }

    private final void a2() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        arrayList.add(0, new AppCatPojo("0", "Select Category"));
        arrayList.add(1, new AppCatPojo("G", "General"));
        arrayList.add(2, new AppCatPojo("R", "Repatriate"));
        arrayList.add(3, new AppCatPojo("T", "Refugees"));
        arrayList.add(4, new AppCatPojo("X", "Ex-Servicemen"));
        arrayList.add(5, new AppCatPojo("F", "Foreigners (Not Diplomats)"));
        arrayList.add(6, new AppCatPojo("D", "Diplomats (Foreigner)"));
        arrayList.add(7, new AppCatPojo("O", "OCI"));
        arrayList.add(8, new AppCatPojo("P", "Differently Abled"));
        oq oqVar = new oq(this, arrayList);
        de deVar = this.binding;
        de deVar2 = null;
        if (deVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            deVar = null;
        }
        deVar.X.setAdapter((SpinnerAdapter) oqVar);
        int size = arrayList.size();
        while (true) {
            if (i >= size) {
                break;
            }
            wl5 wl5Var = this.sarthiSession;
            if (wl5Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
                wl5Var = null;
            }
            if (Intrinsics.areEqual(StringsKt__StringsKt.trim((CharSequence) wl5Var.a()).toString(), StringsKt__StringsKt.trim((CharSequence) ((AppCatPojo) arrayList.get(i)).getAppCode()).toString())) {
                de deVar3 = this.binding;
                if (deVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    deVar3 = null;
                }
                deVar3.X.setSelection(i);
            } else {
                i++;
            }
        }
        de deVar4 = this.binding;
        if (deVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            deVar2 = deVar4;
        }
        deVar2.X.setOnItemSelectedListener(new a(arrayList));
    }

    private final void a3() {
        try {
            final Dialog dialog = new Dialog(this);
            dialog.setContentView(R.layout.dialog_show_vehicle_info);
            dialog.setCancelable(true);
            dialog.setCanceledOnTouchOutside(true);
            View viewFindViewById = dialog.findViewById(R.id.closeIv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            ImageView imageView = (ImageView) viewFindViewById;
            View viewFindViewById2 = dialog.findViewById(R.id.txtVehicleExplanation);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            TextView textView = (TextView) viewFindViewById2;
            wa3 wa3Var = this.session;
            wa3 wa3Var2 = null;
            if (wa3Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
                wa3Var = null;
            }
            textView.setText(Html.fromHtml(wa3Var.b("ll_info_explanation", getString(R.string.vehicle_explaination))));
            View viewFindViewById3 = dialog.findViewById(R.id.txtVehicleExplanation1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            TextView textView2 = (TextView) viewFindViewById3;
            wa3 wa3Var3 = this.session;
            if (wa3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
                wa3Var3 = null;
            }
            textView2.setText(Html.fromHtml(wa3Var3.b("ll_info_non_transport", getString(R.string.non_transport_explaination))));
            View viewFindViewById4 = dialog.findViewById(R.id.txtVehicleExplanation2);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            TextView textView3 = (TextView) viewFindViewById4;
            wa3 wa3Var4 = this.session;
            if (wa3Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
                wa3Var4 = null;
            }
            textView3.setText(Html.fromHtml(wa3Var4.b("ll_info_transport", getString(R.string.transport_explaination))));
            View viewFindViewById5 = dialog.findViewById(R.id.txtVehicleExplanation3);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            TextView textView4 = (TextView) viewFindViewById5;
            wa3 wa3Var5 = this.session;
            if (wa3Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
                wa3Var5 = null;
            }
            textView4.setText(Html.fromHtml(wa3Var5.b("ll_info_light_motor", getString(R.string.light_vehicle_explaination))));
            View viewFindViewById6 = dialog.findViewById(R.id.txtVehicleExplanation4);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
            TextView textView5 = (TextView) viewFindViewById6;
            wa3 wa3Var6 = this.session;
            if (wa3Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
                wa3Var6 = null;
            }
            textView5.setText(Html.fromHtml(wa3Var6.b("ll_info_medium_motor", getString(R.string.medium_vehicle_explaination))));
            View viewFindViewById7 = dialog.findViewById(R.id.txtVehicleExplanation5);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
            TextView textView6 = (TextView) viewFindViewById7;
            wa3 wa3Var7 = this.session;
            if (wa3Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
            } else {
                wa3Var2 = wa3Var7;
            }
            textView6.setText(Html.fromHtml(wa3Var2.b("ll_info_heavy_motor", getString(R.string.heavy_vehicle_explaination))));
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fe3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LearnerLicenseTrainingScreen.b3(dialog, view);
                }
            });
            dialog.show();
            Window window = dialog.getWindow();
            Intrinsics.checkNotNull(window);
            window.setLayout(-1, -2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private final FormOneRequest b2() {
        ArrayList arrayList = new ArrayList();
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
            wl5Var = null;
        }
        if (Intrinsics.areEqual(StringsKt__StringsKt.trim((CharSequence) wl5Var.n()).toString(), "HP")) {
            arrayList.add(509);
        } else {
            arrayList.add(501);
        }
        return new FormOneRequest("mobSARATHI", "657d1c758e2e95af0014e16f5109f933", "10.248.210.8", "sarathiservice", StringsKt__StringsKt.trim((CharSequence) this.rtoCd).toString(), arrayList);
    }

    public static final void b3(Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    private final void f2() {
        String stringExtra = getIntent().getStringExtra("stateCd");
        Intrinsics.checkNotNull(stringExtra);
        this.stateCd = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("rtoCd");
        Intrinsics.checkNotNull(stringExtra2);
        this.rtoCd = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("rtoName");
        Intrinsics.checkNotNull(stringExtra3);
        this.rtoName = stringExtra3;
        String stringExtra4 = getIntent().getStringExtra("applicantFName");
        Intrinsics.checkNotNull(stringExtra4);
        this.applicantFName = stringExtra4;
        String stringExtra5 = getIntent().getStringExtra("applicantMName");
        Intrinsics.checkNotNull(stringExtra5);
        this.applicantMName = stringExtra5;
        String stringExtra6 = getIntent().getStringExtra("applicantLName");
        Intrinsics.checkNotNull(stringExtra6);
        this.applicantLName = stringExtra6;
        String stringExtra7 = getIntent().getStringExtra("fullName");
        Intrinsics.checkNotNull(stringExtra7);
        this.fullName = stringExtra7;
        String stringExtra8 = getIntent().getStringExtra("relationship");
        Intrinsics.checkNotNull(stringExtra8);
        this.relationShipCd = stringExtra8;
        String stringExtra9 = getIntent().getStringExtra("relationFName");
        Intrinsics.checkNotNull(stringExtra9);
        this.relationFName = stringExtra9;
        String stringExtra10 = getIntent().getStringExtra("relationMName");
        Intrinsics.checkNotNull(stringExtra10);
        this.relationMName = stringExtra10;
        String stringExtra11 = getIntent().getStringExtra("relationLName");
        Intrinsics.checkNotNull(stringExtra11);
        this.relationLName = stringExtra11;
        String stringExtra12 = getIntent().getStringExtra("gender");
        Intrinsics.checkNotNull(stringExtra12);
        this.gender = stringExtra12;
        String stringExtra13 = getIntent().getStringExtra("dob");
        Intrinsics.checkNotNull(stringExtra13);
        this.dob = stringExtra13;
        String stringExtra14 = getIntent().getStringExtra("placeOfBirth");
        Intrinsics.checkNotNull(stringExtra14);
        this.placeOfBirth = stringExtra14;
        String stringExtra15 = getIntent().getStringExtra("country");
        Intrinsics.checkNotNull(stringExtra15);
        this.country = stringExtra15;
        String stringExtra16 = getIntent().getStringExtra("educationQualification");
        Intrinsics.checkNotNull(stringExtra16);
        this.eduQualification = stringExtra16;
        String stringExtra17 = getIntent().getStringExtra("bloodGroup");
        Intrinsics.checkNotNull(stringExtra17);
        this.bloodGroup = stringExtra17;
        String stringExtra18 = getIntent().getStringExtra("applicantMobileNo");
        Intrinsics.checkNotNull(stringExtra18);
        this.mobileNo = stringExtra18;
        String stringExtra19 = getIntent().getStringExtra("emailId");
        Intrinsics.checkNotNull(stringExtra19);
        this.emailID = stringExtra19;
        String stringExtra20 = getIntent().getStringExtra("altMobileNo");
        Intrinsics.checkNotNull(stringExtra20);
        this.altMobileNo = stringExtra20;
        String stringExtra21 = getIntent().getStringExtra("landlineNo");
        Intrinsics.checkNotNull(stringExtra21);
        this.landlineNo = stringExtra21;
        String stringExtra22 = getIntent().getStringExtra("identificationMark1");
        Intrinsics.checkNotNull(stringExtra22);
        this.idMark1 = stringExtra22;
        String stringExtra23 = getIntent().getStringExtra("identificationMark2");
        Intrinsics.checkNotNull(stringExtra23);
        this.idMark2 = stringExtra23;
        this.enteredAge = getIntent().getIntExtra("enteredAge", 0);
        String stringExtra24 = getIntent().getStringExtra("presState");
        Intrinsics.checkNotNull(stringExtra24);
        this.presState = stringExtra24;
        String stringExtra25 = getIntent().getStringExtra("presDistrict");
        Intrinsics.checkNotNull(stringExtra25);
        this.presDistrict = stringExtra25;
        String stringExtra26 = getIntent().getStringExtra("presSubDistrict");
        Intrinsics.checkNotNull(stringExtra26);
        this.presSubDistrict = stringExtra26;
        String stringExtra27 = getIntent().getStringExtra("presVillageOrTown");
        Intrinsics.checkNotNull(stringExtra27);
        this.presVillOrTownCode = stringExtra27;
        String stringExtra28 = getIntent().getStringExtra("preSelectedVillOrTown");
        Intrinsics.checkNotNull(stringExtra28);
        this.presSelectedVillOrTownCd = stringExtra28;
        String stringExtra29 = getIntent().getStringExtra("presHouseNo");
        Intrinsics.checkNotNull(stringExtra29);
        this.presHouseNo = stringExtra29;
        String stringExtra30 = getIntent().getStringExtra("presStreet");
        Intrinsics.checkNotNull(stringExtra30);
        this.presStreet = stringExtra30;
        String stringExtra31 = getIntent().getStringExtra("presLocation");
        Intrinsics.checkNotNull(stringExtra31);
        this.presLandmark = stringExtra31;
        String stringExtra32 = getIntent().getStringExtra("presPincode");
        Intrinsics.checkNotNull(stringExtra32);
        this.presPinCode = stringExtra32;
        String stringExtra33 = getIntent().getStringExtra("year");
        Intrinsics.checkNotNull(stringExtra33);
        this.presStayYear = stringExtra33;
        String stringExtra34 = getIntent().getStringExtra(" Month: ");
        Intrinsics.checkNotNull(stringExtra34);
        this.presStayMonth = stringExtra34;
        String stringExtra35 = getIntent().getStringExtra("perState");
        Intrinsics.checkNotNull(stringExtra35);
        this.permState = stringExtra35;
        String stringExtra36 = getIntent().getStringExtra("perDistrict");
        Intrinsics.checkNotNull(stringExtra36);
        this.permDistrict = stringExtra36;
        String stringExtra37 = getIntent().getStringExtra("perSubDistrict");
        Intrinsics.checkNotNull(stringExtra37);
        this.permSubDistrict = stringExtra37;
        String stringExtra38 = getIntent().getStringExtra("permVillageOrTown");
        Intrinsics.checkNotNull(stringExtra38);
        this.permVillOrTownCode = stringExtra38;
        String stringExtra39 = getIntent().getStringExtra("permSelectedVillOrTown");
        Intrinsics.checkNotNull(stringExtra39);
        this.permSelectedVillOrTownCd = stringExtra39;
        String stringExtra40 = getIntent().getStringExtra("perHouseNo");
        Intrinsics.checkNotNull(stringExtra40);
        this.permHouseNo = stringExtra40;
        String stringExtra41 = getIntent().getStringExtra("perStreet");
        Intrinsics.checkNotNull(stringExtra41);
        this.permStreet = stringExtra41;
        String stringExtra42 = getIntent().getStringExtra("perLocation");
        Intrinsics.checkNotNull(stringExtra42);
        this.permLandmark = stringExtra42;
        String stringExtra43 = getIntent().getStringExtra("perPinCode");
        Intrinsics.checkNotNull(stringExtra43);
        this.permPinCode = stringExtra43;
        String stringExtra44 = getIntent().getStringExtra("campDesc");
        Intrinsics.checkNotNull(stringExtra44);
        this.cmCampDesc = stringExtra44;
        String stringExtra45 = getIntent().getStringExtra("cmType");
        Intrinsics.checkNotNull(stringExtra45);
        this.cmType = stringExtra45;
        if (getIntent().hasExtra("dataFromAadhar") && getIntent().getBooleanExtra("dataFromAadhar", false)) {
            Serializable serializableExtra = getIntent().getSerializableExtra("aadharData");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi.DOEkycX");
            this.adharData = (DOEkycX) serializableExtra;
            this.ekycID = getIntent().getLongExtra("ekycId", 0L);
            this.haveAadhaarData = getIntent().getBooleanExtra("dataFromAadhar", false);
            DOEkycX dOEkycX = this.adharData;
            DOEkycX dOEkycX2 = null;
            if (dOEkycX == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX = null;
            }
            this.aadhaarPhoto = dOEkycX.getPht();
            DOEkycX dOEkycX3 = this.adharData;
            if (dOEkycX3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
            } else {
                dOEkycX2 = dOEkycX3;
            }
            Log.d("adhar_pht0000", dOEkycX2.getPht());
            Log.d("adhar_pht", this.aadhaarPhoto);
        }
    }

    private final void l2() {
        this.sarthiSession = new wl5(this);
        de deVar = this.binding;
        de deVar2 = null;
        if (deVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            deVar = null;
        }
        deVar.O.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xd3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenseTrainingScreen.m2(this.a, view);
            }
        });
        de deVar3 = this.binding;
        if (deVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            deVar3 = null;
        }
        TextView textView = deVar3.O.f;
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
            wl5Var = null;
        }
        textView.setText(wl5Var.k());
        this.service = NewLLServices.INSTANCE.a(this);
        NewLLServices newLLServices = this.service;
        if (newLLServices == null) {
            Intrinsics.throwUninitializedPropertyAccessException("service");
            newLLServices = null;
        }
        this.learnerLicenceVM = (j94) new z(this, new k94(new i94(newLLServices))).a(j94.class);
        de deVar4 = this.binding;
        if (deVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            deVar4 = null;
        }
        deVar4.e0.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.zepto.ie3
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                LearnerLicenseTrainingScreen.n2(this.a, radioGroup, i);
            }
        });
        de deVar5 = this.binding;
        if (deVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            deVar5 = null;
        }
        deVar5.A.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.je3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenseTrainingScreen.p2(this.a, view);
            }
        });
        de deVar6 = this.binding;
        if (deVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            deVar6 = null;
        }
        deVar6.D.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.ke3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                LearnerLicenseTrainingScreen.q2(this.a, compoundButton, z);
            }
        });
        de deVar7 = this.binding;
        if (deVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            deVar7 = null;
        }
        deVar7.Y.setOnItemSelectedListener(new c());
        de deVar8 = this.binding;
        if (deVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            deVar8 = null;
        }
        deVar8.N.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.le3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenseTrainingScreen.r2(this.a, view);
            }
        });
        de deVar9 = this.binding;
        if (deVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            deVar9 = null;
        }
        deVar9.I.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.me3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenseTrainingScreen.s2(this.a, view);
            }
        });
        de deVar10 = this.binding;
        if (deVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            deVar10 = null;
        }
        deVar10.a0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ne3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenseTrainingScreen.t2(this.a, view);
            }
        });
        de deVar11 = this.binding;
        if (deVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            deVar11 = null;
        }
        deVar11.J.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.oe3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenseTrainingScreen.u2(this.a, view);
            }
        });
        de deVar12 = this.binding;
        if (deVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            deVar12 = null;
        }
        deVar12.P.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nd3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                LearnerLicenseTrainingScreen.v2(this.a, view);
            }
        });
        de deVar13 = this.binding;
        if (deVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            deVar13 = null;
        }
        deVar13.B.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.od3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenseTrainingScreen.w2(this.a, view);
            }
        });
        de deVar14 = this.binding;
        if (deVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            deVar2 = deVar14;
        }
        deVar2.G.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.he3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenseTrainingScreen.o2(this.a, view);
            }
        });
    }

    public static final void m2(LearnerLicenseTrainingScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void n2(LearnerLicenseTrainingScreen this$0, RadioGroup radioGroup, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View viewFindViewById = this$0.findViewById(i);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        RadioButton radioButton = (RadioButton) viewFindViewById;
        de deVar = null;
        if (radioButton.getId() == R.id.willing_to_donate) {
            this$0.selectedDonationValue = "true";
            de deVar2 = this$0.binding;
            if (deVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                deVar = deVar2;
            }
            deVar.R.setVisibility(0);
            return;
        }
        if (radioButton.getId() == R.id.not_willing_to_donate) {
            this$0.selectedDonationValue = "false";
            de deVar3 = this$0.binding;
            if (deVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                deVar = deVar3;
            }
            deVar.R.setVisibility(8);
        }
    }

    public static final void o2(LearnerLicenseTrainingScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.apiSelectedServiceId.size() > 0) {
            this$0.z2();
            return;
        }
        wa3 wa3Var = this$0.session;
        if (wa3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("session");
            wa3Var = null;
        }
        Toast.makeText(this$0, wa3Var.b("select_one_vehicle_class", this$0.getString(R.string.please_select_vehicle_class)), 0).show();
    }

    public static final void p2(LearnerLicenseTrainingScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) AddLLDrivingSchoolActivity.class);
        intent.putExtra("stateCd", this$0.stateCd);
        intent.putParcelableArrayListExtra("addedCov", this$0.addedDSchoolData);
        intent.putParcelableArrayListExtra("selectedVehicleClassId", this$0.selectedServiceClass);
        this$0.startActivity(intent);
    }

    public static final void q2(LearnerLicenseTrainingScreen this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        de deVar = null;
        if (z) {
            de deVar2 = this$0.binding;
            if (deVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                deVar = deVar2;
            }
            deVar.C.setVisibility(0);
            return;
        }
        de deVar3 = this$0.binding;
        if (deVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            deVar = deVar3;
        }
        deVar.C.setVisibility(8);
    }

    public static final void r2(LearnerLicenseTrainingScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.Y2(1);
    }

    public static final void s2(LearnerLicenseTrainingScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.Y2(2);
    }

    public static final void t2(LearnerLicenseTrainingScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.Y2(3);
    }

    public static final void u2(LearnerLicenseTrainingScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a3();
    }

    public static final void v2(LearnerLicenseTrainingScreen this$0, View view) throws JSONException {
        JSONArray jSONArray;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        j94 j94Var;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        wa3 wa3Var = null;
        if (Intrinsics.areEqual(this$0.appCategory, "0")) {
            wa3 wa3Var2 = this$0.session;
            if (wa3Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
            } else {
                wa3Var = wa3Var2;
            }
            Toast.makeText(this$0, wa3Var.b("select_app_cat", this$0.getString(R.string.sel_app_category)), 0).show();
            return;
        }
        if (this$0.apiSelectedServiceId.size() == 0) {
            wa3 wa3Var3 = this$0.session;
            if (wa3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
            } else {
                wa3Var = wa3Var3;
            }
            Toast.makeText(this$0, wa3Var.b("select_one_vehicle_class", this$0.getString(R.string.please_select_vehicle_class)), 0).show();
            return;
        }
        if (this$0.form1Visible && !this$0.form1Submitted) {
            wa3 wa3Var4 = this$0.session;
            if (wa3Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
            } else {
                wa3Var = wa3Var4;
            }
            Toast.makeText(this$0, wa3Var.b("please_submit_form1", this$0.getString(R.string.please_submit_form1)), 0).show();
            return;
        }
        if (Intrinsics.areEqual(this$0.selectedDonationValue, "true")) {
            de deVar = this$0.binding;
            if (deVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                deVar = null;
            }
            if (String.valueOf(deVar.R.getText()).length() == 0) {
                wa3 wa3Var5 = this$0.session;
                if (wa3Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("session");
                } else {
                    wa3Var = wa3Var5;
                }
                Toast.makeText(this$0, wa3Var.b("edit_dl_serv_emer_cont_no", this$0.getString(R.string.emergency_contact)), 0).show();
                return;
            }
        }
        de deVar2 = this$0.binding;
        if (deVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            deVar2 = null;
        }
        if (!deVar2.V.isChecked()) {
            wa3 wa3Var6 = this$0.session;
            if (wa3Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
            } else {
                wa3Var = wa3Var6;
            }
            Toast.makeText(this$0, wa3Var.b("plz_accept_term_conditions", this$0.getString(R.string.pls_enter_term_conditions)), 0).show();
            return;
        }
        ProgressDialog progressDialog = this$0.pDialog;
        if (progressDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pDialog");
            progressDialog = null;
        }
        progressDialog.show();
        SharedPreferences sharedPreferences = this$0.pref;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pref");
            sharedPreferences = null;
        }
        String string = sharedPreferences.getString("addedDSchoolDetails", null);
        if (kt6.d(string)) {
            Type type = new TypeToken<List<? extends DrivingSchoolDetRequestModal>>() { // from class: com.nic.mparivahan.dlservices.newlearner.LearnerLicenseTrainingScreen$initUI$10$type$1
            }.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            Object objFromJson = new Gson().fromJson(string, type);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this$0.addedDSchoolData = (ArrayList) objFromJson;
        }
        ArrayList arrayList = new ArrayList();
        int size = this$0.addedDSchoolData.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new LlDrivingSchoolDetRequestModal(((DrivingSchoolDetRequestModal) this$0.addedDSchoolData.get(i)).getEnrollDate(), ((DrivingSchoolDetRequestModal) this$0.addedDSchoolData.get(i)).getCovcd(), ((DrivingSchoolDetRequestModal) this$0.addedDSchoolData.get(i)).getTrainTo(), ((DrivingSchoolDetRequestModal) this$0.addedDSchoolData.get(i)).getCertDate(), ((DrivingSchoolDetRequestModal) this$0.addedDSchoolData.get(i)).getCertNo(), ((DrivingSchoolDetRequestModal) this$0.addedDSchoolData.get(i)).getEnrollNo(), ((DrivingSchoolDetRequestModal) this$0.addedDSchoolData.get(i)).getTrainFrom(), ((DrivingSchoolDetRequestModal) this$0.addedDSchoolData.get(i)).getDrivingSchoolName()));
        }
        JSONArray jSONArray2 = new JSONArray();
        if (arrayList.size() > 0) {
            jSONArray = new JSONArray(new Gson().toJson(arrayList));
            str = "true";
        } else {
            jSONArray = jSONArray2;
            str = "false";
        }
        if (Intrinsics.areEqual(this$0.presSelectedVillOrTownCd, "R")) {
            str3 = this$0.presVillOrTownCode;
            str2 = "";
        } else {
            str2 = this$0.presVillOrTownCode;
            str3 = "";
        }
        if (Intrinsics.areEqual(this$0.permSelectedVillOrTownCd, "R")) {
            str5 = this$0.permVillOrTownCode;
            str4 = "";
        } else {
            str4 = this$0.permVillOrTownCode;
            str5 = "";
        }
        String str6 = this$0.form1Submitted ? "true" : "false";
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray3 = new JSONArray();
        if (this$0.form1Submitted) {
            jSONObject.put("scopea", this$0.aString);
            jSONObject.put("scopeb", this$0.bString);
            jSONObject.put("scopeb1", "");
            jSONObject.put("scopeb2", "");
            jSONObject.put("scopec", this$0.cString);
            jSONObject.put("scoped", this$0.dString);
            jSONObject.put("scopee", this$0.eString);
            jSONObject.put("scopef", this$0.fString);
            jSONObject.put("scopeg", this$0.gString);
            jSONObject.put("declarationCheck", this$0.form1DecChecked);
        }
        jSONArray3.put(jSONObject);
        Log.d("adhar_pht", this$0.aadhaarPhoto);
        j94 j94Var2 = this$0.learnerLicenceVM;
        if (j94Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("learnerLicenceVM");
            j94Var = null;
        } else {
            j94Var = j94Var2;
        }
        j94Var.E(this$0.stateCd, this$0.rtoCd, this$0.applicantFName, this$0.applicantMName, this$0.applicantLName, this$0.relationShipCd, this$0.relationFName, this$0.relationMName, this$0.relationLName, this$0.fullName, this$0.gender, this$0.dob, this$0.placeOfBirth, this$0.country, this$0.eduQualification, this$0.bloodGroup, this$0.landlineNo, this$0.emailID, this$0.mobileNo, this$0.altMobileNo, this$0.idMark1, this$0.idMark2, this$0.presState, this$0.presDistrict, this$0.presSubDistrict, str3, str2, this$0.presHouseNo, this$0.presStreet, this$0.presPinCode, this$0.presStayYear, this$0.presStayMonth, this$0.permState, this$0.permDistrict, this$0.permSubDistrict, str5, str4, this$0.permHouseNo, this$0.permStreet, this$0.permPinCode, this$0.apiSelectedServiceId, this$0.selectedDonationValue, this$0.presSelectedVillOrTownCd, this$0.permSelectedVillOrTownCd, str, this$0.appCategory, jSONArray, String.valueOf(this$0.ekycID), this$0.haveAadhaarData, this$0.aadhaarPhoto, str6, this$0.cmCampDesc, this$0.cmType, jSONArray3);
    }

    public static final void w2(LearnerLicenseTrainingScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) LearnerLicenceAadharScreen.class));
        this$0.finish();
    }

    public static final void y2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public final void O2(Context context, String message) {
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ge3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenseTrainingScreen.P2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void Q2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appCategory = str;
    }

    public final void R2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appCategoryForApi = str;
    }

    public final void S2(ef2 ef2Var) {
        Intrinsics.checkNotNullParameter(ef2Var, "<set-?>");
        this.mFormEligVM = ef2Var;
    }

    public final void T2(FromEligCheck fromEligCheck) {
        Intrinsics.checkNotNullParameter(fromEligCheck, "<set-?>");
        this.mFormsInterface = fromEligCheck;
    }

    public final void U2(s86 s86Var) {
        Intrinsics.checkNotNullParameter(s86Var, "<set-?>");
        this.mSubmitFormVM = s86Var;
    }

    public final void V2(SubmitInterface submitInterface) {
        Intrinsics.checkNotNullParameter(submitInterface, "<set-?>");
        this.mSubmitInterface = submitInterface;
    }

    public final void Y2(final int forWhichDate) {
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.ee3
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                LearnerLicenseTrainingScreen.Z2(this.a, forWhichDate, datePicker, i, i2, i3);
            }
        }, this.cal.get(1), this.cal.get(2), this.cal.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    public final void c2() {
        this.dlStatusList.add(0, "Select");
        this.dlStatusList.add(1, "Convicted");
        this.dlStatusList.add(2, "Disqualified");
        this.dlStatusList.add(3, "Cancelled");
        this.dlStatusList.add(4, "Suspended");
        this.dlStatusList.add(5, "Revoked");
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, this.dlStatusList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        de deVar = this.binding;
        if (deVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            deVar = null;
        }
        deVar.Y.setAdapter((SpinnerAdapter) arrayAdapter);
    }

    public final void d2() {
        T2(FromEligCheck.INSTANCE.a(this));
        S2((ef2) new z(this, new df2(new cf2(i2()))).a(ef2.class));
        V2(SubmitInterface.INSTANCE.a(this));
        U2((s86) new z(this, new q86(new r86(k2()))).a(s86.class));
        h2().h(b2());
        h2().j().g(this, new h(new b()));
    }

    public final SubmitRequest e2() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
            wl5Var = null;
        }
        return new SubmitRequest("430975", "E18D85C6554A4E4E0B48ABA798FB75E5", "10.128.201.115", "DLTestTrackForAgency", wl5Var.n(), "G", "", "", this.aString, this.bString, this.cString, this.dString, this.eString, this.fString, this.gString, "Y", this.apiSelectedServiceId);
    }

    public final void g2() {
        ProgressDialog progressDialog = this.pDialog;
        j94 j94Var = null;
        if (progressDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pDialog");
            progressDialog = null;
        }
        progressDialog.show();
        j94 j94Var2 = this.learnerLicenceVM;
        if (j94Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("learnerLicenceVM");
        } else {
            j94Var = j94Var2;
        }
        j94Var.x(this.stateCd, this.enteredAge, Integer.parseInt(this.eduQualification), this.appCategoryForApi);
    }

    public final ef2 h2() {
        ef2 ef2Var = this.mFormEligVM;
        if (ef2Var != null) {
            return ef2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mFormEligVM");
        return null;
    }

    public final FromEligCheck i2() {
        FromEligCheck fromEligCheck = this.mFormsInterface;
        if (fromEligCheck != null) {
            return fromEligCheck;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mFormsInterface");
        return null;
    }

    public final s86 j2() {
        s86 s86Var = this.mSubmitFormVM;
        if (s86Var != null) {
            return s86Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mSubmitFormVM");
        return null;
    }

    public final SubmitInterface k2() {
        SubmitInterface submitInterface = this.mSubmitInterface;
        if (submitInterface != null) {
            return submitInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mSubmitInterface");
        return null;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        ArrayList arrayList = this.selectedServiceId;
        Intrinsics.checkNotNull(buttonView);
        if (arrayList.contains(Integer.valueOf(buttonView.getId()))) {
            this.selectedServiceId.remove(Integer.valueOf(buttonView.getId()));
            this.apiSelectedServiceId.remove(String.valueOf(buttonView.getId()));
            this.selectedServiceClass.remove(new LearnerLicenceClasDatasModal(buttonView.getText().toString(), String.valueOf(buttonView.getId())));
        } else {
            this.selectedServiceId.add(Integer.valueOf(buttonView.getId()));
            this.apiSelectedServiceId.add(String.valueOf(buttonView.getId()));
            this.selectedServiceClass.add(new LearnerLicenceClasDatasModal(buttonView.getText().toString(), String.valueOf(buttonView.getId())));
        }
        de deVar = null;
        if (this.selectedServiceClass.size() <= 0) {
            de deVar2 = this.binding;
            if (deVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                deVar2 = null;
            }
            deVar2.T.setVisibility(8);
            de deVar3 = this.binding;
            if (deVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                deVar = deVar3;
            }
            deVar.U.setVisibility(8);
            return;
        }
        de deVar4 = this.binding;
        if (deVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            deVar4 = null;
        }
        deVar4.U.setVisibility(0);
        de deVar5 = this.binding;
        if (deVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            deVar = deVar5;
        }
        deVar.T.setVisibility(0);
        W2();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        de deVarX = de.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(deVarX, "inflate(...)");
        this.binding = deVarX;
        j94 j94Var = null;
        if (deVarX == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            deVarX = null;
        }
        setContentView(deVarX.m());
        this.session = new wa3(this);
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.pDialog = progressDialog;
        wa3 wa3Var = this.session;
        if (wa3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("session");
            wa3Var = null;
        }
        progressDialog.setMessage(wa3Var.b("label_challan_please_wait", "Please wait..."));
        ProgressDialog progressDialog2 = this.pDialog;
        if (progressDialog2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pDialog");
            progressDialog2 = null;
        }
        progressDialog2.setCancelable(false);
        ProgressDialog progressDialog3 = this.pDialog;
        if (progressDialog3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pDialog");
            progressDialog3 = null;
        }
        progressDialog3.setCanceledOnTouchOutside(false);
        SharedPreferences sharedPreferences = getSharedPreferences("AddLLVehicleClass", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.pref = sharedPreferences;
        ta3.a aVar = ta3.a;
        de deVar = this.binding;
        if (deVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            deVar = null;
        }
        aVar.e1(this, deVar);
        f2();
        c2();
        l2();
        a2();
        d2();
        j94 j94Var2 = this.learnerLicenceVM;
        if (j94Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("learnerLicenceVM");
            j94Var2 = null;
        }
        j94Var2.C().g(this, new h(new d()));
        j94 j94Var3 = this.learnerLicenceVM;
        if (j94Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("learnerLicenceVM");
            j94Var3 = null;
        }
        j94Var3.D().g(this, new h(new e()));
        j94 j94Var4 = this.learnerLicenceVM;
        if (j94Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("learnerLicenceVM");
        } else {
            j94Var = j94Var4;
        }
        j94Var.w().g(this, new h(new f()));
        j2().i().g(this, new h(new g()));
    }

    public final void x2(Context context, String message) {
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.md3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenseTrainingScreen.y2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void z2() {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.declaration_form);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.next_request);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type com.nic.mparivahan.dlservices.widget.CustomWegetLayout");
        CustomWegetLayout customWegetLayout = (CustomWegetLayout) viewFindViewById;
        View viewFindViewById2 = dialog.findViewById(R.id.a_y);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.RadioButton");
        final RadioButton radioButton = (RadioButton) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.b_y);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.RadioButton");
        final RadioButton radioButton2 = (RadioButton) viewFindViewById3;
        View viewFindViewById4 = dialog.findViewById(R.id.c_y);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.RadioButton");
        final RadioButton radioButton3 = (RadioButton) viewFindViewById4;
        View viewFindViewById5 = dialog.findViewById(R.id.d_y);
        Intrinsics.checkNotNull(viewFindViewById5, "null cannot be cast to non-null type android.widget.RadioButton");
        final RadioButton radioButton4 = (RadioButton) viewFindViewById5;
        View viewFindViewById6 = dialog.findViewById(R.id.e_y);
        Intrinsics.checkNotNull(viewFindViewById6, "null cannot be cast to non-null type android.widget.RadioButton");
        final RadioButton radioButton5 = (RadioButton) viewFindViewById6;
        View viewFindViewById7 = dialog.findViewById(R.id.f_y);
        Intrinsics.checkNotNull(viewFindViewById7, "null cannot be cast to non-null type android.widget.RadioButton");
        final RadioButton radioButton6 = (RadioButton) viewFindViewById7;
        View viewFindViewById8 = dialog.findViewById(R.id.a_n);
        Intrinsics.checkNotNull(viewFindViewById8, "null cannot be cast to non-null type android.widget.RadioButton");
        final RadioButton radioButton7 = (RadioButton) viewFindViewById8;
        View viewFindViewById9 = dialog.findViewById(R.id.b_n);
        Intrinsics.checkNotNull(viewFindViewById9, "null cannot be cast to non-null type android.widget.RadioButton");
        final RadioButton radioButton8 = (RadioButton) viewFindViewById9;
        View viewFindViewById10 = dialog.findViewById(R.id.c_n);
        Intrinsics.checkNotNull(viewFindViewById10, "null cannot be cast to non-null type android.widget.RadioButton");
        final RadioButton radioButton9 = (RadioButton) viewFindViewById10;
        View viewFindViewById11 = dialog.findViewById(R.id.d_n);
        Intrinsics.checkNotNull(viewFindViewById11, "null cannot be cast to non-null type android.widget.RadioButton");
        final RadioButton radioButton10 = (RadioButton) viewFindViewById11;
        View viewFindViewById12 = dialog.findViewById(R.id.e_n);
        Intrinsics.checkNotNull(viewFindViewById12, "null cannot be cast to non-null type android.widget.RadioButton");
        final RadioButton radioButton11 = (RadioButton) viewFindViewById12;
        View viewFindViewById13 = dialog.findViewById(R.id.f_n);
        Intrinsics.checkNotNull(viewFindViewById13, "null cannot be cast to non-null type android.widget.RadioButton");
        final RadioButton radioButton12 = (RadioButton) viewFindViewById13;
        View viewFindViewById14 = dialog.findViewById(R.id.closeIv);
        Intrinsics.checkNotNull(viewFindViewById14, "null cannot be cast to non-null type android.widget.ImageView");
        ((ImageView) viewFindViewById14).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pd3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenseTrainingScreen.A2(dialog, view);
            }
        });
        View viewFindViewById15 = dialog.findViewById(R.id.form_dec_check);
        Intrinsics.checkNotNull(viewFindViewById15, "null cannot be cast to non-null type android.widget.CheckBox");
        final CheckBox checkBox = (CheckBox) viewFindViewById15;
        radioButton.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ud3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenseTrainingScreen.B2(radioButton, radioButton7, this, view);
            }
        });
        radioButton2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vd3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenseTrainingScreen.C2(radioButton2, radioButton8, this, view);
            }
        });
        radioButton3.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wd3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenseTrainingScreen.D2(radioButton3, radioButton9, this, view);
            }
        });
        radioButton4.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yd3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenseTrainingScreen.E2(radioButton4, radioButton10, this, view);
            }
        });
        radioButton5.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zd3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenseTrainingScreen.F2(radioButton5, radioButton11, this, view);
            }
        });
        radioButton6.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ae3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenseTrainingScreen.G2(radioButton6, radioButton12, this, view);
            }
        });
        radioButton7.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.be3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenseTrainingScreen.H2(radioButton7, radioButton, this, view);
            }
        });
        radioButton8.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ce3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenseTrainingScreen.I2(radioButton8, radioButton2, this, view);
            }
        });
        radioButton9.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.de3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenseTrainingScreen.J2(radioButton9, radioButton3, this, view);
            }
        });
        radioButton10.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qd3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenseTrainingScreen.K2(radioButton10, radioButton4, this, view);
            }
        });
        radioButton11.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rd3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenseTrainingScreen.L2(radioButton11, radioButton5, this, view);
            }
        });
        radioButton12.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sd3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenseTrainingScreen.M2(radioButton12, radioButton6, this, view);
            }
        });
        this.form1DecChecked = checkBox.isChecked() ? "Y" : "N";
        customWegetLayout.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.td3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenseTrainingScreen.N2(this.a, checkBox, dialog, view);
            }
        });
        dialog.show();
    }
}
