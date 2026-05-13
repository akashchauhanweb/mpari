package com.nic.mparivahan.Dashboard.ui.Home;

import android.app.Dialog;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.location.Address;
import android.location.Geocoder;
import android.location.Geocoder$GeocodeListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.denzcoskun.imageslider.ImageSlider;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import com.google.gson.Gson;
import com.nic.mparivahan.Account.Model.GetEnableStateModel;
import com.nic.mparivahan.Account.Model.State;
import com.nic.mparivahan.Account.Model.StateMaster;
import com.nic.mparivahan.Account.Model.StateX;
import com.nic.mparivahan.Citizen.Activities.TrafficHistoryHomeActivity;
import com.nic.mparivahan.Citizen.Activities.TrafficReportVioActivity;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen;
import com.nic.mparivahan.Dashboard.ChallanViewMoreActivity;
import com.nic.mparivahan.Dashboard.EnabledServices.EsActivity;
import com.nic.mparivahan.Dashboard.EnabledServices.Interfaces.ESInterface;
import com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.EnableServiceResponse;
import com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.Enabledservice;
import com.nic.mparivahan.Dashboard.OtherServices;
import com.nic.mparivahan.Dashboard.VehicleServiceHome;
import com.nic.mparivahan.Dashboard.a;
import com.nic.mparivahan.Dashboard.ui.DLServiceHome;
import com.nic.mparivahan.Dashboard.ui.Home.HomeFragment;
import com.nic.mparivahan.Dashboard.ui.VehicleServiceHomeNew;
import com.nic.mparivahan.Dashboard.ui.VirtualDocScreen;
import com.nic.mparivahan.Dl.DlInterface.DlService;
import com.nic.mparivahan.Dl.Model.DLDocument;
import com.nic.mparivahan.Dl.Model.DLServiceResponseModleV1;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.Dl.NewDlSearch;
import com.nic.mparivahan.Echallan.PaymentSearchChallan;
import com.nic.mparivahan.Echallan.SearchChallanOnlineActivity;
import com.nic.mparivahan.Echallan.VerifyPaymentChallan;
import com.nic.mparivahan.InformationService.InformationalWebView;
import com.nic.mparivahan.NewDesignActivity.MyDocActivity;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.CreateRCAlertsScreen;
import com.nic.mparivahan.RC.Model.MyRcDeletResponse;
import com.nic.mparivahan.RC.Model.RcModelsDet;
import com.nic.mparivahan.RC.RcInterface.RcService;
import com.nic.mparivahan.VahanServices.FancyServices.AuctionStatusActivity;
import com.nic.mparivahan.VahanServices.FancyServices.AvailableFancyNumberStatus;
import com.nic.mparivahan.VahanServices.FancyServices.FancyFeeReceipt;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanView.VahanMainViewScreen;
import com.nic.mparivahan.Welcome.Model.NapixTokenModel;
import com.nic.mparivahan.Welcome.NapixService;
import com.nic.mparivahan.Welcome.VersionService;
import com.nic.mparivahan.dlservices.widget.CircleImageView;
import com.zepto.a55;
import com.zepto.b55;
import com.zepto.br6;
import com.zepto.dl4;
import com.zepto.eh4;
import com.zepto.f36;
import com.zepto.f42;
import com.zepto.f80;
import com.zepto.gd1;
import com.zepto.gf;
import com.zepto.h32;
import com.zepto.h41;
import com.zepto.hf;
import com.zepto.hz0;
import com.zepto.im1;
import com.zepto.is1;
import com.zepto.jp1;
import com.zepto.js1;
import com.zepto.k18;
import com.zepto.kp7;
import com.zepto.l32;
import com.zepto.lf;
import com.zepto.ln2;
import com.zepto.mf4;
import com.zepto.mn2;
import com.zepto.mq6;
import com.zepto.n35;
import com.zepto.nf;
import com.zepto.np7;
import com.zepto.nq6;
import com.zepto.of;
import com.zepto.qk1;
import com.zepto.qt7;
import com.zepto.rg4;
import com.zepto.s14;
import com.zepto.s32;
import com.zepto.s45;
import com.zepto.sf2;
import com.zepto.st6;
import com.zepto.t03;
import com.zepto.t14;
import com.zepto.t66;
import com.zepto.ta3;
import com.zepto.tm3;
import com.zepto.tu7;
import com.zepto.uh1;
import com.zepto.um3;
import com.zepto.uy1;
import com.zepto.v14;
import com.zepto.va3;
import com.zepto.vh1;
import com.zepto.vh7;
import com.zepto.vy1;
import com.zepto.w14;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.wm3;
import com.zepto.ws6;
import com.zepto.xh4;
import com.zepto.xm3;
import com.zepto.xy1;
import com.zepto.xz5;
import com.zepto.yc5;
import com.zepto.yf2;
import com.zepto.ym3;
import com.zepto.yy0;
import com.zepto.yz0;
import com.zepto.z04;
import com.zepto.zz0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.Function;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ü\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\bA\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\bi\n\u0002\u0018\u0002\n\u0002\b]\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\t¢\u0006\u0006\bÚ\u0005\u0010Û\u0005J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\nH\u0002J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\u0010\u001a\u00020\u000eH\u0002J\u0012\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u000eH\u0002J\u0018\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002J\u0012\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001c\u001a\u00020\u000eH\u0016J&\u0010!\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010$\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010\r\u001a\u0004\u0018\u00010\bJ\u001a\u0010(\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010\b2\u0006\u0010'\u001a\u00020&H\u0016J\u001a\u0010*\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010\b2\u0006\u0010'\u001a\u00020&H\u0016J\u001a\u0010,\u001a\u00020\u000e2\b\u0010+\u001a\u0004\u0018\u00010\b2\u0006\u0010'\u001a\u00020&H\u0016J\u0018\u0010-\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"2\b\u0010\r\u001a\u0004\u0018\u00010\bJ\u0006\u0010.\u001a\u00020\u000eJ\u0006\u0010/\u001a\u00020\u000eJ\u0019\u00100\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b0\u00101J\u001a\u00103\u001a\u00020\u000e2\b\u00102\u001a\u0004\u0018\u00010\b2\u0006\u0010'\u001a\u00020&H\u0016J\u0010\u00104\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011J\u0016\u00107\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\b2\u0006\u00106\u001a\u00020&J\u000e\u00108\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\u0006\u00109\u001a\u00020\u000eJ\u000e\u0010<\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020:J\u0016\u0010>\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020\bJ!\u0010?\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b?\u0010@J!\u0010B\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\bB\u0010@J\u0016\u0010C\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010D\u001a\u00020\u000eJ\u000e\u0010E\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020\bJ\u0006\u0010F\u001a\u00020\u000eJ\b\u0010G\u001a\u00020\u000eH\u0016J\b\u0010H\u001a\u00020\u000eH\u0016R\"\u0010O\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010T\u001a\u0010\u0012\f\u0012\n Q*\u0004\u0018\u00010\b0\b0P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\"\u0010[\u001a\u00020U8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0014\u0010_\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010c\u001a\u00020`8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010g\u001a\u00020d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010i\u001a\u00020d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bh\u0010fR\u0016\u0010m\u001a\u00020j8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010o\u001a\u00020j8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bn\u0010lR\u0016\u0010q\u001a\u00020j8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bp\u0010lR\u0016\u0010u\u001a\u00020r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010y\u001a\u00020v8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bw\u0010xR\u0016\u0010{\u001a\u00020v8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bz\u0010xR\u0016\u0010}\u001a\u00020v8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b|\u0010xR\u0016\u0010\u007f\u001a\u00020j8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b~\u0010lR\u001a\u0010\u0083\u0001\u001a\u00030\u0080\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0085\u0001\u001a\u00020j8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010lR\u0019\u0010\u0088\u0001\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R*\u0010\u0090\u0001\u001a\u00030\u0089\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R)\u0010\u0096\u0001\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0091\u0001\u0010\u0087\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R(\u0010\u009c\u0001\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u0097\u0001\u0010x\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R(\u0010 \u0001\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u009d\u0001\u0010x\u001a\u0006\b\u009e\u0001\u0010\u0099\u0001\"\u0006\b\u009f\u0001\u0010\u009b\u0001R(\u0010¤\u0001\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b¡\u0001\u0010x\u001a\u0006\b¢\u0001\u0010\u0099\u0001\"\u0006\b£\u0001\u0010\u009b\u0001R(\u0010ª\u0001\u001a\u00020d8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b¥\u0001\u0010f\u001a\u0006\b¦\u0001\u0010§\u0001\"\u0006\b¨\u0001\u0010©\u0001R(\u0010®\u0001\u001a\u00020d8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b«\u0001\u0010f\u001a\u0006\b¬\u0001\u0010§\u0001\"\u0006\b\u00ad\u0001\u0010©\u0001R'\u0010±\u0001\u001a\u00020d8\u0006@\u0006X\u0086.¢\u0006\u0016\n\u0004\b\u001b\u0010f\u001a\u0006\b¯\u0001\u0010§\u0001\"\u0006\b°\u0001\u0010©\u0001R(\u0010µ\u0001\u001a\u00020d8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b²\u0001\u0010f\u001a\u0006\b³\u0001\u0010§\u0001\"\u0006\b´\u0001\u0010©\u0001R(\u0010»\u0001\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b¶\u0001\u0010l\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R(\u0010¿\u0001\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b¼\u0001\u0010l\u001a\u0006\b½\u0001\u0010¸\u0001\"\u0006\b¾\u0001\u0010º\u0001R'\u0010Â\u0001\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0016\n\u0004\b!\u0010l\u001a\u0006\bÀ\u0001\u0010¸\u0001\"\u0006\bÁ\u0001\u0010º\u0001R(\u0010Æ\u0001\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bÃ\u0001\u0010l\u001a\u0006\bÄ\u0001\u0010¸\u0001\"\u0006\bÅ\u0001\u0010º\u0001R(\u0010Ê\u0001\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bÇ\u0001\u0010l\u001a\u0006\bÈ\u0001\u0010¸\u0001\"\u0006\bÉ\u0001\u0010º\u0001R)\u0010Ñ\u0001\u001a\u00030Ë\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bG\u0010Ì\u0001\u001a\u0006\bÍ\u0001\u0010Î\u0001\"\u0006\bÏ\u0001\u0010Ð\u0001R*\u0010Õ\u0001\u001a\u00030Ë\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÒ\u0001\u0010Ì\u0001\u001a\u0006\bÓ\u0001\u0010Î\u0001\"\u0006\bÔ\u0001\u0010Ð\u0001R*\u0010Ù\u0001\u001a\u00030Ë\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÖ\u0001\u0010Ì\u0001\u001a\u0006\b×\u0001\u0010Î\u0001\"\u0006\bØ\u0001\u0010Ð\u0001R*\u0010Ý\u0001\u001a\u00030Ë\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÚ\u0001\u0010Ì\u0001\u001a\u0006\bÛ\u0001\u0010Î\u0001\"\u0006\bÜ\u0001\u0010Ð\u0001R(\u0010á\u0001\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bÞ\u0001\u0010l\u001a\u0006\bß\u0001\u0010¸\u0001\"\u0006\bà\u0001\u0010º\u0001R(\u0010å\u0001\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bâ\u0001\u0010l\u001a\u0006\bã\u0001\u0010¸\u0001\"\u0006\bä\u0001\u0010º\u0001R&\u0010é\u0001\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bæ\u0001\u0010J\u001a\u0005\bç\u0001\u0010L\"\u0005\bè\u0001\u0010NR(\u0010í\u0001\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bê\u0001\u0010x\u001a\u0006\bë\u0001\u0010\u0099\u0001\"\u0006\bì\u0001\u0010\u009b\u0001R*\u0010õ\u0001\u001a\u00030î\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bï\u0001\u0010ð\u0001\u001a\u0006\bñ\u0001\u0010ò\u0001\"\u0006\bó\u0001\u0010ô\u0001R=\u0010ÿ\u0001\u001a\u0016\u0012\u0005\u0012\u00030÷\u00010ö\u0001j\n\u0012\u0005\u0012\u00030÷\u0001`ø\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bù\u0001\u0010ú\u0001\u001a\u0006\bû\u0001\u0010ü\u0001\"\u0006\bý\u0001\u0010þ\u0001R(\u0010\u0083\u0002\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u0080\u0002\u0010l\u001a\u0006\b\u0081\u0002\u0010¸\u0001\"\u0006\b\u0082\u0002\u0010º\u0001R(\u0010\u0087\u0002\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u0084\u0002\u0010l\u001a\u0006\b\u0085\u0002\u0010¸\u0001\"\u0006\b\u0086\u0002\u0010º\u0001R(\u0010\u008b\u0002\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u0088\u0002\u0010l\u001a\u0006\b\u0089\u0002\u0010¸\u0001\"\u0006\b\u008a\u0002\u0010º\u0001R(\u0010\u008f\u0002\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u008c\u0002\u0010l\u001a\u0006\b\u008d\u0002\u0010¸\u0001\"\u0006\b\u008e\u0002\u0010º\u0001R'\u0010\u0092\u0002\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0016\n\u0004\b\u001c\u0010l\u001a\u0006\b\u0090\u0002\u0010¸\u0001\"\u0006\b\u0091\u0002\u0010º\u0001R(\u0010\u0096\u0002\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u0093\u0002\u0010l\u001a\u0006\b\u0094\u0002\u0010¸\u0001\"\u0006\b\u0095\u0002\u0010º\u0001R(\u0010\u009a\u0002\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u0097\u0002\u0010x\u001a\u0006\b\u0098\u0002\u0010\u0099\u0001\"\u0006\b\u0099\u0002\u0010\u009b\u0001R'\u0010\u009d\u0002\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0016\n\u0004\bH\u0010x\u001a\u0006\b\u009b\u0002\u0010\u0099\u0001\"\u0006\b\u009c\u0002\u0010\u009b\u0001R(\u0010¡\u0002\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u009e\u0002\u0010x\u001a\u0006\b\u009f\u0002\u0010\u0099\u0001\"\u0006\b \u0002\u0010\u009b\u0001R(\u0010¥\u0002\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b¢\u0002\u0010x\u001a\u0006\b£\u0002\u0010\u0099\u0001\"\u0006\b¤\u0002\u0010\u009b\u0001R*\u0010\u00ad\u0002\u001a\u00030¦\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b§\u0002\u0010¨\u0002\u001a\u0006\b©\u0002\u0010ª\u0002\"\u0006\b«\u0002\u0010¬\u0002R*\u0010µ\u0002\u001a\u00030®\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¯\u0002\u0010°\u0002\u001a\u0006\b±\u0002\u0010²\u0002\"\u0006\b³\u0002\u0010´\u0002R*\u0010½\u0002\u001a\u00030¶\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b·\u0002\u0010¸\u0002\u001a\u0006\b¹\u0002\u0010º\u0002\"\u0006\b»\u0002\u0010¼\u0002R(\u0010Á\u0002\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b¾\u0002\u0010x\u001a\u0006\b¿\u0002\u0010\u0099\u0001\"\u0006\bÀ\u0002\u0010\u009b\u0001R(\u0010Å\u0002\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bÂ\u0002\u0010x\u001a\u0006\bÃ\u0002\u0010\u0099\u0001\"\u0006\bÄ\u0002\u0010\u009b\u0001R)\u0010É\u0002\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÆ\u0002\u0010\u0087\u0001\u001a\u0006\bÇ\u0002\u0010\u0093\u0001\"\u0006\bÈ\u0002\u0010\u0095\u0001R(\u0010Í\u0002\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bÊ\u0002\u0010x\u001a\u0006\bË\u0002\u0010\u0099\u0001\"\u0006\bÌ\u0002\u0010\u009b\u0001R(\u0010Ñ\u0002\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bÎ\u0002\u0010x\u001a\u0006\bÏ\u0002\u0010\u0099\u0001\"\u0006\bÐ\u0002\u0010\u009b\u0001R(\u0010Õ\u0002\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bÒ\u0002\u0010x\u001a\u0006\bÓ\u0002\u0010\u0099\u0001\"\u0006\bÔ\u0002\u0010\u009b\u0001R(\u0010Ù\u0002\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bÖ\u0002\u0010x\u001a\u0006\b×\u0002\u0010\u0099\u0001\"\u0006\bØ\u0002\u0010\u009b\u0001R(\u0010Ý\u0002\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bÚ\u0002\u0010x\u001a\u0006\bÛ\u0002\u0010\u0099\u0001\"\u0006\bÜ\u0002\u0010\u009b\u0001R(\u0010á\u0002\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bÞ\u0002\u0010l\u001a\u0006\bß\u0002\u0010¸\u0001\"\u0006\bà\u0002\u0010º\u0001R*\u0010ç\u0002\u001a\u00030\u0080\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bâ\u0002\u0010\u0082\u0001\u001a\u0006\bã\u0002\u0010ä\u0002\"\u0006\bå\u0002\u0010æ\u0002R(\u0010ë\u0002\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bè\u0002\u0010l\u001a\u0006\bé\u0002\u0010¸\u0001\"\u0006\bê\u0002\u0010º\u0001R(\u0010ï\u0002\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bì\u0002\u0010l\u001a\u0006\bí\u0002\u0010¸\u0001\"\u0006\bî\u0002\u0010º\u0001R(\u0010ó\u0002\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bð\u0002\u0010x\u001a\u0006\bñ\u0002\u0010\u0099\u0001\"\u0006\bò\u0002\u0010\u009b\u0001R(\u0010÷\u0002\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bô\u0002\u0010x\u001a\u0006\bõ\u0002\u0010\u0099\u0001\"\u0006\bö\u0002\u0010\u009b\u0001R*\u0010û\u0002\u001a\u00030Ë\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bø\u0002\u0010Ì\u0001\u001a\u0006\bù\u0002\u0010Î\u0001\"\u0006\bú\u0002\u0010Ð\u0001R(\u0010ÿ\u0002\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bü\u0002\u0010x\u001a\u0006\bý\u0002\u0010\u0099\u0001\"\u0006\bþ\u0002\u0010\u009b\u0001R(\u0010\u0083\u0003\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u0080\u0003\u0010x\u001a\u0006\b\u0081\u0003\u0010\u0099\u0001\"\u0006\b\u0082\u0003\u0010\u009b\u0001R(\u0010\u0087\u0003\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u0084\u0003\u0010x\u001a\u0006\b\u0085\u0003\u0010\u0099\u0001\"\u0006\b\u0086\u0003\u0010\u009b\u0001R(\u0010\u008b\u0003\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u0088\u0003\u0010x\u001a\u0006\b\u0089\u0003\u0010\u0099\u0001\"\u0006\b\u008a\u0003\u0010\u009b\u0001R(\u0010\u008f\u0003\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u008c\u0003\u0010x\u001a\u0006\b\u008d\u0003\u0010\u0099\u0001\"\u0006\b\u008e\u0003\u0010\u009b\u0001R(\u0010\u0093\u0003\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u0090\u0003\u0010x\u001a\u0006\b\u0091\u0003\u0010\u0099\u0001\"\u0006\b\u0092\u0003\u0010\u009b\u0001R(\u0010\u0097\u0003\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u0094\u0003\u0010x\u001a\u0006\b\u0095\u0003\u0010\u0099\u0001\"\u0006\b\u0096\u0003\u0010\u009b\u0001R(\u0010\u009b\u0003\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u0098\u0003\u0010x\u001a\u0006\b\u0099\u0003\u0010\u0099\u0001\"\u0006\b\u009a\u0003\u0010\u009b\u0001R(\u0010\u009f\u0003\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u009c\u0003\u0010x\u001a\u0006\b\u009d\u0003\u0010\u0099\u0001\"\u0006\b\u009e\u0003\u0010\u009b\u0001R*\u0010§\u0003\u001a\u00030 \u00038\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¡\u0003\u0010¢\u0003\u001a\u0006\b£\u0003\u0010¤\u0003\"\u0006\b¥\u0003\u0010¦\u0003R\u0017\u0010©\u0003\u001a\u00020&8\u0002X\u0082D¢\u0006\b\n\u0006\b¨\u0003\u0010\u0087\u0001R&\u0010\u00ad\u0003\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bª\u0003\u0010J\u001a\u0005\b«\u0003\u0010L\"\u0005\b¬\u0003\u0010NR(\u0010±\u0003\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b®\u0003\u0010x\u001a\u0006\b¯\u0003\u0010\u0099\u0001\"\u0006\b°\u0003\u0010\u009b\u0001R(\u0010µ\u0003\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b²\u0003\u0010x\u001a\u0006\b³\u0003\u0010\u0099\u0001\"\u0006\b´\u0003\u0010\u009b\u0001R(\u0010¹\u0003\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b¶\u0003\u0010x\u001a\u0006\b·\u0003\u0010\u0099\u0001\"\u0006\b¸\u0003\u0010\u009b\u0001R(\u0010½\u0003\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bº\u0003\u0010x\u001a\u0006\b»\u0003\u0010\u0099\u0001\"\u0006\b¼\u0003\u0010\u009b\u0001R(\u0010Á\u0003\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b¾\u0003\u0010x\u001a\u0006\b¿\u0003\u0010\u0099\u0001\"\u0006\bÀ\u0003\u0010\u009b\u0001R(\u0010Å\u0003\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bÂ\u0003\u0010x\u001a\u0006\bÃ\u0003\u0010\u0099\u0001\"\u0006\bÄ\u0003\u0010\u009b\u0001R(\u0010É\u0003\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bÆ\u0003\u0010x\u001a\u0006\bÇ\u0003\u0010\u0099\u0001\"\u0006\bÈ\u0003\u0010\u009b\u0001R(\u0010Í\u0003\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bÊ\u0003\u0010x\u001a\u0006\bË\u0003\u0010\u0099\u0001\"\u0006\bÌ\u0003\u0010\u009b\u0001R(\u0010Ñ\u0003\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bÎ\u0003\u0010x\u001a\u0006\bÏ\u0003\u0010\u0099\u0001\"\u0006\bÐ\u0003\u0010\u009b\u0001R(\u0010Õ\u0003\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bÒ\u0003\u0010l\u001a\u0006\bÓ\u0003\u0010¸\u0001\"\u0006\bÔ\u0003\u0010º\u0001R(\u0010Ù\u0003\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bÖ\u0003\u0010l\u001a\u0006\b×\u0003\u0010¸\u0001\"\u0006\bØ\u0003\u0010º\u0001R(\u0010Ý\u0003\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bÚ\u0003\u0010l\u001a\u0006\bÛ\u0003\u0010¸\u0001\"\u0006\bÜ\u0003\u0010º\u0001R(\u0010ã\u0003\u001a\u00020`8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bÞ\u0003\u0010b\u001a\u0006\bß\u0003\u0010à\u0003\"\u0006\bá\u0003\u0010â\u0003R(\u0010ç\u0003\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bä\u0003\u0010x\u001a\u0006\bå\u0003\u0010\u0099\u0001\"\u0006\bæ\u0003\u0010\u009b\u0001R(\u0010ë\u0003\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bè\u0003\u0010l\u001a\u0006\bé\u0003\u0010¸\u0001\"\u0006\bê\u0003\u0010º\u0001R(\u0010ï\u0003\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bì\u0003\u0010x\u001a\u0006\bí\u0003\u0010\u0099\u0001\"\u0006\bî\u0003\u0010\u009b\u0001R(\u0010õ\u0003\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bð\u0003\u0010t\u001a\u0006\bñ\u0003\u0010ò\u0003\"\u0006\bó\u0003\u0010ô\u0003R(\u0010ù\u0003\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bö\u0003\u0010x\u001a\u0006\b÷\u0003\u0010\u0099\u0001\"\u0006\bø\u0003\u0010\u009b\u0001R(\u0010ý\u0003\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bú\u0003\u0010x\u001a\u0006\bû\u0003\u0010\u0099\u0001\"\u0006\bü\u0003\u0010\u009b\u0001R\u001a\u0010\u0081\u0004\u001a\u00030þ\u00038\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÿ\u0003\u0010\u0080\u0004R*\u0010\u0089\u0004\u001a\u00030\u0082\u00048\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0083\u0004\u0010\u0084\u0004\u001a\u0006\b\u0085\u0004\u0010\u0086\u0004\"\u0006\b\u0087\u0004\u0010\u0088\u0004R*\u0010\u0091\u0004\u001a\u00030\u008a\u00048\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008b\u0004\u0010\u008c\u0004\u001a\u0006\b\u008d\u0004\u0010\u008e\u0004\"\u0006\b\u008f\u0004\u0010\u0090\u0004R*\u0010\u0099\u0004\u001a\u00030\u0092\u00048\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0093\u0004\u0010\u0094\u0004\u001a\u0006\b\u0095\u0004\u0010\u0096\u0004\"\u0006\b\u0097\u0004\u0010\u0098\u0004R\u001a\u0010\u009d\u0004\u001a\u00030\u009a\u00048\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u009b\u0004\u0010\u009c\u0004R\u001a\u0010¡\u0004\u001a\u00030\u009e\u00048\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u009f\u0004\u0010 \u0004R*\u0010¥\u0004\u001a\u00030Ë\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¢\u0004\u0010Ì\u0001\u001a\u0006\b£\u0004\u0010Î\u0001\"\u0006\b¤\u0004\u0010Ð\u0001R*\u0010©\u0004\u001a\u00030Ë\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¦\u0004\u0010Ì\u0001\u001a\u0006\b§\u0004\u0010Î\u0001\"\u0006\b¨\u0004\u0010Ð\u0001R*\u0010\u00ad\u0004\u001a\u00030Ë\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bª\u0004\u0010Ì\u0001\u001a\u0006\b«\u0004\u0010Î\u0001\"\u0006\b¬\u0004\u0010Ð\u0001R)\u0010´\u0004\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b®\u0004\u0010¯\u0004\u001a\u0006\b°\u0004\u0010±\u0004\"\u0006\b²\u0004\u0010³\u0004R*\u0010¼\u0004\u001a\u00030µ\u00048\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¶\u0004\u0010·\u0004\u001a\u0006\b¸\u0004\u0010¹\u0004\"\u0006\bº\u0004\u0010»\u0004R(\u0010À\u0004\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b½\u0004\u0010x\u001a\u0006\b¾\u0004\u0010\u0099\u0001\"\u0006\b¿\u0004\u0010\u009b\u0001R(\u0010Ä\u0004\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bÁ\u0004\u0010x\u001a\u0006\bÂ\u0004\u0010\u0099\u0001\"\u0006\bÃ\u0004\u0010\u009b\u0001R(\u0010È\u0004\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bÅ\u0004\u0010x\u001a\u0006\bÆ\u0004\u0010\u0099\u0001\"\u0006\bÇ\u0004\u0010\u009b\u0001R(\u0010Ì\u0004\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bÉ\u0004\u0010x\u001a\u0006\bÊ\u0004\u0010\u0099\u0001\"\u0006\bË\u0004\u0010\u009b\u0001R(\u0010Ð\u0004\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bÍ\u0004\u0010x\u001a\u0006\bÎ\u0004\u0010\u0099\u0001\"\u0006\bÏ\u0004\u0010\u009b\u0001R(\u0010Ô\u0004\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bÑ\u0004\u0010x\u001a\u0006\bÒ\u0004\u0010\u0099\u0001\"\u0006\bÓ\u0004\u0010\u009b\u0001R(\u0010Ø\u0004\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bÕ\u0004\u0010x\u001a\u0006\bÖ\u0004\u0010\u0099\u0001\"\u0006\b×\u0004\u0010\u009b\u0001R)\u0010ß\u0004\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÙ\u0004\u0010Ú\u0004\u001a\u0006\bÛ\u0004\u0010Ü\u0004\"\u0006\bÝ\u0004\u0010Þ\u0004R*\u0010ç\u0004\u001a\u00030à\u00048\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bá\u0004\u0010â\u0004\u001a\u0006\bã\u0004\u0010ä\u0004\"\u0006\bå\u0004\u0010æ\u0004R,\u0010ï\u0004\u001a\u0005\u0018\u00010è\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bé\u0004\u0010ê\u0004\u001a\u0006\bë\u0004\u0010ì\u0004\"\u0006\bí\u0004\u0010î\u0004R*\u0010÷\u0004\u001a\u00030ð\u00048\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bñ\u0004\u0010ò\u0004\u001a\u0006\bó\u0004\u0010ô\u0004\"\u0006\bõ\u0004\u0010ö\u0004R(\u0010û\u0004\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bø\u0004\u0010l\u001a\u0006\bù\u0004\u0010¸\u0001\"\u0006\bú\u0004\u0010º\u0001R(\u0010ÿ\u0004\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bü\u0004\u0010l\u001a\u0006\bý\u0004\u0010¸\u0001\"\u0006\bþ\u0004\u0010º\u0001R(\u0010\u0083\u0005\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u0080\u0005\u0010l\u001a\u0006\b\u0081\u0005\u0010¸\u0001\"\u0006\b\u0082\u0005\u0010º\u0001R(\u0010\u0087\u0005\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u0084\u0005\u0010l\u001a\u0006\b\u0085\u0005\u0010¸\u0001\"\u0006\b\u0086\u0005\u0010º\u0001R(\u0010\u008b\u0005\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u0088\u0005\u0010l\u001a\u0006\b\u0089\u0005\u0010¸\u0001\"\u0006\b\u008a\u0005\u0010º\u0001R(\u0010\u008f\u0005\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u008c\u0005\u0010l\u001a\u0006\b\u008d\u0005\u0010¸\u0001\"\u0006\b\u008e\u0005\u0010º\u0001R(\u0010\u0093\u0005\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u0090\u0005\u0010l\u001a\u0006\b\u0091\u0005\u0010¸\u0001\"\u0006\b\u0092\u0005\u0010º\u0001R(\u0010\u0097\u0005\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u0094\u0005\u0010l\u001a\u0006\b\u0095\u0005\u0010¸\u0001\"\u0006\b\u0096\u0005\u0010º\u0001R(\u0010\u009b\u0005\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u0098\u0005\u0010l\u001a\u0006\b\u0099\u0005\u0010¸\u0001\"\u0006\b\u009a\u0005\u0010º\u0001R(\u0010\u009f\u0005\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u009c\u0005\u0010l\u001a\u0006\b\u009d\u0005\u0010¸\u0001\"\u0006\b\u009e\u0005\u0010º\u0001R*\u0010£\u0005\u001a\u00030Ë\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b \u0005\u0010Ì\u0001\u001a\u0006\b¡\u0005\u0010Î\u0001\"\u0006\b¢\u0005\u0010Ð\u0001R*\u0010«\u0005\u001a\u00030¤\u00058\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¥\u0005\u0010¦\u0005\u001a\u0006\b§\u0005\u0010¨\u0005\"\u0006\b©\u0005\u0010ª\u0005R*\u0010¯\u0005\u001a\u00030¤\u00058\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¬\u0005\u0010¦\u0005\u001a\u0006\b\u00ad\u0005\u0010¨\u0005\"\u0006\b®\u0005\u0010ª\u0005R*\u0010³\u0005\u001a\u00030¤\u00058\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b°\u0005\u0010¦\u0005\u001a\u0006\b±\u0005\u0010¨\u0005\"\u0006\b²\u0005\u0010ª\u0005R(\u0010·\u0005\u001a\u00020`8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b´\u0005\u0010b\u001a\u0006\bµ\u0005\u0010à\u0003\"\u0006\b¶\u0005\u0010â\u0003R*\u0010¿\u0005\u001a\u00030¸\u00058\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¹\u0005\u0010º\u0005\u001a\u0006\b»\u0005\u0010¼\u0005\"\u0006\b½\u0005\u0010¾\u0005R\u001a\u0010Ã\u0005\u001a\u00030À\u00058\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÁ\u0005\u0010Â\u0005R(\u0010Ç\u0005\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bÄ\u0005\u0010x\u001a\u0006\bÅ\u0005\u0010\u0099\u0001\"\u0006\bÆ\u0005\u0010\u009b\u0001R(\u0010Ë\u0005\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bÈ\u0005\u0010x\u001a\u0006\bÉ\u0005\u0010\u0099\u0001\"\u0006\bÊ\u0005\u0010\u009b\u0001R(\u0010Ï\u0005\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bÌ\u0005\u0010x\u001a\u0006\bÍ\u0005\u0010\u0099\u0001\"\u0006\bÎ\u0005\u0010\u009b\u0001R&\u0010Ò\u0005\u001a\u0012\u0012\u000e\u0012\f Q*\u0005\u0018\u00010Ð\u00050Ð\u00050P8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bÑ\u0005\u0010SR*\u0010Ô\u0005\u001a\u00030Ó\u00058\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÔ\u0005\u0010Õ\u0005\u001a\u0006\bÖ\u0005\u0010×\u0005\"\u0006\bØ\u0005\u0010Ù\u0005¨\u0006Ü\u0005"}, d2 = {"Lcom/nic/mparivahan/Dashboard/ui/Home/HomeFragment;", "Lcom/zepto/sf2;", "Lcom/zepto/vh1;", "Lcom/zepto/uh1;", "Lcom/zepto/nq6;", "Lcom/zepto/br6;", "Lcom/zepto/mq6;", "", "", "str", "", "S3", "L6", "message", "", "Q7", "T3", "Landroid/view/View;", "root", "c6", "T7", "", "lat", "lang", "a4", "Landroid/os/Bundle;", "savedInstanceState", "C0", "X0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "G0", "Landroid/content/Context;", "context", "O7", "shared_id", "", "position", "Q", "rc", "S", "rc_number", "p", "oa", "qa", "sa", "f0", "(Ljava/lang/Integer;)V", "id", "B", "o6", "value", "service_type", "W7", "j5", "ta", "Lcom/nic/mparivahan/Account/Model/StateMaster;", "it", "L9", "stateRes", "M9", "f", "(Ljava/lang/String;Ljava/lang/Integer;)V", "dl", "a", "M6", "ra", "N6", "W3", "J0", "a1", "d0", "Ljava/lang/String;", "getStat_Name", "()Ljava/lang/String;", "K9", "(Ljava/lang/String;)V", "stat_Name", "Lcom/zepto/of;", "kotlin.jvm.PlatformType", "e0", "Lcom/zepto/of;", "requestLocationPermissionLauncher", "Lcom/zepto/v14;", "Lcom/zepto/v14;", "d5", "()Lcom/zepto/v14;", "h9", "(Lcom/zepto/v14;)V", "napixViewModel", "Lcom/nic/mparivahan/Welcome/NapixService;", "g0", "Lcom/nic/mparivahan/Welcome/NapixService;", "napixService", "Landroid/widget/Spinner;", "h0", "Landroid/widget/Spinner;", "spinner", "Landroid/widget/ImageView;", "i0", "Landroid/widget/ImageView;", "llSearh", "j0", "citizen_image", "Landroid/widget/TextView;", "k0", "Landroid/widget/TextView;", "citzen_sentinal_title", "l0", "report_traffic_violation", "m0", "road_accident", "Landroid/widget/FrameLayout;", "n0", "Landroid/widget/FrameLayout;", "citizenSpinnerLinear", "Landroid/widget/LinearLayout;", "o0", "Landroid/widget/LinearLayout;", "llTax", "p0", "hp_termintion", "q0", "duplicate_rc", "r0", "full_name", "Landroidx/appcompat/widget/AppCompatEditText;", "s0", "Landroidx/appcompat/widget/AppCompatEditText;", "Search_bar", "t0", "txt_process", "u0", "I", "spnValue", "Lcom/zepto/ws6;", "v0", "Lcom/zepto/ws6;", "B5", "()Lcom/zepto/ws6;", "H9", "(Lcom/zepto/ws6;)V", "sessionManager", "w0", "getMyRcAdapterPosition", "()I", "setMyRcAdapterPosition", "(I)V", "MyRcAdapterPosition", "x0", "S4", "()Landroid/widget/LinearLayout;", "X8", "(Landroid/widget/LinearLayout;)V", "llTransportServices", "y0", "R4", "W8", "llMyDocs", "z0", "Q4", "V8", "llInformation", "A0", "I4", "()Landroid/widget/ImageView;", "N8", "(Landroid/widget/ImageView;)V", "imgTrasnport", "B0", "getImgDocs", "L8", "imgDocs", "G4", "K8", "imgCitizen", "D0", "H4", "M8", "imgServices", "E0", "K5", "()Landroid/widget/TextView;", "T9", "(Landroid/widget/TextView;)V", "txtTrasnport", "F0", "I5", "R9", "txtDocs", "H5", "Q9", "txtCitizen", "H0", "J5", "S9", "txtServices", "I0", "L5", "U9", "txt_citizen", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "r5", "()Landroidx/recyclerview/widget/RecyclerView;", "v9", "(Landroidx/recyclerview/widget/RecyclerView;)V", "rec_rc_recycler", "K0", "q5", "u9", "rec_dl_recycler", "L0", "b4", "Z7", "alerst_recycle_view", "M0", "s5", "w9", "recyclerList", "N0", "b6", "na", "virtual_rc_textview", "O0", "a6", "ma", "virtual_dl_textview", "P0", "getSelectedRcNumber", "G9", "selectedRcNumber", "Q0", "M4", "R8", "layout_options", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "R0", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "r4", "()Lcom/nic/mparivahan/DB/DatabaseHelper;", "q8", "(Lcom/nic/mparivahan/DB/DatabaseHelper;)V", "databaseHelper", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/RC/Model/Document;", "Lkotlin/collections/ArrayList;", "S0", "Ljava/util/ArrayList;", "getArrayList1", "()Ljava/util/ArrayList;", "setArrayList1", "(Ljava/util/ArrayList;)V", "arrayList1", "T0", "getDlNumber", "s8", "dlNumber", "U0", "getDlOwnerName", "u8", "dlOwnerName", "V0", "getDlOwnerAddress", "t8", "dlOwnerAddress", "W0", "getDlIssuesDate", "r8", "dlIssuesDate", "getDlValidUpTo", "v8", "dlValidUpTo", "Y0", "g5", "k9", "nodocument", "Z0", "P4", "U8", "llDashboardDl", "F4", "J8", "home_alert_layout", "b1", "j4", "i8", "challan_status_linear", "c1", "h4", "g8", "challan_payment", "Lcom/zepto/a55;", "d1", "Lcom/zepto/a55;", "Z4", "()Lcom/zepto/a55;", "e9", "(Lcom/zepto/a55;)V", "mRcViewModel", "Lcom/nic/mparivahan/RC/RcInterface/RcService;", "e1", "Lcom/nic/mparivahan/RC/RcInterface/RcService;", "Y4", "()Lcom/nic/mparivahan/RC/RcInterface/RcService;", "d9", "(Lcom/nic/mparivahan/RC/RcInterface/RcService;)V", "mRcService", "Landroid/app/ProgressDialog;", "f1", "Landroid/app/ProgressDialog;", "o5", "()Landroid/app/ProgressDialog;", "s9", "(Landroid/app/ProgressDialog;)V", "pDialog", "g1", "c5", "g9", "myvehicle", "h1", "b5", "f9", "mylicence", "i1", "getUpdatePosition", "da", "updatePosition", "j1", "O4", "T8", "llCitizen", "k1", "Z3", "Y7", "accident_layout", "l1", "x5", "B9", "reportTrafficViolationFragment", "m1", "getReport_accident", "C9", "report_accident", "n1", "J4", "O8", "info_layout", "o1", "e4", "c8", "alerts_title", "p1", "t4", "()Landroidx/appcompat/widget/AppCompatEditText;", "x8", "(Landroidx/appcompat/widget/AppCompatEditText;)V", "dl_bar_edit", "q1", "k4", "j8", "challan_status_tv", "r1", "i5", "m9", "notice_status_tv", "s1", "U5", "ga", "vehicle_viewmore", "t1", "T4", "Y8", "ll_citizen_sentinel", "u1", "i4", "h8", "challan_recyclerView", "v1", "f5", "j9", "new_learning_license", "w1", "e5", "i9", "new_driving_license", "x1", "y4", "C8", "duplicate_dl", "y1", "m4", "l8", "change_of_address_dl", "z1", "K4", "P8", "internationl_permit", "A1", "u4", "y8", "dl_extract", "B1", "X5", "ja", "viewless", "C1", "A5", "F9", "second_row_dlservice", "D1", "N4", "S8", "licence_viewmore", "Lcom/zepto/wl5;", "E1", "Lcom/zepto/wl5;", "y5", "()Lcom/zepto/wl5;", "D9", "(Lcom/zepto/wl5;)V", "sahi_session", "F1", "LOCATION_PERMISSION_CODE", "G1", "getCallfrom", "d8", "callfrom", "H1", "w4", "A8", "dlrenewal", "I1", "V5", "ha", "verify_payment_linear", "J1", "c4", "a8", "alert_mes_layout", "K1", "l4", "k8", "change_of_address_DLP", "L1", "s4", "w8", "dl_abstract", "M1", "v4", "z8", "dl_replacement", "N1", "E4", "I8", "hc", "O1", "p4", "o8", "d_ht", "P1", "q4", "p8", "d_to", "Q1", "B4", "F8", "enrolled_state_vahan", "R1", "A4", "E8", "enrolled_state_sarthi", "S1", "F5", "O9", "state_change_title", "T1", "E5", "()Landroid/widget/Spinner;", "N9", "(Landroid/widget/Spinner;)V", "state_change", "U1", "S5", "ea", "vahan_linear", "V1", "T5", "fa", "vehicle_title", "W1", "z5", "E9", "sarthi_linear", "X1", "D5", "()Landroid/widget/FrameLayout;", "J9", "(Landroid/widget/FrameLayout;)V", "spinner_state_cust", "Y1", "z4", "D8", "duplicate_dl_info", "Z1", "p5", "t9", "rc_partucular", "Lcom/nic/mparivahan/dlservices/widget/CircleImageView;", "a2", "Lcom/nic/mparivahan/dlservices/widget/CircleImageView;", "userIv", "Lcom/zepto/ln2;", "b2", "Lcom/zepto/ln2;", "d4", "()Lcom/zepto/ln2;", "b8", "(Lcom/zepto/ln2;)V", "alertsAdapter", "Lcom/zepto/tu7;", "c2", "Lcom/zepto/tu7;", "W5", "()Lcom/zepto/tu7;", "ia", "(Lcom/zepto/tu7;)V", "viewModel", "Lcom/zepto/xy1;", "d2", "Lcom/zepto/xy1;", "X4", "()Lcom/zepto/xy1;", "c9", "(Lcom/zepto/xy1;)V", "mESViewModel", "Lcom/nic/mparivahan/Dashboard/EnabledServices/Interfaces/ESInterface;", "e2", "Lcom/nic/mparivahan/Dashboard/EnabledServices/Interfaces/ESInterface;", "mESInterface", "Lcom/nic/mparivahan/Welcome/VersionService;", "f2", "Lcom/nic/mparivahan/Welcome/VersionService;", "retrofitService", "g2", "t5", "x9", "recyclerView", "h2", "v5", "z9", "recyclerView_vahan", "i2", "u5", "y9", "recyclerView_Notice", "j2", "Landroid/content/Context;", "U4", "()Landroid/content/Context;", "Z8", "(Landroid/content/Context;)V", "mContext", "Lcom/zepto/is1;", "k2", "Lcom/zepto/is1;", "W4", "()Lcom/zepto/is1;", "b9", "(Lcom/zepto/is1;)V", "mDlViewModel", "l2", "g4", "f8", "challanViewMore", "m2", "n4", "m8", "citizen_linear", "n2", "n5", "r9", "other_service_viewmore", "o2", "getOther_service_linear", "q9", "other_service_linear", "p2", "D4", "H8", "fancy_no_avaliable_status", "q2", "C4", "G8", "fancy_no_allocate_status", "r2", "x4", "B8", "downloadFancyReceipt", "s2", "Z", "getIsalert", "()Z", "setIsalert", "(Z)V", "isalert", "Lcom/nic/mparivahan/Dl/DlInterface/DlService;", "t2", "Lcom/nic/mparivahan/Dl/DlInterface/DlService;", "V4", "()Lcom/nic/mparivahan/Dl/DlInterface/DlService;", "a9", "(Lcom/nic/mparivahan/Dl/DlInterface/DlService;)V", "mDlService", "Lcom/zepto/im1;", "u2", "Lcom/zepto/im1;", "getAdapter_dl", "()Lcom/zepto/im1;", "setAdapter_dl", "(Lcom/zepto/im1;)V", "adapter_dl", "Lcom/zepto/wa3;", "v2", "Lcom/zepto/wa3;", "L4", "()Lcom/zepto/wa3;", "Q8", "(Lcom/zepto/wa3;)V", "langSession", "w2", "getTxt_ht", "Z9", "txt_ht", "x2", "Q5", "aa", "txt_rc_pert", "y2", "P5", "Y9", "txt_hc", "z2", "O5", "X9", "txt_dup_dl", "A2", "R5", "ba", "txt_replace_dl", "B2", "M5", "V9", "txt_coa_dl", "C2", "getTxt_too", "ca", "txt_too", "D2", "N5", "W9", "txt_dl_extract", "E2", "G5", "P9", "state_change_title_citizen", "F2", "m5", "p9", "otherService_textView", "G2", "l5", "o9", "otherService_recyclerView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "H2", "Landroidx/constraintlayout/widget/ConstraintLayout;", "k5", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "n9", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "otherConstraint", "I2", "f4", "e8", "challanConstraint", "J2", "h5", "l9", "noticeConstraint", "K2", "o4", "n8", "citizen_spinner", "Lcom/denzcoskun/imageslider/ImageSlider;", "L2", "Lcom/denzcoskun/imageslider/ImageSlider;", "C5", "()Lcom/denzcoskun/imageslider/ImageSlider;", "I9", "(Lcom/denzcoskun/imageslider/ImageSlider;)V", "sliderView", "Lcom/zepto/tm3;", "M2", "Lcom/zepto/tm3;", "locationHelper", "N2", "w5", "A9", "reportOffence", "O2", "Z5", "la", "viewreportlinear", "P2", "Y5", "ka", "viewreport", "Lcom/zepto/t03;", "Q2", "locationSettingsLauncher", "Lcom/zepto/qt7;", "myRcAdapter", "Lcom/zepto/qt7;", "a5", "()Lcom/zepto/qt7;", "setMyRcAdapter", "(Lcom/zepto/qt7;)V", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nHomeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeFragment.kt\ncom/nic/mparivahan/Dashboard/ui/Home/HomeFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,3268:1\n1#2:3269\n107#3:3270\n79#3,22:3271\n107#3:3293\n79#3,22:3294\n*S KotlinDebug\n*F\n+ 1 HomeFragment.kt\ncom/nic/mparivahan/Dashboard/ui/Home/HomeFragment\n*L\n2534#1:3270\n2534#1:3271,22\n2537#1:3293\n2537#1:3294,22\n*E\n"})
public final class HomeFragment extends sf2 implements vh1, uh1, nq6, br6, mq6 {

    /* JADX INFO: renamed from: A0, reason: from kotlin metadata */
    public ImageView imgTrasnport;

    /* JADX INFO: renamed from: A1, reason: from kotlin metadata */
    public LinearLayout dl_extract;

    /* JADX INFO: renamed from: A2, reason: from kotlin metadata */
    public TextView txt_replace_dl;

    /* JADX INFO: renamed from: B0, reason: from kotlin metadata */
    public ImageView imgDocs;

    /* JADX INFO: renamed from: B1, reason: from kotlin metadata */
    public LinearLayout viewless;

    /* JADX INFO: renamed from: B2, reason: from kotlin metadata */
    public TextView txt_coa_dl;

    /* JADX INFO: renamed from: C0, reason: from kotlin metadata */
    public ImageView imgCitizen;

    /* JADX INFO: renamed from: C1, reason: from kotlin metadata */
    public LinearLayout second_row_dlservice;

    /* JADX INFO: renamed from: C2, reason: from kotlin metadata */
    public TextView txt_too;

    /* JADX INFO: renamed from: D0, reason: from kotlin metadata */
    public ImageView imgServices;

    /* JADX INFO: renamed from: D1, reason: from kotlin metadata */
    public LinearLayout licence_viewmore;

    /* JADX INFO: renamed from: D2, reason: from kotlin metadata */
    public TextView txt_dl_extract;

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    public TextView txtTrasnport;

    /* JADX INFO: renamed from: E1, reason: from kotlin metadata */
    public wl5 sahi_session;

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    public TextView state_change_title_citizen;

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    public TextView txtDocs;

    /* JADX INFO: renamed from: F1, reason: from kotlin metadata */
    public final int LOCATION_PERMISSION_CODE;

    /* JADX INFO: renamed from: F2, reason: from kotlin metadata */
    public TextView otherService_textView;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    public TextView txtCitizen;

    /* JADX INFO: renamed from: G1, reason: from kotlin metadata */
    public String callfrom;

    /* JADX INFO: renamed from: G2, reason: from kotlin metadata */
    public RecyclerView otherService_recyclerView;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    public TextView txtServices;

    /* JADX INFO: renamed from: H1, reason: from kotlin metadata */
    public LinearLayout dlrenewal;

    /* JADX INFO: renamed from: H2, reason: from kotlin metadata */
    public ConstraintLayout otherConstraint;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    public TextView txt_citizen;

    /* JADX INFO: renamed from: I1, reason: from kotlin metadata */
    public LinearLayout verify_payment_linear;

    /* JADX INFO: renamed from: I2, reason: from kotlin metadata */
    public ConstraintLayout challanConstraint;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    public RecyclerView rec_rc_recycler;

    /* JADX INFO: renamed from: J1, reason: from kotlin metadata */
    public LinearLayout alert_mes_layout;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    public ConstraintLayout noticeConstraint;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    public RecyclerView rec_dl_recycler;

    /* JADX INFO: renamed from: K1, reason: from kotlin metadata */
    public LinearLayout change_of_address_DLP;

    /* JADX INFO: renamed from: K2, reason: from kotlin metadata */
    public Spinner citizen_spinner;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public RecyclerView alerst_recycle_view;

    /* JADX INFO: renamed from: L1, reason: from kotlin metadata */
    public LinearLayout dl_abstract;

    /* JADX INFO: renamed from: L2, reason: from kotlin metadata */
    public ImageSlider sliderView;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    public RecyclerView recyclerList;

    /* JADX INFO: renamed from: M1, reason: from kotlin metadata */
    public LinearLayout dl_replacement;

    /* JADX INFO: renamed from: M2, reason: from kotlin metadata */
    public tm3 locationHelper;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    public TextView virtual_rc_textview;

    /* JADX INFO: renamed from: N1, reason: from kotlin metadata */
    public LinearLayout hc;

    /* JADX INFO: renamed from: N2, reason: from kotlin metadata */
    public LinearLayout reportOffence;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    public TextView virtual_dl_textview;

    /* JADX INFO: renamed from: O1, reason: from kotlin metadata */
    public LinearLayout d_ht;

    /* JADX INFO: renamed from: O2, reason: from kotlin metadata */
    public LinearLayout viewreportlinear;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    public String selectedRcNumber;

    /* JADX INFO: renamed from: P1, reason: from kotlin metadata */
    public LinearLayout d_to;

    /* JADX INFO: renamed from: P2, reason: from kotlin metadata */
    public LinearLayout viewreport;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    public LinearLayout layout_options;

    /* JADX INFO: renamed from: Q1, reason: from kotlin metadata */
    public TextView enrolled_state_vahan;

    /* JADX INFO: renamed from: Q2, reason: from kotlin metadata */
    public final of locationSettingsLauncher;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    public DatabaseHelper databaseHelper;

    /* JADX INFO: renamed from: R1, reason: from kotlin metadata */
    public TextView enrolled_state_sarthi;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    public ArrayList arrayList1;

    /* JADX INFO: renamed from: S1, reason: from kotlin metadata */
    public TextView state_change_title;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    public TextView dlNumber;

    /* JADX INFO: renamed from: T1, reason: from kotlin metadata */
    public Spinner state_change;

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    public TextView dlOwnerName;

    /* JADX INFO: renamed from: U1, reason: from kotlin metadata */
    public LinearLayout vahan_linear;

    /* JADX INFO: renamed from: V0, reason: from kotlin metadata */
    public TextView dlOwnerAddress;

    /* JADX INFO: renamed from: V1, reason: from kotlin metadata */
    public TextView vehicle_title;

    /* JADX INFO: renamed from: W0, reason: from kotlin metadata */
    public TextView dlIssuesDate;

    /* JADX INFO: renamed from: W1, reason: from kotlin metadata */
    public LinearLayout sarthi_linear;

    /* JADX INFO: renamed from: X0, reason: from kotlin metadata */
    public TextView dlValidUpTo;

    /* JADX INFO: renamed from: X1, reason: from kotlin metadata */
    public FrameLayout spinner_state_cust;

    /* JADX INFO: renamed from: Y0, reason: from kotlin metadata */
    public TextView nodocument;

    /* JADX INFO: renamed from: Y1, reason: from kotlin metadata */
    public LinearLayout duplicate_dl_info;

    /* JADX INFO: renamed from: Z0, reason: from kotlin metadata */
    public LinearLayout llDashboardDl;

    /* JADX INFO: renamed from: Z1, reason: from kotlin metadata */
    public LinearLayout rc_partucular;

    /* JADX INFO: renamed from: a1, reason: from kotlin metadata */
    public LinearLayout home_alert_layout;

    /* JADX INFO: renamed from: a2, reason: from kotlin metadata */
    public CircleImageView userIv;

    /* JADX INFO: renamed from: b1, reason: from kotlin metadata */
    public LinearLayout challan_status_linear;

    /* JADX INFO: renamed from: b2, reason: from kotlin metadata */
    public ln2 alertsAdapter;

    /* JADX INFO: renamed from: c1, reason: from kotlin metadata */
    public LinearLayout challan_payment;

    /* JADX INFO: renamed from: c2, reason: from kotlin metadata */
    public tu7 viewModel;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public String stat_Name = "";

    /* JADX INFO: renamed from: d1, reason: from kotlin metadata */
    public a55 mRcViewModel;

    /* JADX INFO: renamed from: d2, reason: from kotlin metadata */
    public xy1 mESViewModel;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public final of requestLocationPermissionLauncher;

    /* JADX INFO: renamed from: e1, reason: from kotlin metadata */
    public RcService mRcService;

    /* JADX INFO: renamed from: e2, reason: from kotlin metadata */
    public ESInterface mESInterface;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public v14 napixViewModel;

    /* JADX INFO: renamed from: f1, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: f2, reason: from kotlin metadata */
    public VersionService retrofitService;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public final NapixService napixService;

    /* JADX INFO: renamed from: g1, reason: from kotlin metadata */
    public LinearLayout myvehicle;

    /* JADX INFO: renamed from: g2, reason: from kotlin metadata */
    public RecyclerView recyclerView;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public Spinner spinner;

    /* JADX INFO: renamed from: h1, reason: from kotlin metadata */
    public LinearLayout mylicence;

    /* JADX INFO: renamed from: h2, reason: from kotlin metadata */
    public RecyclerView recyclerView_vahan;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public ImageView llSearh;

    /* JADX INFO: renamed from: i1, reason: from kotlin metadata */
    public int updatePosition;

    /* JADX INFO: renamed from: i2, reason: from kotlin metadata */
    public RecyclerView recyclerView_Notice;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public ImageView citizen_image;

    /* JADX INFO: renamed from: j1, reason: from kotlin metadata */
    public LinearLayout llCitizen;

    /* JADX INFO: renamed from: j2, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public TextView citzen_sentinal_title;

    /* JADX INFO: renamed from: k1, reason: from kotlin metadata */
    public LinearLayout accident_layout;

    /* JADX INFO: renamed from: k2, reason: from kotlin metadata */
    public is1 mDlViewModel;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public TextView report_traffic_violation;

    /* JADX INFO: renamed from: l1, reason: from kotlin metadata */
    public LinearLayout reportTrafficViolationFragment;

    /* JADX INFO: renamed from: l2, reason: from kotlin metadata */
    public LinearLayout challanViewMore;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public TextView road_accident;

    /* JADX INFO: renamed from: m1, reason: from kotlin metadata */
    public LinearLayout report_accident;

    /* JADX INFO: renamed from: m2, reason: from kotlin metadata */
    public LinearLayout citizen_linear;

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public FrameLayout citizenSpinnerLinear;

    /* JADX INFO: renamed from: n1, reason: from kotlin metadata */
    public LinearLayout info_layout;

    /* JADX INFO: renamed from: n2, reason: from kotlin metadata */
    public LinearLayout other_service_viewmore;

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    public LinearLayout llTax;

    /* JADX INFO: renamed from: o1, reason: from kotlin metadata */
    public TextView alerts_title;

    /* JADX INFO: renamed from: o2, reason: from kotlin metadata */
    public LinearLayout other_service_linear;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public LinearLayout hp_termintion;

    /* JADX INFO: renamed from: p1, reason: from kotlin metadata */
    public AppCompatEditText dl_bar_edit;

    /* JADX INFO: renamed from: p2, reason: from kotlin metadata */
    public LinearLayout fancy_no_avaliable_status;

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    public LinearLayout duplicate_rc;

    /* JADX INFO: renamed from: q1, reason: from kotlin metadata */
    public TextView challan_status_tv;

    /* JADX INFO: renamed from: q2, reason: from kotlin metadata */
    public LinearLayout fancy_no_allocate_status;

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    public TextView full_name;

    /* JADX INFO: renamed from: r1, reason: from kotlin metadata */
    public TextView notice_status_tv;

    /* JADX INFO: renamed from: r2, reason: from kotlin metadata */
    public LinearLayout downloadFancyReceipt;

    /* JADX INFO: renamed from: s0, reason: from kotlin metadata */
    public AppCompatEditText Search_bar;

    /* JADX INFO: renamed from: s1, reason: from kotlin metadata */
    public LinearLayout vehicle_viewmore;

    /* JADX INFO: renamed from: s2, reason: from kotlin metadata */
    public boolean isalert;

    /* JADX INFO: renamed from: t0, reason: from kotlin metadata */
    public TextView txt_process;

    /* JADX INFO: renamed from: t1, reason: from kotlin metadata */
    public LinearLayout ll_citizen_sentinel;

    /* JADX INFO: renamed from: t2, reason: from kotlin metadata */
    public DlService mDlService;

    /* JADX INFO: renamed from: u0, reason: from kotlin metadata */
    public int spnValue;

    /* JADX INFO: renamed from: u1, reason: from kotlin metadata */
    public RecyclerView challan_recyclerView;

    /* JADX INFO: renamed from: u2, reason: from kotlin metadata */
    public im1 adapter_dl;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: v1, reason: from kotlin metadata */
    public LinearLayout new_learning_license;

    /* JADX INFO: renamed from: v2, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: w0, reason: from kotlin metadata */
    public int MyRcAdapterPosition;

    /* JADX INFO: renamed from: w1, reason: from kotlin metadata */
    public LinearLayout new_driving_license;

    /* JADX INFO: renamed from: w2, reason: from kotlin metadata */
    public TextView txt_ht;

    /* JADX INFO: renamed from: x0, reason: from kotlin metadata */
    public LinearLayout llTransportServices;

    /* JADX INFO: renamed from: x1, reason: from kotlin metadata */
    public LinearLayout duplicate_dl;

    /* JADX INFO: renamed from: x2, reason: from kotlin metadata */
    public TextView txt_rc_pert;

    /* JADX INFO: renamed from: y0, reason: from kotlin metadata */
    public LinearLayout llMyDocs;

    /* JADX INFO: renamed from: y1, reason: from kotlin metadata */
    public LinearLayout change_of_address_dl;

    /* JADX INFO: renamed from: y2, reason: from kotlin metadata */
    public TextView txt_hc;

    /* JADX INFO: renamed from: z0, reason: from kotlin metadata */
    public LinearLayout llInformation;

    /* JADX INFO: renamed from: z1, reason: from kotlin metadata */
    public LinearLayout internationl_permit;

    /* JADX INFO: renamed from: z2, reason: from kotlin metadata */
    public TextView txt_dup_dl;

    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: com.nic.mparivahan.Dashboard.ui.Home.HomeFragment$a$a, reason: collision with other inner class name */
        public static final class C0050a extends Lambda implements Function2 {
            public final /* synthetic */ HomeFragment c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0050a(HomeFragment homeFragment) {
                super(2);
                this.c = homeFragment;
            }

            public final void a(double d, double d2) {
                this.c.N6(this.c.a4(d, d2));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a(((Number) obj).doubleValue(), ((Number) obj2).doubleValue());
                return Unit.INSTANCE;
            }
        }

        public a() {
            super(1);
        }

        public final void a(ym3 ym3Var) {
            if (HomeFragment.this.n0()) {
                tm3 tm3Var = HomeFragment.this.locationHelper;
                if (tm3Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("locationHelper");
                    tm3Var = null;
                }
                tm3Var.b(new C0050a(HomeFragment.this));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ym3) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b implements Geocoder$GeocodeListener {
        public b() {
        }

        public void onError(String str) {
            Log.e("Geocode Error", "Failed to get location: " + str);
        }

        public void onGeocode(List addresses) {
            Intrinsics.checkNotNullParameter(addresses, "addresses");
            if (!addresses.isEmpty()) {
                Address address = (Address) addresses.get(0);
                HomeFragment homeFragment = HomeFragment.this;
                String adminArea = address.getAdminArea();
                Intrinsics.checkNotNullExpressionValue(adminArea, "getAdminArea(...)");
                homeFragment.K9(adminArea);
            }
        }
    }

    public static final class c extends Lambda implements Function2 {
        public c() {
            super(2);
        }

        public final void a(double d, double d2) {
            HomeFragment.this.N6(HomeFragment.this.a4(d, d2));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a(((Number) obj).doubleValue(), ((Number) obj2).doubleValue());
            return Unit.INSTANCE;
        }
    }

    public static final class d implements AdapterView.OnItemSelectedListener {
        public d() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            AppCompatEditText appCompatEditText = null;
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-1);
            HomeFragment.this.spnValue = i;
            if (HomeFragment.this.spnValue == 1) {
                HomeFragment.this.t4().setVisibility(0);
                AppCompatEditText appCompatEditText2 = HomeFragment.this.Search_bar;
                if (appCompatEditText2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("Search_bar");
                } else {
                    appCompatEditText = appCompatEditText2;
                }
                appCompatEditText.setVisibility(8);
                return;
            }
            try {
                AppCompatEditText appCompatEditText3 = HomeFragment.this.Search_bar;
                if (appCompatEditText3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("Search_bar");
                    appCompatEditText3 = null;
                }
                Editable text = appCompatEditText3.getText();
                Intrinsics.checkNotNull(text);
                if (text.length() > 0) {
                    AppCompatEditText appCompatEditText4 = HomeFragment.this.Search_bar;
                    if (appCompatEditText4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("Search_bar");
                        appCompatEditText4 = null;
                    }
                    appCompatEditText4.setText("");
                }
            } catch (Exception unused) {
            }
            HomeFragment.this.t4().setVisibility(8);
            AppCompatEditText appCompatEditText5 = HomeFragment.this.Search_bar;
            if (appCompatEditText5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("Search_bar");
            } else {
                appCompatEditText = appCompatEditText5;
            }
            appCompatEditText.setVisibility(0);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class e extends Lambda implements Function2 {
        public e() {
            super(2);
        }

        public final void a(double d, double d2) {
            HomeFragment.this.N6(HomeFragment.this.a4(d, d2));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a(((Number) obj).doubleValue(), ((Number) obj2).doubleValue());
            return Unit.INSTANCE;
        }
    }

    public static final class f implements AdapterView.OnItemSelectedListener {
        public f() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            if (i != 0) {
                Object selectedItem = HomeFragment.this.E5().getSelectedItem();
                Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.Account.Model.State");
                State state = (State) selectedItem;
                if (gd1.a.m(state.getStateCode())) {
                    return;
                }
                HomeFragment.this.o5().show();
                HomeFragment.this.D9(new wl5(HomeFragment.this.n()));
                HomeFragment.this.y5().v(StringsKt__StringsKt.trim((CharSequence) state.getStateCode()).toString());
                HomeFragment.this.X4().i(state.getStateCode());
                HomeFragment.this.X4().h(state.getStateCode());
                HomeFragment.this.X4().j(state.getStateCode());
                if (StringsKt__StringsJVMKt.equals(state.getStateCode(), "DL", true)) {
                    HomeFragment.this.X4().g(state.getStateCode());
                    return;
                }
                HomeFragment.this.i5().setVisibility(8);
                HomeFragment.this.u5().setVisibility(8);
                HomeFragment.this.h5().setVisibility(8);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class g extends Lambda implements Function1 {
        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            HomeFragment.this.o5().dismiss();
            Toast.makeText(HomeFragment.this.n(), "Unable to delet the Virtual RC, Please try after some times", 1).show();
        }
    }

    public static final class h extends Lambda implements Function2 {
        public h() {
            super(2);
        }

        public final void a(double d, double d2) {
            if (HomeFragment.this.n0()) {
                HomeFragment.this.a4(d, d2);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a(((Number) obj).doubleValue(), ((Number) obj2).doubleValue());
            return Unit.INSTANCE;
        }
    }

    public static final class i extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ Integer f;
        public final /* synthetic */ String g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Integer num, String str, Continuation continuation) {
            super(2, continuation);
            this.f = num;
            this.g = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((i) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return HomeFragment.this.new i(this.f, this.g, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HomeFragment homeFragment = HomeFragment.this;
            Integer num = this.f;
            Intrinsics.checkNotNull(num);
            homeFragment.da(num.intValue());
            HomeFragment.this.r4().C0(this.g);
            yf2 yf2VarN = HomeFragment.this.n();
            if (yf2VarN != null) {
                HomeFragment homeFragment2 = HomeFragment.this;
                homeFragment2.Z4().l(this.g, yf2VarN);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class j implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public j(Function1 function) {
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

    public HomeFragment() {
        of ofVarC1 = C1(new lf(), new hf() { // from class: com.zepto.io2
            @Override // com.zepto.hf
            public final void a(Object obj) {
                HomeFragment.X7(this.a, ((Boolean) obj).booleanValue());
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofVarC1, "registerForActivityResult(...)");
        this.requestLocationPermissionLauncher = ofVarC1;
        this.napixService = NapixService.INSTANCE.a();
        this.arrayList1 = new ArrayList();
        this.LOCATION_PERMISSION_CODE = 23;
        this.isalert = true;
        of ofVarC12 = C1(new nf(), new hf() { // from class: com.zepto.to2
            @Override // com.zepto.hf
            public final void a(Object obj) {
                HomeFragment.O6(this.a, (gf) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofVarC12, "registerForActivityResult(...)");
        this.locationSettingsLauncher = ofVarC12;
    }

    public static final void A6(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String str = s14.a.g() + hz0.a.w(this$0.n()) + "/dl-info-additional-class.html";
        Intent intent = new Intent(this$0.n(), (Class<?>) InformationalWebView.class);
        intent.putExtra("URL", str);
        intent.putExtra("title", this$0.O5().getText().toString());
        this$0.R1(intent);
    }

    public static final void A7(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.R1(new Intent(this$0.n(), (Class<?>) CreateRCAlertsScreen.class));
    }

    public static final void B6(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String str = s14.a.g() + hz0.a.w(this$0.n()) + "/dl-info-international.html";
        h41 h41VarA = new h41.b().a();
        Intrinsics.checkNotNullExpressionValue(h41VarA, "build(...)");
        h41VarA.a(this$0.E1(), Uri.parse(str));
    }

    public static final void B7(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.R1(new Intent(this$0.n(), (Class<?>) NewDlSearch.class));
    }

    public static final void C6(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String str = s14.a.g() + hz0.a.w(this$0.n()) + "/dl-info-fees.html";
        Intent intent = new Intent(this$0.n(), (Class<?>) InformationalWebView.class);
        intent.putExtra("URL", str);
        this$0.R1(intent);
    }

    public static final void C7(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.R1(new Intent(this$0.n(), (Class<?>) SearchChallanOnlineActivity.class));
    }

    public static final void D6(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String str = s14.a.g() + hz0.a.w(this$0.n()) + "/rc-info-duplicate-rc.html";
        h41 h41VarA = new h41.b().a();
        Intrinsics.checkNotNullExpressionValue(h41VarA, "build(...)");
        h41VarA.a(this$0.E1(), Uri.parse(str));
    }

    public static final void D7(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.R1(new Intent(this$0.n(), (Class<?>) PaymentSearchChallan.class));
    }

    public static final void E6(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String str = s14.a.g() + hz0.a.w(this$0.n()) + "/rc-info-no-objection.html";
        h41 h41VarA = new h41.b().a();
        Intrinsics.checkNotNullExpressionValue(h41VarA, "build(...)");
        h41VarA.a(this$0.E1(), Uri.parse(str));
    }

    public static final void E7(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.R1(new Intent(this$0.n(), (Class<?>) ChallanViewMoreActivity.class));
    }

    public static final void F6(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String str = s14.a.g() + hz0.a.w(this$0.n()) + "/rc-info-address-change.html";
        h41 h41VarA = new h41.b().a();
        Intrinsics.checkNotNullExpressionValue(h41VarA, "build(...)");
        h41VarA.a(this$0.E1(), Uri.parse(str));
    }

    public static final void F7(HomeFragment this$0, StateMaster stateMaster) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.o5().dismiss();
        try {
            if (!StringsKt__StringsJVMKt.equals(stateMaster.getStatusCode(), "MSTR001", true)) {
                this$0.D5().setVisibility(8);
                this$0.o5().dismiss();
                ArrayList arrayList = new ArrayList();
                Collections.sort(arrayList);
                arrayList.add(0, new State("Select State", "0", false, false, 1));
                this$0.E5().setAdapter((SpinnerAdapter) new t66(this$0.n(), arrayList));
                return;
            }
            this$0.D5().setVisibility(0);
            this$0.o5().dismiss();
            this$0.F5().setText(this$0.L4().b(va3.a.w(), "Following services are allowed for your current state"));
            ArrayList<State> states = stateMaster.getStates();
            Intrinsics.checkNotNull(states, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.Account.Model.State>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.Account.Model.State> }");
            Collections.sort(states);
            if (!states.get(0).getStateCode().equals("0")) {
                states.add(0, new State("Select State", "0", false, false, 1));
                if (states.size() > 1) {
                    states.add(states.get(1));
                }
            }
            this$0.E5().setAdapter((SpinnerAdapter) new t66(this$0.n(), states));
            String strQ = this$0.B5().q();
            int size = states.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (StringsKt__StringsJVMKt.equals(strQ, states.get(i2).getStateCode(), true)) {
                    this$0.E5().setSelection(i2);
                    return;
                }
            }
        } catch (Exception e2) {
            this$0.D5().setVisibility(8);
            this$0.o5().dismiss();
            e2.printStackTrace();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(0, new State("Select State", "0", false, false, 1));
            this$0.E5().setAdapter((SpinnerAdapter) new t66(this$0.n(), arrayList2));
        }
    }

    public static final void G6(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String str = s14.a.g() + hz0.a.w(this$0.n()) + "/rc-info-hp-endorsement.html";
        h41 h41VarA = new h41.b().a();
        Intrinsics.checkNotNullExpressionValue(h41VarA, "build(...)");
        h41VarA.a(this$0.E1(), Uri.parse(str));
    }

    public static final void G7(HomeFragment this$0, RcModelsDet rcModelsDet) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.o5().dismiss();
        try {
            if (StringsKt__StringsJVMKt.equals(rcModelsDet.getStatusCode().toString(), "NP001", true)) {
                n35.a aVar = n35.a;
                yf2 yf2VarE1 = this$0.E1();
                Intrinsics.checkNotNullExpressionValue(yf2VarE1, "requireActivity(...)");
                if (aVar.l(yf2VarE1, rcModelsDet.getNrvDetails()) > 0) {
                    this$0.d4().k(this$0.updatePosition);
                }
                yf2 yf2VarN = this$0.n();
                if (yf2VarN != null) {
                    this$0.oa(yf2VarN, this$0.L4().b(va3.a.S0(), "Vehicle alert successfully updated!"));
                }
            }
        } catch (Exception unused) {
            this$0.o5().dismiss();
        }
    }

    public static final void H6(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String str = s14.a.g() + hz0.a.w(this$0.n()) + "/ministry-advisory.html";
        h41 h41VarA = new h41.b().a();
        Intrinsics.checkNotNullExpressionValue(h41VarA, "build(...)");
        h41VarA.a(this$0.E1(), Uri.parse(str));
    }

    public static final void H7(HomeFragment this$0, MyRcDeletResponse myRcDeletResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.o5().dismiss();
            if (!StringsKt__StringsJVMKt.equals(myRcDeletResponse.getStatusCode(), "VTLD001", true)) {
                if (StringsKt__StringsJVMKt.equals(myRcDeletResponse.getStatusCode(), "VTLD007", true)) {
                    Toast.makeText(this$0.n(), "Unable to delet the Virtual RC, Please try after some times", 1).show();
                    return;
                } else {
                    Toast.makeText(this$0.n(), "Unable to delete the Virtual RC, Please try after some times", 1).show();
                    return;
                }
            }
            try {
                this$0.a5();
                throw null;
            } catch (Exception e2) {
                e2.printStackTrace();
                Toast.makeText(this$0.n(), "Unable to delet the Virtual RC, Please try after some times", 1).show();
            }
        } catch (Exception e3) {
            this$0.o5().dismiss();
            e3.printStackTrace();
            Toast.makeText(this$0.n(), "Unable to delet the Virtual RC, Please try after some times", 1).show();
        }
    }

    public static final void I6(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String str = s14.a.g() + hz0.a.w(this$0.n()) + "/dl-info-additional-class.html";
        h41 h41VarA = new h41.b().a();
        Intrinsics.checkNotNullExpressionValue(h41VarA, "build(...)");
        h41VarA.a(this$0.E1(), Uri.parse(str));
    }

    public static final void I7(HomeFragment this$0, EnableServiceResponse enableServiceResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (this$0.o5().isShowing()) {
                this$0.o5().dismiss();
            }
            if (StringsKt__StringsJVMKt.equals(enableServiceResponse.getStatusCode(), "MSTR001", true)) {
                Intent intent = new Intent(this$0.v(), (Class<?>) VehicleServiceHomeNew.class);
                intent.putExtra("state_code", this$0.B5().q());
                this$0.R1(intent);
            }
        } catch (Exception unused) {
        }
    }

    public static final void J6(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String str = s14.a.g() + hz0.a.w(this$0.n()) + "/dl-info-additional-class.html";
        h41 h41VarA = new h41.b().a();
        Intrinsics.checkNotNullExpressionValue(h41VarA, "build(...)");
        h41VarA.a(this$0.E1(), Uri.parse(str));
    }

    public static final void J7(HomeFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (this$0.o5().isShowing()) {
                this$0.o5().dismiss();
            }
        } catch (Exception unused) {
        }
    }

    public static final void K6(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String str = s14.a.g() + hz0.a.w(this$0.n()) + "/dl-info-additional-class.html";
        Intent intent = new Intent(this$0.n(), (Class<?>) InformationalWebView.class);
        intent.putExtra("URL", str);
        this$0.R1(intent);
    }

    public static final void K7(HomeFragment this$0, EnableServiceResponse enableServiceResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (StringsKt__StringsJVMKt.equals(enableServiceResponse.getStatusCode(), "MSTR001", true)) {
                if (this$0.o5().isShowing()) {
                    this$0.o5().dismiss();
                }
                Intent intent = new Intent(this$0.v(), (Class<?>) EsActivity.class);
                intent.putExtra("state_code", this$0.B5().q());
                this$0.R1(intent);
            }
        } catch (Exception unused) {
        }
    }

    private final boolean L6() {
        return yy0.a(E1(), "android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    public static final void L7(HomeFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (this$0.o5().isShowing()) {
                this$0.o5().dismiss();
            }
        } catch (Exception unused) {
        }
    }

    public static final void M7(HomeFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.D5().setVisibility(8);
        this$0.S5().setVisibility(8);
        if (str.toString().equals(hz0.a.B())) {
            this$0.d5().i();
        } else {
            this$0.o5().dismiss();
        }
    }

    public static final void N7(HomeFragment this$0, GetEnableStateModel getEnableStateModel) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.o5().dismiss();
        if (StringsKt__StringsJVMKt.equals(getEnableStateModel.getStatusCode(), "MSTR001", true)) {
            ArrayList<StateX> states = getEnableStateModel.getStates();
            a.C0049a c0049a = com.nic.mparivahan.Dashboard.a.a;
            Context contextF1 = this$0.F1();
            Intrinsics.checkNotNullExpressionValue(contextF1, "requireContext(...)");
            c0049a.d(contextF1, states);
        }
    }

    public static final void O6(HomeFragment this$0, gf gfVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (gfVar.d() != -1) {
            this$0.T3();
            Log.e("UserEn", "user  not enable the location");
            return;
        }
        tm3 tm3Var = this$0.locationHelper;
        if (tm3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("locationHelper");
            tm3Var = null;
        }
        tm3Var.b(this$0.new e());
    }

    public static final void P6(HomeFragment this$0, EnableServiceResponse enableServiceResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (this$0.o5().isShowing()) {
                this$0.o5().dismiss();
            }
            if (!StringsKt__StringsJVMKt.equals(enableServiceResponse.getStatusCode(), "MSTR001", true)) {
                this$0.S5().setVisibility(8);
                this$0.T5().setVisibility(8);
                return;
            }
            this$0.S5().setVisibility(0);
            this$0.T5().setVisibility(0);
            Object selectedItem = this$0.E5().getSelectedItem();
            Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.Account.Model.State");
            State state = (State) selectedItem;
            this$0.v5().setLayoutManager(new GridLayoutManager(this$0.U4(), 4));
            ArrayList<Enabledservice> enabledservice = enableServiceResponse.getEnabledservice();
            Collections.sort(enabledservice);
            if (enabledservice.size() <= 0) {
                this$0.S5().setVisibility(8);
                this$0.T5().setVisibility(8);
            } else {
                f42 f42Var = new f42(enabledservice, this$0.U4(), state.getStateCode());
                this$0.v5().setAdapter(f42Var);
                f42Var.j();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            this$0.S5().setVisibility(8);
            this$0.T5().setVisibility(8);
        }
    }

    public static final void P7(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void Q6(HomeFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (str.toString().equals(hz0.a.B())) {
                this$0.W5().p();
            } else if (this$0.o5().isShowing()) {
                this$0.o5().dismiss();
                this$0.S5().setVisibility(8);
                this$0.T5().setVisibility(8);
            }
        } catch (Exception unused) {
            if (this$0.o5().isShowing()) {
                this$0.o5().dismiss();
                this$0.S5().setVisibility(8);
                this$0.T5().setVisibility(8);
            }
        }
    }

    private final void Q7(String message) {
        yf2 yf2VarN = n();
        final Dialog dialog = yf2VarN != null ? new Dialog(yf2VarN) : null;
        if (dialog != null) {
            dialog.setContentView(R.layout.informlocation);
        }
        Window window = dialog != null ? dialog.getWindow() : null;
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        Intrinsics.checkNotNull(dialog != null ? (TextView) dialog.findViewById(R.id.pop_up_msg) : null, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = dialog != null ? (TextView) dialog.findViewById(R.id.accept) : null;
        Intrinsics.checkNotNull(textView, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = dialog != null ? (TextView) dialog.findViewById(R.id.deny) : null;
        Intrinsics.checkNotNull(textView2, "null cannot be cast to non-null type android.widget.TextView");
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dr2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeFragment.R7(dialog, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.er2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeFragment.S7(dialog, view);
            }
        });
        if (dialog != null) {
            dialog.show();
        }
    }

    public static final void R6(HomeFragment this$0, EnableServiceResponse enableServiceResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (StringsKt__StringsJVMKt.equals(enableServiceResponse.getStatusCode(), "MSTR001", true)) {
                Object selectedItem = this$0.E5().getSelectedItem();
                Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.Account.Model.State");
                State state = (State) selectedItem;
                this$0.z5().setVisibility(0);
                this$0.t5().setLayoutManager(new GridLayoutManager(this$0.U4(), 4));
                ArrayList<Enabledservice> enabledservice = enableServiceResponse.getEnabledservice();
                Collections.sort(enabledservice);
                if (enabledservice.size() > 0) {
                    s32 s32Var = new s32(enabledservice, this$0.U4(), state.getStateCode());
                    this$0.t5().setAdapter(s32Var);
                    s32Var.j();
                } else {
                    this$0.z5().setVisibility(8);
                }
            } else {
                this$0.z5().setVisibility(8);
            }
        } catch (Exception unused) {
            this$0.z5().setVisibility(8);
        }
    }

    public static final void R7(Dialog dialog, View view) {
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    private final boolean S3(String str) {
        int length = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.charAt(i3) == '-') {
                i2++;
            }
        }
        return i2 <= 4;
    }

    public static final void S6(HomeFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.z5().setVisibility(0);
        } catch (Exception unused) {
        }
    }

    public static final void S7(Dialog dialog, View view) {
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    private final void T3() {
        final Dialog dialog = new Dialog(E1());
        dialog.setContentView(R.layout.enable_gps_location);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_allow);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pp2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeFragment.U3(dialog, view);
            }
        });
        ((TextView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.aq2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeFragment.V3(dialog, this, view);
            }
        });
        dialog.show();
    }

    public static final void T6(HomeFragment this$0, EnableServiceResponse enableServiceResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (this$0.o5().isShowing()) {
                this$0.o5().dismiss();
            }
            if (!StringsKt__StringsJVMKt.equals(enableServiceResponse.getStatusCode(), "MSTR001", true)) {
                this$0.k4().setVisibility(8);
                this$0.i4().setVisibility(8);
                this$0.f4().setVisibility(8);
                this$0.m5().setVisibility(8);
                this$0.l5().setVisibility(8);
                this$0.k5().setVisibility(8);
                return;
            }
            this$0.k4().setVisibility(0);
            this$0.i4().setVisibility(0);
            this$0.f4().setVisibility(0);
            Object selectedItem = this$0.E5().getSelectedItem();
            Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.Account.Model.State");
            State state = (State) selectedItem;
            this$0.i4().setLayoutManager(new GridLayoutManager(this$0.U4(), 4));
            this$0.l5().setLayoutManager(new GridLayoutManager(this$0.U4(), 4));
            ArrayList<Enabledservice> enabledservice = enableServiceResponse.getEnabledservice();
            Collections.sort(enabledservice);
            if (enabledservice.size() <= 0) {
                this$0.k4().setVisibility(8);
                this$0.i4().setVisibility(8);
                this$0.f4().setVisibility(8);
                this$0.m5().setVisibility(8);
                this$0.l5().setVisibility(8);
                this$0.k5().setVisibility(8);
                return;
            }
            gd1.a aVar = gd1.a;
            if (!aVar.g(enabledservice, "2001")) {
                this$0.m5().setVisibility(8);
                this$0.l5().setVisibility(8);
                this$0.k5().setVisibility(8);
                h32 h32Var = new h32(enabledservice, this$0.U4(), state.getStateCode());
                this$0.i4().setAdapter(h32Var);
                h32Var.j();
                return;
            }
            if (aVar.i(enabledservice, "2001") > -1) {
                List<Enabledservice> listSubList = enabledservice.subList(0, aVar.i(enabledservice, "2001"));
                Intrinsics.checkNotNullExpressionValue(listSubList, "subList(...)");
                List list = CollectionsKt___CollectionsKt.toList(listSubList);
                List<Enabledservice> listSubList2 = enabledservice.subList(aVar.i(enabledservice, "2001"), enabledservice.size());
                Intrinsics.checkNotNullExpressionValue(listSubList2, "subList(...)");
                List list2 = CollectionsKt___CollectionsKt.toList(listSubList2);
                h32 h32Var2 = new h32(list, this$0.U4(), state.getStateCode());
                this$0.i4().setAdapter(h32Var2);
                h32Var2.j();
                if (list2.size() > 0) {
                    xh4 xh4Var = new xh4(list2, this$0.U4(), state.getStateCode());
                    this$0.l5().setAdapter(xh4Var);
                    xh4Var.j();
                    this$0.m5().setVisibility(0);
                    this$0.l5().setVisibility(0);
                    this$0.k5().setVisibility(0);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            this$0.k4().setVisibility(8);
            this$0.i4().setVisibility(8);
            this$0.f4().setVisibility(8);
            this$0.m5().setVisibility(8);
            this$0.l5().setVisibility(8);
            this$0.k5().setVisibility(8);
        }
    }

    public static final void U3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void U6(HomeFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (str.toString().equals(hz0.a.B())) {
                this$0.W5().p();
            } else if (this$0.o5().isShowing()) {
                this$0.o5().dismiss();
                this$0.k4().setVisibility(8);
                this$0.i4().setVisibility(8);
                this$0.m5().setVisibility(8);
                this$0.l5().setVisibility(8);
                this$0.f4().setVisibility(8);
                this$0.k5().setVisibility(8);
            }
        } catch (Exception unused) {
            if (this$0.o5().isShowing()) {
                this$0.o5().dismiss();
                this$0.k4().setVisibility(8);
                this$0.i4().setVisibility(8);
                this$0.f4().setVisibility(8);
                this$0.m5().setVisibility(8);
                this$0.l5().setVisibility(8);
                this$0.k5().setVisibility(8);
            }
        }
    }

    public static final void U7(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void V3(Dialog d2, HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        this$0.W3();
    }

    public static final void V6(HomeFragment this$0, EnableServiceResponse enableServiceResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (this$0.o5().isShowing()) {
                this$0.o5().dismiss();
            }
            if (!StringsKt__StringsJVMKt.equals(enableServiceResponse.getStatusCode(), "MSTR001", true)) {
                this$0.i5().setVisibility(8);
                this$0.u5().setVisibility(8);
                this$0.h5().setVisibility(8);
                return;
            }
            this$0.i5().setVisibility(0);
            this$0.u5().setVisibility(0);
            this$0.h5().setVisibility(0);
            Object selectedItem = this$0.E5().getSelectedItem();
            Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.Account.Model.State");
            State state = (State) selectedItem;
            this$0.u5().setLayoutManager(new GridLayoutManager(this$0.U4(), 4));
            ArrayList<Enabledservice> enabledservice = enableServiceResponse.getEnabledservice();
            Collections.sort(enabledservice);
            if (enabledservice.size() > 0) {
                l32 l32Var = new l32(enabledservice, this$0.U4(), state.getStateCode());
                this$0.u5().setAdapter(l32Var);
                l32Var.j();
            } else {
                this$0.i5().setVisibility(8);
                this$0.u5().setVisibility(8);
                this$0.h5().setVisibility(8);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            this$0.i5().setVisibility(8);
            this$0.u5().setVisibility(8);
            this$0.h5().setVisibility(8);
        }
    }

    public static final void V7(HomeFragment this$0, Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(d2, "$d");
        um3 um3Var = um3.a;
        yf2 yf2VarE1 = this$0.E1();
        Intrinsics.checkNotNullExpressionValue(yf2VarE1, "requireActivity(...)");
        um3Var.b(yf2VarE1);
        d2.dismiss();
    }

    public static final void W6(HomeFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (str.toString().equals(hz0.a.B())) {
                this$0.W5().p();
            } else if (this$0.o5().isShowing()) {
                this$0.o5().dismiss();
                this$0.i5().setVisibility(8);
                this$0.u5().setVisibility(8);
                this$0.h5().setVisibility(8);
            }
        } catch (Exception unused) {
            if (this$0.o5().isShowing()) {
                this$0.o5().dismiss();
                this$0.i5().setVisibility(8);
                this$0.u5().setVisibility(8);
                this$0.h5().setVisibility(8);
            }
        }
    }

    public static final void X3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void X6(HomeFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.o5().dismiss();
    }

    public static final void X7(HomeFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!z) {
            this$0.T7();
        } else {
            try {
                this$0.W3();
            } catch (Exception unused) {
            }
        }
    }

    public static final void Y3(HomeFragment this$0, Exception exception) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (exception instanceof yc5) {
            try {
                PendingIntent pendingIntentB = ((yc5) exception).b();
                Intrinsics.checkNotNullExpressionValue(pendingIntentB, "getResolution(...)");
                this$0.locationSettingsLauncher.a(new t03.a(pendingIntentB).a());
            } catch (IntentSender.SendIntentException unused) {
            }
        }
    }

    public static final void Y6(HomeFragment this$0, NapixTokenModel napixTokenModel) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            new ws6(this$0.n()).F(napixTokenModel.getAccess_token());
            this$0.W5().p();
        } catch (Exception unused) {
        }
    }

    public static final void Z6(String str) {
    }

    public static final void a7(HomeFragment this$0, ArrayList arrayList) throws Throwable {
        ln2 ln2Var;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isalert) {
            if (arrayList.size() > 0 && this$0.r4().z0() != null) {
                this$0.ta();
                Intrinsics.checkNotNull(arrayList);
                this$0.arrayList1 = arrayList;
                this$0.F4().setVisibility(0);
                this$0.M4().setVisibility(8);
                this$0.S4().setBackgroundResource(R.color.white);
                this$0.I4().setImageResource(R.drawable.drive);
                this$0.K5().setTextColor(Color.parseColor("#000000"));
                yf2 yf2VarN = this$0.n();
                ln2Var = yf2VarN != null ? new ln2(this$0.arrayList1, yf2VarN, this$0, this$0, this$0) : null;
                Intrinsics.checkNotNull(ln2Var);
                this$0.b8(ln2Var);
                this$0.b4().setAdapter(this$0.d4());
                this$0.d4().j();
                this$0.e4().setVisibility(0);
                this$0.c4().setVisibility(8);
                this$0.b4().setVisibility(0);
                return;
            }
            if (arrayList.size() <= 0) {
                Log.e("Alerts", "Alerts--20");
                this$0.e4().setVisibility(8);
                this$0.F4().setVisibility(0);
                this$0.M4().setVisibility(8);
                this$0.S4().setBackgroundResource(R.color.white);
                this$0.I4().setImageResource(R.drawable.drive);
                this$0.K5().setTextColor(Color.parseColor("#000000"));
                this$0.c4().setVisibility(0);
                return;
            }
            Log.e("Alerts", "Alerts--22");
            Intrinsics.checkNotNull(arrayList);
            this$0.arrayList1 = arrayList;
            this$0.s5().setVisibility(8);
            this$0.F4().setVisibility(0);
            this$0.M4().setVisibility(8);
            this$0.S4().setBackgroundResource(R.color.white);
            this$0.I4().setImageResource(R.drawable.drive);
            this$0.K5().setTextColor(Color.parseColor("#000000"));
            yf2 yf2VarN2 = this$0.n();
            ln2Var = yf2VarN2 != null ? new ln2(this$0.arrayList1, yf2VarN2, this$0, this$0, this$0) : null;
            Intrinsics.checkNotNull(ln2Var);
            this$0.b8(ln2Var);
            this$0.b4().setAdapter(this$0.d4());
            this$0.d4().j();
            this$0.e4().setVisibility(0);
            this$0.c4().setVisibility(8);
            this$0.b4().setVisibility(0);
        }
    }

    public static final void b7(HomeFragment this$0, String str) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Log.e("Alerts", "Alerts--2");
        if (this$0.isalert) {
            if (this$0.r4().z0() == null) {
                Log.e("Alerts", "Alerts--24");
                this$0.e4().setVisibility(8);
                this$0.F4().setVisibility(0);
                this$0.M4().setVisibility(8);
                this$0.S4().setBackgroundResource(R.color.white);
                this$0.I4().setImageResource(R.drawable.drive);
                this$0.K5().setTextColor(Color.parseColor("#000000"));
                this$0.c4().setVisibility(0);
                this$0.b4().setVisibility(8);
                this$0.s5().setVisibility(8);
                return;
            }
            Log.e("Alerts", "Alerts--23");
            this$0.ta();
            this$0.b4().setVisibility(8);
            this$0.s5().setVisibility(0);
            this$0.F4().setVisibility(0);
            this$0.M4().setVisibility(8);
            this$0.S4().setBackgroundResource(R.color.white);
            this$0.I4().setImageResource(R.drawable.drive);
            this$0.K5().setTextColor(Color.parseColor("#000000"));
            this$0.e4().setVisibility(0);
            this$0.c4().setVisibility(8);
        }
    }

    public static final void c7(HomeFragment this$0, DLServiceResponseModleV1 dLServiceResponseModleV1) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.r4().P0(StringsKt__StringsKt.trim((CharSequence) dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlLicno()).toString(), dLServiceResponseModleV1.getDldetobj().get(0));
            im1 im1Var = this$0.adapter_dl;
            if (im1Var != null) {
                im1Var.j();
            }
            yf2 yf2VarN = this$0.n();
            if (yf2VarN != null) {
                this$0.oa(yf2VarN, this$0.L4().b(va3.a.j(), "Driving Licence alert successfully updated!"));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void d6(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.isalert = false;
        this$0.R4().setBackgroundResource(R.color.white);
        this$0.Q4().setBackgroundResource(R.color.white);
        this$0.H4().setImageResource(R.drawable.ic_informational_services);
        this$0.H4().setColorFilter((ColorFilter) null);
        this$0.I5().setTextColor(Color.parseColor("#000000"));
        this$0.J5().setTextColor(Color.parseColor("#000000"));
        this$0.R1(new Intent(this$0.n(), (Class<?>) VirtualDocScreen.class));
    }

    public static final void d7(String str) {
    }

    public static final void e6(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.isalert = false;
        yf2 yf2VarN = this$0.n();
        if (yf2VarN == null || !com.nic.mparivahan.a.a.a(yf2VarN)) {
            Toast.makeText(this$0.n(), this$0.L4().b("label_log_check_internet", this$0.c0(R.string.kindly_check_your_internet_connection)), 0).show();
            return;
        }
        this$0.P4().setVisibility(8);
        this$0.a6().setVisibility(8);
        this$0.b6().setVisibility(8);
        this$0.r5().setVisibility(8);
        this$0.g5().setVisibility(8);
        this$0.F4().setVisibility(8);
        this$0.Z3().setVisibility(8);
        this$0.J4().setVisibility(0);
        TextView textView = this$0.txt_process;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txt_process");
            textView = null;
        }
        textView.setVisibility(8);
        this$0.S4().setBackgroundResource(R.color.white);
        this$0.R4().setBackgroundResource(R.color.white);
        this$0.O4().setBackgroundResource(R.color.white);
        this$0.T4().setBackgroundResource(R.color.white);
        this$0.Q4().setBackgroundResource(R.drawable.corner_rectangle_bg_17);
        this$0.H4().setColorFilter(Color.argb(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE));
        this$0.K5().setTextColor(Color.parseColor("#000000"));
        this$0.I5().setTextColor(Color.parseColor("#000000"));
        this$0.H5().setTextColor(Color.parseColor("#000000"));
        this$0.L5().setTextColor(Color.parseColor("#000000"));
        this$0.J5().setTextColor(Color.parseColor("#FFFFFF"));
        this$0.G4().setColorFilter((ColorFilter) null);
        ImageView imageView = this$0.citizen_image;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("citizen_image");
            imageView = null;
        }
        imageView.setColorFilter((ColorFilter) null);
        this$0.G4().setImageResource(R.drawable.dms_docs);
        this$0.I4().setImageResource(R.drawable.drive);
        this$0.M4().setVisibility(8);
    }

    public static final void e7(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.R1(new Intent(this$0.n(), (Class<?>) OtherServices.class));
    }

    public static final void f6(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.isalert = false;
        yf2 yf2VarN = this$0.n();
        if (yf2VarN == null || !com.nic.mparivahan.a.a.a(yf2VarN)) {
            Toast.makeText(this$0.n(), this$0.L4().b("label_log_check_internet", this$0.c0(R.string.kindly_check_your_internet_connection)), 0).show();
            return;
        }
        yf2 yf2VarN2 = this$0.n();
        if (yf2VarN2 != null && gd1.a.e(yf2VarN2)) {
            np7.a aVar = np7.a;
            yf2 yf2VarE1 = this$0.E1();
            Intrinsics.checkNotNullExpressionValue(yf2VarE1, "requireActivity(...)");
            aVar.c(yf2VarE1);
            return;
        }
        um3 um3Var = um3.a;
        yf2 yf2VarE12 = this$0.E1();
        Intrinsics.checkNotNullExpressionValue(yf2VarE12, "requireActivity(...)");
        if (!um3Var.a(yf2VarE12)) {
            this$0.requestLocationPermissionLauncher.a("android.permission.ACCESS_FINE_LOCATION");
            return;
        }
        try {
            Object systemService = this$0.F1().getSystemService("location");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
            if (!((LocationManager) systemService).isProviderEnabled("gps")) {
                this$0.W3();
                return;
            }
            if (this$0.stat_Name.length() > 0) {
                this$0.N6(this$0.stat_Name);
                return;
            }
            tm3 tm3Var = this$0.locationHelper;
            if (tm3Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("locationHelper");
                tm3Var = null;
            }
            tm3Var.b(this$0.new c());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void f7(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0.n(), (Class<?>) AvailableFancyNumberStatus.class);
        intent.putExtra("ServiceName", "Available Fancy No. Status");
        this$0.R1(intent);
    }

    public static final void g6(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        new vh7(this$0.n()).h(VContant.DUPLICATE_RC, VContant.DUPLICATE_RC_CODE);
        this$0.R1(new Intent(this$0.n(), (Class<?>) VahanMainViewScreen.class));
    }

    public static final void g7(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0.n(), (Class<?>) AuctionStatusActivity.class);
        intent.putExtra("ServiceName", "Auction Status");
        this$0.R1(intent);
    }

    public static final void h6(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        new vh7(this$0.n()).h(VContant.HYPOTHICATION_TERMINATION, VContant.HYPOTHICATION_TERMINATION_CODE);
        this$0.R1(new Intent(this$0.n(), (Class<?>) VahanMainViewScreen.class));
    }

    public static final void h7(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0.n(), (Class<?>) FancyFeeReceipt.class);
        intent.putExtra("ServiceName", "View Fancy No. Fee Receipt");
        this$0.R1(intent);
    }

    public static final void i6(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.R1(new Intent(this$0.n(), (Class<?>) TrafficHistoryHomeActivity.class));
    }

    public static final void i7(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String str = s14.a.g() + hz0.a.w(this$0.n()) + "/rc-info-ownership.html";
        h41 h41VarA = new h41.b().a();
        Intrinsics.checkNotNullExpressionValue(h41VarA, "build(...)");
        h41VarA.a(this$0.E1(), Uri.parse(str));
    }

    public static final void j6(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        yf2 yf2VarN = this$0.n();
        if (yf2VarN != null) {
            gd1.a.l(yf2VarN);
        }
        AppCompatEditText appCompatEditText = this$0.Search_bar;
        Spinner spinner = null;
        if (appCompatEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("Search_bar");
            appCompatEditText = null;
        }
        String strValueOf = String.valueOf(appCompatEditText.getText());
        yf2 yf2VarN2 = this$0.n();
        if (yf2VarN2 != null && gd1.a.e(yf2VarN2)) {
            np7.a aVar = np7.a;
            yf2 yf2VarE1 = this$0.E1();
            Intrinsics.checkNotNullExpressionValue(yf2VarE1, "requireActivity(...)");
            aVar.c(yf2VarE1);
            return;
        }
        Spinner spinner2 = this$0.spinner;
        if (spinner2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spinner");
        } else {
            spinner = spinner2;
        }
        if (spinner.getSelectedItemPosition() == 1) {
            yf2 yf2VarN3 = this$0.n();
            if (yf2VarN3 == null || !com.nic.mparivahan.a.a.a(yf2VarN3)) {
                Toast.makeText(this$0.n(), this$0.L4().b("label_log_check_internet", this$0.c0(R.string.kindly_check_your_internet_connection)), 0).show();
                return;
            } else {
                this$0.W7(String.valueOf(this$0.t4().getText()), 1);
                return;
            }
        }
        yf2 yf2VarN4 = this$0.n();
        if (yf2VarN4 == null || !com.nic.mparivahan.a.a.a(yf2VarN4)) {
            Toast.makeText(this$0.n(), this$0.L4().b("label_log_check_internet", this$0.c0(R.string.kindly_check_your_internet_connection)), 0).show();
        } else {
            this$0.W7(strValueOf, 2);
        }
    }

    public static final void j7(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String str = s14.a.g() + hz0.a.w(this$0.n()) + "/rc-info-hp-termination.html";
        h41 h41VarA = new h41.b().a();
        Intrinsics.checkNotNullExpressionValue(h41VarA, "build(...)");
        h41VarA.a(this$0.E1(), Uri.parse(str));
    }

    public static final void k6(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.isalert = false;
        yf2 yf2VarN = this$0.n();
        if (yf2VarN == null || !com.nic.mparivahan.a.a.a(yf2VarN)) {
            Toast.makeText(this$0.n(), this$0.L4().b("label_log_check_internet", this$0.c0(R.string.kindly_check_your_internet_connection)), 0).show();
            return;
        }
        yf2 yf2VarN2 = this$0.n();
        if (yf2VarN2 != null && gd1.a.e(yf2VarN2)) {
            np7.a aVar = np7.a;
            yf2 yf2VarE1 = this$0.E1();
            Intrinsics.checkNotNullExpressionValue(yf2VarE1, "requireActivity(...)");
            aVar.c(yf2VarE1);
            return;
        }
        this$0.g5().setVisibility(8);
        this$0.P4().setVisibility(8);
        this$0.a6().setVisibility(8);
        this$0.b6().setVisibility(8);
        this$0.r5().setVisibility(8);
        this$0.F4().setVisibility(8);
        this$0.Z3().setVisibility(8);
        this$0.J4().setVisibility(8);
        this$0.S4().setBackgroundResource(R.drawable.corner_rectangle_bg_17);
        this$0.R4().setBackgroundResource(R.color.white);
        this$0.O4().setBackgroundResource(R.color.white);
        this$0.Q4().setBackgroundResource(R.color.white);
        this$0.T4().setBackgroundResource(R.color.white);
        this$0.K5().setTextColor(Color.parseColor("#FFFFFF"));
        this$0.I5().setTextColor(Color.parseColor("#000000"));
        this$0.H5().setTextColor(Color.parseColor("#000000"));
        this$0.J5().setTextColor(Color.parseColor("#000000"));
        this$0.L5().setTextColor(Color.parseColor("#000000"));
        this$0.G4().setImageResource(R.drawable.dms_docs);
        this$0.I4().setImageResource(R.drawable.ic_transport_selected);
        this$0.H4().setImageResource(R.drawable.ic_informational_services);
        TextView textView = null;
        this$0.H4().setColorFilter((ColorFilter) null);
        this$0.G4().setColorFilter((ColorFilter) null);
        ImageView imageView = this$0.citizen_image;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("citizen_image");
            imageView = null;
        }
        imageView.setColorFilter((ColorFilter) null);
        this$0.M4().setVisibility(0);
        TextView textView2 = this$0.txt_process;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txt_process");
        } else {
            textView = textView2;
        }
        textView.setVisibility(8);
        this$0.T5().setVisibility(8);
        String strE = new dl4(this$0.n()).e();
        if (strE.equals("0")) {
            Log.e("State", VContant.MAINSCREEN);
            this$0.o5().show();
            this$0.W5().p();
        } else {
            try {
                Log.e("State", VContant.APPLICATION_SCREEN);
                Object objFromJson = new Gson().fromJson(strE, (Class<Object>) StateMaster.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this$0.L9((StateMaster) objFromJson);
            } catch (Exception unused) {
            }
        }
    }

    public static final void k7(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String str = s14.a.g() + hz0.a.w(this$0.n()) + "/dl-info-duplicate-dl.html";
        Intent intent = new Intent(this$0.n(), (Class<?>) InformationalWebView.class);
        intent.putExtra("title", this$0.O5().getText().toString());
        intent.putExtra("URL", str);
        this$0.R1(intent);
    }

    public static final void l6(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        yf2 yf2VarN = this$0.n();
        if (yf2VarN == null || !com.nic.mparivahan.a.a.a(yf2VarN)) {
            Toast.makeText(this$0.n(), this$0.L4().b("label_log_check_internet", this$0.c0(R.string.kindly_check_your_internet_connection)), 0).show();
        } else if (this$0.L6()) {
            this$0.d8("0");
            this$0.R1(new Intent(this$0.n(), (Class<?>) TrafficReportVioActivity.class));
        } else {
            this$0.d8("0");
            this$0.Q7("jn");
        }
    }

    public static final void l7(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String str = s14.a.g() + hz0.a.w(this$0.n()) + "/rc-info-registration-particulars.html";
        Intent intent = new Intent(this$0.n(), (Class<?>) InformationalWebView.class);
        intent.putExtra("title", this$0.Q5().getText().toString());
        intent.putExtra("URL", str);
        this$0.R1(intent);
    }

    public static final void m6(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        yf2 yf2VarN = this$0.n();
        if (yf2VarN == null || !gd1.a.e(yf2VarN)) {
            this$0.isalert = false;
            this$0.R1(new Intent(this$0.n(), (Class<?>) MyDocActivity.class));
        } else {
            np7.a aVar = np7.a;
            yf2 yf2VarE1 = this$0.E1();
            Intrinsics.checkNotNullExpressionValue(yf2VarE1, "requireActivity(...)");
            aVar.c(yf2VarE1);
        }
    }

    public static final void m7(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String str = s14.a.g() + hz0.a.w(this$0.n()) + "/rc-info-hpt-continuation.html";
        Intent intent = new Intent(this$0.n(), (Class<?>) InformationalWebView.class);
        intent.putExtra("title", this$0.P5().getText().toString());
        intent.putExtra("URL", str);
        this$0.R1(intent);
    }

    public static final void n6(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.R1(new Intent(this$0.n(), (Class<?>) VerifyPaymentChallan.class));
    }

    public static final void n7(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String str = s14.a.g() + hz0.a.w(this$0.n()) + "/dl-info-replacement.html";
        Intent intent = new Intent(this$0.n(), (Class<?>) InformationalWebView.class);
        intent.putExtra("title", this$0.R5().getText().toString());
        intent.putExtra("URL", str);
        this$0.R1(intent);
    }

    public static final void o7(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String str = s14.a.g() + hz0.a.w(this$0.n()) + "/dl-info-change-of-address.html";
        Intent intent = new Intent(this$0.n(), (Class<?>) InformationalWebView.class);
        intent.putExtra("title", this$0.M5().getText().toString());
        intent.putExtra("URL", str);
        this$0.R1(intent);
    }

    public static final void p6(View view) {
    }

    public static final void p7(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String str = s14.a.g() + hz0.a.w(this$0.n()) + "/dl-info-extract.html";
        Intent intent = new Intent(this$0.n(), (Class<?>) InformationalWebView.class);
        intent.putExtra("URL", str);
        intent.putExtra("title", this$0.N5().getText().toString());
        this$0.R1(intent);
    }

    public static final void pa(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void q6(View view) {
    }

    public static final void q7(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0.n(), (Class<?>) DlServicesMainScreen.class);
        this$0.D9(new wl5(this$0.n()));
        this$0.y5().t("Renewal of DL", VContant.MAINSCREEN);
        this$0.R1(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void r6(HomeFragment this$0, Ref.ObjectRef txt_virtual_rc, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(txt_virtual_rc, "$txt_virtual_rc");
        String str = s14.a.g() + hz0.a.w(this$0.n()) + "/rc-info.html";
        Intent intent = new Intent(this$0.n(), (Class<?>) InformationalWebView.class);
        intent.putExtra("URL", str);
        intent.putExtra("title", ((TextView) txt_virtual_rc.element).getText().toString());
        this$0.R1(intent);
    }

    public static final void r7(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0.n(), (Class<?>) DlServicesMainScreen.class);
        this$0.D9(new wl5(this$0.n()));
        this$0.y5().t("Change of Address in DL", "3");
        this$0.R1(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void s6(HomeFragment this$0, Ref.ObjectRef virtual_dl_textview, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(virtual_dl_textview, "$virtual_dl_textview");
        String str = s14.a.g() + hz0.a.w(this$0.n()) + "/dl-info.html";
        Intent intent = new Intent(this$0.n(), (Class<?>) InformationalWebView.class);
        intent.putExtra("URL", str);
        intent.putExtra("title", ((TextView) virtual_dl_textview.element).getText().toString());
        this$0.R1(intent);
    }

    public static final void s7(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0.n(), (Class<?>) DlServicesMainScreen.class);
        this$0.D9(new wl5(this$0.n()));
        this$0.y5().t("Issue of Duplicate DL", VContant.APPLICATION_SCREEN);
        this$0.R1(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void t6(HomeFragment this$0, Ref.ObjectRef txt_shared_rc, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(txt_shared_rc, "$txt_shared_rc");
        String str = s14.a.g() + hz0.a.w(this$0.n()) + "/shared-received-virtual-rc-info.html";
        Intent intent = new Intent(this$0.n(), (Class<?>) InformationalWebView.class);
        intent.putExtra("URL", str);
        intent.putExtra("title", ((TextView) txt_shared_rc.element).getText().toString());
        this$0.R1(intent);
    }

    public static final void t7(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0.n(), (Class<?>) DlServicesMainScreen.class);
        this$0.D9(new wl5(this$0.n()));
        this$0.y5().t("Issue of Duplicate DL", VContant.APPLICATION_SCREEN);
        this$0.R1(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void u6(HomeFragment this$0, Ref.ObjectRef txt_rcv_rc, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(txt_rcv_rc, "$txt_rcv_rc");
        String str = s14.a.g() + hz0.a.w(this$0.n()) + "/shared-received-virtual-rc-info.html";
        Intent intent = new Intent(this$0.n(), (Class<?>) InformationalWebView.class);
        intent.putExtra("URL", str);
        intent.putExtra("title", ((TextView) txt_rcv_rc.element).getText().toString());
        this$0.R1(intent);
    }

    public static final void u7(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0.n(), (Class<?>) DlServicesMainScreen.class);
        this$0.D9(new wl5(this$0.n()));
        this$0.y5().t("Change of Address in DL", "3");
        this$0.R1(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void v6(HomeFragment this$0, Ref.ObjectRef txt_rc_search, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(txt_rc_search, "$txt_rc_search");
        String str = s14.a.g() + hz0.a.w(this$0.n()) + "/search-rc-info.html";
        Intent intent = new Intent(this$0.n(), (Class<?>) InformationalWebView.class);
        intent.putExtra("URL", str);
        intent.putExtra("title", ((TextView) txt_rc_search.element).getText().toString());
        this$0.R1(intent);
    }

    public static final void v7(View view) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void w6(HomeFragment this$0, Ref.ObjectRef txt_dl_search, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(txt_dl_search, "$txt_dl_search");
        String str = s14.a.g() + hz0.a.w(this$0.n()) + "/search-dl-info.html";
        Intent intent = new Intent(this$0.n(), (Class<?>) InformationalWebView.class);
        intent.putExtra("URL", str);
        intent.putExtra("title", ((TextView) txt_dl_search.element).getText().toString());
        this$0.R1(intent);
    }

    public static final void w7(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0.n(), (Class<?>) DlServicesMainScreen.class);
        this$0.D9(new wl5(this$0.n()));
        this$0.y5().t("DL Extract", VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE);
        this$0.R1(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void x6(HomeFragment this$0, Ref.ObjectRef txt_dl_search, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(txt_dl_search, "$txt_dl_search");
        String str = s14.a.g() + hz0.a.w(this$0.n()) + "/dl-info-learner-dl.html";
        Intent intent = new Intent(this$0.n(), (Class<?>) InformationalWebView.class);
        intent.putExtra("URL", str);
        intent.putExtra("title", ((TextView) txt_dl_search.element).getText().toString());
        this$0.R1(intent);
    }

    public static final void x7(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.R1(new Intent(this$0.n(), (Class<?>) DLServiceHome.class));
    }

    public static final void y6(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String str = s14.a.g() + hz0.a.w(this$0.n()) + "/dl-info-permanent-dl.html";
        Intent intent = new Intent(this$0.n(), (Class<?>) InformationalWebView.class);
        intent.putExtra("URL", str);
        this$0.R1(intent);
    }

    public static final void y7(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.A5().setVisibility(8);
        this$0.N4().setVisibility(0);
        this$0.y4().setVisibility(8);
    }

    public static final void z6(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String str = s14.a.g() + hz0.a.w(this$0.n()) + "/dl-info-renewal-dl.html";
        h41 h41VarA = new h41.b().a();
        Intrinsics.checkNotNullExpressionValue(h41VarA, "build(...)");
        h41VarA.a(this$0.E1(), Uri.parse(str));
    }

    public static final void z7(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.R1(new Intent(this$0.n(), (Class<?>) VehicleServiceHome.class));
    }

    public final TextView A4() {
        TextView textView = this.enrolled_state_sarthi;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("enrolled_state_sarthi");
        return null;
    }

    public final LinearLayout A5() {
        LinearLayout linearLayout = this.second_row_dlservice;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("second_row_dlservice");
        return null;
    }

    public final void A8(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.dlrenewal = linearLayout;
    }

    public final void A9(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.reportOffence = linearLayout;
    }

    @Override // com.zepto.nq6
    public void B(String id, int position) {
    }

    public final TextView B4() {
        TextView textView = this.enrolled_state_vahan;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("enrolled_state_vahan");
        return null;
    }

    public final ws6 B5() {
        ws6 ws6Var = this.sessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
        return null;
    }

    public final void B8(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.downloadFancyReceipt = linearLayout;
    }

    public final void B9(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.reportTrafficViolationFragment = linearLayout;
    }

    @Override // com.zepto.sf2
    public void C0(Bundle savedInstanceState) {
        super.C0(savedInstanceState);
        H9(new ws6(n()));
        s9(new ProgressDialog(n()));
        o5().setMessage("Please wait...");
        o5().setCancelable(false);
        o5().setCanceledOnTouchOutside(false);
        try {
            yf2 yf2VarE1 = E1();
            Intrinsics.checkNotNullExpressionValue(yf2VarE1, "requireActivity(...)");
            this.locationHelper = new tm3(yf2VarE1);
        } catch (Exception unused) {
        }
    }

    public final LinearLayout C4() {
        LinearLayout linearLayout = this.fancy_no_allocate_status;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fancy_no_allocate_status");
        return null;
    }

    public final ImageSlider C5() {
        ImageSlider imageSlider = this.sliderView;
        if (imageSlider != null) {
            return imageSlider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sliderView");
        return null;
    }

    public final void C8(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.duplicate_dl = linearLayout;
    }

    public final void C9(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.report_accident = linearLayout;
    }

    public final LinearLayout D4() {
        LinearLayout linearLayout = this.fancy_no_avaliable_status;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fancy_no_avaliable_status");
        return null;
    }

    public final FrameLayout D5() {
        FrameLayout frameLayout = this.spinner_state_cust;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("spinner_state_cust");
        return null;
    }

    public final void D8(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.duplicate_dl_info = linearLayout;
    }

    public final void D9(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sahi_session = wl5Var;
    }

    public final LinearLayout E4() {
        LinearLayout linearLayout = this.hc;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("hc");
        return null;
    }

    public final Spinner E5() {
        Spinner spinner = this.state_change;
        if (spinner != null) {
            return spinner;
        }
        Intrinsics.throwUninitializedPropertyAccessException("state_change");
        return null;
    }

    public final void E8(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.enrolled_state_sarthi = textView;
    }

    public final void E9(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.sarthi_linear = linearLayout;
    }

    public final LinearLayout F4() {
        LinearLayout linearLayout = this.home_alert_layout;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("home_alert_layout");
        return null;
    }

    public final TextView F5() {
        TextView textView = this.state_change_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("state_change_title");
        return null;
    }

    public final void F8(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.enrolled_state_vahan = textView;
    }

    public final void F9(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.second_row_dlservice = linearLayout;
    }

    @Override // com.zepto.sf2
    public View G0(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.fragment_dashboard, container, false);
        try {
            new dl4(n());
            yf2 yf2VarE1 = E1();
            Intrinsics.checkNotNullExpressionValue(yf2VarE1, "requireActivity(...)");
            Z8(yf2VarE1);
            Q8(new wa3(U4()));
            DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(n());
            Intrinsics.checkNotNullExpressionValue(databaseHelperD0, "getInstance(...)");
            q8(databaseHelperD0);
            RcService.Companion companion = RcService.INSTANCE;
            Context contextF1 = F1();
            Intrinsics.checkNotNullExpressionValue(contextF1, "requireContext(...)");
            d9(companion.a(contextF1));
            ESInterface.Companion companion2 = ESInterface.INSTANCE;
            Context contextF12 = F1();
            Intrinsics.checkNotNullExpressionValue(contextF12, "requireContext(...)");
            this.mESInterface = companion2.a(contextF12);
            VersionService.Companion companion3 = VersionService.INSTANCE;
            Context contextF13 = F1();
            Intrinsics.checkNotNullExpressionValue(contextF13, "requireContext(...)");
            this.retrofitService = companion3.a(contextF13);
            DlService.Companion companion4 = DlService.INSTANCE;
            Context contextF14 = F1();
            Intrinsics.checkNotNullExpressionValue(contextF14, "requireContext(...)");
            a9(companion4.a(contextF14));
            VersionService versionService = this.retrofitService;
            ESInterface eSInterface = null;
            if (versionService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
                versionService = null;
            }
            ia((tu7) new z(this, new z04(new kp7(versionService))).a(tu7.class));
            h9((v14) new z(this, new w14(new t14(this.napixService))).a(v14.class));
            b9((is1) new z(this, new js1(new jp1(V4()))).a(is1.class));
            View viewFindViewById = viewInflate.findViewById(R.id.es_sarathi_recyclerView);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            x9((RecyclerView) viewFindViewById);
            View viewFindViewById2 = viewInflate.findViewById(R.id.es_vahan_recyclerView);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            z9((RecyclerView) viewFindViewById2);
            View viewFindViewById3 = viewInflate.findViewById(R.id.notice_recyclerView);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            y9((RecyclerView) viewFindViewById3);
            View viewFindViewById4 = viewInflate.findViewById(R.id.citizen_linear);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            m8((LinearLayout) viewFindViewById4);
            c6(viewInflate);
            o6(viewInflate);
            yf2 yf2VarN = n();
            if (yf2VarN != null) {
                ta3.a aVar = ta3.a;
                Intrinsics.checkNotNull(viewInflate);
                aVar.t1(yf2VarN, viewInflate);
            }
            B4().setText("Enrolled States");
            B4().setPaintFlags(B4().getPaintFlags() | 8);
            A4().setText("Enrolled States");
            A4().setPaintFlags(A4().getPaintFlags() | 8);
            if (B5().p().length() <= 0 || Intrinsics.areEqual(B5().p(), "0")) {
                CircleImageView circleImageView = this.userIv;
                if (circleImageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userIv");
                    circleImageView = null;
                }
                circleImageView.setImageResource(R.drawable.avtar);
            } else {
                Bitmap bitmapC = st6.c(B5().p());
                if (bitmapC != null) {
                    CircleImageView circleImageView2 = this.userIv;
                    if (circleImageView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("userIv");
                        circleImageView2 = null;
                    }
                    circleImageView2.setImageBitmap(bitmapC);
                }
            }
            ESInterface eSInterface2 = this.mESInterface;
            if (eSInterface2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mESInterface");
            } else {
                eSInterface = eSInterface2;
            }
            c9((xy1) new z(this, new uy1(new vy1(eSInterface))).a(xy1.class));
            yf2 yf2VarN2 = n();
            if (yf2VarN2 != null) {
                W5().o().g(yf2VarN2, new mf4() { // from class: com.zepto.lq2
                    @Override // com.zepto.mf4
                    public final void a(Object obj) {
                        HomeFragment.F7(this.a, (StateMaster) obj);
                    }
                });
            }
            yf2 yf2VarN3 = n();
            if (yf2VarN3 != null) {
                W5().q().g(yf2VarN3, new mf4() { // from class: com.zepto.wn2
                    @Override // com.zepto.mf4
                    public final void a(Object obj) {
                        HomeFragment.M7(this.a, (String) obj);
                    }
                });
            }
            yf2 yf2VarN4 = n();
            if (yf2VarN4 != null) {
                X4().s().g(yf2VarN4, new mf4() { // from class: com.zepto.ho2
                    @Override // com.zepto.mf4
                    public final void a(Object obj) {
                        HomeFragment.P6(this.a, (EnableServiceResponse) obj);
                    }
                });
            }
            yf2 yf2VarN5 = n();
            if (yf2VarN5 != null) {
                X4().v().g(yf2VarN5, new mf4() { // from class: com.zepto.uo2
                    @Override // com.zepto.mf4
                    public final void a(Object obj) {
                        HomeFragment.Q6(this.a, (String) obj);
                    }
                });
            }
            yf2 yf2VarN6 = n();
            if (yf2VarN6 != null) {
                X4().m().g(yf2VarN6, new mf4() { // from class: com.zepto.gp2
                    @Override // com.zepto.mf4
                    public final void a(Object obj) {
                        HomeFragment.R6(this.a, (EnableServiceResponse) obj);
                    }
                });
            }
            yf2 yf2VarN7 = n();
            if (yf2VarN7 != null) {
                X4().p().g(yf2VarN7, new mf4() { // from class: com.zepto.hp2
                    @Override // com.zepto.mf4
                    public final void a(Object obj) {
                        HomeFragment.S6(this.a, (String) obj);
                    }
                });
            }
            yf2 yf2VarN8 = n();
            if (yf2VarN8 != null) {
                X4().n().g(yf2VarN8, new mf4() { // from class: com.zepto.ip2
                    @Override // com.zepto.mf4
                    public final void a(Object obj) {
                        HomeFragment.T6(this.a, (EnableServiceResponse) obj);
                    }
                });
            }
            yf2 yf2VarN9 = n();
            if (yf2VarN9 != null) {
                X4().o().g(yf2VarN9, new mf4() { // from class: com.zepto.jp2
                    @Override // com.zepto.mf4
                    public final void a(Object obj) {
                        HomeFragment.U6(this.a, (String) obj);
                    }
                });
            }
            yf2 yf2VarN10 = n();
            if (yf2VarN10 != null) {
                X4().q().g(yf2VarN10, new mf4() { // from class: com.zepto.kp2
                    @Override // com.zepto.mf4
                    public final void a(Object obj) {
                        HomeFragment.V6(this.a, (EnableServiceResponse) obj);
                    }
                });
            }
            yf2 yf2VarN11 = n();
            if (yf2VarN11 != null) {
                X4().r().g(yf2VarN11, new mf4() { // from class: com.zepto.lp2
                    @Override // com.zepto.mf4
                    public final void a(Object obj) {
                        HomeFragment.W6(this.a, (String) obj);
                    }
                });
            }
            E5().setOnItemSelectedListener(new f());
            yf2 yf2VarN12 = n();
            if (yf2VarN12 != null) {
                W5().m().g(yf2VarN12, new mf4() { // from class: com.zepto.wq2
                    @Override // com.zepto.mf4
                    public final void a(Object obj) {
                        HomeFragment.X6(this.a, (String) obj);
                    }
                });
            }
            yf2 yf2VarN13 = n();
            if (yf2VarN13 != null) {
                d5().g().g(yf2VarN13, new mf4() { // from class: com.zepto.fr2
                    @Override // com.zepto.mf4
                    public final void a(Object obj) {
                        HomeFragment.Y6(this.a, (NapixTokenModel) obj);
                    }
                });
            }
            yf2 yf2VarN14 = n();
            if (yf2VarN14 != null) {
                d5().k().g(yf2VarN14, new mf4() { // from class: com.zepto.on2
                    @Override // com.zepto.mf4
                    public final void a(Object obj) {
                        HomeFragment.Z6((String) obj);
                    }
                });
            }
            yf2 yf2VarN15 = n();
            if (yf2VarN15 != null) {
                W5().h().g(yf2VarN15, new mf4() { // from class: com.zepto.pn2
                    @Override // com.zepto.mf4
                    public final void a(Object obj) throws Throwable {
                        HomeFragment.a7(this.a, (ArrayList) obj);
                    }
                });
            }
            yf2 yf2VarN16 = n();
            if (yf2VarN16 != null) {
                W5().i().g(yf2VarN16, new mf4() { // from class: com.zepto.qn2
                    @Override // com.zepto.mf4
                    public final void a(Object obj) throws Throwable {
                        HomeFragment.b7(this.a, (String) obj);
                    }
                });
            }
            yf2 yf2VarN17 = n();
            if (yf2VarN17 != null) {
                W4().n().g(yf2VarN17, new mf4() { // from class: com.zepto.rn2
                    @Override // com.zepto.mf4
                    public final void a(Object obj) throws Throwable {
                        HomeFragment.c7(this.a, (DLServiceResponseModleV1) obj);
                    }
                });
            }
            yf2 yf2VarN18 = n();
            if (yf2VarN18 != null) {
                W4().o().g(yf2VarN18, new mf4() { // from class: com.zepto.sn2
                    @Override // com.zepto.mf4
                    public final void a(Object obj) {
                        HomeFragment.d7((String) obj);
                    }
                });
            }
            n5().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tn2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeFragment.e7(this.a, view);
                }
            });
            D4().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.un2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeFragment.f7(this.a, view);
                }
            });
            C4().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vn2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeFragment.g7(this.a, view);
                }
            });
            x4().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xn2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeFragment.h7(this.a, view);
                }
            });
            q4().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yn2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeFragment.i7(this.a, view);
                }
            });
            p4().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zn2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeFragment.j7(this.a, view);
                }
            });
            z4().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ao2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeFragment.k7(this.a, view);
                }
            });
            p5().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bo2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeFragment.l7(this.a, view);
                }
            });
            E4().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.co2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeFragment.m7(this.a, view);
                }
            });
            v4().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.do2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeFragment.n7(this.a, view);
                }
            });
            l4().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.eo2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeFragment.o7(this.a, view);
                }
            });
            s4().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fo2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeFragment.p7(this.a, view);
                }
            });
            w4().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.go2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeFragment.q7(this.a, view);
                }
            });
            f5().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jo2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeFragment.r7(this.a, view);
                }
            });
            e5().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ko2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeFragment.s7(this.a, view);
                }
            });
            y4().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.lo2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeFragment.t7(this.a, view);
                }
            });
            m4().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mo2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeFragment.u7(this.a, view);
                }
            });
            K4().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.no2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeFragment.v7(view);
                }
            });
            u4().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.oo2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeFragment.w7(this.a, view);
                }
            });
            N4().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.po2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeFragment.x7(this.a, view);
                }
            });
            X5().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qo2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeFragment.y7(this.a, view);
                }
            });
            P4().setVisibility(8);
            a6().setVisibility(8);
            b6().setVisibility(8);
            r5().setVisibility(8);
            g5().setVisibility(8);
            U5().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ro2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeFragment.z7(this.a, view);
                }
            });
            c5().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.so2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeFragment.A7(this.a, view);
                }
            });
            b5().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vo2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeFragment.B7(this.a, view);
                }
            });
            j4().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wo2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeFragment.C7(this.a, view);
                }
            });
            h4().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xo2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeFragment.D7(this.a, view);
                }
            });
            g4().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yo2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeFragment.E7(this.a, view);
                }
            });
            r5().setLayoutManager(new LinearLayoutManager(n(), 0, false));
            q5().setLayoutManager(new LinearLayoutManager(n(), 0, false));
            b4().setLayoutManager(new LinearLayoutManager(n(), 0, false));
            e9((a55) new z(this, new b55(new s45(Y4()))).a(a55.class));
            yf2 yf2VarN19 = n();
            if (yf2VarN19 != null) {
                Z4().p().g(yf2VarN19, new mf4() { // from class: com.zepto.zo2
                    @Override // com.zepto.mf4
                    public final void a(Object obj) {
                        HomeFragment.G7(this.a, (RcModelsDet) obj);
                    }
                });
            }
            yf2 yf2VarN20 = n();
            if (yf2VarN20 != null) {
                Z4().z().g(yf2VarN20, new mf4() { // from class: com.zepto.ap2
                    @Override // com.zepto.mf4
                    public final void a(Object obj) {
                        HomeFragment.H7(this.a, (MyRcDeletResponse) obj);
                    }
                });
            }
            yf2 yf2VarN21 = n();
            if (yf2VarN21 != null) {
                Z4().A().g(yf2VarN21, new j(new g()));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        Context contextV = v();
        if (contextV != null) {
            Intrinsics.checkNotNull(viewInflate);
            M6(contextV, viewInflate);
        }
        yf2 yf2VarN22 = n();
        if (yf2VarN22 != null) {
            X4().t().g(yf2VarN22, new mf4() { // from class: com.zepto.bp2
                @Override // com.zepto.mf4
                public final void a(Object obj) {
                    HomeFragment.I7(this.a, (EnableServiceResponse) obj);
                }
            });
        }
        yf2 yf2VarN23 = n();
        if (yf2VarN23 != null) {
            X4().u().g(yf2VarN23, new mf4() { // from class: com.zepto.cp2
                @Override // com.zepto.mf4
                public final void a(Object obj) {
                    HomeFragment.J7(this.a, (String) obj);
                }
            });
        }
        yf2 yf2VarN24 = n();
        if (yf2VarN24 != null) {
            X4().k().g(yf2VarN24, new mf4() { // from class: com.zepto.dp2
                @Override // com.zepto.mf4
                public final void a(Object obj) {
                    HomeFragment.K7(this.a, (EnableServiceResponse) obj);
                }
            });
        }
        yf2 yf2VarN25 = n();
        if (yf2VarN25 != null) {
            X4().l().g(yf2VarN25, new mf4() { // from class: com.zepto.fp2
                @Override // com.zepto.mf4
                public final void a(Object obj) {
                    HomeFragment.L7(this.a, (String) obj);
                }
            });
        }
        return viewInflate;
    }

    public final ImageView G4() {
        ImageView imageView = this.imgCitizen;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imgCitizen");
        return null;
    }

    public final TextView G5() {
        TextView textView = this.state_change_title_citizen;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("state_change_title_citizen");
        return null;
    }

    public final void G8(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.fancy_no_allocate_status = linearLayout;
    }

    public final void G9(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.selectedRcNumber = str;
    }

    public final ImageView H4() {
        ImageView imageView = this.imgServices;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imgServices");
        return null;
    }

    public final TextView H5() {
        TextView textView = this.txtCitizen;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txtCitizen");
        return null;
    }

    public final void H8(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.fancy_no_avaliable_status = linearLayout;
    }

    public final void H9(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    public final ImageView I4() {
        ImageView imageView = this.imgTrasnport;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imgTrasnport");
        return null;
    }

    public final TextView I5() {
        TextView textView = this.txtDocs;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txtDocs");
        return null;
    }

    public final void I8(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.hc = linearLayout;
    }

    public final void I9(ImageSlider imageSlider) {
        Intrinsics.checkNotNullParameter(imageSlider, "<set-?>");
        this.sliderView = imageSlider;
    }

    @Override // com.zepto.sf2
    public void J0() {
        super.J0();
        tm3 tm3Var = this.locationHelper;
        if (tm3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("locationHelper");
            tm3Var = null;
        }
        tm3Var.d();
        C5().m();
    }

    public final LinearLayout J4() {
        LinearLayout linearLayout = this.info_layout;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("info_layout");
        return null;
    }

    public final TextView J5() {
        TextView textView = this.txtServices;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txtServices");
        return null;
    }

    public final void J8(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.home_alert_layout = linearLayout;
    }

    public final void J9(FrameLayout frameLayout) {
        Intrinsics.checkNotNullParameter(frameLayout, "<set-?>");
        this.spinner_state_cust = frameLayout;
    }

    public final LinearLayout K4() {
        LinearLayout linearLayout = this.internationl_permit;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internationl_permit");
        return null;
    }

    public final TextView K5() {
        TextView textView = this.txtTrasnport;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txtTrasnport");
        return null;
    }

    public final void K8(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.imgCitizen = imageView;
    }

    public final void K9(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stat_Name = str;
    }

    public final wa3 L4() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final TextView L5() {
        TextView textView = this.txt_citizen;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txt_citizen");
        return null;
    }

    public final void L8(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.imgDocs = imageView;
    }

    public final void L9(StateMaster it) {
        Intrinsics.checkNotNullParameter(it, "it");
        try {
            if (!StringsKt__StringsJVMKt.equals(it.getStatusCode(), "MSTR001", true)) {
                D5().setVisibility(8);
                o5().dismiss();
                ArrayList arrayList = new ArrayList();
                Collections.sort(arrayList);
                arrayList.add(0, new State("Select State", "0", false, false, 1));
                if (arrayList.size() > 1) {
                    arrayList.add(arrayList.get(1));
                }
                E5().setAdapter((SpinnerAdapter) new t66(n(), arrayList));
                return;
            }
            D5().setVisibility(0);
            o5().dismiss();
            F5().setText(L4().b(va3.a.w(), "Following services are allowed for your current state"));
            ArrayList<State> states = it.getStates();
            Intrinsics.checkNotNull(states, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.Account.Model.State>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.Account.Model.State> }");
            Collections.sort(states);
            if (!states.get(0).getStateCode().equals("0")) {
                states.add(0, new State("Select State", "0", false, false, 1));
                if (states.size() > 1) {
                    states.add(states.get(1));
                }
            }
            E5().setAdapter((SpinnerAdapter) new t66(n(), states));
            String strQ = B5().q();
            int size = states.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (StringsKt__StringsJVMKt.equals(strQ, states.get(i2).getStateCode(), true)) {
                    E5().setSelection(i2);
                    return;
                }
            }
        } catch (Exception e2) {
            D5().setVisibility(8);
            o5().dismiss();
            e2.printStackTrace();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(0, new State("Select State", "0", false, false, 1));
            if (arrayList2.size() > 1) {
                arrayList2.add(arrayList2.get(1));
            }
            E5().setAdapter((SpinnerAdapter) new t66(n(), arrayList2));
        }
    }

    public final LinearLayout M4() {
        LinearLayout linearLayout = this.layout_options;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("layout_options");
        return null;
    }

    public final TextView M5() {
        TextView textView = this.txt_coa_dl;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txt_coa_dl");
        return null;
    }

    public final void M6(Context context, View root) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(root, "root");
        K5().setText(L4().b("trans_services", context.getString(R.string.trans_services)));
        H5().setText(L4().b("my_docs", context.getString(R.string.my_docs)));
        J5().setText(L4().b("inf_Serv", context.getString(R.string.inf_Serv)));
        I5().setText(L4().b("txt_md", context.getString(R.string.txt_md)));
        L5().setText(L4().b("label_citizen_sentinel", context.getString(R.string.citizen_sentinel)));
        View viewFindViewById = root.findViewById(R.id.label_pull_rc_and_dl);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = root.findViewById(R.id.label_vrc_and_dl);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(L4().b("label_pull_rc_and_dl", "Please use the facility available in this app to pull your RC/DL from Transport Repository."));
        ((TextView) viewFindViewById2).setText(L4().b("label_vrc_and_dl", "You can place your Vehicle Registration Certificates and Driving Licence."));
        View viewFindViewById3 = root.findViewById(R.id.welcome);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById4 = root.findViewById(R.id.dl_related_service);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(L4().b("welcome", "Welcome"));
        T5().setText(L4().b("label_vehicle_related", "Vehicle Services"));
        k4().setText(L4().b("label_challan_related", "Challan Services"));
        ((TextView) viewFindViewById4).setText(L4().b("label_driving_licence_related", "Driving Licence Services"));
    }

    public final void M8(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.imgServices = imageView;
    }

    public final void M9(StateMaster it, String stateRes) {
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNullParameter(stateRes, "stateRes");
        try {
            if (!StringsKt__StringsJVMKt.equals(it.getStatusCode(), "MSTR001", true)) {
                Log.e("Track--ex1", stateRes);
                o5().dismiss();
                ArrayList arrayList = new ArrayList();
                Collections.sort(arrayList);
                arrayList.add(0, new State("Select State", "0", false, false, 1));
                if (arrayList.size() > 1) {
                    arrayList.add(arrayList.get(1));
                }
                o4().setAdapter((SpinnerAdapter) new t66(n(), arrayList));
                return;
            }
            o5().dismiss();
            ArrayList<State> states = it.getStates();
            Intrinsics.checkNotNull(states, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.Account.Model.State>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.Account.Model.State> }");
            ArrayList arrayList2 = new ArrayList();
            Collections.sort(states);
            if (!states.get(0).getStateCode().equals("0")) {
                states.add(0, new State("Select State", "0", false, false, 1));
                if (states.size() > 1) {
                    states.add(states.get(1));
                }
                int size = states.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (states.get(i2).isSentinal()) {
                        arrayList2.add(states.get(i2));
                    }
                }
            }
            if (arrayList2.size() <= 0) {
                G5().setText(L4().b("citizenNotavailable", "Currently Citizen Sentinel Service is not available"));
                n4().setVisibility(8);
                FrameLayout frameLayout = this.citizenSpinnerLinear;
                if (frameLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("citizenSpinnerLinear");
                    frameLayout = null;
                }
                frameLayout.setVisibility(8);
                return;
            }
            G5().setVisibility(0);
            G5().setText(L4().b(va3.a.e(), "Citizen Sentinel service are allowed for current states"));
            o4().setAdapter((SpinnerAdapter) new t66(n(), arrayList2));
            String strQ = B5().q();
            String strE = hz0.a.E(stateRes);
            if (StringsKt__StringsJVMKt.isBlank(stateRes)) {
                o4().setEnabled(false);
                w5().setVisibility(0);
                Z5().setVisibility(8);
                if (arrayList2.size() > 1) {
                    o4().setSelection(1);
                }
            }
            if (!StringsKt__StringsJVMKt.isBlank(strE) && !StringsKt__StringsJVMKt.equals(strE, "NA", true)) {
                strQ = strE;
            }
            Log.e("Track--", strQ);
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                if (StringsKt__StringsJVMKt.equals(strQ, ((State) arrayList2.get(i3)).getStateCode(), true)) {
                    o4().setSelection(i3);
                    o4().setEnabled(false);
                    w5().setVisibility(0);
                    Z5().setVisibility(8);
                    return;
                }
            }
        } catch (Exception e2) {
            Log.e("Track--ex11", stateRes);
            D5().setVisibility(8);
            o5().dismiss();
            e2.printStackTrace();
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(0, new State("Select State", "0", false, false, 1));
            if (arrayList3.size() > 1) {
                arrayList3.add(arrayList3.get(1));
            }
            o4().setAdapter((SpinnerAdapter) new t66(n(), arrayList3));
        }
    }

    public final LinearLayout N4() {
        LinearLayout linearLayout = this.licence_viewmore;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("licence_viewmore");
        return null;
    }

    public final TextView N5() {
        TextView textView = this.txt_dl_extract;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txt_dl_extract");
        return null;
    }

    public final void N6(String stateRes) {
        Intrinsics.checkNotNullParameter(stateRes, "stateRes");
        if (C5() != null) {
            C5().m();
        }
        P4().setVisibility(8);
        a6().setVisibility(8);
        b6().setVisibility(8);
        r5().setVisibility(8);
        g5().setVisibility(8);
        F4().setVisibility(8);
        Z3().setVisibility(0);
        J4().setVisibility(8);
        TextView textView = this.txt_process;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txt_process");
            textView = null;
        }
        textView.setVisibility(8);
        S4().setBackgroundResource(R.color.white);
        R4().setBackgroundResource(R.color.white);
        O4().setBackgroundResource(R.color.white);
        Q4().setBackgroundResource(R.color.white);
        T4().setBackgroundResource(R.drawable.corner_rectangle_bg_17);
        ImageView imageView = this.citizen_image;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("citizen_image");
            imageView = null;
        }
        imageView.setColorFilter(Color.argb(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE));
        K5().setTextColor(Color.parseColor("#000000"));
        I5().setTextColor(Color.parseColor("#000000"));
        H5().setTextColor(Color.parseColor("#000000"));
        J5().setTextColor(Color.parseColor("#000000"));
        L5().setTextColor(Color.parseColor("#FFFFFF"));
        G4().setColorFilter((ColorFilter) null);
        H4().setColorFilter((ColorFilter) null);
        G4().setImageResource(R.drawable.dms_docs);
        I4().setImageResource(R.drawable.drive);
        M4().setVisibility(8);
        String strE = new dl4(n()).e();
        if (strE.equals("0")) {
            G5().setVisibility(4);
            o4().setVisibility(4);
        } else {
            try {
                Object objFromJson = new Gson().fromJson(strE, (Class<Object>) StateMaster.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                M9((StateMaster) objFromJson, stateRes);
            } catch (Exception unused) {
            }
        }
    }

    public final void N8(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.imgTrasnport = imageView;
    }

    public final void N9(Spinner spinner) {
        Intrinsics.checkNotNullParameter(spinner, "<set-?>");
        this.state_change = spinner;
    }

    public final LinearLayout O4() {
        LinearLayout linearLayout = this.llCitizen;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("llCitizen");
        return null;
    }

    public final TextView O5() {
        TextView textView = this.txt_dup_dl;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txt_dup_dl");
        return null;
    }

    public final void O7(Context context, String message) {
        final Dialog dialog = new Dialog(E1());
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
        ((TextView) viewFindViewById3).setText(L4().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(L4().b("btn_ok", "OK"));
        ((TextView) viewFindViewById).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cr2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeFragment.P7(dialog, view);
            }
        });
        dialog.show();
    }

    public final void O8(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.info_layout = linearLayout;
    }

    public final void O9(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.state_change_title = textView;
    }

    public final LinearLayout P4() {
        LinearLayout linearLayout = this.llDashboardDl;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("llDashboardDl");
        return null;
    }

    public final TextView P5() {
        TextView textView = this.txt_hc;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txt_hc");
        return null;
    }

    public final void P8(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.internationl_permit = linearLayout;
    }

    public final void P9(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.state_change_title_citizen = textView;
    }

    @Override // com.zepto.vh1
    public void Q(String shared_id, int position) {
    }

    public final LinearLayout Q4() {
        LinearLayout linearLayout = this.llInformation;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("llInformation");
        return null;
    }

    public final TextView Q5() {
        TextView textView = this.txt_rc_pert;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txt_rc_pert");
        return null;
    }

    public final void Q8(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void Q9(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtCitizen = textView;
    }

    public final LinearLayout R4() {
        LinearLayout linearLayout = this.llMyDocs;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("llMyDocs");
        return null;
    }

    public final TextView R5() {
        TextView textView = this.txt_replace_dl;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txt_replace_dl");
        return null;
    }

    public final void R8(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.layout_options = linearLayout;
    }

    public final void R9(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtDocs = textView;
    }

    @Override // com.zepto.uh1
    public void S(String rc, int position) {
    }

    public final LinearLayout S4() {
        LinearLayout linearLayout = this.llTransportServices;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("llTransportServices");
        return null;
    }

    public final LinearLayout S5() {
        LinearLayout linearLayout = this.vahan_linear;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vahan_linear");
        return null;
    }

    public final void S8(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.licence_viewmore = linearLayout;
    }

    public final void S9(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtServices = textView;
    }

    public final LinearLayout T4() {
        LinearLayout linearLayout = this.ll_citizen_sentinel;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ll_citizen_sentinel");
        return null;
    }

    public final TextView T5() {
        TextView textView = this.vehicle_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vehicle_title");
        return null;
    }

    public final void T7() {
        final Dialog dialog = new Dialog(E1());
        dialog.setContentView(R.layout.location_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_allow);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById3 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.op2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeFragment.U7(dialog, view);
            }
        });
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qp2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeFragment.V7(this.a, dialog, view);
            }
        });
        dialog.show();
    }

    public final void T8(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.llCitizen = linearLayout;
    }

    public final void T9(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtTrasnport = textView;
    }

    public final Context U4() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final LinearLayout U5() {
        LinearLayout linearLayout = this.vehicle_viewmore;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vehicle_viewmore");
        return null;
    }

    public final void U8(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.llDashboardDl = linearLayout;
    }

    public final void U9(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txt_citizen = textView;
    }

    public final DlService V4() {
        DlService dlService = this.mDlService;
        if (dlService != null) {
            return dlService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDlService");
        return null;
    }

    public final LinearLayout V5() {
        LinearLayout linearLayout = this.verify_payment_linear;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("verify_payment_linear");
        return null;
    }

    public final void V8(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.llInformation = linearLayout;
    }

    public final void V9(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txt_coa_dl = textView;
    }

    public final void W3() {
        LocationRequest locationRequestA = new LocationRequest.a(100, 1000L).d(true).a();
        Intrinsics.checkNotNullExpressionValue(locationRequestA, "build(...)");
        xm3.a aVarA = new xm3.a().a(locationRequestA);
        Intrinsics.checkNotNullExpressionValue(aVarA, "addLocationRequest(...)");
        xz5 xz5VarC = wm3.c(E1());
        Intrinsics.checkNotNullExpressionValue(xz5VarC, "getSettingsClient(...)");
        Task taskC = xz5VarC.c(aVarA.b());
        Intrinsics.checkNotNullExpressionValue(taskC, "checkLocationSettings(...)");
        final a aVar = new a();
        taskC.f(new eh4() { // from class: com.zepto.mp2
            @Override // com.zepto.eh4
            public final void b(Object obj) {
                HomeFragment.X3(aVar, obj);
            }
        });
        taskC.d(new rg4() { // from class: com.zepto.np2
            @Override // com.zepto.rg4
            public final void a(Exception exc) {
                HomeFragment.Y3(this.a, exc);
            }
        });
    }

    public final is1 W4() {
        is1 is1Var = this.mDlViewModel;
        if (is1Var != null) {
            return is1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDlViewModel");
        return null;
    }

    public final tu7 W5() {
        tu7 tu7Var = this.viewModel;
        if (tu7Var != null) {
            return tu7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W7(java.lang.String r10, int r11) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Dashboard.ui.Home.HomeFragment.W7(java.lang.String, int):void");
    }

    public final void W8(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.llMyDocs = linearLayout;
    }

    public final void W9(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txt_dl_extract = textView;
    }

    @Override // com.zepto.sf2
    public void X0() throws Throwable {
        super.X0();
        try {
            try {
                if (B5().n().toString() != null) {
                    TextView textView = this.full_name;
                    if (textView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("full_name");
                        textView = null;
                    }
                    textView.setText(B5().n().toString());
                }
                if (new dl4(n()).c() == 0) {
                    qa();
                }
                ra();
            } catch (Exception unused) {
                C5().setVisibility(8);
            }
            try {
                ArrayAdapter arrayAdapter = new ArrayAdapter(E1(), R.layout.s2, gd1.a.c(n()));
                arrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                Spinner spinner = this.spinner;
                if (spinner == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("spinner");
                    spinner = null;
                }
                spinner.setAdapter((SpinnerAdapter) arrayAdapter);
            } catch (Exception unused2) {
            }
            yf2 yf2VarN = n();
            if (yf2VarN == null || !com.nic.mparivahan.a.a.a(yf2VarN)) {
                Toast.makeText(n(), L4().b("label_log_check_internet", c0(R.string.kindly_check_your_internet_connection)), 0).show();
            } else {
                sa();
            }
            yf2 yf2VarN2 = n();
            if (yf2VarN2 != null) {
                com.nic.mparivahan.a.a.a(yf2VarN2);
            }
            if (B5().p().length() <= 0 || Intrinsics.areEqual(B5().p(), "0")) {
                CircleImageView circleImageView = this.userIv;
                if (circleImageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userIv");
                    circleImageView = null;
                }
                circleImageView.setImageResource(R.drawable.avtar);
            } else {
                Bitmap bitmapC = st6.c(B5().p());
                if (bitmapC != null) {
                    try {
                        CircleImageView circleImageView2 = this.userIv;
                        if (circleImageView2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("userIv");
                            circleImageView2 = null;
                        }
                        circleImageView2.setImageBitmap(bitmapC);
                    } catch (Exception unused3) {
                    }
                }
            }
            yf2 yf2VarN3 = n();
            if (yf2VarN3 != null) {
                W5().l().g(yf2VarN3, new mf4() { // from class: com.zepto.ep2
                    @Override // com.zepto.mf4
                    public final void a(Object obj) {
                        HomeFragment.N7(this.a, (GetEnableStateModel) obj);
                    }
                });
            }
            AppCompatEditText appCompatEditText = this.Search_bar;
            if (appCompatEditText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("Search_bar");
                appCompatEditText = null;
            }
            Editable text = appCompatEditText.getText();
            Intrinsics.checkNotNull(text);
            if (text.length() > 0) {
                AppCompatEditText appCompatEditText2 = this.Search_bar;
                if (appCompatEditText2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("Search_bar");
                    appCompatEditText2 = null;
                }
                appCompatEditText2.setText("");
            }
            Editable text2 = t4().getText();
            Intrinsics.checkNotNull(text2);
            if (text2.length() > 0) {
                t4().setText("");
            }
            try {
                tm3 tm3Var = this.locationHelper;
                if (tm3Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("locationHelper");
                    tm3Var = null;
                }
                tm3Var.b(new h());
            } catch (Exception unused4) {
            }
            hz0.a aVar = hz0.a;
            yf2 yf2VarE1 = E1();
            Intrinsics.checkNotNullExpressionValue(yf2VarE1, "requireActivity(...)");
            if (!aVar.J(yf2VarE1)) {
                ImageSlider.l(C5(), 0L, 1, null);
            } else {
                C5().m();
                Log.d("SliderView", "Slider stopped due to high memory usage");
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final xy1 X4() {
        xy1 xy1Var = this.mESViewModel;
        if (xy1Var != null) {
            return xy1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mESViewModel");
        return null;
    }

    public final LinearLayout X5() {
        LinearLayout linearLayout = this.viewless;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewless");
        return null;
    }

    public final void X8(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.llTransportServices = linearLayout;
    }

    public final void X9(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txt_dup_dl = textView;
    }

    public final RcService Y4() {
        RcService rcService = this.mRcService;
        if (rcService != null) {
            return rcService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRcService");
        return null;
    }

    public final LinearLayout Y5() {
        LinearLayout linearLayout = this.viewreport;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewreport");
        return null;
    }

    public final void Y7(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.accident_layout = linearLayout;
    }

    public final void Y8(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.ll_citizen_sentinel = linearLayout;
    }

    public final void Y9(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txt_hc = textView;
    }

    public final LinearLayout Z3() {
        LinearLayout linearLayout = this.accident_layout;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accident_layout");
        return null;
    }

    public final a55 Z4() {
        a55 a55Var = this.mRcViewModel;
        if (a55Var != null) {
            return a55Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRcViewModel");
        return null;
    }

    public final LinearLayout Z5() {
        LinearLayout linearLayout = this.viewreportlinear;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewreportlinear");
        return null;
    }

    public final void Z7(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.alerst_recycle_view = recyclerView;
    }

    public final void Z8(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void Z9(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txt_ht = textView;
    }

    @Override // com.zepto.mq6
    public void a(String dl, Integer position) throws Throwable {
        Intrinsics.checkNotNullParameter(dl, "dl");
        try {
            DldetobjX dldetails = ((DLDocument) r4().z0().get(0)).getDldetails();
            Intrinsics.checkNotNull(dldetails);
            String string = StringsKt__StringsKt.trim((CharSequence) dldetails.getDlobj().getDlLicno()).toString();
            if (r4().B0(string).equals("0")) {
                r4().B0(new Regex("\\s").replace(string, ""));
            }
            yf2 yf2VarN = n();
            if (yf2VarN != null) {
                W4().j(StringsKt__StringsKt.trim((CharSequence) dldetails.getDlobj().getDlLicno().toString()).toString(), k18.a.b(StringsKt__StringsKt.trim((CharSequence) dldetails.getBioObj().getBioDob().toString()).toString()), yf2VarN);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.zepto.sf2
    public void a1() {
        super.a1();
        C5().m();
    }

    public final String a4(double lat, double lang) {
        Geocoder geocoder = new Geocoder(E1(), Locale.getDefault());
        if (Build.VERSION.SDK_INT >= 33) {
            geocoder.getFromLocation(lat, lang, 1, mn2.a(new b()));
        } else {
            try {
                List<Address> fromLocation = geocoder.getFromLocation(lat, lang, 1);
                List<Address> list = fromLocation;
                if (list != null && !list.isEmpty()) {
                    String adminArea = fromLocation.get(0).getAdminArea();
                    Intrinsics.checkNotNullExpressionValue(adminArea, "getAdminArea(...)");
                    this.stat_Name = adminArea;
                    Log.e("Location -- ", "State Name: " + this.stat_Name);
                }
            } catch (Exception e2) {
                Log.e("Geocode Error", "Error occurred: " + e2.getMessage());
            }
        }
        return this.stat_Name;
    }

    public final qt7 a5() {
        Intrinsics.throwUninitializedPropertyAccessException("myRcAdapter");
        return null;
    }

    public final TextView a6() {
        TextView textView = this.virtual_dl_textview;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("virtual_dl_textview");
        return null;
    }

    public final void a8(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.alert_mes_layout = linearLayout;
    }

    public final void a9(DlService dlService) {
        Intrinsics.checkNotNullParameter(dlService, "<set-?>");
        this.mDlService = dlService;
    }

    public final void aa(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txt_rc_pert = textView;
    }

    public final RecyclerView b4() {
        RecyclerView recyclerView = this.alerst_recycle_view;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("alerst_recycle_view");
        return null;
    }

    public final LinearLayout b5() {
        LinearLayout linearLayout = this.mylicence;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mylicence");
        return null;
    }

    public final TextView b6() {
        TextView textView = this.virtual_rc_textview;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("virtual_rc_textview");
        return null;
    }

    public final void b8(ln2 ln2Var) {
        Intrinsics.checkNotNullParameter(ln2Var, "<set-?>");
        this.alertsAdapter = ln2Var;
    }

    public final void b9(is1 is1Var) {
        Intrinsics.checkNotNullParameter(is1Var, "<set-?>");
        this.mDlViewModel = is1Var;
    }

    public final void ba(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txt_replace_dl = textView;
    }

    public final LinearLayout c4() {
        LinearLayout linearLayout = this.alert_mes_layout;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("alert_mes_layout");
        return null;
    }

    public final LinearLayout c5() {
        LinearLayout linearLayout = this.myvehicle;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("myvehicle");
        return null;
    }

    public final void c6(View root) {
        if (root != null) {
            try {
                View viewFindViewById = root.findViewById(R.id.full_name);
                Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
                this.full_name = (TextView) viewFindViewById;
                View viewFindViewById2 = root.findViewById(R.id.app_option);
                Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.Spinner");
                this.spinner = (Spinner) viewFindViewById2;
                View viewFindViewById3 = root.findViewById(R.id.ll_search);
                Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.ImageView");
                this.llSearh = (ImageView) viewFindViewById3;
                View viewFindViewById4 = root.findViewById(R.id.Search_bar);
                Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatEditText");
                this.Search_bar = (AppCompatEditText) viewFindViewById4;
                View viewFindViewById5 = root.findViewById(R.id.info_layout);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
                O8((LinearLayout) viewFindViewById5);
                View viewFindViewById6 = root.findViewById(R.id.dl_bar_edit);
                Intrinsics.checkNotNull(viewFindViewById6, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatEditText");
                x8((AppCompatEditText) viewFindViewById6);
                View viewFindViewById7 = root.findViewById(R.id.challan_status_tv);
                Intrinsics.checkNotNull(viewFindViewById7, "null cannot be cast to non-null type android.widget.TextView");
                j8((TextView) viewFindViewById7);
                View viewFindViewById8 = root.findViewById(R.id.notice_status_tv);
                Intrinsics.checkNotNull(viewFindViewById8, "null cannot be cast to non-null type android.widget.TextView");
                m9((TextView) viewFindViewById8);
                View viewFindViewById9 = root.findViewById(R.id.ll_citizen_sentinel);
                Intrinsics.checkNotNull(viewFindViewById9, "null cannot be cast to non-null type android.widget.LinearLayout");
                Y8((LinearLayout) viewFindViewById9);
                View viewFindViewById10 = root.findViewById(R.id.citizen_image);
                Intrinsics.checkNotNull(viewFindViewById10, "null cannot be cast to non-null type android.widget.ImageView");
                this.citizen_image = (ImageView) viewFindViewById10;
                View viewFindViewById11 = root.findViewById(R.id.citzen_sentinal_title);
                Intrinsics.checkNotNull(viewFindViewById11, "null cannot be cast to non-null type android.widget.TextView");
                this.citzen_sentinal_title = (TextView) viewFindViewById11;
                View viewFindViewById12 = root.findViewById(R.id.report_traffic_violation);
                Intrinsics.checkNotNull(viewFindViewById12, "null cannot be cast to non-null type android.widget.TextView");
                this.report_traffic_violation = (TextView) viewFindViewById12;
                View viewFindViewById13 = root.findViewById(R.id.txt_ts);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
                T9((TextView) viewFindViewById13);
                View viewFindViewById14 = root.findViewById(R.id.pay_your_tax);
                Intrinsics.checkNotNull(viewFindViewById14, "null cannot be cast to non-null type android.widget.LinearLayout");
                this.llTax = (LinearLayout) viewFindViewById14;
                View viewFindViewById15 = root.findViewById(R.id.txt_process);
                Intrinsics.checkNotNull(viewFindViewById15, "null cannot be cast to non-null type android.widget.TextView");
                this.txt_process = (TextView) viewFindViewById15;
                View viewFindViewById16 = root.findViewById(R.id.ll_transport_services);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById16, "findViewById(...)");
                X8((LinearLayout) viewFindViewById16);
                View viewFindViewById17 = root.findViewById(R.id.ll_my_docs);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById17, "findViewById(...)");
                W8((LinearLayout) viewFindViewById17);
                View viewFindViewById18 = root.findViewById(R.id.ll_citizen);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById18, "findViewById(...)");
                T8((LinearLayout) viewFindViewById18);
                View viewFindViewById19 = root.findViewById(R.id.ll_info);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById19, "findViewById(...)");
                V8((LinearLayout) viewFindViewById19);
                View viewFindViewById20 = root.findViewById(R.id.iv_ts);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById20, "findViewById(...)");
                N8((ImageView) viewFindViewById20);
                View viewFindViewById21 = root.findViewById(R.id.iv_md);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById21, "findViewById(...)");
                L8((ImageView) viewFindViewById21);
                View viewFindViewById22 = root.findViewById(R.id.iv_cs);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById22, "findViewById(...)");
                K8((ImageView) viewFindViewById22);
                View viewFindViewById23 = root.findViewById(R.id.iv_is);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById23, "findViewById(...)");
                M8((ImageView) viewFindViewById23);
                View viewFindViewById24 = root.findViewById(R.id.txt_md);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById24, "findViewById(...)");
                R9((TextView) viewFindViewById24);
                View viewFindViewById25 = root.findViewById(R.id.txt_cs);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById25, "findViewById(...)");
                Q9((TextView) viewFindViewById25);
                View viewFindViewById26 = root.findViewById(R.id.txt_is);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById26, "findViewById(...)");
                S9((TextView) viewFindViewById26);
                View viewFindViewById27 = root.findViewById(R.id.txt_citizen);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById27, "findViewById(...)");
                U9((TextView) viewFindViewById27);
                View viewFindViewById28 = root.findViewById(R.id.transport_layout);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById28, "findViewById(...)");
                R8((LinearLayout) viewFindViewById28);
                View viewFindViewById29 = root.findViewById(R.id.verify_payment_linear);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById29, "findViewById(...)");
                ha((LinearLayout) viewFindViewById29);
                View viewFindViewById30 = root.findViewById(R.id.rec_rc_recycler);
                Intrinsics.checkNotNull(viewFindViewById30, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                v9((RecyclerView) viewFindViewById30);
                View viewFindViewById31 = root.findViewById(R.id.virtual_rc_textview);
                Intrinsics.checkNotNull(viewFindViewById31, "null cannot be cast to non-null type android.widget.TextView");
                na((TextView) viewFindViewById31);
                View viewFindViewById32 = root.findViewById(R.id.rec_dl_recycler);
                Intrinsics.checkNotNull(viewFindViewById32, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                u9((RecyclerView) viewFindViewById32);
                View viewFindViewById33 = root.findViewById(R.id.virtual_dl_textview);
                Intrinsics.checkNotNull(viewFindViewById33, "null cannot be cast to non-null type android.widget.TextView");
                ma((TextView) viewFindViewById33);
                View viewFindViewById34 = root.findViewById(R.id.rc_new_design);
                Intrinsics.checkNotNull(viewFindViewById34, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                w9((RecyclerView) viewFindViewById34);
                View viewFindViewById35 = root.findViewById(R.id.otherService_textView);
                Intrinsics.checkNotNull(viewFindViewById35, "null cannot be cast to non-null type android.widget.TextView");
                p9((TextView) viewFindViewById35);
                View viewFindViewById36 = root.findViewById(R.id.otherService_recyclerView);
                Intrinsics.checkNotNull(viewFindViewById36, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                o9((RecyclerView) viewFindViewById36);
                View viewFindViewById37 = root.findViewById(R.id.other_constraint);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById37, "findViewById(...)");
                n9((ConstraintLayout) viewFindViewById37);
                View viewFindViewById38 = root.findViewById(R.id.challan_constraint);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById38, "findViewById(...)");
                e8((ConstraintLayout) viewFindViewById38);
                View viewFindViewById39 = root.findViewById(R.id.notice_constraint);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById39, "findViewById(...)");
                l9((ConstraintLayout) viewFindViewById39);
                View viewFindViewById40 = root.findViewById(R.id.dl_dash_number);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById40, "findViewById(...)");
                s8((TextView) viewFindViewById40);
                View viewFindViewById41 = root.findViewById(R.id.dl_dash_name);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById41, "findViewById(...)");
                u8((TextView) viewFindViewById41);
                View viewFindViewById42 = root.findViewById(R.id.dl_dash_address);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById42, "findViewById(...)");
                t8((TextView) viewFindViewById42);
                View viewFindViewById43 = root.findViewById(R.id.dl_dash_issue);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById43, "findViewById(...)");
                r8((TextView) viewFindViewById43);
                View viewFindViewById44 = root.findViewById(R.id.dl_dash_valid);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById44, "findViewById(...)");
                v8((TextView) viewFindViewById44);
                View viewFindViewById45 = root.findViewById(R.id.ll_dashboard_dl);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById45, "findViewById(...)");
                U8((LinearLayout) viewFindViewById45);
                View viewFindViewById46 = root.findViewById(R.id.home_alert_layout);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById46, "findViewById(...)");
                J8((LinearLayout) viewFindViewById46);
                View viewFindViewById47 = root.findViewById(R.id.myvehicle);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById47, "findViewById(...)");
                g9((LinearLayout) viewFindViewById47);
                View viewFindViewById48 = root.findViewById(R.id.mylicence);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById48, "findViewById(...)");
                f9((LinearLayout) viewFindViewById48);
                View viewFindViewById49 = root.findViewById(R.id.alerst_recycle_view);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById49, "findViewById(...)");
                Z7((RecyclerView) viewFindViewById49);
                View viewFindViewById50 = root.findViewById(R.id.challan_status_linear);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById50, "findViewById(...)");
                i8((LinearLayout) viewFindViewById50);
                View viewFindViewById51 = root.findViewById(R.id.challan_payment);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById51, "findViewById(...)");
                g8((LinearLayout) viewFindViewById51);
                View viewFindViewById52 = root.findViewById(R.id.nodocument);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById52, "findViewById(...)");
                k9((TextView) viewFindViewById52);
                View viewFindViewById53 = root.findViewById(R.id.accident_layout);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById53, "findViewById(...)");
                Y7((LinearLayout) viewFindViewById53);
                View viewFindViewById54 = root.findViewById(R.id.alerts_title);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById54, "findViewById(...)");
                c8((TextView) viewFindViewById54);
                View viewFindViewById55 = root.findViewById(R.id.reportTrafficViolationFragment);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById55, "findViewById(...)");
                B9((LinearLayout) viewFindViewById55);
                View viewFindViewById56 = root.findViewById(R.id.report_accident);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById56, "findViewById(...)");
                C9((LinearLayout) viewFindViewById56);
                View viewFindViewById57 = root.findViewById(R.id.vehicle_viewmore);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById57, "findViewById(...)");
                ga((LinearLayout) viewFindViewById57);
                View viewFindViewById58 = root.findViewById(R.id.challan_recyclerView);
                Intrinsics.checkNotNull(viewFindViewById58, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                h8((RecyclerView) viewFindViewById58);
                View viewFindViewById59 = root.findViewById(R.id.new_learning_license);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById59, "findViewById(...)");
                j9((LinearLayout) viewFindViewById59);
                View viewFindViewById60 = root.findViewById(R.id.new_driving_license);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById60, "findViewById(...)");
                i9((LinearLayout) viewFindViewById60);
                View viewFindViewById61 = root.findViewById(R.id.duplicate_dl);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById61, "findViewById(...)");
                C8((LinearLayout) viewFindViewById61);
                View viewFindViewById62 = root.findViewById(R.id.change_of_address_dl);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById62, "findViewById(...)");
                l8((LinearLayout) viewFindViewById62);
                View viewFindViewById63 = root.findViewById(R.id.internationl_permit);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById63, "findViewById(...)");
                P8((LinearLayout) viewFindViewById63);
                View viewFindViewById64 = root.findViewById(R.id.dl_extract);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById64, "findViewById(...)");
                y8((LinearLayout) viewFindViewById64);
                View viewFindViewById65 = root.findViewById(R.id.second_row_dlservice);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById65, "findViewById(...)");
                F9((LinearLayout) viewFindViewById65);
                View viewFindViewById66 = root.findViewById(R.id.viewless);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById66, "findViewById(...)");
                ja((LinearLayout) viewFindViewById66);
                View viewFindViewById67 = root.findViewById(R.id.licence_viewmore);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById67, "findViewById(...)");
                S8((LinearLayout) viewFindViewById67);
                View viewFindViewById68 = root.findViewById(R.id.dlrenewal);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById68, "findViewById(...)");
                A8((LinearLayout) viewFindViewById68);
                View viewFindViewById69 = root.findViewById(R.id.alert_mes_layout);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById69, "findViewById(...)");
                a8((LinearLayout) viewFindViewById69);
                View viewFindViewById70 = root.findViewById(R.id.dl_abstract);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById70, "findViewById(...)");
                w8((LinearLayout) viewFindViewById70);
                View viewFindViewById71 = root.findViewById(R.id.dl_replacement);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById71, "findViewById(...)");
                z8((LinearLayout) viewFindViewById71);
                View viewFindViewById72 = root.findViewById(R.id.change_of_address_DLP);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById72, "findViewById(...)");
                k8((LinearLayout) viewFindViewById72);
                View viewFindViewById73 = root.findViewById(R.id.rc_partucular);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById73, "findViewById(...)");
                t9((LinearLayout) viewFindViewById73);
                View viewFindViewById74 = root.findViewById(R.id.hc);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById74, "findViewById(...)");
                I8((LinearLayout) viewFindViewById74);
                View viewFindViewById75 = root.findViewById(R.id.d_ht);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById75, "findViewById(...)");
                o8((LinearLayout) viewFindViewById75);
                View viewFindViewById76 = root.findViewById(R.id.duplicate_dl_info);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById76, "findViewById(...)");
                D8((LinearLayout) viewFindViewById76);
                View viewFindViewById77 = root.findViewById(R.id.d_to);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById77, "findViewById(...)");
                p8((LinearLayout) viewFindViewById77);
                View viewFindViewById78 = root.findViewById(R.id.userIv);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById78, "findViewById(...)");
                this.userIv = (CircleImageView) viewFindViewById78;
                View viewFindViewById79 = root.findViewById(R.id.enrolled_state_vahan);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById79, "findViewById(...)");
                F8((TextView) viewFindViewById79);
                View viewFindViewById80 = root.findViewById(R.id.enrolled_state_sarthi);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById80, "findViewById(...)");
                E8((TextView) viewFindViewById80);
                View viewFindViewById81 = root.findViewById(R.id.state_change_title);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById81, "findViewById(...)");
                O9((TextView) viewFindViewById81);
                View viewFindViewById82 = root.findViewById(R.id.select_spinner);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById82, "findViewById(...)");
                N9((Spinner) viewFindViewById82);
                View viewFindViewById83 = root.findViewById(R.id.elg_vahan_services);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById83, "findViewById(...)");
                ea((LinearLayout) viewFindViewById83);
                View viewFindViewById84 = root.findViewById(R.id.vehicle_title);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById84, "findViewById(...)");
                fa((TextView) viewFindViewById84);
                View viewFindViewById85 = root.findViewById(R.id.sarthi_linear);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById85, "findViewById(...)");
                E9((LinearLayout) viewFindViewById85);
                View viewFindViewById86 = root.findViewById(R.id.spinner_state_cust);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById86, "findViewById(...)");
                J9((FrameLayout) viewFindViewById86);
                View viewFindViewById87 = root.findViewById(R.id.challan_viewmore);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById87, "findViewById(...)");
                f8((LinearLayout) viewFindViewById87);
                View viewFindViewById88 = root.findViewById(R.id.other_service_viewmore);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById88, "findViewById(...)");
                r9((LinearLayout) viewFindViewById88);
                View viewFindViewById89 = root.findViewById(R.id.other_service_linear);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById89, "findViewById(...)");
                q9((LinearLayout) viewFindViewById89);
                View viewFindViewById90 = root.findViewById(R.id.fancy_no_avaliable_status);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById90, "findViewById(...)");
                H8((LinearLayout) viewFindViewById90);
                View viewFindViewById91 = root.findViewById(R.id.fancy_no_allocate_status);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById91, "findViewById(...)");
                G8((LinearLayout) viewFindViewById91);
                View viewFindViewById92 = root.findViewById(R.id.downloadFancyReceipt);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById92, "findViewById(...)");
                B8((LinearLayout) viewFindViewById92);
                View viewFindViewById93 = root.findViewById(R.id.state_change_title_citizen);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById93, "findViewById(...)");
                P9((TextView) viewFindViewById93);
                View viewFindViewById94 = root.findViewById(R.id.citizen_spinner);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById94, "findViewById(...)");
                n8((Spinner) viewFindViewById94);
                View viewFindViewById95 = root.findViewById(R.id.road_accident);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById95, "findViewById(...)");
                this.road_accident = (TextView) viewFindViewById95;
                View viewFindViewById96 = root.findViewById(R.id.citizenSpinnerLinear);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById96, "findViewById(...)");
                this.citizenSpinnerLinear = (FrameLayout) viewFindViewById96;
                View viewFindViewById97 = root.findViewById(R.id.slider);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById97, "findViewById(...)");
                I9((ImageSlider) viewFindViewById97);
                View viewFindViewById98 = root.findViewById(R.id.repoffenclinear);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById98, "findViewById(...)");
                A9((LinearLayout) viewFindViewById98);
                View viewFindViewById99 = root.findViewById(R.id.viewreportlinear);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById99, "findViewById(...)");
                la((LinearLayout) viewFindViewById99);
                View viewFindViewById100 = root.findViewById(R.id.viewreport);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById100, "findViewById(...)");
                ka((LinearLayout) viewFindViewById100);
                Y5().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sp2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        HomeFragment.i6(this.a, view);
                    }
                });
                t4().setHint(L4().b("label_challan_enter_dl_no", "Enter Driving Licence No"));
                AppCompatEditText appCompatEditText = this.Search_bar;
                LinearLayout linearLayout = null;
                if (appCompatEditText == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("Search_bar");
                    appCompatEditText = null;
                }
                appCompatEditText.setHint(L4().b("label_challan_enter_vehicle_no", "Enter Vehicle No"));
                TextView textView = this.citzen_sentinal_title;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("citzen_sentinal_title");
                    textView = null;
                }
                textView.setText(L4().b("label_citizen_sentinel", c0(R.string.citizen_sentinel)));
                TextView textView2 = this.report_traffic_violation;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("report_traffic_violation");
                    textView2 = null;
                }
                textView2.setText(L4().b("report_traffic_violation", "Report Traffic Violation"));
                TextView textView3 = this.road_accident;
                if (textView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("road_accident");
                    textView3 = null;
                }
                textView3.setText(L4().b("label_report_accident", "Report Accident"));
                try {
                    ArrayAdapter arrayAdapter = new ArrayAdapter(E1(), R.layout.s2, gd1.a.c(n()));
                    arrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                    Spinner spinner = this.spinner;
                    if (spinner == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("spinner");
                        spinner = null;
                    }
                    spinner.setAdapter((SpinnerAdapter) arrayAdapter);
                } catch (Exception unused) {
                }
                Spinner spinner2 = this.spinner;
                if (spinner2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("spinner");
                    spinner2 = null;
                }
                spinner2.setOnItemSelectedListener(new d());
                ImageView imageView = this.llSearh;
                if (imageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("llSearh");
                    imageView = null;
                }
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.up2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        HomeFragment.j6(this.a, view);
                    }
                });
                if (B5().n() != null) {
                    TextView textView4 = this.full_name;
                    if (textView4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("full_name");
                        textView4 = null;
                    }
                    textView4.setText(B5().n().toString());
                }
                S4().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vp2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        HomeFragment.k6(this.a, view);
                    }
                });
                x5().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wp2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        HomeFragment.l6(this.a, view);
                    }
                });
                R4().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xp2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        HomeFragment.m6(this.a, view);
                    }
                });
                V5().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yp2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        HomeFragment.n6(this.a, view);
                    }
                });
                O4().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zp2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        HomeFragment.d6(this.a, view);
                    }
                });
                Q4().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bq2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        HomeFragment.e6(this.a, view);
                    }
                });
                T4().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cq2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        HomeFragment.f6(this.a, view);
                    }
                });
                View viewFindViewById101 = root.findViewById(R.id.duplicate_rc_lin);
                Intrinsics.checkNotNull(viewFindViewById101, "null cannot be cast to non-null type android.widget.LinearLayout");
                this.duplicate_rc = (LinearLayout) viewFindViewById101;
                View viewFindViewById102 = root.findViewById(R.id.hp_termintion);
                Intrinsics.checkNotNull(viewFindViewById102, "null cannot be cast to non-null type android.widget.LinearLayout");
                this.hp_termintion = (LinearLayout) viewFindViewById102;
                LinearLayout linearLayout2 = this.duplicate_rc;
                if (linearLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("duplicate_rc");
                    linearLayout2 = null;
                }
                linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dq2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        HomeFragment.g6(this.a, view);
                    }
                });
                LinearLayout linearLayout3 = this.hp_termintion;
                if (linearLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("hp_termintion");
                } else {
                    linearLayout = linearLayout3;
                }
                linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tp2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        HomeFragment.h6(this.a, view);
                    }
                });
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void c8(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.alerts_title = textView;
    }

    public final void c9(xy1 xy1Var) {
        Intrinsics.checkNotNullParameter(xy1Var, "<set-?>");
        this.mESViewModel = xy1Var;
    }

    public final void ca(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txt_too = textView;
    }

    public final ln2 d4() {
        ln2 ln2Var = this.alertsAdapter;
        if (ln2Var != null) {
            return ln2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("alertsAdapter");
        return null;
    }

    public final v14 d5() {
        v14 v14Var = this.napixViewModel;
        if (v14Var != null) {
            return v14Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("napixViewModel");
        return null;
    }

    public final void d8(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.callfrom = str;
    }

    public final void d9(RcService rcService) {
        Intrinsics.checkNotNullParameter(rcService, "<set-?>");
        this.mRcService = rcService;
    }

    public final void da(int i2) {
        this.updatePosition = i2;
    }

    public final TextView e4() {
        TextView textView = this.alerts_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("alerts_title");
        return null;
    }

    public final LinearLayout e5() {
        LinearLayout linearLayout = this.new_driving_license;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("new_driving_license");
        return null;
    }

    public final void e8(ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<set-?>");
        this.challanConstraint = constraintLayout;
    }

    public final void e9(a55 a55Var) {
        Intrinsics.checkNotNullParameter(a55Var, "<set-?>");
        this.mRcViewModel = a55Var;
    }

    public final void ea(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.vahan_linear = linearLayout;
    }

    @Override // com.zepto.nq6, com.zepto.br6
    public void f(String rc, Integer position) {
        Intrinsics.checkNotNullParameter(rc, "rc");
        try {
            f80.d(zz0.a(qk1.b()), null, null, new i(position, rc, null), 3, null);
        } catch (Exception unused) {
        }
    }

    @Override // com.zepto.nq6
    public void f0(Integer position) {
    }

    public final ConstraintLayout f4() {
        ConstraintLayout constraintLayout = this.challanConstraint;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("challanConstraint");
        return null;
    }

    public final LinearLayout f5() {
        LinearLayout linearLayout = this.new_learning_license;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("new_learning_license");
        return null;
    }

    public final void f8(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.challanViewMore = linearLayout;
    }

    public final void f9(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.mylicence = linearLayout;
    }

    public final void fa(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.vehicle_title = textView;
    }

    public final LinearLayout g4() {
        LinearLayout linearLayout = this.challanViewMore;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("challanViewMore");
        return null;
    }

    public final TextView g5() {
        TextView textView = this.nodocument;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("nodocument");
        return null;
    }

    public final void g8(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.challan_payment = linearLayout;
    }

    public final void g9(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.myvehicle = linearLayout;
    }

    public final void ga(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.vehicle_viewmore = linearLayout;
    }

    public final LinearLayout h4() {
        LinearLayout linearLayout = this.challan_payment;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("challan_payment");
        return null;
    }

    public final ConstraintLayout h5() {
        ConstraintLayout constraintLayout = this.noticeConstraint;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("noticeConstraint");
        return null;
    }

    public final void h8(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.challan_recyclerView = recyclerView;
    }

    public final void h9(v14 v14Var) {
        Intrinsics.checkNotNullParameter(v14Var, "<set-?>");
        this.napixViewModel = v14Var;
    }

    public final void ha(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.verify_payment_linear = linearLayout;
    }

    public final RecyclerView i4() {
        RecyclerView recyclerView = this.challan_recyclerView;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("challan_recyclerView");
        return null;
    }

    public final TextView i5() {
        TextView textView = this.notice_status_tv;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("notice_status_tv");
        return null;
    }

    public final void i8(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.challan_status_linear = linearLayout;
    }

    public final void i9(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.new_driving_license = linearLayout;
    }

    public final void ia(tu7 tu7Var) {
        Intrinsics.checkNotNullParameter(tu7Var, "<set-?>");
        this.viewModel = tu7Var;
    }

    public final LinearLayout j4() {
        LinearLayout linearLayout = this.challan_status_linear;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("challan_status_linear");
        return null;
    }

    public final boolean j5(String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        int[] iArr = new int[256];
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            iArr[cCharAt] = iArr[cCharAt] + 1;
        }
        char[] cArr = new char[str.length()];
        for (int i3 = 0; i3 < length; i3++) {
            cArr[i3] = str.charAt(i3);
            if (i3 >= 0) {
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    if (str.charAt(i3) == cArr[i4]) {
                        i5++;
                    }
                    if (i4 == i3) {
                        break;
                    }
                    i4++;
                }
                if (i5 > 12) {
                    O7(n(), "Please enter minimum 10 & maximum 18 characters.Only hyphen(-), forward slash(/) & space is allowed");
                    return true;
                }
            }
        }
        return false;
    }

    public final void j8(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.challan_status_tv = textView;
    }

    public final void j9(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.new_learning_license = linearLayout;
    }

    public final void ja(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.viewless = linearLayout;
    }

    public final TextView k4() {
        TextView textView = this.challan_status_tv;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("challan_status_tv");
        return null;
    }

    public final ConstraintLayout k5() {
        ConstraintLayout constraintLayout = this.otherConstraint;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("otherConstraint");
        return null;
    }

    public final void k8(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.change_of_address_DLP = linearLayout;
    }

    public final void k9(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.nodocument = textView;
    }

    public final void ka(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.viewreport = linearLayout;
    }

    public final LinearLayout l4() {
        LinearLayout linearLayout = this.change_of_address_DLP;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("change_of_address_DLP");
        return null;
    }

    public final RecyclerView l5() {
        RecyclerView recyclerView = this.otherService_recyclerView;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("otherService_recyclerView");
        return null;
    }

    public final void l8(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.change_of_address_dl = linearLayout;
    }

    public final void l9(ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<set-?>");
        this.noticeConstraint = constraintLayout;
    }

    public final void la(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.viewreportlinear = linearLayout;
    }

    public final LinearLayout m4() {
        LinearLayout linearLayout = this.change_of_address_dl;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("change_of_address_dl");
        return null;
    }

    public final TextView m5() {
        TextView textView = this.otherService_textView;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("otherService_textView");
        return null;
    }

    public final void m8(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.citizen_linear = linearLayout;
    }

    public final void m9(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.notice_status_tv = textView;
    }

    public final void ma(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.virtual_dl_textview = textView;
    }

    public final LinearLayout n4() {
        LinearLayout linearLayout = this.citizen_linear;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("citizen_linear");
        return null;
    }

    public final LinearLayout n5() {
        LinearLayout linearLayout = this.other_service_viewmore;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("other_service_viewmore");
        return null;
    }

    public final void n8(Spinner spinner) {
        Intrinsics.checkNotNullParameter(spinner, "<set-?>");
        this.citizen_spinner = spinner;
    }

    public final void n9(ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<set-?>");
        this.otherConstraint = constraintLayout;
    }

    public final void na(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.virtual_rc_textview = textView;
    }

    public final Spinner o4() {
        Spinner spinner = this.citizen_spinner;
        if (spinner != null) {
            return spinner;
        }
        Intrinsics.throwUninitializedPropertyAccessException("citizen_spinner");
        return null;
    }

    public final ProgressDialog o5() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [T, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r3v6, types: [T, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r6v2, types: [T, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r7v2, types: [T, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r8v2, types: [T, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r9v2, types: [T, android.widget.TextView] */
    public final void o6(View root) {
        View viewFindViewById = root != null ? root.findViewById(R.id.lic_details) : null;
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
        ((LinearLayout) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.eq2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeFragment.p6(view);
            }
        });
        View viewFindViewById2 = root != null ? root.findViewById(R.id.vehicle_details) : null;
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.LinearLayout");
        ((LinearLayout) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qq2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeFragment.q6(view);
            }
        });
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        View viewFindViewById3 = root.findViewById(R.id.virtual_dl_textview);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        objectRef.element = (TextView) viewFindViewById3;
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        View viewFindViewById4 = root.findViewById(R.id.txt_virtual_rc);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        objectRef2.element = (TextView) viewFindViewById4;
        final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        View viewFindViewById5 = root.findViewById(R.id.txt_shared_rc);
        Intrinsics.checkNotNull(viewFindViewById5, "null cannot be cast to non-null type android.widget.TextView");
        objectRef3.element = (TextView) viewFindViewById5;
        final Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
        View viewFindViewById6 = root.findViewById(R.id.txt_rcv_rc);
        Intrinsics.checkNotNull(viewFindViewById6, "null cannot be cast to non-null type android.widget.TextView");
        objectRef4.element = (TextView) viewFindViewById6;
        final Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
        View viewFindViewById7 = root.findViewById(R.id.txt_rc_search);
        Intrinsics.checkNotNull(viewFindViewById7, "null cannot be cast to non-null type android.widget.TextView");
        objectRef5.element = (TextView) viewFindViewById7;
        final Ref.ObjectRef objectRef6 = new Ref.ObjectRef();
        View viewFindViewById8 = root.findViewById(R.id.txt_dl_search);
        Intrinsics.checkNotNull(viewFindViewById8, "null cannot be cast to non-null type android.widget.TextView");
        objectRef6.element = (TextView) viewFindViewById8;
        View viewFindViewById9 = root.findViewById(R.id.txt_dup_rc);
        Intrinsics.checkNotNull(viewFindViewById9, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById10 = root.findViewById(R.id.txt_ht);
        Intrinsics.checkNotNull(viewFindViewById10, "null cannot be cast to non-null type android.widget.TextView");
        Z9((TextView) viewFindViewById10);
        View viewFindViewById11 = root.findViewById(R.id.txt_too);
        Intrinsics.checkNotNull(viewFindViewById11, "null cannot be cast to non-null type android.widget.TextView");
        ca((TextView) viewFindViewById11);
        View viewFindViewById12 = root.findViewById(R.id.txt_rc_pert);
        Intrinsics.checkNotNull(viewFindViewById12, "null cannot be cast to non-null type android.widget.TextView");
        aa((TextView) viewFindViewById12);
        View viewFindViewById13 = root.findViewById(R.id.txt_coa);
        Intrinsics.checkNotNull(viewFindViewById13, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById14 = root.findViewById(R.id.txt_hp_end);
        Intrinsics.checkNotNull(viewFindViewById14, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById15 = root.findViewById(R.id.txt_hc);
        Intrinsics.checkNotNull(viewFindViewById15, "null cannot be cast to non-null type android.widget.TextView");
        Y9((TextView) viewFindViewById15);
        View viewFindViewById16 = root.findViewById(R.id.txt_noc);
        Intrinsics.checkNotNull(viewFindViewById16, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById17 = root.findViewById(R.id.txt_renewal);
        Intrinsics.checkNotNull(viewFindViewById17, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById18 = root.findViewById(R.id.txt_dup_dl);
        Intrinsics.checkNotNull(viewFindViewById18, "null cannot be cast to non-null type android.widget.TextView");
        X9((TextView) viewFindViewById18);
        View viewFindViewById19 = root.findViewById(R.id.txt_coa_dl);
        Intrinsics.checkNotNull(viewFindViewById19, "null cannot be cast to non-null type android.widget.TextView");
        V9((TextView) viewFindViewById19);
        View viewFindViewById20 = root.findViewById(R.id.txt_idp);
        Intrinsics.checkNotNull(viewFindViewById20, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById21 = root.findViewById(R.id.txt_dl_extract);
        Intrinsics.checkNotNull(viewFindViewById21, "null cannot be cast to non-null type android.widget.TextView");
        W9((TextView) viewFindViewById21);
        View viewFindViewById22 = root.findViewById(R.id.txt_replace_dl);
        Intrinsics.checkNotNull(viewFindViewById22, "null cannot be cast to non-null type android.widget.TextView");
        ba((TextView) viewFindViewById22);
        View viewFindViewById23 = root.findViewById(R.id.virtual_rc);
        Intrinsics.checkNotNull(viewFindViewById23, "null cannot be cast to non-null type android.widget.LinearLayout");
        ((LinearLayout) viewFindViewById23).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tq2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeFragment.r6(this.a, objectRef2, view);
            }
        });
        View viewFindViewById24 = root.findViewById(R.id.virtual_dl);
        Intrinsics.checkNotNull(viewFindViewById24, "null cannot be cast to non-null type android.widget.LinearLayout");
        ((LinearLayout) viewFindViewById24).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.uq2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeFragment.s6(this.a, objectRef, view);
            }
        });
        View viewFindViewById25 = root.findViewById(R.id.shared_rc);
        Intrinsics.checkNotNull(viewFindViewById25, "null cannot be cast to non-null type android.widget.LinearLayout");
        ((LinearLayout) viewFindViewById25).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vq2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeFragment.t6(this.a, objectRef3, view);
            }
        });
        View viewFindViewById26 = root.findViewById(R.id.recived_rc);
        Intrinsics.checkNotNull(viewFindViewById26, "null cannot be cast to non-null type android.widget.LinearLayout");
        ((LinearLayout) viewFindViewById26).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xq2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeFragment.u6(this.a, objectRef4, view);
            }
        });
        View viewFindViewById27 = root.findViewById(R.id.search_rc);
        Intrinsics.checkNotNull(viewFindViewById27, "null cannot be cast to non-null type android.widget.LinearLayout");
        ((LinearLayout) viewFindViewById27).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yq2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeFragment.v6(this.a, objectRef5, view);
            }
        });
        View viewFindViewById28 = root.findViewById(R.id.search_dl);
        Intrinsics.checkNotNull(viewFindViewById28, "null cannot be cast to non-null type android.widget.LinearLayout");
        ((LinearLayout) viewFindViewById28).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zq2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeFragment.w6(this.a, objectRef6, view);
            }
        });
        View viewFindViewById29 = root.findViewById(R.id.learning_lic);
        Intrinsics.checkNotNull(viewFindViewById29, "null cannot be cast to non-null type android.widget.LinearLayout");
        View viewFindViewById30 = root.findViewById(R.id.permit_lic);
        Intrinsics.checkNotNull(viewFindViewById30, "null cannot be cast to non-null type android.widget.LinearLayout");
        View viewFindViewById31 = root.findViewById(R.id.renewal_dl);
        Intrinsics.checkNotNull(viewFindViewById31, "null cannot be cast to non-null type android.widget.LinearLayout");
        View viewFindViewById32 = root.findViewById(R.id.duplicate_dl);
        Intrinsics.checkNotNull(viewFindViewById32, "null cannot be cast to non-null type android.widget.LinearLayout");
        View viewFindViewById33 = root.findViewById(R.id.add_lic);
        Intrinsics.checkNotNull(viewFindViewById33, "null cannot be cast to non-null type android.widget.LinearLayout");
        View viewFindViewById34 = root.findViewById(R.id.permit_dl);
        Intrinsics.checkNotNull(viewFindViewById34, "null cannot be cast to non-null type android.widget.LinearLayout");
        View viewFindViewById35 = root.findViewById(R.id.dl_fees_charge);
        Intrinsics.checkNotNull(viewFindViewById35, "null cannot be cast to non-null type android.widget.LinearLayout");
        View viewFindViewById36 = root.findViewById(R.id.duplicate_rc);
        Intrinsics.checkNotNull(viewFindViewById36, "null cannot be cast to non-null type android.widget.LinearLayout");
        View viewFindViewById37 = root.findViewById(R.id.no_object_certificate);
        Intrinsics.checkNotNull(viewFindViewById37, "null cannot be cast to non-null type android.widget.LinearLayout");
        View viewFindViewById38 = root.findViewById(R.id.change_of_address_rc);
        Intrinsics.checkNotNull(viewFindViewById38, "null cannot be cast to non-null type android.widget.LinearLayout");
        View viewFindViewById39 = root.findViewById(R.id.hp_rc);
        Intrinsics.checkNotNull(viewFindViewById39, "null cannot be cast to non-null type android.widget.LinearLayout");
        View viewFindViewById40 = root.findViewById(R.id.notification);
        Intrinsics.checkNotNull(viewFindViewById40, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) viewFindViewById40;
        View viewFindViewById41 = root.findViewById(R.id.advisory);
        Intrinsics.checkNotNull(viewFindViewById41, "null cannot be cast to non-null type android.widget.LinearLayout");
        View viewFindViewById42 = root.findViewById(R.id.draft_notification);
        Intrinsics.checkNotNull(viewFindViewById42, "null cannot be cast to non-null type android.widget.LinearLayout");
        View viewFindViewById43 = root.findViewById(R.id.allform);
        Intrinsics.checkNotNull(viewFindViewById43, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout2 = (LinearLayout) viewFindViewById43;
        View viewFindViewById44 = root.findViewById(R.id.driving_l);
        Intrinsics.checkNotNull(viewFindViewById44, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout3 = (LinearLayout) viewFindViewById44;
        View viewFindViewById45 = root.findViewById(R.id.motor_vehicle);
        Intrinsics.checkNotNull(viewFindViewById45, "null cannot be cast to non-null type android.widget.LinearLayout");
        View viewFindViewById46 = root.findViewById(R.id.txt_notification);
        Intrinsics.checkNotNull(viewFindViewById46, "null cannot be cast to non-null type android.widget.TextView");
        ((LinearLayout) viewFindViewById29).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ar2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeFragment.x6(this.a, objectRef6, view);
            }
        });
        ((LinearLayout) viewFindViewById30).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.br2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeFragment.y6(this.a, view);
            }
        });
        ((LinearLayout) viewFindViewById31).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fq2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeFragment.z6(this.a, view);
            }
        });
        ((LinearLayout) viewFindViewById33).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gq2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeFragment.A6(this.a, view);
            }
        });
        ((LinearLayout) viewFindViewById34).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hq2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeFragment.B6(this.a, view);
            }
        });
        ((LinearLayout) viewFindViewById35).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.iq2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeFragment.C6(this.a, view);
            }
        });
        ((LinearLayout) viewFindViewById36).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jq2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeFragment.D6(this.a, view);
            }
        });
        ((LinearLayout) viewFindViewById37).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.kq2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeFragment.E6(this.a, view);
            }
        });
        ((LinearLayout) viewFindViewById38).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mq2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeFragment.F6(this.a, view);
            }
        });
        ((LinearLayout) viewFindViewById39).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nq2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeFragment.G6(this.a, view);
            }
        });
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.oq2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeFragment.H6(this.a, view);
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pq2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeFragment.I6(this.a, view);
            }
        });
        linearLayout3.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rq2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeFragment.J6(this.a, view);
            }
        });
        ((LinearLayout) viewFindViewById45).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sq2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeFragment.K6(this.a, view);
            }
        });
    }

    public final void o8(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.d_ht = linearLayout;
    }

    public final void o9(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.otherService_recyclerView = recyclerView;
    }

    public final void oa(Context context, String message) {
        Intrinsics.checkNotNullParameter(context, "context");
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rp2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeFragment.pa(dialog, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.uh1
    public void p(String rc_number, int position) throws Throwable {
        this.MyRcAdapterPosition = position;
        G9(String.valueOf(rc_number));
        if (r4().C0(rc_number) != null) {
            o5().show();
            String element = r4().C0(rc_number);
            yf2 yf2VarN = n();
            if (yf2VarN != null) {
                a55 a55VarZ4 = Z4();
                Intrinsics.checkNotNullExpressionValue(element, "element");
                a55VarZ4.i(element, yf2VarN);
            }
        }
    }

    public final LinearLayout p4() {
        LinearLayout linearLayout = this.d_ht;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("d_ht");
        return null;
    }

    public final LinearLayout p5() {
        LinearLayout linearLayout = this.rc_partucular;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_partucular");
        return null;
    }

    public final void p8(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.d_to = linearLayout;
    }

    public final void p9(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.otherService_textView = textView;
    }

    public final LinearLayout q4() {
        LinearLayout linearLayout = this.d_to;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("d_to");
        return null;
    }

    public final RecyclerView q5() {
        RecyclerView recyclerView = this.rec_dl_recycler;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rec_dl_recycler");
        return null;
    }

    public final void q8(DatabaseHelper databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "<set-?>");
        this.databaseHelper = databaseHelper;
    }

    public final void q9(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.other_service_linear = linearLayout;
    }

    public final void qa() throws Throwable {
        yf2 yf2VarN = n();
        if (yf2VarN != null) {
            W5().g(yf2VarN);
        }
    }

    public final DatabaseHelper r4() {
        DatabaseHelper databaseHelper = this.databaseHelper;
        if (databaseHelper != null) {
            return databaseHelper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("databaseHelper");
        return null;
    }

    public final RecyclerView r5() {
        RecyclerView recyclerView = this.rec_rc_recycler;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rec_rc_recycler");
        return null;
    }

    public final void r8(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.dlIssuesDate = textView;
    }

    public final void r9(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.other_service_viewmore = linearLayout;
    }

    public final void ra() {
        try {
            C5().setImageList(CollectionsKt__CollectionsKt.listOf((Object[]) new f36[]{new f36(Integer.valueOf(R.drawable.b), null, null, 6, null), new f36(Integer.valueOf(R.drawable.b1), null, null, 6, null), new f36(Integer.valueOf(R.drawable.b2), null, null, 6, null), new f36(Integer.valueOf(R.drawable.b3), null, null, 6, null), new f36(Integer.valueOf(R.drawable.b4), null, null, 6, null), new f36(Integer.valueOf(R.drawable.b5), null, null, 6, null)}));
        } catch (Exception unused) {
            C5().setVisibility(8);
        }
    }

    public final LinearLayout s4() {
        LinearLayout linearLayout = this.dl_abstract;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dl_abstract");
        return null;
    }

    public final RecyclerView s5() {
        RecyclerView recyclerView = this.recyclerList;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("recyclerList");
        return null;
    }

    public final void s8(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.dlNumber = textView;
    }

    public final void s9(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void sa() {
        dl4 dl4Var = new dl4(n());
        if (dl4Var.c() == 1) {
            yf2 yf2VarN = n();
            if (yf2VarN == null || !com.nic.mparivahan.a.a.a(yf2VarN)) {
                Toast.makeText(n(), L4().b("label_log_check_internet", c0(R.string.kindly_check_your_internet_connection)), 0).show();
                return;
            }
            dl4Var.g(0);
            g5().setVisibility(8);
            P4().setVisibility(8);
            a6().setVisibility(8);
            b6().setVisibility(8);
            r5().setVisibility(8);
            F4().setVisibility(8);
            Z3().setVisibility(8);
            J4().setVisibility(8);
            S4().setBackgroundResource(R.drawable.corner_rectangle_bg_17);
            R4().setBackgroundResource(R.color.white);
            O4().setBackgroundResource(R.color.white);
            Q4().setBackgroundResource(R.color.white);
            K5().setTextColor(Color.parseColor("#FFFFFF"));
            I5().setTextColor(Color.parseColor("#000000"));
            H5().setTextColor(Color.parseColor("#000000"));
            J5().setTextColor(Color.parseColor("#000000"));
            G4().setImageResource(R.drawable.ic_citizen_sentinel);
            I4().setImageResource(R.drawable.ic_transport_selected);
            H4().setImageResource(R.drawable.ic_informational_services);
            TextView textView = null;
            H4().setColorFilter((ColorFilter) null);
            M4().setVisibility(0);
            TextView textView2 = this.txt_process;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("txt_process");
            } else {
                textView = textView2;
            }
            textView.setVisibility(8);
            T5().setVisibility(8);
            String strE = new dl4(n()).e();
            if (strE.equals("0")) {
                Log.e("State", VContant.MAINSCREEN);
                o5().show();
                W5().p();
            } else {
                try {
                    Object objFromJson = new Gson().fromJson(strE, (Class<Object>) StateMaster.class);
                    Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                    L9((StateMaster) objFromJson);
                } catch (Exception unused) {
                }
            }
        }
    }

    public final AppCompatEditText t4() {
        AppCompatEditText appCompatEditText = this.dl_bar_edit;
        if (appCompatEditText != null) {
            return appCompatEditText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dl_bar_edit");
        return null;
    }

    public final RecyclerView t5() {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
        return null;
    }

    public final void t8(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.dlOwnerAddress = textView;
    }

    public final void t9(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.rc_partucular = linearLayout;
    }

    public final void ta() throws Throwable {
        if (r4().z0() == null) {
            s5().setVisibility(8);
            return;
        }
        try {
            s5().setVisibility(0);
            ArrayList arrayListZ0 = r4().z0();
            Intrinsics.checkNotNullExpressionValue(arrayListZ0, "getDLDetailsList(...)");
            s5().setLayoutManager(new LinearLayoutManager(n(), 0, false));
            yf2 yf2VarN = n();
            this.adapter_dl = yf2VarN != null ? new im1(yf2VarN, arrayListZ0, this) : null;
            s5().setAdapter(this.adapter_dl);
            im1 im1Var = this.adapter_dl;
            if (im1Var != null) {
                im1Var.j();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            s5().setVisibility(8);
        }
    }

    public final LinearLayout u4() {
        LinearLayout linearLayout = this.dl_extract;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dl_extract");
        return null;
    }

    public final RecyclerView u5() {
        RecyclerView recyclerView = this.recyclerView_Notice;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("recyclerView_Notice");
        return null;
    }

    public final void u8(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.dlOwnerName = textView;
    }

    public final void u9(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.rec_dl_recycler = recyclerView;
    }

    public final LinearLayout v4() {
        LinearLayout linearLayout = this.dl_replacement;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dl_replacement");
        return null;
    }

    public final RecyclerView v5() {
        RecyclerView recyclerView = this.recyclerView_vahan;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("recyclerView_vahan");
        return null;
    }

    public final void v8(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.dlValidUpTo = textView;
    }

    public final void v9(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.rec_rc_recycler = recyclerView;
    }

    public final LinearLayout w4() {
        LinearLayout linearLayout = this.dlrenewal;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlrenewal");
        return null;
    }

    public final LinearLayout w5() {
        LinearLayout linearLayout = this.reportOffence;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("reportOffence");
        return null;
    }

    public final void w8(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.dl_abstract = linearLayout;
    }

    public final void w9(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.recyclerList = recyclerView;
    }

    public final LinearLayout x4() {
        LinearLayout linearLayout = this.downloadFancyReceipt;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("downloadFancyReceipt");
        return null;
    }

    public final LinearLayout x5() {
        LinearLayout linearLayout = this.reportTrafficViolationFragment;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("reportTrafficViolationFragment");
        return null;
    }

    public final void x8(AppCompatEditText appCompatEditText) {
        Intrinsics.checkNotNullParameter(appCompatEditText, "<set-?>");
        this.dl_bar_edit = appCompatEditText;
    }

    public final void x9(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.recyclerView = recyclerView;
    }

    public final LinearLayout y4() {
        LinearLayout linearLayout = this.duplicate_dl;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("duplicate_dl");
        return null;
    }

    public final wl5 y5() {
        wl5 wl5Var = this.sahi_session;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sahi_session");
        return null;
    }

    public final void y8(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.dl_extract = linearLayout;
    }

    public final void y9(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.recyclerView_Notice = recyclerView;
    }

    public final LinearLayout z4() {
        LinearLayout linearLayout = this.duplicate_dl_info;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("duplicate_dl_info");
        return null;
    }

    public final LinearLayout z5() {
        LinearLayout linearLayout = this.sarthi_linear;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthi_linear");
        return null;
    }

    public final void z8(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.dl_replacement = linearLayout;
    }

    public final void z9(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.recyclerView_vahan = recyclerView;
    }
}
