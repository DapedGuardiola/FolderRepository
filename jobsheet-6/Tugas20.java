import java.util.Scanner;
public class Tugas20 {
    public static void main(String[] args){
        Scanner input20 = new Scanner(System.in);
        System.out.println("Masukkan level pengguna");
        String lvlAdmin = input20.nextLine();
        if (lvlAdmin.equalsIgnoreCase("Level1")){
            System.out.println("silahkan pilih buku yang ingin anda pinjam");

        }else if (lvlAdmin.equalsIgnoreCase("Level2")){
            System.out.println("anda dapat mengakses system admin kecuali program super admin");

        }else if (lvlAdmin.equalsIgnoreCase("Level3")){
            System.out.println("anda dapat mengakses keseluruhan system");
        
        }else {
            System.out.println("Level pengguna tidak tersedia, masukkan ulang atau tinggalkan laman");
        }

    }

    
}
