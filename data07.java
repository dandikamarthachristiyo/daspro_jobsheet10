import java.util.Scanner;

public class data07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilai;
        int totalRespon, totalPertanyaan, totalSeluruh;
        double rataRespon, rataPertanyaan, rataSeluruh;
        int [][] data = new int[6][10];
        
        
        System.out.println("===================================");
        System.out.println("=========SURVEI PELANGGAN=========:");
        System.out.println("===================================");

        for (int i = 0; i < data.length; i++) {
            System.out.println("Pertanyaan ke-" + (i+1) + " :");
            for (int j = 0; j < data[i].length; j++) {
                while (true) {
                    System.out.print("Responden ke-" + (j+1) + " isi nilai(1-5): ");
                    nilai = sc.nextInt();
                    if (nilai >= 1 && nilai <= 5) {
                        data[i][j] = nilai;
                        break;
                    } else {
                        System.out.println("Nilai hanya terdiri 1 - 5!");
                    }
                }
            }
        }

        System.out.println("_________________________________");
        System.out.println("\nRata-rata setiap responden: ");
        for (int j = 0; j < data[0].length; j++) {
            totalRespon = 0;
            for (int i = 0; i < data.length; i++) {
                totalRespon += data[i][j];
            }
            rataRespon = totalRespon /  data.length;
            System.out.println("Responden ke-" + (j+1) + " :" +rataRespon);
        }
        System.out.println("_________________________________");

        System.out.println("---------------------------------");
        System.out.println("\nRata-rata setiap pertanyaan: ");
        for (int i = 0; i < data.length; i++) {
            totalPertanyaan = 0;
            for (int j = 0; j < data[i].length; j++) {
                totalPertanyaan += data[i][j];
            }
            rataPertanyaan = totalPertanyaan / data[i].length;
            System.out.println("Pertanyaan ke-" + (i+1) + " :" +rataPertanyaan);
        }
        System.out.println("---------------------------------");

        System.out.println("============HASIL AKHIR============");
        totalSeluruh = 0; 
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data [i].length; j++) {
                totalSeluruh += data[i][j];
            }
        }
        rataSeluruh = totalSeluruh / (data.length * data[0].length);
        System.out.println("Rata-rata keseluruhan : " + rataSeluruh);
        System.out.println("===================================");
    }
}