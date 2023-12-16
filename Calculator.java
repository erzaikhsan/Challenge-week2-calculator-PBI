import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.print("Pilih operasi (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        double hasil = 0;

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                hasil = angka1 / angka2;
                break;
            default:
                System.out.println("Operasi tidak ada.");
                return;
        }

        System.out.println("Hasil Hitung: " + hasil);
    }
}
