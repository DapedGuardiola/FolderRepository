import java.util.Scanner;
public class ForKelipatan20{
    public static void main(String[] args){;
        int kelipatan,counter=0, jumlah=0;
        float rata=0;
        Scanner scan= new Scanner(System.in);
        System.out.println("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = scan.nextInt();
        for (int i =1 ; i<=50 ;  i++) {
            if (i %kelipatan == 0){
                jumlah += i;
                counter++;
                rata = (float) jumlah/counter;   
            }
        }
        System.out.printf("banyaknya bilangan dari %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
                System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
                System.out.printf("rata rata dari biangan kelipatan %d dari 1 sampai 50 adalah %.2f\n", kelipatan , rata);
    }
}