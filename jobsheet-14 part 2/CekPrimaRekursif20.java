import java.util.Scanner;
public class CekPrimaRekursif20 {
    static int prima;
    public static int PrimaRekursif(int n){
        if(n>0){
            return(n + PrimaRekursif(n-1));
        } else{
        return(0);
        }
    }
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("masukkna banyak nilai yang ingin dijumlahkan :");
        int n = sc.nextInt();
        System.out.println("hasil : " + PrimaRekursif(n));
    }
}
