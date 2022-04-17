package OOP.java.inheritance;

public class tiket_bioskop extends pewarisan {
    private int kode;
    private int harga;
    private String jam;

    public int getkode (){
        return this.kode;
    }
    public void setkode (int kde){
        this.kode = kde;
    }

    public int getharga (){
        return this.harga;
    }

    public void setharga (int har){
        this.harga = har;
    }

    public String getjam(){
        return this.jam;
    }

    public void setjam (String jm){
        this.jam = jm;
    }
}
