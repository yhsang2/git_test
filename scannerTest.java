import java.util.Scanner;

class scannerTest
{
    public static void main(String[] args)
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        String a = sc.next();
        char b = sc.next().charAt(0);
        int c = sc.nextInt();
        double d = sc.nextDouble();
        boolean e = sc.nextBoolean();

        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);
        System.out.println("d : " + d);
        System.out.println("e : " + e);
    }
}