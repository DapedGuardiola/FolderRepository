import java.util.Scanner;
public class ArraySearch20 {
    public static void main(String [] args){
        Scanner inputLength = new Scanner(System.in);
        Scanner inputAngka = new Scanner(System.in);
        Scanner inputKunci = new Scanner(System.in);
        int key ,hasil = 0,nilaiHasil = 0,jumlahElemenArray, nilaiArray;
        System.out.println("Masukkan jumlah elemen array ");
        jumlahElemenArray = inputLength.nextInt();
        int array20 [] = new int [jumlahElemenArray];

        for (int i = 0; i<array20.length ; i++){
            System.out.println("Masukkan angka pada index ke-" +(i+1)+" :");
            nilaiArray = inputAngka.nextInt();
            array20[i] = nilaiArray;
        }
        System.out.println("Masukkan Kunci index yang ingin di cari");
        key =  inputKunci.nextInt();

        for (int i = 0 ; i < array20.length ; i++){
            if (array20[i]==key){
                hasil = i;
                nilaiHasil = array20[i];
                break;
            }
        } 
        System.out.println("Key terdapat pada index ke-" + hasil);
        System.out.println("Key memuat nilai "+ nilaiHasil);
    }
}
