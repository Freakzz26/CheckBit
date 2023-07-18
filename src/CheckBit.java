import java.util.Scanner;

public class CheckBit {
    static void check(int a,int b)
    {
        if((a &(1<<b))==0)
        {
            System.out.println("0");
        }
        else {
            System.out.println("1");
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        check(a,b);
    }
}
