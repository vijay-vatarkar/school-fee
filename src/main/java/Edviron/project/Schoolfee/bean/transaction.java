package Edviron.project.Schoolfee.bean;

public class transaction {
    private int id;
    private String paid;
    private int  amount;
    private  String date;

    public transaction(int id, String paid, int amount, String date) {
        this.id = id;
        this.paid = paid;
        this.amount = amount;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
