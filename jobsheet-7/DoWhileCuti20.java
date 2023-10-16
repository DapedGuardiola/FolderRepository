import java.util.Scanner;
public class DoWhileCuti20 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int jatahCuti,jmlHari;
        String pilihan;
        System.out.println("masukkan jatah cuti");
        jatahCuti = scan.nextInt();
        do{
            System.out.println("apakah anda ingin mengambil cuti (y/t)");
            pilihan = scan.next();
            if (pilihan.equalsIgnoreCase("y")){
                System.out.print("masukkan jumlah hari cuti : ");
                jmlHari = scan.nextInt();
                jatahCuti -= jmlHari;
                System.out.println("sisa jatah cuti anda adalah "+ jatahCuti);

        }
    }while (true);
}
}
