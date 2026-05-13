package com.nic.mparivahan.Citizen.Activities;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.provider.MediaStore;
import android.provider.Settings;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Base64;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.webkit.MimeTypeMap;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.core.content.FileProvider;
import androidx.lifecycle.z;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.nic.mparivahan.Account.Model.State;
import com.nic.mparivahan.Account.Model.StateMaster;
import com.nic.mparivahan.Citizen.Activities.TrafficReportVioActivity;
import com.nic.mparivahan.Citizen.Interfaces.ItmsDistictMaster;
import com.nic.mparivahan.Citizen.Interfaces.OffenceInterface;
import com.nic.mparivahan.Citizen.Interfaces.ReverseGeoCoding;
import com.nic.mparivahan.Citizen.Models.DataX;
import com.nic.mparivahan.Citizen.Models.GetOffenceList;
import com.nic.mparivahan.Citizen.Models.GetStated;
import com.nic.mparivahan.Citizen.Models.ItmsStateModle;
import com.nic.mparivahan.Citizen.Models.MparOffence;
import com.nic.mparivahan.Citizen.Models.Name;
import com.nic.mparivahan.Citizen.Models.ReverseModle;
import com.nic.mparivahan.Citizen.Models.SubmitOffenceReport;
import com.nic.mparivahan.Citizen.Models.VerifyVehicleResponseModel;
import com.nic.mparivahan.Citizen.Models.Vhclass;
import com.nic.mparivahan.Citizen.ViewModel.ItmsMasterViewModel;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.Welcome.Model.NapixTokenModel;
import com.nic.mparivahan.Welcome.NapixService;
import com.nic.mparivahan.a;
import com.zepto.aj0;
import com.zepto.bi2;
import com.zepto.c33;
import com.zepto.d33;
import com.zepto.df;
import com.zepto.dl4;
import com.zepto.ef3;
import com.zepto.eh4;
import com.zepto.f80;
import com.zepto.g16;
import com.zepto.gd1;
import com.zepto.gf;
import com.zepto.hf;
import com.zepto.hv0;
import com.zepto.hz0;
import com.zepto.jd7;
import com.zepto.jf2;
import com.zepto.jv0;
import com.zepto.kd7;
import com.zepto.kt6;
import com.zepto.ld7;
import com.zepto.mf;
import com.zepto.mf4;
import com.zepto.my4;
import com.zepto.nd5;
import com.zepto.nf4;
import com.zepto.of;
import com.zepto.of4;
import com.zepto.ok0;
import com.zepto.pq;
import com.zepto.qk1;
import com.zepto.qm3;
import com.zepto.st6;
import com.zepto.t14;
import com.zepto.ta3;
import com.zepto.tf4;
import com.zepto.tp7;
import com.zepto.uf4;
import com.zepto.v14;
import com.zepto.vf4;
import com.zepto.vp7;
import com.zepto.w14;
import com.zepto.wa3;
import com.zepto.wm3;
import com.zepto.ws6;
import com.zepto.xl5;
import com.zepto.xv0;
import com.zepto.yy0;
import com.zepto.yz0;
import com.zepto.zz0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
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
import org.json.JSONException;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¨\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b[\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 Û\u00022\u00020\u0001:\u0002Ü\u0002B\t¢\u0006\u0006\bÙ\u0002\u0010Ú\u0002J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u0012\u0010\u000b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u0012\u0010\f\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002J\u0014\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0002H\u0002J\b\u0010\u0016\u001a\u00020\u0002H\u0002J\b\u0010\u0017\u001a\u00020\u0002H\u0002J\b\u0010\u0018\u001a\u00020\u0002H\u0003J\b\u0010\u0019\u001a\u00020\u0002H\u0002J\b\u0010\u001a\u001a\u00020\u0002H\u0003J\u0018\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\b\u0010\u001f\u001a\u00020\u0011H\u0002J\b\u0010 \u001a\u00020\u0002H\u0002J\u0006\u0010!\u001a\u00020\u0002J\u0012\u0010$\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\"H\u0015J\b\u0010%\u001a\u00020\u0002H\u0014J\u0016\u0010*\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(J/\u00101\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+2\u000e\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0-2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u0010\u00106\u001a\u0004\u0018\u0001052\u0006\u00104\u001a\u000203J\u000e\u00109\u001a\u0002082\u0006\u00107\u001a\u00020\u0011J\u001e\u0010<\u001a\u0012\u0012\u0004\u0012\u00020\b0:j\b\u0012\u0004\u0012\u00020\b`;2\u0006\u0010)\u001a\u00020(J6\u0010?\u001a\u0012\u0012\u0004\u0012\u00020=0:j\b\u0012\u0004\u0012\u00020=`;2\u0006\u0010)\u001a\u00020(2\u0016\u0010>\u001a\u0012\u0012\u0004\u0012\u00020=0:j\b\u0012\u0004\u0012\u00020=`;J&\u0010A\u001a\u00020+2\u0006\u0010@\u001a\u00020\b2\u0016\u0010>\u001a\u0012\u0012\u0004\u0012\u00020=0:j\b\u0012\u0004\u0012\u00020=`;J6\u0010E\u001a\u0012\u0012\u0004\u0012\u00020C0:j\b\u0012\u0004\u0012\u00020C`;2\u0006\u0010B\u001a\u00020\b2\u0016\u0010D\u001a\u0012\u0012\u0004\u0012\u00020C0:j\b\u0012\u0004\u0012\u00020C`;J\u000e\u0010H\u001a\u00020G2\u0006\u0010F\u001a\u00020\bJ\u000e\u0010I\u001a\u00020G2\u0006\u0010F\u001a\u00020\bJ\u001e\u0010L\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(2\u0006\u0010J\u001a\u00020\b2\u0006\u0010K\u001a\u00020\bJ\u000e\u0010N\u001a\u00020\r2\u0006\u0010M\u001a\u00020\rJ\u0006\u0010O\u001a\u00020\u0002J\b\u0010P\u001a\u00020\u0002H\u0014J\b\u0010Q\u001a\u00020\u0002H\u0014J\u0006\u0010R\u001a\u00020\u0002J\u0006\u0010S\u001a\u00020\u0002R\u0016\u0010W\u001a\u00020T8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bU\u0010VR\"\u0010_\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010g\u001a\u00020`8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010o\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010v\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\"\u0010}\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R$\u0010\u0081\u0001\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0013\n\u0004\b~\u0010x\u001a\u0004\b\u007f\u0010z\"\u0005\b\u0080\u0001\u0010|R)\u0010\u0088\u0001\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R8\u0010D\u001a\u0012\u0012\u0004\u0012\u00020C0:j\b\u0012\u0004\u0012\u00020C`;8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R(\u0010\u0094\u0001\u001a\u00020+8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u008f\u0001\u0010~\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R(\u0010\u0098\u0001\u001a\u00020+8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0095\u0001\u0010~\u001a\u0006\b\u0096\u0001\u0010\u0091\u0001\"\u0006\b\u0097\u0001\u0010\u0093\u0001R9\u0010\u009c\u0001\u001a\u0012\u0012\u0004\u0012\u00020=0:j\b\u0012\u0004\u0012\u00020=`;8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0099\u0001\u0010\u008a\u0001\u001a\u0006\b\u009a\u0001\u0010\u008c\u0001\"\u0006\b\u009b\u0001\u0010\u008e\u0001R&\u0010 \u0001\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u009d\u0001\u0010q\u001a\u0005\b\u009e\u0001\u0010s\"\u0005\b\u009f\u0001\u0010uR&\u0010¤\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¡\u0001\u0010q\u001a\u0005\b¢\u0001\u0010s\"\u0005\b£\u0001\u0010uR&\u0010¨\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¥\u0001\u0010q\u001a\u0005\b¦\u0001\u0010s\"\u0005\b§\u0001\u0010uR&\u0010¬\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b©\u0001\u0010q\u001a\u0005\bª\u0001\u0010s\"\u0005\b«\u0001\u0010uR&\u0010°\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u00ad\u0001\u0010q\u001a\u0005\b®\u0001\u0010s\"\u0005\b¯\u0001\u0010uR&\u0010´\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b±\u0001\u0010q\u001a\u0005\b²\u0001\u0010s\"\u0005\b³\u0001\u0010uR&\u0010¸\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bµ\u0001\u0010q\u001a\u0005\b¶\u0001\u0010s\"\u0005\b·\u0001\u0010uR&\u0010¼\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¹\u0001\u0010q\u001a\u0005\bº\u0001\u0010s\"\u0005\b»\u0001\u0010uR)\u0010Ã\u0001\u001a\u00020G8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b½\u0001\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010À\u0001\"\u0006\bÁ\u0001\u0010Â\u0001R*\u0010Ë\u0001\u001a\u00030Ä\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÅ\u0001\u0010Æ\u0001\u001a\u0006\bÇ\u0001\u0010È\u0001\"\u0006\bÉ\u0001\u0010Ê\u0001R&\u0010Ï\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÌ\u0001\u0010q\u001a\u0005\bÍ\u0001\u0010s\"\u0005\bÎ\u0001\u0010uR&\u0010Ò\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¾\u0001\u0010q\u001a\u0005\bÐ\u0001\u0010s\"\u0005\bÑ\u0001\u0010uR\u001e\u0010Ö\u0001\u001a\t\u0012\u0004\u0012\u00020\u00110Ó\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÔ\u0001\u0010Õ\u0001R&\u0010Ú\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b×\u0001\u0010q\u001a\u0005\bØ\u0001\u0010s\"\u0005\bÙ\u0001\u0010uR*\u0010â\u0001\u001a\u00030Û\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÜ\u0001\u0010Ý\u0001\u001a\u0006\bÞ\u0001\u0010ß\u0001\"\u0006\bà\u0001\u0010á\u0001R*\u0010ê\u0001\u001a\u00030ã\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bä\u0001\u0010å\u0001\u001a\u0006\bæ\u0001\u0010ç\u0001\"\u0006\bè\u0001\u0010é\u0001R)\u0010ì\u0001\u001a\u00020G8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bë\u0001\u0010¾\u0001\u001a\u0006\bì\u0001\u0010À\u0001\"\u0006\bí\u0001\u0010Â\u0001R+\u0010M\u001a\u0005\u0018\u00010î\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bï\u0001\u0010ð\u0001\u001a\u0006\bñ\u0001\u0010ò\u0001\"\u0006\bó\u0001\u0010ô\u0001R&\u0010ø\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bõ\u0001\u0010q\u001a\u0005\bö\u0001\u0010s\"\u0005\b÷\u0001\u0010uR&\u0010ü\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bù\u0001\u0010q\u001a\u0005\bú\u0001\u0010s\"\u0005\bû\u0001\u0010uR)\u0010\u0080\u0002\u001a\u00020G8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bý\u0001\u0010¾\u0001\u001a\u0006\bþ\u0001\u0010À\u0001\"\u0006\bÿ\u0001\u0010Â\u0001R*\u0010\u0088\u0002\u001a\u00030\u0081\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0082\u0002\u0010\u0083\u0002\u001a\u0006\b\u0084\u0002\u0010\u0085\u0002\"\u0006\b\u0086\u0002\u0010\u0087\u0002R\u0018\u0010\u008c\u0002\u001a\u00030\u0089\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0002\u0010\u008b\u0002R,\u0010\u0094\u0002\u001a\u0005\u0018\u00010\u008d\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008e\u0002\u0010\u008f\u0002\u001a\u0006\b\u0090\u0002\u0010\u0091\u0002\"\u0006\b\u0092\u0002\u0010\u0093\u0002R,\u0010\u009c\u0002\u001a\u0005\u0018\u00010\u0095\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0096\u0002\u0010\u0097\u0002\u001a\u0006\b\u0098\u0002\u0010\u0099\u0002\"\u0006\b\u009a\u0002\u0010\u009b\u0002R)\u0010 \u0002\u001a\u00020G8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009d\u0002\u0010¾\u0001\u001a\u0006\b\u009e\u0002\u0010À\u0001\"\u0006\b\u009f\u0002\u0010Â\u0001R+\u0010§\u0002\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¡\u0002\u0010¢\u0002\u001a\u0006\b£\u0002\u0010¤\u0002\"\u0006\b¥\u0002\u0010¦\u0002R+\u0010«\u0002\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¨\u0002\u0010¢\u0002\u001a\u0006\b©\u0002\u0010¤\u0002\"\u0006\bª\u0002\u0010¦\u0002R!\u0010°\u0002\u001a\n\u0012\u0005\u0012\u00030\u00ad\u00020¬\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b®\u0002\u0010¯\u0002R!\u0010²\u0002\u001a\n\u0012\u0005\u0012\u00030\u00ad\u00020¬\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b±\u0002\u0010¯\u0002R+\u0010¶\u0002\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b³\u0002\u0010¢\u0002\u001a\u0006\b´\u0002\u0010¤\u0002\"\u0006\bµ\u0002\u0010¦\u0002R(\u0010¼\u0002\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b·\u0002\u0010Y\u001a\u0006\b¸\u0002\u0010¹\u0002\"\u0006\bº\u0002\u0010»\u0002R(\u0010À\u0002\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b½\u0002\u0010Y\u001a\u0006\b¾\u0002\u0010¹\u0002\"\u0006\b¿\u0002\u0010»\u0002R\u0018\u0010Ä\u0002\u001a\u00030Á\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0002\u0010Ã\u0002R\u001a\u0010È\u0002\u001a\u00030Å\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÆ\u0002\u0010Ç\u0002R\u001c\u0010Ì\u0002\u001a\u0005\u0018\u00010É\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0002\u0010Ë\u0002R+\u0010Ò\u0002\u001a\u0014\u0012\u000f\u0012\r Ï\u0002*\u0005\u0018\u00010Î\u00020Î\u00020Í\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÐ\u0002\u0010Ñ\u0002R;\u0010Ø\u0002\u001a\u0014\u0012\u000f\u0012\r Ï\u0002*\u0005\u0018\u00010Î\u00020Î\u00020Í\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\bÓ\u0002\u0010Ñ\u0002\u001a\u0006\bÔ\u0002\u0010Õ\u0002\"\u0006\bÖ\u0002\u0010×\u0002¨\u0006Ý\u0002"}, d2 = {"Lcom/nic/mparivahan/Citizen/Activities/TrafficReportVioActivity;", "Lcom/zepto/pq;", "", "Y3", "d2", "d4", "c2", "X3", "", "message", "s3", "q3", "u3", "", "lat", "lang", "v2", "Landroid/net/Uri;", "uri", "q2", "g2", "c4", "C3", "X1", "e4", "e2", "w3", "imagePath", "Landroid/graphics/Bitmap;", "bitmap", "U2", "h2", "b4", "W2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onResume", "Landroid/widget/TextView;", "textView", "Landroid/content/Context;", "context", "J2", "", "requestCode", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Ljava/io/InputStream;", "inputStream", "", "k2", "contentUri", "", "Q2", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "n2", "Lcom/nic/mparivahan/Citizen/Models/Name;", "arrayList", "i2", "state", "D2", "classId", "Lcom/nic/mparivahan/Citizen/Models/MparOffence;", "offencesList", "T2", "stateName", "", "b2", "a2", "lon", "lot", "S2", "d", "x3", "f2", "onStop", "onDestroy", "V2", "a4", "Lcom/zepto/df;", "C", "Lcom/zepto/df;", "binding", "Lcom/zepto/vf4;", "D", "Lcom/zepto/vf4;", "y2", "()Lcom/zepto/vf4;", "G3", "(Lcom/zepto/vf4;)V", "mOffenceViewModel", "Lcom/nic/mparivahan/Citizen/Interfaces/OffenceInterface;", "E", "Lcom/nic/mparivahan/Citizen/Interfaces/OffenceInterface;", "x2", "()Lcom/nic/mparivahan/Citizen/Interfaces/OffenceInterface;", "F3", "(Lcom/nic/mparivahan/Citizen/Interfaces/OffenceInterface;)V", "mOffenceInterface", "Lcom/zepto/ws6;", "F", "Lcom/zepto/ws6;", "G2", "()Lcom/zepto/ws6;", "P3", "(Lcom/zepto/ws6;)V", "sessionManager", "G", "Ljava/lang/String;", "z2", "()Ljava/lang/String;", "I3", "(Ljava/lang/String;)V", "myLocation", "H", "Landroid/widget/TextView;", "o2", "()Landroid/widget/TextView;", "A3", "(Landroid/widget/TextView;)V", "evLocation", "I", "p2", "B3", "evTime", "J", "Landroid/content/Context;", "w2", "()Landroid/content/Context;", "E3", "(Landroid/content/Context;)V", "mContext", "K", "Ljava/util/ArrayList;", "C2", "()Ljava/util/ArrayList;", "L3", "(Ljava/util/ArrayList;)V", "L", "getMSelectedValue", "()I", "H3", "(I)V", "mSelectedValue", "M", "B2", "K3", "offenceId", "N", "I2", "S3", "stateList", "O", "getStateValue", "T3", "stateValue", "P", "getImgType", "setImgType", "imgType", "Q", "getImgvideType", "setImgvideType", "imgvideType", "R", "getImgvideTypeSect", "setImgvideTypeSect", "imgvideTypeSect", "S", "L2", "U3", "uploadedImgPath", "T", "r2", "setImageFileName", "imageFileName", "U", "M2", "setUploadedVideoPath", "uploadedVideoPath", "V", "P2", "setVideoFileName", "videoFileName", "W", "Z", "E2", "()Z", "M3", "(Z)V", "rcVerified", "Lcom/zepto/wa3;", "X", "Lcom/zepto/wa3;", "F2", "()Lcom/zepto/wa3;", "O3", "(Lcom/zepto/wa3;)V", "session", "Y", "H2", "R3", "stat_Name", "getVideoType", "setVideoType", "videoType", "", "a0", "Ljava/util/List;", "uris", "b0", "j2", "setAddressNameFor", "addressNameFor", "Lcom/zepto/ld7;", "c0", "Lcom/zepto/ld7;", "O2", "()Lcom/zepto/ld7;", "W3", "(Lcom/zepto/ld7;)V", "vahanViewModle", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "d0", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "N2", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "V3", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "vahanService", "e0", "isServiceenable", "N3", "Landroid/app/Dialog;", "f0", "Landroid/app/Dialog;", "getD", "()Landroid/app/Dialog;", "setD", "(Landroid/app/Dialog;)V", "g0", "l2", "y3", "distId", "h0", "m2", "z3", "distName", "i0", "getDisBoolean", "setDisBoolean", "disBoolean", "Lcom/zepto/v14;", "j0", "Lcom/zepto/v14;", "A2", "()Lcom/zepto/v14;", "J3", "(Lcom/zepto/v14;)V", "napixViewModel", "Lcom/nic/mparivahan/Welcome/NapixService;", "k0", "Lcom/nic/mparivahan/Welcome/NapixService;", "napixService", "Lcom/nic/mparivahan/Citizen/ViewModel/ItmsMasterViewModel;", "l0", "Lcom/nic/mparivahan/Citizen/ViewModel/ItmsMasterViewModel;", "getItmsMasterViewModel", "()Lcom/nic/mparivahan/Citizen/ViewModel/ItmsMasterViewModel;", "setItmsMasterViewModel", "(Lcom/nic/mparivahan/Citizen/ViewModel/ItmsMasterViewModel;)V", "itmsMasterViewModel", "Lcom/nic/mparivahan/Citizen/Interfaces/ItmsDistictMaster;", "m0", "Lcom/nic/mparivahan/Citizen/Interfaces/ItmsDistictMaster;", "getItmeService", "()Lcom/nic/mparivahan/Citizen/Interfaces/ItmsDistictMaster;", "setItmeService", "(Lcom/nic/mparivahan/Citizen/Interfaces/ItmsDistictMaster;)V", "itmeService", "n0", "getStartEvent", "Q3", "startEvent", "o0", "Landroid/net/Uri;", "getImageUri", "()Landroid/net/Uri;", "setImageUri", "(Landroid/net/Uri;)V", "imageUri", "p0", "getVideoUri", "setVideoUri", "videoUri", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "q0", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "bottomSheetBehavior", "r0", "bottomSheetBehaviorvideo", "s0", "getContentURI", "setContentURI", "contentURI", "t0", "t2", "()D", "setLagG", "(D)V", "lagG", "u0", "u2", "setLatG", "latG", "Landroid/text/TextWatcher;", "v0", "Landroid/text/TextWatcher;", "textWatcher", "Lcom/zepto/bi2;", "w0", "Lcom/zepto/bi2;", "fusedLocationProviderClient", "Lcom/zepto/qm3;", "x0", "Lcom/zepto/qm3;", "locationCallback", "Lcom/zepto/of;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "y0", "Lcom/zepto/of;", "getImageLauncher", "z0", "getGetVideoLauncher", "()Lcom/zepto/of;", "setGetVideoLauncher", "(Lcom/zepto/of;)V", "getVideoLauncher", "<init>", "()V", "A0", "a", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nTrafficReportVioActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrafficReportVioActivity.kt\ncom/nic/mparivahan/Citizen/Activities/TrafficReportVioActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1868:1\n1#2:1869\n*E\n"})
public final class TrafficReportVioActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public df binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public vf4 mOffenceViewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public OffenceInterface mOffenceInterface;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String myLocation;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public TextView evLocation;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public TextView evTime;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public int mSelectedValue;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public int offenceId;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public ArrayList stateList;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String stateValue;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public boolean rcVerified;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public ld7 vahanViewModle;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public VahanProService vahanService;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public boolean isServiceenable;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public Dialog d;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public v14 napixViewModel;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public ItmsMasterViewModel itmsMasterViewModel;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public ItmsDistictMaster itmeService;

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    public Uri imageUri;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public Uri videoUri;

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    public BottomSheetBehavior bottomSheetBehavior;

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    public BottomSheetBehavior bottomSheetBehaviorvideo;

    /* JADX INFO: renamed from: s0, reason: from kotlin metadata */
    public Uri contentURI;

    /* JADX INFO: renamed from: t0, reason: from kotlin metadata */
    public double lagG;

    /* JADX INFO: renamed from: u0, reason: from kotlin metadata */
    public double latG;

    /* JADX INFO: renamed from: w0, reason: from kotlin metadata */
    public bi2 fusedLocationProviderClient;

    /* JADX INFO: renamed from: x0, reason: from kotlin metadata */
    public qm3 locationCallback;

    /* JADX INFO: renamed from: y0, reason: from kotlin metadata */
    public of getImageLauncher;

    /* JADX INFO: renamed from: z0, reason: from kotlin metadata */
    public of getVideoLauncher;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public ArrayList offencesList = new ArrayList();

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String imgType = "";

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String imgvideType = "0";

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String imgvideTypeSect = "0";

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String uploadedImgPath = "";

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String imageFileName = "";

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String uploadedVideoPath = "";

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String videoFileName = "";

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public String stat_Name = "NA";

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public String videoType = "";

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public final List uris = new ArrayList();

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public String addressNameFor = "";

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public String distId = "0";

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public String distName = "NA";

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public boolean disBoolean = true;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public final NapixService napixService = NapixService.INSTANCE.a();

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public boolean startEvent = true;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    public final TextWatcher textWatcher = new x();

    public static final class b extends SuspendLambda implements Function2 {
        public int c;
        public Object e;
        public Object f;
        public int g;

        public static final class a extends Lambda implements Function1 {
            public final /* synthetic */ Ref.IntRef c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Ref.IntRef intRef) {
                super(1);
                this.c = intRef;
            }

            public final void a(hv0 compress) {
                Intrinsics.checkNotNullParameter(compress, "$this$compress");
                my4.a(compress, this.c.element);
                jf2.a(compress, Bitmap.CompressFormat.JPEG);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((hv0) obj);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.nic.mparivahan.Citizen.Activities.TrafficReportVioActivity$b$b, reason: collision with other inner class name */
        public static final class C0043b extends SuspendLambda implements Function2 {
            public int c;
            public final /* synthetic */ TrafficReportVioActivity e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0043b(TrafficReportVioActivity trafficReportVioActivity, Continuation continuation) {
                super(2, continuation);
                this.e = trafficReportVioActivity;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(yz0 yz0Var, Continuation continuation) {
                return ((C0043b) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0043b(this.e, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                df dfVar = this.e.binding;
                df dfVar2 = null;
                if (dfVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dfVar = null;
                }
                dfVar.g.setVisibility(8);
                this.e.a4();
                df dfVar3 = this.e.binding;
                if (dfVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    dfVar2 = dfVar3;
                }
                dfVar2.n.setBackgroundResource(R.drawable.selectcam);
                return Unit.INSTANCE;
            }
        }

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((b) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return TrafficReportVioActivity.this.new b(continuation);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:9|10|11|(4:44|23|(1:25)|28)|(5:32|39|(1:41)|42|43)|46|17|18|48|19|(1:21)(11:22|44|23|(0)|28|(1:30)|32|39|(0)|42|43)) */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0116, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0117, code lost:
        
            r14 = r17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x011a, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00b6 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00c4 A[Catch: Exception -> 0x00cb, TryCatch #0 {Exception -> 0x00cb, blocks: (B:23:0x00b9, B:25:0x00c4, B:28:0x00cd, B:30:0x00d5, B:32:0x00d9), top: B:44:0x00b9 }] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0138 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00b7 -> B:44:0x00b9). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 316
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Citizen.Activities.TrafficReportVioActivity.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class c implements Callback {
        public c() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            Log.e("Error3", "Error");
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            try {
                Gson gsonCreate = new GsonBuilder().create();
                nd5 nd5Var = response != null ? (nd5) response.body() : null;
                Intrinsics.checkNotNull(nd5Var);
                ReverseModle reverseModle = (ReverseModle) gsonCreate.fromJson(nd5Var.string(), ReverseModle.class);
                TrafficReportVioActivity.this.y3(String.valueOf(reverseModle.get(0).getDistrict_lgd()));
                TrafficReportVioActivity.this.R3(String.valueOf(reverseModle.get(0).getStatename()));
                TrafficReportVioActivity.this.z3(String.valueOf(reverseModle.get(0).getDistrictname()));
                Log.e("distId", TrafficReportVioActivity.this.getDistId());
                Log.e("distName", TrafficReportVioActivity.this.getDistName());
            } catch (Exception unused) {
                Log.e("Error2", "Error");
            }
        }
    }

    public static final class d extends qm3 {
        public d() {
        }

        @Override // com.zepto.qm3
        public void b(LocationResult locationResult) {
            Intrinsics.checkNotNullParameter(locationResult, "locationResult");
            super.b(locationResult);
            Intrinsics.checkNotNullExpressionValue(locationResult.c(), "getLocations(...)");
            if (!(!r0.isEmpty())) {
                Log.d("LocationUpdate", "No location available");
                return;
            }
            for (Location location : locationResult.c()) {
                TrafficReportVioActivity.this.v2(location.getLatitude(), location.getLongitude());
            }
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        public final void a(GetOffenceList getOffenceList) {
            try {
                df dfVar = TrafficReportVioActivity.this.binding;
                df dfVar2 = null;
                if (dfVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dfVar = null;
                }
                dfVar.z.setVisibility(8);
                if (StringsKt__StringsJVMKt.equals(getOffenceList.getStatusCode(), "MSTR001", true)) {
                    TrafficReportVioActivity.this.L3(getOffenceList.getMparOffenceList());
                    TrafficReportVioActivity.this.getOffencesList().add(0, new MparOffence("Select Violation", 0, 0, "0"));
                    TrafficReportVioActivity trafficReportVioActivity = TrafficReportVioActivity.this;
                    nf4 nf4Var = new nf4(trafficReportVioActivity, trafficReportVioActivity.getOffencesList());
                    df dfVar3 = TrafficReportVioActivity.this.binding;
                    if (dfVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        dfVar2 = dfVar3;
                    }
                    dfVar2.b.setAdapter((SpinnerAdapter) nf4Var);
                    return;
                }
                df dfVar4 = TrafficReportVioActivity.this.binding;
                if (dfVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dfVar4 = null;
                }
                dfVar4.f.setAlpha(0.5f);
                df dfVar5 = TrafficReportVioActivity.this.binding;
                if (dfVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dfVar5 = null;
                }
                dfVar5.f.setEnabled(false);
                df dfVar6 = TrafficReportVioActivity.this.binding;
                if (dfVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    dfVar2 = dfVar6;
                }
                dfVar2.l.setEnabled(false);
                TrafficReportVioActivity.this.q3(TrafficReportVioActivity.this.F2().b("trafficRep_availMsg", "Report traffic violation service is not available in ") + ' ' + TrafficReportVioActivity.this.getStat_Name() + ' ' + TrafficReportVioActivity.this.F2().b("vahan_state", "State"));
            } catch (Exception unused) {
                TrafficReportVioActivity.this.s3("Vahan service is unavailable.");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetOffenceList) obj);
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
            TrafficReportVioActivity.this.s3("Vahan service is unavailable.");
        }
    }

    public static final class g implements AdapterView.OnItemSelectedListener {
        public g() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            try {
                TrafficReportVioActivity.this.H3(i);
                if (TrafficReportVioActivity.this.getOffencesList().size() > 0) {
                    df dfVar = TrafficReportVioActivity.this.binding;
                    df dfVar2 = null;
                    if (dfVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dfVar = null;
                    }
                    if (dfVar.b.getSelectedItemPosition() > 0) {
                        df dfVar3 = TrafficReportVioActivity.this.binding;
                        if (dfVar3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            dfVar2 = dfVar3;
                        }
                        Object selectedItem = dfVar2.b.getSelectedItem();
                        Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.Citizen.Models.MparOffence");
                        TrafficReportVioActivity.this.K3(((MparOffence) selectedItem).getOffenceChallanId());
                    }
                }
            } catch (Exception unused) {
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class h implements AdapterView.OnItemSelectedListener {
        public h() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            df dfVar = null;
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            df dfVar2 = TrafficReportVioActivity.this.binding;
            if (dfVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                dfVar = dfVar2;
            }
            Object selectedItem = dfVar.x.getSelectedItem();
            Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.Citizen.Models.Name");
            Name name = (Name) selectedItem;
            TrafficReportVioActivity.this.T3(StringsKt__StringsJVMKt.equals(name.getName(), "Select State", true) ? "Select State" : name.getStateCode());
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class i extends Lambda implements Function1 {
        public i() {
            super(1);
        }

        public final void a(SubmitOffenceReport submitOffenceReport) {
            df dfVar = null;
            try {
                if (!Intrinsics.areEqual(submitOffenceReport.getStatusCode(), "TRV001")) {
                    df dfVar2 = TrafficReportVioActivity.this.binding;
                    if (dfVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dfVar2 = null;
                    }
                    dfVar2.z.setVisibility(8);
                    df dfVar3 = TrafficReportVioActivity.this.binding;
                    if (dfVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dfVar3 = null;
                    }
                    dfVar3.f.setEnabled(true);
                    df dfVar4 = TrafficReportVioActivity.this.binding;
                    if (dfVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dfVar4 = null;
                    }
                    dfVar4.f.setAlpha(1.0f);
                    TrafficReportVioActivity.this.s3(submitOffenceReport.getStatusDesc());
                    return;
                }
                df dfVar5 = TrafficReportVioActivity.this.binding;
                if (dfVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dfVar5 = null;
                }
                dfVar5.f.setEnabled(true);
                df dfVar6 = TrafficReportVioActivity.this.binding;
                if (dfVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dfVar6 = null;
                }
                dfVar6.f.setAlpha(1.0f);
                df dfVar7 = TrafficReportVioActivity.this.binding;
                if (dfVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dfVar7 = null;
                }
                dfVar7.z.setVisibility(8);
                TrafficReportVioActivity.this.e2();
                TrafficReportVioActivity.this.d2();
                df dfVar8 = TrafficReportVioActivity.this.binding;
                if (dfVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dfVar8 = null;
                }
                dfVar8.b.setSelection(0);
                TrafficReportVioActivity.this.u3("Your complaint has been registered successfully");
            } catch (Exception unused) {
                df dfVar9 = TrafficReportVioActivity.this.binding;
                if (dfVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dfVar9 = null;
                }
                dfVar9.z.setVisibility(8);
                df dfVar10 = TrafficReportVioActivity.this.binding;
                if (dfVar10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dfVar10 = null;
                }
                dfVar10.f.setEnabled(true);
                df dfVar11 = TrafficReportVioActivity.this.binding;
                if (dfVar11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    dfVar = dfVar11;
                }
                dfVar.f.setAlpha(1.0f);
                TrafficReportVioActivity.this.s3("Something went wrong, Please try after some time!");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SubmitOffenceReport) obj);
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
            df dfVar = TrafficReportVioActivity.this.binding;
            df dfVar2 = null;
            if (dfVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dfVar = null;
            }
            dfVar.f.setEnabled(true);
            df dfVar3 = TrafficReportVioActivity.this.binding;
            if (dfVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dfVar3 = null;
            }
            dfVar3.f.setAlpha(1.0f);
            df dfVar4 = TrafficReportVioActivity.this.binding;
            if (dfVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                dfVar2 = dfVar4;
            }
            dfVar2.z.setVisibility(8);
            TrafficReportVioActivity.this.s3("Service temporarily unavailable, Please try again later.");
        }
    }

    public static final class k extends Lambda implements Function1 {
        public k() {
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
        public final void a(GetStated getStated) {
            df dfVar = null;
            try {
                df dfVar2 = TrafficReportVioActivity.this.binding;
                if (dfVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dfVar2 = null;
                }
                dfVar2.z.setVisibility(8);
                if (!StringsKt__StringsJVMKt.equals(getStated.getStatusCode(), "MSTR001", true)) {
                    df dfVar3 = TrafficReportVioActivity.this.binding;
                    if (dfVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dfVar3 = null;
                    }
                    dfVar3.z.setVisibility(8);
                    return;
                }
                TrafficReportVioActivity.this.S3(getStated.getStates());
                ArrayList arrayListI2 = TrafficReportVioActivity.this.I2();
                String string = TrafficReportVioActivity.this.getResources().getString(R.string.select_state);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                arrayListI2.add(0, new Name(string, "0", false));
                TrafficReportVioActivity trafficReportVioActivity = TrafficReportVioActivity.this;
                ArrayList arrayListI22 = trafficReportVioActivity.i2(trafficReportVioActivity, trafficReportVioActivity.I2());
                ok0 ok0Var = new ok0(TrafficReportVioActivity.this, arrayListI22);
                df dfVar4 = TrafficReportVioActivity.this.binding;
                if (dfVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dfVar4 = null;
                }
                dfVar4.x.setAdapter((SpinnerAdapter) ok0Var);
                df dfVar5 = TrafficReportVioActivity.this.binding;
                if (dfVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dfVar5 = null;
                }
                AppCompatSpinner appCompatSpinner = dfVar5.x;
                TrafficReportVioActivity trafficReportVioActivity2 = TrafficReportVioActivity.this;
                appCompatSpinner.setSelection(trafficReportVioActivity2.D2(trafficReportVioActivity2.getStat_Name(), arrayListI22));
                df dfVar6 = TrafficReportVioActivity.this.binding;
                if (dfVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dfVar6 = null;
                }
                dfVar6.x.setEnabled(false);
            } catch (Exception e) {
                df dfVar7 = TrafficReportVioActivity.this.binding;
                if (dfVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    dfVar = dfVar7;
                }
                dfVar.z.setVisibility(8);
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetStated) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class l extends BottomSheetBehavior.g {
        public l() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View bottomSheet, float f) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(View bottomSheet, int i) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            df dfVar = null;
            if (i == 3) {
                df dfVar2 = TrafficReportVioActivity.this.binding;
                if (dfVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dfVar2 = null;
                }
                dfVar2.l.setEnabled(false);
                df dfVar3 = TrafficReportVioActivity.this.binding;
                if (dfVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dfVar3 = null;
                }
                dfVar3.b.setEnabled(false);
                df dfVar4 = TrafficReportVioActivity.this.binding;
                if (dfVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dfVar4 = null;
                }
                dfVar4.j.setEnabled(false);
                df dfVar5 = TrafficReportVioActivity.this.binding;
                if (dfVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    dfVar = dfVar5;
                }
                dfVar.h.setEnabled(false);
                return;
            }
            if (i != 4) {
                return;
            }
            df dfVar6 = TrafficReportVioActivity.this.binding;
            if (dfVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dfVar6 = null;
            }
            dfVar6.l.setEnabled(true);
            df dfVar7 = TrafficReportVioActivity.this.binding;
            if (dfVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dfVar7 = null;
            }
            dfVar7.b.setEnabled(true);
            df dfVar8 = TrafficReportVioActivity.this.binding;
            if (dfVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dfVar8 = null;
            }
            dfVar8.j.setEnabled(true);
            df dfVar9 = TrafficReportVioActivity.this.binding;
            if (dfVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                dfVar = dfVar9;
            }
            dfVar.h.setEnabled(true);
        }
    }

    public static final class m extends Lambda implements Function1 {
        public m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            df dfVar = TrafficReportVioActivity.this.binding;
            if (dfVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dfVar = null;
            }
            dfVar.z.setVisibility(8);
        }
    }

    public static final class n extends Lambda implements Function1 {
        public n() {
            super(1);
        }

        public final void a(VerifyVehicleResponseModel verifyVehicleResponseModel) {
            df dfVar = null;
            try {
                if (StringsKt__StringsJVMKt.equals(verifyVehicleResponseModel.getStatusCode(), "NP001", true)) {
                    df dfVar2 = TrafficReportVioActivity.this.binding;
                    if (dfVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dfVar2 = null;
                    }
                    dfVar2.z.setVisibility(8);
                    TrafficReportVioActivity.this.M3(true);
                    TrafficReportVioActivity.this.c4();
                    return;
                }
                if (StringsKt__StringsJVMKt.equals(verifyVehicleResponseModel.getStatusCode(), "NR005", true)) {
                    df dfVar3 = TrafficReportVioActivity.this.binding;
                    if (dfVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dfVar3 = null;
                    }
                    dfVar3.f.setEnabled(true);
                    df dfVar4 = TrafficReportVioActivity.this.binding;
                    if (dfVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dfVar4 = null;
                    }
                    dfVar4.f.setAlpha(1.0f);
                    df dfVar5 = TrafficReportVioActivity.this.binding;
                    if (dfVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dfVar5 = null;
                    }
                    dfVar5.z.setVisibility(8);
                    TrafficReportVioActivity.this.M3(false);
                    return;
                }
                df dfVar6 = TrafficReportVioActivity.this.binding;
                if (dfVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dfVar6 = null;
                }
                dfVar6.f.setEnabled(true);
                df dfVar7 = TrafficReportVioActivity.this.binding;
                if (dfVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dfVar7 = null;
                }
                dfVar7.f.setAlpha(1.0f);
                df dfVar8 = TrafficReportVioActivity.this.binding;
                if (dfVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dfVar8 = null;
                }
                dfVar8.z.setVisibility(8);
                TrafficReportVioActivity.this.M3(false);
                TrafficReportVioActivity.this.c4();
            } catch (Exception e) {
                e.printStackTrace();
                df dfVar9 = TrafficReportVioActivity.this.binding;
                if (dfVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dfVar9 = null;
                }
                dfVar9.f.setEnabled(true);
                df dfVar10 = TrafficReportVioActivity.this.binding;
                if (dfVar10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    dfVar = dfVar10;
                }
                dfVar.f.setAlpha(1.0f);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((VerifyVehicleResponseModel) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class o extends Lambda implements Function1 {
        public o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            df dfVar = TrafficReportVioActivity.this.binding;
            df dfVar2 = null;
            if (dfVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dfVar = null;
            }
            dfVar.z.setVisibility(8);
            TrafficReportVioActivity.this.M3(false);
            df dfVar3 = TrafficReportVioActivity.this.binding;
            if (dfVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dfVar3 = null;
            }
            dfVar3.f.setEnabled(true);
            df dfVar4 = TrafficReportVioActivity.this.binding;
            if (dfVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                dfVar2 = dfVar4;
            }
            dfVar2.f.setAlpha(1.0f);
            TrafficReportVioActivity.this.c4();
        }
    }

    public static final class p implements TextWatcher {
        public p() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TrafficReportVioActivity.this.Q3(true);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public static final class q extends Lambda implements Function1 {
        public q() {
            super(1);
        }

        public final void a(Vhclass vhclass) {
            df dfVar = null;
            try {
                TrafficReportVioActivity.this.N3(false);
                df dfVar2 = TrafficReportVioActivity.this.binding;
                if (dfVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dfVar2 = null;
                }
                dfVar2.z.setVisibility(8);
                if (vhclass.getApiMessage().getStatusCode() != 200) {
                    df dfVar3 = TrafficReportVioActivity.this.binding;
                    if (dfVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dfVar3 = null;
                    }
                    dfVar3.l.setText("");
                    return;
                }
                df dfVar4 = TrafficReportVioActivity.this.binding;
                if (dfVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dfVar4 = null;
                }
                dfVar4.b.setEnabled(true);
                new ArrayList();
                ArrayList arrayListT2 = TrafficReportVioActivity.this.T2(String.valueOf(vhclass.getData().getVhClass()), TrafficReportVioActivity.this.getOffencesList());
                if (arrayListT2.size() > 0) {
                    arrayListT2.add(0, new MparOffence("Select Violation", 0, 0, "0"));
                    nf4 nf4Var = new nf4(TrafficReportVioActivity.this, arrayListT2);
                    df dfVar5 = TrafficReportVioActivity.this.binding;
                    if (dfVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dfVar5 = null;
                    }
                    dfVar5.b.setAdapter((SpinnerAdapter) nf4Var);
                    return;
                }
                arrayListT2.add(0, new MparOffence("Select Violation", 0, 0, "0"));
                nf4 nf4Var2 = new nf4(TrafficReportVioActivity.this, arrayListT2);
                df dfVar6 = TrafficReportVioActivity.this.binding;
                if (dfVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dfVar6 = null;
                }
                dfVar6.b.setAdapter((SpinnerAdapter) nf4Var2);
                wa3 wa3Var = new wa3(TrafficReportVioActivity.this);
                TrafficReportVioActivity trafficReportVioActivity = TrafficReportVioActivity.this;
                trafficReportVioActivity.s3(wa3Var.b("noOffence", trafficReportVioActivity.getString(R.string.no_offence)));
            } catch (Exception e) {
                df dfVar7 = TrafficReportVioActivity.this.binding;
                if (dfVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dfVar7 = null;
                }
                dfVar7.l.setText("");
                df dfVar8 = TrafficReportVioActivity.this.binding;
                if (dfVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    dfVar = dfVar8;
                }
                dfVar.z.setVisibility(8);
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Vhclass) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class r extends BottomSheetBehavior.g {
        public r() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View bottomSheet, float f) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(View bottomSheet, int i) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            df dfVar = null;
            if (i == 3) {
                df dfVar2 = TrafficReportVioActivity.this.binding;
                if (dfVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dfVar2 = null;
                }
                dfVar2.l.setEnabled(false);
                df dfVar3 = TrafficReportVioActivity.this.binding;
                if (dfVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dfVar3 = null;
                }
                dfVar3.b.setEnabled(false);
                df dfVar4 = TrafficReportVioActivity.this.binding;
                if (dfVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dfVar4 = null;
                }
                dfVar4.j.setEnabled(false);
                df dfVar5 = TrafficReportVioActivity.this.binding;
                if (dfVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    dfVar = dfVar5;
                }
                dfVar.h.setEnabled(false);
                return;
            }
            if (i != 4) {
                return;
            }
            df dfVar6 = TrafficReportVioActivity.this.binding;
            if (dfVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dfVar6 = null;
            }
            dfVar6.l.setEnabled(true);
            df dfVar7 = TrafficReportVioActivity.this.binding;
            if (dfVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dfVar7 = null;
            }
            dfVar7.b.setEnabled(true);
            df dfVar8 = TrafficReportVioActivity.this.binding;
            if (dfVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dfVar8 = null;
            }
            dfVar8.j.setEnabled(true);
            df dfVar9 = TrafficReportVioActivity.this.binding;
            if (dfVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                dfVar = dfVar9;
            }
            dfVar.h.setEnabled(true);
        }
    }

    public static final class s extends Lambda implements Function1 {
        public s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            TrafficReportVioActivity.this.N3(false);
            df dfVar = TrafficReportVioActivity.this.binding;
            df dfVar2 = null;
            if (dfVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dfVar = null;
            }
            dfVar.z.setVisibility(8);
            if (StringsKt__StringsJVMKt.equals(str, "error", true)) {
                df dfVar3 = TrafficReportVioActivity.this.binding;
                if (dfVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    dfVar2 = dfVar3;
                }
                dfVar2.l.setText("");
                TrafficReportVioActivity.this.s3("Vahan service is unavailable.");
                return;
            }
            df dfVar4 = TrafficReportVioActivity.this.binding;
            if (dfVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                dfVar2 = dfVar4;
            }
            dfVar2.l.setText("");
            TrafficReportVioActivity.this.s3(str);
        }
    }

    public static final class t extends SuspendLambda implements Function2 {
        public int c;

        public static final class a implements jv0 {
            public final /* synthetic */ TrafficReportVioActivity a;
            public final /* synthetic */ Ref.ObjectRef b;
            public final /* synthetic */ Ref.LongRef c;

            public a(TrafficReportVioActivity trafficReportVioActivity, Ref.ObjectRef objectRef, Ref.LongRef longRef) {
                this.a = trafficReportVioActivity;
                this.b = objectRef;
                this.c = longRef;
            }

            public static final void g() {
            }

            @Override // com.zepto.jv0
            public void a(int i) {
                Log.wtf("TAG", "compression has been cancelled");
            }

            @Override // com.zepto.jv0
            public void b(int i, float f) {
                this.a.runOnUiThread(new Runnable() { // from class: com.zepto.pl6
                    @Override // java.lang.Runnable
                    public final void run() {
                        TrafficReportVioActivity.t.a.g();
                    }
                });
            }

            /* JADX WARN: Type inference failed for: r5v1, types: [T, android.net.Uri, java.lang.Object] */
            @Override // com.zepto.jv0
            public void c(int i, long j, String str) {
                if (str != null) {
                    Ref.ObjectRef objectRef = this.b;
                    ?? r5 = Uri.parse(str);
                    Intrinsics.checkNotNullExpressionValue(r5, "parse(...)");
                    objectRef.element = r5;
                }
                this.c.element = j;
            }

            @Override // com.zepto.jv0
            public void d(int i) {
            }

            @Override // com.zepto.jv0
            public void e(int i, String failureMessage) {
                Intrinsics.checkNotNullParameter(failureMessage, "failureMessage");
                Log.wtf("failureMessage", failureMessage);
            }
        }

        public t(Continuation continuation) {
            super(2, continuation);
        }

        public static final void d(TrafficReportVioActivity trafficReportVioActivity) {
            df dfVar = trafficReportVioActivity.binding;
            if (dfVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dfVar = null;
            }
            dfVar.o.setBackgroundResource(R.drawable.video_uploaded);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((t) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return TrafficReportVioActivity.this.new t(continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v5, types: [T, android.net.Uri] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            long length;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = new ArrayList();
            for (?? r3 : TrafficReportVioActivity.this.uris) {
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = r3;
                Ref.LongRef longRef = new Ref.LongRef();
                do {
                    Context applicationContext = TrafficReportVioActivity.this.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    List listListOf = CollectionsKt__CollectionsJVMKt.listOf(objectRef.element);
                    g16 g16Var = new g16(xl5.movies, "mparivahan-citizen-videos");
                    vp7 vp7Var = vp7.VERY_LOW;
                    List<String> pathSegments = ((Uri) objectRef.element).getPathSegments();
                    Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
                    String str = (String) CollectionsKt___CollectionsKt.lastOrNull((List) pathSegments);
                    if (str == null) {
                        str = "video.mp4";
                    }
                    tp7.j(applicationContext, listListOf, false, g16Var, null, new xv0(vp7Var, true, null, false, false, null, null, CollectionsKt__CollectionsJVMKt.listOf(str), 124, null), new a(TrafficReportVioActivity.this, objectRef, longRef), 16, null);
                    length = new File(((Uri) objectRef.element).getPath()).length();
                    longRef.element = length;
                } while (length > 102400);
                arrayList.add(objectRef.element);
            }
            TrafficReportVioActivity trafficReportVioActivity = TrafficReportVioActivity.this;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                trafficReportVioActivity.g2((Uri) it.next());
            }
            final TrafficReportVioActivity trafficReportVioActivity2 = TrafficReportVioActivity.this;
            trafficReportVioActivity2.runOnUiThread(new Runnable() { // from class: com.zepto.ol6
                @Override // java.lang.Runnable
                public final void run() {
                    TrafficReportVioActivity.t.d(trafficReportVioActivity2);
                }
            });
            return Unit.INSTANCE;
        }
    }

    public static final class u implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public u(Function1 function) {
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

    public static final class v extends Lambda implements Function1 {
        public v() {
            super(1);
        }

        public final void a(Location location) {
            if (location != null) {
                TrafficReportVioActivity.this.v2(location.getLatitude(), location.getLongitude());
            } else {
                Log.d("LocationUpdate", "Last known location is null");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Location) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class w extends SuspendLambda implements Function2 {
        public Object c;
        public int e;

        public static final class a extends SuspendLambda implements Function2 {
            public int c;
            public final /* synthetic */ TrafficReportVioActivity e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(TrafficReportVioActivity trafficReportVioActivity, Continuation continuation) {
                super(2, continuation);
                this.e = trafficReportVioActivity;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(yz0 yz0Var, Continuation continuation) {
                return ((a) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.e, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                df dfVar = this.e.binding;
                if (dfVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dfVar = null;
                }
                dfVar.z.setVisibility(0);
                return Unit.INSTANCE;
            }
        }

        public static final class b extends SuspendLambda implements Function2 {
            public int c;

            public b(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(yz0 yz0Var, Continuation continuation) {
                return ((b) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new b(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
        }

        public static final class c extends SuspendLambda implements Function2 {
            public int c;
            public final /* synthetic */ TrafficReportVioActivity e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(TrafficReportVioActivity trafficReportVioActivity, Continuation continuation) {
                super(2, continuation);
                this.e = trafficReportVioActivity;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(yz0 yz0Var, Continuation continuation) {
                return ((c) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new c(this.e, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.e.X1();
                return Unit.INSTANCE;
            }
        }

        public static final class d extends SuspendLambda implements Function2 {
            public int c;
            public final /* synthetic */ TrafficReportVioActivity e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(TrafficReportVioActivity trafficReportVioActivity, Continuation continuation) {
                super(2, continuation);
                this.e = trafficReportVioActivity;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(yz0 yz0Var, Continuation continuation) {
                return ((d) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new d(this.e, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.e.X1();
                return Unit.INSTANCE;
            }
        }

        public static final class e extends SuspendLambda implements Function2 {
            public int c;
            public final /* synthetic */ Exception e;
            public final /* synthetic */ TrafficReportVioActivity f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Exception exc, TrafficReportVioActivity trafficReportVioActivity, Continuation continuation) {
                super(2, continuation);
                this.e = exc;
                this.f = trafficReportVioActivity;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(yz0 yz0Var, Continuation continuation) {
                return ((e) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new e(this.e, this.f, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.e.printStackTrace();
                df dfVar = this.f.binding;
                if (dfVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dfVar = null;
                }
                dfVar.z.setVisibility(8);
                return Unit.INSTANCE;
            }
        }

        public w(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((w) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return TrafficReportVioActivity.this.new w(continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00cf A[Catch: Exception -> 0x002c, TRY_ENTER, TryCatch #0 {Exception -> 0x002c, blocks: (B:12:0x0027, B:17:0x0033, B:27:0x0081, B:30:0x00cf, B:31:0x00d3, B:33:0x00e5, B:34:0x00e9, B:20:0x003c, B:22:0x0063, B:24:0x006b, B:37:0x0155, B:40:0x0169), top: B:48:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00e5 A[Catch: Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:12:0x0027, B:17:0x0033, B:27:0x0081, B:30:0x00cf, B:31:0x00d3, B:33:0x00e5, B:34:0x00e9, B:20:0x003c, B:22:0x0063, B:24:0x006b, B:37:0x0155, B:40:0x0169), top: B:48:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0154 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r30) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 406
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Citizen.Activities.TrafficReportVioActivity.w.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class x implements TextWatcher {
        public x() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            TrafficReportVioActivity.this.N3(false);
        }
    }

    public TrafficReportVioActivity() {
        of ofVarB0 = B0(new mf(), new hf() { // from class: com.zepto.yk6
            @Override // com.zepto.hf
            public final void a(Object obj) {
                TrafficReportVioActivity.s2(this.a, (gf) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofVarB0, "registerForActivityResult(...)");
        this.getImageLauncher = ofVarB0;
        of ofVarB02 = B0(new mf(), new hf() { // from class: com.zepto.zk6
            @Override // com.zepto.hf
            public final void a(Object obj) {
                TrafficReportVioActivity.R2(this.a, (gf) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofVarB02, "registerForActivityResult(...)");
        this.getVideoLauncher = ofVarB02;
    }

    public static final void D3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void K2(Calendar calendar, TrafficReportVioActivity this$0, TimePicker timePicker, int i2, int i3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        calendar.set(11, i2);
        calendar.set(12, i3);
        this$0.p2().setText(new SimpleDateFormat("HH:mm", Locale.US).format(calendar.getTime()));
    }

    public static final void R2(TrafficReportVioActivity this$0, gf gfVar) {
        Long lValueOf;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (gfVar.d() == -1) {
            this$0.imgvideType = VContant.APPLICATION_SCREEN;
            Intent intentC = gfVar.c();
            Uri data = intentC != null ? intentC.getData() : null;
            this$0.contentURI = data;
            if (data != null) {
                try {
                    lValueOf = Long.valueOf(this$0.Q2(data));
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
            } else {
                lValueOf = null;
            }
            if (kt6.d(lValueOf)) {
                Intrinsics.checkNotNull(lValueOf);
                if (((int) lValueOf.longValue()) <= 8000000) {
                    Uri uri = this$0.contentURI;
                    Intrinsics.checkNotNull(uri);
                    this$0.g2(uri);
                    df dfVar = this$0.binding;
                    if (dfVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dfVar = null;
                    }
                    dfVar.o.setBackgroundResource(R.drawable.video_uploaded);
                    StringBuilder sb = new StringBuilder();
                    Uri uri2 = this$0.contentURI;
                    String lastPathSegment = uri2 != null ? uri2.getLastPathSegment() : null;
                    Intrinsics.checkNotNull(lastPathSegment);
                    sb.append(lastPathSegment);
                    sb.append('.');
                    sb.append(this$0.q2(this$0.contentURI));
                    this$0.videoFileName = sb.toString();
                    return;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            Uri uri3 = this$0.contentURI;
            Intrinsics.checkNotNull(uri3);
            String lastPathSegment2 = uri3.getLastPathSegment();
            Intrinsics.checkNotNull(lastPathSegment2);
            sb2.append(lastPathSegment2);
            sb2.append('.');
            sb2.append(this$0.q2(this$0.contentURI));
            String string = sb2.toString();
            this$0.videoFileName = string;
            Log.d("uploadedVideoPath-->", string);
            ClipData clipData = intentC != null ? intentC.getClipData() : null;
            if (clipData == null) {
                if ((intentC != null ? intentC.getData() : null) != null) {
                    Uri data2 = intentC != null ? intentC.getData() : null;
                    List list = this$0.uris;
                    Intrinsics.checkNotNull(data2);
                    list.add(data2);
                    this$0.w3();
                    return;
                }
                return;
            }
            int itemCount = clipData.getItemCount();
            for (int i2 = 0; i2 < itemCount; i2++) {
                ClipData.Item itemAt = clipData.getItemAt(i2);
                List list2 = this$0.uris;
                Uri uri4 = itemAt.getUri();
                Intrinsics.checkNotNullExpressionValue(uri4, "getUri(...)");
                list2.add(uri4);
            }
            this$0.w3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X1() {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.enable_gps_location);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_allow);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.el6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrafficReportVioActivity.Y1(dialog, view);
            }
        });
        ((TextView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fl6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrafficReportVioActivity.Z1(dialog, this, view);
            }
        });
        dialog.show();
    }

    public static final void X2(TrafficReportVioActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BottomSheetBehavior bottomSheetBehavior = this$0.bottomSheetBehavior;
        if (bottomSheetBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
            bottomSheetBehavior = null;
        }
        bottomSheetBehavior.X0(4);
    }

    public static final void Y1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void Y2(TrafficReportVioActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BottomSheetBehavior bottomSheetBehavior = this$0.bottomSheetBehaviorvideo;
        if (bottomSheetBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehaviorvideo");
            bottomSheetBehavior = null;
        }
        bottomSheetBehavior.X0(4);
    }

    private final void Y3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("mParivahan");
        builder.setItems(this.uploadedImgPath.length() > 0 ? (StringsKt__StringsJVMKt.equals(this.stat_Name, "odisha", true) || !StringsKt__StringsJVMKt.equals(this.stat_Name, "kerala", true)) ? new String[]{"Capture photo from camera", "Remove photo"} : new String[]{"Capture photo from camera", "Remove photo"} : (StringsKt__StringsJVMKt.equals(this.stat_Name, "odisha", true) || StringsKt__StringsJVMKt.equals(this.stat_Name, "kerala", true)) ? new String[]{"Capture photo from camera"} : new String[]{"Select photo from gallery", "Capture photo from camera", "Remove photo"}, new DialogInterface.OnClickListener() { // from class: com.zepto.wk6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                TrafficReportVioActivity.Z3(this.a, dialogInterface, i2);
            }
        });
        builder.show();
    }

    public static final void Z1(Dialog d2, TrafficReportVioActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        this$0.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
    }

    public static final void Z2(TrafficReportVioActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.imgvideTypeSect = VContant.APPLICATION_SCREEN;
        BottomSheetBehavior bottomSheetBehavior = this$0.bottomSheetBehavior;
        BottomSheetBehavior bottomSheetBehavior2 = null;
        if (bottomSheetBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
            bottomSheetBehavior = null;
        }
        bottomSheetBehavior.X0(4);
        if (Build.VERSION.SDK_INT >= 31) {
            if (StringsKt__StringsJVMKt.isBlank(this$0.uploadedVideoPath)) {
                this$0.e4();
                return;
            }
            BottomSheetBehavior bottomSheetBehavior3 = this$0.bottomSheetBehaviorvideo;
            if (bottomSheetBehavior3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehaviorvideo");
                bottomSheetBehavior3 = null;
            }
            if (bottomSheetBehavior3.v0() == 3) {
                BottomSheetBehavior bottomSheetBehavior4 = this$0.bottomSheetBehaviorvideo;
                if (bottomSheetBehavior4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehaviorvideo");
                } else {
                    bottomSheetBehavior2 = bottomSheetBehavior4;
                }
                bottomSheetBehavior2.X0(4);
                return;
            }
            BottomSheetBehavior bottomSheetBehavior5 = this$0.bottomSheetBehaviorvideo;
            if (bottomSheetBehavior5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehaviorvideo");
            } else {
                bottomSheetBehavior2 = bottomSheetBehavior5;
            }
            bottomSheetBehavior2.X0(3);
            return;
        }
        if (this$0.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == -1) {
            this$0.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 10003);
            return;
        }
        if (StringsKt__StringsJVMKt.isBlank(this$0.uploadedVideoPath)) {
            this$0.e4();
            return;
        }
        BottomSheetBehavior bottomSheetBehavior6 = this$0.bottomSheetBehaviorvideo;
        if (bottomSheetBehavior6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehaviorvideo");
            bottomSheetBehavior6 = null;
        }
        if (bottomSheetBehavior6.v0() == 3) {
            BottomSheetBehavior bottomSheetBehavior7 = this$0.bottomSheetBehaviorvideo;
            if (bottomSheetBehavior7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehaviorvideo");
            } else {
                bottomSheetBehavior2 = bottomSheetBehavior7;
            }
            bottomSheetBehavior2.X0(4);
            return;
        }
        BottomSheetBehavior bottomSheetBehavior8 = this$0.bottomSheetBehaviorvideo;
        if (bottomSheetBehavior8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehaviorvideo");
        } else {
            bottomSheetBehavior2 = bottomSheetBehavior8;
        }
        bottomSheetBehavior2.X0(3);
    }

    public static final void Z3(TrafficReportVioActivity this$0, DialogInterface dialogInterface, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (StringsKt__StringsJVMKt.equals(this$0.stat_Name, "odisha", true) || StringsKt__StringsJVMKt.equals(this$0.stat_Name, "kerala", true)) {
            if (i2 == 0) {
                this$0.d4();
                return;
            } else if (i2 == 1) {
                this$0.d2();
                return;
            } else {
                if (i2 != 2) {
                    return;
                }
                this$0.d2();
                return;
            }
        }
        if (i2 == 0) {
            this$0.c2();
        } else if (i2 == 1) {
            this$0.d4();
        } else {
            if (i2 != 2) {
                return;
            }
            this$0.d2();
        }
    }

    public static final void a3(TrafficReportVioActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.imgvideTypeSect = VContant.APPLICATION_SCREEN;
        BottomSheetBehavior bottomSheetBehavior = this$0.bottomSheetBehavior;
        BottomSheetBehavior bottomSheetBehavior2 = null;
        if (bottomSheetBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
            bottomSheetBehavior = null;
        }
        bottomSheetBehavior.X0(4);
        if (Build.VERSION.SDK_INT >= 31) {
            if (StringsKt__StringsJVMKt.isBlank(this$0.uploadedVideoPath)) {
                this$0.e4();
                return;
            }
            BottomSheetBehavior bottomSheetBehavior3 = this$0.bottomSheetBehaviorvideo;
            if (bottomSheetBehavior3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehaviorvideo");
                bottomSheetBehavior3 = null;
            }
            if (bottomSheetBehavior3.v0() == 3) {
                BottomSheetBehavior bottomSheetBehavior4 = this$0.bottomSheetBehaviorvideo;
                if (bottomSheetBehavior4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehaviorvideo");
                } else {
                    bottomSheetBehavior2 = bottomSheetBehavior4;
                }
                bottomSheetBehavior2.X0(4);
                return;
            }
            BottomSheetBehavior bottomSheetBehavior5 = this$0.bottomSheetBehaviorvideo;
            if (bottomSheetBehavior5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehaviorvideo");
            } else {
                bottomSheetBehavior2 = bottomSheetBehavior5;
            }
            bottomSheetBehavior2.X0(3);
            return;
        }
        if (this$0.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == -1) {
            this$0.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 10003);
            return;
        }
        if (StringsKt__StringsJVMKt.isBlank(this$0.uploadedVideoPath)) {
            this$0.e4();
            return;
        }
        BottomSheetBehavior bottomSheetBehavior6 = this$0.bottomSheetBehaviorvideo;
        if (bottomSheetBehavior6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehaviorvideo");
            bottomSheetBehavior6 = null;
        }
        if (bottomSheetBehavior6.v0() == 3) {
            BottomSheetBehavior bottomSheetBehavior7 = this$0.bottomSheetBehaviorvideo;
            if (bottomSheetBehavior7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehaviorvideo");
            } else {
                bottomSheetBehavior2 = bottomSheetBehavior7;
            }
            bottomSheetBehavior2.X0(4);
            return;
        }
        BottomSheetBehavior bottomSheetBehavior8 = this$0.bottomSheetBehaviorvideo;
        if (bottomSheetBehavior8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehaviorvideo");
        } else {
            bottomSheetBehavior2 = bottomSheetBehavior8;
        }
        bottomSheetBehavior2.X0(3);
    }

    public static final void b3(TrafficReportVioActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.imgvideTypeSect = VContant.MAINSCREEN;
        BottomSheetBehavior bottomSheetBehavior = this$0.bottomSheetBehaviorvideo;
        BottomSheetBehavior bottomSheetBehavior2 = null;
        if (bottomSheetBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehaviorvideo");
            bottomSheetBehavior = null;
        }
        bottomSheetBehavior.X0(4);
        if (Build.VERSION.SDK_INT >= 31) {
            if (StringsKt__StringsJVMKt.isBlank(this$0.uploadedImgPath)) {
                this$0.d4();
                return;
            }
            BottomSheetBehavior bottomSheetBehavior3 = this$0.bottomSheetBehavior;
            if (bottomSheetBehavior3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
                bottomSheetBehavior3 = null;
            }
            if (bottomSheetBehavior3.v0() == 3) {
                BottomSheetBehavior bottomSheetBehavior4 = this$0.bottomSheetBehavior;
                if (bottomSheetBehavior4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
                } else {
                    bottomSheetBehavior2 = bottomSheetBehavior4;
                }
                bottomSheetBehavior2.X0(4);
                return;
            }
            BottomSheetBehavior bottomSheetBehavior5 = this$0.bottomSheetBehavior;
            if (bottomSheetBehavior5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
            } else {
                bottomSheetBehavior2 = bottomSheetBehavior5;
            }
            bottomSheetBehavior2.X0(3);
            return;
        }
        if (this$0.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == -1) {
            this$0.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 10001);
            return;
        }
        if (StringsKt__StringsJVMKt.isBlank(this$0.uploadedImgPath)) {
            this$0.d4();
            return;
        }
        BottomSheetBehavior bottomSheetBehavior6 = this$0.bottomSheetBehavior;
        if (bottomSheetBehavior6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
            bottomSheetBehavior6 = null;
        }
        if (bottomSheetBehavior6.v0() == 3) {
            BottomSheetBehavior bottomSheetBehavior7 = this$0.bottomSheetBehavior;
            if (bottomSheetBehavior7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
            } else {
                bottomSheetBehavior2 = bottomSheetBehavior7;
            }
            bottomSheetBehavior2.X0(4);
            return;
        }
        BottomSheetBehavior bottomSheetBehavior8 = this$0.bottomSheetBehavior;
        if (bottomSheetBehavior8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
        } else {
            bottomSheetBehavior2 = bottomSheetBehavior8;
        }
        bottomSheetBehavior2.X0(3);
    }

    private final void c2() {
        try {
            this.imgType = "gallery";
            this.getImageLauncher.a(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI));
        } catch (Exception unused) {
        }
    }

    public static final void c3(TrafficReportVioActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.imgvideTypeSect = VContant.MAINSCREEN;
        BottomSheetBehavior bottomSheetBehavior = this$0.bottomSheetBehaviorvideo;
        BottomSheetBehavior bottomSheetBehavior2 = null;
        if (bottomSheetBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehaviorvideo");
            bottomSheetBehavior = null;
        }
        bottomSheetBehavior.X0(4);
        if (Build.VERSION.SDK_INT >= 31) {
            if (StringsKt__StringsJVMKt.isBlank(this$0.uploadedImgPath)) {
                this$0.d4();
                return;
            }
            BottomSheetBehavior bottomSheetBehavior3 = this$0.bottomSheetBehavior;
            if (bottomSheetBehavior3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
                bottomSheetBehavior3 = null;
            }
            if (bottomSheetBehavior3.v0() == 3) {
                BottomSheetBehavior bottomSheetBehavior4 = this$0.bottomSheetBehavior;
                if (bottomSheetBehavior4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
                } else {
                    bottomSheetBehavior2 = bottomSheetBehavior4;
                }
                bottomSheetBehavior2.X0(4);
                return;
            }
            BottomSheetBehavior bottomSheetBehavior5 = this$0.bottomSheetBehavior;
            if (bottomSheetBehavior5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
            } else {
                bottomSheetBehavior2 = bottomSheetBehavior5;
            }
            bottomSheetBehavior2.X0(3);
            return;
        }
        if (this$0.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == -1) {
            this$0.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 10001);
            return;
        }
        if (StringsKt__StringsJVMKt.isBlank(this$0.uploadedImgPath)) {
            this$0.d4();
            return;
        }
        BottomSheetBehavior bottomSheetBehavior6 = this$0.bottomSheetBehavior;
        if (bottomSheetBehavior6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
            bottomSheetBehavior6 = null;
        }
        if (bottomSheetBehavior6.v0() == 3) {
            BottomSheetBehavior bottomSheetBehavior7 = this$0.bottomSheetBehavior;
            if (bottomSheetBehavior7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
            } else {
                bottomSheetBehavior2 = bottomSheetBehavior7;
            }
            bottomSheetBehavior2.X0(4);
            return;
        }
        BottomSheetBehavior bottomSheetBehavior8 = this$0.bottomSheetBehavior;
        if (bottomSheetBehavior8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
        } else {
            bottomSheetBehavior2 = bottomSheetBehavior8;
        }
        bottomSheetBehavior2.X0(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c4() {
        df dfVar = this.binding;
        if (dfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dfVar = null;
        }
        dfVar.z.setVisibility(0);
        f80.d(ef3.a(this), qk1.b(), null, new w(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d2() {
        this.uploadedImgPath = "";
        this.imageFileName = "";
        df dfVar = this.binding;
        if (dfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dfVar = null;
        }
        dfVar.n.setBackgroundResource(R.drawable.ic_photo_add);
    }

    public static final boolean d3(TrafficReportVioActivity this$0, TextView textView, int i2, KeyEvent keyEvent) throws JSONException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i2 != 6) {
            return false;
        }
        df dfVar = this$0.binding;
        df dfVar2 = null;
        if (dfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dfVar = null;
        }
        if (String.valueOf(dfVar.l.getText()).length() <= 3) {
            Object systemService = this$0.getSystemService("input_method");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(textView.getWindowToken(), 0);
        } else if (this$0.startEvent) {
            Object systemService2 = this$0.getSystemService("input_method");
            Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService2).hideSoftInputFromWindow(textView.getWindowToken(), 0);
            this$0.isServiceenable = false;
            df dfVar3 = this$0.binding;
            if (dfVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dfVar3 = null;
            }
            dfVar3.z.setVisibility(0);
            ld7 ld7VarO2 = this$0.O2();
            df dfVar4 = this$0.binding;
            if (dfVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dfVar4 = null;
            }
            String strValueOf = String.valueOf(dfVar4.l.getText());
            df dfVar5 = this$0.binding;
            if (dfVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                dfVar2 = dfVar5;
            }
            String strSubstring = String.valueOf(dfVar2.l.getText()).substring(0, 2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            ld7VarO2.F(this$0, strValueOf, strSubstring);
            this$0.startEvent = false;
        } else {
            Object systemService3 = this$0.getSystemService("input_method");
            Intrinsics.checkNotNull(systemService3, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService3).hideSoftInputFromWindow(textView.getWindowToken(), 0);
        }
        return true;
    }

    private final void d4() {
        try {
            if (aj0.a.a(this)) {
                this.imgType = "camera";
                setIntent(new Intent("android.media.action.IMAGE_CAPTURE"));
                this.imageUri = FileProvider.f(this, getPackageName() + ".provider", new File(getExternalCacheDir(), "captured_image.jpg"));
                getIntent().putExtra("output", this.imageUri);
                getIntent().addFlags(1);
                this.getImageLauncher.a(getIntent());
            } else if (st6.d(this)) {
                this.imgType = "camera";
                setIntent(new Intent("android.media.action.IMAGE_CAPTURE"));
                this.imageUri = FileProvider.f(this, getPackageName() + ".provider", new File(getExternalCacheDir(), "captured_image.jpg"));
                getIntent().putExtra("output", this.imageUri);
                getIntent().addFlags(1);
                this.getImageLauncher.a(getIntent());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e2() {
        this.uploadedVideoPath = "";
        this.videoFileName = "";
        df dfVar = this.binding;
        if (dfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dfVar = null;
        }
        dfVar.o.setBackgroundResource(R.drawable.ic_video_add);
    }

    public static final void e3(TrafficReportVioActivity this$0) throws JSONException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Rect rect = new Rect();
        df dfVar = this$0.binding;
        df dfVar2 = null;
        if (dfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dfVar = null;
        }
        dfVar.w.getWindowVisibleDisplayFrame(rect);
        df dfVar3 = this$0.binding;
        if (dfVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dfVar3 = null;
        }
        if (r1 - rect.bottom > ((double) dfVar3.w.getRootView().getHeight()) * 0.15d) {
            this$0.isServiceenable = true;
            return;
        }
        df dfVar4 = this$0.binding;
        if (dfVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dfVar4 = null;
        }
        Editable text = dfVar4.l.getText();
        Intrinsics.checkNotNull(text);
        if (text.length() > 3) {
            df dfVar5 = this$0.binding;
            if (dfVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dfVar5 = null;
            }
            if (dfVar5.b.getSelectedItemPosition() == 0) {
                if (!a.a.a(this$0)) {
                    Toast.makeText(this$0, new wa3(this$0).b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
                    return;
                }
                if (this$0.isServiceenable) {
                    this$0.isServiceenable = false;
                    df dfVar6 = this$0.binding;
                    if (dfVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dfVar6 = null;
                    }
                    dfVar6.z.setVisibility(0);
                    ld7 ld7VarO2 = this$0.O2();
                    df dfVar7 = this$0.binding;
                    if (dfVar7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dfVar7 = null;
                    }
                    String strValueOf = String.valueOf(dfVar7.l.getText());
                    df dfVar8 = this$0.binding;
                    if (dfVar8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        dfVar2 = dfVar8;
                    }
                    String strSubstring = String.valueOf(dfVar2.l.getText()).substring(0, 2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    ld7VarO2.F(this$0, strValueOf, strSubstring);
                }
            }
        }
    }

    private final void e4() {
        this.videoType = "videoType";
        this.imgType = "";
        if (aj0.a.a(this)) {
            setIntent(new Intent("android.media.action.VIDEO_CAPTURE"));
            getIntent().putExtra("return-data", true);
            getIntent().putExtra("android.intent.extra.videoQuality", 1);
            getIntent().putExtra("android.intent.extra.durationLimit", 10);
            this.getVideoLauncher.a(getIntent());
            return;
        }
        if (st6.d(this)) {
            this.videoUri = h2();
            setIntent(new Intent("android.media.action.VIDEO_CAPTURE"));
            getIntent().putExtra("return-data", true);
            getIntent().putExtra("android.intent.extra.videoQuality", 1);
            getIntent().putExtra("android.intent.extra.durationLimit", 10);
            this.getVideoLauncher.a(getIntent());
        }
    }

    public static final void f3(TrafficReportVioActivity this$0, NapixTokenModel napixTokenModel) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            ItmsMasterViewModel itmsMasterViewModel = this$0.itmsMasterViewModel;
            Intrinsics.checkNotNull(itmsMasterViewModel);
            itmsMasterViewModel.g(hz0.a.E(this$0.stat_Name));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g2(Uri uri) {
        try {
            InputStream inputStreamOpenInputStream = getContentResolver().openInputStream(uri);
            Intrinsics.checkNotNull(inputStreamOpenInputStream);
            byte[] bArrK2 = k2(inputStreamOpenInputStream);
            Intrinsics.checkNotNull(bArrK2);
            String strEncodeToString = Base64.encodeToString(bArrK2, 0);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
            this.uploadedVideoPath = strEncodeToString;
            this.uploadedVideoPath = StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(strEncodeToString, "\n", "", false, 4, (Object) null), "\r", "", false, 4, (Object) null);
        } catch (Exception e2) {
            e2.printStackTrace();
            Log.d("error", "onActivityResult: " + e2);
        }
    }

    public static final void g3(TrafficReportVioActivity this$0, ItmsStateModle itmsStateModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (StringsKt__StringsJVMKt.equals(hz0.a.E(this$0.stat_Name), "CG", true)) {
                ArrayList arrayList = new ArrayList();
                ArrayList<DataX> data = itmsStateModle.getData();
                Intrinsics.checkNotNull(data);
                int size = data.size();
                for (int i2 = 0; i2 < size; i2++) {
                    String district = data.get(i2).getDistrict();
                    Intrinsics.checkNotNull(district);
                    String upperCase = district.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    arrayList.add(upperCase);
                }
                String upperCase2 = this$0.distName.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                if (arrayList.contains(upperCase2.toString())) {
                    return;
                }
                this$0.disBoolean = false;
                this$0.q3("Report traffic violation service is not available in " + this$0.distName + " District");
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void h3(String str) {
    }

    public static final void i3(TrafficReportVioActivity this$0, View view) {
        Bitmap bitmapC;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BottomSheetBehavior bottomSheetBehavior = this$0.bottomSheetBehavior;
        if (bottomSheetBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
            bottomSheetBehavior = null;
        }
        bottomSheetBehavior.X0(4);
        if (this$0.uploadedImgPath.length() <= 0 || (bitmapC = st6.c(this$0.uploadedImgPath)) == null) {
            return;
        }
        tf4.a.t(this$0, bitmapC);
    }

    public static final void j3(TrafficReportVioActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BottomSheetBehavior bottomSheetBehavior = this$0.bottomSheetBehaviorvideo;
        if (bottomSheetBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehaviorvideo");
            bottomSheetBehavior = null;
        }
        bottomSheetBehavior.X0(4);
        Uri uri = this$0.contentURI;
        if (uri != null) {
            tf4.a aVar = tf4.a;
            Intrinsics.checkNotNull(uri);
            aVar.v(this$0, uri);
        }
    }

    public static final void k3(TrafficReportVioActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BottomSheetBehavior bottomSheetBehavior = this$0.bottomSheetBehaviorvideo;
        if (bottomSheetBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehaviorvideo");
            bottomSheetBehavior = null;
        }
        bottomSheetBehavior.X0(4);
        this$0.e4();
    }

    public static final void l3(TrafficReportVioActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BottomSheetBehavior bottomSheetBehavior = this$0.bottomSheetBehavior;
        if (bottomSheetBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
            bottomSheetBehavior = null;
        }
        bottomSheetBehavior.X0(4);
        this$0.d4();
    }

    public static final void m3(TrafficReportVioActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void n3(TrafficReportVioActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) TrafficHistoryActivity.class));
        this$0.finish();
    }

    public static final void o3(TrafficReportVioActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) TrafficDashboardActivity.class));
        this$0.finish();
    }

    public static final void p3(TrafficReportVioActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            df dfVar = this$0.binding;
            df dfVar2 = null;
            if (dfVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dfVar = null;
            }
            Editable text = dfVar.l.getText();
            Intrinsics.checkNotNull(text);
            if (text.length() != 0) {
                df dfVar3 = this$0.binding;
                if (dfVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dfVar3 = null;
                }
                Editable text2 = dfVar3.l.getText();
                Intrinsics.checkNotNull(text2);
                if (text2.length() > 4) {
                    if (this$0.mSelectedValue == 0) {
                        if (this$0.offencesList.size() > 1) {
                            this$0.s3("Please select violation type");
                            return;
                        }
                        this$0.s3(this$0.F2().b("trafficRep_availMsg", "Report traffic violation service is not available in ") + ' ' + this$0.stat_Name + ' ' + this$0.F2().b("vahan_state", "State"));
                        return;
                    }
                    df dfVar4 = this$0.binding;
                    if (dfVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dfVar4 = null;
                    }
                    if (!new Regex("[a-zA-Z0-9]*").matches(String.valueOf(dfVar4.l.getText()))) {
                        df dfVar5 = this$0.binding;
                        if (dfVar5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            dfVar2 = dfVar5;
                        }
                        dfVar2.l.requestFocus();
                        this$0.s3(this$0.F2().b("label_challan_rc_validation", "Please enter vehicle number.Minimum 4 & maximum 10 characters with no special character"));
                        return;
                    }
                    CharSequence text3 = this$0.o2().getText();
                    Intrinsics.checkNotNullExpressionValue(text3, "getText(...)");
                    if (text3.length() == 0) {
                        this$0.o2().requestFocus();
                        this$0.X1();
                        return;
                    }
                    df dfVar6 = this$0.binding;
                    if (dfVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dfVar6 = null;
                    }
                    Editable text4 = dfVar6.h.getText();
                    Intrinsics.checkNotNullExpressionValue(text4, "getText(...)");
                    if (text4.length() == 0) {
                        this$0.s3(this$0.F2().b("enter_comments", "Please enter comments"));
                        return;
                    }
                    gd1.a aVar = gd1.a;
                    if (aVar.m(this$0.imageFileName) && this$0.b2(this$0.stat_Name)) {
                        this$0.s3(this$0.F2().b("attachImage", "Please attach an Image"));
                        return;
                    }
                    if (aVar.m(this$0.videoFileName) && this$0.a2(this$0.stat_Name)) {
                        this$0.s3(this$0.F2().b("attachVideo", "Please attach a Video"));
                        return;
                    }
                    if (!this$0.disBoolean) {
                        this$0.q3("Report traffic violation service is not available in " + this$0.distName + " District");
                        return;
                    }
                    ArrayList arrayListN2 = this$0.n2(this$0);
                    String upperCase = this$0.stat_Name.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    if (!arrayListN2.contains(StringsKt__StringsKt.trim((CharSequence) upperCase).toString())) {
                        this$0.s3(this$0.F2().b("trafficRep_availMsg", "Report traffic violation service is not available in ") + ' ' + this$0.stat_Name);
                        return;
                    }
                    df dfVar7 = this$0.binding;
                    if (dfVar7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dfVar7 = null;
                    }
                    dfVar7.f.setEnabled(false);
                    df dfVar8 = this$0.binding;
                    if (dfVar8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dfVar8 = null;
                    }
                    dfVar8.f.setAlpha(0.5f);
                    String string = Settings.Secure.getString(this$0.w2().getContentResolver(), "android_id");
                    df dfVar9 = this$0.binding;
                    if (dfVar9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dfVar9 = null;
                    }
                    dfVar9.z.setVisibility(0);
                    vf4 vf4VarY2 = this$0.y2();
                    df dfVar10 = this$0.binding;
                    if (dfVar10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        dfVar2 = dfVar10;
                    }
                    String strValueOf = String.valueOf(dfVar2.l.getText());
                    long j2 = Long.parseLong(this$0.G2().k());
                    String strL = this$0.G2().l();
                    Intrinsics.checkNotNull(string);
                    vf4VarY2.b0(strValueOf, j2, strL, string, this$0.G2().e());
                    return;
                }
            }
            df dfVar11 = this$0.binding;
            if (dfVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                dfVar2 = dfVar11;
            }
            dfVar2.l.requestFocus();
            this$0.s3(this$0.F2().b("label_challan_rc_validation", "Please enter vehicle number.Minimum 4 & maximum 10 characters with no special character"));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private final String q2(Uri uri) {
        ContentResolver contentResolver = getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        Intrinsics.checkNotNullExpressionValue(singleton, "getSingleton(...)");
        Intrinsics.checkNotNull(uri);
        return singleton.getExtensionFromMimeType(contentResolver.getType(uri));
    }

    public static final void r3(TrafficReportVioActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Dialog dialog = this$0.d;
        if (dialog != null) {
            dialog.dismiss();
        }
        this$0.startActivity(new Intent(this$0, (Class<?>) TrafficDashboardActivity.class));
        this$0.finish();
    }

    public static final void s2(TrafficReportVioActivity this$0, gf gfVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (gfVar.d() == -1) {
            gfVar.c();
            if (Intrinsics.areEqual(this$0.imgType, "camera")) {
                this$0.X3();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s3(String message) {
        Dialog dialog;
        Dialog dialog2 = this.d;
        Boolean boolValueOf = dialog2 != null ? Boolean.valueOf(dialog2.isShowing()) : null;
        Intrinsics.checkNotNull(boolValueOf);
        if (boolValueOf.booleanValue() && (dialog = this.d) != null) {
            dialog.dismiss();
        }
        Dialog dialog3 = this.d;
        if (dialog3 != null) {
            dialog3.setContentView(R.layout.msg_dialog);
        }
        Dialog dialog4 = this.d;
        Window window = dialog4 != null ? dialog4.getWindow() : null;
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        Dialog dialog5 = this.d;
        TextView textView = dialog5 != null ? (TextView) dialog5.findViewById(R.id.pop_up_msg) : null;
        Intrinsics.checkNotNull(textView, "null cannot be cast to non-null type android.widget.TextView");
        Dialog dialog6 = this.d;
        TextView textView2 = dialog6 != null ? (TextView) dialog6.findViewById(R.id.pop_up_close) : null;
        Intrinsics.checkNotNull(textView2, "null cannot be cast to non-null type android.widget.TextView");
        textView.setText(message);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cl6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrafficReportVioActivity.t3(this.a, view);
            }
        });
        Dialog dialog7 = this.d;
        if (dialog7 != null) {
            dialog7.show();
        }
    }

    public static final void t3(TrafficReportVioActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Dialog dialog = this$0.d;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u3(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.al6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrafficReportVioActivity.v3(dialog, this, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v2(double lat, double lang) {
        List<Address> fromLocation;
        try {
            try {
                this.lagG = x3(lang);
                this.latG = x3(lat);
                S2(this, String.valueOf(this.lagG), String.valueOf(this.latG));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            df dfVar = null;
            try {
                fromLocation = new Geocoder(this, Locale.getDefault()).getFromLocation(lat, lang, 1);
                Intrinsics.checkNotNull(fromLocation);
            } catch (Exception unused) {
                fromLocation = null;
            }
            try {
                String adminArea = fromLocation.get(0).getAdminArea();
                Intrinsics.checkNotNullExpressionValue(adminArea, "getAdminArea(...)");
                this.stat_Name = adminArea;
                df dfVar2 = this.binding;
                if (dfVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dfVar2 = null;
                }
                dfVar2.y.setText(this.stat_Name);
                Log.e("Location -- ", ' ' + this.stat_Name);
                if (StringsKt__StringsJVMKt.equals(this.stat_Name, "OD", true) || StringsKt__StringsJVMKt.equals(this.stat_Name, "OR", true) || StringsKt__StringsJVMKt.equals(this.stat_Name, "odisha", true)) {
                    df dfVar3 = this.binding;
                    if (dfVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dfVar3 = null;
                    }
                    dfVar3.p.setVisibility(8);
                }
                String subLocality = fromLocation.get(0).getSubLocality();
                Intrinsics.checkNotNullExpressionValue(subLocality, "getSubLocality(...)");
                this.addressNameFor = subLocality;
            } catch (Exception unused2) {
                df dfVar4 = this.binding;
                if (dfVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    dfVar = dfVar4;
                }
                dfVar.y.setText(this.stat_Name);
                this.addressNameFor = this.stat_Name;
            }
            if (gd1.a.m(o2().getText().toString())) {
                Log.e("Location 1-- ", " true");
                y2().W(hz0.a.E(this.stat_Name));
            } else {
                Log.e("Location 1-- ", " else");
            }
            Intrinsics.checkNotNull(fromLocation);
            if (fromLocation.isEmpty()) {
                String string = getResources().getString(R.string.location_not_find);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                I3(string);
            } else {
                String addressLine = fromLocation.get(0).getAddressLine(0);
                Intrinsics.checkNotNullExpressionValue(addressLine, "getAddressLine(...)");
                I3(addressLine);
                o2().setText(z2());
            }
            A2().j(this);
        } catch (Exception e3) {
            String string2 = getResources().getString(R.string.location_not_find);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            I3(string2);
            e3.printStackTrace();
        }
    }

    public static final void v3(Dialog d2, TrafficReportVioActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        df dfVar = this$0.binding;
        df dfVar2 = null;
        if (dfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dfVar = null;
        }
        dfVar.l.setText("");
        df dfVar3 = this$0.binding;
        if (dfVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dfVar3 = null;
        }
        dfVar3.x.setPrompt("Select State");
        df dfVar4 = this$0.binding;
        if (dfVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dfVar4 = null;
        }
        dfVar4.x.setSelection(0);
        df dfVar5 = this$0.binding;
        if (dfVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            dfVar2 = dfVar5;
        }
        dfVar2.h.setText("");
    }

    public final v14 A2() {
        v14 v14Var = this.napixViewModel;
        if (v14Var != null) {
            return v14Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("napixViewModel");
        return null;
    }

    public final void A3(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.evLocation = textView;
    }

    /* JADX INFO: renamed from: B2, reason: from getter */
    public final int getOffenceId() {
        return this.offenceId;
    }

    public final void B3(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.evTime = textView;
    }

    /* JADX INFO: renamed from: C2, reason: from getter */
    public final ArrayList getOffencesList() {
        return this.offencesList;
    }

    public final void C3() {
        LocationRequest locationRequestC = LocationRequest.c();
        locationRequestC.q(60000L);
        locationRequestC.p(300000L);
        locationRequestC.r(100);
        Intrinsics.checkNotNullExpressionValue(locationRequestC, "apply(...)");
        if (yy0.a(this, "android.permission.ACCESS_FINE_LOCATION") == 0 || yy0.a(this, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            bi2 bi2Var = this.fusedLocationProviderClient;
            bi2 bi2Var2 = null;
            if (bi2Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fusedLocationProviderClient");
                bi2Var = null;
            }
            qm3 qm3Var = this.locationCallback;
            Intrinsics.checkNotNull(qm3Var);
            bi2Var.e(locationRequestC, qm3Var, Looper.getMainLooper());
            bi2 bi2Var3 = this.fusedLocationProviderClient;
            if (bi2Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fusedLocationProviderClient");
            } else {
                bi2Var2 = bi2Var3;
            }
            Task taskB = bi2Var2.b();
            final v vVar = new v();
            taskB.f(new eh4() { // from class: com.zepto.lk6
                @Override // com.zepto.eh4
                public final void b(Object obj) {
                    TrafficReportVioActivity.D3(vVar, obj);
                }
            });
        }
    }

    public final int D2(String state, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(arrayList, "arrayList");
        try {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                String name = ((Name) arrayList.get(i2)).getName();
                Locale locale = Locale.ROOT;
                String upperCase = name.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                String string = StringsKt__StringsKt.trim((CharSequence) upperCase).toString();
                String upperCase2 = state.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                if (StringsKt__StringsJVMKt.equals(string, StringsKt__StringsKt.trim((CharSequence) upperCase2).toString(), true)) {
                    return i2;
                }
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    /* JADX INFO: renamed from: E2, reason: from getter */
    public final boolean getRcVerified() {
        return this.rcVerified;
    }

    public final void E3(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final wa3 F2() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final void F3(OffenceInterface offenceInterface) {
        Intrinsics.checkNotNullParameter(offenceInterface, "<set-?>");
        this.mOffenceInterface = offenceInterface;
    }

    public final ws6 G2() {
        ws6 ws6Var = this.sessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
        return null;
    }

    public final void G3(vf4 vf4Var) {
        Intrinsics.checkNotNullParameter(vf4Var, "<set-?>");
        this.mOffenceViewModel = vf4Var;
    }

    /* JADX INFO: renamed from: H2, reason: from getter */
    public final String getStat_Name() {
        return this.stat_Name;
    }

    public final void H3(int i2) {
        this.mSelectedValue = i2;
    }

    public final ArrayList I2() {
        ArrayList arrayList = this.stateList;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("stateList");
        return null;
    }

    public final void I3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.myLocation = str;
    }

    public final void J2(TextView textView, Context context) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(context, "context");
        final Calendar calendar = Calendar.getInstance();
        new TimePickerDialog.OnTimeSetListener() { // from class: com.zepto.dl6
            @Override // android.app.TimePickerDialog.OnTimeSetListener
            public final void onTimeSet(TimePicker timePicker, int i2, int i3) {
                TrafficReportVioActivity.K2(calendar, this, timePicker, i2, i3);
            }
        };
    }

    public final void J3(v14 v14Var) {
        Intrinsics.checkNotNullParameter(v14Var, "<set-?>");
        this.napixViewModel = v14Var;
    }

    public final void K3(int i2) {
        this.offenceId = i2;
    }

    /* JADX INFO: renamed from: L2, reason: from getter */
    public final String getUploadedImgPath() {
        return this.uploadedImgPath;
    }

    public final void L3(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.offencesList = arrayList;
    }

    /* JADX INFO: renamed from: M2, reason: from getter */
    public final String getUploadedVideoPath() {
        return this.uploadedVideoPath;
    }

    public final void M3(boolean z) {
        this.rcVerified = z;
    }

    public final VahanProService N2() {
        VahanProService vahanProService = this.vahanService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vahanService");
        return null;
    }

    public final void N3(boolean z) {
        this.isServiceenable = z;
    }

    public final ld7 O2() {
        ld7 ld7Var = this.vahanViewModle;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vahanViewModle");
        return null;
    }

    public final void O3(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    /* JADX INFO: renamed from: P2, reason: from getter */
    public final String getVideoFileName() {
        return this.videoFileName;
    }

    public final void P3(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    public final long Q2(Uri contentUri) {
        Intrinsics.checkNotNullParameter(contentUri, "contentUri");
        Cursor cursorQuery = getContentResolver().query(contentUri, null, null, null, null);
        try {
            Intrinsics.checkNotNull(cursorQuery);
            int columnIndex = cursorQuery.getColumnIndex("_size");
            cursorQuery.moveToFirst();
            Log.v("SIze", String.valueOf(cursorQuery.getLong(columnIndex)));
            long j2 = cursorQuery.getLong(columnIndex);
            CloseableKt.closeFinally(cursorQuery, null);
            return j2;
        } finally {
        }
    }

    public final void Q3(boolean z) {
        this.startEvent = z;
    }

    public final void R3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stat_Name = str;
    }

    public final void S2(Context context, String lon, String lot) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(lon, "lon");
        Intrinsics.checkNotNullParameter(lot, "lot");
        ReverseGeoCoding.INSTANCE.a(context).reversegeocoding(lon, lot).enqueue(new c());
    }

    public final void S3(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.stateList = arrayList;
    }

    public final ArrayList T2(String classId, ArrayList offencesList) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(offencesList, "offencesList");
        ArrayList arrayList = new ArrayList();
        if (offencesList.size() > 0) {
            int size = offencesList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (StringsKt__StringsKt.split$default((CharSequence) ((MparOffence) offencesList.get(i2)).getOffenceVchCatg(), new String[]{","}, false, 0, 6, (Object) null).contains(classId)) {
                    arrayList.add(offencesList.get(i2));
                }
            }
        }
        return arrayList;
    }

    public final void T3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stateValue = str;
    }

    public final Bitmap U2(String imagePath, Bitmap bitmap) {
        int attributeInt = new ExifInterface(imagePath).getAttributeInt("Orientation", 1);
        Matrix matrix = new Matrix();
        if (attributeInt == 3) {
            matrix.postRotate(180.0f);
        } else if (attributeInt == 6) {
            matrix.postRotate(90.0f);
        } else {
            if (attributeInt != 8) {
                return bitmap;
            }
            matrix.postRotate(270.0f);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    public final void U3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uploadedImgPath = str;
    }

    public final void V2() {
        df dfVar = this.binding;
        df dfVar2 = null;
        if (dfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dfVar = null;
        }
        dfVar.n.setVisibility(8);
        df dfVar3 = this.binding;
        if (dfVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            dfVar2 = dfVar3;
        }
        dfVar2.e.setVisibility(8);
    }

    public final void V3(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.vahanService = vahanProService;
    }

    public final void W2() {
        bi2 bi2VarA = wm3.a(this);
        Intrinsics.checkNotNullExpressionValue(bi2VarA, "getFusedLocationProviderClient(...)");
        this.fusedLocationProviderClient = bi2VarA;
        this.locationCallback = new d();
    }

    public final void W3(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.vahanViewModle = ld7Var;
    }

    public final void X3() {
        f2();
        this.imageFileName = "img_" + System.currentTimeMillis() + ".jpg";
    }

    public final boolean a2(String stateName) {
        Intrinsics.checkNotNullParameter(stateName, "stateName");
        return (StringsKt__StringsJVMKt.equals(stateName, "cg", true) || StringsKt__StringsJVMKt.equals(stateName, "CG", true) || StringsKt__StringsJVMKt.equals(stateName, "Chhattisgarh", true) || StringsKt__StringsJVMKt.equals(stateName, "Kerala", true) || StringsKt__StringsJVMKt.equals(stateName, "KL", true) || StringsKt__StringsJVMKt.equals(stateName, "kl", true) || StringsKt__StringsJVMKt.equals(stateName, "TR", true) || StringsKt__StringsJVMKt.equals(stateName, "Tripura", true)) ? false : true;
    }

    public final void a4() {
        df dfVar = this.binding;
        df dfVar2 = null;
        if (dfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dfVar = null;
        }
        dfVar.n.setVisibility(0);
        df dfVar3 = this.binding;
        if (dfVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            dfVar2 = dfVar3;
        }
        dfVar2.e.setVisibility(0);
    }

    public final boolean b2(String stateName) {
        Intrinsics.checkNotNullParameter(stateName, "stateName");
        return (StringsKt__StringsJVMKt.equals(stateName, "OD", true) || StringsKt__StringsJVMKt.equals(stateName, "OR", true) || StringsKt__StringsJVMKt.equals(stateName, "odisha", true)) ? false : true;
    }

    public final void b4() {
        if (this.locationCallback != null) {
            bi2 bi2Var = this.fusedLocationProviderClient;
            if (bi2Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fusedLocationProviderClient");
                bi2Var = null;
            }
            qm3 qm3Var = this.locationCallback;
            Intrinsics.checkNotNull(qm3Var);
            bi2Var.d(qm3Var);
            this.locationCallback = null;
            Log.d("LocationUpdate", "Location updates stopped");
        }
    }

    public final void f2() {
        this.imgvideType = VContant.MAINSCREEN;
        df dfVar = this.binding;
        if (dfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dfVar = null;
        }
        dfVar.g.setVisibility(0);
        V2();
        f80.d(zz0.a(qk1.b()), null, null, new b(null), 3, null);
    }

    public final Uri h2() {
        Uri uriF = FileProvider.f(this, getPackageName() + ".provider", new File(getExternalCacheDir(), "captured_video.mp4"));
        Intrinsics.checkNotNullExpressionValue(uriF, "getUriForFile(...)");
        return uriF;
    }

    public final ArrayList i2(Context context, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(arrayList, "arrayList");
        ArrayList arrayList2 = new ArrayList();
        try {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((Name) arrayList.get(i2)).isSentinal()) {
                    arrayList2.add(arrayList.get(i2));
                }
            }
        } catch (Exception unused) {
        }
        return arrayList2.size() > 0 ? arrayList2 : arrayList;
    }

    /* JADX INFO: renamed from: j2, reason: from getter */
    public final String getAddressNameFor() {
        return this.addressNameFor;
    }

    public final byte[] k2(InputStream inputStream) throws IOException {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i2);
        }
    }

    /* JADX INFO: renamed from: l2, reason: from getter */
    public final String getDistId() {
        return this.distId;
    }

    /* JADX INFO: renamed from: m2, reason: from getter */
    public final String getDistName() {
        return this.distName;
    }

    public final ArrayList n2(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList arrayList = new ArrayList();
        try {
            Object objFromJson = new Gson().fromJson(new dl4(context).e().toString(), (Class<Object>) StateMaster.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            ArrayList<State> states = ((StateMaster) objFromJson).getStates();
            Intrinsics.checkNotNull(states, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.Account.Model.State>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.Account.Model.State> }");
            int size = states.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (states.get(i2).isSentinal()) {
                    String upperCase = states.get(i2).getName().toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    arrayList.add(StringsKt__StringsKt.trim((CharSequence) upperCase).toString());
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public final TextView o2() {
        TextView textView = this.evLocation;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("evLocation");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        df dfVarC = df.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(dfVarC, "inflate(...)");
        this.binding = dfVarC;
        df dfVar = null;
        if (dfVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dfVarC = null;
        }
        setContentView(dfVarC.b());
        getWindow().addFlags(128);
        df dfVar2 = this.binding;
        if (dfVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dfVar2 = null;
        }
        BottomSheetBehavior bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(dfVar2.c.b);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorQ0, "from(...)");
        this.bottomSheetBehavior = bottomSheetBehaviorQ0;
        df dfVar3 = this.binding;
        if (dfVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dfVar3 = null;
        }
        BottomSheetBehavior bottomSheetBehaviorQ02 = BottomSheetBehavior.q0(dfVar3.d.b);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorQ02, "from(...)");
        this.bottomSheetBehaviorvideo = bottomSheetBehaviorQ02;
        BottomSheetBehavior bottomSheetBehavior = this.bottomSheetBehavior;
        if (bottomSheetBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
            bottomSheetBehavior = null;
        }
        bottomSheetBehavior.c0(new l());
        BottomSheetBehavior bottomSheetBehavior2 = this.bottomSheetBehaviorvideo;
        if (bottomSheetBehavior2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehaviorvideo");
            bottomSheetBehavior2 = null;
        }
        bottomSheetBehavior2.c0(new r());
        df dfVar4 = this.binding;
        if (dfVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dfVar4 = null;
        }
        dfVar4.c.c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gl6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrafficReportVioActivity.X2(this.a, view);
            }
        });
        df dfVar5 = this.binding;
        if (dfVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dfVar5 = null;
        }
        dfVar5.d.c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ok6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrafficReportVioActivity.Y2(this.a, view);
            }
        });
        df dfVar6 = this.binding;
        if (dfVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dfVar6 = null;
        }
        dfVar6.c.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pk6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrafficReportVioActivity.i3(this.a, view);
            }
        });
        df dfVar7 = this.binding;
        if (dfVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dfVar7 = null;
        }
        dfVar7.d.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qk6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrafficReportVioActivity.j3(this.a, view);
            }
        });
        df dfVar8 = this.binding;
        if (dfVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dfVar8 = null;
        }
        dfVar8.d.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rk6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrafficReportVioActivity.k3(this.a, view);
            }
        });
        df dfVar9 = this.binding;
        if (dfVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dfVar9 = null;
        }
        dfVar9.c.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sk6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrafficReportVioActivity.l3(this.a, view);
            }
        });
        try {
            V3(VahanProService.INSTANCE.a(this));
            W3((ld7) new z(this, new kd7(new jd7(N2()))).a(ld7.class));
            J3((v14) new z(this, new w14(new t14(this.napixService))).a(v14.class));
            this.itmeService = ItmsDistictMaster.INSTANCE.a(this);
            ItmsDistictMaster itmsDistictMaster = this.itmeService;
            Intrinsics.checkNotNull(itmsDistictMaster);
            this.itmsMasterViewModel = (ItmsMasterViewModel) new z(this, new d33(new c33(itmsDistictMaster))).a(ItmsMasterViewModel.class);
            ArrayList arrayList = new ArrayList();
            arrayList.add(0, new MparOffence("Select Violation", 0, 0, "0"));
            nf4 nf4Var = new nf4(this, arrayList);
            df dfVar10 = this.binding;
            if (dfVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dfVar10 = null;
            }
            dfVar10.b.setAdapter((SpinnerAdapter) nf4Var);
            W2();
            C3();
        } catch (Exception unused) {
        }
        this.d = new Dialog(this);
        df dfVar11 = this.binding;
        if (dfVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dfVar11 = null;
        }
        dfVar11.h.addTextChangedListener(this.textWatcher);
        O3(new wa3(this));
        ta3.a aVar = ta3.a;
        df dfVar12 = this.binding;
        if (dfVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dfVar12 = null;
        }
        aVar.j(this, dfVar12);
        df dfVar13 = this.binding;
        if (dfVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dfVar13 = null;
        }
        dfVar13.m.g.setText(F2().b("report_traffic_violation", "Report Traffic Violation"));
        df dfVar14 = this.binding;
        if (dfVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dfVar14 = null;
        }
        dfVar14.m.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tk6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrafficReportVioActivity.m3(this.a, view);
            }
        });
        E3(this);
        P3(new ws6(this));
        F3(OffenceInterface.INSTANCE.a(this));
        View viewFindViewById = findViewById(R.id.ev_location);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        A3((TextView) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.ev_time_picker);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        B3((TextView) viewFindViewById2);
        df dfVar15 = this.binding;
        if (dfVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dfVar15 = null;
        }
        dfVar15.q.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.uk6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrafficReportVioActivity.n3(this.a, view);
            }
        });
        df dfVar16 = this.binding;
        if (dfVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dfVar16 = null;
        }
        dfVar16.r.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vk6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrafficReportVioActivity.o3(this.a, view);
            }
        });
        df dfVar17 = this.binding;
        if (dfVar17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dfVar17 = null;
        }
        dfVar17.i.setText(new SimpleDateFormat("dd-MM-yyyy").format(Long.valueOf(System.currentTimeMillis())));
        p2().setText(new SimpleDateFormat("HH:mm").format(Long.valueOf(System.currentTimeMillis())));
        J2(p2(), w2());
        G3((vf4) new z(this, new uf4(new of4(x2()))).a(vf4.class));
        df dfVar18 = this.binding;
        if (dfVar18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dfVar18 = null;
        }
        dfVar18.z.setVisibility(0);
        y2().N().g(this, new u(new e()));
        y2().O().g(this, new u(new f()));
        df dfVar19 = this.binding;
        if (dfVar19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dfVar19 = null;
        }
        dfVar19.b.setOnItemSelectedListener(new g());
        df dfVar20 = this.binding;
        if (dfVar20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dfVar20 = null;
        }
        dfVar20.x.setOnItemSelectedListener(new h());
        df dfVar21 = this.binding;
        if (dfVar21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dfVar21 = null;
        }
        dfVar21.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xk6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrafficReportVioActivity.p3(this.a, view);
            }
        });
        y2().M().g(this, new u(new i()));
        y2().q().g(this, new u(new j()));
        n2(this).size();
        y2().R(VContant.MAINSCREEN);
        y2().z().g(this, new u(new k()));
        y2().r().g(this, new u(new m()));
        df dfVar22 = this.binding;
        if (dfVar22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dfVar22 = null;
        }
        dfVar22.K.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hl6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrafficReportVioActivity.Z2(this.a, view);
            }
        });
        df dfVar23 = this.binding;
        if (dfVar23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dfVar23 = null;
        }
        dfVar23.o.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.il6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrafficReportVioActivity.a3(this.a, view);
            }
        });
        df dfVar24 = this.binding;
        if (dfVar24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dfVar24 = null;
        }
        dfVar24.p.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jl6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrafficReportVioActivity.b3(this.a, view);
            }
        });
        df dfVar25 = this.binding;
        if (dfVar25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dfVar25 = null;
        }
        dfVar25.n.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.kl6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrafficReportVioActivity.c3(this.a, view);
            }
        });
        y2().T().g(this, new u(new n()));
        y2().t().g(this, new u(new o()));
        df dfVar26 = this.binding;
        if (dfVar26 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dfVar26 = null;
        }
        dfVar26.l.addTextChangedListener(new p());
        df dfVar27 = this.binding;
        if (dfVar27 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dfVar27 = null;
        }
        dfVar27.l.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.zepto.ll6
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                return TrafficReportVioActivity.d3(this.a, textView, i2, keyEvent);
            }
        });
        O2().L0().g(this, new u(new q()));
        O2().M0().g(this, new u(new s()));
        df dfVar28 = this.binding;
        if (dfVar28 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            dfVar = dfVar28;
        }
        dfVar.w.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.zepto.ml6
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() throws JSONException {
                TrafficReportVioActivity.e3(this.a);
            }
        });
        A2().g().g(this, new mf4() { // from class: com.zepto.nl6
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                TrafficReportVioActivity.f3(this.a, (NapixTokenModel) obj);
            }
        });
        ItmsMasterViewModel itmsMasterViewModel = this.itmsMasterViewModel;
        Intrinsics.checkNotNull(itmsMasterViewModel);
        itmsMasterViewModel.h().g(this, new mf4() { // from class: com.zepto.mk6
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                TrafficReportVioActivity.g3(this.a, (ItmsStateModle) obj);
            }
        });
        ItmsMasterViewModel itmsMasterViewModel2 = this.itmsMasterViewModel;
        Intrinsics.checkNotNull(itmsMasterViewModel2);
        itmsMasterViewModel2.i().g(this, new mf4() { // from class: com.zepto.nk6
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                TrafficReportVioActivity.h3((String) obj);
            }
        });
    }

    @Override // com.zepto.pq, com.zepto.yf2, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        b4();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 222) {
            if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
                d4();
                return;
            } else {
                Toast.makeText(this, getString(R.string.enable_manual_setting), 0).show();
                return;
            }
        }
        if (requestCode == 10001) {
            if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
                Y3();
                return;
            } else {
                Toast.makeText(this, "Permission denied", 0).show();
                return;
            }
        }
        if (requestCode != 10003) {
            return;
        }
        if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
            e4();
        } else {
            Toast.makeText(this, "Permission denied", 0).show();
        }
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onResume() {
        super.onResume();
        Object systemService = getSystemService("location");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        if (((LocationManager) systemService).isProviderEnabled("gps")) {
            try {
                W2();
                C3();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.zepto.pq, com.zepto.yf2, android.app.Activity
    public void onStop() {
        super.onStop();
        b4();
    }

    public final TextView p2() {
        TextView textView = this.evTime;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("evTime");
        return null;
    }

    public final void q3(String message) {
        Dialog dialog;
        Dialog dialog2 = this.d;
        Boolean boolValueOf = dialog2 != null ? Boolean.valueOf(dialog2.isShowing()) : null;
        Intrinsics.checkNotNull(boolValueOf);
        if (boolValueOf.booleanValue() && (dialog = this.d) != null) {
            dialog.dismiss();
        }
        Dialog dialog3 = this.d;
        if (dialog3 != null) {
            dialog3.setContentView(R.layout.msg_dialog);
        }
        Dialog dialog4 = this.d;
        Window window = dialog4 != null ? dialog4.getWindow() : null;
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        Dialog dialog5 = this.d;
        TextView textView = dialog5 != null ? (TextView) dialog5.findViewById(R.id.pop_up_msg) : null;
        Intrinsics.checkNotNull(textView, "null cannot be cast to non-null type android.widget.TextView");
        Dialog dialog6 = this.d;
        TextView textView2 = dialog6 != null ? (TextView) dialog6.findViewById(R.id.pop_up_close) : null;
        Intrinsics.checkNotNull(textView2, "null cannot be cast to non-null type android.widget.TextView");
        textView.setText(message);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bl6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrafficReportVioActivity.r3(this.a, view);
            }
        });
        Dialog dialog7 = this.d;
        if (dialog7 != null) {
            dialog7.show();
        }
    }

    /* JADX INFO: renamed from: r2, reason: from getter */
    public final String getImageFileName() {
        return this.imageFileName;
    }

    /* JADX INFO: renamed from: t2, reason: from getter */
    public final double getLagG() {
        return this.lagG;
    }

    /* JADX INFO: renamed from: u2, reason: from getter */
    public final double getLatG() {
        return this.latG;
    }

    public final Context w2() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final void w3() {
        f80.d(ef3.a(this), null, null, new t(null), 3, null);
    }

    public final OffenceInterface x2() {
        OffenceInterface offenceInterface = this.mOffenceInterface;
        if (offenceInterface != null) {
            return offenceInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mOffenceInterface");
        return null;
    }

    public final double x3(double d2) {
        Double dValueOf = Double.valueOf(new DecimalFormat("#.####").format(d2));
        Intrinsics.checkNotNullExpressionValue(dValueOf, "valueOf(...)");
        return dValueOf.doubleValue();
    }

    public final vf4 y2() {
        vf4 vf4Var = this.mOffenceViewModel;
        if (vf4Var != null) {
            return vf4Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mOffenceViewModel");
        return null;
    }

    public final void y3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.distId = str;
    }

    public final String z2() {
        String str = this.myLocation;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("myLocation");
        return null;
    }

    public final void z3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.distName = str;
    }
}
