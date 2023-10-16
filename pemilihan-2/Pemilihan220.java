import java.util.Scanner;

public class Pemilihan220{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double jmlDiskon1 = 0.1;
        int jmlBuku;
        String jenisBuku;
        System.out.println("Masukkan Jenis buku :" );
        jenisBuku = input.next();
        
        if (jenisBuku.equalsIgnoreCase("kamus")){
            System.out.println("masukkan jumlah buku yang di beli");
            jmlBuku = input.nextInt();
            if(jmlBuku > 2){
                System.out.println("mendapatkan diskon 2%");
            // }else{
            //     System.out.println("tidak mendapatkan diskon tambahan");
            }
        }else if(jenisBuku.equalsIgnoreCase("novel")){
           System.out.println("masukkan jumlah buku yang di beli");
            jmlBuku = input.nextInt();
            if(jmlBuku > 3){
                System.out.println("mendapatkan diskon 7% dengan tambahan 2%");
            // }else{
            //     System.out.println("tidak mendapatkan diskon tambahan");
            } else 
                System.out.println("diskon yang anda dapatkan sebesar7% ");
            
            }

        }
    } 
