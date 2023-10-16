import java.util.Scanner;
public class pemilihan2percobaan220{
    public static void main(String[] args){
        Scanner input20 = new Scanner(System.in);
        float sudut1,sudut2,sudut3,totalSudut;
        System.out.print("Masukkan sudut pertama :  ");
        sudut1 = input20.nextFloat();
        System.out.print("Masukkan sudut kedua : ");
        sudut2 = input20.nextFloat();
        System.out.print("Masukkan sudut ketiga : ");
        sudut3 = input20.nextFloat();
        totalSudut = (sudut1 + sudut2 + sudut3 );
        if (totalSudut == 180){
            System.out.print ("bangun datar tersebut berbentuk segitiga");
            if (sudut1==90||sudut2==90||sudut3==90){
                System.out.print (" dan Segitiga tersebut adalah segitiga siku-siku ");
            } else if ( sudut1 == sudut2 || sudut1 == sudut3 || sudut2 == sudut3 ){
                System.out.print(" dan Segitiga tersebut adalah segitiga sama kaki");
            } else {
                System.out.println(" dan segitiga tersebut merupakan segitiga sembarang");
        }
            
        } else {
            System.out.print("Bangun datar tersebut bukan merupakan segitiga");
        }
    }
}