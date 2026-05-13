package com.nic.mparivahan.Dl.Model;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0003\b\u0089\u0001\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0003\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0017\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\u0017\u0012\u0006\u0010$\u001a\u00020\u0003\u0012\u0006\u0010%\u001a\u00020\u0017\u0012\u0006\u0010&\u001a\u00020\u0017\u0012\u0006\u0010'\u001a\u00020\u0017\u0012\u0006\u0010(\u001a\u00020\u0003\u0012\u0006\u0010)\u001a\u00020\u0003\u0012\u0006\u0010*\u001a\u00020\u0003\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010-\u001a\u00020\u0003\u0012\u0006\u0010.\u001a\u00020\u0017\u0012\u0006\u0010/\u001a\u00020\u0003\u0012\u0006\u00100\u001a\u00020\u0017\u0012\u0006\u00101\u001a\u00020\u0003\u0012\u0006\u00102\u001a\u00020\u0017\u0012\u0006\u00103\u001a\u00020\u0017\u0012\u0006\u00104\u001a\u00020\u0017\u0012\u0006\u00105\u001a\u00020\u0017¢\u0006\u0002\u00106J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010n\u001a\u00020\u0003HÆ\u0003J\t\u0010o\u001a\u00020\u0003HÆ\u0003J\t\u0010p\u001a\u00020\u0003HÆ\u0003J\t\u0010q\u001a\u00020\u0003HÆ\u0003J\t\u0010r\u001a\u00020\u0003HÆ\u0003J\t\u0010s\u001a\u00020\u0003HÆ\u0003J\t\u0010t\u001a\u00020\u0003HÆ\u0003J\t\u0010u\u001a\u00020\u0003HÆ\u0003J\t\u0010v\u001a\u00020\u0003HÆ\u0003J\t\u0010w\u001a\u00020\u0017HÆ\u0003J\t\u0010x\u001a\u00020\u0005HÆ\u0003J\t\u0010y\u001a\u00020\u0003HÆ\u0003J\t\u0010z\u001a\u00020\u0003HÆ\u0003J\t\u0010{\u001a\u00020\u0003HÆ\u0003J\t\u0010|\u001a\u00020\u0003HÆ\u0003J\t\u0010}\u001a\u00020\u0003HÆ\u0003J\t\u0010~\u001a\u00020\u0003HÆ\u0003J\t\u0010\u007f\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0017HÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0017HÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0017HÆ\u0003J\n\u0010\u0088\u0001\u001a\u00020\u0017HÆ\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0017HÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008c\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0090\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0091\u0001\u001a\u00020\u0017HÆ\u0003J\n\u0010\u0092\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0017HÆ\u0003J\n\u0010\u0094\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0095\u0001\u001a\u00020\u0017HÆ\u0003J\n\u0010\u0096\u0001\u001a\u00020\u0017HÆ\u0003J\n\u0010\u0097\u0001\u001a\u00020\u0017HÆ\u0003J\n\u0010\u0098\u0001\u001a\u00020\u0017HÆ\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u009a\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009b\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009c\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009d\u0001\u001a\u00020\u0003HÆ\u0003Jþ\u0003\u0010\u009e\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00172\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00172\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00172\b\b\u0002\u0010&\u001a\u00020\u00172\b\b\u0002\u0010'\u001a\u00020\u00172\b\b\u0002\u0010(\u001a\u00020\u00032\b\b\u0002\u0010)\u001a\u00020\u00032\b\b\u0002\u0010*\u001a\u00020\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010-\u001a\u00020\u00032\b\b\u0002\u0010.\u001a\u00020\u00172\b\b\u0002\u0010/\u001a\u00020\u00032\b\b\u0002\u00100\u001a\u00020\u00172\b\b\u0002\u00101\u001a\u00020\u00032\b\b\u0002\u00102\u001a\u00020\u00172\b\b\u0002\u00103\u001a\u00020\u00172\b\b\u0002\u00104\u001a\u00020\u00172\b\b\u0002\u00105\u001a\u00020\u0017HÆ\u0001J\u0016\u0010\u009f\u0001\u001a\u00020\u00052\n\u0010 \u0001\u001a\u0005\u0018\u00010¡\u0001HÖ\u0003J\n\u0010¢\u0001\u001a\u00020\u0017HÖ\u0001J\n\u0010£\u0001\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010:R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010:R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010:R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010:R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010:R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010:R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010:R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010:R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010:R\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010:\"\u0004\bE\u0010FR\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010:R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u0010:R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u0010:R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010:R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u0010:R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bN\u0010:R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u0010:R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bP\u0010:R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010:R\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bR\u0010:R\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bS\u0010:R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bT\u0010:R\u0011\u0010\u001e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bU\u0010:R\u0011\u0010\u001f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bV\u0010:R\u0011\u0010 \u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bW\u0010:R\u0011\u0010!\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\bX\u0010MR\u0011\u0010\"\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bY\u0010:R\u0011\u0010#\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010MR\u0011\u0010$\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b[\u0010:R\u0011\u0010%\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010MR\u0011\u0010&\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b]\u0010MR\u0011\u0010'\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b^\u0010MR\u0011\u0010(\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b_\u0010:R\u0011\u0010)\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b`\u0010:R\u0011\u0010*\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\ba\u0010:R\u0013\u0010+\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bb\u0010:R\u0013\u0010,\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bc\u0010:R\u0011\u0010-\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bd\u0010:R\u0011\u0010.\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\be\u0010MR\u0011\u0010/\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bf\u0010:R\u0011\u00100\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\bg\u0010MR\u0011\u00101\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bh\u0010:R\u0011\u00102\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\bi\u0010MR\u0011\u00103\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\bj\u0010MR\u0011\u00104\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\bk\u0010MR\u0011\u00105\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\bl\u0010M¨\u0006¤\u0001"}, d2 = {"Lcom/nic/mparivahan/Dl/Model/BioObjX;", "Ljava/io/Serializable;", "bioApplicantCatg", "", "aadharAuthenticated", "", "bioApplno", "bioAadhaarName", "bioPerDetAadhaar", "bioBioId", "bioBioidSearch", "bioBloodGroup", "bioBloodGroupname", "bioCitiZen", "bioDependentRelation", "bioDlno", "bioDob", "bioEndorsedt", "bioEndorsementNo", "bioEndorsetime", "bioFirstName", "bioFullName", "bioGender", "", "bioGenderDesc", "bioLastName", "bioMiddleName", "bioMobileNo", "bioNatName", "bioOrganDonor", "bioPermAdd1", "bioPermAdd2", "bioPermAdd3", "bioPermDistCd", "bioPermDistName", "bioPermPin", "bioPermSdName", "bioPermSdcode", "bioPermVillTownCd", "bioQmQualcd", "bioRecGenesis", "bioSwdFname", "bioSwdFullName", "bioTempAdd1", "bioTempAdd2", "bioTempAdd3", "bioTempDistCd", "bioTempDistName", "bioTempPin", "bioTempSdName", "bioTempSdcode", "bioTempVillTownCd", "bioTokenId", "bioUserId", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;IIII)V", "getAadharAuthenticated", "()Z", "getBioAadhaarName", "()Ljava/lang/String;", "getBioApplicantCatg", "getBioApplno", "getBioBioId", "getBioBioidSearch", "getBioBloodGroup", "getBioBloodGroupname", "getBioCitiZen", "getBioDependentRelation", "getBioDlno", "getBioDob", "setBioDob", "(Ljava/lang/String;)V", "getBioEndorsedt", "getBioEndorsementNo", "getBioEndorsetime", "getBioFirstName", "getBioFullName", "getBioGender", "()I", "getBioGenderDesc", "getBioLastName", "getBioMiddleName", "getBioMobileNo", "getBioNatName", "getBioOrganDonor", "getBioPerDetAadhaar", "getBioPermAdd1", "getBioPermAdd2", "getBioPermAdd3", "getBioPermDistCd", "getBioPermDistName", "getBioPermPin", "getBioPermSdName", "getBioPermSdcode", "getBioPermVillTownCd", "getBioQmQualcd", "getBioRecGenesis", "getBioSwdFname", "getBioSwdFullName", "getBioTempAdd1", "getBioTempAdd2", "getBioTempAdd3", "getBioTempDistCd", "getBioTempDistName", "getBioTempPin", "getBioTempSdName", "getBioTempSdcode", "getBioTempVillTownCd", "getBioTokenId", "getBioUserId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class BioObjX implements Serializable {
    private final boolean aadharAuthenticated;
    private final String bioAadhaarName;
    private final String bioApplicantCatg;
    private final String bioApplno;
    private final String bioBioId;
    private final String bioBioidSearch;
    private final String bioBloodGroup;
    private final String bioBloodGroupname;
    private final String bioCitiZen;
    private final String bioDependentRelation;
    private final String bioDlno;
    private String bioDob;
    private final String bioEndorsedt;
    private final String bioEndorsementNo;
    private final String bioEndorsetime;
    private final String bioFirstName;
    private final String bioFullName;
    private final int bioGender;
    private final String bioGenderDesc;
    private final String bioLastName;
    private final String bioMiddleName;
    private final String bioMobileNo;
    private final String bioNatName;
    private final String bioOrganDonor;
    private final String bioPerDetAadhaar;
    private final String bioPermAdd1;
    private final String bioPermAdd2;
    private final String bioPermAdd3;
    private final int bioPermDistCd;
    private final String bioPermDistName;
    private final int bioPermPin;
    private final String bioPermSdName;
    private final int bioPermSdcode;
    private final int bioPermVillTownCd;
    private final int bioQmQualcd;
    private final String bioRecGenesis;
    private final String bioSwdFname;
    private final String bioSwdFullName;
    private final String bioTempAdd1;
    private final String bioTempAdd2;
    private final String bioTempAdd3;
    private final int bioTempDistCd;
    private final String bioTempDistName;
    private final int bioTempPin;
    private final String bioTempSdName;
    private final int bioTempSdcode;
    private final int bioTempVillTownCd;
    private final int bioTokenId;
    private final int bioUserId;

    public BioObjX(String str, boolean z, String bioApplno, String str2, String str3, String bioBioId, String bioBioidSearch, String bioBloodGroup, String bioBloodGroupname, String bioCitiZen, String bioDependentRelation, String bioDlno, String bioDob, String bioEndorsedt, String bioEndorsementNo, String bioEndorsetime, String bioFirstName, String bioFullName, int i, String bioGenderDesc, String bioLastName, String bioMiddleName, String bioMobileNo, String bioNatName, String bioOrganDonor, String bioPermAdd1, String bioPermAdd2, String bioPermAdd3, int i2, String bioPermDistName, int i3, String bioPermSdName, int i4, int i5, int i6, String bioRecGenesis, String bioSwdFname, String bioSwdFullName, String str4, String str5, String bioTempAdd3, int i7, String bioTempDistName, int i8, String bioTempSdName, int i9, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(bioApplno, "bioApplno");
        Intrinsics.checkNotNullParameter(bioBioId, "bioBioId");
        Intrinsics.checkNotNullParameter(bioBioidSearch, "bioBioidSearch");
        Intrinsics.checkNotNullParameter(bioBloodGroup, "bioBloodGroup");
        Intrinsics.checkNotNullParameter(bioBloodGroupname, "bioBloodGroupname");
        Intrinsics.checkNotNullParameter(bioCitiZen, "bioCitiZen");
        Intrinsics.checkNotNullParameter(bioDependentRelation, "bioDependentRelation");
        Intrinsics.checkNotNullParameter(bioDlno, "bioDlno");
        Intrinsics.checkNotNullParameter(bioDob, "bioDob");
        Intrinsics.checkNotNullParameter(bioEndorsedt, "bioEndorsedt");
        Intrinsics.checkNotNullParameter(bioEndorsementNo, "bioEndorsementNo");
        Intrinsics.checkNotNullParameter(bioEndorsetime, "bioEndorsetime");
        Intrinsics.checkNotNullParameter(bioFirstName, "bioFirstName");
        Intrinsics.checkNotNullParameter(bioFullName, "bioFullName");
        Intrinsics.checkNotNullParameter(bioGenderDesc, "bioGenderDesc");
        Intrinsics.checkNotNullParameter(bioLastName, "bioLastName");
        Intrinsics.checkNotNullParameter(bioMiddleName, "bioMiddleName");
        Intrinsics.checkNotNullParameter(bioMobileNo, "bioMobileNo");
        Intrinsics.checkNotNullParameter(bioNatName, "bioNatName");
        Intrinsics.checkNotNullParameter(bioOrganDonor, "bioOrganDonor");
        Intrinsics.checkNotNullParameter(bioPermAdd1, "bioPermAdd1");
        Intrinsics.checkNotNullParameter(bioPermAdd2, "bioPermAdd2");
        Intrinsics.checkNotNullParameter(bioPermAdd3, "bioPermAdd3");
        Intrinsics.checkNotNullParameter(bioPermDistName, "bioPermDistName");
        Intrinsics.checkNotNullParameter(bioPermSdName, "bioPermSdName");
        Intrinsics.checkNotNullParameter(bioRecGenesis, "bioRecGenesis");
        Intrinsics.checkNotNullParameter(bioSwdFname, "bioSwdFname");
        Intrinsics.checkNotNullParameter(bioSwdFullName, "bioSwdFullName");
        Intrinsics.checkNotNullParameter(bioTempAdd3, "bioTempAdd3");
        Intrinsics.checkNotNullParameter(bioTempDistName, "bioTempDistName");
        Intrinsics.checkNotNullParameter(bioTempSdName, "bioTempSdName");
        this.bioApplicantCatg = str;
        this.aadharAuthenticated = z;
        this.bioApplno = bioApplno;
        this.bioAadhaarName = str2;
        this.bioPerDetAadhaar = str3;
        this.bioBioId = bioBioId;
        this.bioBioidSearch = bioBioidSearch;
        this.bioBloodGroup = bioBloodGroup;
        this.bioBloodGroupname = bioBloodGroupname;
        this.bioCitiZen = bioCitiZen;
        this.bioDependentRelation = bioDependentRelation;
        this.bioDlno = bioDlno;
        this.bioDob = bioDob;
        this.bioEndorsedt = bioEndorsedt;
        this.bioEndorsementNo = bioEndorsementNo;
        this.bioEndorsetime = bioEndorsetime;
        this.bioFirstName = bioFirstName;
        this.bioFullName = bioFullName;
        this.bioGender = i;
        this.bioGenderDesc = bioGenderDesc;
        this.bioLastName = bioLastName;
        this.bioMiddleName = bioMiddleName;
        this.bioMobileNo = bioMobileNo;
        this.bioNatName = bioNatName;
        this.bioOrganDonor = bioOrganDonor;
        this.bioPermAdd1 = bioPermAdd1;
        this.bioPermAdd2 = bioPermAdd2;
        this.bioPermAdd3 = bioPermAdd3;
        this.bioPermDistCd = i2;
        this.bioPermDistName = bioPermDistName;
        this.bioPermPin = i3;
        this.bioPermSdName = bioPermSdName;
        this.bioPermSdcode = i4;
        this.bioPermVillTownCd = i5;
        this.bioQmQualcd = i6;
        this.bioRecGenesis = bioRecGenesis;
        this.bioSwdFname = bioSwdFname;
        this.bioSwdFullName = bioSwdFullName;
        this.bioTempAdd1 = str4;
        this.bioTempAdd2 = str5;
        this.bioTempAdd3 = bioTempAdd3;
        this.bioTempDistCd = i7;
        this.bioTempDistName = bioTempDistName;
        this.bioTempPin = i8;
        this.bioTempSdName = bioTempSdName;
        this.bioTempSdcode = i9;
        this.bioTempVillTownCd = i10;
        this.bioTokenId = i11;
        this.bioUserId = i12;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBioApplicantCatg() {
        return this.bioApplicantCatg;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getBioCitiZen() {
        return this.bioCitiZen;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getBioDependentRelation() {
        return this.bioDependentRelation;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getBioDlno() {
        return this.bioDlno;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getBioDob() {
        return this.bioDob;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getBioEndorsedt() {
        return this.bioEndorsedt;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getBioEndorsementNo() {
        return this.bioEndorsementNo;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getBioEndorsetime() {
        return this.bioEndorsetime;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getBioFirstName() {
        return this.bioFirstName;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getBioFullName() {
        return this.bioFullName;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getBioGender() {
        return this.bioGender;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getAadharAuthenticated() {
        return this.aadharAuthenticated;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getBioGenderDesc() {
        return this.bioGenderDesc;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getBioLastName() {
        return this.bioLastName;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getBioMiddleName() {
        return this.bioMiddleName;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getBioMobileNo() {
        return this.bioMobileNo;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getBioNatName() {
        return this.bioNatName;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getBioOrganDonor() {
        return this.bioOrganDonor;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getBioPermAdd1() {
        return this.bioPermAdd1;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getBioPermAdd2() {
        return this.bioPermAdd2;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getBioPermAdd3() {
        return this.bioPermAdd3;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final int getBioPermDistCd() {
        return this.bioPermDistCd;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBioApplno() {
        return this.bioApplno;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getBioPermDistName() {
        return this.bioPermDistName;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final int getBioPermPin() {
        return this.bioPermPin;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getBioPermSdName() {
        return this.bioPermSdName;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final int getBioPermSdcode() {
        return this.bioPermSdcode;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final int getBioPermVillTownCd() {
        return this.bioPermVillTownCd;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final int getBioQmQualcd() {
        return this.bioQmQualcd;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getBioRecGenesis() {
        return this.bioRecGenesis;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getBioSwdFname() {
        return this.bioSwdFname;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final String getBioSwdFullName() {
        return this.bioSwdFullName;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final String getBioTempAdd1() {
        return this.bioTempAdd1;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBioAadhaarName() {
        return this.bioAadhaarName;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final String getBioTempAdd2() {
        return this.bioTempAdd2;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final String getBioTempAdd3() {
        return this.bioTempAdd3;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final int getBioTempDistCd() {
        return this.bioTempDistCd;
    }

    /* JADX INFO: renamed from: component43, reason: from getter */
    public final String getBioTempDistName() {
        return this.bioTempDistName;
    }

    /* JADX INFO: renamed from: component44, reason: from getter */
    public final int getBioTempPin() {
        return this.bioTempPin;
    }

    /* JADX INFO: renamed from: component45, reason: from getter */
    public final String getBioTempSdName() {
        return this.bioTempSdName;
    }

    /* JADX INFO: renamed from: component46, reason: from getter */
    public final int getBioTempSdcode() {
        return this.bioTempSdcode;
    }

    /* JADX INFO: renamed from: component47, reason: from getter */
    public final int getBioTempVillTownCd() {
        return this.bioTempVillTownCd;
    }

    /* JADX INFO: renamed from: component48, reason: from getter */
    public final int getBioTokenId() {
        return this.bioTokenId;
    }

    /* JADX INFO: renamed from: component49, reason: from getter */
    public final int getBioUserId() {
        return this.bioUserId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBioPerDetAadhaar() {
        return this.bioPerDetAadhaar;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBioBioId() {
        return this.bioBioId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getBioBioidSearch() {
        return this.bioBioidSearch;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getBioBloodGroup() {
        return this.bioBloodGroup;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getBioBloodGroupname() {
        return this.bioBloodGroupname;
    }

    public final BioObjX copy(String bioApplicantCatg, boolean aadharAuthenticated, String bioApplno, String bioAadhaarName, String bioPerDetAadhaar, String bioBioId, String bioBioidSearch, String bioBloodGroup, String bioBloodGroupname, String bioCitiZen, String bioDependentRelation, String bioDlno, String bioDob, String bioEndorsedt, String bioEndorsementNo, String bioEndorsetime, String bioFirstName, String bioFullName, int bioGender, String bioGenderDesc, String bioLastName, String bioMiddleName, String bioMobileNo, String bioNatName, String bioOrganDonor, String bioPermAdd1, String bioPermAdd2, String bioPermAdd3, int bioPermDistCd, String bioPermDistName, int bioPermPin, String bioPermSdName, int bioPermSdcode, int bioPermVillTownCd, int bioQmQualcd, String bioRecGenesis, String bioSwdFname, String bioSwdFullName, String bioTempAdd1, String bioTempAdd2, String bioTempAdd3, int bioTempDistCd, String bioTempDistName, int bioTempPin, String bioTempSdName, int bioTempSdcode, int bioTempVillTownCd, int bioTokenId, int bioUserId) {
        Intrinsics.checkNotNullParameter(bioApplno, "bioApplno");
        Intrinsics.checkNotNullParameter(bioBioId, "bioBioId");
        Intrinsics.checkNotNullParameter(bioBioidSearch, "bioBioidSearch");
        Intrinsics.checkNotNullParameter(bioBloodGroup, "bioBloodGroup");
        Intrinsics.checkNotNullParameter(bioBloodGroupname, "bioBloodGroupname");
        Intrinsics.checkNotNullParameter(bioCitiZen, "bioCitiZen");
        Intrinsics.checkNotNullParameter(bioDependentRelation, "bioDependentRelation");
        Intrinsics.checkNotNullParameter(bioDlno, "bioDlno");
        Intrinsics.checkNotNullParameter(bioDob, "bioDob");
        Intrinsics.checkNotNullParameter(bioEndorsedt, "bioEndorsedt");
        Intrinsics.checkNotNullParameter(bioEndorsementNo, "bioEndorsementNo");
        Intrinsics.checkNotNullParameter(bioEndorsetime, "bioEndorsetime");
        Intrinsics.checkNotNullParameter(bioFirstName, "bioFirstName");
        Intrinsics.checkNotNullParameter(bioFullName, "bioFullName");
        Intrinsics.checkNotNullParameter(bioGenderDesc, "bioGenderDesc");
        Intrinsics.checkNotNullParameter(bioLastName, "bioLastName");
        Intrinsics.checkNotNullParameter(bioMiddleName, "bioMiddleName");
        Intrinsics.checkNotNullParameter(bioMobileNo, "bioMobileNo");
        Intrinsics.checkNotNullParameter(bioNatName, "bioNatName");
        Intrinsics.checkNotNullParameter(bioOrganDonor, "bioOrganDonor");
        Intrinsics.checkNotNullParameter(bioPermAdd1, "bioPermAdd1");
        Intrinsics.checkNotNullParameter(bioPermAdd2, "bioPermAdd2");
        Intrinsics.checkNotNullParameter(bioPermAdd3, "bioPermAdd3");
        Intrinsics.checkNotNullParameter(bioPermDistName, "bioPermDistName");
        Intrinsics.checkNotNullParameter(bioPermSdName, "bioPermSdName");
        Intrinsics.checkNotNullParameter(bioRecGenesis, "bioRecGenesis");
        Intrinsics.checkNotNullParameter(bioSwdFname, "bioSwdFname");
        Intrinsics.checkNotNullParameter(bioSwdFullName, "bioSwdFullName");
        Intrinsics.checkNotNullParameter(bioTempAdd3, "bioTempAdd3");
        Intrinsics.checkNotNullParameter(bioTempDistName, "bioTempDistName");
        Intrinsics.checkNotNullParameter(bioTempSdName, "bioTempSdName");
        return new BioObjX(bioApplicantCatg, aadharAuthenticated, bioApplno, bioAadhaarName, bioPerDetAadhaar, bioBioId, bioBioidSearch, bioBloodGroup, bioBloodGroupname, bioCitiZen, bioDependentRelation, bioDlno, bioDob, bioEndorsedt, bioEndorsementNo, bioEndorsetime, bioFirstName, bioFullName, bioGender, bioGenderDesc, bioLastName, bioMiddleName, bioMobileNo, bioNatName, bioOrganDonor, bioPermAdd1, bioPermAdd2, bioPermAdd3, bioPermDistCd, bioPermDistName, bioPermPin, bioPermSdName, bioPermSdcode, bioPermVillTownCd, bioQmQualcd, bioRecGenesis, bioSwdFname, bioSwdFullName, bioTempAdd1, bioTempAdd2, bioTempAdd3, bioTempDistCd, bioTempDistName, bioTempPin, bioTempSdName, bioTempSdcode, bioTempVillTownCd, bioTokenId, bioUserId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BioObjX)) {
            return false;
        }
        BioObjX bioObjX = (BioObjX) other;
        return Intrinsics.areEqual(this.bioApplicantCatg, bioObjX.bioApplicantCatg) && this.aadharAuthenticated == bioObjX.aadharAuthenticated && Intrinsics.areEqual(this.bioApplno, bioObjX.bioApplno) && Intrinsics.areEqual(this.bioAadhaarName, bioObjX.bioAadhaarName) && Intrinsics.areEqual(this.bioPerDetAadhaar, bioObjX.bioPerDetAadhaar) && Intrinsics.areEqual(this.bioBioId, bioObjX.bioBioId) && Intrinsics.areEqual(this.bioBioidSearch, bioObjX.bioBioidSearch) && Intrinsics.areEqual(this.bioBloodGroup, bioObjX.bioBloodGroup) && Intrinsics.areEqual(this.bioBloodGroupname, bioObjX.bioBloodGroupname) && Intrinsics.areEqual(this.bioCitiZen, bioObjX.bioCitiZen) && Intrinsics.areEqual(this.bioDependentRelation, bioObjX.bioDependentRelation) && Intrinsics.areEqual(this.bioDlno, bioObjX.bioDlno) && Intrinsics.areEqual(this.bioDob, bioObjX.bioDob) && Intrinsics.areEqual(this.bioEndorsedt, bioObjX.bioEndorsedt) && Intrinsics.areEqual(this.bioEndorsementNo, bioObjX.bioEndorsementNo) && Intrinsics.areEqual(this.bioEndorsetime, bioObjX.bioEndorsetime) && Intrinsics.areEqual(this.bioFirstName, bioObjX.bioFirstName) && Intrinsics.areEqual(this.bioFullName, bioObjX.bioFullName) && this.bioGender == bioObjX.bioGender && Intrinsics.areEqual(this.bioGenderDesc, bioObjX.bioGenderDesc) && Intrinsics.areEqual(this.bioLastName, bioObjX.bioLastName) && Intrinsics.areEqual(this.bioMiddleName, bioObjX.bioMiddleName) && Intrinsics.areEqual(this.bioMobileNo, bioObjX.bioMobileNo) && Intrinsics.areEqual(this.bioNatName, bioObjX.bioNatName) && Intrinsics.areEqual(this.bioOrganDonor, bioObjX.bioOrganDonor) && Intrinsics.areEqual(this.bioPermAdd1, bioObjX.bioPermAdd1) && Intrinsics.areEqual(this.bioPermAdd2, bioObjX.bioPermAdd2) && Intrinsics.areEqual(this.bioPermAdd3, bioObjX.bioPermAdd3) && this.bioPermDistCd == bioObjX.bioPermDistCd && Intrinsics.areEqual(this.bioPermDistName, bioObjX.bioPermDistName) && this.bioPermPin == bioObjX.bioPermPin && Intrinsics.areEqual(this.bioPermSdName, bioObjX.bioPermSdName) && this.bioPermSdcode == bioObjX.bioPermSdcode && this.bioPermVillTownCd == bioObjX.bioPermVillTownCd && this.bioQmQualcd == bioObjX.bioQmQualcd && Intrinsics.areEqual(this.bioRecGenesis, bioObjX.bioRecGenesis) && Intrinsics.areEqual(this.bioSwdFname, bioObjX.bioSwdFname) && Intrinsics.areEqual(this.bioSwdFullName, bioObjX.bioSwdFullName) && Intrinsics.areEqual(this.bioTempAdd1, bioObjX.bioTempAdd1) && Intrinsics.areEqual(this.bioTempAdd2, bioObjX.bioTempAdd2) && Intrinsics.areEqual(this.bioTempAdd3, bioObjX.bioTempAdd3) && this.bioTempDistCd == bioObjX.bioTempDistCd && Intrinsics.areEqual(this.bioTempDistName, bioObjX.bioTempDistName) && this.bioTempPin == bioObjX.bioTempPin && Intrinsics.areEqual(this.bioTempSdName, bioObjX.bioTempSdName) && this.bioTempSdcode == bioObjX.bioTempSdcode && this.bioTempVillTownCd == bioObjX.bioTempVillTownCd && this.bioTokenId == bioObjX.bioTokenId && this.bioUserId == bioObjX.bioUserId;
    }

    public final boolean getAadharAuthenticated() {
        return this.aadharAuthenticated;
    }

    public final String getBioAadhaarName() {
        return this.bioAadhaarName;
    }

    public final String getBioApplicantCatg() {
        return this.bioApplicantCatg;
    }

    public final String getBioApplno() {
        return this.bioApplno;
    }

    public final String getBioBioId() {
        return this.bioBioId;
    }

    public final String getBioBioidSearch() {
        return this.bioBioidSearch;
    }

    public final String getBioBloodGroup() {
        return this.bioBloodGroup;
    }

    public final String getBioBloodGroupname() {
        return this.bioBloodGroupname;
    }

    public final String getBioCitiZen() {
        return this.bioCitiZen;
    }

    public final String getBioDependentRelation() {
        return this.bioDependentRelation;
    }

    public final String getBioDlno() {
        return this.bioDlno;
    }

    public final String getBioDob() {
        return this.bioDob;
    }

    public final String getBioEndorsedt() {
        return this.bioEndorsedt;
    }

    public final String getBioEndorsementNo() {
        return this.bioEndorsementNo;
    }

    public final String getBioEndorsetime() {
        return this.bioEndorsetime;
    }

    public final String getBioFirstName() {
        return this.bioFirstName;
    }

    public final String getBioFullName() {
        return this.bioFullName;
    }

    public final int getBioGender() {
        return this.bioGender;
    }

    public final String getBioGenderDesc() {
        return this.bioGenderDesc;
    }

    public final String getBioLastName() {
        return this.bioLastName;
    }

    public final String getBioMiddleName() {
        return this.bioMiddleName;
    }

    public final String getBioMobileNo() {
        return this.bioMobileNo;
    }

    public final String getBioNatName() {
        return this.bioNatName;
    }

    public final String getBioOrganDonor() {
        return this.bioOrganDonor;
    }

    public final String getBioPerDetAadhaar() {
        return this.bioPerDetAadhaar;
    }

    public final String getBioPermAdd1() {
        return this.bioPermAdd1;
    }

    public final String getBioPermAdd2() {
        return this.bioPermAdd2;
    }

    public final String getBioPermAdd3() {
        return this.bioPermAdd3;
    }

    public final int getBioPermDistCd() {
        return this.bioPermDistCd;
    }

    public final String getBioPermDistName() {
        return this.bioPermDistName;
    }

    public final int getBioPermPin() {
        return this.bioPermPin;
    }

    public final String getBioPermSdName() {
        return this.bioPermSdName;
    }

    public final int getBioPermSdcode() {
        return this.bioPermSdcode;
    }

    public final int getBioPermVillTownCd() {
        return this.bioPermVillTownCd;
    }

    public final int getBioQmQualcd() {
        return this.bioQmQualcd;
    }

    public final String getBioRecGenesis() {
        return this.bioRecGenesis;
    }

    public final String getBioSwdFname() {
        return this.bioSwdFname;
    }

    public final String getBioSwdFullName() {
        return this.bioSwdFullName;
    }

    public final String getBioTempAdd1() {
        return this.bioTempAdd1;
    }

    public final String getBioTempAdd2() {
        return this.bioTempAdd2;
    }

    public final String getBioTempAdd3() {
        return this.bioTempAdd3;
    }

    public final int getBioTempDistCd() {
        return this.bioTempDistCd;
    }

    public final String getBioTempDistName() {
        return this.bioTempDistName;
    }

    public final int getBioTempPin() {
        return this.bioTempPin;
    }

    public final String getBioTempSdName() {
        return this.bioTempSdName;
    }

    public final int getBioTempSdcode() {
        return this.bioTempSdcode;
    }

    public final int getBioTempVillTownCd() {
        return this.bioTempVillTownCd;
    }

    public final int getBioTokenId() {
        return this.bioTokenId;
    }

    public final int getBioUserId() {
        return this.bioUserId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v83 */
    /* JADX WARN: Type inference failed for: r2v84 */
    public int hashCode() {
        String str = this.bioApplicantCatg;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.aadharAuthenticated;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int iHashCode2 = (((iHashCode + r2) * 31) + this.bioApplno.hashCode()) * 31;
        String str2 = this.bioAadhaarName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bioPerDetAadhaar;
        int iHashCode4 = (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.bioBioId.hashCode()) * 31) + this.bioBioidSearch.hashCode()) * 31) + this.bioBloodGroup.hashCode()) * 31) + this.bioBloodGroupname.hashCode()) * 31) + this.bioCitiZen.hashCode()) * 31) + this.bioDependentRelation.hashCode()) * 31) + this.bioDlno.hashCode()) * 31) + this.bioDob.hashCode()) * 31) + this.bioEndorsedt.hashCode()) * 31) + this.bioEndorsementNo.hashCode()) * 31) + this.bioEndorsetime.hashCode()) * 31) + this.bioFirstName.hashCode()) * 31) + this.bioFullName.hashCode()) * 31) + Integer.hashCode(this.bioGender)) * 31) + this.bioGenderDesc.hashCode()) * 31) + this.bioLastName.hashCode()) * 31) + this.bioMiddleName.hashCode()) * 31) + this.bioMobileNo.hashCode()) * 31) + this.bioNatName.hashCode()) * 31) + this.bioOrganDonor.hashCode()) * 31) + this.bioPermAdd1.hashCode()) * 31) + this.bioPermAdd2.hashCode()) * 31) + this.bioPermAdd3.hashCode()) * 31) + Integer.hashCode(this.bioPermDistCd)) * 31) + this.bioPermDistName.hashCode()) * 31) + Integer.hashCode(this.bioPermPin)) * 31) + this.bioPermSdName.hashCode()) * 31) + Integer.hashCode(this.bioPermSdcode)) * 31) + Integer.hashCode(this.bioPermVillTownCd)) * 31) + Integer.hashCode(this.bioQmQualcd)) * 31) + this.bioRecGenesis.hashCode()) * 31) + this.bioSwdFname.hashCode()) * 31) + this.bioSwdFullName.hashCode()) * 31;
        String str4 = this.bioTempAdd1;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.bioTempAdd2;
        return ((((((((((((((((((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.bioTempAdd3.hashCode()) * 31) + Integer.hashCode(this.bioTempDistCd)) * 31) + this.bioTempDistName.hashCode()) * 31) + Integer.hashCode(this.bioTempPin)) * 31) + this.bioTempSdName.hashCode()) * 31) + Integer.hashCode(this.bioTempSdcode)) * 31) + Integer.hashCode(this.bioTempVillTownCd)) * 31) + Integer.hashCode(this.bioTokenId)) * 31) + Integer.hashCode(this.bioUserId);
    }

    public final void setBioDob(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bioDob = str;
    }

    public String toString() {
        return "BioObjX(bioApplicantCatg=" + this.bioApplicantCatg + ", aadharAuthenticated=" + this.aadharAuthenticated + ", bioApplno=" + this.bioApplno + ", bioAadhaarName=" + this.bioAadhaarName + ", bioPerDetAadhaar=" + this.bioPerDetAadhaar + ", bioBioId=" + this.bioBioId + ", bioBioidSearch=" + this.bioBioidSearch + ", bioBloodGroup=" + this.bioBloodGroup + ", bioBloodGroupname=" + this.bioBloodGroupname + ", bioCitiZen=" + this.bioCitiZen + ", bioDependentRelation=" + this.bioDependentRelation + ", bioDlno=" + this.bioDlno + ", bioDob=" + this.bioDob + ", bioEndorsedt=" + this.bioEndorsedt + ", bioEndorsementNo=" + this.bioEndorsementNo + ", bioEndorsetime=" + this.bioEndorsetime + ", bioFirstName=" + this.bioFirstName + ", bioFullName=" + this.bioFullName + ", bioGender=" + this.bioGender + ", bioGenderDesc=" + this.bioGenderDesc + ", bioLastName=" + this.bioLastName + ", bioMiddleName=" + this.bioMiddleName + ", bioMobileNo=" + this.bioMobileNo + ", bioNatName=" + this.bioNatName + ", bioOrganDonor=" + this.bioOrganDonor + ", bioPermAdd1=" + this.bioPermAdd1 + ", bioPermAdd2=" + this.bioPermAdd2 + ", bioPermAdd3=" + this.bioPermAdd3 + ", bioPermDistCd=" + this.bioPermDistCd + ", bioPermDistName=" + this.bioPermDistName + ", bioPermPin=" + this.bioPermPin + ", bioPermSdName=" + this.bioPermSdName + ", bioPermSdcode=" + this.bioPermSdcode + ", bioPermVillTownCd=" + this.bioPermVillTownCd + ", bioQmQualcd=" + this.bioQmQualcd + ", bioRecGenesis=" + this.bioRecGenesis + ", bioSwdFname=" + this.bioSwdFname + ", bioSwdFullName=" + this.bioSwdFullName + ", bioTempAdd1=" + this.bioTempAdd1 + ", bioTempAdd2=" + this.bioTempAdd2 + ", bioTempAdd3=" + this.bioTempAdd3 + ", bioTempDistCd=" + this.bioTempDistCd + ", bioTempDistName=" + this.bioTempDistName + ", bioTempPin=" + this.bioTempPin + ", bioTempSdName=" + this.bioTempSdName + ", bioTempSdcode=" + this.bioTempSdcode + ", bioTempVillTownCd=" + this.bioTempVillTownCd + ", bioTokenId=" + this.bioTokenId + ", bioUserId=" + this.bioUserId + ')';
    }

    public /* synthetic */ BioObjX(String str, boolean z, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, int i2, String str27, int i3, String str28, int i4, int i5, int i6, String str29, String str30, String str31, String str32, String str33, String str34, int i7, String str35, int i8, String str36, int i9, int i10, int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, str2, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, i, str18, str19, str20, str21, str22, str23, str24, str25, str26, i2, str27, i3, str28, i4, i5, i6, str29, str30, str31, str32, str33, str34, i7, str35, i8, str36, i9, i10, i11, i12);
    }
}
