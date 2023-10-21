package Edviron.project.Schoolfee.bean;

public class student {
    private int id;
    private String name;
    private int Sc_id;
    private  int contact;
    private  int frq_month;
    private int installment_amount;
    private  String start_date;
    private  String due_date;
    private int defaulter;


    public student(int id, String name, int sc_id, int contact, int frq_month, int installment_amount, String start_date, String due_date, int defaulter) {
        this.id = id;
        this.name = name;
        Sc_id = sc_id;
        this.contact = contact;
        this.frq_month = frq_month;
        this.installment_amount = installment_amount;
        this.start_date = start_date;
        this.due_date = due_date;
        this.defaulter = defaulter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSc_id() {
        return Sc_id;
    }

    public void setSc_id(int sc_id) {
        Sc_id = sc_id;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public int getFrq_month() {
        return frq_month;
    }

    public void setFrq_month(int frq_month) {
        this.frq_month = frq_month;
    }

    public int getInstallment_amount() {
        return installment_amount;
    }

    public void setInstallment_amount(int installment_amount) {
        this.installment_amount = installment_amount;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getDue_date() {
        return due_date;
    }

    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }

    public int getDefaulter() {
        return defaulter;
    }

    public void setDefaulter(int defaulter) {
        this.defaulter = defaulter;
    }
}
