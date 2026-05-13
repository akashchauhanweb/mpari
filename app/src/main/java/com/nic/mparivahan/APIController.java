package com.nic.mparivahan;

/* JADX INFO: loaded from: classes.dex */
public class APIController {
    public static APIController a;

    static {
        System.loadLibrary("system-arch");
    }

    public static APIController a() {
        if (a == null) {
            a = new APIController();
        }
        return a;
    }

    public native String EcQr001();

    public native String GetLicenceDetails();

    public native String GetSarClientId();

    public native String GetSarClientSecret();

    public native String GetSearchDocDetails();

    public native String MParivahanDB();

    public native String NChallanGrant();

    public native String NChallanScope();

    public native String NPK();

    public native String NPU();

    public native String PermitKey();

    public native String ReSendSMSAlerts();

    public native String SendSmsAlert();

    public native String UserLogin();

    public native String ValidateRC();

    public native String VerifySMSOtp();

    public native String VirtualRC();

    public native String echallanPaymentPro();

    public native String getAuth();

    public native String getConst();

    public native String getDPTNoticeProd();

    public native String getEchallanLogStg();

    public native String getEchallanPro();

    public native String getH();

    public native String getImageViewProd();

    public native String getNapixBase1();

    public native String getNapixBase2();

    public native String getNapixKeyUser();

    public native String getNexGenAlertPro();

    public native String getNexGenAuditPro();

    public native String getNexGenBannerPro();

    public native String getNexGenCitizenPro();

    public native String getNexGenLanguagePro();

    public native String getNexGenMasterPro();

    public native String getNexGenNrapiPro();

    public native String getNexGenReportPro();

    public native String getNexGenSosPro();

    public native String getNexGenTrafficPro();

    public native String getNexGenVirtualDocPro();

    public native String getPagesPro();

    public native String getPasswordProd();

    public native String getPaymentUrlProd();

    public native String getSarthiPro();

    public native String getSigToken();

    public native String getUsernameProd();

    public native String getVahanApplStatuPro();

    public native String getVahanFormPro();

    public native String getVahanPro();

    public native String sarthiDMSKey();

    public native String sarthiKey();
}
