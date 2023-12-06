import java.util.Scanner;
public class PenjumlahanRekursif{
    public static int Penjumlahan(int n){
if (n<=0){
    return(0);
}else {
    return(n+Penjumlahan(n-1));
}
}    public static void main(String [] args){
        int angka;
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nilai yang ingin dijumlahkan ");
        angka = sc.nextInt();
        System.out.println("hasil"+Penjumlahan(angka));
    }
}