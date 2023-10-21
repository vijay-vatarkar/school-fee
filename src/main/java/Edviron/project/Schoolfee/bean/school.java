package Edviron.project.Schoolfee.bean;

public class school {
    private int Sc_id;
    private String Sc_name;
    private String address;
    private  int contact;

    public school(int sc_id, String sc_name, String address, int contact) {
        Sc_id = sc_id;
        Sc_name = sc_name;
        this.address = address;
        this.contact = contact;
    }

    public int getSc_id() {
        return Sc_id;
    }

    public void setSc_id(int sc_id) {
        Sc_id = sc_id;
    }

    public String getSc_name() {
        return Sc_name;
    }

    public void setSc_name(String sc_name) {
        Sc_name = sc_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }
}
