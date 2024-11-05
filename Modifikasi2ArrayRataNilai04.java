
// import java.util.Scanner;

// public class ArrayRataNilai04 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int[] nilaiMhs= new int[10];
//         double total = 0;
//         double rata2;

//         for (int i = 0; i < nilaiMhs.length; i++){
//             System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
//             nilaiMhs [i] = sc.nextInt();
//         }
//         for (int i= 0; i < nilaiMhs.length; i++){
//             total += nilaiMhs[i];
//         }
//         rata2 = total/nilaiMhs.length;
//         System.out.println("Rata-rata nilai = "+rata2);
//     }
// }


// import java.util.Scanner;

// public class Modifikasi1ArrayRataNilai04 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int[] nilaiMhs= new int[10];
//         double total = 0;
//         double rata2;

//         for (int i = 0; i < nilaiMhs.length; i++){
//             System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
//             nilaiMhs [i] = sc.nextInt();
//         }
//         for (int i= 0; i < nilaiMhs.length; i++){
//             total += nilaiMhs[i];
//         }
//         rata2 = total/nilaiMhs.length;
//         if (rata2 > 70) {
//             System.out.println("Rata-rata nilai lulus : " + rata2);
//         } else {
//             System.out.println("Rata-rata nilai tidak lulus : " +rata2);
//         }
//     }
// }

import java.util.Scanner;

public class Modifikasi2ArrayRataNilai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs= new int[10];
        int mhs, mhsLulus = 0, mhsTidakLulus = 0;
        double total1 = 0, total2 = 0;
        double rata1 = 0, rata2 = 0;

        System.out.print("Masukkan nilai mahasiswa : ");
        mhs = sc.nextInt();

        for (int i = 0; i < mhs; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs [i] = sc.nextInt();
        }
        for (int i= 0; i < mhs; i++){
            if (nilaiMhs[i] > 70){
                total1 += nilaiMhs[i];
                mhsLulus++;
            }else {
                total2+= nilaiMhs[i];
                mhsTidakLulus++;
            }
        }
        rata1 = total1/mhsLulus;
        rata2 = total2/mhsTidakLulus;
        System.out.println("Rata-rata nilai lulus = " + rata1);
        System.out.println("Rata-rata nilai tidak lulus = " +rata2);
        
    }
}

