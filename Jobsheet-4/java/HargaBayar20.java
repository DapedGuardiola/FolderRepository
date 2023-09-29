import java.util.Scanner;
public class HargaBayar20{
    public static void main(String[] args){
        Scanner input =new Scanner (System.in);
        int harga, jumlah, jmlHlmnBuku;
        String merkBuku;
        double dis, total, bayar, jmlDis;
        System.out.println("Masukkan judul buku: ");
        merkBuku=input.next();
        System.out.println(" Masukkan jumlah halaman buku ");
        jmlHlmnBuku=input.nextInt();
        System.out.println("Masukkan harga barang yang dibeli ");
        harga=input.nextInt();
        System.out.println("Masukkan jumlah barang yang sudah di beli");
        jumlah=input.nextInt();
        System.out.println(" masukkan nilai diskon ");
        dis=input.nextDouble();
        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;
        System.out.println("Diskon yang anda dapatkan sebesar "+jmlDis);
        System.out.println("Jumlah yang harus anda bayar adalah "+bayar);

    }
}