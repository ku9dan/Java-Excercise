import java.util.Scanner;
class sumOfN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a natural number");
        int a=sc.nextInt();
        int sum=0;
        for (int i = 0; i <= a; i++) {
            sum=sum+i;
        }
        System.out.println("Sum of Natural numbers are "+sum);
        
    }
}
