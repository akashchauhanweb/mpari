package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import com.zepto.b05;
import com.zepto.bs7;
import com.zepto.c25;
import com.zepto.dq7;
import com.zepto.jr0;
import com.zepto.lg6;
import com.zepto.lz4;
import com.zepto.qi6;
import com.zepto.qq;
import com.zepto.r05;
import com.zepto.u05;
import com.zepto.y86;
import com.zepto.z1;
import com.zepto.z31;
import com.zepto.zy4;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements jr0 {
    public static final o n0;
    public Rect A;
    public int[] B;
    public int[] C;
    public final ImageView D;
    public final Drawable E;
    public final int F;
    public final int G;
    public final Intent H;
    public final Intent I;
    public final CharSequence J;
    public View.OnFocusChangeListener K;
    public View.OnClickListener L;
    public boolean M;
    public boolean N;
    public z31 O;
    public boolean P;
    public CharSequence Q;
    public boolean R;
    public boolean S;
    public int T;
    public boolean U;
    public CharSequence V;
    public CharSequence W;
    public boolean a0;
    public int b0;
    public SearchableInfo c0;
    public Bundle d0;
    public final Runnable e0;
    public Runnable f0;
    public final WeakHashMap g0;
    public final View.OnClickListener h0;
    public View.OnKeyListener i0;
    public final TextView.OnEditorActionListener j0;
    public final AdapterView.OnItemClickListener k0;
    public final AdapterView.OnItemSelectedListener l0;
    public TextWatcher m0;
    public final SearchAutoComplete p;
    public final View q;
    public final View r;
    public final View s;
    public final ImageView t;
    public final ImageView u;
    public final ImageView v;
    public final ImageView w;
    public final View x;
    public q y;
    public Rect z;

    public static class SearchAutoComplete extends qq {
        public int e;
        public SearchView f;
        public boolean g;
        public final Runnable h;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, zy4.m);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        public void b() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.n0.c(this);
                return;
            }
            k.b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        public boolean c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        public void d() {
            if (this.g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.g = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.e <= 0 || super.enoughToFilter();
        }

        @Override // com.zepto.qq, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.g) {
                removeCallbacks(this.h);
                post(this.h);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f.Z();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f.hasFocus() && getVisibility() == 0) {
                this.g = true;
                if (SearchView.M(getContext())) {
                    b();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.g = false;
                removeCallbacks(this.h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.g = true;
                    return;
                }
                this.g = false;
                removeCallbacks(this.h);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.e = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.h = new a();
            this.e = getThreshold();
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.Y(charSequence);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.f0();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            z31 z31Var = SearchView.this.O;
            if (z31Var instanceof y86) {
                z31Var.a(null);
            }
        }
    }

    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.K;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.B();
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.t) {
                searchView.V();
                return;
            }
            if (view == searchView.v) {
                searchView.R();
                return;
            }
            if (view == searchView.u) {
                searchView.W();
            } else if (view == searchView.w) {
                searchView.a0();
            } else if (view == searchView.p) {
                searchView.H();
            }
        }
    }

    public class g implements View.OnKeyListener {
        public g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.c0 == null) {
                return false;
            }
            if (searchView.p.isPopupShowing() && SearchView.this.p.getListSelection() != -1) {
                return SearchView.this.X(view, i, keyEvent);
            }
            if (SearchView.this.p.c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.P(0, null, searchView2.p.getText().toString());
            return true;
        }
    }

    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.W();
            return true;
        }
    }

    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            SearchView.this.S(i, 0, null);
        }
    }

    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            SearchView.this.T(i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static class k {
        public static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        public static void b(SearchAutoComplete searchAutoComplete, int i) {
            searchAutoComplete.setInputMethodMode(i);
        }
    }

    public interface l {
    }

    public interface m {
    }

    public interface n {
    }

    public static class o {
        public Method a;
        public Method b;
        public Method c;

        public o() {
            this.a = null;
            this.b = null;
            this.c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        public void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        public void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        public void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    public static class p extends z1 {
        public static final Parcelable.Creator<p> CREATOR = new a();
        public boolean f;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel) {
                return new p(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new p(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public p[] newArray(int i) {
                return new p[i];
            }
        }

        public p(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f + "}";
        }

        @Override // com.zepto.z1, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f));
        }

        public p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    public static class q extends TouchDelegate {
        public final View a;
        public final Rect b;
        public final Rect c;
        public final Rect d;
        public final int e;
        public boolean f;

        public q(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.b = new Rect();
            this.d = new Rect();
            this.c = new Rect();
            a(rect, rect2);
            this.a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.b.set(rect);
            this.d.set(rect);
            Rect rect3 = this.d;
            int i = this.e;
            rect3.inset(-i, -i);
            this.c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z2 = this.f;
                    if (z2 && !this.d.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                } else {
                    if (action == 3) {
                        z2 = this.f;
                        this.f = false;
                    }
                    z = true;
                    z3 = false;
                }
                z3 = z2;
                z = true;
            } else if (this.b.contains(x, y)) {
                this.f = true;
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            if (!z3) {
                return false;
            }
            if (!z || this.c.contains(x, y)) {
                Rect rect = this.c;
                motionEvent.setLocation(x - rect.left, y - rect.top);
            } else {
                motionEvent.setLocation(this.a.getWidth() / 2, this.a.getHeight() / 2);
            }
            return this.a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        n0 = Build.VERSION.SDK_INT < 29 ? new o() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public static boolean M(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(lz4.e);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(lz4.f);
    }

    private void setQuery(CharSequence charSequence) {
        this.p.setText(charSequence);
        this.p.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public void B() {
        if (this.x.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.r.getPaddingLeft();
            Rect rect = new Rect();
            boolean zB = bs7.b(this);
            int dimensionPixelSize = this.M ? resources.getDimensionPixelSize(lz4.c) + resources.getDimensionPixelSize(lz4.d) : 0;
            this.p.getDropDownBackground().getPadding(rect);
            this.p.setDropDownHorizontalOffset(zB ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.p.setDropDownWidth((((this.x.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    public final Intent C(String str, Uri uri, String str2, String str3, int i2, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.W);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.d0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i2 != 0) {
            intent.putExtra("action_key", i2);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.c0.getSearchActivity());
        return intent;
    }

    public final Intent D(Cursor cursor, int i2, String str) {
        int position;
        String strO;
        try {
            String strO2 = y86.o(cursor, "suggest_intent_action");
            if (strO2 == null) {
                strO2 = this.c0.getSuggestIntentAction();
            }
            if (strO2 == null) {
                strO2 = "android.intent.action.SEARCH";
            }
            String str2 = strO2;
            String strO3 = y86.o(cursor, "suggest_intent_data");
            if (strO3 == null) {
                strO3 = this.c0.getSuggestIntentData();
            }
            if (strO3 != null && (strO = y86.o(cursor, "suggest_intent_data_id")) != null) {
                strO3 = strO3 + "/" + Uri.encode(strO);
            }
            return C(str2, strO3 == null ? null : Uri.parse(strO3), y86.o(cursor, "suggest_intent_extra_data"), y86.o(cursor, "suggest_intent_query"), i2, str);
        } catch (RuntimeException e2) {
            try {
                position = cursor.getPosition();
            } catch (RuntimeException unused) {
                position = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e2);
            return null;
        }
    }

    public final Intent E(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.d0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final Intent F(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    public final void G() {
        this.p.dismissDropDown();
    }

    public void H() {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.p);
            return;
        }
        o oVar = n0;
        oVar.b(this.p);
        oVar.a(this.p);
    }

    public final void I(View view, Rect rect) {
        view.getLocationInWindow(this.B);
        getLocationInWindow(this.C);
        int[] iArr = this.B;
        int i2 = iArr[1];
        int[] iArr2 = this.C;
        int i3 = i2 - iArr2[1];
        int i4 = iArr[0] - iArr2[0];
        rect.set(i4, i3, view.getWidth() + i4, view.getHeight() + i3);
    }

    public final CharSequence J(CharSequence charSequence) {
        if (!this.M || this.E == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.p.getTextSize()) * 1.25d);
        this.E.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.E), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    public final boolean K() {
        SearchableInfo searchableInfo = this.c0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = this.c0.getVoiceSearchLaunchWebSearch() ? this.H : this.c0.getVoiceSearchLaunchRecognizer() ? this.I : null;
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    public boolean L() {
        return this.N;
    }

    public final boolean N() {
        return (this.P || this.U) && !L();
    }

    public final void O(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e2) {
            Log.e("SearchView", "Failed launch activity: " + intent, e2);
        }
    }

    public void P(int i2, String str, String str2) {
        getContext().startActivity(C("android.intent.action.SEARCH", null, null, str2, i2, str));
    }

    public final boolean Q(int i2, int i3, String str) {
        Cursor cursorB = this.O.b();
        if (cursorB == null || !cursorB.moveToPosition(i2)) {
            return false;
        }
        O(D(cursorB, i3, str));
        return true;
    }

    public void R() {
        if (!TextUtils.isEmpty(this.p.getText())) {
            this.p.setText("");
            this.p.requestFocus();
            this.p.setImeVisibility(true);
        } else if (this.M) {
            clearFocus();
            k0(true);
        }
    }

    public boolean S(int i2, int i3, String str) {
        Q(i2, 0, null);
        this.p.setImeVisibility(false);
        G();
        return true;
    }

    public boolean T(int i2) {
        c0(i2);
        return true;
    }

    public void U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void V() {
        k0(false);
        this.p.requestFocus();
        this.p.setImeVisibility(true);
        View.OnClickListener onClickListener = this.L;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void W() {
        Editable text = this.p.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.c0 != null) {
            P(0, null, text.toString());
        }
        this.p.setImeVisibility(false);
        G();
    }

    public boolean X(View view, int i2, KeyEvent keyEvent) {
        if (this.c0 != null && this.O != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i2 == 66 || i2 == 84 || i2 == 61) {
                return S(this.p.getListSelection(), 0, null);
            }
            if (i2 == 21 || i2 == 22) {
                this.p.setSelection(i2 == 21 ? 0 : this.p.length());
                this.p.setListSelection(0);
                this.p.clearListSelection();
                this.p.b();
                return true;
            }
            if (i2 == 19) {
                this.p.getListSelection();
                return false;
            }
        }
        return false;
    }

    public void Y(CharSequence charSequence) {
        Editable text = this.p.getText();
        this.W = text;
        boolean zIsEmpty = TextUtils.isEmpty(text);
        j0(!zIsEmpty);
        l0(zIsEmpty);
        e0();
        i0();
        this.V = charSequence.toString();
    }

    public void Z() {
        k0(L());
        b0();
        if (this.p.hasFocus()) {
            H();
        }
    }

    public void a0() {
        SearchableInfo searchableInfo = this.c0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(F(this.H, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(E(this.I, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    public final void b0() {
        post(this.e0);
    }

    @Override // com.zepto.jr0
    public void c() {
        if (this.a0) {
            return;
        }
        this.a0 = true;
        int imeOptions = this.p.getImeOptions();
        this.b0 = imeOptions;
        this.p.setImeOptions(imeOptions | 33554432);
        this.p.setText("");
        setIconified(false);
    }

    public final void c0(int i2) {
        Editable text = this.p.getText();
        Cursor cursorB = this.O.b();
        if (cursorB == null) {
            return;
        }
        if (!cursorB.moveToPosition(i2)) {
            setQuery(text);
            return;
        }
        CharSequence charSequenceC = this.O.c(cursorB);
        if (charSequenceC != null) {
            setQuery(charSequenceC);
        } else {
            setQuery(text);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.S = true;
        super.clearFocus();
        this.p.clearFocus();
        this.p.setImeVisibility(false);
        this.S = false;
    }

    public void d0(CharSequence charSequence, boolean z) {
        this.p.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.p;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.W = charSequence;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        W();
    }

    public final void e0() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.p.getText());
        if (!z2 && (!this.M || this.a0)) {
            z = false;
        }
        this.v.setVisibility(z ? 0 : 8);
        Drawable drawable = this.v.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    @Override // com.zepto.jr0
    public void f() {
        d0("", false);
        clearFocus();
        k0(true);
        this.p.setImeOptions(this.b0);
        this.a0 = false;
    }

    public void f0() {
        int[] iArr = this.p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void g0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.p;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(J(queryHint));
    }

    public int getImeOptions() {
        return this.p.getImeOptions();
    }

    public int getInputType() {
        return this.p.getInputType();
    }

    public int getMaxWidth() {
        return this.T;
    }

    public CharSequence getQuery() {
        return this.p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.Q;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.c0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.J : getContext().getText(this.c0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.G;
    }

    public int getSuggestionRowLayout() {
        return this.F;
    }

    public z31 getSuggestionsAdapter() {
        return this.O;
    }

    public final void h0() {
        this.p.setThreshold(this.c0.getSuggestThreshold());
        this.p.setImeOptions(this.c0.getImeOptions());
        int inputType = this.c0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.c0.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.p.setInputType(inputType);
        z31 z31Var = this.O;
        if (z31Var != null) {
            z31Var.a(null);
        }
        if (this.c0.getSuggestAuthority() != null) {
            y86 y86Var = new y86(getContext(), this, this.c0, this.g0);
            this.O = y86Var;
            this.p.setAdapter(y86Var);
            ((y86) this.O).x(this.R ? 2 : 1);
        }
    }

    public final void i0() {
        this.s.setVisibility((N() && (this.u.getVisibility() == 0 || this.w.getVisibility() == 0)) ? 0 : 8);
    }

    public final void j0(boolean z) {
        this.u.setVisibility((this.P && N() && hasFocus() && (z || !this.U)) ? 0 : 8);
    }

    public final void k0(boolean z) {
        this.N = z;
        int i2 = 8;
        int i3 = z ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.p.getText());
        this.t.setVisibility(i3);
        j0(!zIsEmpty);
        this.q.setVisibility(z ? 8 : 0);
        if (this.D.getDrawable() != null && !this.M) {
            i2 = 0;
        }
        this.D.setVisibility(i2);
        e0();
        l0(zIsEmpty);
        i0();
    }

    public final void l0(boolean z) {
        int i2 = 8;
        if (this.U && !L() && z) {
            this.u.setVisibility(8);
            i2 = 0;
        }
        this.w.setVisibility(i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.e0);
        post(this.f0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (z) {
            I(this.p, this.z);
            Rect rect = this.A;
            Rect rect2 = this.z;
            rect.set(rect2.left, 0, rect2.right, i5 - i3);
            q qVar = this.y;
            if (qVar != null) {
                qVar.a(this.A, this.z);
                return;
            }
            q qVar2 = new q(this.A, this.z, this.p);
            this.y = qVar2;
            setTouchDelegate(qVar2);
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        if (L()) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            int i5 = this.T;
            size = i5 > 0 ? Math.min(i5, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.T;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i4 = this.T) > 0) {
            size = Math.min(i4, size);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super.onRestoreInstanceState(pVar.c());
        k0(pVar.f);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        p pVar = new p(super.onSaveInstanceState());
        pVar.f = L();
        return pVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        b0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i2, Rect rect) {
        if (this.S || !isFocusable()) {
            return false;
        }
        if (L()) {
            return super.requestFocus(i2, rect);
        }
        boolean zRequestFocus = this.p.requestFocus(i2, rect);
        if (zRequestFocus) {
            k0(false);
        }
        return zRequestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.d0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            R();
        } else {
            V();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.M == z) {
            return;
        }
        this.M = z;
        k0(z);
        g0();
    }

    public void setImeOptions(int i2) {
        this.p.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.p.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.T = i2;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.K = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.L = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.Q = charSequence;
        g0();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.R = z;
        z31 z31Var = this.O;
        if (z31Var instanceof y86) {
            ((y86) z31Var).x(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.c0 = searchableInfo;
        if (searchableInfo != null) {
            h0();
            g0();
        }
        boolean zK = K();
        this.U = zK;
        if (zK) {
            this.p.setPrivateImeOptions("nm");
        }
        k0(L());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.P = z;
        k0(L());
    }

    public void setSuggestionsAdapter(z31 z31Var) {
        this.O = z31Var;
        this.p.setAdapter(z31Var);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, zy4.I);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.z = new Rect();
        this.A = new Rect();
        this.B = new int[2];
        this.C = new int[2];
        this.e0 = new b();
        this.f0 = new c();
        this.g0 = new WeakHashMap();
        f fVar = new f();
        this.h0 = fVar;
        this.i0 = new g();
        h hVar = new h();
        this.j0 = hVar;
        i iVar = new i();
        this.k0 = iVar;
        j jVar = new j();
        this.l0 = jVar;
        this.m0 = new a();
        int[] iArr = c25.n2;
        lg6 lg6VarV = lg6.v(context, attributeSet, iArr, i2, 0);
        dq7.o0(this, context, iArr, attributeSet, lg6VarV.r(), i2, 0);
        LayoutInflater.from(context).inflate(lg6VarV.n(c25.x2, r05.r), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(b05.C);
        this.p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.q = findViewById(b05.y);
        View viewFindViewById = findViewById(b05.B);
        this.r = viewFindViewById;
        View viewFindViewById2 = findViewById(b05.I);
        this.s = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(b05.w);
        this.t = imageView;
        ImageView imageView2 = (ImageView) findViewById(b05.z);
        this.u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(b05.x);
        this.v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(b05.D);
        this.w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(b05.A);
        this.D = imageView5;
        dq7.u0(viewFindViewById, lg6VarV.g(c25.y2));
        dq7.u0(viewFindViewById2, lg6VarV.g(c25.C2));
        int i3 = c25.B2;
        imageView.setImageDrawable(lg6VarV.g(i3));
        imageView2.setImageDrawable(lg6VarV.g(c25.v2));
        imageView3.setImageDrawable(lg6VarV.g(c25.s2));
        imageView4.setImageDrawable(lg6VarV.g(c25.E2));
        imageView5.setImageDrawable(lg6VarV.g(i3));
        this.E = lg6VarV.g(c25.A2);
        qi6.a(imageView, getResources().getString(u05.l));
        this.F = lg6VarV.n(c25.D2, r05.q);
        this.G = lg6VarV.n(c25.t2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.m0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.i0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(lg6VarV.a(c25.w2, true));
        int iF = lg6VarV.f(c25.p2, -1);
        if (iF != -1) {
            setMaxWidth(iF);
        }
        this.J = lg6VarV.p(c25.u2);
        this.Q = lg6VarV.p(c25.z2);
        int iK = lg6VarV.k(c25.r2, -1);
        if (iK != -1) {
            setImeOptions(iK);
        }
        int iK2 = lg6VarV.k(c25.q2, -1);
        if (iK2 != -1) {
            setInputType(iK2);
        }
        setFocusable(lg6VarV.a(c25.o2, true));
        lg6VarV.w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.I = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.x = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new e());
        }
        k0(this.M);
        g0();
    }
}
