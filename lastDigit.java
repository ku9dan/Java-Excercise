import java.util.Scanner;
class lastDigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int a= sc.nextInt();
        System.out.println("Last digit of the given number is "+(a%10));
    }
}
