package tugas.pert.akhir;
// IMPORT LIBRARY
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TugasPertAkhir {
    static ArrayList<Nilai> skor = new ArrayList<Nilai>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException{
        while (true){
            System.out.println("\n\n---------------------------------- TUGAS PBO ---------------------------------");
            System.out.println("|                               PERTEMUAN AKHIR                              |");
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("| [1] Tulislah program dalam Java dengan  method yang sesuai  pada tampilan  |");
            System.out.println("| [2] Kasus Nilai Akhir                                                      |");
            System.out.println("| [0] Exit...                                                                |");
            System.out.println("------------------------------------------------------------------------------");
            System.out.print("Masukkan Pilihan: ");


            int menu = Integer.parseInt(br.readLine());
            // KASUS 1
            if (menu == 1) {
                String teks = "JavaScript adalah bahasa pemrograman tingkat tinggi dan dinamis";
                String teks1 = teks.substring(0, 36);
                String teks2 = teks.toLowerCase();
                String teks3 = teks.toUpperCase();String teks4 = teks.substring(25, 36);
                String teks5 = teks.substring(37);
                
                
                System.out.println("\nKASUS 1");
                System.out.println("String Awal : JavaScript adalah bahasa pemrograman tingkat tinggi dan dinamis");
                
                // Tampilkan ke Layar
                System.out.println("------------------------------------------------------------------------");
                System.out.println("|                        TAMPILKAN KE LAYAR                            |");
                System.out.println("------------------------------------------------------------------------");
                System.out.println("| 1. " + teks1 + "                              |");
                System.out.println("| 2. " + teks2 + "   |");
                System.out.println("| 3. " + teks3 + "   |");
                System.out.println("| 4. " + teks4 + "                                                       |");
                System.out.println("| 5. " + teks5 + "                                        |");
                System.out.println("------------------------------------------------------------------------");
            }
            
            
            

            
            // KASUS 2
            else if (menu == 2) {
                System.out.println("\nKASUS 2");
                System.out.println("\n------------------------------------------------------------------------");
                System.out.println("|                     MENGHITUNG SKOR AKHIR                            |");
                System.out.println("------------------------------------------------------------------------");
                
                //HITUNG
                System.out.print("Masukkan Nama Mata Kuliah: ");
                String add_matkul = br.readLine();
                System.out.print("Masukkan Kehadiran (8/8): ");
                int add_hadir = Integer.parseInt(br.readLine());
                System.out.print("Masukkan Nilai UTS (100/100): ");
                int add_uts = Integer.parseInt(br.readLine());
                System.out.print("Masukkan Nilai UAS (100/100): ");
                int add_uas = Integer.parseInt(br.readLine());
                
                Nilai newNilai = new Nilai(add_matkul, add_hadir, add_uts, add_uas);
                skor.add(newNilai);
                
                
                // Hitung Nilai Hadir
                double nilaiHadir;
                if (add_hadir < 3) {
                    nilaiHadir = 0;
                } else if (add_hadir >= 3 && add_hadir <= 4) {
                    nilaiHadir = 60;
                } else if (add_hadir >= 5 && add_hadir <= 6) {
                    nilaiHadir = 80;
                } else {
                    nilaiHadir = 100;
                }
        
                double nilaiAkhir = (nilaiHadir * 0.2) + (add_uts * 0.3) + (add_uas * 0.5);
        
                // Konversi ke Nilai Grade
                String nilaiGrade;
                if (nilaiAkhir >= 85 && nilaiAkhir <= 100) {
                    nilaiGrade = "A";
                } else if (nilaiAkhir >= 70 && nilaiAkhir <= 84) {
                    nilaiGrade = "B";
                } else if (nilaiAkhir >= 60 && nilaiAkhir <= 69) {
                    nilaiGrade = "C";
                } else if (nilaiAkhir >= 50 && nilaiAkhir <= 59) {
                    nilaiGrade = "D";
                } else {
                    nilaiGrade = "E";
                }
                
                // Tampilkan Nilai Akhir dan Nilai Grade
                System.out.println("------------------------------------------------------------------------");
                System.out.println("                NILAI AKHIR MATA KULIAH " + add_matkul);
                System.out.println("------------------------------------------------------------------------");
                System.out.println("Nilai Akhir: " + nilaiAkhir);
                System.out.println("Nilai Grade: " + nilaiGrade);
                System.out.println("------------------------------------------------------------------------");

    }
          
            // EXIT
            else if (menu == 0) {
                System.out.println("\n+++++   Terima kasih telah menggunakan program, semoga hari Anda selalu menyenangkan ><   +++++");
                break;
            }

            else {
                System.out.println("Pilihan menu tidak tersedia.");
            }
        }
    }
}
