import java.util.Scanner;

class Inputan {
    public static void inputan(){
        int data, Total2 ;
        double Total;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah data : ");
        data = input.nextInt();

        String[] kota = new String[data];
        String[] limbah = new String[data];
        String[] air = new String[data];
        String[] udara = new String[data];
        String[] Total3 = new String[data];

        for( int i = 0; i < data; i++ ){
            System.out.print("\nMasukkan Nama Kota : ");
            kota[i] = input.next();
            System.out.print("Masukkan skor limbah : ");
            limbah[i] = input.next();
            System.out.print("Masukkan skor polusi air : ");
            air[i] = input.next();
            System.out.print("Masukkan skor polusi udara : ");
            udara[i] = input.next();
        }

        for( int i = 0; i < data; i++ ){
            int Limbah = Integer.parseInt(limbah[i]);
            double hasil1 =  0.4 * Limbah;
            int Air = Integer.parseInt(air[i]);
            double hasil2 = 0.3 * Air;
            int Udara = Integer.parseInt(udara[i]);
            double hasil3 = 0.3 * Udara;

            Total = hasil1 + hasil2 + hasil3;
            Total2 = (int) Math.round(Total);
            Total3[i] = String.valueOf(Total2);
        }

        System.out.println("\nNama Kota\t\t\tLimbah (40%)\t\tPolusi Air (30%)\t\tPolusi Udara (30%)\t\tFinal Skor\t\tTercemar ?");
        for( int i = 0; i < data; i++ ){
            System.out.print(kota[i]+"\t\t\t\t"+limbah[i]+"\t\t\t\t\t"+air[i]+"\t\t\t\t\t\t"+udara[i]+"\t\t\t\t\t\t"+Total3[i]);

            int Tercemar = Integer.parseInt(Total3[i]);
            if (Tercemar > 50){
                System.out.println("\t\t\t\tYa");
            }else if (Tercemar < 50){
                System.out.println("\t\t\t\tTidak");
            }
        }
    }
}

public class Tugas2{
    public static void main(String[] args) {
        Inputan.inputan();
    }
}