package com.nic.mparivahan.ProfileDetails.ProfileViews;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.provider.Settings;
import android.text.Editable;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.google.gson.Gson;
import com.nic.mparivahan.Account.CreateAccountServices;
import com.nic.mparivahan.Account.Model.State;
import com.nic.mparivahan.Account.Model.StateMaster;
import com.nic.mparivahan.ProfileDetails.Model.FetchProfileImgResponseModel;
import com.nic.mparivahan.ProfileDetails.Model.SaveProfileModel;
import com.nic.mparivahan.ProfileDetails.Model.UpdateCitizenProfile;
import com.nic.mparivahan.ProfileDetails.Model.UploadProfileImgResponseModel;
import com.nic.mparivahan.ProfileDetails.ModleRef.profiledetails;
import com.nic.mparivahan.ProfileDetails.ProfileInterface.UserBloodDetails;
import com.nic.mparivahan.ProfileDetails.ProfileService.SaveCitizenProfileService;
import com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails;
import com.nic.mparivahan.ProfileDetails.StateUpdate.StateUpdateResponse;
import com.nic.mparivahan.R;
import com.nic.mparivahan.a;
import com.nic.mparivahan.dlservices.widget.CircleImageView;
import com.zepto.a70;
import com.zepto.ah;
import com.zepto.dl4;
import com.zepto.f11;
import com.zepto.gd1;
import com.zepto.gf;
import com.zepto.hf;
import com.zepto.mf;
import com.zepto.mf4;
import com.zepto.mt6;
import com.zepto.oe5;
import com.zepto.of;
import com.zepto.p11;
import com.zepto.pq;
import com.zepto.pw4;
import com.zepto.q11;
import com.zepto.st6;
import com.zepto.t66;
import com.zepto.ta3;
import com.zepto.va3;
import com.zepto.wa3;
import com.zepto.wb0;
import com.zepto.wr6;
import com.zepto.ws6;
import com.zepto.xr6;
import com.zepto.yr6;
import com.zepto.yy0;
import com.zepto.zr6;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 ó\u00012\u00020\u0001:\u0002ô\u0001B\t¢\u0006\u0006\bñ\u0001\u0010ò\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u001c\u0010\u000b\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\u001c\u0010\f\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\tH\u0002J\b\u0010\u0014\u001a\u00020\u0002H\u0002J\u001c\u0010\u0015\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\u001c\u0010\u0016\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\u0012\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0015J\b\u0010\u001a\u001a\u00020\u0002H\u0016J/\u0010!\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u000e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000e\u0010$\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020#J\u0006\u0010%\u001a\u00020\u0002J\u0006\u0010&\u001a\u00020\u0002R\u0016\u0010)\u001a\u00020\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010I\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010M\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010<\u001a\u0004\bK\u0010>\"\u0004\bL\u0010@R\"\u0010Q\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010<\u001a\u0004\bO\u0010>\"\u0004\bP\u0010@R\u0016\u0010U\u001a\u00020R8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010W\u001a\u00020R8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bV\u0010TR\u0016\u0010Y\u001a\u00020R8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bX\u0010TR\u0016\u0010]\u001a\u00020Z8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010a\u001a\u00020^8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010e\u001a\u00020b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010i\u001a\u00020f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bg\u0010hR\"\u0010p\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\"\u0010t\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bq\u0010k\u001a\u0004\br\u0010m\"\u0004\bs\u0010oR\"\u0010x\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bu\u0010k\u001a\u0004\bv\u0010m\"\u0004\bw\u0010oR\u0016\u0010z\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010NR\u0016\u0010|\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010NR'\u0010\u0084\u0001\u001a\u00020}8\u0006@\u0006X\u0086.¢\u0006\u0016\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R(\u0010\u0088\u0001\u001a\u00020}8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u0085\u0001\u0010\u007f\u001a\u0006\b\u0086\u0001\u0010\u0081\u0001\"\u0006\b\u0087\u0001\u0010\u0083\u0001R&\u0010\u008c\u0001\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0089\u0001\u0010D\u001a\u0005\b\u008a\u0001\u0010F\"\u0005\b\u008b\u0001\u0010HR&\u0010\u0090\u0001\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008d\u0001\u0010D\u001a\u0005\b\u008e\u0001\u0010F\"\u0005\b\u008f\u0001\u0010HR&\u0010\u0094\u0001\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0091\u0001\u0010D\u001a\u0005\b\u0092\u0001\u0010F\"\u0005\b\u0093\u0001\u0010HR&\u0010\u0098\u0001\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0095\u0001\u0010D\u001a\u0005\b\u0096\u0001\u0010F\"\u0005\b\u0097\u0001\u0010HR*\u0010 \u0001\u001a\u00030\u0099\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R*\u0010¨\u0001\u001a\u00030¡\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R=\u0010²\u0001\u001a\u0016\u0012\u0005\u0012\u00030ª\u00010©\u0001j\n\u0012\u0005\u0012\u00030ª\u0001`«\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¬\u0001\u0010\u00ad\u0001\u001a\u0006\b®\u0001\u0010¯\u0001\"\u0006\b°\u0001\u0010±\u0001R*\u0010º\u0001\u001a\u00030³\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b´\u0001\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001\"\u0006\b¸\u0001\u0010¹\u0001R&\u0010¾\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b»\u0001\u0010k\u001a\u0005\b¼\u0001\u0010m\"\u0005\b½\u0001\u0010oR&\u0010Â\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¿\u0001\u0010k\u001a\u0005\bÀ\u0001\u0010m\"\u0005\bÁ\u0001\u0010oR\u001a\u0010Æ\u0001\u001a\u00030Ã\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R*\u0010Î\u0001\u001a\u00030Ç\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÈ\u0001\u0010É\u0001\u001a\u0006\bÊ\u0001\u0010Ë\u0001\"\u0006\bÌ\u0001\u0010Í\u0001R&\u0010Ò\u0001\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÏ\u0001\u0010k\u001a\u0005\bÐ\u0001\u0010m\"\u0005\bÑ\u0001\u0010oR*\u0010Ú\u0001\u001a\u00030Ó\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÔ\u0001\u0010Õ\u0001\u001a\u0006\bÖ\u0001\u0010×\u0001\"\u0006\bØ\u0001\u0010Ù\u0001R=\u0010ß\u0001\u001a\u0016\u0012\u0005\u0012\u00030Û\u00010©\u0001j\n\u0012\u0005\u0012\u00030Û\u0001`«\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÜ\u0001\u0010\u00ad\u0001\u001a\u0006\bÝ\u0001\u0010¯\u0001\"\u0006\bÞ\u0001\u0010±\u0001R*\u0010ã\u0001\u001a\u00030\u0099\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bà\u0001\u0010\u009b\u0001\u001a\u0006\bá\u0001\u0010\u009d\u0001\"\u0006\bâ\u0001\u0010\u009f\u0001R*\u0010ë\u0001\u001a\u00030ä\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bå\u0001\u0010æ\u0001\u001a\u0006\bç\u0001\u0010è\u0001\"\u0006\bé\u0001\u0010ê\u0001R)\u0010ð\u0001\u001a\u0012\u0012\r\u0012\u000b í\u0001*\u0004\u0018\u00010\r0\r0ì\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bî\u0001\u0010ï\u0001¨\u0006õ\u0001"}, d2 = {"Lcom/nic/mparivahan/ProfileDetails/ProfileViews/UserDetails;", "Lcom/zepto/pq;", "", "Z1", "h3", "t3", "Q1", "Landroid/content/Context;", "context", "", "message", "I2", "L2", "Landroid/content/Intent;", "it", "A2", "s3", "U1", "userchecked", "R2", "H2", "N2", "P2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "u3", "", "requestCode", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Lcom/nic/mparivahan/Account/Model/StateMaster;", "l3", "R1", "S1", "C", "Landroid/content/Context;", "mContext", "Lcom/zepto/zr6;", "D", "Lcom/zepto/zr6;", "n2", "()Lcom/zepto/zr6;", "b3", "(Lcom/zepto/zr6;)V", "mUserBloodViewModel", "Lcom/nic/mparivahan/ProfileDetails/ProfileInterface/UserBloodDetails;", "E", "Lcom/nic/mparivahan/ProfileDetails/ProfileInterface/UserBloodDetails;", "p2", "()Lcom/nic/mparivahan/ProfileDetails/ProfileInterface/UserBloodDetails;", "d3", "(Lcom/nic/mparivahan/ProfileDetails/ProfileInterface/UserBloodDetails;)V", "mUserService", "Landroid/widget/EditText;", "F", "Landroid/widget/EditText;", "o2", "()Landroid/widget/EditText;", "c3", "(Landroid/widget/EditText;)V", "mUserName", "Landroid/widget/TextView;", "G", "Landroid/widget/TextView;", "getMDob", "()Landroid/widget/TextView;", "Y2", "(Landroid/widget/TextView;)V", "mDob", "H", "l2", "Z2", "mHeight", "I", "q2", "e3", "mWeight", "Landroid/widget/RadioButton;", "J", "Landroid/widget/RadioButton;", "maleRadioButton", "K", "femaleRadioButton", "L", "otherRadioButton", "Landroid/widget/Spinner;", "M", "Landroid/widget/Spinner;", "mSpinner", "Landroid/widget/LinearLayout;", "N", "Landroid/widget/LinearLayout;", "em_next", "Landroid/app/DatePickerDialog$OnDateSetListener;", "O", "Landroid/app/DatePickerDialog$OnDateSetListener;", "date", "Ljava/util/Calendar;", "P", "Ljava/util/Calendar;", "myCalendar", "Q", "Ljava/lang/String;", "getUserGender", "()Ljava/lang/String;", "p3", "(Ljava/lang/String;)V", "userGender", "R", "getDateOfBirth", "S2", "dateOfBirth", "S", "getSelectedItem", "k3", "selectedItem", "T", "cpRecordId", "U", "bloodGroupValue", "Landroid/widget/ImageView;", "V", "Landroid/widget/ImageView;", "V1", "()Landroid/widget/ImageView;", "T2", "(Landroid/widget/ImageView;)V", "dobCalendar", "W", "r2", "f3", "mvvm_back", "X", "W1", "U2", "dobDate", "Y", "X1", "V2", "dobMonth", "Z", "Y1", "W2", "dobYear", "a0", "t2", "i3", "profile_txt", "Lcom/zepto/ws6;", "b0", "Lcom/zepto/ws6;", "m2", "()Lcom/zepto/ws6;", "a3", "(Lcom/zepto/ws6;)V", "mSessionmanger", "Landroid/app/ProgressDialog;", "c0", "Landroid/app/ProgressDialog;", "s2", "()Landroid/app/ProgressDialog;", "g3", "(Landroid/app/ProgressDialog;)V", "pDialog", "Ljava/util/ArrayList;", "Lcom/zepto/a70;", "Lkotlin/collections/ArrayList;", "d0", "Ljava/util/ArrayList;", "T1", "()Ljava/util/ArrayList;", "setBloodgroup", "(Ljava/util/ArrayList;)V", "bloodgroup", "Lcom/nic/mparivahan/dlservices/widget/CircleImageView;", "e0", "Lcom/nic/mparivahan/dlservices/widget/CircleImageView;", "x2", "()Lcom/nic/mparivahan/dlservices/widget/CircleImageView;", "n3", "(Lcom/nic/mparivahan/dlservices/widget/CircleImageView;)V", "uploadIv", "f0", "getUploadedImgPath", "o3", "uploadedImgPath", "g0", "getImgType", "setImgType", "imgType", "Lcom/zepto/ah;", "h0", "Lcom/zepto/ah;", "mBinding", "Lcom/zepto/q11;", "i0", "Lcom/zepto/q11;", "z2", "()Lcom/zepto/q11;", "r3", "(Lcom/zepto/q11;)V", "viewModel", "j0", "v2", "m3", "stateCode", "Lcom/nic/mparivahan/Account/CreateAccountServices;", "k0", "Lcom/nic/mparivahan/Account/CreateAccountServices;", "u2", "()Lcom/nic/mparivahan/Account/CreateAccountServices;", "j3", "(Lcom/nic/mparivahan/Account/CreateAccountServices;)V", "retrofitService", "Lcom/nic/mparivahan/Account/Model/State;", "l0", "w2", "setState_list", "state_list", "m0", "y2", "q3", "userSessionManager", "Lcom/zepto/wa3;", "n0", "Lcom/zepto/wa3;", "k2", "()Lcom/zepto/wa3;", "X2", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/of;", "kotlin.jvm.PlatformType", "o0", "Lcom/zepto/of;", "getImageLauncher", "<init>", "()V", "p0", "a", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nUserDetails.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserDetails.kt\ncom/nic/mparivahan/ProfileDetails/ProfileViews/UserDetails\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1524:1\n1#2:1525\n*E\n"})
public final class UserDetails extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public zr6 mUserBloodViewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public UserBloodDetails mUserService;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public EditText mUserName;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public TextView mDob;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public EditText mHeight;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public EditText mWeight;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public RadioButton maleRadioButton;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public RadioButton femaleRadioButton;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public RadioButton otherRadioButton;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public Spinner mSpinner;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public LinearLayout em_next;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public DatePickerDialog.OnDateSetListener date;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public Calendar myCalendar;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String userGender;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String dateOfBirth;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String selectedItem;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public int cpRecordId;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public int bloodGroupValue;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public ImageView dobCalendar;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public ImageView mvvm_back;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public TextView dobDate;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public TextView dobMonth;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public TextView dobYear;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public TextView profile_txt;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public ws6 mSessionmanger;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public ArrayList bloodgroup;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public CircleImageView uploadIv;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public ah mBinding;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public q11 viewModel;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public String stateCode;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public CreateAccountServices retrofitService;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public ws6 userSessionManager;

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    public of getImageLauncher;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public String uploadedImgPath = "";

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public String imgType = "";

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public ArrayList state_list = new ArrayList();

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(SaveProfileModel saveProfileModel) {
            Context context = null;
            if (!Intrinsics.areEqual(saveProfileModel.getStatusDesc(), "Success")) {
                UserDetails.this.t2().setText("Submit");
                UserDetails.this.s2().dismiss();
                UserDetails userDetails = UserDetails.this;
                Context context2 = userDetails.mContext;
                if (context2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContext");
                } else {
                    context = context2;
                }
                userDetails.L2(context, saveProfileModel.getStatusDesc());
                return;
            }
            UserDetails.this.m2().x(String.valueOf(UserDetails.this.bloodGroupValue));
            ah ahVar = UserDetails.this.mBinding;
            if (ahVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                ahVar = null;
            }
            String string = ahVar.j.getText().toString();
            ah ahVar2 = UserDetails.this.mBinding;
            if (ahVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                ahVar2 = null;
            }
            String string2 = ahVar2.p.getText().toString();
            ah ahVar3 = UserDetails.this.mBinding;
            if (ahVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                ahVar3 = null;
            }
            String string3 = ahVar3.q.getText().toString();
            gd1.a aVar = gd1.a;
            if (!aVar.m(string)) {
                UserDetails.this.m2().B(string);
            }
            if (!aVar.m(string2)) {
                UserDetails.this.m2().G(string2);
            }
            if (!aVar.m(string3)) {
                UserDetails.this.m2().A(string3);
            }
            UserDetails.this.s2().dismiss();
            UserDetails userDetails2 = UserDetails.this;
            Context context3 = userDetails2.mContext;
            if (context3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            } else {
                context = context3;
            }
            userDetails2.N2(context, UserDetails.this.k2().b(va3.a.e0(), "Your profile has been updated successfully"));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SaveProfileModel) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(UpdateCitizenProfile updateCitizenProfile) {
            UserDetails.this.s2().dismiss();
            Context context = null;
            if (!Intrinsics.areEqual(updateCitizenProfile.getStatusDesc(), "Success")) {
                UserDetails.this.s2().dismiss();
                UserDetails userDetails = UserDetails.this;
                Context context2 = userDetails.mContext;
                if (context2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContext");
                } else {
                    context = context2;
                }
                userDetails.L2(context, updateCitizenProfile.getStatusDesc());
                return;
            }
            UserDetails.this.m2().x(String.valueOf(UserDetails.this.bloodGroupValue));
            UserDetails.this.m2().x(String.valueOf(UserDetails.this.bloodGroupValue));
            ah ahVar = UserDetails.this.mBinding;
            if (ahVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                ahVar = null;
            }
            String string = ahVar.j.getText().toString();
            ah ahVar2 = UserDetails.this.mBinding;
            if (ahVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                ahVar2 = null;
            }
            String string2 = ahVar2.p.getText().toString();
            ah ahVar3 = UserDetails.this.mBinding;
            if (ahVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                ahVar3 = null;
            }
            String string3 = ahVar3.q.getText().toString();
            gd1.a aVar = gd1.a;
            if (!aVar.m(string)) {
                UserDetails.this.m2().B(string);
            }
            if (!aVar.m(string2)) {
                UserDetails.this.m2().G(string2);
            }
            if (!aVar.m(string3)) {
                UserDetails.this.m2().A(string3);
            }
            UserDetails userDetails2 = UserDetails.this;
            Context context3 = userDetails2.mContext;
            if (context3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            } else {
                context = context3;
            }
            userDetails2.P2(context, UserDetails.this.k2().b(va3.a.e0(), "Your profile has been updated successfully"));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((UpdateCitizenProfile) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
            super(1);
        }

        public final void a(StateUpdateResponse stateUpdateResponse) {
            if (UserDetails.this.s2().isShowing()) {
                UserDetails.this.s2().dismiss();
            }
            Context context = null;
            if (Intrinsics.areEqual(stateUpdateResponse.getStatusDesc(), "Success")) {
                UserDetails.this.m2().b(String.valueOf(stateUpdateResponse.getMparCitizenUser().getCtzRecordId()), stateUpdateResponse.getMparCitizenUser().getCtzMobile(), stateUpdateResponse.getMparCitizenUser().getCtzDispName(), stateUpdateResponse.getMparCitizenUser().getCtzEmail(), UserDetails.this.y2().m().toString(), UserDetails.this.v2(), Boolean.TRUE, Boolean.valueOf(stateUpdateResponse.getMparCitizenUser().getCtzMpinStatus()));
                UserDetails userDetails = UserDetails.this;
                Context context2 = userDetails.mContext;
                if (context2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContext");
                } else {
                    context = context2;
                }
                userDetails.P2(context, UserDetails.this.k2().b(va3.a.e0(), "Your profile has been updated successfully"));
                return;
            }
            UserDetails.this.s2().dismiss();
            UserDetails userDetails2 = UserDetails.this;
            Context context3 = userDetails2.mContext;
            if (context3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            } else {
                context = context3;
            }
            userDetails2.L2(context, stateUpdateResponse.getStatusDesc());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((StateUpdateResponse) obj);
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

        public final void invoke(String str) {
            if (UserDetails.this.s2().isShowing()) {
                UserDetails.this.s2().dismiss();
            }
            UserDetails userDetails = UserDetails.this;
            Context context = userDetails.mContext;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
                context = null;
            }
            userDetails.L2(context, UserDetails.this.k2().b("service_is_not_present", "Something went wrong, Try after some time"));
        }
    }

    public static final class f extends Lambda implements Function1 {
        public f() {
            super(1);
        }

        public final void a(FetchProfileImgResponseModel fetchProfileImgResponseModel) {
            try {
                if (UserDetails.this.s2().isShowing()) {
                    UserDetails.this.s2().dismiss();
                }
                if (StringsKt__StringsJVMKt.equals(fetchProfileImgResponseModel.getStatusCode(), "CTZN001", true)) {
                    UserDetails.this.o3(fetchProfileImgResponseModel.getCtzImage());
                    Bitmap bitmapC = st6.c(fetchProfileImgResponseModel.getCtzImage());
                    if (bitmapC != null) {
                        UserDetails.this.x2().setImageBitmap(bitmapC);
                    }
                    UserDetails.this.m2().D(fetchProfileImgResponseModel.getCtzImage());
                    UserDetails.this.h3();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((FetchProfileImgResponseModel) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class g extends Lambda implements Function1 {
        public g() {
            super(1);
        }

        public final void a(UploadProfileImgResponseModel uploadProfileImgResponseModel) {
            try {
                if (UserDetails.this.s2().isShowing()) {
                    UserDetails.this.s2().dismiss();
                }
                StringsKt__StringsJVMKt.equals(uploadProfileImgResponseModel.getStatusCode(), "CTZN001", true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((UploadProfileImgResponseModel) obj);
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
            if (UserDetails.this.s2().isShowing()) {
                UserDetails.this.s2().dismiss();
            }
            UserDetails userDetails = UserDetails.this;
            Toast.makeText(userDetails, userDetails.k2().b(va3.a.D(), "There is some error in uploading"), 0).show();
            UserDetails.this.o3("");
            UserDetails.this.h3();
        }
    }

    public static final class i extends Lambda implements Function1 {
        public i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            if (UserDetails.this.s2().isShowing()) {
                UserDetails.this.s2().dismiss();
            }
            UserDetails.this.o3("");
            UserDetails.this.h3();
        }
    }

    public static final class j extends Lambda implements Function1 {
        public j() {
            super(1);
        }

        public final void a(oe5 oe5Var) {
            if (UserDetails.this.s2().isShowing()) {
                UserDetails.this.s2().dismiss();
            }
            Spinner spinner = null;
            try {
                throw null;
            } catch (Exception unused) {
                ArrayList arrayList = new ArrayList();
                a70 a70Var = new a70();
                a70Var.b("Select Blood Group");
                arrayList.add(0, a70Var);
                Context context = UserDetails.this.mContext;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContext");
                    context = null;
                }
                wr6 wr6Var = new wr6(context, arrayList);
                wr6Var.setDropDownViewResource(R.layout.custom_spinner);
                Spinner spinner2 = UserDetails.this.mSpinner;
                if (spinner2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mSpinner");
                } else {
                    spinner = spinner2;
                }
                spinner.setAdapter((SpinnerAdapter) wr6Var);
                if (a.a.a(UserDetails.this)) {
                    UserDetails.this.n2().g(Long.parseLong(UserDetails.this.m2().k()), UserDetails.this);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            wb0.a(obj);
            a(null);
            return Unit.INSTANCE;
        }
    }

    public static final class k extends Lambda implements Function1 {
        public k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            if (UserDetails.this.s2().isShowing()) {
                UserDetails.this.s2().dismiss();
            }
            ArrayList arrayList = new ArrayList();
            a70 a70Var = new a70();
            a70Var.b("Select Blood Group");
            arrayList.add(0, a70Var);
            Context context = UserDetails.this.mContext;
            Spinner spinner = null;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
                context = null;
            }
            wr6 wr6Var = new wr6(context, arrayList);
            wr6Var.setDropDownViewResource(R.layout.custom_spinner);
            Spinner spinner2 = UserDetails.this.mSpinner;
            if (spinner2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSpinner");
            } else {
                spinner = spinner2;
            }
            spinner.setAdapter((SpinnerAdapter) wr6Var);
            if (a.a.a(UserDetails.this)) {
                UserDetails.this.n2().g(Long.parseLong(UserDetails.this.m2().k()), UserDetails.this);
            }
        }
    }

    public static final class l extends Lambda implements Function1 {
        public l() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0081, code lost:
        
            if (r0 != null) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0083, code lost:
        
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mSpinner");
            r0 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x008c, code lost:
        
            r0.setSelection(r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x007b, code lost:
        
            r0 = r12.c.mSpinner;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(com.nic.mparivahan.ProfileDetails.ModleRef.profiledetails r13) {
            /*
                Method dump skipped, instruction units count: 596
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails.l.a(com.nic.mparivahan.ProfileDetails.ModleRef.profiledetails):void");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((profiledetails) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class m implements AdapterView.OnItemSelectedListener {
        public m() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            UserDetails userDetails = UserDetails.this;
            Spinner spinner = userDetails.mSpinner;
            if (spinner == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSpinner");
                spinner = null;
            }
            userDetails.k3(spinner.getSelectedItem().toString());
            UserDetails.this.bloodGroupValue = i;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class n implements AdapterView.OnItemSelectedListener {
        public n() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (UserDetails.this.getState_list().size() > 0) {
                UserDetails userDetails = UserDetails.this;
                userDetails.m3(((State) userDetails.getState_list().get(i)).getStateCode());
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class o implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public o(Function1 function) {
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

    public UserDetails() {
        of ofVarB0 = B0(new mf(), new hf() { // from class: com.zepto.as6
            @Override // com.zepto.hf
            public final void a(Object obj) {
                UserDetails.j2(this.a, (gf) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofVarB0, "registerForActivityResult(...)");
        this.getImageLauncher = ofVarB0;
    }

    private final void A2(Intent it) {
        Bitmap bitmap;
        Uri data = it.getData();
        try {
            if (Build.VERSION.SDK_INT > 27) {
                ContentResolver contentResolver = getContentResolver();
                Intrinsics.checkNotNull(data);
                ImageDecoder.Source sourceCreateSource = ImageDecoder.createSource(contentResolver, data);
                Intrinsics.checkNotNullExpressionValue(sourceCreateSource, "createSource(...)");
                bitmap = ImageDecoder.decodeBitmap(sourceCreateSource);
                Intrinsics.checkNotNull(bitmap);
            } else {
                bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), data);
                Intrinsics.checkNotNull(bitmap);
            }
            x2().setImageBitmap(bitmap);
            String strF = st6.f(bitmap);
            this.uploadedImgPath = strF;
            if (strF.length() > 0) {
                new ws6(this).D(this.uploadedImgPath);
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            Toast.makeText(this, "Failed!", 0).show();
        }
    }

    public static final void B2(UserDetails this$0, DatePicker datePicker, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Calendar calendar = this$0.myCalendar;
        Calendar calendar2 = null;
        if (calendar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("myCalendar");
            calendar = null;
        }
        calendar.set(1, i2);
        Calendar calendar3 = this$0.myCalendar;
        if (calendar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("myCalendar");
            calendar3 = null;
        }
        calendar3.set(2, i3);
        Calendar calendar4 = this$0.myCalendar;
        if (calendar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("myCalendar");
        } else {
            calendar2 = calendar4;
        }
        calendar2.set(5, i4);
        this$0.u3();
    }

    public static final void C2(UserDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ah ahVar = this$0.mBinding;
        ah ahVar2 = null;
        if (ahVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar = null;
        }
        ahVar.g.setBackground(this$0.getResources().getDrawable(R.drawable.blue_button_style));
        ah ahVar3 = this$0.mBinding;
        if (ahVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar3 = null;
        }
        ahVar3.K.setBackground(this$0.getResources().getDrawable(R.drawable.edit_button_brown));
        ah ahVar4 = this$0.mBinding;
        if (ahVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar4 = null;
        }
        ahVar4.g.setTextColor(yy0.c(this$0, R.color.white));
        ah ahVar5 = this$0.mBinding;
        if (ahVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar5 = null;
        }
        ahVar5.K.setTextColor(yy0.c(this$0, R.color.black));
        ah ahVar6 = this$0.mBinding;
        if (ahVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar6 = null;
        }
        ahVar6.m.setVisibility(0);
        ah ahVar7 = this$0.mBinding;
        if (ahVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            ahVar2 = ahVar7;
        }
        ahVar2.t.setText(this$0.k2().b(va3.a.R0(), "Update Profile"));
        this$0.S1();
    }

    public static final void D2(UserDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ah ahVar = this$0.mBinding;
        ah ahVar2 = null;
        if (ahVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar = null;
        }
        ahVar.g.setBackground(this$0.getResources().getDrawable(R.drawable.edit_button_brown));
        ah ahVar3 = this$0.mBinding;
        if (ahVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar3 = null;
        }
        ahVar3.K.setBackground(this$0.getResources().getDrawable(R.drawable.blue_button_style));
        ah ahVar4 = this$0.mBinding;
        if (ahVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar4 = null;
        }
        ahVar4.K.setTextColor(yy0.c(this$0, R.color.white));
        ah ahVar5 = this$0.mBinding;
        if (ahVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar5 = null;
        }
        ahVar5.g.setTextColor(yy0.c(this$0, R.color.black));
        ah ahVar6 = this$0.mBinding;
        if (ahVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            ahVar2 = ahVar6;
        }
        ahVar2.m.setVisibility(8);
        this$0.R1();
    }

    public static final void E2(UserDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!a.a.a(this$0)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.k2().b("label_log_check_internet", "Please check your internet connection"), 1).show();
            return;
        }
        try {
            Context context = null;
            if (this$0.o2().getText().length() < 3) {
                Context context2 = this$0.mContext;
                if (context2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContext");
                } else {
                    context = context2;
                }
                this$0.L2(context, this$0.k2().b(va3.a.T0(), "Please enter valid name"));
                return;
            }
            ah ahVar = this$0.mBinding;
            if (ahVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                ahVar = null;
            }
            if (ahVar.q.getVisibility() == 0) {
                ah ahVar2 = this$0.mBinding;
                if (ahVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    ahVar2 = null;
                }
                Editable text = ahVar2.q.getText();
                Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                if (text.length() == 0) {
                    Context context3 = this$0.mContext;
                    if (context3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mContext");
                    } else {
                        context = context3;
                    }
                    this$0.L2(context, this$0.k2().b(va3.a.p(), "Please enter email Id"));
                    return;
                }
            }
            mt6.a aVar = mt6.a;
            ah ahVar3 = this$0.mBinding;
            if (ahVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                ahVar3 = null;
            }
            if (!aVar.u(ahVar3.q.getText().toString())) {
                Context context4 = this$0.mContext;
                if (context4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContext");
                } else {
                    context = context4;
                }
                this$0.L2(context, this$0.k2().b("label_log_entr_valid_email", "Please enter the valid email Id"));
                return;
            }
            ah ahVar4 = this$0.mBinding;
            if (ahVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                ahVar4 = null;
            }
            if (ahVar4.q.getVisibility() == 0) {
                ah ahVar5 = this$0.mBinding;
                if (ahVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    ahVar5 = null;
                }
                if (!aVar.u(ahVar5.q.getText().toString())) {
                    Context context5 = this$0.mContext;
                    if (context5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mContext");
                    } else {
                        context = context5;
                    }
                    this$0.L2(context, this$0.k2().b("label_log_entr_valid_email", "Please enter the valid email Id"));
                    return;
                }
            }
            ah ahVar6 = this$0.mBinding;
            if (ahVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                ahVar6 = null;
            }
            if (ahVar6.u.getSelectedItemPosition() == 0) {
                Context context6 = this$0.mContext;
                if (context6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContext");
                } else {
                    context = context6;
                }
                this$0.L2(context, this$0.k2().b("label_log_sel_state", "Please select state"));
                return;
            }
            if (!Intrinsics.areEqual(this$0.t2().getText(), this$0.k2().b("vahan_btn_submit", "Submit"))) {
                Context context7 = this$0.mContext;
                if (context7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContext");
                } else {
                    context = context7;
                }
                this$0.I2(context, this$0.k2().b("label_want_to_proceed", "Are you sure, You want to proceed ?"));
                return;
            }
            ah ahVar7 = this$0.mBinding;
            if (ahVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                ahVar7 = null;
            }
            String string = ahVar7.q.getText().toString();
            if (!gd1.a.m(string)) {
                this$0.m2().A(string);
            }
            try {
                ah ahVar8 = this$0.mBinding;
                if (ahVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    ahVar8 = null;
                }
                Object selectedItem = ahVar8.u.getSelectedItem();
                Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.Account.Model.State");
                State state = (State) selectedItem;
                this$0.m2().E(state.getStateCode());
                ws6 ws6VarM2 = this$0.m2();
                ah ahVar9 = this$0.mBinding;
                if (ahVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    ahVar9 = null;
                }
                ws6VarM2.C(ahVar9.l.getText().toString());
                String string2 = Settings.Secure.getString(this$0.getContentResolver(), "android_id");
                pw4.a aVar2 = pw4.a;
                long j2 = Long.parseLong(this$0.m2().k());
                String strL = this$0.m2().l();
                String string3 = this$0.o2().getText().toString();
                String stateCode = state.getStateCode();
                boolean zD = this$0.m2().d();
                Intrinsics.checkNotNull(string2);
                String string4 = aVar2.e(j2, strL, string3, string, stateCode, zD, string2, this$0.m2().l(), this$0.m2().e(), this$0.m2().m()).toString();
                Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                SaveCitizenProfileService.INSTANCE.a(this$0, string4);
            } catch (Exception unused) {
            }
            Context context8 = this$0.mContext;
            if (context8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            } else {
                context = context8;
            }
            this$0.P2(context, this$0.k2().b(va3.a.e0(), "Your profile has been updated successfully"));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void F2(UserDetails this$0, StateMaster stateMaster) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ah ahVar = null;
        try {
            if (!StringsKt__StringsJVMKt.equals(stateMaster.getStatusCode(), "MSTR001", true)) {
                this$0.s2().dismiss();
                ArrayList arrayList = new ArrayList();
                arrayList.add(0, new State("Select State", "0", false, false, 1));
                t66 t66Var = new t66(this$0, arrayList);
                ah ahVar2 = this$0.mBinding;
                if (ahVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    ahVar2 = null;
                }
                ahVar2.u.setAdapter((SpinnerAdapter) t66Var);
                return;
            }
            this$0.s2().dismiss();
            ArrayList<State> states = stateMaster.getStates();
            Intrinsics.checkNotNull(states, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.Account.Model.State>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.Account.Model.State> }");
            this$0.state_list = states;
            states.add(0, new State("Select State", "0", false, false, 1));
            t66 t66Var2 = new t66(this$0, this$0.state_list);
            ah ahVar3 = this$0.mBinding;
            if (ahVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                ahVar3 = null;
            }
            ahVar3.u.setAdapter((SpinnerAdapter) t66Var2);
            int size = this$0.state_list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (Intrinsics.areEqual(((State) this$0.state_list.get(i2)).getStateCode(), this$0.m2().q())) {
                    ah ahVar4 = this$0.mBinding;
                    if (ahVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        ahVar4 = null;
                    }
                    ahVar4.u.setSelection(i2);
                    return;
                }
            }
        } catch (Exception e2) {
            this$0.s2().dismiss();
            e2.printStackTrace();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(0, new State("Select State", "0", false, false, 1));
            t66 t66Var3 = new t66(this$0, arrayList2);
            ah ahVar5 = this$0.mBinding;
            if (ahVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                ahVar = ahVar5;
            }
            ahVar.u.setAdapter((SpinnerAdapter) t66Var3);
        }
    }

    public static final void G2(UserDetails this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.s2().dismiss();
        ArrayList arrayList = new ArrayList();
        arrayList.add(0, new State("Select State", "0", false, false, 1));
        t66 t66Var = new t66(this$0, arrayList);
        ah ahVar = this$0.mBinding;
        if (ahVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar = null;
        }
        ahVar.u.setAdapter((SpinnerAdapter) t66Var);
    }

    private final void I2(Context context, String message) {
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.confirmation_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_proceed);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.pop_up_cancel);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById3;
        View viewFindViewById4 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById4).setText(k2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(k2().b("radio_dl_serv_yes", "Yes"));
        textView2.setText(k2().b("radio_dl_serv_no", "No"));
        ((TextView) viewFindViewById).setText(message);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ts6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserDetails.J2(dialog, view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.us6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserDetails.K2(dialog, this, view);
            }
        });
        dialog.show();
    }

    public static final void J2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void K2(Dialog d2, UserDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        if (!a.a.a(this$0)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.k2().b("label_log_check_internet", "Please check your internet connection"), 1).show();
            return;
        }
        ah ahVar = this$0.mBinding;
        Context context = null;
        if (ahVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar = null;
        }
        String string = ahVar.q.getText().toString();
        if (!gd1.a.m(string)) {
            this$0.m2().A(string);
        }
        try {
            ah ahVar2 = this$0.mBinding;
            if (ahVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                ahVar2 = null;
            }
            Object selectedItem = ahVar2.u.getSelectedItem();
            Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.Account.Model.State");
            State state = (State) selectedItem;
            this$0.m2().E(state.getStateCode());
            ws6 ws6VarM2 = this$0.m2();
            ah ahVar3 = this$0.mBinding;
            if (ahVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                ahVar3 = null;
            }
            ws6VarM2.C(ahVar3.l.getText().toString());
            String string2 = Settings.Secure.getString(this$0.getContentResolver(), "android_id");
            pw4.a aVar = pw4.a;
            long j2 = Long.parseLong(this$0.m2().k());
            String strL = this$0.m2().l();
            String string3 = this$0.o2().getText().toString();
            String stateCode = state.getStateCode();
            boolean zD = this$0.m2().d();
            Intrinsics.checkNotNull(string2);
            String string4 = aVar.e(j2, strL, string3, string, stateCode, zD, string2, this$0.m2().l(), this$0.m2().e(), this$0.m2().m()).toString();
            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
            SaveCitizenProfileService.INSTANCE.a(this$0, string4);
        } catch (Exception unused) {
        }
        Context context2 = this$0.mContext;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        } else {
            context = context2;
        }
        this$0.N2(context, this$0.k2().b(va3.a.e0(), "Your profile has been updated successfully"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L2(Context context, String message) {
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
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById3).setText(k2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(k2().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ss6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserDetails.M2(dialog, view);
            }
        });
        dialog.show();
    }

    public static final void M2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void O2(Dialog d2, UserDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        ah ahVar = this$0.mBinding;
        ah ahVar2 = null;
        if (ahVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar = null;
        }
        ahVar.g.setBackground(this$0.getResources().getDrawable(R.drawable.edit_button_brown));
        ah ahVar3 = this$0.mBinding;
        if (ahVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar3 = null;
        }
        ahVar3.K.setBackground(this$0.getResources().getDrawable(R.drawable.blue_button_style));
        ah ahVar4 = this$0.mBinding;
        if (ahVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar4 = null;
        }
        ahVar4.K.setTextColor(yy0.c(this$0, R.color.white));
        ah ahVar5 = this$0.mBinding;
        if (ahVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar5 = null;
        }
        ahVar5.g.setTextColor(yy0.c(this$0, R.color.black));
        ah ahVar6 = this$0.mBinding;
        if (ahVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            ahVar2 = ahVar6;
        }
        ahVar2.m.setVisibility(8);
        this$0.R1();
    }

    private final void Q1() {
        this.imgType = "gallery";
        this.getImageLauncher.a(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI));
    }

    public static final void Q2(Dialog d2, UserDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        ah ahVar = this$0.mBinding;
        ah ahVar2 = null;
        if (ahVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar = null;
        }
        ahVar.g.setBackground(this$0.getResources().getDrawable(R.drawable.edit_button_brown));
        ah ahVar3 = this$0.mBinding;
        if (ahVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar3 = null;
        }
        ahVar3.K.setBackground(this$0.getResources().getDrawable(R.drawable.blue_button_style));
        ah ahVar4 = this$0.mBinding;
        if (ahVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar4 = null;
        }
        ahVar4.K.setTextColor(yy0.c(this$0, R.color.white));
        ah ahVar5 = this$0.mBinding;
        if (ahVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar5 = null;
        }
        ahVar5.g.setTextColor(yy0.c(this$0, R.color.black));
        ah ahVar6 = this$0.mBinding;
        if (ahVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            ahVar2 = ahVar6;
        }
        ahVar2.m.setVisibility(8);
        this$0.R1();
    }

    private final void Z1() {
        View viewFindViewById = findViewById(R.id.em_name);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        c3((EditText) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.em_dob);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        Y2((TextView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.em_height);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        Z2((EditText) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.em_weight);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        e3((EditText) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.em_spn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.mSpinner = (Spinner) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.em_next);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.em_next = (LinearLayout) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.profile_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        i3((TextView) viewFindViewById7);
        View viewFindViewById8 = findViewById(R.id.uploadIv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        n3((CircleImageView) viewFindViewById8);
        View viewFindViewById9 = findViewById(R.id.mvvm_Back);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        f3((ImageView) viewFindViewById9);
        r2().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cs6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserDetails.f2(this.a, view);
            }
        });
        ah ahVar = this.mBinding;
        RadioButton radioButton = null;
        if (ahVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar = null;
        }
        ahVar.s.setText(m2().l());
        gd1.a aVar = gd1.a;
        if (aVar.m(m2().h())) {
            ah ahVar2 = this.mBinding;
            if (ahVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                ahVar2 = null;
            }
            ahVar2.A.setVisibility(0);
            ah ahVar3 = this.mBinding;
            if (ahVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                ahVar3 = null;
            }
            ahVar3.q.setVisibility(0);
        } else {
            ah ahVar4 = this.mBinding;
            if (ahVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                ahVar4 = null;
            }
            ahVar4.A.setVisibility(0);
            ah ahVar5 = this.mBinding;
            if (ahVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                ahVar5 = null;
            }
            ahVar5.q.setVisibility(0);
            ah ahVar6 = this.mBinding;
            if (ahVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                ahVar6 = null;
            }
            ahVar6.q.setText(m2().h());
        }
        if (!aVar.m(m2().j())) {
            ah ahVar7 = this.mBinding;
            if (ahVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                ahVar7 = null;
            }
            ahVar7.j.setText(m2().j());
        }
        if (!aVar.m(m2().t())) {
            ah ahVar8 = this.mBinding;
            if (ahVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                ahVar8 = null;
            }
            ahVar8.p.setText(m2().j());
        }
        x2().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ds6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserDetails.g2(this.a, view);
            }
        });
        View viewFindViewById10 = findViewById(R.id.em_male);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.maleRadioButton = (RadioButton) viewFindViewById10;
        View viewFindViewById11 = findViewById(R.id.em_female);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.femaleRadioButton = (RadioButton) viewFindViewById11;
        View viewFindViewById12 = findViewById(R.id.em_other);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        this.otherRadioButton = (RadioButton) viewFindViewById12;
        RadioButton radioButton2 = this.maleRadioButton;
        if (radioButton2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("maleRadioButton");
            radioButton2 = null;
        }
        radioButton2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.es6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserDetails.h2(this.a, view);
            }
        });
        RadioButton radioButton3 = this.femaleRadioButton;
        if (radioButton3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("femaleRadioButton");
            radioButton3 = null;
        }
        radioButton3.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fs6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserDetails.i2(this.a, view);
            }
        });
        RadioButton radioButton4 = this.otherRadioButton;
        if (radioButton4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otherRadioButton");
        } else {
            radioButton = radioButton4;
        }
        radioButton.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gs6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserDetails.a2(this.a, view);
            }
        });
        View viewFindViewById13 = findViewById(R.id.dob_cal);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
        T2((ImageView) viewFindViewById13);
        View viewFindViewById14 = findViewById(R.id.applicant_date);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "findViewById(...)");
        U2((TextView) viewFindViewById14);
        View viewFindViewById15 = findViewById(R.id.applicant_month);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById15, "findViewById(...)");
        V2((TextView) viewFindViewById15);
        View viewFindViewById16 = findViewById(R.id.applicant_year);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById16, "findViewById(...)");
        W2((TextView) viewFindViewById16);
        V1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hs6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserDetails.b2(this.a, view);
            }
        });
        W1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.is6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserDetails.c2(view);
            }
        });
        X1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.js6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserDetails.d2(view);
            }
        });
        Y1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ks6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserDetails.e2(view);
            }
        });
        if (m2().n() != null) {
            o2().setText(m2().n());
        }
        if (!aVar.m(m2().f())) {
            try {
                List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) m2().f(), new String[]{"-"}, false, 0, 6, (Object) null);
                W1().setText((CharSequence) listSplit$default.get(2));
                X1().setText((CharSequence) listSplit$default.get(1));
                Y1().setText((CharSequence) listSplit$default.get(0));
            } catch (Exception unused) {
            }
        }
        R2(m2().i());
        h3();
    }

    public static final void a2(UserDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RadioButton radioButton = this$0.maleRadioButton;
        RadioButton radioButton2 = null;
        if (radioButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("maleRadioButton");
            radioButton = null;
        }
        radioButton.setChecked(false);
        RadioButton radioButton3 = this$0.femaleRadioButton;
        if (radioButton3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("femaleRadioButton");
        } else {
            radioButton2 = radioButton3;
        }
        radioButton2.setChecked(false);
    }

    public static final void b2(UserDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.H2();
    }

    public static final void c2(View view) {
    }

    public static final void d2(View view) {
    }

    public static final void e2(View view) {
    }

    public static final void f2(UserDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void g2(UserDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Build.VERSION.SDK_INT >= 31) {
            this$0.Q1();
        } else if (this$0.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == -1) {
            this$0.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 10001);
        } else {
            this$0.Q1();
        }
    }

    public static final void h2(UserDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RadioButton radioButton = this$0.otherRadioButton;
        RadioButton radioButton2 = null;
        if (radioButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otherRadioButton");
            radioButton = null;
        }
        radioButton.setChecked(false);
        RadioButton radioButton3 = this$0.femaleRadioButton;
        if (radioButton3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("femaleRadioButton");
        } else {
            radioButton2 = radioButton3;
        }
        radioButton2.setChecked(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h3() {
        if (m2().p().length() <= 0 || Intrinsics.areEqual(m2().p(), "0")) {
            x2().setImageResource(R.drawable.add_profile);
            return;
        }
        Bitmap bitmapC = st6.c(m2().p());
        if (bitmapC != null) {
            x2().setImageBitmap(bitmapC);
        }
        this.uploadedImgPath = m2().p();
    }

    public static final void i2(UserDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RadioButton radioButton = this$0.otherRadioButton;
        RadioButton radioButton2 = null;
        if (radioButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otherRadioButton");
            radioButton = null;
        }
        radioButton.setChecked(false);
        RadioButton radioButton3 = this$0.maleRadioButton;
        if (radioButton3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("maleRadioButton");
        } else {
            radioButton2 = radioButton3;
        }
        radioButton2.setChecked(false);
    }

    public static final void j2(UserDetails this$0, gf gfVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (gfVar.d() == -1) {
            Intent intentC = gfVar.c();
            String str = this$0.imgType;
            if (Intrinsics.areEqual(str, "camera")) {
                if (intentC != null) {
                    this$0.s3(intentC);
                }
            } else {
                if (!Intrinsics.areEqual(str, "gallery") || intentC == null) {
                    return;
                }
                this$0.A2(intentC);
            }
        }
    }

    private final void s3(Intent it) {
        Bundle extras = it.getExtras();
        Bitmap bitmap = (Bitmap) (extras != null ? extras.get("data") : null);
        Intrinsics.checkNotNull(bitmap);
        this.uploadedImgPath = st6.f(bitmap);
        x2().setImageBitmap(bitmap);
        if (this.uploadedImgPath.length() > 0) {
            new ws6(this).D(this.uploadedImgPath);
        }
    }

    private final void t3() {
        this.imgType = "camera";
        if (st6.d(this)) {
            setIntent(new Intent("android.media.action.IMAGE_CAPTURE"));
            this.getImageLauncher.a(getIntent());
        }
    }

    public final void H2() {
        Context context;
        DatePickerDialog.OnDateSetListener onDateSetListener;
        Calendar calendar = Calendar.getInstance();
        calendar.set(2008, 1, 1);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(1911, 12, 31);
        Context context2 = this.mContext;
        Calendar calendar3 = null;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        } else {
            context = context2;
        }
        DatePickerDialog.OnDateSetListener onDateSetListener2 = this.date;
        if (onDateSetListener2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("date");
            onDateSetListener = null;
        } else {
            onDateSetListener = onDateSetListener2;
        }
        Calendar calendar4 = this.myCalendar;
        if (calendar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("myCalendar");
            calendar4 = null;
        }
        int i2 = calendar4.get(1);
        Calendar calendar5 = this.myCalendar;
        if (calendar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("myCalendar");
            calendar5 = null;
        }
        int i3 = calendar5.get(2);
        Calendar calendar6 = this.myCalendar;
        if (calendar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("myCalendar");
        } else {
            calendar3 = calendar6;
        }
        DatePickerDialog datePickerDialog = new DatePickerDialog(context, onDateSetListener, i2, i3, calendar3.get(5));
        datePickerDialog.getDatePicker().setMaxDate(calendar.getTimeInMillis());
        datePickerDialog.getDatePicker().setMinDate(calendar2.getTimeInMillis());
        datePickerDialog.show();
    }

    public final void N2(Context context, String message) {
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
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(k2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(k2().b("btn_ok", "OK"));
        ((TextView) viewFindViewById).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bs6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserDetails.O2(dialog, this, view);
            }
        });
        dialog.show();
    }

    public final void P2(Context context, String message) {
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
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(k2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(k2().b("btn_ok", "OK"));
        ((TextView) viewFindViewById).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ms6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserDetails.Q2(dialog, this, view);
            }
        });
        dialog.show();
    }

    public final void R1() {
        ah ahVar = this.mBinding;
        ah ahVar2 = null;
        if (ahVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar = null;
        }
        ahVar.l.setClickable(false);
        ah ahVar3 = this.mBinding;
        if (ahVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar3 = null;
        }
        ahVar3.l.setCursorVisible(false);
        ah ahVar4 = this.mBinding;
        if (ahVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar4 = null;
        }
        ahVar4.l.setFocusableInTouchMode(false);
        ah ahVar5 = this.mBinding;
        if (ahVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar5 = null;
        }
        ahVar5.q.setClickable(false);
        ah ahVar6 = this.mBinding;
        if (ahVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar6 = null;
        }
        ahVar6.q.setCursorVisible(false);
        ah ahVar7 = this.mBinding;
        if (ahVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar7 = null;
        }
        ahVar7.q.setFocusableInTouchMode(false);
        ah ahVar8 = this.mBinding;
        if (ahVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar8 = null;
        }
        ahVar8.f.setEnabled(false);
        ah ahVar9 = this.mBinding;
        if (ahVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar9 = null;
        }
        ahVar9.k.setEnabled(false);
        ah ahVar10 = this.mBinding;
        if (ahVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar10 = null;
        }
        ahVar10.i.setEnabled(false);
        ah ahVar11 = this.mBinding;
        if (ahVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar11 = null;
        }
        ahVar11.n.setEnabled(false);
        ah ahVar12 = this.mBinding;
        if (ahVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar12 = null;
        }
        ahVar12.u.setEnabled(false);
        ah ahVar13 = this.mBinding;
        if (ahVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar13 = null;
        }
        ahVar13.o.setEnabled(false);
        ah ahVar14 = this.mBinding;
        if (ahVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar14 = null;
        }
        ahVar14.j.setCursorVisible(false);
        ah ahVar15 = this.mBinding;
        if (ahVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar15 = null;
        }
        ahVar15.p.setCursorVisible(false);
        ah ahVar16 = this.mBinding;
        if (ahVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar16 = null;
        }
        ahVar16.j.setFocusableInTouchMode(false);
        ah ahVar17 = this.mBinding;
        if (ahVar17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar17 = null;
        }
        ahVar17.p.setFocusableInTouchMode(false);
        ah ahVar18 = this.mBinding;
        if (ahVar18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar18 = null;
        }
        ahVar18.j.setClickable(false);
        ah ahVar19 = this.mBinding;
        if (ahVar19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar19 = null;
        }
        ahVar19.p.setClickable(false);
        ah ahVar20 = this.mBinding;
        if (ahVar20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar20 = null;
        }
        ahVar20.b.setClickable(false);
        ah ahVar21 = this.mBinding;
        if (ahVar21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar21 = null;
        }
        ahVar21.d.setClickable(false);
        ah ahVar22 = this.mBinding;
        if (ahVar22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            ahVar2 = ahVar22;
        }
        ahVar2.e.setClickable(false);
        V1().setClickable(false);
        W1().setClickable(false);
        X1().setClickable(false);
        Y1().setClickable(false);
    }

    public final void R2(String userchecked) {
        RadioButton radioButton = null;
        if (userchecked.equals("M")) {
            RadioButton radioButton2 = this.maleRadioButton;
            if (radioButton2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("maleRadioButton");
            } else {
                radioButton = radioButton2;
            }
            radioButton.setChecked(true);
            return;
        }
        if (userchecked.equals("F")) {
            RadioButton radioButton3 = this.femaleRadioButton;
            if (radioButton3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("femaleRadioButton");
            } else {
                radioButton = radioButton3;
            }
            radioButton.setChecked(true);
            return;
        }
        if (userchecked.equals("T")) {
            RadioButton radioButton4 = this.otherRadioButton;
            if (radioButton4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("otherRadioButton");
            } else {
                radioButton = radioButton4;
            }
            radioButton.setChecked(true);
        }
    }

    public final void S1() {
        ah ahVar = this.mBinding;
        ah ahVar2 = null;
        if (ahVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar = null;
        }
        ahVar.l.setClickable(true);
        ah ahVar3 = this.mBinding;
        if (ahVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar3 = null;
        }
        ahVar3.l.setCursorVisible(true);
        ah ahVar4 = this.mBinding;
        if (ahVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar4 = null;
        }
        ahVar4.l.setEnabled(true);
        ah ahVar5 = this.mBinding;
        if (ahVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar5 = null;
        }
        ahVar5.l.setFocusableInTouchMode(true);
        ah ahVar6 = this.mBinding;
        if (ahVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar6 = null;
        }
        ahVar6.q.setClickable(true);
        ah ahVar7 = this.mBinding;
        if (ahVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar7 = null;
        }
        ahVar7.q.setCursorVisible(true);
        ah ahVar8 = this.mBinding;
        if (ahVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar8 = null;
        }
        ahVar8.q.setEnabled(true);
        ah ahVar9 = this.mBinding;
        if (ahVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar9 = null;
        }
        ahVar9.q.setFocusableInTouchMode(true);
        ah ahVar10 = this.mBinding;
        if (ahVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar10 = null;
        }
        ahVar10.f.setEnabled(true);
        ah ahVar11 = this.mBinding;
        if (ahVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar11 = null;
        }
        ahVar11.k.setEnabled(true);
        ah ahVar12 = this.mBinding;
        if (ahVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar12 = null;
        }
        ahVar12.i.setEnabled(true);
        ah ahVar13 = this.mBinding;
        if (ahVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar13 = null;
        }
        ahVar13.n.setEnabled(true);
        ah ahVar14 = this.mBinding;
        if (ahVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar14 = null;
        }
        ahVar14.u.setEnabled(true);
        ah ahVar15 = this.mBinding;
        if (ahVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar15 = null;
        }
        ahVar15.o.setEnabled(true);
        ah ahVar16 = this.mBinding;
        if (ahVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar16 = null;
        }
        ahVar16.j.setCursorVisible(true);
        ah ahVar17 = this.mBinding;
        if (ahVar17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar17 = null;
        }
        ahVar17.p.setCursorVisible(true);
        ah ahVar18 = this.mBinding;
        if (ahVar18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar18 = null;
        }
        ahVar18.j.setClickable(true);
        ah ahVar19 = this.mBinding;
        if (ahVar19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar19 = null;
        }
        ahVar19.p.setClickable(true);
        ah ahVar20 = this.mBinding;
        if (ahVar20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar20 = null;
        }
        ahVar20.b.setClickable(true);
        ah ahVar21 = this.mBinding;
        if (ahVar21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar21 = null;
        }
        ahVar21.d.setClickable(true);
        ah ahVar22 = this.mBinding;
        if (ahVar22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar22 = null;
        }
        ahVar22.e.setClickable(true);
        V1().setClickable(true);
        W1().setClickable(true);
        X1().setClickable(true);
        Y1().setClickable(true);
        ah ahVar23 = this.mBinding;
        if (ahVar23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar23 = null;
        }
        ahVar23.j.setFocusableInTouchMode(true);
        ah ahVar24 = this.mBinding;
        if (ahVar24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            ahVar2 = ahVar24;
        }
        ahVar2.p.setFocusableInTouchMode(true);
    }

    public final void S2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dateOfBirth = str;
    }

    public final ArrayList T1() {
        ArrayList arrayList = this.bloodgroup;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bloodgroup");
        return null;
    }

    public final void T2(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.dobCalendar = imageView;
    }

    public final void U1() {
        String str;
        RadioButton radioButton = this.maleRadioButton;
        RadioButton radioButton2 = null;
        if (radioButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("maleRadioButton");
            radioButton = null;
        }
        if (radioButton.isChecked()) {
            str = "M";
        } else {
            RadioButton radioButton3 = this.femaleRadioButton;
            if (radioButton3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("femaleRadioButton");
            } else {
                radioButton2 = radioButton3;
            }
            str = radioButton2.isChecked() ? "F" : "T";
        }
        p3(str);
    }

    public final void U2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.dobDate = textView;
    }

    public final ImageView V1() {
        ImageView imageView = this.dobCalendar;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dobCalendar");
        return null;
    }

    public final void V2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.dobMonth = textView;
    }

    public final TextView W1() {
        TextView textView = this.dobDate;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dobDate");
        return null;
    }

    public final void W2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.dobYear = textView;
    }

    public final TextView X1() {
        TextView textView = this.dobMonth;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dobMonth");
        return null;
    }

    public final void X2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final TextView Y1() {
        TextView textView = this.dobYear;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dobYear");
        return null;
    }

    public final void Y2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.mDob = textView;
    }

    public final void Z2(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.mHeight = editText;
    }

    public final void a3(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.mSessionmanger = ws6Var;
    }

    public final void b3(zr6 zr6Var) {
        Intrinsics.checkNotNullParameter(zr6Var, "<set-?>");
        this.mUserBloodViewModel = zr6Var;
    }

    public final void c3(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.mUserName = editText;
    }

    public final void d3(UserBloodDetails userBloodDetails) {
        Intrinsics.checkNotNullParameter(userBloodDetails, "<set-?>");
        this.mUserService = userBloodDetails;
    }

    public final void e3(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.mWeight = editText;
    }

    public final void f3(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.mvvm_back = imageView;
    }

    public final void g3(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void i3(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.profile_txt = textView;
    }

    public final void j3(CreateAccountServices createAccountServices) {
        Intrinsics.checkNotNullParameter(createAccountServices, "<set-?>");
        this.retrofitService = createAccountServices;
    }

    public final wa3 k2() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final void k3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.selectedItem = str;
    }

    public final EditText l2() {
        EditText editText = this.mHeight;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mHeight");
        return null;
    }

    public final void l3(StateMaster it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ah ahVar = null;
        try {
            if (!StringsKt__StringsJVMKt.equals(it.getStatusCode(), "MSTR001", true)) {
                s2().dismiss();
                ArrayList arrayList = new ArrayList();
                arrayList.add(0, new State("Select State", "0", false, false, 1));
                t66 t66Var = new t66(this, arrayList);
                ah ahVar2 = this.mBinding;
                if (ahVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    ahVar2 = null;
                }
                ahVar2.u.setAdapter((SpinnerAdapter) t66Var);
                return;
            }
            s2().dismiss();
            ArrayList<State> states = it.getStates();
            Intrinsics.checkNotNull(states, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.Account.Model.State>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.Account.Model.State> }");
            this.state_list = states;
            Collections.sort(states);
            this.state_list.add(0, new State("Select State", "0", false, false, 1));
            t66 t66Var2 = new t66(this, this.state_list);
            ah ahVar3 = this.mBinding;
            if (ahVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                ahVar3 = null;
            }
            ahVar3.u.setAdapter((SpinnerAdapter) t66Var2);
            int size = this.state_list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (Intrinsics.areEqual(((State) this.state_list.get(i2)).getStateCode(), m2().q())) {
                    ah ahVar4 = this.mBinding;
                    if (ahVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        ahVar4 = null;
                    }
                    ahVar4.u.setSelection(i2);
                    return;
                }
            }
        } catch (Exception e2) {
            s2().dismiss();
            e2.printStackTrace();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(0, new State("Select State", "0", false, false, 1));
            t66 t66Var3 = new t66(this, arrayList2);
            ah ahVar5 = this.mBinding;
            if (ahVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                ahVar = ahVar5;
            }
            ahVar.u.setAdapter((SpinnerAdapter) t66Var3);
        }
    }

    public final ws6 m2() {
        ws6 ws6Var = this.mSessionmanger;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mSessionmanger");
        return null;
    }

    public final void m3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stateCode = str;
    }

    public final zr6 n2() {
        zr6 zr6Var = this.mUserBloodViewModel;
        if (zr6Var != null) {
            return zr6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mUserBloodViewModel");
        return null;
    }

    public final void n3(CircleImageView circleImageView) {
        Intrinsics.checkNotNullParameter(circleImageView, "<set-?>");
        this.uploadIv = circleImageView;
    }

    public final EditText o2() {
        EditText editText = this.mUserName;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mUserName");
        return null;
    }

    public final void o3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uploadedImgPath = str;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ah ahVarC = ah.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(ahVarC, "inflate(...)");
        this.mBinding = ahVarC;
        LinearLayout linearLayout = null;
        if (ahVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVarC = null;
        }
        setContentView(ahVarC.b());
        this.mContext = this;
        ta3.a aVar = ta3.a;
        ah ahVar = this.mBinding;
        if (ahVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar = null;
        }
        aVar.b2(this, ahVar);
        X2(new wa3(this));
        a3(new ws6(this));
        q3(new ws6(this));
        CreateAccountServices.Companion companion = CreateAccountServices.INSTANCE;
        Context context = this.mContext;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        j3(companion.a(context));
        UserBloodDetails.Companion companion2 = UserBloodDetails.INSTANCE;
        Context context2 = this.mContext;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context2 = null;
        }
        d3(companion2.a(context2));
        Z1();
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance(...)");
        this.myCalendar = calendar;
        R1();
        this.date = new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.ls6
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i2, int i3, int i4) {
                UserDetails.B2(this.a, datePicker, i2, i3, i4);
            }
        };
        b3((zr6) new z(this, new xr6(new yr6(p2()))).a(zr6.class));
        a.C0058a c0058a = a.a;
        if (c0058a.a(this)) {
            Log.e("ProfileCalling", "test");
            Context context3 = this.mContext;
            if (context3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
                context3 = null;
            }
            g3(new ProgressDialog(context3));
            s2().setMessage("Please wait...");
            s2().setCancelable(false);
            s2().setCanceledOnTouchOutside(false);
            s2().show();
            n2().u();
        } else {
            Toast.makeText(getApplicationContext(), k2().b("label_log_check_internet", "Please check your internet connection"), 1).show();
        }
        ah ahVar2 = this.mBinding;
        if (ahVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar2 = null;
        }
        ahVar2.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ns6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserDetails.C2(this.a, view);
            }
        });
        ah ahVar3 = this.mBinding;
        if (ahVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar3 = null;
        }
        ahVar3.K.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.os6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserDetails.D2(this.a, view);
            }
        });
        n2().m().g(this, new o(new j()));
        n2().l().g(this, new o(new k()));
        n2().p().g(this, new o(new l()));
        U1();
        Spinner spinner = this.mSpinner;
        if (spinner == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSpinner");
            spinner = null;
        }
        spinner.setOnItemSelectedListener(new m());
        ah ahVar4 = this.mBinding;
        if (ahVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ahVar4 = null;
        }
        ahVar4.u.setOnItemSelectedListener(new n());
        LinearLayout linearLayout2 = this.em_next;
        if (linearLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("em_next");
        } else {
            linearLayout = linearLayout2;
        }
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ps6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserDetails.E2(this.a, view);
            }
        });
        n2().o().g(this, new o(new b()));
        n2().q().g(this, new o(new c()));
        n2().s().g(this, new o(new d()));
        n2().r().g(this, new o(new e()));
        n2().k().g(this, new o(new f()));
        n2().t().g(this, new o(new g()));
        n2().j().g(this, new o(new h()));
        n2().h().g(this, new o(new i()));
        r3((q11) new z(this, new p11(new f11(u2()))).a(q11.class));
        if (c0058a.a(this)) {
            String strE = new dl4(this).e();
            if (strE.equals("0")) {
                s2().show();
                z2().q();
            } else {
                try {
                    Object objFromJson = new Gson().fromJson(strE, (Class<Object>) StateMaster.class);
                    Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                    l3((StateMaster) objFromJson);
                } catch (Exception unused) {
                }
            }
        } else {
            Toast.makeText(getApplicationContext(), k2().b("label_log_check_internet", "Please check your internet connection"), 1).show();
        }
        z2().p().g(this, new mf4() { // from class: com.zepto.qs6
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                UserDetails.F2(this.a, (StateMaster) obj);
            }
        });
        z2().s().g(this, new mf4() { // from class: com.zepto.rs6
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                UserDetails.G2(this.a, (String) obj);
            }
        });
    }

    @Override // com.zepto.yf2, com.zepto.zt0, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 222) {
            if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
                t3();
                return;
            } else {
                Toast.makeText(this, getString(R.string.enable_manual_setting), 0).show();
                return;
            }
        }
        if (requestCode != 10001) {
            return;
        }
        if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
            Q1();
        } else {
            Toast.makeText(this, "Permission denied", 0).show();
        }
    }

    public final UserBloodDetails p2() {
        UserBloodDetails userBloodDetails = this.mUserService;
        if (userBloodDetails != null) {
            return userBloodDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mUserService");
        return null;
    }

    public final void p3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userGender = str;
    }

    public final EditText q2() {
        EditText editText = this.mWeight;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mWeight");
        return null;
    }

    public final void q3(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.userSessionManager = ws6Var;
    }

    public final ImageView r2() {
        ImageView imageView = this.mvvm_back;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mvvm_back");
        return null;
    }

    public final void r3(q11 q11Var) {
        Intrinsics.checkNotNullParameter(q11Var, "<set-?>");
        this.viewModel = q11Var;
    }

    public final ProgressDialog s2() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final TextView t2() {
        TextView textView = this.profile_txt;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("profile_txt");
        return null;
    }

    public final CreateAccountServices u2() {
        CreateAccountServices createAccountServices = this.retrofitService;
        if (createAccountServices != null) {
            return createAccountServices;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public void u3() {
        new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        TextView textViewW1 = W1();
        Calendar calendar = this.myCalendar;
        Calendar calendar2 = null;
        if (calendar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("myCalendar");
            calendar = null;
        }
        CharSequence charSequence = DateFormat.format("dd", calendar.getTime());
        Intrinsics.checkNotNull(charSequence, "null cannot be cast to non-null type kotlin.String");
        textViewW1.setText((String) charSequence);
        TextView textViewX1 = X1();
        Calendar calendar3 = this.myCalendar;
        if (calendar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("myCalendar");
            calendar3 = null;
        }
        CharSequence charSequence2 = DateFormat.format("MM", calendar3.getTime());
        Intrinsics.checkNotNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
        textViewX1.setText((String) charSequence2);
        TextView textViewY1 = Y1();
        Calendar calendar4 = this.myCalendar;
        if (calendar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("myCalendar");
            calendar4 = null;
        }
        CharSequence charSequence3 = DateFormat.format("yyyy", calendar4.getTime());
        Intrinsics.checkNotNull(charSequence3, "null cannot be cast to non-null type kotlin.String");
        textViewY1.setText((String) charSequence3);
        StringBuilder sb = new StringBuilder();
        Calendar calendar5 = this.myCalendar;
        if (calendar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("myCalendar");
            calendar5 = null;
        }
        CharSequence charSequence4 = DateFormat.format("dd", calendar5.getTime());
        Intrinsics.checkNotNull(charSequence4, "null cannot be cast to non-null type kotlin.String");
        sb.append((String) charSequence4);
        sb.append('-');
        Calendar calendar6 = this.myCalendar;
        if (calendar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("myCalendar");
            calendar6 = null;
        }
        CharSequence charSequence5 = DateFormat.format("MM", calendar6.getTime());
        Intrinsics.checkNotNull(charSequence5, "null cannot be cast to non-null type kotlin.String");
        sb.append((String) charSequence5);
        sb.append('-');
        Calendar calendar7 = this.myCalendar;
        if (calendar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("myCalendar");
        } else {
            calendar2 = calendar7;
        }
        CharSequence charSequence6 = DateFormat.format("yyyy", calendar2.getTime());
        Intrinsics.checkNotNull(charSequence6, "null cannot be cast to non-null type kotlin.String");
        sb.append((String) charSequence6);
        S2(sb.toString());
    }

    public final String v2() {
        String str = this.stateCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("stateCode");
        return null;
    }

    /* JADX INFO: renamed from: w2, reason: from getter */
    public final ArrayList getState_list() {
        return this.state_list;
    }

    public final CircleImageView x2() {
        CircleImageView circleImageView = this.uploadIv;
        if (circleImageView != null) {
            return circleImageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("uploadIv");
        return null;
    }

    public final ws6 y2() {
        ws6 ws6Var = this.userSessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userSessionManager");
        return null;
    }

    public final q11 z2() {
        q11 q11Var = this.viewModel;
        if (q11Var != null) {
            return q11Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }
}
