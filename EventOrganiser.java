package tugas;

import java.util.ArrayList;

public class EventOrganiser {
    private String CUSTID;

    public String getCUSTID() {
        return CUSTID;
    }

    public void setCUSTID(String CUSTID) {
        this.CUSTID = CUSTID;
    }

    public String getCUSTNAME() {
        return CUSTNAME;
    }

    public void setCUSTNAME(String CUSTNAME) {
        this.CUSTNAME = CUSTNAME;
    }

    public String getCUSTADDR() {
        return CUSTADDR;
    }

    public void setCUSTADDR(String CUSTADDR) {
        this.CUSTADDR = CUSTADDR;
    }

    public String getCUSTEMAIL() {
        return CUSTEMAIL;
    }

    public void setCUSTEMAIL(String CUSTEMAIL) {
        this.CUSTEMAIL = CUSTEMAIL;
    }

    public String getCUSTPHONE() {
        return CUSTPHONE;
    }

    public void setCUSTPHONE(String CUSTPHONE) {
        this.CUSTPHONE = CUSTPHONE;
    }

    private String CUSTNAME;
    private String CUSTADDR;
    private String CUSTEMAIL;
    private String CUSTPHONE;

    public void PrintGuests(ArrayList<EventOrganiser> pengunjung) {
        System.out.println("ID : " + this.getCUSTID());
        System.out.println("NAMA : " + this.getCUSTNAME());
        System.out.println("ADDR : " + this.getCUSTADDR());
        System.out.println("EMAIL : " + this.getCUSTEMAIL());
        System.out.println("PHONE : " + this.getCUSTPHONE());
    }

    public EventOrganiser() {
    }

    public EventOrganiser(String ID, String NAMA, String ADDR, String EMAIL, String PHONE) {
        this.CUSTID = ID;
        this.CUSTNAME = NAMA;
        this.CUSTADDR = ADDR;
        this.CUSTEMAIL = EMAIL;
        this.CUSTPHONE = PHONE;
    }

}
