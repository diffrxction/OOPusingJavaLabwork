public class Celsius {
    public static void main(String abc[]){
        double fah, cel;
        fah = Double.parseDouble(abc[0]);
        cel = (fah - 32)/1.8;
        System.out.println("The temperature in Celsius is: " + cel+".");
    }
}
