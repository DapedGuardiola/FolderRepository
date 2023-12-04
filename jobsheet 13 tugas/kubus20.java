import java.util.Scanner;
public class kubus20{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int sisi, vol, lP;
        System.out.println("Masukkan sisi kubus : ");
        sisi = sc.nextInt();
        vol = hitungVolume(sisi);
        System.out.println("Volume kubus adalah "+vol+"m^3");
        lP = hitungLuasPer(sisi);
        System.out.println("Luas Permukaan kubus adalah "+lP+"cm^2");
    }
    public static int hitungVolume(int s){
        int Volume = (s*s*s);
        return Volume;
    }
    public static int hitungLuasPer(int s){
        int luasPer = (6*(s*s));
        return luasPer;
    }
    
}