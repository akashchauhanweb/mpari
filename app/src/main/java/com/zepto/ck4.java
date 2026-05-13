package com.zepto;

import com.nic.mparivahan.dlservices.data.model.ResultItemSubmit;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ck4 {
    public static wp4 a(String str, String str2, String str3, String str4, zd2 zd2Var, boolean z) {
        try {
            wp4 wp4Var = new wp4(2);
            wp4Var.W(100.0f);
            wp4Var.U(1.0f);
            wp4Var.S(1.0f);
            int i = z ? 15 : 0;
            wp4Var.X(new float[]{1.0f, 1.0f});
            tp4 tp4Var = new tp4(new fl4("Applicant Address:", zd2Var));
            p40 p40Var = p40.f;
            tp4Var.G(p40Var);
            tp4Var.F(i);
            tp4Var.q0(5.0f);
            tp4Var.o0(1);
            tp4Var.u0(1);
            tp4 tp4Var2 = new tp4(new fl4("RTO Location :", zd2Var));
            tp4Var2.G(p40Var);
            tp4Var2.F(i);
            tp4Var2.q0(5.0f);
            tp4Var2.o0(1);
            tp4Var2.u0(1);
            wp4Var.a(tp4Var);
            wp4Var.a(tp4Var2);
            return wp4Var;
        } catch (cu1 e) {
            e.printStackTrace();
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static wp4 b(ResultItemSubmit resultItemSubmit, String str, String str2, String str3, String str4, zd2 zd2Var, boolean z) {
        try {
            wp4 wp4Var = new wp4(2);
            wp4Var.W(100.0f);
            wp4Var.U(1.0f);
            wp4Var.S(1.0f);
            int i = z ? 15 : 0;
            wp4Var.X(new float[]{1.0f, 1.0f});
            tp4 tp4Var = new tp4(new fl4(resultItemSubmit.getApplicantAddress(), zd2Var));
            p40 p40Var = p40.f;
            tp4Var.G(p40Var);
            tp4Var.F(i);
            tp4Var.q0(5.0f);
            tp4Var.o0(1);
            tp4Var.u0(1);
            tp4 tp4Var2 = new tp4(new fl4(resultItemSubmit.getRtoLocation(), zd2Var));
            tp4Var2.G(p40Var);
            tp4Var2.F(i);
            tp4Var2.q0(5.0f);
            tp4Var2.o0(1);
            tp4Var2.u0(1);
            wp4Var.a(tp4Var);
            wp4Var.a(tp4Var2);
            return wp4Var;
        } catch (cu1 e) {
            e.printStackTrace();
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static wp4 c(ResultItemSubmit resultItemSubmit, String str, String str2, String str3, String str4, zd2 zd2Var, boolean z) {
        try {
            wp4 wp4Var = new wp4(1);
            wp4Var.W(100.0f);
            wp4 wp4Var2 = new wp4(1);
            wp4Var2.W(100.0f);
            wp4Var2.U(1.0f);
            wp4Var2.S(1.0f);
            int i = z ? 15 : 0;
            wp4Var2.X(new float[]{1.0f});
            qf3 qf3Var = new qf3();
            qf3Var.i("*");
            sf3 sf3Var = new sf3("Your Application for Services on Driving Licence is accepted for Processing. For all future references quote this Application Number : " + resultItemSubmit.getApplicationNo());
            sf3 sf3Var2 = new sf3(resultItemSubmit.getSmsConfirmation());
            sf3 sf3Var3 = new sf3("Applicant should take print out of the Application Form (pre filled) and duly signed with all required Documents to be concerned RTO office");
            sf3 sf3Var4 = new sf3("The online facility of application submission, upload documents, payment of fees, slot booking etc., does not complete the process of issue of Driving Licence or any other Service requested. The applicant has to compulsorily visit the concerned Road Transport Office to finish the process of issue of Driving Licence and/or any other associated services.   ");
            sf3 sf3Var5 = new sf3("Applicants are requested to note that after completion of all stages mentioned under `Applicant Stages’, the applicant has to visit the concerned Road Transport Office on the scheduled date of appointment, along with the necessary documents to complete the remaining process (or) In cases where online slot booking facility is not available for any particular RTO, the applicant has to go to the concerned Road Transport Office at the earliest along with the necessary documents, to complete the remaining process.  ");
            qf3Var.a(sf3Var);
            qf3Var.a(sf3Var2);
            qf3Var.a(sf3Var3);
            qf3Var.a(sf3Var4);
            qf3Var.a(sf3Var5);
            tp4 tp4Var = new tp4();
            tp4Var.M(qf3Var);
            p40 p40Var = p40.f;
            tp4Var.G(p40Var);
            tp4Var.F(i);
            tp4Var.q0(8.0f);
            tp4Var.l0(3);
            tp4Var.o0(1);
            tp4Var.u0(1);
            wp4Var2.a(tp4Var);
            tp4 tp4Var2 = new tp4(wp4Var2);
            tp4Var2.G(p40Var);
            tp4Var2.F(0);
            tp4Var2.o0(1);
            tp4Var2.u0(1);
            wp4Var.a(tp4Var2);
            return wp4Var;
        } catch (cu1 e) {
            e.printStackTrace();
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static wp4 d(String str, String str2, String str3, String str4, zd2 zd2Var, boolean z) {
        try {
            wp4 wp4Var = new wp4(1);
            wp4Var.W(100.0f);
            wp4Var.U(1.0f);
            wp4Var.S(1.0f);
            wp4 wp4Var2 = new wp4(2);
            wp4Var2.W(100.0f);
            wp4Var2.U(1.0f);
            wp4Var2.S(1.0f);
            int i = z ? 15 : 0;
            wp4Var2.X(new float[]{1.0f, 1.0f});
            tp4 tp4Var = new tp4(new fl4("Services Requested", zd2Var));
            p40 p40Var = p40.f;
            tp4Var.G(p40Var);
            tp4Var.F(i);
            tp4Var.q0(2.0f);
            tp4Var.o0(1);
            tp4Var.u0(1);
            tp4 tp4Var2 = new tp4(new fl4("Documnetary Proof Required", zd2Var));
            tp4Var2.G(p40Var);
            tp4Var2.F(i);
            tp4Var2.q0(2.0f);
            tp4Var2.o0(1);
            tp4Var2.u0(1);
            wp4Var2.a(tp4Var);
            wp4Var2.a(tp4Var2);
            tp4 tp4Var3 = new tp4(wp4Var2);
            tp4Var3.G(p40Var);
            tp4Var3.F(15);
            tp4Var3.q0(2.0f);
            tp4Var3.o0(1);
            tp4Var3.u0(1);
            wp4Var.a(tp4Var3);
            return wp4Var;
        } catch (cu1 e) {
            e.printStackTrace();
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static wp4 e(ResultItemSubmit resultItemSubmit, String str, String str2, String str3, String str4, zd2 zd2Var, boolean z) {
        try {
            wp4 wp4Var = new wp4(1);
            wp4Var.W(100.0f);
            wp4 wp4Var2 = new wp4(2);
            wp4Var2.W(100.0f);
            wp4Var2.U(1.0f);
            wp4Var2.S(1.0f);
            int i = z ? 15 : 0;
            wp4Var2.X(new float[]{1.0f, 1.0f});
            qf3 qf3Var = new qf3();
            qf3Var.i("1. ");
            try {
                if (!resultItemSubmit.getServicesRequested().getJsonMember513().isEmpty()) {
                    qf3Var.a(new sf3("Issue of Duplicate DL"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if (!resultItemSubmit.getServicesRequested().getJsonMember514().isEmpty()) {
                    qf3Var.a(new sf3("Renewal of DL"));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            try {
                if (!resultItemSubmit.getServicesRequested().getJsonMember515().isEmpty()) {
                    qf3Var.a(new sf3("Change of Address in DL"));
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            try {
                if (!resultItemSubmit.getServicesRequested().getJsonMember516().isEmpty()) {
                    qf3Var.a(new sf3("Replacement of DL"));
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            try {
                if (!resultItemSubmit.getServicesRequested().getJsonMember523().isEmpty()) {
                    qf3Var.a(new sf3("DL Extract"));
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            try {
                if (!resultItemSubmit.getServicesRequested().getJsonMember525().isEmpty()) {
                    qf3Var.a(new sf3("International Driving Permit"));
                }
            } catch (Exception e6) {
                e6.printStackTrace();
            }
            try {
                if (!resultItemSubmit.getServicesRequested().getJsonMember537().isEmpty()) {
                    qf3Var.a(new sf3("RE-VALIDATION OF EXPIRED DL"));
                }
            } catch (Exception e7) {
                e7.printStackTrace();
            }
            try {
                if (!resultItemSubmit.getServicesRequested().getJsonMember548().isEmpty()) {
                    qf3Var.a(new sf3("Change of Date of Birth in DL"));
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            try {
                if (!resultItemSubmit.getServicesRequested().getJsonMember524().isEmpty()) {
                    qf3Var.a(new sf3("Endorsement to Drive in Hill Region"));
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
            try {
                if (!resultItemSubmit.getServicesRequested().getJsonMember526().isEmpty()) {
                    qf3Var.a(new sf3("Change of Name in DL"));
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            qf3 qf3Var2 = new qf3();
            qf3Var2.i("");
            sf3 sf3Var = new sf3(resultItemSubmit.getDocumentaryProofsRequired());
            sf3 sf3Var2 = new sf3("   ");
            qf3Var2.a(sf3Var);
            qf3Var2.a(sf3Var2);
            tp4 tp4Var = new tp4();
            tp4Var.M(qf3Var);
            p40 p40Var = p40.f;
            tp4Var.G(p40Var);
            tp4Var.F(i);
            tp4Var.q0(5.0f);
            tp4Var.o0(1);
            tp4Var.u0(1);
            tp4 tp4Var2 = new tp4();
            tp4Var2.M(qf3Var2);
            tp4Var2.G(p40Var);
            tp4Var2.F(i);
            tp4Var2.q0(8.0f);
            tp4Var2.l0(3);
            tp4Var2.o0(1);
            tp4Var2.u0(1);
            wp4Var2.a(tp4Var);
            wp4Var2.a(tp4Var2);
            tp4 tp4Var3 = new tp4(wp4Var2);
            tp4Var3.G(p40Var);
            tp4Var3.F(0);
            tp4Var3.o0(1);
            tp4Var3.u0(1);
            wp4Var.a(tp4Var3);
            return wp4Var;
        } catch (cu1 e11) {
            e11.printStackTrace();
            return null;
        } catch (Exception e12) {
            e12.printStackTrace();
            return null;
        }
    }

    public static wp4 f(ResultItemSubmit resultItemSubmit, String str, String str2, String str3, String str4, zd2 zd2Var, boolean z) {
        sf3 sf3Var;
        sf3 sf3Var2;
        sf3 sf3Var3;
        try {
            wp4 wp4Var = new wp4(1);
            wp4Var.W(100.0f);
            wp4Var.U(1.0f);
            wp4Var.S(1.0f);
            wp4 wp4Var2 = new wp4(4);
            wp4Var2.W(100.0f);
            wp4Var2.U(1.0f);
            wp4Var2.S(1.0f);
            int i = z ? 15 : 0;
            wp4Var2.X(new float[]{1.0f, 1.0f, 1.0f, 1.0f});
            qf3 qf3Var = new qf3();
            qf3Var.i("");
            sf3 sf3Var4 = new sf3("Application No :");
            sf3 sf3Var5 = new sf3("Application Date :");
            sf3 sf3Var6 = new sf3("Blood Group :");
            sf3 sf3Var7 = new sf3("Gender :");
            sf3 sf3Var8 = new sf3("TR Validity :");
            sf3 sf3Var9 = new sf3("DL COVs:");
            qf3Var.a(sf3Var4);
            qf3Var.a(sf3Var5);
            qf3Var.a(sf3Var6);
            qf3Var.a(sf3Var7);
            qf3Var.a(sf3Var8);
            qf3Var.a(sf3Var9);
            qf3 qf3Var2 = new qf3();
            qf3Var2.i("");
            sf3 sf3Var10 = new sf3(resultItemSubmit.getApplicationNo());
            sf3 sf3Var11 = resultItemSubmit.getApplicationDate().isEmpty() ? new sf3(bk4.b()) : new sf3(resultItemSubmit.getApplicationDate());
            sf3 sf3Var12 = resultItemSubmit.getBloodGroup().isEmpty() ? new sf3("NA") : new sf3(resultItemSubmit.getBloodGroup());
            sf3 sf3Var13 = resultItemSubmit.getApplicantGender().isEmpty() ? new sf3("NA") : new sf3(resultItemSubmit.getApplicantGender());
            if (resultItemSubmit.getTRValidities().isEmpty()) {
                sf3Var = new sf3("NA");
            } else {
                String[] strArrSplit = resultItemSubmit.getTRValidities().split("to");
                sf3Var = strArrSplit.length >= 2 ? new sf3(strArrSplit[1].trim()) : new sf3(resultItemSubmit.getTRValidities());
            }
            sf3 sf3Var14 = resultItemSubmit.getDLCOVNames().isEmpty() ? new sf3("NA") : new sf3(resultItemSubmit.getDLCOVNames());
            qf3Var2.a(sf3Var10);
            qf3Var2.a(sf3Var11);
            qf3Var2.a(sf3Var12);
            qf3Var2.a(sf3Var13);
            qf3Var2.a(sf3Var);
            qf3Var2.a(sf3Var14);
            qf3 qf3Var3 = new qf3();
            qf3Var3.i("");
            sf3 sf3Var15 = new sf3("Name : ");
            sf3 sf3Var16 = new sf3("Date of Birth : ");
            sf3 sf3Var17 = new sf3("Father's Name : ");
            sf3 sf3Var18 = new sf3("DL Number : ");
            sf3 sf3Var19 = new sf3("NT Validity : ");
            qf3Var3.a(sf3Var15);
            qf3Var3.a(sf3Var16);
            qf3Var3.a(sf3Var17);
            qf3Var3.a(sf3Var18);
            qf3Var3.a(sf3Var19);
            qf3 qf3Var4 = new qf3();
            qf3Var4.i("");
            if (resultItemSubmit.getDLCOVNames().isEmpty()) {
                sf3Var2 = new sf3("NA");
            } else {
                String applicantname = resultItemSubmit.getApplicantname();
                Objects.requireNonNull(applicantname);
                if (applicantname.length() > 12) {
                    String[] strArrSplit2 = resultItemSubmit.getApplicantname().split(" ");
                    if (strArrSplit2.length < 2 || strArrSplit2[0].length() + strArrSplit2[1].length() > 12) {
                        sf3Var2 = new sf3(strArrSplit2[0]);
                    } else {
                        sf3Var2 = new sf3(strArrSplit2[0] + " " + strArrSplit2[1]);
                    }
                } else {
                    sf3Var2 = new sf3(resultItemSubmit.getApplicantname());
                }
            }
            sf3 sf3Var20 = resultItemSubmit.getApplicantGender().isEmpty() ? new sf3("NA") : new sf3(st6.k(resultItemSubmit.getDateofBirth(), "yyyy-MM-dd", "dd-MM-yyyy"));
            sf3 sf3Var21 = resultItemSubmit.getApplicantGender().isEmpty() ? new sf3("NA") : new sf3(resultItemSubmit.getFatherName());
            sf3 sf3Var22 = resultItemSubmit.getApplicantGender().isEmpty() ? new sf3("NA") : new sf3(resultItemSubmit.getDlno());
            if (resultItemSubmit.getNTValidities().isEmpty()) {
                sf3Var3 = new sf3("NA");
            } else {
                String[] strArrSplit3 = resultItemSubmit.getNTValidities().split("to");
                sf3Var3 = strArrSplit3.length >= 2 ? new sf3(strArrSplit3[1].trim()) : new sf3(resultItemSubmit.getNTValidities());
            }
            qf3Var4.a(sf3Var2);
            qf3Var4.a(sf3Var20);
            qf3Var4.a(sf3Var21);
            qf3Var4.a(sf3Var22);
            qf3Var4.a(sf3Var3);
            tp4 tp4Var = new tp4();
            tp4Var.M(qf3Var);
            p40 p40Var = p40.f;
            tp4Var.G(p40Var);
            tp4Var.F(i);
            tp4Var.q0(5.0f);
            tp4Var.o0(1);
            tp4Var.u0(1);
            tp4 tp4Var2 = new tp4();
            tp4Var2.M(qf3Var2);
            tp4Var2.G(p40Var);
            tp4Var2.F(i);
            tp4Var2.q0(5.0f);
            tp4Var2.o0(1);
            tp4Var2.u0(1);
            tp4 tp4Var3 = new tp4();
            tp4Var3.M(qf3Var3);
            tp4Var3.G(p40Var);
            tp4Var3.F(i);
            tp4Var3.q0(5.0f);
            tp4Var3.o0(1);
            tp4Var3.u0(1);
            tp4 tp4Var4 = new tp4();
            tp4Var4.M(qf3Var4);
            tp4Var4.G(p40Var);
            tp4Var4.F(i);
            tp4Var4.q0(5.0f);
            tp4Var4.o0(1);
            tp4Var4.u0(1);
            wp4Var2.a(tp4Var);
            wp4Var2.a(tp4Var2);
            wp4Var2.a(tp4Var3);
            wp4Var2.a(tp4Var4);
            tp4 tp4Var5 = new tp4(wp4Var2);
            tp4Var5.G(p40Var);
            tp4Var5.F(15);
            tp4Var5.q0(5.0f);
            tp4Var5.o0(1);
            tp4Var5.u0(1);
            wp4Var.a(tp4Var5);
            return wp4Var;
        } catch (cu1 e) {
            e.printStackTrace();
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static s40 g(String str, String str2, boolean z) {
        try {
            return s40.d(str, str2, z);
        } catch (cu1 e) {
            e.printStackTrace();
            return null;
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static zd2 h(s40 s40Var, float f, int i, p40 p40Var) {
        return new zd2(s40Var, f, i, p40Var);
    }
}
