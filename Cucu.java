
package tugaspbo;

public class Cucu extends Manusia{
    String Nama,j_gander,j_agama;
    void tampil(){
        System.out.println("Cucu");
    }
    @Override
    void name(){
        System.out.print("Masukkan \nNama \t= ");
        Nama = input.next();
    }
    @Override
    void gender(){
        System.out.print("Gander \t= ");
        j_gander = input.next();
    }
    @Override
    protected void agama(){
        System.out.print("Agama \t= ");
         j_agama = input.next();
    }
}
