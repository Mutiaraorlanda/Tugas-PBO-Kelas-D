package OOP.java.inheritance;
import java.util.Scanner;

public class utama {
    public static void main(String[] args){
        String kode;
        String jam;
        int harga = 35000;
        Scanner sc = new Scanner (System.in);

        tiket_bioskop user = new tiket_bioskop();
        System.out.println("PEMESANAN TIKET BIOSKOP JIMBARAN");
        System.out.println("MASUKKAN NAMA ANDA : ");
        String nama = sc.next();

        user.setNama (nama);

        System.out.println("PILIHAN FILM : ");
        System.out.println("1. Jujutsu Kaisen 0");
        System.out.println("2. Kukira Kau Rumah");
        System.out.println("3. Thor Ragnarok");

        System.out.println("MASUKKAN PILIHAN ANDA : ");
        int p = sc.nextInt();

        if (p==1){
            kode= String.valueOf(12);
        }else if (p==2)
            kode = String.valueOf(13);
        else{
            kode= String.valueOf(14);
        }

        System.out.println("PILIHAN JAM : ");
        System.out.println("1. 12.00");
        System.out.println("2. 15.00");
        System.out.println("3. 19.00");
        System.out.println("MASUKKAN PILIHAN ANDA : ");
        int m = sc.nextInt();

        if (m==1){
            jam="12.00";
        }else if (m==2){
            jam="15.00";
        }else{
            jam="19.00";
        }

        user.setkode(Integer.parseInt(kode));
        user.setjam(jam);
        user.setharga(harga);

        System.out.println("\nDETAIL PEMESANAN TIKET BIOSKOP");
        System.out.println("-------------------------------");
        System.out.println("NAMA PELANGGAN : "+user.getNama());
        System.out.println("KODE FILM      : "+user.getkode());
        System.out.println("JAM TAYANG     : "+user.getjam());
        System.out.println("HARGA TIKET    : "+user.getharga());
        System.out.println("-------------------------------");
        System.out.println("          TERIMA KASIH         ");
    }
}
