import java.util.Scanner;
public class percobaan3 {
    public static double hitungLaba(int saldo,int tahun){
        if (tahun==0){
            return(saldo);
        }else {
            return (1.11 * hitungLaba(saldo,tahun-1));
        }
    }
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int saldoAwal,tahun;
    System.out.println("Masukkan saldo awal : ");
    saldoAwal = sc.nextInt();
    System.out.println("Lamanya investasi (Tahun) : ");
    tahun = sc.nextInt();
    System.out.println("Jumlah saldo setelah "+tahun+" tahun : ");
    System.out.print(hitungLaba(saldoAwal, tahun));
    }
}
