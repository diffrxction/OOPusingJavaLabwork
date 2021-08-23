public class FactorialRecursion {
    public static int fact(int n){
        if (n == 1){
            return 1;
        }
        int smallCalc = n * fact(n-1);
        return smallCalc;
    }
    public static void main(String abc[]){
        int input = Integer.parseInt(abc[0]);
        int result = fact(input);
        System.out.println("The Factorial is "+ result +".");
    }
}
