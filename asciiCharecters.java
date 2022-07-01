import java.util.Scanner;
public class asciiCharecters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a charecter:");
        char c = sc.next().charAt(0);
        int i = c;
        System.out.println("ASCII value of " + c + " is " + i);
        sc.close();
    }
}
