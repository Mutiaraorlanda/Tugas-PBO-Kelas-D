/*DEKLARASI COLLECTION LIST
NI PUTU MUTIARA ORLANDA HARTAWAN PUTRI
2105551085
KELAS D PEMROGRAMAN BERORIENTASI OBJEK*/

package com.tugas.list;
import java.util.*;

public class deklarasi_list {
    public static void main(String[] args){
        List<String> password = new ArrayList<String>(); //isi variabel list ditampilkan berdasarkan perintah user

        password.add("00956");                           //memasukkan data
        password.add("78134");
        password.add("01456");
        password.add(1,"45894");
        password.add("78134");                          //data yang duplikat akan ditampilkan semua

        System.out.println(password.get(3));            //mencetak indeks ke-3
    }
}
