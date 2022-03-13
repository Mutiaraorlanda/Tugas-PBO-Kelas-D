/*DEKLARASI COLLECTION MAP
NI PUTU MUTIARA ORLANDA HARTAWAN PUTRI
2105551085
KELAS D PEMROGRAMAN BERORIENTASI OBJEK*/

package com.tugas.map;
import java.util.*;

public class deklarasi_map {
    public static void main(String[] args) {
        Map<String, String> kode = new LinkedHashMap<String, String>();

        kode.put("Cuba", "53C");                        //memasukkan data
        kode.put("Indonesia", "62I");
        kode.put("Palau", "680P");
        kode.put("Palau", "680P");                        //data yang duplikat tidak akan ditampikan 2 kali
        kode.put("Romania", "40R");
        kode.put("UAE", "971U");

        System.out.println(kode);                         //menampilkan isi dari variabel 'ekspor'
    }
}
