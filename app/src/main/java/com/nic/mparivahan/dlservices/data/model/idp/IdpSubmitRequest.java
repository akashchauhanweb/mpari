package com.nic.mparivahan.dlservices.data.model.idp;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0003\b\u0087\u0001\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÛ\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000fj\b\u0012\u0004\u0012\u00020\u0003`\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0006\u0010&\u001a\u00020\u0003\u0012\u0006\u0010'\u001a\u00020\u0003\u0012\u0006\u0010(\u001a\u00020\u0003\u0012\u0006\u0010)\u001a\u00020\u0003\u0012\u0006\u0010*\u001a\u00020\u0003¢\u0006\u0002\u0010+J\t\u0010q\u001a\u00020\u0003HÆ\u0003J\t\u0010r\u001a\u00020\u0003HÆ\u0003J\u0019\u0010s\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000fj\b\u0012\u0004\u0012\u00020\u0003`\u0010HÆ\u0003J\t\u0010t\u001a\u00020\u0003HÆ\u0003J\t\u0010u\u001a\u00020\u0003HÆ\u0003J\t\u0010v\u001a\u00020\u0003HÆ\u0003J\t\u0010w\u001a\u00020\u0003HÆ\u0003J\t\u0010x\u001a\u00020\u0003HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010|\u001a\u00020\u0003HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008c\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008f\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0090\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0091\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0092\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0094\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0095\u0001\u001a\u00020\u0003HÆ\u0003Jª\u0003\u0010\u0096\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000fj\b\u0012\u0004\u0012\u00020\u0003`\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010'\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\u00032\b\b\u0002\u0010)\u001a\u00020\u00032\b\b\u0002\u0010*\u001a\u00020\u0003HÆ\u0001J\u0016\u0010\u0097\u0001\u001a\u00030\u0098\u00012\t\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010\u009a\u0001\u001a\u00030\u009b\u0001HÖ\u0001J\n\u0010\u009c\u0001\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\"\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u0010$\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010-\"\u0004\b1\u0010/R\u001c\u0010#\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010-\"\u0004\b3\u0010/R\u001a\u0010%\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010-\"\u0004\b5\u0010/R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010-\"\u0004\b7\u0010/R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010-R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010-R!\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000fj\b\u0012\u0004\u0012\u00020\u0003`\u0010¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010-\"\u0004\b=\u0010/R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010-R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010-\"\u0004\b@\u0010/R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010-\"\u0004\bB\u0010/R\u001a\u0010)\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010-\"\u0004\bD\u0010/R\u001a\u0010'\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010-\"\u0004\bF\u0010/R\u001a\u0010(\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010-\"\u0004\bH\u0010/R\u001a\u0010*\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010-\"\u0004\bJ\u0010/R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010-\"\u0004\bL\u0010/R\u001c\u0010 \u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010-\"\u0004\bN\u0010/R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u0010-R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bP\u0010-R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010-\"\u0004\bR\u0010/R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010-\"\u0004\bT\u0010/R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bU\u0010-R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010-\"\u0004\bW\u0010/R\u001c\u0010!\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010-\"\u0004\bY\u0010/R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010-\"\u0004\b[\u0010/R\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010-\"\u0004\b\\\u0010/R\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010-\"\u0004\b^\u0010/R\u001a\u0010&\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010-\"\u0004\b`\u0010/R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010-\"\u0004\bb\u0010/R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bc\u0010-R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010-\"\u0004\be\u0010/R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bf\u0010-R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010-\"\u0004\bl\u0010/R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010-\"\u0004\bn\u0010/R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010-\"\u0004\bp\u0010/¨\u0006\u009d\u0001"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/idp/IdpSubmitRequest;", "", "dlno", "", "dob", "rtoCodeDLTr", "selectedDLSerList", "Lcom/nic/mparivahan/dlservices/data/model/idp/selectDLlist;", "pofbirth", "country", "passno", "passvaltill", "visano", "visavaltill", "cov_req", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "tovisit", "iscountryrestricted", "countryRestrictedReason", "isDlSerdisqualified", "dlSerdisqualifiedReason", "forAdd1", "forAdd2", "forAdd3", "forAddPinCode", "forNationMobNum", "emailID", "appliedIdpfromIndEmb", "indEmbName", "embPlace", "dateOfVerifEmb", "embEndorseNo", "idpcountryapplyfrom", "agentId", "agentPwd", "agentIpAddress", "agentServiceName", "mobileNumber", "eKYCId", "eKYCOpted", "eKYCGender", "eKYCapplicantPhoto", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/dlservices/data/model/idp/selectDLlist;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAgentId", "()Ljava/lang/String;", "setAgentId", "(Ljava/lang/String;)V", "getAgentIpAddress", "setAgentIpAddress", "getAgentPwd", "setAgentPwd", "getAgentServiceName", "setAgentServiceName", "getAppliedIdpfromIndEmb", "setAppliedIdpfromIndEmb", "getCountry", "getCountryRestrictedReason", "getCov_req", "()Ljava/util/ArrayList;", "getDateOfVerifEmb", "setDateOfVerifEmb", "getDlSerdisqualifiedReason", "getDlno", "setDlno", "getDob", "setDob", "getEKYCGender", "setEKYCGender", "getEKYCId", "setEKYCId", "getEKYCOpted", "setEKYCOpted", "getEKYCapplicantPhoto", "setEKYCapplicantPhoto", "getEmailID", "setEmailID", "getEmbEndorseNo", "setEmbEndorseNo", "getEmbPlace", "getForAdd1", "getForAdd2", "setForAdd2", "getForAdd3", "setForAdd3", "getForAddPinCode", "getForNationMobNum", "setForNationMobNum", "getIdpcountryapplyfrom", "setIdpcountryapplyfrom", "getIndEmbName", "setIndEmbName", "setDlSerdisqualified", "getIscountryrestricted", "setIscountryrestricted", "getMobileNumber", "setMobileNumber", "getPassno", "setPassno", "getPassvaltill", "getPofbirth", "setPofbirth", "getRtoCodeDLTr", "getSelectedDLSerList", "()Lcom/nic/mparivahan/dlservices/data/model/idp/selectDLlist;", "setSelectedDLSerList", "(Lcom/nic/mparivahan/dlservices/data/model/idp/selectDLlist;)V", "getTovisit", "setTovisit", "getVisano", "setVisano", "getVisavaltill", "setVisavaltill", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class IdpSubmitRequest {
    private String agentId;
    private String agentIpAddress;
    private String agentPwd;
    private String agentServiceName;
    private String appliedIdpfromIndEmb;
    private final String country;
    private final String countryRestrictedReason;
    private final ArrayList<String> cov_req;
    private String dateOfVerifEmb;
    private final String dlSerdisqualifiedReason;
    private String dlno;
    private String dob;
    private String eKYCGender;
    private String eKYCId;
    private String eKYCOpted;
    private String eKYCapplicantPhoto;
    private String emailID;
    private String embEndorseNo;
    private final String embPlace;
    private final String forAdd1;
    private String forAdd2;
    private String forAdd3;
    private final String forAddPinCode;
    private String forNationMobNum;
    private String idpcountryapplyfrom;
    private String indEmbName;
    private String isDlSerdisqualified;
    private String iscountryrestricted;
    private String mobileNumber;
    private String passno;
    private final String passvaltill;
    private String pofbirth;
    private final String rtoCodeDLTr;
    private selectDLlist selectedDLSerList;
    private String tovisit;
    private String visano;
    private String visavaltill;

    public IdpSubmitRequest(String dlno, String dob, String rtoCodeDLTr, selectDLlist selectedDLSerList, String pofbirth, String country, String passno, String passvaltill, String visano, String visavaltill, ArrayList<String> cov_req, String tovisit, String iscountryrestricted, String countryRestrictedReason, String isDlSerdisqualified, String dlSerdisqualifiedReason, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String agentServiceName, String mobileNumber, String eKYCId, String eKYCOpted, String eKYCGender, String eKYCapplicantPhoto) {
        Intrinsics.checkNotNullParameter(dlno, "dlno");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(rtoCodeDLTr, "rtoCodeDLTr");
        Intrinsics.checkNotNullParameter(selectedDLSerList, "selectedDLSerList");
        Intrinsics.checkNotNullParameter(pofbirth, "pofbirth");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(passno, "passno");
        Intrinsics.checkNotNullParameter(passvaltill, "passvaltill");
        Intrinsics.checkNotNullParameter(visano, "visano");
        Intrinsics.checkNotNullParameter(visavaltill, "visavaltill");
        Intrinsics.checkNotNullParameter(cov_req, "cov_req");
        Intrinsics.checkNotNullParameter(tovisit, "tovisit");
        Intrinsics.checkNotNullParameter(iscountryrestricted, "iscountryrestricted");
        Intrinsics.checkNotNullParameter(countryRestrictedReason, "countryRestrictedReason");
        Intrinsics.checkNotNullParameter(isDlSerdisqualified, "isDlSerdisqualified");
        Intrinsics.checkNotNullParameter(dlSerdisqualifiedReason, "dlSerdisqualifiedReason");
        Intrinsics.checkNotNullParameter(agentServiceName, "agentServiceName");
        Intrinsics.checkNotNullParameter(mobileNumber, "mobileNumber");
        Intrinsics.checkNotNullParameter(eKYCId, "eKYCId");
        Intrinsics.checkNotNullParameter(eKYCOpted, "eKYCOpted");
        Intrinsics.checkNotNullParameter(eKYCGender, "eKYCGender");
        Intrinsics.checkNotNullParameter(eKYCapplicantPhoto, "eKYCapplicantPhoto");
        this.dlno = dlno;
        this.dob = dob;
        this.rtoCodeDLTr = rtoCodeDLTr;
        this.selectedDLSerList = selectedDLSerList;
        this.pofbirth = pofbirth;
        this.country = country;
        this.passno = passno;
        this.passvaltill = passvaltill;
        this.visano = visano;
        this.visavaltill = visavaltill;
        this.cov_req = cov_req;
        this.tovisit = tovisit;
        this.iscountryrestricted = iscountryrestricted;
        this.countryRestrictedReason = countryRestrictedReason;
        this.isDlSerdisqualified = isDlSerdisqualified;
        this.dlSerdisqualifiedReason = dlSerdisqualifiedReason;
        this.forAdd1 = str;
        this.forAdd2 = str2;
        this.forAdd3 = str3;
        this.forAddPinCode = str4;
        this.forNationMobNum = str5;
        this.emailID = str6;
        this.appliedIdpfromIndEmb = str7;
        this.indEmbName = str8;
        this.embPlace = str9;
        this.dateOfVerifEmb = str10;
        this.embEndorseNo = str11;
        this.idpcountryapplyfrom = str12;
        this.agentId = str13;
        this.agentPwd = str14;
        this.agentIpAddress = str15;
        this.agentServiceName = agentServiceName;
        this.mobileNumber = mobileNumber;
        this.eKYCId = eKYCId;
        this.eKYCOpted = eKYCOpted;
        this.eKYCGender = eKYCGender;
        this.eKYCapplicantPhoto = eKYCapplicantPhoto;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDlno() {
        return this.dlno;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getVisavaltill() {
        return this.visavaltill;
    }

    public final ArrayList<String> component11() {
        return this.cov_req;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getTovisit() {
        return this.tovisit;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getIscountryrestricted() {
        return this.iscountryrestricted;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getCountryRestrictedReason() {
        return this.countryRestrictedReason;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getIsDlSerdisqualified() {
        return this.isDlSerdisqualified;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getDlSerdisqualifiedReason() {
        return this.dlSerdisqualifiedReason;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getForAdd1() {
        return this.forAdd1;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getForAdd2() {
        return this.forAdd2;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getForAdd3() {
        return this.forAdd3;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDob() {
        return this.dob;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getForAddPinCode() {
        return this.forAddPinCode;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getForNationMobNum() {
        return this.forNationMobNum;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getEmailID() {
        return this.emailID;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getAppliedIdpfromIndEmb() {
        return this.appliedIdpfromIndEmb;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getIndEmbName() {
        return this.indEmbName;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getEmbPlace() {
        return this.embPlace;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getDateOfVerifEmb() {
        return this.dateOfVerifEmb;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getEmbEndorseNo() {
        return this.embEndorseNo;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getIdpcountryapplyfrom() {
        return this.idpcountryapplyfrom;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getAgentId() {
        return this.agentId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRtoCodeDLTr() {
        return this.rtoCodeDLTr;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getAgentPwd() {
        return this.agentPwd;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getAgentIpAddress() {
        return this.agentIpAddress;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getAgentServiceName() {
        return this.agentServiceName;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getEKYCId() {
        return this.eKYCId;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getEKYCOpted() {
        return this.eKYCOpted;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getEKYCGender() {
        return this.eKYCGender;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getEKYCapplicantPhoto() {
        return this.eKYCapplicantPhoto;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final selectDLlist getSelectedDLSerList() {
        return this.selectedDLSerList;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPofbirth() {
        return this.pofbirth;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPassno() {
        return this.passno;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPassvaltill() {
        return this.passvaltill;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getVisano() {
        return this.visano;
    }

    public final IdpSubmitRequest copy(String dlno, String dob, String rtoCodeDLTr, selectDLlist selectedDLSerList, String pofbirth, String country, String passno, String passvaltill, String visano, String visavaltill, ArrayList<String> cov_req, String tovisit, String iscountryrestricted, String countryRestrictedReason, String isDlSerdisqualified, String dlSerdisqualifiedReason, String forAdd1, String forAdd2, String forAdd3, String forAddPinCode, String forNationMobNum, String emailID, String appliedIdpfromIndEmb, String indEmbName, String embPlace, String dateOfVerifEmb, String embEndorseNo, String idpcountryapplyfrom, String agentId, String agentPwd, String agentIpAddress, String agentServiceName, String mobileNumber, String eKYCId, String eKYCOpted, String eKYCGender, String eKYCapplicantPhoto) {
        Intrinsics.checkNotNullParameter(dlno, "dlno");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(rtoCodeDLTr, "rtoCodeDLTr");
        Intrinsics.checkNotNullParameter(selectedDLSerList, "selectedDLSerList");
        Intrinsics.checkNotNullParameter(pofbirth, "pofbirth");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(passno, "passno");
        Intrinsics.checkNotNullParameter(passvaltill, "passvaltill");
        Intrinsics.checkNotNullParameter(visano, "visano");
        Intrinsics.checkNotNullParameter(visavaltill, "visavaltill");
        Intrinsics.checkNotNullParameter(cov_req, "cov_req");
        Intrinsics.checkNotNullParameter(tovisit, "tovisit");
        Intrinsics.checkNotNullParameter(iscountryrestricted, "iscountryrestricted");
        Intrinsics.checkNotNullParameter(countryRestrictedReason, "countryRestrictedReason");
        Intrinsics.checkNotNullParameter(isDlSerdisqualified, "isDlSerdisqualified");
        Intrinsics.checkNotNullParameter(dlSerdisqualifiedReason, "dlSerdisqualifiedReason");
        Intrinsics.checkNotNullParameter(agentServiceName, "agentServiceName");
        Intrinsics.checkNotNullParameter(mobileNumber, "mobileNumber");
        Intrinsics.checkNotNullParameter(eKYCId, "eKYCId");
        Intrinsics.checkNotNullParameter(eKYCOpted, "eKYCOpted");
        Intrinsics.checkNotNullParameter(eKYCGender, "eKYCGender");
        Intrinsics.checkNotNullParameter(eKYCapplicantPhoto, "eKYCapplicantPhoto");
        return new IdpSubmitRequest(dlno, dob, rtoCodeDLTr, selectedDLSerList, pofbirth, country, passno, passvaltill, visano, visavaltill, cov_req, tovisit, iscountryrestricted, countryRestrictedReason, isDlSerdisqualified, dlSerdisqualifiedReason, forAdd1, forAdd2, forAdd3, forAddPinCode, forNationMobNum, emailID, appliedIdpfromIndEmb, indEmbName, embPlace, dateOfVerifEmb, embEndorseNo, idpcountryapplyfrom, agentId, agentPwd, agentIpAddress, agentServiceName, mobileNumber, eKYCId, eKYCOpted, eKYCGender, eKYCapplicantPhoto);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdpSubmitRequest)) {
            return false;
        }
        IdpSubmitRequest idpSubmitRequest = (IdpSubmitRequest) other;
        return Intrinsics.areEqual(this.dlno, idpSubmitRequest.dlno) && Intrinsics.areEqual(this.dob, idpSubmitRequest.dob) && Intrinsics.areEqual(this.rtoCodeDLTr, idpSubmitRequest.rtoCodeDLTr) && Intrinsics.areEqual(this.selectedDLSerList, idpSubmitRequest.selectedDLSerList) && Intrinsics.areEqual(this.pofbirth, idpSubmitRequest.pofbirth) && Intrinsics.areEqual(this.country, idpSubmitRequest.country) && Intrinsics.areEqual(this.passno, idpSubmitRequest.passno) && Intrinsics.areEqual(this.passvaltill, idpSubmitRequest.passvaltill) && Intrinsics.areEqual(this.visano, idpSubmitRequest.visano) && Intrinsics.areEqual(this.visavaltill, idpSubmitRequest.visavaltill) && Intrinsics.areEqual(this.cov_req, idpSubmitRequest.cov_req) && Intrinsics.areEqual(this.tovisit, idpSubmitRequest.tovisit) && Intrinsics.areEqual(this.iscountryrestricted, idpSubmitRequest.iscountryrestricted) && Intrinsics.areEqual(this.countryRestrictedReason, idpSubmitRequest.countryRestrictedReason) && Intrinsics.areEqual(this.isDlSerdisqualified, idpSubmitRequest.isDlSerdisqualified) && Intrinsics.areEqual(this.dlSerdisqualifiedReason, idpSubmitRequest.dlSerdisqualifiedReason) && Intrinsics.areEqual(this.forAdd1, idpSubmitRequest.forAdd1) && Intrinsics.areEqual(this.forAdd2, idpSubmitRequest.forAdd2) && Intrinsics.areEqual(this.forAdd3, idpSubmitRequest.forAdd3) && Intrinsics.areEqual(this.forAddPinCode, idpSubmitRequest.forAddPinCode) && Intrinsics.areEqual(this.forNationMobNum, idpSubmitRequest.forNationMobNum) && Intrinsics.areEqual(this.emailID, idpSubmitRequest.emailID) && Intrinsics.areEqual(this.appliedIdpfromIndEmb, idpSubmitRequest.appliedIdpfromIndEmb) && Intrinsics.areEqual(this.indEmbName, idpSubmitRequest.indEmbName) && Intrinsics.areEqual(this.embPlace, idpSubmitRequest.embPlace) && Intrinsics.areEqual(this.dateOfVerifEmb, idpSubmitRequest.dateOfVerifEmb) && Intrinsics.areEqual(this.embEndorseNo, idpSubmitRequest.embEndorseNo) && Intrinsics.areEqual(this.idpcountryapplyfrom, idpSubmitRequest.idpcountryapplyfrom) && Intrinsics.areEqual(this.agentId, idpSubmitRequest.agentId) && Intrinsics.areEqual(this.agentPwd, idpSubmitRequest.agentPwd) && Intrinsics.areEqual(this.agentIpAddress, idpSubmitRequest.agentIpAddress) && Intrinsics.areEqual(this.agentServiceName, idpSubmitRequest.agentServiceName) && Intrinsics.areEqual(this.mobileNumber, idpSubmitRequest.mobileNumber) && Intrinsics.areEqual(this.eKYCId, idpSubmitRequest.eKYCId) && Intrinsics.areEqual(this.eKYCOpted, idpSubmitRequest.eKYCOpted) && Intrinsics.areEqual(this.eKYCGender, idpSubmitRequest.eKYCGender) && Intrinsics.areEqual(this.eKYCapplicantPhoto, idpSubmitRequest.eKYCapplicantPhoto);
    }

    public final String getAgentId() {
        return this.agentId;
    }

    public final String getAgentIpAddress() {
        return this.agentIpAddress;
    }

    public final String getAgentPwd() {
        return this.agentPwd;
    }

    public final String getAgentServiceName() {
        return this.agentServiceName;
    }

    public final String getAppliedIdpfromIndEmb() {
        return this.appliedIdpfromIndEmb;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getCountryRestrictedReason() {
        return this.countryRestrictedReason;
    }

    public final ArrayList<String> getCov_req() {
        return this.cov_req;
    }

    public final String getDateOfVerifEmb() {
        return this.dateOfVerifEmb;
    }

    public final String getDlSerdisqualifiedReason() {
        return this.dlSerdisqualifiedReason;
    }

    public final String getDlno() {
        return this.dlno;
    }

    public final String getDob() {
        return this.dob;
    }

    public final String getEKYCGender() {
        return this.eKYCGender;
    }

    public final String getEKYCId() {
        return this.eKYCId;
    }

    public final String getEKYCOpted() {
        return this.eKYCOpted;
    }

    public final String getEKYCapplicantPhoto() {
        return this.eKYCapplicantPhoto;
    }

    public final String getEmailID() {
        return this.emailID;
    }

    public final String getEmbEndorseNo() {
        return this.embEndorseNo;
    }

    public final String getEmbPlace() {
        return this.embPlace;
    }

    public final String getForAdd1() {
        return this.forAdd1;
    }

    public final String getForAdd2() {
        return this.forAdd2;
    }

    public final String getForAdd3() {
        return this.forAdd3;
    }

    public final String getForAddPinCode() {
        return this.forAddPinCode;
    }

    public final String getForNationMobNum() {
        return this.forNationMobNum;
    }

    public final String getIdpcountryapplyfrom() {
        return this.idpcountryapplyfrom;
    }

    public final String getIndEmbName() {
        return this.indEmbName;
    }

    public final String getIscountryrestricted() {
        return this.iscountryrestricted;
    }

    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    public final String getPassno() {
        return this.passno;
    }

    public final String getPassvaltill() {
        return this.passvaltill;
    }

    public final String getPofbirth() {
        return this.pofbirth;
    }

    public final String getRtoCodeDLTr() {
        return this.rtoCodeDLTr;
    }

    public final selectDLlist getSelectedDLSerList() {
        return this.selectedDLSerList;
    }

    public final String getTovisit() {
        return this.tovisit;
    }

    public final String getVisano() {
        return this.visano;
    }

    public final String getVisavaltill() {
        return this.visavaltill;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((this.dlno.hashCode() * 31) + this.dob.hashCode()) * 31) + this.rtoCodeDLTr.hashCode()) * 31) + this.selectedDLSerList.hashCode()) * 31) + this.pofbirth.hashCode()) * 31) + this.country.hashCode()) * 31) + this.passno.hashCode()) * 31) + this.passvaltill.hashCode()) * 31) + this.visano.hashCode()) * 31) + this.visavaltill.hashCode()) * 31) + this.cov_req.hashCode()) * 31) + this.tovisit.hashCode()) * 31) + this.iscountryrestricted.hashCode()) * 31) + this.countryRestrictedReason.hashCode()) * 31) + this.isDlSerdisqualified.hashCode()) * 31) + this.dlSerdisqualifiedReason.hashCode()) * 31;
        String str = this.forAdd1;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.forAdd2;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.forAdd3;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.forAddPinCode;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.forNationMobNum;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.emailID;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.appliedIdpfromIndEmb;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.indEmbName;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.embPlace;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.dateOfVerifEmb;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.embEndorseNo;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.idpcountryapplyfrom;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.agentId;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.agentPwd;
        int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.agentIpAddress;
        return ((((((((((((iHashCode15 + (str15 != null ? str15.hashCode() : 0)) * 31) + this.agentServiceName.hashCode()) * 31) + this.mobileNumber.hashCode()) * 31) + this.eKYCId.hashCode()) * 31) + this.eKYCOpted.hashCode()) * 31) + this.eKYCGender.hashCode()) * 31) + this.eKYCapplicantPhoto.hashCode();
    }

    public final String isDlSerdisqualified() {
        return this.isDlSerdisqualified;
    }

    public final void setAgentId(String str) {
        this.agentId = str;
    }

    public final void setAgentIpAddress(String str) {
        this.agentIpAddress = str;
    }

    public final void setAgentPwd(String str) {
        this.agentPwd = str;
    }

    public final void setAgentServiceName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.agentServiceName = str;
    }

    public final void setAppliedIdpfromIndEmb(String str) {
        this.appliedIdpfromIndEmb = str;
    }

    public final void setDateOfVerifEmb(String str) {
        this.dateOfVerifEmb = str;
    }

    public final void setDlSerdisqualified(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.isDlSerdisqualified = str;
    }

    public final void setDlno(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dlno = str;
    }

    public final void setDob(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dob = str;
    }

    public final void setEKYCGender(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eKYCGender = str;
    }

    public final void setEKYCId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eKYCId = str;
    }

    public final void setEKYCOpted(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eKYCOpted = str;
    }

    public final void setEKYCapplicantPhoto(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eKYCapplicantPhoto = str;
    }

    public final void setEmailID(String str) {
        this.emailID = str;
    }

    public final void setEmbEndorseNo(String str) {
        this.embEndorseNo = str;
    }

    public final void setForAdd2(String str) {
        this.forAdd2 = str;
    }

    public final void setForAdd3(String str) {
        this.forAdd3 = str;
    }

    public final void setForNationMobNum(String str) {
        this.forNationMobNum = str;
    }

    public final void setIdpcountryapplyfrom(String str) {
        this.idpcountryapplyfrom = str;
    }

    public final void setIndEmbName(String str) {
        this.indEmbName = str;
    }

    public final void setIscountryrestricted(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.iscountryrestricted = str;
    }

    public final void setMobileNumber(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mobileNumber = str;
    }

    public final void setPassno(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.passno = str;
    }

    public final void setPofbirth(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pofbirth = str;
    }

    public final void setSelectedDLSerList(selectDLlist selectdllist) {
        Intrinsics.checkNotNullParameter(selectdllist, "<set-?>");
        this.selectedDLSerList = selectdllist;
    }

    public final void setTovisit(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tovisit = str;
    }

    public final void setVisano(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.visano = str;
    }

    public final void setVisavaltill(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.visavaltill = str;
    }

    public String toString() {
        return "IdpSubmitRequest(dlno=" + this.dlno + ", dob=" + this.dob + ", rtoCodeDLTr=" + this.rtoCodeDLTr + ", selectedDLSerList=" + this.selectedDLSerList + ", pofbirth=" + this.pofbirth + ", country=" + this.country + ", passno=" + this.passno + ", passvaltill=" + this.passvaltill + ", visano=" + this.visano + ", visavaltill=" + this.visavaltill + ", cov_req=" + this.cov_req + ", tovisit=" + this.tovisit + ", iscountryrestricted=" + this.iscountryrestricted + ", countryRestrictedReason=" + this.countryRestrictedReason + ", isDlSerdisqualified=" + this.isDlSerdisqualified + ", dlSerdisqualifiedReason=" + this.dlSerdisqualifiedReason + ", forAdd1=" + this.forAdd1 + ", forAdd2=" + this.forAdd2 + ", forAdd3=" + this.forAdd3 + ", forAddPinCode=" + this.forAddPinCode + ", forNationMobNum=" + this.forNationMobNum + ", emailID=" + this.emailID + ", appliedIdpfromIndEmb=" + this.appliedIdpfromIndEmb + ", indEmbName=" + this.indEmbName + ", embPlace=" + this.embPlace + ", dateOfVerifEmb=" + this.dateOfVerifEmb + ", embEndorseNo=" + this.embEndorseNo + ", idpcountryapplyfrom=" + this.idpcountryapplyfrom + ", agentId=" + this.agentId + ", agentPwd=" + this.agentPwd + ", agentIpAddress=" + this.agentIpAddress + ", agentServiceName=" + this.agentServiceName + ", mobileNumber=" + this.mobileNumber + ", eKYCId=" + this.eKYCId + ", eKYCOpted=" + this.eKYCOpted + ", eKYCGender=" + this.eKYCGender + ", eKYCapplicantPhoto=" + this.eKYCapplicantPhoto + ')';
    }
}
