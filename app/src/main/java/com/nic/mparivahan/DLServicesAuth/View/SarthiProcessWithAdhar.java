package com.nic.mparivahan.DLServicesAuth.View;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.preference.PreferenceManager;
import android.text.Editable;
import android.text.Html;
import android.text.InputFilter;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.nic.mparivahan.DLServicesAuth.CheckEligibility.FromEligCheck;
import com.nic.mparivahan.DLServicesAuth.Model.CustomState.CustomState;
import com.nic.mparivahan.DLServicesAuth.Model.ServiceCheckPojo;
import com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar;
import com.nic.mparivahan.DLServicesAuth.Wrapper.EkycModel.ApiMessage;
import com.nic.mparivahan.DLServicesAuth.Wrapper.EkycModel.Data;
import com.nic.mparivahan.DLServicesAuth.Wrapper.EkycModel.eKycResponse;
import com.nic.mparivahan.DLServicesAuth.Wrapper.EkycResponse.DOAadhaarResponse;
import com.nic.mparivahan.DLServicesAuth.Wrapper.EkycResponse.DOEkyc;
import com.nic.mparivahan.DLServicesAuth.Wrapper.EkycResponse.EkycVerifyResponse;
import com.nic.mparivahan.DLServicesAuth.eKyc.AadharInterface;
import com.nic.mparivahan.DLServicesAuth.eKyc.AdharKyc.AdrInterface;
import com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi.DOEkycX;
import com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi.OtpAdharRes;
import com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi.UserFullDetails;
import com.nic.mparivahan.DLServicesAuth.eKyc.Pojo.SubmitAdharApi;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.DlCombineServices.CombineReq;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanEkyc.Aadarkyc;
import com.nic.mparivahan.VahanEkyc.AadarkycVerify;
import com.nic.mparivahan.VahanEkyc.EkYCService;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.Welcome.Model.NapixTokenModel;
import com.nic.mparivahan.Welcome.NapixService;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import com.nic.mparivahan.dlservices.ui.changeName.ChangeOfName;
import com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity;
import com.nic.mparivahan.dlservices.ui.dlextract.DLExtractActivity;
import com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity;
import com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity;
import com.nic.mparivahan.dlservices.ui.hillService.HillReligion;
import com.nic.mparivahan.dlservices.ui.idp.DLIdpActivity;
import com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity;
import com.nic.mparivahan.dlservices.ui.replacementdl.DLReplecementActivity;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.zepto.aj5;
import com.zepto.cf2;
import com.zepto.df2;
import com.zepto.ef2;
import com.zepto.jd7;
import com.zepto.jl;
import com.zepto.kd7;
import com.zepto.kl;
import com.zepto.ld7;
import com.zepto.ll;
import com.zepto.lr1;
import com.zepto.mf4;
import com.zepto.ml;
import com.zepto.nr1;
import com.zepto.o40;
import com.zepto.ol;
import com.zepto.pl;
import com.zepto.qi5;
import com.zepto.rq1;
import com.zepto.s14;
import com.zepto.t14;
import com.zepto.v14;
import com.zepto.va3;
import com.zepto.vh7;
import com.zepto.w14;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.ws6;
import com.zepto.xi5;
import com.zepto.yi5;
import com.zepto.zi5;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002Þ\u0002B\t¢\u0006\u0006\bÜ\u0002\u0010Ý\u0002J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J(\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002JH\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\b0\u000ej\b\u0012\u0004\u0012\u00020\b`\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0002H\u0002J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\bH\u0002J\u0012\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u001a\u001a\u00020\u0002H\u0014J\u001a\u0010\u001e\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\bJ\u0016\u0010 \u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\bJ\u0012\u0010\"\u001a\u0004\u0018\u00010\b2\b\u0010!\u001a\u0004\u0018\u00010\bR\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010I\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010M\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010D\u001a\u0004\bK\u0010F\"\u0004\bL\u0010HR\"\u0010Q\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010D\u001a\u0004\bO\u0010F\"\u0004\bP\u0010HR\"\u0010U\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010D\u001a\u0004\bS\u0010F\"\u0004\bT\u0010HR\"\u0010Y\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010D\u001a\u0004\bW\u0010F\"\u0004\bX\u0010HR\"\u0010]\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010D\u001a\u0004\b[\u0010F\"\u0004\b\\\u0010HR$\u0010a\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010D\u001a\u0004\b_\u0010F\"\u0004\b`\u0010HR$\u0010e\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010D\u001a\u0004\bc\u0010F\"\u0004\bd\u0010HR$\u0010i\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010D\u001a\u0004\bg\u0010F\"\u0004\bh\u0010HR\"\u0010m\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010D\u001a\u0004\bk\u0010F\"\u0004\bl\u0010HR\"\u0010q\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010D\u001a\u0004\bo\u0010F\"\u0004\bp\u0010HR\"\u0010y\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xRI\u0010\u0082\u0001\u001a&\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\b0zj\u0012\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\b`{8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R)\u0010\u0089\u0001\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R*\u0010\u0091\u0001\u001a\u00030\u008a\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R*\u0010\u0099\u0001\u001a\u00030\u0092\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R*\u0010¡\u0001\u001a\u00030\u009a\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R*\u0010©\u0001\u001a\u00030¢\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R*\u0010±\u0001\u001a\u00030ª\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R*\u0010¹\u0001\u001a\u00030²\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b³\u0001\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001\"\u0006\b·\u0001\u0010¸\u0001R*\u0010Á\u0001\u001a\u00030º\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b»\u0001\u0010¼\u0001\u001a\u0006\b½\u0001\u0010¾\u0001\"\u0006\b¿\u0001\u0010À\u0001R&\u0010Å\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÂ\u0001\u0010D\u001a\u0005\bÃ\u0001\u0010F\"\u0005\bÄ\u0001\u0010HR*\u0010Í\u0001\u001a\u00030Æ\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÇ\u0001\u0010È\u0001\u001a\u0006\bÉ\u0001\u0010Ê\u0001\"\u0006\bË\u0001\u0010Ì\u0001R*\u0010Õ\u0001\u001a\u00030Î\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÏ\u0001\u0010Ð\u0001\u001a\u0006\bÑ\u0001\u0010Ò\u0001\"\u0006\bÓ\u0001\u0010Ô\u0001R&\u0010Ù\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÖ\u0001\u0010D\u001a\u0005\b×\u0001\u0010F\"\u0005\bØ\u0001\u0010HR%\u0010\u0015\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÚ\u0001\u0010D\u001a\u0005\bÛ\u0001\u0010F\"\u0005\bÜ\u0001\u0010HR&\u0010à\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÝ\u0001\u0010D\u001a\u0005\bÞ\u0001\u0010F\"\u0005\bß\u0001\u0010HR&\u0010ä\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bá\u0001\u0010D\u001a\u0005\bâ\u0001\u0010F\"\u0005\bã\u0001\u0010HR(\u0010ê\u0001\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bå\u0001\u0010<\u001a\u0006\bæ\u0001\u0010ç\u0001\"\u0006\bè\u0001\u0010é\u0001R*\u0010ò\u0001\u001a\u00030ë\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bì\u0001\u0010í\u0001\u001a\u0006\bî\u0001\u0010ï\u0001\"\u0006\bð\u0001\u0010ñ\u0001R*\u0010ú\u0001\u001a\u00030ó\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bô\u0001\u0010õ\u0001\u001a\u0006\bö\u0001\u0010÷\u0001\"\u0006\bø\u0001\u0010ù\u0001R8\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\b0\u000ej\b\u0012\u0004\u0012\u00020\b`\u000f8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bû\u0001\u0010ü\u0001\u001a\u0006\bý\u0001\u0010þ\u0001\"\u0006\bÿ\u0001\u0010\u0080\u0002R9\u0010\u0084\u0002\u001a\u0012\u0012\u0004\u0012\u00020\b0\u000ej\b\u0012\u0004\u0012\u00020\b`\u000f8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0081\u0002\u0010ü\u0001\u001a\u0006\b\u0082\u0002\u0010þ\u0001\"\u0006\b\u0083\u0002\u0010\u0080\u0002R9\u0010\u0088\u0002\u001a\u0012\u0012\u0004\u0012\u00020\b0\u000ej\b\u0012\u0004\u0012\u00020\b`\u000f8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0085\u0002\u0010ü\u0001\u001a\u0006\b\u0086\u0002\u0010þ\u0001\"\u0006\b\u0087\u0002\u0010\u0080\u0002R&\u0010\u008c\u0002\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0089\u0002\u0010D\u001a\u0005\b\u008a\u0002\u0010F\"\u0005\b\u008b\u0002\u0010HR*\u0010\u0093\u0002\u001a\u00030\u008d\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008e\u0002\u0010\u009b\u0001\u001a\u0006\b\u008f\u0002\u0010\u0090\u0002\"\u0006\b\u0091\u0002\u0010\u0092\u0002R*\u0010\u009b\u0002\u001a\u00030\u0094\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0095\u0002\u0010\u0096\u0002\u001a\u0006\b\u0097\u0002\u0010\u0098\u0002\"\u0006\b\u0099\u0002\u0010\u009a\u0002R*\u0010£\u0002\u001a\u00030\u009c\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009d\u0002\u0010\u009e\u0002\u001a\u0006\b\u009f\u0002\u0010 \u0002\"\u0006\b¡\u0002\u0010¢\u0002R*\u0010«\u0002\u001a\u00030¤\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¥\u0002\u0010¦\u0002\u001a\u0006\b§\u0002\u0010¨\u0002\"\u0006\b©\u0002\u0010ª\u0002R&\u0010¯\u0002\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¬\u0002\u0010D\u001a\u0005\b\u00ad\u0002\u0010F\"\u0005\b®\u0002\u0010HR&\u0010³\u0002\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b°\u0002\u0010D\u001a\u0005\b±\u0002\u0010F\"\u0005\b²\u0002\u0010HR9\u0010·\u0002\u001a\u0012\u0012\u0004\u0012\u00020\b0\u000ej\b\u0012\u0004\u0012\u00020\b`\u000f8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b´\u0002\u0010ü\u0001\u001a\u0006\bµ\u0002\u0010þ\u0001\"\u0006\b¶\u0002\u0010\u0080\u0002R9\u0010»\u0002\u001a\u0012\u0012\u0004\u0012\u00020\b0\u000ej\b\u0012\u0004\u0012\u00020\b`\u000f8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¸\u0002\u0010ü\u0001\u001a\u0006\b¹\u0002\u0010þ\u0001\"\u0006\bº\u0002\u0010\u0080\u0002R*\u0010Ã\u0002\u001a\u00030¼\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b½\u0002\u0010¾\u0002\u001a\u0006\b¿\u0002\u0010À\u0002\"\u0006\bÁ\u0002\u0010Â\u0002R\u0018\u0010Å\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÄ\u0002\u0010DR\u0018\u0010Ç\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÆ\u0002\u0010DR\u0018\u0010É\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÈ\u0002\u0010DR\u0018\u0010Ë\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÊ\u0002\u0010DR\u001a\u0010Ï\u0002\u001a\u00030Ì\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÍ\u0002\u0010Î\u0002R*\u0010×\u0002\u001a\u00030Ð\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÑ\u0002\u0010Ò\u0002\u001a\u0006\bÓ\u0002\u0010Ô\u0002\"\u0006\bÕ\u0002\u0010Ö\u0002R\u0018\u0010Û\u0002\u001a\u00030Ø\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÙ\u0002\u0010Ú\u0002¨\u0006ß\u0002"}, d2 = {"Lcom/nic/mparivahan/DLServicesAuth/View/SarthiProcessWithAdhar;", "Lcom/zepto/o40;", "", "i3", "k2", "f3", "Landroid/content/Intent;", "intent", "", "lastEndRTO", "lastEndState", "purCode", "g3", "H3", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "multiList", "", "serialNo", "h3", "B3", "eKYCId", "G3", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onResume", "Landroid/content/Context;", "context", "message", "E3", "mobile_no", "x4", "fdate", "n2", "Lcom/zepto/xi5;", "F", "Lcom/zepto/xi5;", "q2", "()Lcom/zepto/xi5;", "P3", "(Lcom/zepto/xi5;)V", "binding", "Lcom/zepto/wl5;", "G", "Lcom/zepto/wl5;", "Z2", "()Lcom/zepto/wl5;", "s4", "(Lcom/zepto/wl5;)V", "sarthiSession", "Lcom/zepto/ws6;", "H", "Lcom/zepto/ws6;", "b3", "()Lcom/zepto/ws6;", "u4", "(Lcom/zepto/ws6;)V", "sessionManager", "Lcom/zepto/wa3;", "I", "Lcom/zepto/wa3;", "B2", "()Lcom/zepto/wa3;", "Y3", "(Lcom/zepto/wa3;)V", "langSession", "J", "Ljava/lang/String;", "r2", "()Ljava/lang/String;", "setBioRecGenesis", "(Ljava/lang/String;)V", "bioRecGenesis", "K", "C2", "setLastEndorseRtoCode", "lastEndorseRtoCode", "L", "D2", "setLastEndorseStateCode", "lastEndorseStateCode", "M", "F2", "setLastEndorsedState", "lastEndorsedState", "N", "E2", "setLastEndorsedRTO", "lastEndorsedRTO", "O", "c3", "setState_value", "state_value", "P", "u2", "setDlNo", "dlNo", "Q", "w2", "setDob", "dob", "R", "d3", "v4", "txnNo", "S", "getOwner_name_addhaar", "m4", "owner_name_addhaar", "T", "getAddress", "O3", "address", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "U", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "t2", "()Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "R3", "(Lcom/nic/mparivahan/Dl/Model/DldetobjX;)V", "dlDetails", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "V", "Ljava/util/HashMap;", "e3", "()Ljava/util/HashMap;", "setWhatServiceRequired", "(Ljava/util/HashMap;)V", "whatServiceRequired", "W", "Landroid/content/Context;", "L2", "()Landroid/content/Context;", "e4", "(Landroid/content/Context;)V", "mContext", "Landroid/app/ProgressDialog;", "X", "Landroid/app/ProgressDialog;", "U2", "()Landroid/app/ProgressDialog;", "n4", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/aj5;", "Y", "Lcom/zepto/aj5;", "O2", "()Lcom/zepto/aj5;", "h4", "(Lcom/zepto/aj5;)V", "mView", "Lcom/nic/mparivahan/VahanEkyc/EkYCService;", "Z", "Lcom/nic/mparivahan/VahanEkyc/EkYCService;", "Y2", "()Lcom/nic/mparivahan/VahanEkyc/EkYCService;", "r4", "(Lcom/nic/mparivahan/VahanEkyc/EkYCService;)V", "retrofitService_one", "Lcom/zepto/ll;", "a0", "Lcom/zepto/ll;", "J2", "()Lcom/zepto/ll;", "c4", "(Lcom/zepto/ll;)V", "mAadharViewModel", "Lcom/zepto/ml;", "b0", "Lcom/zepto/ml;", "K2", "()Lcom/zepto/ml;", "d4", "(Lcom/zepto/ml;)V", "mAadharViewModel2", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/AadharInterface;", "c0", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/AadharInterface;", "H2", "()Lcom/nic/mparivahan/DLServicesAuth/eKyc/AadharInterface;", "a4", "(Lcom/nic/mparivahan/DLServicesAuth/eKyc/AadharInterface;)V", "mAadharInterface", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/AdharKyc/AdrInterface;", "d0", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/AdharKyc/AdrInterface;", "I2", "()Lcom/nic/mparivahan/DLServicesAuth/eKyc/AdharKyc/AdrInterface;", "b4", "(Lcom/nic/mparivahan/DLServicesAuth/eKyc/AdharKyc/AdrInterface;)V", "mAadharInterface2", "e0", "p2", "setAllowAddrChangeAtDlservReqst", "allowAddrChangeAtDlservReqst", "Lcom/zepto/nr1;", "f0", "Lcom/zepto/nr1;", "v2", "()Lcom/zepto/nr1;", "S3", "(Lcom/zepto/nr1;)V", "dlServicesViewModel", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "g0", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "W2", "()Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "p4", "(Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;)V", "retrofitService", "h0", "getType", "setType", "type", "i0", "y2", "U3", "j0", "z2", "V3", "ePhoto", "k0", "x2", "T3", "eKYCGender", "l0", "a3", "()I", "t4", "(I)V", "serviceCode", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "m0", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "X2", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "q4", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitServiceVahan", "Lcom/zepto/ld7;", "n0", "Lcom/zepto/ld7;", "getViewModelv1", "()Lcom/zepto/ld7;", "w4", "(Lcom/zepto/ld7;)V", "viewModelv1", "o0", "Ljava/util/ArrayList;", "Q2", "()Ljava/util/ArrayList;", "i4", "(Ljava/util/ArrayList;)V", "p0", "S2", "k4", "multiListName", "q0", "R2", "j4", "multiListCode", "r0", "getServiceSelect", "setServiceSelect", "serviceSelect", "", "s0", "s2", "()Z", "Q3", "(Z)V", "COA", "Lcom/zepto/ef2;", "t0", "Lcom/zepto/ef2;", "M2", "()Lcom/zepto/ef2;", "f4", "(Lcom/zepto/ef2;)V", "mFormEligVM", "Lcom/nic/mparivahan/DLServicesAuth/CheckEligibility/FromEligCheck;", "u0", "Lcom/nic/mparivahan/DLServicesAuth/CheckEligibility/FromEligCheck;", "N2", "()Lcom/nic/mparivahan/DLServicesAuth/CheckEligibility/FromEligCheck;", "g4", "(Lcom/nic/mparivahan/DLServicesAuth/CheckEligibility/FromEligCheck;)V", "mFormsInterface", "Lcom/nic/mparivahan/dlservices/widget/CustomWegetLayout;", "v0", "Lcom/nic/mparivahan/dlservices/widget/CustomWegetLayout;", "V2", "()Lcom/nic/mparivahan/dlservices/widget/CustomWegetLayout;", "o4", "(Lcom/nic/mparivahan/dlservices/widget/CustomWegetLayout;)V", "Proceed", "w0", "P2", "setMultiCheck", "multiCheck", "x0", "getFlag", "X3", "flag", "y0", "G2", "Z3", "listHeaderSteps", "z0", "A2", "W3", "finalList", "Lcom/nic/mparivahan/VahanEkyc/Aadarkyc$DOEkyc;", "A0", "Lcom/nic/mparivahan/VahanEkyc/Aadarkyc$DOEkyc;", "o2", "()Lcom/nic/mparivahan/VahanEkyc/Aadarkyc$DOEkyc;", "N3", "(Lcom/nic/mparivahan/VahanEkyc/Aadarkyc$DOEkyc;)V", "aadhaarData", "B0", "tokenAdhar", "C0", "traceId", "D0", "tokenService", "E0", "nk", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewAdharApi/DOEkycX;", "F0", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewAdharApi/DOEkycX;", "adharData", "Lcom/zepto/v14;", "G0", "Lcom/zepto/v14;", "T2", "()Lcom/zepto/v14;", "l4", "(Lcom/zepto/v14;)V", "napixViewModel", "Lcom/nic/mparivahan/Welcome/NapixService;", "H0", "Lcom/nic/mparivahan/Welcome/NapixService;", "napixService", "<init>", "()V", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public final class SarthiProcessWithAdhar extends o40 {

    /* JADX INFO: renamed from: A0, reason: from kotlin metadata */
    public Aadarkyc.DOEkyc aadhaarData;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public xi5 binding;

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    public DOEkycX adharData;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    public v14 napixViewModel;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String dlNo;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String dob;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String txnNo;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public DldetobjX dlDetails;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public aj5 mView;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public EkYCService retrofitService_one;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public ll mAadharViewModel;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public ml mAadharViewModel2;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public AadharInterface mAadharInterface;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public AdrInterface mAadharInterface2;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public nr1 dlServicesViewModel;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public DlServiceInt retrofitService;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public int serviceCode;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public VahanProService retrofitServiceVahan;

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public ld7 viewModelv1;

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    public ArrayList multiList;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public ArrayList multiListName;

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    public ArrayList multiListCode;

    /* JADX INFO: renamed from: s0, reason: from kotlin metadata */
    public boolean COA;

    /* JADX INFO: renamed from: t0, reason: from kotlin metadata */
    public ef2 mFormEligVM;

    /* JADX INFO: renamed from: u0, reason: from kotlin metadata */
    public FromEligCheck mFormsInterface;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    public CustomWegetLayout Proceed;

    /* JADX INFO: renamed from: y0, reason: from kotlin metadata */
    public ArrayList listHeaderSteps;

    /* JADX INFO: renamed from: z0, reason: from kotlin metadata */
    public ArrayList finalList;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String bioRecGenesis = "";

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String lastEndorseRtoCode = "";

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String lastEndorseStateCode = "";

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String lastEndorsedState = "";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String lastEndorsedRTO = "";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String state_value = "";

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String owner_name_addhaar = "NA";

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String address = "NA";

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public HashMap whatServiceRequired = new HashMap();

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public String allowAddrChangeAtDlservReqst = "allowAddrChange";

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public String type = "A";

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public String eKYCId = "NA";

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public String ePhoto = "NA";

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public String eKYCGender = "NA";

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    public String serviceSelect = "";

    /* JADX INFO: renamed from: w0, reason: from kotlin metadata */
    public String multiCheck = "valid";

    /* JADX INFO: renamed from: x0, reason: from kotlin metadata */
    public String flag = "";

    /* JADX INFO: renamed from: B0, reason: from kotlin metadata */
    public String tokenAdhar = "";

    /* JADX INFO: renamed from: C0, reason: from kotlin metadata */
    public String traceId = "";

    /* JADX INFO: renamed from: D0, reason: from kotlin metadata */
    public String tokenService = "";

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    public String nk = "";

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    public final NapixService napixService = NapixService.INSTANCE.a();

    public final class a extends RecyclerView.h {
        public ArrayList d;
        public final /* synthetic */ SarthiProcessWithAdhar e;

        /* JADX INFO: renamed from: com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar$a$a, reason: collision with other inner class name */
        public final class C0047a extends RecyclerView.d0 {
            public final CheckBox u;
            public final TextView v;
            public final ImageView w;
            public final LinearLayout x;
            public final /* synthetic */ a y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0047a(a aVar, View ItemView) {
                super(ItemView);
                Intrinsics.checkNotNullParameter(ItemView, "ItemView");
                this.y = aVar;
                View viewFindViewById = this.a.findViewById(R.id.service_check_box);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                this.u = (CheckBox) viewFindViewById;
                View viewFindViewById2 = this.a.findViewById(R.id.service_txt);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
                this.v = (TextView) viewFindViewById2;
                View viewFindViewById3 = this.a.findViewById(R.id.rightStatePin);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
                this.w = (ImageView) viewFindViewById3;
                View viewFindViewById4 = this.a.findViewById(R.id.multi_layout);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
                this.x = (LinearLayout) viewFindViewById4;
            }

            public final LinearLayout O() {
                return this.x;
            }

            public final ImageView P() {
                return this.w;
            }

            public final TextView Q() {
                return this.v;
            }
        }

        public a(SarthiProcessWithAdhar sarthiProcessWithAdhar, ArrayList mList) {
            Intrinsics.checkNotNullParameter(mList, "mList");
            this.e = sarthiProcessWithAdhar;
            this.d = mList;
        }

        public static final void C(SarthiProcessWithAdhar this$0, C0047a holder, a this$1, String mModel, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(holder, "$holder");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNullParameter(mModel, "$mModel");
            Log.d("values", this$0.getBioRecGenesis() + '-' + this$0.getAllowAddrChangeAtDlservReqst());
            if (Intrinsics.areEqual(this$0.getMultiCheck(), holder.Q().getText())) {
                Toast.makeText(this$0, "You can not deselect the " + ((Object) holder.Q().getText()) + " Service", 1).show();
                return;
            }
            if (Intrinsics.areEqual(this$0.getState_value(), "differ") && Intrinsics.areEqual(holder.Q().getText(), this$0.B2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                this$0.Q3(true);
                Toast.makeText(this$0, "You can not deselect the " + ((Object) holder.Q().getText()) + " Service", 1).show();
                return;
            }
            if (!this$0.G2().contains(holder.Q().getText().toString())) {
                this$0.G2().add(holder.Q().getText().toString());
            } else if (!Intrinsics.areEqual(this$0.getBioRecGenesis(), "S") || !Intrinsics.areEqual(this$0.getAllowAddrChangeAtDlservReqst(), "Y") || !Intrinsics.areEqual(holder.Q().getText(), this$0.B2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                this$0.G2().remove(holder.Q().getText().toString());
            } else if (holder.Q().getCurrentTextColor() == -1) {
                this$0.X3("0");
            } else {
                this$0.X3(VContant.MAINSCREEN);
            }
            if (!this$0.S2().contains(holder.Q().getText().toString())) {
                holder.O().setBackgroundResource(R.drawable.sign_in_new);
                holder.Q().setTextColor(-1);
                holder.P().setImageDrawable(null);
                this$1.E(mModel, holder);
                this$0.S2().add(holder.Q().getText().toString());
                if (Intrinsics.areEqual(holder.Q().getText().toString(), this$0.B2().b("check_dl_serv_dupl_dl", "Issue of Duplicate DL"))) {
                    this$0.R2().add("513");
                    return;
                }
                if (Intrinsics.areEqual(holder.Q().getText().toString(), this$0.B2().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                    this$0.R2().add("514");
                    return;
                }
                if (Intrinsics.areEqual(holder.Q().getText().toString(), this$0.B2().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                    this$0.R2().add("537");
                    return;
                }
                if (Intrinsics.areEqual(holder.Q().getText().toString(), this$0.B2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                    this$0.R2().add("515");
                    return;
                }
                if (Intrinsics.areEqual(holder.Q().getText().toString(), this$0.B2().b("check_dl_serv_replacement_dl", "Replacement of DL"))) {
                    this$0.R2().add("516");
                    return;
                }
                if (Intrinsics.areEqual(holder.Q().getText().toString(), this$0.B2().b("check_dl_serv_extract_dl", "DL Extract"))) {
                    this$0.R2().add("523");
                    return;
                }
                if (Intrinsics.areEqual(holder.Q().getText().toString(), this$0.B2().b("hill_region_title", "Endorsement to Drive in Hill Region"))) {
                    this$0.R2().add("524");
                    return;
                } else if (Intrinsics.areEqual(holder.Q().getText().toString(), this$0.B2().b("change_name_dl", "Change of Name in DL"))) {
                    this$0.R2().add("526");
                    return;
                } else {
                    if (Intrinsics.areEqual(holder.Q().getText().toString(), this$0.B2().b("change_birth_dl", "Change of Date of Birth in DL"))) {
                        this$0.R2().add("548");
                        return;
                    }
                    return;
                }
            }
            if (Intrinsics.areEqual(holder.Q().getText().toString(), this$0.B2().b("check_dl_serv_dupl_dl", "Issue of Duplicate DL"))) {
                this$0.R2().remove("513");
            } else if (Intrinsics.areEqual(holder.Q().getText().toString(), this$0.B2().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                this$0.R2().remove("514");
            } else if (Intrinsics.areEqual(holder.Q().getText().toString(), this$0.B2().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                this$0.R2().remove("537");
            } else if (Intrinsics.areEqual(holder.Q().getText().toString(), this$0.B2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                this$0.R2().remove("515");
            } else if (Intrinsics.areEqual(holder.Q().getText().toString(), this$0.B2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                this$0.R2().remove("516");
            } else if (Intrinsics.areEqual(holder.Q().getText().toString(), this$0.B2().b("check_dl_serv_extract_dl", "DL Extract"))) {
                this$0.R2().remove("523");
            } else if (Intrinsics.areEqual(holder.Q().getText().toString(), this$0.B2().b("hill_region_title", "Endorsement to Drive in Hill Region"))) {
                this$0.R2().remove("524");
            } else if (Intrinsics.areEqual(holder.Q().getText().toString(), this$0.B2().b("change_name_dl", "Change of Name in DL"))) {
                this$0.R2().remove("526");
            } else if (Intrinsics.areEqual(holder.Q().getText().toString(), this$0.B2().b("change_birth_dl", "Change of Date of Birth in DL"))) {
                this$0.R2().remove("548");
            }
            if (!Intrinsics.areEqual(this$0.getBioRecGenesis(), "S") || !Intrinsics.areEqual(this$0.getAllowAddrChangeAtDlservReqst(), "Y") || !CollectionsKt___CollectionsKt.contains(this$0.S2(), this$0.B2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                this$0.S2().remove(holder.Q().getText().toString());
                holder.O().setBackgroundResource(R.drawable.multi_serv_background);
                holder.Q().setTextColor(-16777216);
                holder.P().setImageDrawable(null);
                this$1.F(mModel, holder);
                return;
            }
            if (!Intrinsics.areEqual(holder.Q().getText().toString(), this$0.B2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                this$0.S2().remove(holder.Q().getText().toString());
                holder.O().setBackgroundResource(R.drawable.multi_serv_background);
                holder.Q().setTextColor(-16777216);
                holder.P().setImageDrawable(null);
                this$1.F(mModel, holder);
                return;
            }
            if (holder.Q().getCurrentTextColor() == -1) {
                holder.O().setBackgroundResource(R.drawable.multi_serv_background);
                holder.Q().setTextColor(-16777216);
                holder.P().setImageDrawable(null);
                this$1.F(mModel, holder);
                return;
            }
            holder.O().setBackgroundResource(R.drawable.sign_in_new);
            holder.Q().setTextColor(-1);
            holder.P().setImageDrawable(null);
            this$1.E(mModel, holder);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public void p(final C0047a holder, int i) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            Object obj = this.d.get(i);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            final String str = (String) obj;
            F(str, holder);
            holder.Q().setText(str);
            if (Intrinsics.areEqual(this.e.getMultiCheck(), holder.Q().getText())) {
                holder.O().setBackgroundResource(R.drawable.sign_in_new);
                holder.Q().setTextColor(-1);
                holder.P().setImageDrawable(null);
                if (Intrinsics.areEqual(this.e.getMultiCheck(), this.e.B2().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                    holder.P().setImageDrawable(this.e.L2().getResources().getDrawable(R.drawable.renmulti));
                    if (!CollectionsKt___CollectionsKt.contains(this.e.R2(), this.e.B2().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                        this.e.R2().add("514");
                    }
                    if (!CollectionsKt___CollectionsKt.contains(this.e.S2(), this.e.B2().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                        ArrayList arrayListS2 = this.e.S2();
                        String strB = this.e.B2().b("check_dl_serv_renewal_dl", "Renewal of DL");
                        Intrinsics.checkNotNull(strB);
                        arrayListS2.add(strB);
                        ArrayList arrayListG2 = this.e.G2();
                        String strB2 = this.e.B2().b("check_dl_serv_renewal_dl", "Renewal of DL");
                        Intrinsics.checkNotNull(strB2);
                        arrayListG2.add(strB2);
                    }
                }
                if (Intrinsics.areEqual(this.e.getMultiCheck(), this.e.B2().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                    holder.P().setImageDrawable(this.e.L2().getResources().getDrawable(R.drawable.iclearnermulti));
                    if (!CollectionsKt___CollectionsKt.contains(this.e.R2(), this.e.B2().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                        this.e.R2().add("537");
                    }
                    if (!CollectionsKt___CollectionsKt.contains(this.e.S2(), this.e.B2().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                        ArrayList arrayListS22 = this.e.S2();
                        String strB3 = this.e.B2().b("revalidtion_expired_dl", "Re-Validation of Expired DL");
                        Intrinsics.checkNotNull(strB3);
                        arrayListS22.add(strB3);
                        ArrayList arrayListG22 = this.e.G2();
                        String strB4 = this.e.B2().b("revalidtion_expired_dl", "Re-Validation of Expired DL");
                        Intrinsics.checkNotNull(strB4);
                        arrayListG22.add(strB4);
                    }
                }
            }
            if (Intrinsics.areEqual(this.e.getState_value(), "differ") && Intrinsics.areEqual(holder.Q().getText(), this.e.B2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                this.e.Q3(true);
                this.e.S2().add(str);
                this.e.G2().add(str);
                holder.O().setBackgroundResource(R.drawable.sign_in_new);
                holder.Q().setTextColor(-1);
                holder.P().setImageDrawable(null);
                if (!CollectionsKt___CollectionsKt.contains(this.e.R2(), this.e.B2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                    this.e.R2().add("515");
                }
                E(str, holder);
            }
            if (Intrinsics.areEqual(this.e.getBioRecGenesis(), "S") && Intrinsics.areEqual(this.e.getAllowAddrChangeAtDlservReqst(), "Y") && Intrinsics.areEqual(holder.Q().getText(), this.e.B2().b("check_dl_serv_change_addr", "Change of Address in DL")) && !this.e.getCOA()) {
                ArrayList arrayListS23 = this.e.S2();
                String strB5 = this.e.B2().b("check_dl_serv_change_addr", "Change of Address in DL");
                Intrinsics.checkNotNull(strB5);
                arrayListS23.add(strB5);
                ArrayList arrayListG23 = this.e.G2();
                String strB6 = this.e.B2().b("check_dl_serv_change_addr", "Change of Address in DL");
                Intrinsics.checkNotNull(strB6);
                arrayListG23.add(strB6);
                this.e.X3("0");
            }
            LinearLayout linearLayoutO = holder.O();
            final SarthiProcessWithAdhar sarthiProcessWithAdhar = this.e;
            linearLayoutO.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ok5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SarthiProcessWithAdhar.a.C(sarthiProcessWithAdhar, holder, this, str, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public C0047a r(ViewGroup parent, int i) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.multi_service, parent, false);
            Intrinsics.checkNotNull(viewInflate);
            return new C0047a(this, viewInflate);
        }

        public final void E(String str, C0047a c0047a) {
            if (Intrinsics.areEqual(str, this.e.B2().b("check_dl_serv_change_addr", "Issue of Duplicate DL"))) {
                c0047a.P().setImageDrawable(this.e.L2().getResources().getDrawable(R.drawable.icdlmulti));
                return;
            }
            if (Intrinsics.areEqual(str, this.e.B2().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                c0047a.P().setImageDrawable(this.e.L2().getResources().getDrawable(R.drawable.renmulti));
                return;
            }
            if (Intrinsics.areEqual(str, this.e.B2().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                c0047a.P().setImageDrawable(this.e.L2().getResources().getDrawable(R.drawable.iclearnermulti));
                return;
            }
            if (Intrinsics.areEqual(str, this.e.B2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                c0047a.P().setImageDrawable(this.e.L2().getResources().getDrawable(R.drawable.coamulti));
                return;
            }
            if (Intrinsics.areEqual(str, this.e.B2().b("check_dl_serv_replacement_dl", "Replacement of DL"))) {
                c0047a.P().setImageDrawable(this.e.L2().getResources().getDrawable(R.drawable.icrepmulti));
                return;
            }
            if (Intrinsics.areEqual(str, this.e.B2().b("check_dl_serv_extract_dl", "DL Extract"))) {
                c0047a.P().setImageDrawable(this.e.L2().getResources().getDrawable(R.drawable.icrepmulti));
                return;
            }
            if (Intrinsics.areEqual(str, this.e.B2().b("hill_region_title", "Endorsement to Drive in Hill Region"))) {
                c0047a.P().setImageDrawable(this.e.L2().getResources().getDrawable(R.drawable.endormulti));
            } else if (Intrinsics.areEqual(str, this.e.B2().b("change_name_dl", "Change of Name in DL"))) {
                c0047a.P().setImageDrawable(this.e.L2().getResources().getDrawable(R.drawable.iclearnermulti));
            } else if (Intrinsics.areEqual(str, this.e.B2().b("change_birth_dl", "Change of Date of Birth in DL"))) {
                c0047a.P().setImageDrawable(this.e.L2().getResources().getDrawable(R.drawable.dobmulti));
            }
        }

        public final void F(String str, C0047a c0047a) {
            if (Intrinsics.areEqual(str, this.e.B2().b("check_dl_serv_dupl_dl", "Issue of Duplicate DL"))) {
                c0047a.P().setImageDrawable(this.e.L2().getResources().getDrawable(R.drawable.ic_newdriving));
                return;
            }
            if (Intrinsics.areEqual(str, this.e.B2().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                c0047a.P().setImageDrawable(this.e.L2().getResources().getDrawable(R.drawable.ic_learnerr));
                return;
            }
            if (Intrinsics.areEqual(str, this.e.B2().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                c0047a.P().setImageDrawable(this.e.L2().getResources().getDrawable(R.drawable.ic_learnerr));
                return;
            }
            if (Intrinsics.areEqual(str, this.e.B2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                c0047a.P().setImageDrawable(this.e.L2().getResources().getDrawable(R.drawable.mvvm_ic_addres));
                return;
            }
            if (Intrinsics.areEqual(str, this.e.B2().b("check_dl_serv_replacement_dl", "Replacement of DL"))) {
                c0047a.P().setImageDrawable(this.e.L2().getResources().getDrawable(R.drawable.ic_exxtract));
                return;
            }
            if (Intrinsics.areEqual(str, this.e.B2().b("check_dl_serv_extract_dl", "DL Extract"))) {
                c0047a.P().setImageDrawable(this.e.L2().getResources().getDrawable(R.drawable.mvvm_ic_addres));
                return;
            }
            if (Intrinsics.areEqual(str, this.e.B2().b("hill_region_title", "Endorsement to Drive in Hill Region"))) {
                c0047a.P().setImageDrawable(this.e.L2().getResources().getDrawable(R.drawable.endorsedl));
            } else if (Intrinsics.areEqual(str, this.e.B2().b("change_name_dl", "Change of Name in DL"))) {
                c0047a.P().setImageDrawable(this.e.L2().getResources().getDrawable(R.drawable.coname));
            } else if (Intrinsics.areEqual(str, this.e.B2().b("change_birth_dl", "Change of Date of Birth in DL"))) {
                c0047a.P().setImageDrawable(this.e.L2().getResources().getDrawable(R.drawable.codob));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int e() {
            return this.d.size();
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void a(OtpAdharRes otpAdharRes) {
            SarthiProcessWithAdhar.this.U2().cancel();
            try {
                if (StringsKt__StringsJVMKt.equals(otpAdharRes.getStatus(), "Success", true)) {
                    SarthiProcessWithAdhar.this.v4(StringsKt__StringsKt.trim((CharSequence) otpAdharRes.getTxnNo()).toString());
                    SarthiProcessWithAdhar sarthiProcessWithAdhar = SarthiProcessWithAdhar.this;
                    sarthiProcessWithAdhar.x4(sarthiProcessWithAdhar, otpAdharRes.getDOAuthOTP().getLast_four_mobile());
                } else {
                    SarthiProcessWithAdhar sarthiProcessWithAdhar2 = SarthiProcessWithAdhar.this;
                    sarthiProcessWithAdhar2.E3(sarthiProcessWithAdhar2, "Unable to process the request, Please try after some time");
                }
            } catch (Exception unused) {
                SarthiProcessWithAdhar sarthiProcessWithAdhar3 = SarthiProcessWithAdhar.this;
                sarthiProcessWithAdhar3.E3(sarthiProcessWithAdhar3, "Unable to process the request, Please try after some time");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((OtpAdharRes) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void invoke(String str) {
            SarthiProcessWithAdhar.this.U2().cancel();
            SarthiProcessWithAdhar sarthiProcessWithAdhar = SarthiProcessWithAdhar.this;
            sarthiProcessWithAdhar.E3(sarthiProcessWithAdhar, "Unable to process the request, Please try after some time");
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
            super(1);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void a(UserFullDetails userFullDetails) {
            try {
                Log.d("userDetails_api", userFullDetails.toString());
                if (!StringsKt__StringsJVMKt.equals(userFullDetails.getStatus(), "Y", true)) {
                    SarthiProcessWithAdhar.this.U2().dismiss();
                    SarthiProcessWithAdhar sarthiProcessWithAdhar = SarthiProcessWithAdhar.this;
                    sarthiProcessWithAdhar.E3(sarthiProcessWithAdhar, "Unable to proceed your request, Please try after some time");
                    return;
                }
                SarthiProcessWithAdhar.this.adharData = userFullDetails.getDOEkyc();
                String house = userFullDetails.getDOEkyc().getHouse() != null ? userFullDetails.getDOEkyc().getHouse() : "NA";
                String landMark = userFullDetails.getDOEkyc().getLandMark() != null ? userFullDetails.getDOEkyc().getLandMark() : "NA";
                String localityIfAny = userFullDetails.getDOEkyc().getLocalityIfAny() != null ? userFullDetails.getDOEkyc().getLocalityIfAny() : "NA";
                String name = userFullDetails.getDOEkyc().getName() != null ? userFullDetails.getDOEkyc().getName() : "NA";
                userFullDetails.getDOEkyc().getPhone();
                String strValueOf = String.valueOf(userFullDetails.getDOEkyc().getPhone());
                if (userFullDetails.getDOEkyc().getPht() != null) {
                    SarthiProcessWithAdhar.this.V3(userFullDetails.getDOEkyc().getPht());
                }
                String pincode = userFullDetails.getDOEkyc().getPincode() != null ? userFullDetails.getDOEkyc().getPincode() : "NA";
                String state = userFullDetails.getDOEkyc().getState() != null ? userFullDetails.getDOEkyc().getState() : "NA";
                String street = userFullDetails.getDOEkyc().getStreet() != null ? userFullDetails.getDOEkyc().getStreet() : "NA";
                String status = userFullDetails.getDOEkyc().getStatus() != null ? userFullDetails.getDOEkyc().getStatus() : "NA";
                String villageTownCity = userFullDetails.getDOEkyc().getVillageTownCity() != null ? userFullDetails.getDOEkyc().getVillageTownCity() : "NA";
                String xmlUID = userFullDetails.getDOEkyc().getXmlUID() != null ? userFullDetails.getDOEkyc().getXmlUID() : "NA";
                if (userFullDetails.getDOEkyc().getGender() != null && StringsKt__StringsJVMKt.equals(userFullDetails.getDOEkyc().getGender(), "M", true)) {
                    SarthiProcessWithAdhar.this.T3("M");
                }
                if (Intrinsics.areEqual(SarthiProcessWithAdhar.this.Z2().b(), VContant.MAINSCREEN)) {
                    SarthiProcessWithAdhar.this.t4(514);
                } else if (Intrinsics.areEqual(SarthiProcessWithAdhar.this.Z2().b(), VContant.APPLICATION_SCREEN)) {
                    SarthiProcessWithAdhar.this.t4(513);
                } else if (Intrinsics.areEqual(SarthiProcessWithAdhar.this.Z2().b(), "3")) {
                    SarthiProcessWithAdhar.this.t4(515);
                } else if (Intrinsics.areEqual(SarthiProcessWithAdhar.this.Z2().b(), "4")) {
                    SarthiProcessWithAdhar.this.t4(525);
                } else if (Intrinsics.areEqual(SarthiProcessWithAdhar.this.Z2().b(), VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE)) {
                    SarthiProcessWithAdhar.this.t4(523);
                } else if (Intrinsics.areEqual(SarthiProcessWithAdhar.this.Z2().b(), VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE)) {
                    SarthiProcessWithAdhar.this.t4(516);
                } else {
                    SarthiProcessWithAdhar sarthiProcessWithAdhar2 = SarthiProcessWithAdhar.this;
                    sarthiProcessWithAdhar2.t4(Integer.parseInt(sarthiProcessWithAdhar2.Z2().b()));
                }
                ll llVarJ2 = SarthiProcessWithAdhar.this.J2();
                String string = StringsKt__StringsKt.trim((CharSequence) SarthiProcessWithAdhar.this.q2().g.getText().toString()).toString();
                String string2 = StringsKt__StringsKt.trim((CharSequence) userFullDetails.getDOEkyc().getCareOf()).toString();
                String dist = userFullDetails.getDOEkyc().getDist();
                String dob = userFullDetails.getDOEkyc().getDob();
                String gender = userFullDetails.getDOEkyc().getGender();
                String ePhoto = SarthiProcessWithAdhar.this.getEPhoto();
                String dlNo = SarthiProcessWithAdhar.this.getDlNo();
                Intrinsics.checkNotNull(dlNo);
                String bioFullName = SarthiProcessWithAdhar.this.t2().getBioObj().getBioFullName();
                SarthiProcessWithAdhar sarthiProcessWithAdhar3 = SarthiProcessWithAdhar.this;
                String strN2 = sarthiProcessWithAdhar3.n2(sarthiProcessWithAdhar3.t2().getBioObj().getBioDob());
                Intrinsics.checkNotNull(strN2);
                String bioSwdFullName = SarthiProcessWithAdhar.this.t2().getBioObj().getBioSwdFullName();
                int serviceCode = SarthiProcessWithAdhar.this.getServiceCode();
                String txnNo = SarthiProcessWithAdhar.this.getTxnNo();
                Intrinsics.checkNotNull(txnNo);
                llVarJ2.q(string, string2, "NA", dist, dob, gender, house, landMark, localityIfAny, name, strValueOf, ePhoto, pincode, state, status, street, villageTownCity, xmlUID, dlNo, bioFullName, strN2, bioSwdFullName, serviceCode, "Y", txnNo, StringsKt__StringsKt.trim((CharSequence) SarthiProcessWithAdhar.this.q2().g.getText().toString()).toString(), SarthiProcessWithAdhar.this.getLastEndorseStateCode());
            } catch (Exception unused) {
                SarthiProcessWithAdhar.this.U2().dismiss();
                SarthiProcessWithAdhar sarthiProcessWithAdhar4 = SarthiProcessWithAdhar.this;
                sarthiProcessWithAdhar4.E3(sarthiProcessWithAdhar4, "Unable to proceed your request, Please try after some time");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((UserFullDetails) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void invoke(String str) {
            SarthiProcessWithAdhar.this.U2().dismiss();
            SarthiProcessWithAdhar sarthiProcessWithAdhar = SarthiProcessWithAdhar.this;
            sarthiProcessWithAdhar.E3(sarthiProcessWithAdhar, "Unable to proceed your request, Please try after some time");
        }
    }

    public static final class f extends Lambda implements Function1 {
        public f() {
            super(1);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void a(SubmitAdharApi submitAdharApi) {
            SarthiProcessWithAdhar.this.U2().dismiss();
            try {
                Log.e("adhResp_submit", submitAdharApi.toString());
                if (StringsKt__StringsJVMKt.equals(submitAdharApi.getStatusCode(), "EKYC001", true)) {
                    SarthiProcessWithAdhar.this.U3(StringsKt__StringsKt.trim((CharSequence) String.valueOf(submitAdharApi.getEkycId())).toString());
                    SarthiProcessWithAdhar sarthiProcessWithAdhar = SarthiProcessWithAdhar.this;
                    sarthiProcessWithAdhar.G3(sarthiProcessWithAdhar.getEKYCId());
                } else {
                    SarthiProcessWithAdhar sarthiProcessWithAdhar2 = SarthiProcessWithAdhar.this;
                    sarthiProcessWithAdhar2.E3(sarthiProcessWithAdhar2, submitAdharApi.getStatusDesc());
                }
            } catch (Exception unused) {
                SarthiProcessWithAdhar.this.Z2().q("NA", "N", "NA", "NA");
                SarthiProcessWithAdhar sarthiProcessWithAdhar3 = SarthiProcessWithAdhar.this;
                sarthiProcessWithAdhar3.E3(sarthiProcessWithAdhar3, sarthiProcessWithAdhar3.B2().b("service_is_not_present", SarthiProcessWithAdhar.this.getString(R.string.unable_to_get_details)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SubmitAdharApi) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class g extends Lambda implements Function1 {
        public g() {
            super(1);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void a(AadarkycVerify.Response response) {
            AadarkycVerify.dOEkyc dOAuthOTP;
            String last_four_mobile;
            Log.e("adhResp_kyc", response.toString());
            SarthiProcessWithAdhar.this.U2().dismiss();
            AadarkycVerify.DoAadhaarResponse doAadhaarResponse = response.getDoAadhaarResponse();
            if (String.valueOf(doAadhaarResponse != null ? doAadhaarResponse.getStatus() : null).length() == 0) {
                return;
            }
            try {
                Log.e("CCTVlOGE", VContant.MAINSCREEN);
                if (doAadhaarResponse != null && (dOAuthOTP = doAadhaarResponse.getDOAuthOTP()) != null && Intrinsics.areEqual(dOAuthOTP.getMobileverify(), Boolean.TRUE)) {
                    AadarkycVerify.dOEkyc dOAuthOTP2 = doAadhaarResponse.getDOAuthOTP();
                    String last_four_mobile2 = dOAuthOTP2 != null ? dOAuthOTP2.getLast_four_mobile() : null;
                    if (last_four_mobile2 != null && last_four_mobile2.length() != 0) {
                        AadarkycVerify.dOEkyc dOAuthOTP3 = doAadhaarResponse.getDOAuthOTP();
                        if (StringsKt__StringsJVMKt.equals(dOAuthOTP3 != null ? dOAuthOTP3.getStatus() : null, "success", true)) {
                            Log.e("CCTVlOGE", VContant.APPLICATION_SCREEN);
                            AadarkycVerify.dOEkyc dOAuthOTP4 = doAadhaarResponse.getDOAuthOTP();
                            if (dOAuthOTP4 == null || (last_four_mobile = dOAuthOTP4.getLast_four_mobile()) == null || last_four_mobile.length() != 4) {
                                return;
                            }
                            SarthiProcessWithAdhar.this.v4(String.valueOf(doAadhaarResponse.getTxnNo()));
                            String txnNo = SarthiProcessWithAdhar.this.getTxnNo();
                            Intrinsics.checkNotNull(txnNo);
                            Log.d("txnNo", txnNo);
                            SarthiProcessWithAdhar sarthiProcessWithAdhar = SarthiProcessWithAdhar.this;
                            AadarkycVerify.dOEkyc dOAuthOTP5 = doAadhaarResponse.getDOAuthOTP();
                            sarthiProcessWithAdhar.x4(sarthiProcessWithAdhar, String.valueOf(dOAuthOTP5 != null ? dOAuthOTP5.getLast_four_mobile() : null));
                            return;
                        }
                    }
                }
                Log.e("CCTVlOGE", "3");
                String reason = doAadhaarResponse != null ? doAadhaarResponse.getReason() : null;
                if (reason != null && reason.length() != 0) {
                    Log.v("reason fail", String.valueOf(doAadhaarResponse != null ? doAadhaarResponse.getReason() : null));
                    if (StringsKt__StringsJVMKt.equals(String.valueOf(doAadhaarResponse != null ? doAadhaarResponse.getReason() : null), "Invalid Auth Xml Format.", true)) {
                        SarthiProcessWithAdhar sarthiProcessWithAdhar2 = SarthiProcessWithAdhar.this;
                        sarthiProcessWithAdhar2.E3(sarthiProcessWithAdhar2, "Invalid Aadhaar No.\nPlease try again");
                        return;
                    } else {
                        SarthiProcessWithAdhar sarthiProcessWithAdhar3 = SarthiProcessWithAdhar.this;
                        sarthiProcessWithAdhar3.E3(sarthiProcessWithAdhar3, String.valueOf(doAadhaarResponse != null ? doAadhaarResponse.getReason() : null));
                        return;
                    }
                }
                SarthiProcessWithAdhar sarthiProcessWithAdhar4 = SarthiProcessWithAdhar.this;
                sarthiProcessWithAdhar4.E3(sarthiProcessWithAdhar4, sarthiProcessWithAdhar4.B2().b("service_is_not_present", SarthiProcessWithAdhar.this.getString(R.string.unable_to_get_details)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AadarkycVerify.Response) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class h extends Lambda implements Function1 {
        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            Log.e("adhResp_kyc_err", str.toString());
            SarthiProcessWithAdhar.this.U2().dismiss();
        }
    }

    public static final class i extends Lambda implements Function1 {
        public i() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(com.nic.mparivahan.VahanEkyc.Aadarkyc.Response r33) {
            /*
                Method dump skipped, instruction units count: 1042
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar.i.a(com.nic.mparivahan.VahanEkyc.Aadarkyc$Response):void");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Aadarkyc.Response) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class j extends Lambda implements Function1 {
        public j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            SarthiProcessWithAdhar.this.U2().dismiss();
        }
    }

    public static final class k extends Lambda implements Function1 {
        public k() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r19v0 */
        /* JADX WARN: Type inference failed for: r19v1 */
        /* JADX WARN: Type inference failed for: r19v2 */
        /* JADX WARN: Type inference failed for: r19v3 */
        /* JADX WARN: Type inference failed for: r1v160, types: [android.content.Context, com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar] */
        /* JADX WARN: Type inference failed for: r1v2, types: [com.zepto.wl5] */
        /* JADX WARN: Type inference failed for: r1v3, types: [android.content.Context, com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar] */
        /* JADX WARN: Type inference failed for: r1v5, types: [com.zepto.wl5] */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v6 */
        /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v70 */
        /* JADX WARN: Type inference failed for: r2v71 */
        /* JADX WARN: Type inference failed for: r2v72 */
        /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r8v1 */
        /* JADX WARN: Type inference failed for: r8v10 */
        /* JADX WARN: Type inference failed for: r8v11 */
        /* JADX WARN: Type inference failed for: r8v12 */
        /* JADX WARN: Type inference failed for: r8v13 */
        /* JADX WARN: Type inference failed for: r8v14 */
        /* JADX WARN: Type inference failed for: r8v15 */
        /* JADX WARN: Type inference failed for: r8v16 */
        /* JADX WARN: Type inference failed for: r8v17 */
        /* JADX WARN: Type inference failed for: r8v18 */
        /* JADX WARN: Type inference failed for: r8v19 */
        /* JADX WARN: Type inference failed for: r8v2 */
        /* JADX WARN: Type inference failed for: r8v20 */
        /* JADX WARN: Type inference failed for: r8v21 */
        /* JADX WARN: Type inference failed for: r8v3 */
        /* JADX WARN: Type inference failed for: r8v4 */
        /* JADX WARN: Type inference failed for: r8v5 */
        /* JADX WARN: Type inference failed for: r8v6 */
        /* JADX WARN: Type inference failed for: r8v7 */
        /* JADX WARN: Type inference failed for: r8v8 */
        /* JADX WARN: Type inference failed for: r8v9 */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void a(SubmitAdharApi submitAdharApi) {
            ?? r19;
            String str;
            ?? r2 = "524";
            String str2 = "548";
            ?? r8 = "N";
            String str3 = "NA";
            SarthiProcessWithAdhar.this.U2().dismiss();
            try {
                Log.e("adhResp_submit", submitAdharApi.toString());
                try {
                    if (StringsKt__StringsJVMKt.equals(submitAdharApi.getStatusCode(), "EKYC001", true)) {
                        try {
                            SarthiProcessWithAdhar.this.U3(StringsKt__StringsKt.trim((CharSequence) String.valueOf(submitAdharApi.getEkycId())).toString());
                            if (Intrinsics.areEqual(SarthiProcessWithAdhar.this.Z2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                                SarthiProcessWithAdhar.this.H3();
                            } else {
                                str = "NA";
                                try {
                                    str3 = "S";
                                    if (StringsKt__StringsJVMKt.equals$default((String) SarthiProcessWithAdhar.this.getWhatServiceRequired().get("537"), "Re-Validation of Expired DL", false, 2, null)) {
                                        if (Intrinsics.areEqual(SarthiProcessWithAdhar.this.getEKYCGender(), StringsKt__StringsKt.trim((CharSequence) "M").toString())) {
                                            SarthiProcessWithAdhar.this.Z2().q(SarthiProcessWithAdhar.this.getEKYCId(), "Y", VContant.MAINSCREEN, SarthiProcessWithAdhar.this.getEPhoto());
                                        } else {
                                            SarthiProcessWithAdhar.this.Z2().q(SarthiProcessWithAdhar.this.getEKYCId(), "Y", VContant.APPLICATION_SCREEN, SarthiProcessWithAdhar.this.getEPhoto());
                                        }
                                        SarthiProcessWithAdhar.this.setIntent(new Intent(SarthiProcessWithAdhar.this, (Class<?>) RenewalOfDLActivity.class));
                                        SarthiProcessWithAdhar.this.getIntent().putExtra("DL", SarthiProcessWithAdhar.this.getDlNo());
                                        SarthiProcessWithAdhar.this.getIntent().putExtra("dob", SarthiProcessWithAdhar.this.getDob());
                                        SarthiProcessWithAdhar.this.getIntent().putExtra("DLDetails", SarthiProcessWithAdhar.this.t2());
                                        SarthiProcessWithAdhar.this.getIntent().putExtra("Mobile_no", SarthiProcessWithAdhar.this.b3().l());
                                        SarthiProcessWithAdhar.this.getIntent().putExtra("lastEndorsedRTO", SarthiProcessWithAdhar.this.getLastEndorsedRTO());
                                        SarthiProcessWithAdhar.this.getIntent().putExtra("lastEndorsedState", SarthiProcessWithAdhar.this.getLastEndorsedState());
                                        SarthiProcessWithAdhar.this.getIntent().putExtra("lastEndorsedRTOCode", SarthiProcessWithAdhar.this.getLastEndorseRtoCode());
                                        SarthiProcessWithAdhar.this.getIntent().putExtra("lastEndorseStateCode", SarthiProcessWithAdhar.this.getLastEndorseStateCode());
                                        SarthiProcessWithAdhar.this.getIntent().putExtra("whatServiceRequired", SarthiProcessWithAdhar.this.getWhatServiceRequired());
                                        SarthiProcessWithAdhar.this.getIntent().putExtra("state_value", "same");
                                        SarthiProcessWithAdhar.this.getIntent().putExtra("purCode", "537");
                                        SarthiProcessWithAdhar.this.getIntent().putExtra("bioRecGenesis", "S");
                                        SarthiProcessWithAdhar.this.getIntent().putExtra("allowAddrChangeAtDlservReqst", "N");
                                        SarthiProcessWithAdhar.this.getIntent().putExtra("eKYCId", SarthiProcessWithAdhar.this.getEKYCId());
                                        SarthiProcessWithAdhar.this.getIntent().putExtra("eKYCOpted", "Y");
                                        SarthiProcessWithAdhar.this.getIntent().putExtra("eKYCGender", SarthiProcessWithAdhar.this.getEKYCGender());
                                        SarthiProcessWithAdhar.this.getIntent().putExtra("eKYCapplicantPhoto", SarthiProcessWithAdhar.this.getEPhoto());
                                        SarthiProcessWithAdhar sarthiProcessWithAdhar = SarthiProcessWithAdhar.this;
                                        sarthiProcessWithAdhar.startActivity(sarthiProcessWithAdhar.getIntent());
                                        SarthiProcessWithAdhar.this.finish();
                                    } else {
                                        r19 = "N";
                                        r8 = 0;
                                        try {
                                            if (StringsKt__StringsJVMKt.equals$default((String) SarthiProcessWithAdhar.this.getWhatServiceRequired().get("526"), "Change of Name in DL", false, 2, null)) {
                                                SarthiProcessWithAdhar.this.setIntent(new Intent(SarthiProcessWithAdhar.this, (Class<?>) ChangeOfName.class));
                                                SarthiProcessWithAdhar sarthiProcessWithAdhar2 = SarthiProcessWithAdhar.this;
                                                Intent intent = sarthiProcessWithAdhar2.getIntent();
                                                Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                                                sarthiProcessWithAdhar2.g3(intent, SarthiProcessWithAdhar.this.getLastEndorsedRTO(), SarthiProcessWithAdhar.this.getLastEndorsedState(), "526");
                                                SarthiProcessWithAdhar.this.finish();
                                            } else {
                                                r8 = 0;
                                                if (StringsKt__StringsJVMKt.equals$default((String) SarthiProcessWithAdhar.this.getWhatServiceRequired().get("548"), "Change of Date of Birth in DL", false, 2, null)) {
                                                    SarthiProcessWithAdhar.this.setIntent(new Intent(SarthiProcessWithAdhar.this, (Class<?>) DobChangeActivity.class));
                                                    SarthiProcessWithAdhar sarthiProcessWithAdhar3 = SarthiProcessWithAdhar.this;
                                                    Intent intent2 = sarthiProcessWithAdhar3.getIntent();
                                                    Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
                                                    sarthiProcessWithAdhar3.g3(intent2, SarthiProcessWithAdhar.this.getLastEndorsedRTO(), SarthiProcessWithAdhar.this.getLastEndorsedState(), "548");
                                                    SarthiProcessWithAdhar.this.finish();
                                                } else {
                                                    r8 = 2;
                                                    if (StringsKt__StringsJVMKt.equals$default((String) SarthiProcessWithAdhar.this.getWhatServiceRequired().get("524"), "Endorsement to Drive in Hill Region", false, 2, null)) {
                                                        SarthiProcessWithAdhar.this.setIntent(new Intent(SarthiProcessWithAdhar.this, (Class<?>) HillReligion.class));
                                                        SarthiProcessWithAdhar sarthiProcessWithAdhar4 = SarthiProcessWithAdhar.this;
                                                        Intent intent3 = sarthiProcessWithAdhar4.getIntent();
                                                        Intrinsics.checkNotNullExpressionValue(intent3, "getIntent(...)");
                                                        sarthiProcessWithAdhar4.g3(intent3, SarthiProcessWithAdhar.this.getLastEndorsedRTO(), SarthiProcessWithAdhar.this.getLastEndorsedState(), "524");
                                                        SarthiProcessWithAdhar.this.finish();
                                                    } else {
                                                        r8 = 0;
                                                        r8 = 0;
                                                        r8 = 0;
                                                        if (!StringsKt__StringsJVMKt.equals$default((String) SarthiProcessWithAdhar.this.getWhatServiceRequired().get("514"), "Renewal of DL", false, 2, null)) {
                                                            r8 = 2;
                                                            if (StringsKt__StringsJVMKt.equals$default((String) SarthiProcessWithAdhar.this.getWhatServiceRequired().get("515"), "Change of Address in DL", false, 2, null)) {
                                                                SarthiProcessWithAdhar.this.setIntent(new Intent(SarthiProcessWithAdhar.this, (Class<?>) ChangeOfAddressActivity.class));
                                                                SarthiProcessWithAdhar sarthiProcessWithAdhar5 = SarthiProcessWithAdhar.this;
                                                                Intent intent4 = sarthiProcessWithAdhar5.getIntent();
                                                                Intrinsics.checkNotNullExpressionValue(intent4, "getIntent(...)");
                                                                sarthiProcessWithAdhar5.g3(intent4, SarthiProcessWithAdhar.this.getLastEndorsedRTO(), SarthiProcessWithAdhar.this.getLastEndorsedState(), "515");
                                                                SarthiProcessWithAdhar.this.finish();
                                                            } else {
                                                                r8 = 0;
                                                                r8 = 0;
                                                                r8 = 0;
                                                                if (!StringsKt__StringsJVMKt.equals$default((String) SarthiProcessWithAdhar.this.getWhatServiceRequired().get("513"), "Issue of Duplicate DL", false, 2, null)) {
                                                                    r8 = 2;
                                                                    r8 = 2;
                                                                    r8 = 2;
                                                                    if (!StringsKt__StringsJVMKt.equals$default((String) SarthiProcessWithAdhar.this.getWhatServiceRequired().get("516"), "Replacement of DL", false, 2, null)) {
                                                                        r8 = 0;
                                                                        r8 = 0;
                                                                        if (!StringsKt__StringsJVMKt.equals$default((String) SarthiProcessWithAdhar.this.getWhatServiceRequired().get("523"), "DL Extract", false, 2, null)) {
                                                                            r8 = 0;
                                                                            r8 = 0;
                                                                            r8 = 0;
                                                                            if (!StringsKt__StringsJVMKt.equals$default((String) SarthiProcessWithAdhar.this.getWhatServiceRequired().get("525"), "International Driving Permit", false, 2, null)) {
                                                                                SarthiProcessWithAdhar sarthiProcessWithAdhar6 = SarthiProcessWithAdhar.this;
                                                                                sarthiProcessWithAdhar6.u1(sarthiProcessWithAdhar6.B2().b("service_is_not_present", SarthiProcessWithAdhar.this.getString(R.string.unable_to_get_details)), SarthiProcessWithAdhar.this.q2().b());
                                                                            } else if (StringsKt__StringsJVMKt.equals(SarthiProcessWithAdhar.this.getBioRecGenesis(), "S", true) && StringsKt__StringsJVMKt.equals(SarthiProcessWithAdhar.this.getAllowAddrChangeAtDlservReqst(), "Y", true)) {
                                                                                SarthiProcessWithAdhar.this.setIntent(new Intent(SarthiProcessWithAdhar.this, (Class<?>) ChangeOfAddressActivity.class));
                                                                                SarthiProcessWithAdhar sarthiProcessWithAdhar7 = SarthiProcessWithAdhar.this;
                                                                                Intent intent5 = sarthiProcessWithAdhar7.getIntent();
                                                                                Intrinsics.checkNotNullExpressionValue(intent5, "getIntent(...)");
                                                                                sarthiProcessWithAdhar7.g3(intent5, SarthiProcessWithAdhar.this.getLastEndorsedRTO(), SarthiProcessWithAdhar.this.getLastEndorsedState(), "525");
                                                                                SarthiProcessWithAdhar.this.finish();
                                                                            } else {
                                                                                SarthiProcessWithAdhar.this.setIntent(new Intent(SarthiProcessWithAdhar.this, (Class<?>) DLIdpActivity.class));
                                                                                SarthiProcessWithAdhar sarthiProcessWithAdhar8 = SarthiProcessWithAdhar.this;
                                                                                Intent intent6 = sarthiProcessWithAdhar8.getIntent();
                                                                                Intrinsics.checkNotNullExpressionValue(intent6, "getIntent(...)");
                                                                                sarthiProcessWithAdhar8.g3(intent6, SarthiProcessWithAdhar.this.getLastEndorsedRTO(), SarthiProcessWithAdhar.this.getLastEndorsedState(), "525");
                                                                                SarthiProcessWithAdhar.this.finish();
                                                                            }
                                                                        } else if (StringsKt__StringsJVMKt.equals(SarthiProcessWithAdhar.this.getBioRecGenesis(), "S", true) && StringsKt__StringsJVMKt.equals(SarthiProcessWithAdhar.this.getAllowAddrChangeAtDlservReqst(), "Y", true)) {
                                                                            SarthiProcessWithAdhar.this.setIntent(new Intent(SarthiProcessWithAdhar.this, (Class<?>) ChangeOfAddressActivity.class));
                                                                            SarthiProcessWithAdhar sarthiProcessWithAdhar9 = SarthiProcessWithAdhar.this;
                                                                            Intent intent7 = sarthiProcessWithAdhar9.getIntent();
                                                                            Intrinsics.checkNotNullExpressionValue(intent7, "getIntent(...)");
                                                                            sarthiProcessWithAdhar9.g3(intent7, SarthiProcessWithAdhar.this.getLastEndorsedRTO(), SarthiProcessWithAdhar.this.getLastEndorsedState(), "523");
                                                                            SarthiProcessWithAdhar.this.finish();
                                                                        } else {
                                                                            SarthiProcessWithAdhar.this.setIntent(new Intent(SarthiProcessWithAdhar.this, (Class<?>) DLExtractActivity.class));
                                                                            SarthiProcessWithAdhar sarthiProcessWithAdhar10 = SarthiProcessWithAdhar.this;
                                                                            Intent intent8 = sarthiProcessWithAdhar10.getIntent();
                                                                            Intrinsics.checkNotNullExpressionValue(intent8, "getIntent(...)");
                                                                            sarthiProcessWithAdhar10.g3(intent8, SarthiProcessWithAdhar.this.getLastEndorsedRTO(), SarthiProcessWithAdhar.this.getLastEndorsedState(), "523");
                                                                            SarthiProcessWithAdhar.this.finish();
                                                                        }
                                                                    } else if (!StringsKt__StringsJVMKt.equals(SarthiProcessWithAdhar.this.getState_value(), "same", true)) {
                                                                        SarthiProcessWithAdhar.this.setIntent(new Intent(SarthiProcessWithAdhar.this, (Class<?>) ChangeOfAddressActivity.class));
                                                                        SarthiProcessWithAdhar sarthiProcessWithAdhar11 = SarthiProcessWithAdhar.this;
                                                                        Intent intent9 = sarthiProcessWithAdhar11.getIntent();
                                                                        Intrinsics.checkNotNullExpressionValue(intent9, "getIntent(...)");
                                                                        sarthiProcessWithAdhar11.g3(intent9, SarthiProcessWithAdhar.this.getLastEndorsedRTO(), SarthiProcessWithAdhar.this.getLastEndorsedState(), "516");
                                                                        SarthiProcessWithAdhar.this.finish();
                                                                    } else if (StringsKt__StringsJVMKt.equals(SarthiProcessWithAdhar.this.getBioRecGenesis(), "S", true) && StringsKt__StringsJVMKt.equals(SarthiProcessWithAdhar.this.getAllowAddrChangeAtDlservReqst(), "Y", true)) {
                                                                        SarthiProcessWithAdhar.this.setIntent(new Intent(SarthiProcessWithAdhar.this, (Class<?>) ChangeOfAddressActivity.class));
                                                                        SarthiProcessWithAdhar sarthiProcessWithAdhar12 = SarthiProcessWithAdhar.this;
                                                                        Intent intent10 = sarthiProcessWithAdhar12.getIntent();
                                                                        Intrinsics.checkNotNullExpressionValue(intent10, "getIntent(...)");
                                                                        sarthiProcessWithAdhar12.g3(intent10, SarthiProcessWithAdhar.this.getLastEndorsedRTO(), SarthiProcessWithAdhar.this.getLastEndorsedState(), "516");
                                                                        SarthiProcessWithAdhar.this.finish();
                                                                    } else {
                                                                        SarthiProcessWithAdhar.this.setIntent(new Intent(SarthiProcessWithAdhar.this, (Class<?>) DLReplecementActivity.class));
                                                                        SarthiProcessWithAdhar sarthiProcessWithAdhar13 = SarthiProcessWithAdhar.this;
                                                                        Intent intent11 = sarthiProcessWithAdhar13.getIntent();
                                                                        Intrinsics.checkNotNullExpressionValue(intent11, "getIntent(...)");
                                                                        sarthiProcessWithAdhar13.g3(intent11, SarthiProcessWithAdhar.this.getLastEndorsedRTO(), SarthiProcessWithAdhar.this.getLastEndorsedState(), "516");
                                                                        SarthiProcessWithAdhar.this.finish();
                                                                    }
                                                                } else if (!StringsKt__StringsJVMKt.equals(SarthiProcessWithAdhar.this.getState_value(), "same", true)) {
                                                                    SarthiProcessWithAdhar.this.setIntent(new Intent(SarthiProcessWithAdhar.this, (Class<?>) ChangeOfAddressActivity.class));
                                                                    SarthiProcessWithAdhar sarthiProcessWithAdhar14 = SarthiProcessWithAdhar.this;
                                                                    Intent intent12 = sarthiProcessWithAdhar14.getIntent();
                                                                    Intrinsics.checkNotNullExpressionValue(intent12, "getIntent(...)");
                                                                    sarthiProcessWithAdhar14.g3(intent12, SarthiProcessWithAdhar.this.getLastEndorsedRTO(), SarthiProcessWithAdhar.this.getLastEndorsedState(), "513");
                                                                    SarthiProcessWithAdhar.this.finish();
                                                                } else if (StringsKt__StringsJVMKt.equals(SarthiProcessWithAdhar.this.getBioRecGenesis(), "S", true) && StringsKt__StringsJVMKt.equals(SarthiProcessWithAdhar.this.getAllowAddrChangeAtDlservReqst(), "Y", true)) {
                                                                    SarthiProcessWithAdhar.this.setIntent(new Intent(SarthiProcessWithAdhar.this, (Class<?>) ChangeOfAddressActivity.class));
                                                                    SarthiProcessWithAdhar sarthiProcessWithAdhar15 = SarthiProcessWithAdhar.this;
                                                                    Intent intent13 = sarthiProcessWithAdhar15.getIntent();
                                                                    Intrinsics.checkNotNullExpressionValue(intent13, "getIntent(...)");
                                                                    sarthiProcessWithAdhar15.g3(intent13, SarthiProcessWithAdhar.this.getLastEndorsedRTO(), SarthiProcessWithAdhar.this.getLastEndorsedState(), "513");
                                                                    SarthiProcessWithAdhar.this.finish();
                                                                } else {
                                                                    SarthiProcessWithAdhar.this.setIntent(new Intent(SarthiProcessWithAdhar.this, (Class<?>) DLDuplicateActivity.class));
                                                                    SarthiProcessWithAdhar sarthiProcessWithAdhar16 = SarthiProcessWithAdhar.this;
                                                                    Intent intent14 = sarthiProcessWithAdhar16.getIntent();
                                                                    Intrinsics.checkNotNullExpressionValue(intent14, "getIntent(...)");
                                                                    sarthiProcessWithAdhar16.g3(intent14, SarthiProcessWithAdhar.this.getLastEndorsedRTO(), SarthiProcessWithAdhar.this.getLastEndorsedState(), "513");
                                                                    SarthiProcessWithAdhar.this.finish();
                                                                }
                                                            }
                                                        } else if (!StringsKt__StringsJVMKt.equals(SarthiProcessWithAdhar.this.getState_value(), "same", true)) {
                                                            SarthiProcessWithAdhar.this.setIntent(new Intent(SarthiProcessWithAdhar.this, (Class<?>) ChangeOfAddressActivity.class));
                                                            SarthiProcessWithAdhar sarthiProcessWithAdhar17 = SarthiProcessWithAdhar.this;
                                                            Intent intent15 = sarthiProcessWithAdhar17.getIntent();
                                                            Intrinsics.checkNotNullExpressionValue(intent15, "getIntent(...)");
                                                            sarthiProcessWithAdhar17.g3(intent15, SarthiProcessWithAdhar.this.getLastEndorsedRTO(), SarthiProcessWithAdhar.this.getLastEndorsedState(), "514");
                                                            SarthiProcessWithAdhar.this.finish();
                                                        } else if (StringsKt__StringsJVMKt.equals(SarthiProcessWithAdhar.this.getBioRecGenesis(), "S", true) && StringsKt__StringsJVMKt.equals(SarthiProcessWithAdhar.this.getAllowAddrChangeAtDlservReqst(), "Y", true)) {
                                                            SarthiProcessWithAdhar.this.setIntent(new Intent(SarthiProcessWithAdhar.this, (Class<?>) ChangeOfAddressActivity.class));
                                                            SarthiProcessWithAdhar sarthiProcessWithAdhar18 = SarthiProcessWithAdhar.this;
                                                            Intent intent16 = sarthiProcessWithAdhar18.getIntent();
                                                            Intrinsics.checkNotNullExpressionValue(intent16, "getIntent(...)");
                                                            sarthiProcessWithAdhar18.g3(intent16, SarthiProcessWithAdhar.this.getLastEndorsedRTO(), SarthiProcessWithAdhar.this.getLastEndorsedState(), "514");
                                                            SarthiProcessWithAdhar.this.finish();
                                                        } else {
                                                            SarthiProcessWithAdhar.this.setIntent(new Intent(SarthiProcessWithAdhar.this, (Class<?>) RenewalOfDLActivity.class));
                                                            SarthiProcessWithAdhar sarthiProcessWithAdhar19 = SarthiProcessWithAdhar.this;
                                                            Intent intent17 = sarthiProcessWithAdhar19.getIntent();
                                                            Intrinsics.checkNotNullExpressionValue(intent17, "getIntent(...)");
                                                            sarthiProcessWithAdhar19.g3(intent17, SarthiProcessWithAdhar.this.getLastEndorsedRTO(), SarthiProcessWithAdhar.this.getLastEndorsedState(), "514");
                                                            SarthiProcessWithAdhar.this.finish();
                                                        }
                                                    }
                                                }
                                            }
                                        } catch (Exception unused) {
                                            try {
                                                str2 = str;
                                                ?? r22 = r19;
                                                SarthiProcessWithAdhar.this.Z2().q(str2, r22, str2, str2);
                                                r2 = r22;
                                            } catch (Exception unused2) {
                                                str2 = str;
                                                r2 = r19;
                                                SarthiProcessWithAdhar.this.Z2().q(str2, r2, str2, str2);
                                                ?? r1 = SarthiProcessWithAdhar.this;
                                                r1.E3(r1, r1.B2().b("service_is_not_present", SarthiProcessWithAdhar.this.getString(R.string.unable_to_get_details)));
                                            }
                                        }
                                    }
                                } catch (Exception unused3) {
                                    r19 = "N";
                                }
                            }
                        } catch (Exception unused4) {
                            r19 = r8;
                            str = str3;
                        }
                    } else {
                        r2 = "N";
                        str2 = "NA";
                        ?? r12 = SarthiProcessWithAdhar.this;
                        r12.E3(r12, submitAdharApi.getStatusDesc());
                    }
                } catch (Exception unused5) {
                }
            } catch (Exception unused6) {
                r2 = "N";
                str2 = "NA";
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SubmitAdharApi) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class l extends Lambda implements Function1 {
        public l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void invoke(String str) {
            SarthiProcessWithAdhar.this.U2().dismiss();
            try {
                Log.e("adhResp_submit_err", str.toString());
                SarthiProcessWithAdhar sarthiProcessWithAdhar = SarthiProcessWithAdhar.this;
                sarthiProcessWithAdhar.E3(sarthiProcessWithAdhar, sarthiProcessWithAdhar.B2().b("service_is_not_present", SarthiProcessWithAdhar.this.getString(R.string.unable_to_get_details)));
            } catch (Exception unused) {
            }
        }
    }

    public static final class m implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public m(Function1 function) {
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

    public static final class n extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ TextView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(TextView textView, TextView textView2) {
            super(30000L, 1000L);
            this.a = textView;
            this.b = textView2;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.b.setVisibility(0);
            this.a.setText("0");
            this.a.setVisibility(8);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            this.a.setText("Time remaining : " + (j / ((long) 1000)));
            this.b.setVisibility(8);
            this.a.setVisibility(0);
        }
    }

    public static final class o extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ TextView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(TextView textView, TextView textView2) {
            super(30000L, 1000L);
            this.a = textView;
            this.b = textView2;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.b.setVisibility(0);
            this.a.setText("0");
            this.a.setVisibility(8);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            this.a.setText("Time remaining : " + (j / ((long) 1000)));
            this.b.setVisibility(8);
            this.a.setVisibility(0);
        }
    }

    public static final void A3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void A4(SarthiProcessWithAdhar this$0, TextView time_text, TextView resendOtp, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(time_text, "$time_text");
        Intrinsics.checkNotNullParameter(resendOtp, "$resendOtp");
        this$0.U2().show();
        new o(time_text, resendOtp).start();
        String string = StringsKt__StringsKt.trim((CharSequence) this$0.q2().g.getText().toString()).toString();
        Charset charsetForName = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charsetName)");
        byte[] bytes = string.getBytes(charsetForName);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        Base64.encodeToString(bytes, 0);
        int iNextInt = new Random().nextInt(1410065407);
        qi5.a aVar = qi5.a;
        String strC = aVar.c(this$0);
        Intrinsics.checkNotNull(strC);
        this$0.nk = strC;
        this$0.K2().o(aVar.b(StringsKt__StringsKt.trim((CharSequence) this$0.q2().g.getText().toString()).toString()), "sarEtrans25Ms", this$0.nk, String.valueOf(iNextInt));
    }

    public static final void B4(EditText enterOtp, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        enterOtp.setText("");
    }

    public static final void C3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void C4(EditText enterOtp, SarthiProcessWithAdhar this$0, ImageView ok_button, final Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(ok_button, "$ok_button");
        Intrinsics.checkNotNullParameter(d2, "$d");
        String string = enterOtp.getText().toString();
        if (string.length() == 0) {
            Toast.makeText(this$0, this$0.B2().b("label_log_entr_otp", this$0.getString(R.string.pls_enter_otp)), 0).show();
        } else if (string.length() < 6) {
            Toast.makeText(this$0, this$0.B2().b("label_log_entr_val_otp", this$0.getString(R.string.pls_enter_valid_otp)), 0).show();
        } else {
            this$0.U2().show();
            String string2 = StringsKt__StringsKt.trim((CharSequence) this$0.q2().g.getText().toString()).toString();
            Charset charsetForName = Charset.forName("UTF-8");
            Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charsetName)");
            byte[] bytes = string2.getBytes(charsetForName);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            Base64.encodeToString(bytes, 0);
            this$0.K2().p(qi5.a.b(StringsKt__StringsKt.trim((CharSequence) this$0.q2().g.getText().toString()).toString()), "sarEtrans25Ms", enterOtp.getText().toString(), String.valueOf(this$0.txnNo), this$0.nk);
        }
        ok_button.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gk5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SarthiProcessWithAdhar.D4(d2, view2);
            }
        });
    }

    public static final void D3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void D4(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void I3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void J3(SarthiProcessWithAdhar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.B3();
    }

    public static final void K3(SarthiProcessWithAdhar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Intent intent = new Intent(this$0, (Class<?>) DlServiceDetailsActivity.class);
            intent.putExtra("DL", this$0.dlNo);
            intent.putExtra("dob", this$0.dob);
            intent.putExtra("DLDetails", this$0.t2());
            intent.putExtra("Mobile_no", this$0.b3().l());
            intent.putExtra("lastEndorsedRTO", this$0.lastEndorsedRTO);
            intent.putExtra("lastEndorsedState", this$0.lastEndorsedState);
            intent.putExtra("lastEndorsedRTOCode", this$0.lastEndorsedRTO);
            intent.putExtra("lastEndorseStateCode", this$0.lastEndorseStateCode);
            intent.putExtra("whatServiceRequired", this$0.whatServiceRequired);
            intent.putExtra("multiList", this$0.S2());
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public static final void L3(Dialog d2, SarthiProcessWithAdhar this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        this$0.finish();
    }

    public static final void M3(SarthiProcessWithAdhar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.V2().c(true);
        this$0.M2().m(this$0.R2(), this$0.Z2().n());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void f3() {
        e4(this);
        u4(new ws6(this));
        Y3(new wa3(this));
        r4(EkYCService.INSTANCE.a(this));
        q4(VahanProService.INSTANCE.a(this));
        n4(new ProgressDialog(this));
        U2().setMessage(B2().b("label_challan_please_wait", "Please wait..."));
        U2().setCancelable(false);
        U2().setCanceledOnTouchOutside(false);
        if (Intrinsics.areEqual(Z2().b(), VContant.MAINSCREEN)) {
            this.serviceCode = 514;
        } else if (Intrinsics.areEqual(Z2().b(), VContant.APPLICATION_SCREEN)) {
            this.serviceCode = 513;
        } else if (Intrinsics.areEqual(Z2().b(), "3")) {
            this.serviceCode = 515;
        } else if (Intrinsics.areEqual(Z2().b(), "4")) {
            this.serviceCode = 525;
        } else if (Intrinsics.areEqual(Z2().b(), VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE)) {
            this.serviceCode = 523;
        } else if (Intrinsics.areEqual(Z2().b(), VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE)) {
            this.serviceCode = 516;
        } else {
            this.serviceCode = Integer.parseInt(Z2().b());
        }
        if (getIntent() != null) {
            this.bioRecGenesis = String.valueOf(getIntent().getStringExtra("bioRecGenesis"));
            this.lastEndorseRtoCode = String.valueOf(getIntent().getStringExtra("lastEndorsedRTOCode"));
            this.lastEndorseStateCode = String.valueOf(getIntent().getStringExtra("lastEndorseStateCode"));
            this.lastEndorsedState = String.valueOf(getIntent().getStringExtra("lastEndorsedState"));
            this.lastEndorsedRTO = String.valueOf(getIntent().getStringExtra("lastEndorsedRTO"));
            this.state_value = String.valueOf(getIntent().getStringExtra("state_value"));
            this.dob = String.valueOf(getIntent().getStringExtra("dob"));
            this.dlNo = String.valueOf(getIntent().getStringExtra("DL"));
            Serializable serializableExtra = getIntent().getSerializableExtra("DLDetails");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
            R3((DldetobjX) serializableExtra);
            Serializable serializableExtra2 = getIntent().getSerializableExtra("whatServiceRequired");
            Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type java.util.HashMap<kotlin.String?, kotlin.String?>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String?, kotlin.String?> }");
            this.whatServiceRequired = (HashMap) serializableExtra2;
            Serializable serializableExtra3 = getIntent().getSerializableExtra("multiList");
            Intrinsics.checkNotNull(serializableExtra3, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
            i4((ArrayList) serializableExtra3);
            this.multiCheck = String.valueOf(getIntent().getStringExtra("multiCheck"));
        }
        p4(DlServiceInt.INSTANCE.a(this));
        S3((nr1) new z(this, new rq1(new lr1(W2(), this))).a(nr1.class));
        h4((aj5) new z(this, new zi5(new yi5(Y2()))).a(aj5.class));
        w4((ld7) new z(this, new kd7(new jd7(X2()))).a(ld7.class));
        a4(AadharInterface.INSTANCE.a(this));
        c4((ll) new z(this, new jl(new kl(H2()))).a(ll.class));
        b4(AdrInterface.INSTANCE.a(this));
        d4((ml) new z(this, new ol(new pl(I2()))).a(ml.class));
        q2().l.setText(this.dlNo);
        q2().i.g.setText(Z2().k());
        W3(new ArrayList());
        if (Intrinsics.areEqual(Z2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                ArrayList arrayList = (ArrayList) new GsonBuilder().create().fromJson(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getString("enabledServiceList", ""), new TypeToken<ArrayList<String>>() { // from class: com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar$initFun$theList$1
                }.getType());
                Intrinsics.checkNotNull(arrayList);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj = arrayList.get(i2);
                    Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                    String str = (String) obj;
                    if (Q2().contains(str)) {
                        switch (str.hashCode()) {
                            case 52503:
                                if (str.equals("513")) {
                                    A2().add("Issue of Duplicate DL");
                                }
                                break;
                            case 52504:
                                if (str.equals("514")) {
                                    A2().add("Renewal of DL");
                                }
                                break;
                            case 52505:
                                if (str.equals("515")) {
                                    A2().add("Change of Address in DL");
                                }
                                break;
                            case 52506:
                                if (str.equals("516")) {
                                    A2().add("Replacement of DL");
                                }
                                break;
                            case 52535:
                                if (str.equals("524")) {
                                    A2().add("Endorsement to Drive in Hill Region");
                                }
                                break;
                            case 52537:
                                if (str.equals("526")) {
                                    A2().add("Change of Name in DL");
                                }
                                break;
                            case 52569:
                                if (str.equals("537")) {
                                    A2().add("Re-Validation of Expired DL");
                                }
                                break;
                            case 52601:
                                if (str.equals("548")) {
                                    A2().add("Change of Date of Birth in DL");
                                }
                                break;
                        }
                    }
                    if (Intrinsics.areEqual(this.multiCheck, "Re-Validation of Expired DL")) {
                        if (!A2().contains("Re-Validation of Expired DL")) {
                            A2().add("Re-Validation of Expired DL");
                        }
                        if (A2().contains("Renewal of DL")) {
                            A2().remove("Renewal of DL");
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    private final void i3() {
        K2().i().g(this, new m(new g()));
        K2().j().g(this, new m(new h()));
        K2().k().g(this, new m(new i()));
        K2().j().g(this, new m(new j()));
        J2().l().g(this, new m(new k()));
        J2().h().g(this, new m(new l()));
        v2().j(this, this.lastEndorseStateCode);
        v2().C().g(this, new mf4() { // from class: com.zepto.kj5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SarthiProcessWithAdhar.j3(this.a, (CustomState) obj);
            }
        });
        O2().j().g(this, new mf4() { // from class: com.zepto.lj5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SarthiProcessWithAdhar.k3(this.a, (eKycResponse) obj);
            }
        });
        O2().i().g(this, new mf4() { // from class: com.zepto.mj5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SarthiProcessWithAdhar.l3(this.a, (String) obj);
            }
        });
        O2().h().g(this, new mf4() { // from class: com.zepto.nj5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SarthiProcessWithAdhar.m3(this.a, (EkycVerifyResponse) obj);
            }
        });
        O2().g().g(this, new mf4() { // from class: com.zepto.oj5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SarthiProcessWithAdhar.n3(this.a, (String) obj);
            }
        });
        M2().k().g(this, new mf4() { // from class: com.zepto.pj5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SarthiProcessWithAdhar.o3(this.a, (ServiceCheckPojo) obj);
            }
        });
        M2().i().g(this, new mf4() { // from class: com.zepto.qj5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SarthiProcessWithAdhar.p3(this.a, (String) obj);
            }
        });
        K2().g().g(this, new m(new b()));
        K2().h().g(this, new m(new c()));
        K2().n().g(this, new m(new d()));
        K2().l().g(this, new m(new e()));
        J2().m().g(this, new m(new f()));
    }

    public static final void j3(SarthiProcessWithAdhar this$0, CustomState customState) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (StringsKt__StringsJVMKt.equals(customState.getStatus_code(), "00", true)) {
                this$0.allowAddrChangeAtDlservReqst = customState.getCustomSt().get(0).getAllowAddrChangeAtDlservReqst();
            }
        } catch (Exception unused) {
        }
    }

    private final void k2() {
        q2().m.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ij5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarthiProcessWithAdhar.l2(this.a, view);
            }
        });
        q2().n.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jj5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarthiProcessWithAdhar.m2(this.a, view);
            }
        });
    }

    public static final void k3(SarthiProcessWithAdhar this$0, eKycResponse ekycresponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.U2().dismiss();
        Log.d("adhar_resp", ekycresponse.toString());
        try {
            ApiMessage apiMessage = ekycresponse.getApiMessage();
            if (apiMessage == null || apiMessage.getStatusCode() != 200) {
                ApiMessage apiMessage2 = ekycresponse.getApiMessage();
                this$0.E3(this$0, String.valueOf(apiMessage2 != null ? apiMessage2.getDeveloperMessage() : null));
                return;
            }
            Data data = ekycresponse.getData();
            String strValueOf = String.valueOf(data != null ? data.getTxNo() : null);
            this$0.txnNo = strValueOf;
            Intrinsics.checkNotNull(strValueOf);
            if (strValueOf.length() > 23) {
                String str = this$0.txnNo;
                Intrinsics.checkNotNull(str);
                if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "T", false, 2, (Object) null)) {
                    String str2 = this$0.txnNo;
                    Intrinsics.checkNotNull(str2);
                    String strSubstring = str2.substring(0, 23);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    this$0.txnNo = strSubstring;
                    Intrinsics.checkNotNull(strSubstring);
                    this$0.txnNo = StringsKt__StringsJVMKt.replace$default(strSubstring, "T", " ", false, 4, (Object) null);
                    Date date = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS").parse(this$0.txnNo);
                    Intrinsics.checkNotNull(date, "null cannot be cast to non-null type java.util.Date");
                    String string = Long.toString(date.getTime() / 1000);
                    Intrinsics.checkNotNull(string);
                    String strValueOf2 = String.valueOf(Long.parseLong(string) * ((long) 1000));
                    this$0.txnNo = strValueOf2;
                    Log.e("time_Stamp_value", String.valueOf(strValueOf2));
                }
            }
            vh7 vh7Var = new vh7(this$0);
            Data data2 = ekycresponse.getData();
            vh7Var.f(String.valueOf(data2 != null ? data2.getTxNo() : null));
            Data data3 = ekycresponse.getData();
            this$0.x4(this$0, String.valueOf(data3 != null ? data3.getLastFourMobileNumber() : null));
        } catch (Exception unused) {
            this$0.E3(this$0, "Unable to process the request, Please try after some time");
        }
    }

    public static final void l2(SarthiProcessWithAdhar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.q2().g.getText().clear();
    }

    public static final void l3(SarthiProcessWithAdhar this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.U2().dismiss();
        this$0.E3(this$0, "Unable to process the request, Please try after some time");
    }

    public static final void m2(SarthiProcessWithAdhar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Editable text = this$0.q2().g.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() == 0 && this$0.q2().b.isChecked()) {
            this$0.E3(this$0, "Please enter the Aadhaar Number");
            return;
        }
        if (this$0.q2().g.getText().length() < 12 && this$0.q2().b.isChecked()) {
            this$0.E3(this$0, "Please enter the valid Aadhaar Number");
            return;
        }
        if (this$0.q2().g.getText().length() > 12 && this$0.q2().b.isChecked()) {
            this$0.E3(this$0, "Please enter the valid Aadhaar Number");
            return;
        }
        Editable text2 = this$0.q2().g.getText();
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        if (text2.length() == 0 && this$0.q2().o.isChecked()) {
            this$0.E3(this$0, "Please enter the Virtual Id");
            return;
        }
        if (this$0.q2().g.getText().length() < 16 && this$0.q2().o.isChecked()) {
            this$0.E3(this$0, "Please enter the valid Virtual Id");
            return;
        }
        if (!this$0.q2().e.isChecked() && this$0.q2().o.isChecked()) {
            this$0.E3(this$0, "Please agree with VID based e-KYC consent");
            return;
        }
        if (!this$0.q2().e.isChecked() && this$0.q2().b.isChecked()) {
            this$0.E3(this$0, "Please agree with Aadhaar based e-KYC consent");
            return;
        }
        this$0.U2().show();
        int iNextInt = new Random().nextInt(1410065407);
        qi5.a aVar = qi5.a;
        String strC = aVar.c(this$0);
        Intrinsics.checkNotNull(strC);
        this$0.nk = strC;
        this$0.K2().o(aVar.b(StringsKt__StringsKt.trim((CharSequence) this$0.q2().g.getText().toString()).toString()), "sarEtrans25Ms", this$0.nk, String.valueOf(iNextInt));
    }

    public static final void m3(SarthiProcessWithAdhar this$0, EkycVerifyResponse ekycVerifyResponse) {
        DOEkyc dOEkyc;
        DOEkyc dOEkyc2;
        DOEkyc dOEkyc3;
        DOEkyc dOEkyc4;
        DOEkyc dOEkyc5;
        DOEkyc dOEkyc6;
        DOEkyc dOEkyc7;
        DOEkyc dOEkyc8;
        DOEkyc dOEkyc9;
        DOEkyc dOEkyc10;
        DOEkyc dOEkyc11;
        DOEkyc dOEkyc12;
        DOEkyc dOEkyc13;
        DOEkyc dOEkyc14;
        DOEkyc dOEkyc15;
        DOEkyc dOEkyc16;
        DOEkyc dOEkyc17;
        DOEkyc dOEkyc18;
        DOEkyc dOEkyc19;
        DOEkyc dOEkyc20;
        DOEkyc dOEkyc21;
        DOEkyc dOEkyc22;
        DOEkyc dOEkyc23;
        DOEkyc dOEkyc24;
        DOEkyc dOEkyc25;
        DOEkyc dOEkyc26;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (ekycVerifyResponse != null) {
            try {
                com.nic.mparivahan.DLServicesAuth.Wrapper.EkycResponse.Data data = ekycVerifyResponse.getData();
                DOAadhaarResponse dOAadhaarResponse = data != null ? data.getDOAadhaarResponse() : null;
                if (String.valueOf(dOAadhaarResponse != null ? dOAadhaarResponse.getStatus() : null).length() != 0) {
                    if (StringsKt__StringsJVMKt.equals(String.valueOf(dOAadhaarResponse != null ? dOAadhaarResponse.getStatus() : null), "Y", true)) {
                        try {
                            vh7 vh7Var = new vh7(this$0);
                            String str = this$0.txnNo;
                            Intrinsics.checkNotNull(str);
                            vh7Var.f(str);
                            if (String.valueOf((dOAadhaarResponse == null || (dOEkyc26 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc26.getName()).length() != 0) {
                                this$0.owner_name_addhaar = String.valueOf((dOAadhaarResponse == null || (dOEkyc = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc.getName());
                            }
                            if (String.valueOf((dOAadhaarResponse == null || (dOEkyc25 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc25.getGender()).length() != 0) {
                                this$0.eKYCGender = String.valueOf((dOAadhaarResponse == null || (dOEkyc2 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc2.getGender());
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append((dOAadhaarResponse == null || (dOEkyc24 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc24.getHouse());
                            sb.append(' ');
                            sb.append((dOAadhaarResponse == null || (dOEkyc23 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc23.getStreet());
                            sb.append(' ');
                            sb.append((dOAadhaarResponse == null || (dOEkyc22 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc22.getLocalityIfAny());
                            sb.append(' ');
                            sb.append((dOAadhaarResponse == null || (dOEkyc21 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc21.getDist());
                            sb.append(' ');
                            sb.append((dOAadhaarResponse == null || (dOEkyc20 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc20.getState());
                            sb.append(' ');
                            sb.append((dOAadhaarResponse == null || (dOEkyc19 = dOAadhaarResponse.getDOEkyc()) == null) ? null : Integer.valueOf(dOEkyc19.getPincode()));
                            this$0.address = sb.toString();
                            ll llVarJ2 = this$0.J2();
                            String string = StringsKt__StringsKt.trim((CharSequence) this$0.q2().g.getText().toString()).toString();
                            String strValueOf = String.valueOf((dOAadhaarResponse == null || (dOEkyc18 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc18.getCareOf());
                            String strValueOf2 = String.valueOf((dOAadhaarResponse == null || (dOEkyc17 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc17.getCode());
                            String strValueOf3 = String.valueOf((dOAadhaarResponse == null || (dOEkyc16 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc16.getDist());
                            String strValueOf4 = String.valueOf((dOAadhaarResponse == null || (dOEkyc15 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc15.getDob());
                            String strValueOf5 = String.valueOf((dOAadhaarResponse == null || (dOEkyc14 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc14.getGender());
                            String strValueOf6 = String.valueOf((dOAadhaarResponse == null || (dOEkyc13 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc13.getHouse());
                            String strValueOf7 = String.valueOf((dOAadhaarResponse == null || (dOEkyc12 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc12.getLandMark());
                            String strValueOf8 = String.valueOf((dOAadhaarResponse == null || (dOEkyc11 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc11.getLocalityIfAny());
                            String strValueOf9 = String.valueOf((dOAadhaarResponse == null || (dOEkyc10 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc10.getName());
                            String strValueOf10 = String.valueOf((dOAadhaarResponse == null || (dOEkyc9 = dOAadhaarResponse.getDOEkyc()) == null) ? null : Integer.valueOf(dOEkyc9.getPhone()));
                            String strValueOf11 = String.valueOf((dOAadhaarResponse == null || (dOEkyc8 = dOAadhaarResponse.getDOEkyc()) == null) ? null : Integer.valueOf(dOEkyc8.getPincode()));
                            String strValueOf12 = String.valueOf((dOAadhaarResponse == null || (dOEkyc7 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc7.getState());
                            String strValueOf13 = String.valueOf((dOAadhaarResponse == null || (dOEkyc6 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc6.getStatus());
                            String strValueOf14 = String.valueOf((dOAadhaarResponse == null || (dOEkyc5 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc5.getStreet());
                            String strValueOf15 = String.valueOf((dOAadhaarResponse == null || (dOEkyc4 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc4.getVillageTownCity());
                            if (dOAadhaarResponse != null && (dOEkyc3 = dOAadhaarResponse.getDOEkyc()) != null) {
                                xmlUID = dOEkyc3.getXmlUID();
                            }
                            String strValueOf16 = String.valueOf(xmlUID);
                            String str2 = this$0.dlNo;
                            Intrinsics.checkNotNull(str2);
                            String bioFullName = this$0.t2().getBioObj().getBioFullName();
                            String strN2 = this$0.n2(this$0.t2().getBioObj().getBioDob());
                            Intrinsics.checkNotNull(strN2);
                            String bioSwdFullName = this$0.t2().getBioObj().getBioSwdFullName();
                            int i2 = this$0.serviceCode;
                            String str3 = this$0.txnNo;
                            Intrinsics.checkNotNull(str3);
                            llVarJ2.p(string, strValueOf, strValueOf2, strValueOf3, strValueOf4, strValueOf5, strValueOf6, strValueOf7, strValueOf8, strValueOf9, strValueOf10, "NA", strValueOf11, strValueOf12, strValueOf13, strValueOf14, strValueOf15, strValueOf16, str2, bioFullName, strN2, bioSwdFullName, i2, "Y", str3, StringsKt__StringsKt.trim((CharSequence) this$0.q2().g.getText().toString()).toString(), this$0.lastEndorseStateCode);
                            return;
                        } catch (Exception e2) {
                            this$0.U2().dismiss();
                            e2.printStackTrace();
                            return;
                        }
                    }
                }
                this$0.U2().dismiss();
                String reason = dOAadhaarResponse != null ? dOAadhaarResponse.getReason() : null;
                if (reason != null && reason.length() != 0) {
                    this$0.E3(this$0, String.valueOf(dOAadhaarResponse != null ? dOAadhaarResponse.getReason() : null));
                    return;
                }
                this$0.E3(this$0, "Unable to verify the request, Please try after some time");
            } catch (Exception unused) {
            }
        }
    }

    public static final void n3(SarthiProcessWithAdhar this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.U2().dismiss();
    }

    public static final void o3(SarthiProcessWithAdhar this$0, ServiceCheckPojo serviceCheckPojo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.V2().c(false);
        try {
            if (!Intrinsics.areEqual(serviceCheckPojo.getStatus_code(), "00")) {
                this$0.E3(this$0.L2(), serviceCheckPojo.getResult());
                return;
            }
            ArrayList arrayListS2 = this$0.S2();
            if (arrayListS2 != null && !arrayListS2.isEmpty() && this$0.S2().size() != 0) {
                if (Intrinsics.areEqual(this$0.S2().get(0), this$0.B2().b("check_dl_serv_dupl_dl", "Issue of Duplicate DL"))) {
                    this$0.setIntent(new Intent(this$0, (Class<?>) DLDuplicateActivity.class));
                    Intent intent = this$0.getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                    this$0.h3(intent, this$0.lastEndorsedRTO, this$0.lastEndorsedState, "513", this$0.S2(), 1);
                    this$0.finish();
                    return;
                }
                if (Intrinsics.areEqual(this$0.S2().get(0), this$0.B2().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                    this$0.setIntent(new Intent(this$0, (Class<?>) RenewalOfDLActivity.class));
                    Intent intent2 = this$0.getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
                    this$0.h3(intent2, this$0.lastEndorsedRTO, this$0.lastEndorsedState, "514", this$0.S2(), 1);
                    this$0.finish();
                    return;
                }
                if (Intrinsics.areEqual(this$0.S2().get(0), this$0.B2().b("check_dl_serv_renewal_dl", "Re-Validation of Expired DL"))) {
                    this$0.setIntent(new Intent(this$0, (Class<?>) RenewalOfDLActivity.class));
                    Intent intent3 = this$0.getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent3, "getIntent(...)");
                    this$0.h3(intent3, this$0.lastEndorsedRTO, this$0.lastEndorsedState, "537", this$0.S2(), 1);
                    this$0.finish();
                    return;
                }
                if (Intrinsics.areEqual(this$0.S2().get(0), this$0.B2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                    if (Intrinsics.areEqual(this$0.flag, "0")) {
                        ArrayList arrayListG2 = this$0.G2();
                        TypeIntrinsics.asMutableCollection(arrayListG2).remove(this$0.B2().b("check_dl_serv_change_addr", "Change of Address in DL"));
                    }
                    this$0.setIntent(new Intent(this$0, (Class<?>) ChangeOfAddressActivity.class));
                    Intent intent4 = this$0.getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent4, "getIntent(...)");
                    this$0.h3(intent4, this$0.lastEndorsedRTO, this$0.lastEndorsedState, "515", this$0.S2(), 1);
                    this$0.finish();
                    return;
                }
                if (Intrinsics.areEqual(this$0.S2().get(0), this$0.B2().b("check_dl_serv_replacement_dl", "Replacement of DL"))) {
                    this$0.setIntent(new Intent(this$0, (Class<?>) DLReplecementActivity.class));
                    Intent intent5 = this$0.getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent5, "getIntent(...)");
                    this$0.h3(intent5, this$0.lastEndorsedRTO, this$0.lastEndorsedState, "516", this$0.S2(), 1);
                    this$0.finish();
                    return;
                }
                if (Intrinsics.areEqual(this$0.S2().get(0), this$0.B2().b("hill_region_title", "Endorsement to Drive in Hill Region"))) {
                    this$0.setIntent(new Intent(this$0, (Class<?>) HillReligion.class));
                    Intent intent6 = this$0.getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent6, "getIntent(...)");
                    this$0.h3(intent6, this$0.lastEndorsedRTO, this$0.lastEndorsedState, "524", this$0.S2(), 1);
                    this$0.finish();
                    return;
                }
                if (Intrinsics.areEqual(this$0.S2().get(0), this$0.B2().b("change_name_dl", "Change of Name in DL"))) {
                    this$0.setIntent(new Intent(this$0, (Class<?>) ChangeOfName.class));
                    Intent intent7 = this$0.getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent7, "getIntent(...)");
                    this$0.h3(intent7, this$0.lastEndorsedRTO, this$0.lastEndorsedState, "526", this$0.S2(), 1);
                    this$0.finish();
                    return;
                }
                if (Intrinsics.areEqual(this$0.S2().get(0), this$0.B2().b("change_birth_dl", "Change of Date of Birth in DL"))) {
                    this$0.setIntent(new Intent(this$0, (Class<?>) DobChangeActivity.class));
                    Intent intent8 = this$0.getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent8, "getIntent(...)");
                    this$0.h3(intent8, this$0.lastEndorsedRTO, this$0.lastEndorsedState, "548", this$0.S2(), 1);
                    this$0.finish();
                    return;
                }
                if (Intrinsics.areEqual(this$0.S2().get(0), this$0.B2().b("check_dl_serv_extract_dl", "DL Extract"))) {
                    this$0.setIntent(new Intent(this$0, (Class<?>) DLExtractActivity.class));
                    Intent intent9 = this$0.getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent9, "getIntent(...)");
                    this$0.h3(intent9, this$0.lastEndorsedRTO, this$0.lastEndorsedState, "523", this$0.S2(), 1);
                    return;
                }
                return;
            }
            Toast.makeText(this$0.L2(), "Please select at least one service", 1).show();
        } catch (Exception unused) {
        }
    }

    public static final void p3(SarthiProcessWithAdhar this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Toast.makeText(this$0, "hello", 0).show();
        this$0.V2().c(false);
        this$0.E3(this$0, this$0.B2().b("service_is_not_present", this$0.getString(R.string.unable_to_get_details)));
    }

    public static final void q3(SarthiProcessWithAdhar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void r3(SarthiProcessWithAdhar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void s3(SarthiProcessWithAdhar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.q2().g.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            this$0.q2().k.setImageResource(R.drawable.pass_visible);
            this$0.q2().g.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else {
            this$0.q2().k.setImageResource(R.drawable.mvvm_visibility);
            this$0.q2().g.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public static final void t3(NapixTokenModel napixTokenModel) {
        try {
            va3.a.c1(napixTokenModel.getAccess_token());
        } catch (Exception unused) {
        }
    }

    public static final void u3(SarthiProcessWithAdhar this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.q2().o.setChecked(false);
            this$0.q2().b.setChecked(true);
            this$0.q2().g.setHint("Enter Aadhaar Number");
            this$0.q2().g.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(12)});
            this$0.q2().c.setText(Html.fromHtml("I have read and agree to <font color=\"#008ed8\"><b><u>Aadhaar based e-KYC consent</u></b></font>"));
            this$0.type = "A";
        }
    }

    public static final void v3(SarthiProcessWithAdhar this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.q2().b.setChecked(false);
            this$0.q2().o.setChecked(true);
            this$0.q2().g.setHint("Enter VID Number");
            this$0.q2().g.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(16)});
            this$0.q2().c.setText(Html.fromHtml("I have read and agree to <font color=\"#008ed8\"><b><u>VID based e-KYC consent</u></b></font>"));
            this$0.type = "V";
        }
    }

    public static final void w3(SarthiProcessWithAdhar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        final Dialog dialog = new Dialog(this$0);
        dialog.setContentView(R.layout.term_cond_aadhar_dialog);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        dialog.setCanceledOnTouchOutside(true);
        dialog.setCancelable(true);
        View viewFindViewById = dialog.findViewById(R.id.cancelIv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById;
        View viewFindViewById2 = dialog.findViewById(R.id.termConditionWv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        WebView webView = (WebView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById3;
        if (this$0.q2().o.isChecked()) {
            textView.setText(this$0.B2().b("vid_based_consent", "VID based e-KYC consent"));
        } else {
            textView.setText(this$0.B2().b("aadhar_based_consent", "Aadhaar based e-KYC consent"));
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hj5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SarthiProcessWithAdhar.x3(dialog, view2);
            }
        });
        webView.loadUrl(s14.a.g() + this$0.B2().d() + "/mparivahan-info-terms-of-use-aadhaar.html");
        webView.clearCache(true);
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x3(Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    public static final void y3(SarthiProcessWithAdhar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Intrinsics.areEqual(this$0.Z2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                final Dialog dialog = new Dialog(this$0);
                dialog.setContentView(R.layout.layout_multi);
                Window window = dialog.getWindow();
                Intrinsics.checkNotNull(window);
                window.setBackgroundDrawable(new ColorDrawable(0));
                View viewFindViewById = dialog.findViewById(R.id.service_label_cross);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
                TextView textView = (TextView) viewFindViewById2;
                View viewFindViewById3 = dialog.findViewById(R.id.service_label_list);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
                View viewFindViewById4 = dialog.findViewById(R.id.service_label_list_serial);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
                View viewFindViewById5 = dialog.findViewById(R.id.dl_services);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
                textView.setText(this$0.B2().b("btn_ok", "OK"));
                ((TextView) viewFindViewById5).setText(this$0.B2().b("title_dl_services", "Driving Licence Services"));
                ((ImageView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mk5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        SarthiProcessWithAdhar.z3(dialog, view2);
                    }
                });
                ((TextView) viewFindViewById4).setText(R.string.multi_string_serial);
                ((TextView) viewFindViewById3).setText(this$0.B2().b("check_dl_serv_dupl_dl", "Issue of Duplicate DL") + '\n' + this$0.B2().b("check_dl_serv_renewal_dl", "Renewal of DL") + '\n' + this$0.B2().b("check_dl_serv_change_addr", "Change of Address in DL") + '\n' + this$0.B2().b("check_dl_serv_replacement_dl", "Replacement of DL") + '\n' + this$0.B2().b("hill_region_title", "Endorsement to Drive in Hill Region") + '\n' + this$0.B2().b("change_name_dl", "Change of Name in DL") + '\n' + this$0.B2().b("change_birth_dl", "Change of Date of Birth in DL") + '\n' + this$0.B2().b("label_international_driv_permit", "International Driving Permit"));
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nk5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        SarthiProcessWithAdhar.A3(dialog, view2);
                    }
                });
                Window window2 = dialog.getWindow();
                Intrinsics.checkNotNull(window2);
                window2.setGravity(48);
                window2.setLayout(-2, -2);
                dialog.show();
            } catch (Exception unused) {
            }
        }
    }

    public static final void y4(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void z3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void z4(EditText enterOtp, ImageView shownPin, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        Intrinsics.checkNotNullParameter(shownPin, "$shownPin");
        if (enterOtp.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            shownPin.setImageResource(R.drawable.pass_visible);
            enterOtp.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else {
            shownPin.setImageResource(R.drawable.mvvm_visibility);
            enterOtp.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public final ArrayList A2() {
        ArrayList arrayList = this.finalList;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("finalList");
        return null;
    }

    public final wa3 B2() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final void B3() {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.layout_multi);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.service_label_cross);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.service_label_list);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        View viewFindViewById4 = dialog.findViewById(R.id.service_label_list_serial);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        View viewFindViewById5 = dialog.findViewById(R.id.dl_services);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        textView.setText(B2().b("btn_ok", "OK"));
        ((TextView) viewFindViewById5).setText(B2().b("title_dl_services", "Driving Licence Services"));
        ((ImageView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ek5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarthiProcessWithAdhar.C3(dialog, view);
            }
        });
        ((TextView) viewFindViewById3).setText(B2().b("check_dl_serv_dupl_dl", "Issue of Duplicate DL") + '\n' + B2().b("check_dl_serv_renewal_dl", "Renewal of DL") + '\n' + B2().b("check_dl_serv_change_addr", "Change of Address in DL") + '\n' + B2().b("check_dl_serv_replacement_dl", "Replacement of DL") + '\n' + B2().b("hill_region_title", "Endorsement to Drive in Hill Region") + '\n' + B2().b("change_name_dl", "Change of Name in DL") + '\n' + B2().b("change_birth_dl", "Change of Date of Birth in DL") + '\n' + B2().b("label_international_driv_permit", "International Driving Permit"));
        ((TextView) viewFindViewById4).setText(R.string.multi_string_serial);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fk5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarthiProcessWithAdhar.D3(dialog, view);
            }
        });
        Window window2 = dialog.getWindow();
        Intrinsics.checkNotNull(window2);
        window2.setGravity(48);
        window2.setLayout(-2, -2);
        dialog.show();
    }

    /* JADX INFO: renamed from: C2, reason: from getter */
    public final String getLastEndorseRtoCode() {
        return this.lastEndorseRtoCode;
    }

    /* JADX INFO: renamed from: D2, reason: from getter */
    public final String getLastEndorseStateCode() {
        return this.lastEndorseStateCode;
    }

    /* JADX INFO: renamed from: E2, reason: from getter */
    public final String getLastEndorsedRTO() {
        return this.lastEndorsedRTO;
    }

    public final void E3(Context context, String message) {
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dk5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarthiProcessWithAdhar.F3(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: renamed from: F2, reason: from getter */
    public final String getLastEndorsedState() {
        return this.lastEndorsedState;
    }

    public final ArrayList G2() {
        ArrayList arrayList = this.listHeaderSteps;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("listHeaderSteps");
        return null;
    }

    public final void G3(String eKYCId) {
        String str;
        try {
            if (Intrinsics.areEqual(Z2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                H3();
                return;
            }
            if (StringsKt__StringsJVMKt.equals$default((String) this.whatServiceRequired.get("537"), "Re-Validation of Expired DL", false, 2, null)) {
                if (Intrinsics.areEqual(this.eKYCGender, StringsKt__StringsKt.trim((CharSequence) "M").toString())) {
                    Z2().q(eKYCId, "Y", VContant.MAINSCREEN, this.ePhoto);
                } else {
                    Z2().q(eKYCId, "Y", VContant.APPLICATION_SCREEN, this.ePhoto);
                }
                setIntent(new Intent(this, (Class<?>) RenewalOfDLActivity.class));
                getIntent().putExtra("DL", this.dlNo);
                getIntent().putExtra("dob", this.dob);
                getIntent().putExtra("DLDetails", t2());
                getIntent().putExtra("Mobile_no", b3().l());
                getIntent().putExtra("lastEndorsedRTO", this.lastEndorsedRTO);
                getIntent().putExtra("lastEndorsedState", this.lastEndorsedState);
                getIntent().putExtra("lastEndorsedRTOCode", this.lastEndorseRtoCode);
                getIntent().putExtra("lastEndorseStateCode", this.lastEndorseStateCode);
                getIntent().putExtra("whatServiceRequired", this.whatServiceRequired);
                getIntent().putExtra("state_value", "same");
                getIntent().putExtra("purCode", "537");
                getIntent().putExtra("bioRecGenesis", "S");
                getIntent().putExtra("allowAddrChangeAtDlservReqst", "N");
                getIntent().putExtra("eKYCId", eKYCId);
                getIntent().putExtra("eKYCOpted", "Y");
                getIntent().putExtra("eKYCGender", this.eKYCGender);
                getIntent().putExtra("eKYCapplicantPhoto", this.ePhoto);
                startActivity(getIntent());
                finish();
                return;
            }
            str = "N";
            try {
                if (StringsKt__StringsJVMKt.equals$default((String) this.whatServiceRequired.get("526"), "Change of Name in DL", false, 2, null)) {
                    setIntent(new Intent(this, (Class<?>) ChangeOfName.class));
                    Intent intent = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                    g3(intent, this.lastEndorsedRTO, this.lastEndorsedState, "526");
                    finish();
                } else if (StringsKt__StringsJVMKt.equals$default((String) this.whatServiceRequired.get("548"), "Change of Date of Birth in DL", false, 2, null)) {
                    setIntent(new Intent(this, (Class<?>) DobChangeActivity.class));
                    Intent intent2 = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
                    g3(intent2, this.lastEndorsedRTO, this.lastEndorsedState, "548");
                    finish();
                } else if (StringsKt__StringsJVMKt.equals$default((String) this.whatServiceRequired.get("524"), "Endorsement to Drive in Hill Region", false, 2, null)) {
                    setIntent(new Intent(this, (Class<?>) HillReligion.class));
                    Intent intent3 = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent3, "getIntent(...)");
                    g3(intent3, this.lastEndorsedRTO, this.lastEndorsedState, "524");
                    finish();
                } else if (StringsKt__StringsJVMKt.equals$default((String) this.whatServiceRequired.get("514"), "Renewal of DL", false, 2, null)) {
                    if (!StringsKt__StringsJVMKt.equals(this.state_value, "same", true)) {
                        setIntent(new Intent(this, (Class<?>) ChangeOfAddressActivity.class));
                        Intent intent4 = getIntent();
                        Intrinsics.checkNotNullExpressionValue(intent4, "getIntent(...)");
                        g3(intent4, this.lastEndorsedRTO, this.lastEndorsedState, "514");
                        finish();
                    } else if (StringsKt__StringsJVMKt.equals(this.bioRecGenesis, "S", true) && StringsKt__StringsJVMKt.equals(this.allowAddrChangeAtDlservReqst, "Y", true)) {
                        setIntent(new Intent(this, (Class<?>) ChangeOfAddressActivity.class));
                        Intent intent5 = getIntent();
                        Intrinsics.checkNotNullExpressionValue(intent5, "getIntent(...)");
                        g3(intent5, this.lastEndorsedRTO, this.lastEndorsedState, "514");
                        finish();
                    } else {
                        setIntent(new Intent(this, (Class<?>) RenewalOfDLActivity.class));
                        Intent intent6 = getIntent();
                        Intrinsics.checkNotNullExpressionValue(intent6, "getIntent(...)");
                        g3(intent6, this.lastEndorsedRTO, this.lastEndorsedState, "514");
                        finish();
                    }
                } else if (StringsKt__StringsJVMKt.equals$default((String) this.whatServiceRequired.get("515"), "Change of Address in DL", false, 2, null)) {
                    setIntent(new Intent(this, (Class<?>) ChangeOfAddressActivity.class));
                    Intent intent7 = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent7, "getIntent(...)");
                    g3(intent7, this.lastEndorsedRTO, this.lastEndorsedState, "515");
                    finish();
                } else if (StringsKt__StringsJVMKt.equals$default((String) this.whatServiceRequired.get("513"), "Issue of Duplicate DL", false, 2, null)) {
                    if (!StringsKt__StringsJVMKt.equals(this.state_value, "same", true)) {
                        setIntent(new Intent(this, (Class<?>) ChangeOfAddressActivity.class));
                        Intent intent8 = getIntent();
                        Intrinsics.checkNotNullExpressionValue(intent8, "getIntent(...)");
                        g3(intent8, this.lastEndorsedRTO, this.lastEndorsedState, "513");
                        finish();
                    } else if (StringsKt__StringsJVMKt.equals(this.bioRecGenesis, "S", true) && StringsKt__StringsJVMKt.equals(this.allowAddrChangeAtDlservReqst, "Y", true)) {
                        setIntent(new Intent(this, (Class<?>) ChangeOfAddressActivity.class));
                        Intent intent9 = getIntent();
                        Intrinsics.checkNotNullExpressionValue(intent9, "getIntent(...)");
                        g3(intent9, this.lastEndorsedRTO, this.lastEndorsedState, "513");
                        finish();
                    } else {
                        setIntent(new Intent(this, (Class<?>) DLDuplicateActivity.class));
                        Intent intent10 = getIntent();
                        Intrinsics.checkNotNullExpressionValue(intent10, "getIntent(...)");
                        g3(intent10, this.lastEndorsedRTO, this.lastEndorsedState, "513");
                        finish();
                    }
                } else if (StringsKt__StringsJVMKt.equals$default((String) this.whatServiceRequired.get("516"), "Replacement of DL", false, 2, null)) {
                    if (!StringsKt__StringsJVMKt.equals(this.state_value, "same", true)) {
                        setIntent(new Intent(this, (Class<?>) ChangeOfAddressActivity.class));
                        Intent intent11 = getIntent();
                        Intrinsics.checkNotNullExpressionValue(intent11, "getIntent(...)");
                        g3(intent11, this.lastEndorsedRTO, this.lastEndorsedState, "516");
                        finish();
                    } else if (StringsKt__StringsJVMKt.equals(this.bioRecGenesis, "S", true) && StringsKt__StringsJVMKt.equals(this.allowAddrChangeAtDlservReqst, "Y", true)) {
                        setIntent(new Intent(this, (Class<?>) ChangeOfAddressActivity.class));
                        Intent intent12 = getIntent();
                        Intrinsics.checkNotNullExpressionValue(intent12, "getIntent(...)");
                        g3(intent12, this.lastEndorsedRTO, this.lastEndorsedState, "516");
                        finish();
                    } else {
                        Log.d("_28", "_28-" + this.eKYCGender + '-' + eKYCId);
                        setIntent(new Intent(this, (Class<?>) DLReplecementActivity.class));
                        Intent intent13 = getIntent();
                        Intrinsics.checkNotNullExpressionValue(intent13, "getIntent(...)");
                        g3(intent13, this.lastEndorsedRTO, this.lastEndorsedState, "516");
                        finish();
                    }
                } else if (StringsKt__StringsJVMKt.equals$default((String) this.whatServiceRequired.get("523"), "DL Extract", false, 2, null)) {
                    if (StringsKt__StringsJVMKt.equals(this.bioRecGenesis, "S", true) && StringsKt__StringsJVMKt.equals(this.allowAddrChangeAtDlservReqst, "Y", true)) {
                        setIntent(new Intent(this, (Class<?>) ChangeOfAddressActivity.class));
                        Intent intent14 = getIntent();
                        Intrinsics.checkNotNullExpressionValue(intent14, "getIntent(...)");
                        g3(intent14, this.lastEndorsedRTO, this.lastEndorsedState, "523");
                        finish();
                    } else {
                        setIntent(new Intent(this, (Class<?>) DLExtractActivity.class));
                        Intent intent15 = getIntent();
                        Intrinsics.checkNotNullExpressionValue(intent15, "getIntent(...)");
                        g3(intent15, this.lastEndorsedRTO, this.lastEndorsedState, "523");
                        finish();
                    }
                } else if (!StringsKt__StringsJVMKt.equals$default((String) this.whatServiceRequired.get("525"), "International Driving Permit", false, 2, null)) {
                    u1(B2().b("service_is_not_present", getString(R.string.unable_to_get_details)), q2().b());
                } else if (StringsKt__StringsJVMKt.equals(this.bioRecGenesis, "S", true) && StringsKt__StringsJVMKt.equals(this.allowAddrChangeAtDlservReqst, "Y", true)) {
                    setIntent(new Intent(this, (Class<?>) ChangeOfAddressActivity.class));
                    Intent intent16 = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent16, "getIntent(...)");
                    g3(intent16, this.lastEndorsedRTO, this.lastEndorsedState, "525");
                    finish();
                } else {
                    setIntent(new Intent(this, (Class<?>) DLIdpActivity.class));
                    Intent intent17 = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent17, "getIntent(...)");
                    g3(intent17, this.lastEndorsedRTO, this.lastEndorsedState, "525");
                    finish();
                }
            } catch (Exception unused) {
                Z2().q("NA", str, "NA", "NA");
            }
        } catch (Exception unused2) {
            str = "N";
        }
    }

    public final AadharInterface H2() {
        AadharInterface aadharInterface = this.mAadharInterface;
        if (aadharInterface != null) {
            return aadharInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAadharInterface");
        return null;
    }

    public final void H3() {
        final Dialog dialog = new Dialog(this, android.R.style.Theme.Black.NoTitleBar.Fullscreen);
        dialog.setContentView(R.layout.service_selection);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(-1));
        dialog.setCanceledOnTouchOutside(false);
        View viewFindViewById = dialog.findViewById(R.id.service_selection);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_proceed);
        Intrinsics.checkNotNull(viewFindViewById2);
        o4((CustomWegetLayout) viewFindViewById2);
        V2().setText(B2().b("button_proceed", getString(R.string.proceed)));
        View viewFindViewById3 = dialog.findViewById(R.id.dl_number_new);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        View viewFindViewById4 = dialog.findViewById(R.id.cancelIv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        View viewFindViewById5 = dialog.findViewById(R.id.pop_up_reset);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        CustomWegetLayout customWegetLayout = (CustomWegetLayout) viewFindViewById5;
        customWegetLayout.setText(B2().b("button_cancel", getString(R.string.cancel)));
        customWegetLayout.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xj5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarthiProcessWithAdhar.I3(dialog, view);
            }
        });
        View viewFindViewById6 = dialog.findViewById(R.id.select_Service_apply);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        ((TextView) viewFindViewById6).setText(B2().b("select_service_to_apply", "Select the service to apply"));
        View viewFindViewById7 = dialog.findViewById(R.id.service_label);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById7;
        View viewFindViewById8 = dialog.findViewById(R.id.service_label_dl);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        TextView textView2 = (TextView) viewFindViewById8;
        textView2.setPaintFlags(textView2.getPaintFlags() | 8);
        textView2.setText(StringsKt__StringsKt.trim((CharSequence) String.valueOf(this.dlNo)).toString());
        textView.setPaintFlags(textView.getPaintFlags() | 8);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yj5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarthiProcessWithAdhar.J3(this.a, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zj5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarthiProcessWithAdhar.K3(this.a, view);
            }
        });
        ((ImageView) viewFindViewById4).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ak5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarthiProcessWithAdhar.L3(dialog, this, view);
            }
        });
        StringBuilder sb = new StringBuilder();
        sb.append(B2().b("dl_no", "DL No. : "));
        sb.append(' ');
        String str = this.dlNo;
        Intrinsics.checkNotNull(str);
        sb.append(StringsKt__StringsKt.trim((CharSequence) str).toString());
        ((TextView) viewFindViewById3).setText(sb.toString());
        V2().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bk5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarthiProcessWithAdhar.M3(this.a, view);
            }
        });
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(null);
        CollectionsKt__MutableCollectionsJVMKt.sort(Q2());
        if (Intrinsics.areEqual(Z2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            recyclerView.setAdapter(new a(this, A2()));
        } else {
            recyclerView.setAdapter(new a(this, Q2()));
        }
        dialog.show();
    }

    public final AdrInterface I2() {
        AdrInterface adrInterface = this.mAadharInterface2;
        if (adrInterface != null) {
            return adrInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAadharInterface2");
        return null;
    }

    public final ll J2() {
        ll llVar = this.mAadharViewModel;
        if (llVar != null) {
            return llVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAadharViewModel");
        return null;
    }

    public final ml K2() {
        ml mlVar = this.mAadharViewModel2;
        if (mlVar != null) {
            return mlVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAadharViewModel2");
        return null;
    }

    public final Context L2() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final ef2 M2() {
        ef2 ef2Var = this.mFormEligVM;
        if (ef2Var != null) {
            return ef2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mFormEligVM");
        return null;
    }

    public final FromEligCheck N2() {
        FromEligCheck fromEligCheck = this.mFormsInterface;
        if (fromEligCheck != null) {
            return fromEligCheck;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mFormsInterface");
        return null;
    }

    public final void N3(Aadarkyc.DOEkyc dOEkyc) {
        Intrinsics.checkNotNullParameter(dOEkyc, "<set-?>");
        this.aadhaarData = dOEkyc;
    }

    public final aj5 O2() {
        aj5 aj5Var = this.mView;
        if (aj5Var != null) {
            return aj5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mView");
        return null;
    }

    public final void O3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.address = str;
    }

    /* JADX INFO: renamed from: P2, reason: from getter */
    public final String getMultiCheck() {
        return this.multiCheck;
    }

    public final void P3(xi5 xi5Var) {
        Intrinsics.checkNotNullParameter(xi5Var, "<set-?>");
        this.binding = xi5Var;
    }

    public final ArrayList Q2() {
        ArrayList arrayList = this.multiList;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("multiList");
        return null;
    }

    public final void Q3(boolean z) {
        this.COA = z;
    }

    public final ArrayList R2() {
        ArrayList arrayList = this.multiListCode;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("multiListCode");
        return null;
    }

    public final void R3(DldetobjX dldetobjX) {
        Intrinsics.checkNotNullParameter(dldetobjX, "<set-?>");
        this.dlDetails = dldetobjX;
    }

    public final ArrayList S2() {
        ArrayList arrayList = this.multiListName;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("multiListName");
        return null;
    }

    public final void S3(nr1 nr1Var) {
        Intrinsics.checkNotNullParameter(nr1Var, "<set-?>");
        this.dlServicesViewModel = nr1Var;
    }

    public final v14 T2() {
        v14 v14Var = this.napixViewModel;
        if (v14Var != null) {
            return v14Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("napixViewModel");
        return null;
    }

    public final void T3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eKYCGender = str;
    }

    public final ProgressDialog U2() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final void U3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eKYCId = str;
    }

    public final CustomWegetLayout V2() {
        CustomWegetLayout customWegetLayout = this.Proceed;
        if (customWegetLayout != null) {
            return customWegetLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("Proceed");
        return null;
    }

    public final void V3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.ePhoto = str;
    }

    public final DlServiceInt W2() {
        DlServiceInt dlServiceInt = this.retrofitService;
        if (dlServiceInt != null) {
            return dlServiceInt;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final void W3(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.finalList = arrayList;
    }

    public final VahanProService X2() {
        VahanProService vahanProService = this.retrofitServiceVahan;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitServiceVahan");
        return null;
    }

    public final void X3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.flag = str;
    }

    public final EkYCService Y2() {
        EkYCService ekYCService = this.retrofitService_one;
        if (ekYCService != null) {
            return ekYCService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService_one");
        return null;
    }

    public final void Y3(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final wl5 Z2() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    public final void Z3(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.listHeaderSteps = arrayList;
    }

    /* JADX INFO: renamed from: a3, reason: from getter */
    public final int getServiceCode() {
        return this.serviceCode;
    }

    public final void a4(AadharInterface aadharInterface) {
        Intrinsics.checkNotNullParameter(aadharInterface, "<set-?>");
        this.mAadharInterface = aadharInterface;
    }

    public final ws6 b3() {
        ws6 ws6Var = this.sessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
        return null;
    }

    public final void b4(AdrInterface adrInterface) {
        Intrinsics.checkNotNullParameter(adrInterface, "<set-?>");
        this.mAadharInterface2 = adrInterface;
    }

    /* JADX INFO: renamed from: c3, reason: from getter */
    public final String getState_value() {
        return this.state_value;
    }

    public final void c4(ll llVar) {
        Intrinsics.checkNotNullParameter(llVar, "<set-?>");
        this.mAadharViewModel = llVar;
    }

    /* JADX INFO: renamed from: d3, reason: from getter */
    public final String getTxnNo() {
        return this.txnNo;
    }

    public final void d4(ml mlVar) {
        Intrinsics.checkNotNullParameter(mlVar, "<set-?>");
        this.mAadharViewModel2 = mlVar;
    }

    /* JADX INFO: renamed from: e3, reason: from getter */
    public final HashMap getWhatServiceRequired() {
        return this.whatServiceRequired;
    }

    public final void e4(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void f4(ef2 ef2Var) {
        Intrinsics.checkNotNullParameter(ef2Var, "<set-?>");
        this.mFormEligVM = ef2Var;
    }

    public final void g3(Intent intent, String lastEndRTO, String lastEndState, String purCode) {
        if (Intrinsics.areEqual(this.eKYCGender, StringsKt__StringsKt.trim((CharSequence) "M").toString())) {
            Z2().q(this.eKYCId, "Y", VContant.MAINSCREEN, this.ePhoto);
        } else {
            Z2().q(this.eKYCId, "Y", VContant.APPLICATION_SCREEN, this.ePhoto);
        }
        try {
            intent.putExtra("DL", this.dlNo);
            intent.putExtra("dob", this.dob);
            intent.putExtra("DLDetails", t2());
            intent.putExtra("Mobile_no", b3().l());
            intent.putExtra("lastEndorsedRTO", lastEndRTO);
            intent.putExtra("lastEndorsedState", lastEndState);
            intent.putExtra("lastEndorsedRTOCode", this.lastEndorseRtoCode);
            intent.putExtra("lastEndorseStateCode", this.lastEndorseStateCode);
            intent.putExtra("whatServiceRequired", this.whatServiceRequired);
            intent.putExtra("state_value", this.state_value);
            intent.putExtra("purCode", purCode);
            intent.putExtra("bioRecGenesis", this.bioRecGenesis);
            intent.putExtra("allowAddrChangeAtDlservReqst", this.allowAddrChangeAtDlservReqst);
            intent.putExtra("eKYCId", this.eKYCId);
            intent.putExtra("eKYCOpted", "Y");
            intent.putExtra("eKYCGender", this.eKYCGender);
            intent.putExtra("eKYCapplicantPhoto", this.ePhoto);
            DOEkycX dOEkycX = this.adharData;
            if (dOEkycX == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX = null;
            }
            intent.putExtra("aadharData", dOEkycX);
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public final void g4(FromEligCheck fromEligCheck) {
        Intrinsics.checkNotNullParameter(fromEligCheck, "<set-?>");
        this.mFormsInterface = fromEligCheck;
    }

    public final void h3(Intent intent, String lastEndRTO, String lastEndState, String purCode, ArrayList multiList, int serialNo) {
        if (R2().size() > 1) {
            wl5 wl5VarZ2 = Z2();
            String strB = B2().b("dl_services", getString(R.string.dl_services));
            Intrinsics.checkNotNull(strB);
            wl5VarZ2.t(strB, VContant.MULTISERVICE_PURPOSE_CODE);
        }
        if (Intrinsics.areEqual(this.eKYCGender, StringsKt__StringsKt.trim((CharSequence) "M").toString())) {
            Z2().q(this.eKYCId, "Y", VContant.MAINSCREEN, this.ePhoto);
        } else {
            Z2().q(this.eKYCId, "Y", VContant.APPLICATION_SCREEN, this.ePhoto);
        }
        try {
            intent.putExtra("DL", this.dlNo);
            intent.putExtra("dob", this.dob);
            intent.putExtra("DLDetails", t2());
            intent.putExtra("Mobile_no", b3().l());
            intent.putExtra("lastEndorsedRTO", lastEndRTO);
            intent.putExtra("lastEndorsedState", lastEndState);
            intent.putExtra("lastEndorsedRTOCode", this.lastEndorseRtoCode);
            intent.putExtra("lastEndorseStateCode", this.lastEndorseStateCode);
            intent.putExtra("whatServiceRequired", this.whatServiceRequired);
            intent.putExtra("state_value", this.state_value);
            intent.putExtra("purCode", purCode);
            intent.putExtra("bioRecGenesis", this.bioRecGenesis);
            intent.putExtra("allowAddrChangeAtDlservReqst", this.allowAddrChangeAtDlservReqst);
            intent.putExtra("multiList", multiList);
            intent.putExtra("serialNo", serialNo);
            intent.putExtra("COA", this.COA);
            intent.putExtra("metaflag", this.flag);
            intent.putExtra("listHeaderSteps", G2());
            intent.putExtra("eKYCId", this.eKYCId);
            intent.putExtra("eKYCOpted", "Y");
            intent.putExtra("eKYCGender", this.eKYCGender);
            intent.putExtra("eKYCapplicantPhoto", this.ePhoto);
            intent.putExtra("aadharData", o2());
            startActivity(intent);
        } catch (Exception e2) {
            Log.d("error_gr", e2.getLocalizedMessage());
        }
    }

    public final void h4(aj5 aj5Var) {
        Intrinsics.checkNotNullParameter(aj5Var, "<set-?>");
        this.mView = aj5Var;
    }

    public final void i4(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.multiList = arrayList;
    }

    public final void j4(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.multiListCode = arrayList;
    }

    public final void k4(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.multiListName = arrayList;
    }

    public final void l4(v14 v14Var) {
        Intrinsics.checkNotNullParameter(v14Var, "<set-?>");
        this.napixViewModel = v14Var;
    }

    public final void m4(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.owner_name_addhaar = str;
    }

    public final String n2(String fdate) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyyy");
        try {
            Date date = simpleDateFormat.parse(fdate);
            Intrinsics.checkNotNullExpressionValue(date, "parse(...)");
            return simpleDateFormat2.format(date);
        } catch (ParseException unused) {
            return null;
        }
    }

    public final void n4(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final Aadarkyc.DOEkyc o2() {
        Aadarkyc.DOEkyc dOEkyc = this.aadhaarData;
        if (dOEkyc != null) {
            return dOEkyc;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhaarData");
        return null;
    }

    public final void o4(CustomWegetLayout customWegetLayout) {
        Intrinsics.checkNotNullParameter(customWegetLayout, "<set-?>");
        this.Proceed = customWegetLayout;
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        xi5 xi5VarC = xi5.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(xi5VarC, "inflate(...)");
        P3(xi5VarC);
        setContentView(q2().b());
        s4(new wl5(this));
        k4(new ArrayList());
        Z3(new ArrayList());
        j4(new ArrayList());
        g4(FromEligCheck.INSTANCE.b(this));
        f4((ef2) new z(this, new df2(new cf2(N2()))).a(ef2.class));
        f3();
        k2();
        i3();
        q2().i.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gj5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarthiProcessWithAdhar.q3(this.a, view);
            }
        });
        q2().h.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rj5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarthiProcessWithAdhar.r3(this.a, view);
            }
        });
        q2().b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.ck5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SarthiProcessWithAdhar.u3(this.a, compoundButton, z);
            }
        });
        q2().o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.hk5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SarthiProcessWithAdhar.v3(this.a, compoundButton, z);
            }
        });
        q2().c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ik5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarthiProcessWithAdhar.w3(this.a, view);
            }
        });
        if (Intrinsics.areEqual(Z2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            TextView textView = q2().h.g;
            String strB = B2().b("dl_services", getString(R.string.dl_services));
            Intrinsics.checkNotNull(strB);
            textView.setText(strB);
            q2().h.f.setVisibility(8);
            q2().h.g.setPaintFlags(8 | q2().h.g.getPaintFlags());
        } else {
            q2().h.g.setText(Z2().k());
            q2().h.f.setVisibility(8);
        }
        q2().h.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jk5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarthiProcessWithAdhar.y3(this.a, view);
            }
        });
        q2().k.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.kk5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarthiProcessWithAdhar.s3(this.a, view);
            }
        });
        l4((v14) new z(this, new w14(new t14(this.napixService))).a(v14.class));
        T2().h();
        T2().g().g(this, new mf4() { // from class: com.zepto.lk5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SarthiProcessWithAdhar.t3((NapixTokenModel) obj);
            }
        });
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onResume() {
        super.onResume();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        Gson gson = new Gson();
        CombineReq combineReq = new CombineReq(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 1023, null);
        SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
        editorEdit.putString("MultiService", gson.toJson(combineReq));
        editorEdit.commit();
        SharedPreferences.Editor editorEdit2 = getSharedPreferences("MultiService", 0).edit();
        editorEdit2.clear();
        editorEdit2.apply();
    }

    /* JADX INFO: renamed from: p2, reason: from getter */
    public final String getAllowAddrChangeAtDlservReqst() {
        return this.allowAddrChangeAtDlservReqst;
    }

    public final void p4(DlServiceInt dlServiceInt) {
        Intrinsics.checkNotNullParameter(dlServiceInt, "<set-?>");
        this.retrofitService = dlServiceInt;
    }

    public final xi5 q2() {
        xi5 xi5Var = this.binding;
        if (xi5Var != null) {
            return xi5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void q4(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitServiceVahan = vahanProService;
    }

    /* JADX INFO: renamed from: r2, reason: from getter */
    public final String getBioRecGenesis() {
        return this.bioRecGenesis;
    }

    public final void r4(EkYCService ekYCService) {
        Intrinsics.checkNotNullParameter(ekYCService, "<set-?>");
        this.retrofitService_one = ekYCService;
    }

    /* JADX INFO: renamed from: s2, reason: from getter */
    public final boolean getCOA() {
        return this.COA;
    }

    public final void s4(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    public final DldetobjX t2() {
        DldetobjX dldetobjX = this.dlDetails;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlDetails");
        return null;
    }

    public final void t4(int i2) {
        this.serviceCode = i2;
    }

    /* JADX INFO: renamed from: u2, reason: from getter */
    public final String getDlNo() {
        return this.dlNo;
    }

    public final void u4(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    public final nr1 v2() {
        nr1 nr1Var = this.dlServicesViewModel;
        if (nr1Var != null) {
            return nr1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlServicesViewModel");
        return null;
    }

    public final void v4(String str) {
        this.txnNo = str;
    }

    /* JADX INFO: renamed from: w2, reason: from getter */
    public final String getDob() {
        return this.dob;
    }

    public final void w4(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModelv1 = ld7Var;
    }

    /* JADX INFO: renamed from: x2, reason: from getter */
    public final String getEKYCGender() {
        return this.eKYCGender;
    }

    public final void x4(Context context, String mobile_no) {
        TextView textView;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mobile_no, "mobile_no");
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.validateotp);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        final ImageView imageView = (ImageView) viewFindViewById;
        View viewFindViewById2 = dialog.findViewById(R.id.resendOtp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        final TextView textView2 = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.showmpin);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        final ImageView imageView2 = (ImageView) viewFindViewById3;
        View viewFindViewById4 = dialog.findViewById(R.id.submitOtp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        TextView textView3 = (TextView) viewFindViewById4;
        View viewFindViewById5 = dialog.findViewById(R.id.enterOtp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        final EditText editText = (EditText) viewFindViewById5;
        View viewFindViewById6 = dialog.findViewById(R.id.time_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        final TextView textView4 = (TextView) viewFindViewById6;
        View viewFindViewById7 = dialog.findViewById(R.id.txt_reset);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        TextView textView5 = (TextView) viewFindViewById7;
        View viewFindViewById8 = dialog.findViewById(R.id.disPlay_mobile);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        TextView textView6 = (TextView) viewFindViewById8;
        View viewFindViewById9 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        ((ImageView) viewFindViewById9).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sj5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarthiProcessWithAdhar.y4(dialog, view);
            }
        });
        try {
            StringBuilder sb = new StringBuilder();
            textView = textView3;
            try {
                sb.append(B2().b("label_otp_sent_to_mobile", context.getString(R.string.otp_sent)));
                sb.append("\n+91-XXXXXX");
                sb.append(mobile_no);
                textView6.setText(sb.toString());
            } catch (Exception unused) {
                textView6.setText(B2().b("label_otp_sent_to_mobile", context.getString(R.string.otp_sent)));
            }
        } catch (Exception unused2) {
            textView = textView3;
        }
        new n(textView4, textView2).start();
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tj5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarthiProcessWithAdhar.z4(editText, imageView2, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.uj5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarthiProcessWithAdhar.A4(this.a, textView4, textView2, view);
            }
        });
        textView5.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vj5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarthiProcessWithAdhar.B4(editText, view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wj5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarthiProcessWithAdhar.C4(editText, this, imageView, dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: renamed from: y2, reason: from getter */
    public final String getEKYCId() {
        return this.eKYCId;
    }

    /* JADX INFO: renamed from: z2, reason: from getter */
    public final String getEPhoto() {
        return this.ePhoto;
    }
}
