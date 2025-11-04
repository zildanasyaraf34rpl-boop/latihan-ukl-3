
import java.util.Scanner;

public class hitungFaktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan untuk menghitung faktorial: ");
        System.out.println("masukkan sebuah bilangan positif: ");

        int n = input.nextInt();
        long faktorial = 1;

        if (n < 0) {
            System.out.println("Faktorial tidak terdefinisi untuk bilangan negatif.");
        } else {
            for (int i = 1; i <= n; i++) {
                faktorial *= i;
            }
            System.out.println("Faktorial dari " + n + " adalah: " + faktorial);
            
    }
    
}
}
