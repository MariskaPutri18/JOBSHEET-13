
import java.util.Scanner;

public class Kubus  {
    public static int hitungLuas(int s){
        int Luas=6*s*s;
        return Luas;
    }

    public static int hitungVolume (int s ){
        int volume = s*s*s;
        return volume;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int s,L, vol;
        System.out.println("Masukkan sisi");
        s=input.nextInt();
       

        L=hitungLuas(s);
        System.out.println("Luas Permukaan Kubus "+L);
        vol=hitungVolume(s);
        System.out.println("Volume kubus adalah" +vol);
    }
}
