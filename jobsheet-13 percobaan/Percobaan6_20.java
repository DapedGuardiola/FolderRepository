import java.util.Scanner;
public class Percobaan6_20 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int p,l,t,L,vol;
        System.out.println("Masukkan panjang : ");
        p = sc.nextInt();
        System.out.println("Masukkan lebar : ");
        l = sc.nextInt();
        System.out.println("Masukkan tinggi : ");
        t = sc.nextInt();

        L=hitungLuas(p,l);
        System.out.println("Luas persegi panjang adalah " +L);
        
        vol = hitungVolume(p,l,t);
        System.out.println("Volume balok adalah "+vol);
    }
    public static int hitungLuas(int pjg, int lbr){
        int Luas = pjg*lbr;
        return Luas;
    }
    public static int hitungVolume(int pjg,int lbr,int tinggi){
        int Volume = pjg *lbr*tinggi;
        return Volume;
    }
}
