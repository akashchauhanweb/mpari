package com.zepto;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.VideoView;
import com.nic.mparivahan.R;
import com.zepto.tf4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class tf4 {
    public static final a a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final void u(Dialog dialog, View view) {
            Intrinsics.checkNotNullParameter(dialog, "$dialog");
            dialog.dismiss();
        }

        public static final void w(Dialog dialog, View view) {
            Intrinsics.checkNotNullParameter(dialog, "$dialog");
            dialog.dismiss();
        }

        public static final void x(MediaPlayer mediaPlayer) {
            mediaPlayer.start();
        }

        public static final void y(MediaPlayer mediaPlayer) {
        }

        public final JSONObject A(String feedbackRemarks, String feedbackViolationId) throws JSONException {
            Intrinsics.checkNotNullParameter(feedbackRemarks, "feedbackRemarks");
            Intrinsics.checkNotNullParameter(feedbackViolationId, "feedbackViolationId");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("feedbackRemarks", feedbackRemarks);
            jSONObject.put("feedbackViolationId", Integer.parseInt(feedbackViolationId));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparViolationFeedback", jSONObject);
            return jSONObject2;
        }

        public final JSONObject e(String ctzIdVal) throws JSONException {
            Intrinsics.checkNotNullParameter(ctzIdVal, "ctzIdVal");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ctzId", Long.parseLong(ctzIdVal));
            return jSONObject;
        }

        public final JSONObject f(String userId, String startDate, String endDate) throws JSONException {
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            Intrinsics.checkNotNullParameter(endDate, "endDate");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("accdCitizenId", Long.parseLong(userId));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparCitizenAccident", jSONObject);
            jSONObject2.put("startDate", startDate);
            jSONObject2.put("endDate", endDate);
            return jSONObject2;
        }

        public final JSONObject g(String feedbackAccidentId) throws JSONException {
            Intrinsics.checkNotNullParameter(feedbackAccidentId, "feedbackAccidentId");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("feedbackAccidentId", feedbackAccidentId);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparAccidentFeedback", jSONObject);
            return jSONObject2;
        }

        public final JSONObject h(String violationId) throws JSONException {
            Intrinsics.checkNotNullParameter(violationId, "violationId");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("accId", violationId);
            return jSONObject;
        }

        public final JSONObject i(String ctzIdVal) throws JSONException {
            Intrinsics.checkNotNullParameter(ctzIdVal, "ctzIdVal");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ctzId", Long.parseLong(ctzIdVal));
            return jSONObject;
        }

        public final JSONObject j(String stateCode) throws JSONException {
            Intrinsics.checkNotNullParameter(stateCode, "stateCode");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("state", stateCode);
            return jSONObject;
        }

        public final JSONObject k(String ctzIdVal) throws JSONException {
            Intrinsics.checkNotNullParameter(ctzIdVal, "ctzIdVal");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ctzId", Long.parseLong(ctzIdVal));
            return jSONObject;
        }

        public final JSONObject l(String ctzIdVal) throws JSONException {
            Intrinsics.checkNotNullParameter(ctzIdVal, "ctzIdVal");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ctzId", Long.parseLong(ctzIdVal));
            return jSONObject;
        }

        public final JSONObject m(String userId, String startDate, String endDate) throws JSONException {
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            Intrinsics.checkNotNullParameter(endDate, "endDate");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("violCitizenId", Integer.parseInt(userId));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparCitizenViolation", jSONObject);
            jSONObject2.put("startDate", startDate);
            jSONObject2.put("endDate", endDate);
            return jSONObject2;
        }

        public final JSONObject n(String userId, String disticId, String location, String locLat, String loc, String locLong, int i, String regNo, String remarks, String stateCode, String updatedByName, String uploadedImgValue, String imageFileName, String uploadedVideoFilePath, String videoFileName, boolean z, String mid, String did, String tid) throws JSONException {
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(disticId, "disticId");
            Intrinsics.checkNotNullParameter(location, "location");
            Intrinsics.checkNotNullParameter(locLat, "locLat");
            Intrinsics.checkNotNullParameter(loc, "loc");
            Intrinsics.checkNotNullParameter(locLong, "locLong");
            Intrinsics.checkNotNullParameter(regNo, "regNo");
            Intrinsics.checkNotNullParameter(remarks, "remarks");
            Intrinsics.checkNotNullParameter(stateCode, "stateCode");
            Intrinsics.checkNotNullParameter(updatedByName, "updatedByName");
            Intrinsics.checkNotNullParameter(uploadedImgValue, "uploadedImgValue");
            Intrinsics.checkNotNullParameter(imageFileName, "imageFileName");
            Intrinsics.checkNotNullParameter(uploadedVideoFilePath, "uploadedVideoFilePath");
            Intrinsics.checkNotNullParameter(videoFileName, "videoFileName");
            Intrinsics.checkNotNullParameter(mid, "mid");
            Intrinsics.checkNotNullParameter(did, "did");
            Intrinsics.checkNotNullParameter(tid, "tid");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("violCitizenId", Long.parseLong(userId));
            jSONObject.put("violDistId", Integer.parseInt(disticId));
            jSONObject.put("violGaddr", location);
            jSONObject.put("violLatitude", locLat);
            jSONObject.put("violLocation", loc);
            jSONObject.put("violLongitude", locLong);
            jSONObject.put("violOffenceId", i);
            jSONObject.put("violRegnNo", regNo);
            jSONObject.put("violRemarks", remarks);
            jSONObject.put("violStateCd", stateCode);
            jSONObject.put("violUpdatedBy", updatedByName);
            jSONObject.put("violVhclVrfd", z);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparCitizenViolation", jSONObject);
            jSONObject2.put("did", did);
            jSONObject2.put("mid", mid);
            jSONObject2.put("tid", tid);
            if (uploadedImgValue.length() > 0 || uploadedVideoFilePath.length() > 0) {
                JSONObject jSONObject3 = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                if (uploadedImgValue.length() > 0) {
                    jSONObject3.put("evidenceType", "IMG");
                    jSONObject3.put("evidenceName", imageFileName);
                    jSONObject3.put("evidenceVal", uploadedImgValue);
                    jSONArray.put(jSONObject3);
                }
                JSONObject jSONObject4 = new JSONObject();
                if (uploadedVideoFilePath.length() > 0) {
                    jSONObject4.put("evidenceType", "VID");
                    jSONObject4.put("evidenceName", "video79.mp4");
                    jSONObject4.put("evidenceVal", uploadedVideoFilePath);
                    jSONArray.put(jSONObject4);
                }
                jSONObject2.put("evidences", jSONArray);
            }
            return jSONObject2;
        }

        public final JSONObject o(String status) {
            Intrinsics.checkNotNullParameter(status, "status");
            return new JSONObject();
        }

        public final JSONObject p(String feedbackViolationId) throws JSONException {
            Intrinsics.checkNotNullParameter(feedbackViolationId, "feedbackViolationId");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("violRecordId", feedbackViolationId);
            return jSONObject;
        }

        public final JSONObject q(String vehicleNo, long j, String mid, String did, String tid) throws JSONException {
            Intrinsics.checkNotNullParameter(vehicleNo, "vehicleNo");
            Intrinsics.checkNotNullParameter(mid, "mid");
            Intrinsics.checkNotNullParameter(did, "did");
            Intrinsics.checkNotNullParameter(tid, "tid");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rcNumber", vehicleNo);
            jSONObject.put("recordId", j);
            jSONObject.put("did", did);
            jSONObject.put("mid", mid);
            jSONObject.put("tid", tid);
            return jSONObject;
        }

        public final JSONObject r(String violationId) throws JSONException {
            Intrinsics.checkNotNullParameter(violationId, "violationId");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("violRecordId", violationId);
            return jSONObject;
        }

        public final JSONObject s(String feedbackRemarks, String feedbackAccidentId) throws JSONException {
            Intrinsics.checkNotNullParameter(feedbackRemarks, "feedbackRemarks");
            Intrinsics.checkNotNullParameter(feedbackAccidentId, "feedbackAccidentId");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("feedbackRemarks", feedbackRemarks);
            jSONObject.put("feedbackAccidentId", Integer.parseInt(feedbackAccidentId));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparAccidentFeedback", jSONObject);
            return jSONObject2;
        }

        public final void t(Context context, Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            final Dialog dialog = new Dialog(context);
            dialog.requestWindowFeature(1);
            dialog.setCancelable(false);
            dialog.setContentView(R.layout.imagediloge);
            Window window = dialog.getWindow();
            Intrinsics.checkNotNull(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
            View viewFindViewById = dialog.findViewById(R.id.myImageView);
            Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
            ((ImageView) viewFindViewById).setImageBitmap(bitmap);
            View viewFindViewById2 = dialog.findViewById(R.id.closeButton);
            Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.ImageView");
            ((ImageView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sf4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    tf4.a.u(dialog, view);
                }
            });
            dialog.show();
        }

        public final void v(Context context, Uri uri) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(uri, "uri");
            final Dialog dialog = new Dialog(context);
            dialog.requestWindowFeature(1);
            dialog.setCancelable(false);
            dialog.setContentView(R.layout.showvideo);
            Window window = dialog.getWindow();
            Intrinsics.checkNotNull(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
            View viewFindViewById = dialog.findViewById(R.id.videoView);
            Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.VideoView");
            VideoView videoView = (VideoView) viewFindViewById;
            View viewFindViewById2 = dialog.findViewById(R.id.closeButton);
            Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.ImageView");
            ((ImageView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pf4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    tf4.a.w(dialog, view);
                }
            });
            videoView.setVideoURI(uri);
            videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.zepto.qf4
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    tf4.a.x(mediaPlayer);
                }
            });
            videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.zepto.rf4
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer) {
                    tf4.a.y(mediaPlayer);
                }
            });
            dialog.show();
        }

        public final JSONObject z(String userId, String disticId, String location, String locLat, String loc, String locLong, String regNo, String remarks, String stateCode, String updatedByName, String uploadedImgValue, String imageFileName, String uploadedVideoFilePath, String videoFileName, boolean z, String mid, String did, String tid) throws JSONException {
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(disticId, "disticId");
            Intrinsics.checkNotNullParameter(location, "location");
            Intrinsics.checkNotNullParameter(locLat, "locLat");
            Intrinsics.checkNotNullParameter(loc, "loc");
            Intrinsics.checkNotNullParameter(locLong, "locLong");
            Intrinsics.checkNotNullParameter(regNo, "regNo");
            Intrinsics.checkNotNullParameter(remarks, "remarks");
            Intrinsics.checkNotNullParameter(stateCode, "stateCode");
            Intrinsics.checkNotNullParameter(updatedByName, "updatedByName");
            Intrinsics.checkNotNullParameter(uploadedImgValue, "uploadedImgValue");
            Intrinsics.checkNotNullParameter(imageFileName, "imageFileName");
            Intrinsics.checkNotNullParameter(uploadedVideoFilePath, "uploadedVideoFilePath");
            Intrinsics.checkNotNullParameter(videoFileName, "videoFileName");
            Intrinsics.checkNotNullParameter(mid, "mid");
            Intrinsics.checkNotNullParameter(did, "did");
            Intrinsics.checkNotNullParameter(tid, "tid");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("accdCitizenId", Long.parseLong(userId));
            jSONObject.put("accdDistId", Integer.parseInt(disticId));
            jSONObject.put("accdGaddr", location);
            jSONObject.put("accdLatitude", locLat);
            jSONObject.put("accdLocation", loc);
            jSONObject.put("accdLongitude", locLong);
            jSONObject.put("accdRegnNo", regNo);
            jSONObject.put("accdRemarks", remarks);
            jSONObject.put("accdStateCd", stateCode);
            jSONObject.put("accdUpdatedBy", updatedByName);
            jSONObject.put("accdVhclVrfd", z);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparCitizenAccident", jSONObject);
            if (uploadedImgValue.length() > 0 || uploadedVideoFilePath.length() > 0) {
                JSONObject jSONObject3 = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                if (uploadedImgValue.length() > 0) {
                    jSONObject3.put("evidenceType", "IMG");
                    jSONObject3.put("evidenceName", imageFileName);
                    jSONObject3.put("evidenceVal", uploadedImgValue);
                    jSONArray.put(jSONObject3);
                }
                JSONObject jSONObject4 = new JSONObject();
                if (uploadedVideoFilePath.length() > 0) {
                    jSONObject4.put("evidenceType", "VID");
                    jSONObject4.put("evidenceName", "video79.mp4");
                    jSONObject4.put("evidenceVal", uploadedVideoFilePath);
                    jSONArray.put(jSONObject4);
                }
                jSONObject2.put("evidences", jSONArray);
                jSONObject2.put("did", did);
                jSONObject2.put("mid", mid);
                jSONObject2.put("tid", tid);
            }
            return jSONObject2;
        }
    }
}
