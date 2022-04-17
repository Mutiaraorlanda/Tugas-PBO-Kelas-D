package OOP.java.inheritance;

/*class mobil {
    public mobil(){
        System.out.println("Class Mobil");
    }

    public void tipe (){
        System.out.println("Tipe Kendaraan : Mobil");
    }
}

class honda extends mobil {
    public honda(){
        System.out.println("Class Honda");
    }
    public void brand() {
        System.out.println("Brand/Merek Mobil : Honda");
    }
    public void kecepatan_maks(){
        System.out.println("Kecepatan Maks Honda : 240 Kmph");
    }
}

class hrv extends honda {
    public hrv(){
        System.out.println("Jenis Honda : HONDA HRV");
    }
    public void asal(){
        System.out.println("Asal HONDA HRV : Jepang");
    }
    public void kecepatan (){
        System.out.println("Kecepatan Maks HONDA HRV : 240 Kmph");
    }
    public void (){

    }
}*/


public class pewarisan  {
    protected String pelanggannama;

    public String getNama (){
        return this.pelanggannama;
    }

    public void setNama (String x){
        this.pelanggannama = x;
    }
}

