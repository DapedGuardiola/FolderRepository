import java.util.Scanner;
public class Percobaan2 {
    public static int hitungPangkat(int x,int y){
        if(y==0){
            return(1);
        }else {
            return(x*hitungPangkat(x, y-1));        
        }
    }
    public static void prosesHitung(int x, int y){
        for (int i=y;i>=0;i--){
            if(i==0){
                x=1;
                System.out.print((x)+"=");
            }else{
            System.out.print(x+"x");
            }
        }
    }
    public static void main(String []args){
        int bilangan,pangkat;
        Scanner sc= new Scanner(System.in);
        System.out.println("Masukkan bilangan yang ingin anda hitung");
        bilangan = sc.nextInt();
        System.out.println("Masukkan pangkat : ");
        pangkat = sc.nextInt();
        prosesHitung(bilangan, pangkat);
        System.out.println(hitungPangkat(bilangan, pangkat));    
    }
}
