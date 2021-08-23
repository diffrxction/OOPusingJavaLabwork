public class Fibonnaci {
    public static int fib(int n){
        if (n <= 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
    public static void main(String abc[]){
        int input = Integer.parseInt(abc[0]);
        for(int i =0; i < input; i++){
            System.out.print(" "+fib(i));
        }
    }
}
