import java.util.Scanner;

class getAndAddnumber {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = a * b * c;
        int e = a + b + c;
        System.out.println(d / e);
    }
}