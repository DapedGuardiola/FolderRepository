import java.util.Scanner;
public class WhileGaji20{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        int jmlKariawan, jmlJamLembur, i=0;
        double gajiLembur=0,totGajiLembur=0;
        String jabatan;
        System.out.println("masukkan jumlah kariawan :");
        jmlKariawan = scan1.nextInt();
        while (true && i < jmlKariawan ){
        System.out.println("pilih jabatan -  Direktur, Manager, Kariawan");
        System.out.print("masukkan jabatan kariawan ke -" + (i+1) + ": ");
        jabatan = scan.nextLine();
        System.out.print("Masukkan jumlah jam lembur - ");
        jmlJamLembur = scan1.nextInt();
        i++;
        if (jabatan.equalsIgnoreCase("Direktur")){
            continue; 
        } else if (jabatan.equalsIgnoreCase("Manager")){
            gajiLembur = jmlJamLembur*100000;
        } else if (jabatan.equalsIgnoreCase("Kariawan")){
            gajiLembur = jmlJamLembur*75000;
        }else {
            System.out.println("Jabatan invalid");
            i-=1;
        }
        totGajiLembur += gajiLembur;
        }
        System.out.print("Total gaji lembur adalah -" + totGajiLembur);
    }
}