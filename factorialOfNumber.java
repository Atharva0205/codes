import java.util.Scanner;

public class factorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        if (num >= 0) {
            System.out.println(num + " Factorial: " + getFact(num));
        }
        else
            System.out.println("Negative Number: No Factorial");
    }

    public static int getFact(int num){
        if(num == 1 || num == 0) 
            return 1;
        
        return num * getFact(num - 1);
    }
}
