import java.util.Scanner;

public class BioskopWithScanner07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom, menu;
        String nama, next;

        String [][] penonton = new String[4][2];
        while (true) {
            String [] mn = {"1. Input data penonton", "2. Tampilkan daftar penonton", "3. Exit"};
            System.out.println("=================================");
            for (String b : mn) {
                System.out.println(b);
            }
            System.out.println("=================================");
            System.out.print("Masukkan menu : ");
            menu = sc.nextInt();
            sc.nextLine();
            if (menu == 1) {
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if ((baris < 1 || baris > 4) || (kolom < 1 || kolom > 2) ) {
                        System.out.println("Kursi tidak tersedia ");
                        continue;
                    }
                    
                    if (penonton[baris-1][kolom-1] == null) {
                        penonton[baris-1][kolom-1] = nama;
                        
                    } else  {
                        System.out.println("Warning! Kursi sudah diisi. Silahkan pilih kursi yang lain");
                        continue;
                    }

                    
                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc.nextLine();
        
                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
                System.out.println("=================================");
            } else if (menu == 2) {
                System.out.println("Daftar penonton : ");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print("***\t");
                        } else {
                            System.out.print(penonton[i][j] + "\t");
                        }
                    }
                    System.out.println();
                }
                System.out.println("=================================");
            } else if (menu == 3) {
                System.out.println("Terimaksih");
                break;
            } else {
                System.out.print("Masukkan menu yang benar");
                continue;
            }
            
        }
    }
}