import java.util.Scanner;

class area {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int L,B;
        System.out.println("Enter Length of rectangle");
        L=sc.nextInt();
        System.out.println("Enter Breadth of rectangle");
        B=sc.nextInt();
        int area=(L*B);
        System.out.println("Area of Rectangle is "+area);
    }
}
