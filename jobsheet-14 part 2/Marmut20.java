public class Marmut20 {
    public static int hitungMarmut(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return hitungMarmut(n - 1) + hitungMarmut(n - 2);
        }
    }

    public static void main(String[] args) {
        int bulan = 12;
        System.out.println("Pada akhir bulan ke-" + bulan + ", jumlah pasangan marmut adalah: " + hitungMarmut(bulan));
    }
}

