
package tugaspbo;
import java.util.*;
public class Manusia {
    Scanner input = new Scanner (System.in);
    void name(){
        System.out.print("Masukkan \nNama \t= ");
        String Nama = input.next();
    }
    void gender(){
        System.out.print("Gander \t= ");
        String j_gander = input.next();
    }
    protected void agama(){
        System.out.print("Agama \t= ");
        String j_agama = input.next();
    }
}