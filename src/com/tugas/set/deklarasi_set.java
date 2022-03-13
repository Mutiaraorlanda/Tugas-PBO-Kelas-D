/*DEKLARASI COLLECTION SET
NI PUTU MUTIARA ORLANDA HARTAWAN PUTRI
2105551085
KELAS D PEMROGRAMAN BERORIENTASI OBJEK*/

package com.tugas.set;
import java.util.*;

public class deklarasi_set {
    public static void main(String[] args){
        Set<String> kota = new LinkedHashSet<String>(); //isi variabel set ditampilkan berdasarkan perintah user

        //memasukkan data
        kota.add("Jakarta");
        kota.add("Singapura");
        kota.add("Bangkok");
        kota.add("Manila");
        kota.add("Kuala Lumpur");
        kota.add("Hanoi");
        kota.add("Jakarta");                            //set hanya menampilkan sekali data yang duplikat

        kota.remove("Singapura");                    //menghapus/tidak menampilkan nilai variabel "Singapura"

        System.out.println(kota);                       //mencetak isi variabel 'kota'
    }
}
