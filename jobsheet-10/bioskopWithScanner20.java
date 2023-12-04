import java.util.Scanner;
public class bioskopWithScanner20 {
    public static void main(String [] args){
    Scanner inputHuruf = new Scanner(System.in);
    Scanner inputAngka = new Scanner(System.in);
    String nama,chose;
    int baris , kolom, pilihan;
    String[][]penonton = new String[4][2];
    do{
    System.out.println("        pilihan menu        ");
    System.out.println("   1. Input data Penonton   ");
    System.out.println(" 2. Tampilkan data penonton ");
    System.out.println("           3. Exit          ");
    pilihan=inputAngka.nextInt();
    if (pilihan == 1){
        System.out.println("========================================");
        System.out.println("   Anda berada di menu input penonton   ");
        System.out.println("    Silahkan masukkan data penonton     ");
        System.out.println("========================================");
    
    for (int i =0 ; i < penonton.length;){
        System.out.print("Masukkan nama penonton : ");
        nama = inputHuruf.nextLine();
        System.out.print("Masukkan baris : ");
        baris = inputAngka.nextInt();
        System.out.print("Masukkan kolom : ");
        kolom = inputAngka.nextInt();
        penonton [baris-1][kolom-1] = nama;
        System.out.println("Input penonton lainnya ? (y/n) ");
        chose = inputHuruf.nextLine();

        if (chose.equalsIgnoreCase("y")){
            i++;
        }else if(chose.equalsIgnoreCase("n")){
            break;
        }else {
            System.out.println("menu yang anda masukkan salah, mohon masukkan ulang");
            break;
        } 

    }
    } else if (pilihan == 2){
        System.out.println("=============================================");
        System.out.println("Anda berada di menu tampilan data penonton");
        System.out.println("Berikut daftar penonton di ...");
        System.out.println("=============================================");
    if (penonton==null){
        System.out.println("Kursi kosong");
        System.out.println(System.out.println(penonton[0][0]));
        System.out.println(penonton[0][1]);
        System.out.println(penonton[1][0]);
        System.out.println(penonton[1][1]);
        System.out.println(penonton[2][0]);
        System.out.println(penonton[2][1]);
        System.out.println(penonton[3][0]);
        System.out.println(penonton[3][1]);   
    }
    

    }else if (pilihan == 3){
        break;
    } else {
        System.out.println("pilihan anda salah, masukkan ulang lagi");
    }

}while(true);

    
}
}
