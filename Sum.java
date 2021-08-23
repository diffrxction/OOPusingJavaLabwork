public class Sum {
    public static void main(String abc[]){
        double sum = 0.0;
        int input = Integer.parseInt(abc[0]);
        for(int i = 1; i <= input; i++){
            sum += (double)1/i;
        }
        System.out.println("The sum of the series is "+ sum+".");
    }
}
