import java.util.Scanner;
public class Ucapan_20 {
    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan Nama orang yang ingin anda beri ucapan : ");
        String namaOrang = sc.nextLine();
        sc.close();
        System.out.println("Thankyou " + namaOrang + "\nMay the force be with you");
        return namaOrang;
    }
    public static void main(String [] args){
        PenerimaUcapan();
    }
}
