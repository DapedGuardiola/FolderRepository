import java.util.Scanner;
public class ArrayRataNilai20 {
    public static void main(String [] args){
        Scanner inputNIlai20 = new Scanner(System.in);
        Scanner inputJmlMhs20= new Scanner (System.in);
        double total = 0,rataTotal, rataLulus,rataTdkLulus,nilaiTdkLulus = 0, nilaiLulus=0;
        int jumlahMhs;
        int lulusCount=0, tdkLulusCount=0;
        
        
        System.out.println("masukkan jumlah mahasiswa yang mengikuti ujian : ");
        jumlahMhs = inputJmlMhs20.nextInt();
        int arrayNilaiMhs [] = new int [jumlahMhs];
        for (int i = 0 ; i < arrayNilaiMhs.length ; i++){
            System.out.println("masukkan nilai maha siswa ke-" + i +" :");
            arrayNilaiMhs[i] = inputNIlai20.nextInt();
        } 
        for (int i = 0 ; i < arrayNilaiMhs.length ; i ++){
            total += arrayNilaiMhs[i];
        }
        for (int i = 0 ; i < arrayNilaiMhs.length ; i++){
        if (arrayNilaiMhs[i] > 70){
            System.out.println("Mahasiswa ke-" +i+ " dinyatakan lulus!");
            lulusCount++;
            nilaiLulus+=arrayNilaiMhs[i];
        }
        }for (int i = 0 ; i < arrayNilaiMhs.length ; i++){
        if (arrayNilaiMhs[i] <= 70){
            System.out.println("Mahasiswa ke-" +i+ " dinyatakan lulus!");
            tdkLulusCount++;
            nilaiTdkLulus+=arrayNilaiMhs[i];
        }
        }
        rataLulus=nilaiLulus/lulusCount;
        rataTotal = total/arrayNilaiMhs.length;
        rataTdkLulus = nilaiTdkLulus/tdkLulusCount;
        System.out.println("rata-rata nilai mahasiswa lulus = "+rataLulus);
        System.out.println("rata-rata nilai mahasiswa tidak lulus = " + rataTdkLulus);
        System.out.println("rata-rata nilai keseluruhan = " +rataTotal);        
    }
}
