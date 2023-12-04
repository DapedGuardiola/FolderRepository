import java.util.Scanner;
public class nilaiMahasiswa20 {
    static String namaMahasiswa, nilai;
    static Scanner scHuruf= new Scanner(System.in);
    static Scanner scAngka= new Scanner(System.in);
    static int jmlSiswa,jmlMinggu;
    static String arrayNilai[][];
    static String mahasiswaTertinggi;
    public static void main(String[] args){
        System.out.println("Masukkan jumlah siswa :");
        jmlSiswa=scAngka.nextInt();
        System.out.println("Masukkan jumlah minggu :");
        jmlMinggu=scAngka.nextInt();
        arrayNilai= new String[jmlSiswa][jmlMinggu+1];
        //input data
        inputDataNilai();
        //tampil data
        tampilDataNilai(); 
        //cari nilai tertinggi
        int mingguTertinggi = CariMingguTertinggi();
        System.out.println("Nilai tertinggi didapatkan pada minggu ke-"+mingguTertinggi);
        SiswaTertinggi();
    }
    public static void inputDataNilai(){
        for(int i=0; i<arrayNilai.length;i++){
            System.out.println("Masukkan nama mahasiswa ke-"+(i+1));
            namaMahasiswa=scHuruf.nextLine();
            arrayNilai[i][0]=namaMahasiswa;
            for(int j=1;j<arrayNilai[0].length;j++){ 
            System.out.println("Masukkan nilai mahasiswa ke-"+(i+1)+" minggu ke-"+j);
            nilai=scHuruf.nextLine();
            arrayNilai[i][j]=nilai;
            }
        }
    }
    public static void tampilDataNilai(){
        for(int i =0;i<arrayNilai.length;i++){
            
            System.out.println("Nama mahasiswa ke-"+(i+1)+": "+ arrayNilai[i][0]);
            for(int j =1 ; j<arrayNilai[0].length;j++){
                System.out.println("nilai minggu ke-"+(j)+"adalah "+arrayNilai[i][j]);
            }
        }
    }
    public static int CariMingguTertinggi(){
        int mingguKe = 1;
        int nilaiTertinggi=0;
        for (int i = 0;i<arrayNilai.length;i++){
            for (int j=1 ; j<arrayNilai[0].length;j++){
                int nilaiSiswa= Integer.parseInt(arrayNilai[i][j]);
                if (nilaiSiswa>nilaiTertinggi){
                    nilaiTertinggi=nilaiSiswa;
                    mingguKe=j;
                }
                
            }
        }
        return mingguKe;
    }
    public static int SiswaTertinggi(){
        int siswaTertinggi=0;
        int nilaiTertinggi=0;
        int mingguKe=1;
        for (int i=0;i<arrayNilai.length;i++){
            for (int j=1;j<arrayNilai[0].length;j++){
                int nilaiSiswa=Integer.parseInt(arrayNilai[i][j]);
                if (nilaiSiswa>nilaiTertinggi){
                    nilaiTertinggi=nilaiSiswa;
                    mingguKe=j;
                    siswaTertinggi = i;
                }
            }
             mahasiswaTertinggi= arrayNilai[siswaTertinggi][0]; 
        }
        System.out.println("nilai Tertinggi diraih oleh Mahasiswa bernama "+mahasiswaTertinggi+" pada minggu ke-"+mingguKe);
        return siswaTertinggi;
    }
}
