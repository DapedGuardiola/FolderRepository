import java.util.Scanner;
public class Gaji20 {
    public static void main(String[] args){
        Scanner input =new Scanner (System.in);
        int jmlMasuk, JmlTdkMasuk, TotGaji, gaji, potGaji;
        System.out.println("Masukkan Jumlah Hari Masuk Kerja: ");
        jmlMasuk=input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk kerja: ");
        JmlTdkMasuk=input.nextInt();
        System.out.println("Masukkan besaran Gaji: ");
        gaji=input.nextInt();
        System.out.println("Masukkan total potongan gaji anda: ");
        potGaji=input.nextInt();
        TotGaji = (jmlMasuk*gaji) - (JmlTdkMasuk*potGaji);
        System.out.println("Total gaji yang anda terima:" + TotGaji);
    } 
}