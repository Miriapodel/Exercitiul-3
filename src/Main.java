import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Scrie n");

        int n = scanner.nextInt();
        int a = 1;
        int b = 2;

        if(n == 1)
            System.out.println(a);
        else if (n == 2) {
            System.out.println(b);
        }
        else
        {
            while(n != 2)
            {
                n--;
                int x = a;
                a = b;
                b = x + a;
            }

            System.out.println(b);
        }

    }
}