// public class SearchNilai04 {
//     public static void main(String[] args) {
//         int [] arrNilai = {80, 85, 78, 96, 90, 82, 86 };
//         int key = 90;
//         int hasil = 0;

//         for (int i = 0; i < arrNilai.length; i++){
//             if (key == arrNilai[i]) {
//                 hasil = i;
//                 break;
//             } 
//         }
//         System.out.println();
//         System.out.println("Nilai "+key+" ketemu di indeks ke-"+hasil);
//         System.out.println();
//     }
// }

import java.util.Scanner;
public class ModifikasiSearchNilai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput : ");
        int banyakNilai = sc.nextInt();

        int[] arrNilai = new int[banyakNilai]; 
        int key;
        int hasil = -1;

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari : ");
        key = sc.nextInt();

        for (int i = 0; i < arrNilai.length; i++) {
            if (arrNilai[i] == key) {
                hasil = i;
                break;
            }
        }

        System.out.println();
        if (hasil != -1) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1));
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
    }
}

