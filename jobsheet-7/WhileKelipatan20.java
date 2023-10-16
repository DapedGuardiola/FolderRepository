import java.util.Scanner;
public class WhileKelipatan20 {
    public static void main(String[] args){
        int kelipatan,jumlah=0,counter=0, i=0;
        Scanner scan = new Scanner (System.in);
        System.out.println("masukkan bilangan kelipatan (1-9)");
        kelipatan = scan.nextInt();
        while (i<=50){
        if (i % kelipatan ==0){
            jumlah+=i;
            counter++;
        }
        i++;
        }
                System.out.printf("banyaknya bilangan dari kelipatan %d dari 1 sampai 50 adalah %d\n",kelipatan, jumlah);
                System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
    }
}
