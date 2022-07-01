public class fibonacciNumbers {
    public static void main(String[] args) {
        int fib0 = 0;
        int fib1 = 1;
        int n = 5;
        int nextTerm = 0;
        System.out.print(fib0+" "+fib1+" ");
        if(n<2){
            System.out.println(n);
        }
        for(int i = 2; i < n; i++){
            nextTerm = fib0 + fib1;
            fib0 = fib1;
            fib1 = nextTerm;
            System.out.print(nextTerm+" ");
        }
      
    }
}
