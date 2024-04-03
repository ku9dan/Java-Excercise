import java.util.Scanner;
class average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d,e;
        System.out.println("Enter first number");
        a=sc.nextInt();
        System.out.println("Enter second number");
        b=sc.nextInt();
        System.out.println("Enter third number");
        c=sc.nextInt();
        System.out.println("Enter fourth number");
        d=sc.nextInt();
        System.out.println("Enter fifth number");
        e=sc.nextInt();
        double average=(a+b+c+d+e)/5.0;
        System.out.println("Average of five number is " +average);
    }
}
