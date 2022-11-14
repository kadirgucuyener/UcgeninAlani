import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.print("Üçgenin Birinci Kenar Uzunluğunu Giriniz : ");
        a = input.nextInt();

        System.out.print("Üçgenin İkinci Kenar Uzunluğunu Giriniz : ");
        b = input.nextInt();

        System.out.print("Üçgenin Üçüncü Kenar Uzunluğunu Giriniz : ");
        c = input.nextInt();

        int u = (a+b+c)/2;
        double cevre = 2*u;
        double alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));

        System.out.println("Üçgenin Çevresi: " + cevre);
        System.out.println("Üçgenin Alanı: " + alan);


    }
}
