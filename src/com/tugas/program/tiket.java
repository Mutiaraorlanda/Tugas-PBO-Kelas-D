/*PROGRAM PEMESANAN TIKET
NI PUTU MUTIARA ORLANDA HARTAWAN PUTRI
2105551085
KELAS D PEMROGRAMAN BERORIENTASI OBJEK*/

package com.tugas.program;
import java.util.*;
import java.util.Scanner;

public class tiket {
    public static void main(String[] args){
        System.out.println("LION AIR PASSENGERS's TICKET");
        System.out.println("LOMBOK INTERNATIONAL AIRPORT BASE");
        System.out.println("PLEASE CHOOSE YOUR DESTINATION");
        System.out.println("COVID-19 VERSION\n");

        System.out.println("DOMESTIC DESTINATIONS : ");
        Set<String> domestik = new LinkedHashSet<String>();
        domestik.add("Jakarta");
        domestik.add("Denpasar");
        domestik.add("Yogyakarta");
        domestik.add("Medan");
        domestik.add("Balikpapan");
        domestik.add("Surabaya");
        domestik.add("Jayapura");
        System.out.println(domestik);

        System.out.println("\nINTERNATIONAL DESTINATIONS : ");
        List<String> inter = new LinkedList<String>();
        inter.add("Singapura");
        inter.add("Kuala Lumpur");
        inter.add("Manila");
        inter.add("Bandar Sri Begawan");
        inter.add("Bangkok");
        inter.add("Taipei");
        System.out.println(inter);

        System.out.println("\nDESTINATIONS's CODE : ");
        Map<String, String> kode = new LinkedHashMap<String, String>();
        kode.put("\n, Jakarta", "45\n");
        kode.put("Denpasar", "90\n");
        kode.put("Yogyakarta", "87\n");
        kode.put("Medan", "23\n");
        kode.put("Balikpapan", "43\n");
        kode.put("Surabaya", "66\n");
        kode.put("Jayapura", "99\n");
        kode.put("Singapura", "20\n");
        kode.put("Kuala Lumpur", "13\n");
        kode.put("Manila", "65\n");
        kode.put("Bandar Sri Begawan", "41\n");
        kode.put("Bangkok", "75\n");
        kode.put("Taipei", "81\n");
        System.out.println(kode);

        System.out.println("\n_____________________________");
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NAME : ");
        String nama = sc.nextLine();

        System.out.println("ENTER YOUR DESTINATION's CODE : ");
        int code = sc.nextInt();
        int price = 0;

        if (code == 45){
            price=2500000;
        }else if (code == 90){
            price=700000;
        }else if(code == 87){
            price=1400000;
        }else if(code == 23){
            price=3000000;
        }else if(code == 43){
            price=3200000;
        }else if(code == 66){
            price=590000;
        }else if(code == 99){
            price=750000;
        }else if(code == 20){
            price=4000000;
        }else if(code == 13){
            price=3600000;
        }else if(code == 65){
            price=3400000;
        }else if(code == 41){
            price=3400000;
        }else if(code == 75){
            price=4900000;
        }else if (code == 81){
            price=5500000;
        }else{
            System.out.println("THE CODE YOU ENTERED ISN'T AVAILABLE!");
        }

        System.out.println("ENTER THE NUMBERS OF TICKET : ");
        int jumlah = sc.nextInt();
        int total = price * jumlah ;
        System.out.println("_____________________________");

        System.out.println("\n=============================");
        System.out.println("TICKET BOOKING DETAILS");
        System.out.println("PASSENGER : "+nama);
        System.out.println("QUANTITY  : "+jumlah);
        System.out.println("TOTAL     : "+total);
        System.out.println("THANK YOU FOR TRUSTING LION AIR");
        System.out.println("===============================");
    }
}


