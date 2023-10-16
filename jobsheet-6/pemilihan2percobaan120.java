import java.util.Scanner;
public class pemilihan2percobaan120{
    public static void main(String[] args){
        Scanner input20 = new Scanner(System.in);
        System.out.println("Masukkan Tahun :");
        int tahun = input20.nextInt();
        if (tahun %4==0){
            if (tahun %100== 0){
                if (tahun %400 == 0){
                    System.out.println("sekarang tahun kabisat");
                }else {
                    System.out.println("Sekarang bukan tahun kabisat ");
                }
                }else {
                    System.out.println("sekarang tahun kabisat");
                } 
            } else {
                System.out.println("sekarang bukan tahun kabisat");
            }
        } 
    }