import java.util.Scanner;
public class UcapanTerimakasih_20 {
    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan nama orang yang ingin anda kirim pesan : ");
        String namaOrang = sc.nextLine();        
        sc.close();
        return namaOrang;
    }
    public static void UcapanTerimakasih(){
        String nama = PenerimaUcapan();
        System.out.println("Thankyou "+nama+" For being the best teacher in the world.\n"+"You inspired in me a love for learning and made me feel like i could ask you anything.");
    }
    public static void UcapanTambahan(String p){
        System.out.println(p);
    }
    public static void main (String [] args){
        UcapanTerimakasih();
        String ucapanYangDitambahkan = "from your student, David";
        UcapanTambahan(ucapanYangDitambahkan);
    }
}
