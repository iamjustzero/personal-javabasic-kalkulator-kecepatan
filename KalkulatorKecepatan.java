import java.util.Scanner;

class KalkulatorKecepatan{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kalkulator Kecepatan");
        System.out.println("Menu Kalkulator");
        System.out.println("1. Menghitung Kecepatan");
        System.out.println("2. Menghitung Waktu");
        System.out.println("3. Menghitung Jarak");
        System.out.println("Masukkan pilihan anda(1/2/3):");
        int pilihan = scanner.nextInt();
        switch (pilihan) {
            case 1: 
                System.out.println("\nMenghitung Kecapatan");
                System.out.println("Masukkan jarak yang ditempuh dalam KM. Misalnya (60)KM");
                int jarak1 = scanner.nextInt();
                System.out.println("Masukkan waktu yang ditempuh dalam jam. Misalnya (1) Jam ");
                int waktu1 = scanner.nextInt();
                int kecepatan1 = jarak1/waktu1;
                System.out.println("Kecepatan rata-ratanya: "+ kecepatan1 + "KM/Jam");
                System.out.println("Otomatis menutup. Tekan F5/ CTRL+F5 untuk menghitung lagi.");
                break;
            case 2:
                System.out.println("\nMenghitung Waktu");
                System.out.println("Masukkan jarak yang ditempuh dalam KM. Misalnya (60)KM");
                double jarak2 = scanner.nextDouble();
                System.out.println("Masukkan kecepatan rata rata yang ditempuh dalam KM/Jam. Misalnya (40) KM/Jam ");
                double kecepatan2 = scanner.nextDouble();
                double waktu2 = jarak2/kecepatan2;
                System.out.println("Wakktunya: "+ waktu2 + " Jam");
                System.out.println("Otomatis menutup. Tekan F5/ CTRL+F5 untuk menghitung lagi.");
                break;
            case 3:
                System.out.println("\nMenghitung Jarak");
                System.out.println("Masukkan kecepatan rata rata yang ditempuh dalam KM/Jam. Misalnya (40) KM/Jam ");
                int kecepatan3 = scanner.nextInt();
                System.out.println("Masukkan waktu yang ditempuh dalam jam. Misalnya (1) Jam");
                int waktu3 = scanner.nextInt();
                int jarak3 = kecepatan3*waktu3;
                System.out.println("Jarak yang anda tempuh: "+ jarak3 + "KM");
                System.out.println("Otomatis menutup. Tekan F5/ CTRL+F5 untuk menghitung lagi.");
                break;
            default:
            System.out.println("\nNomor yang anda masukkan salah. Harap masukkan nomor yang lain.");
            System.out.println("Otomatis menutup. Tekan F5/ CTRL+F5 untuk menghitung lagi.");
                break;
        }
        scanner.close();
    }
}