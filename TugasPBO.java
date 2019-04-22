
package tugaspbo;

import java.util.*;

public class TugasPBO {

    public static void main(String[] args) {
        Scanner pilih = new Scanner(System.in);
        Anak ak = new Anak();
        Cucu ck = new Cucu();
        int pil;
        
        System.out.println("Silsilah Keluarga");
        System.out.println("1. Anak");
        System.out.println("2. Cucu");
        System.out.print("Masukkan pilihan = ");
        pil = pilih.nextInt();
        System.out.println("");
        
        switch (pil){
            case 1 :
                ak.tampil();
                ak.name();
                ak.gender();
                ak.agama();
                System.out.println("--------------------------");
                System.out.println("Data Diri Anak\nNama \t= "+ak.Nama);
                System.out.println("Gander \t= "+ak.j_gander);
                System.out.println("Agama \t= "+ak.j_agama);
                break;
                
            case 2:
                ck.tampil();
                ck.name();
                ck.gender();
                ck.agama();
                System.out.println("--------------------------");
                System.out.println("Data diri Cucu\nNama \t= "+ck.Nama);
                System.out.println("Gander \t= "+ck.j_gander);
                System.out.println("Agama \t= "+ck.j_agama);
                break;
            default:
                System.out.println("Pilihan Tidak Tersedia");
        }
        
    }
    
}
