import java.util.Scanner;
class volume {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int L,B,H;
        System.out.println("Enter Length of cuboid");
        L=sc.nextInt();
        System.out.println("Enter Breadth of cuboid");
        B=sc.nextInt();
        System.out.println("Enter Height of cuboid");
        H=sc.nextInt();
        int volume=(L*B*H);
        System.out.println("Volume of cuboid is "+volume);
        
    }
}
