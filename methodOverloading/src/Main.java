public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int topla2 = calculator.topla(21,32);
        System.out.println(topla2);
        int topla3 = calculator.topla(32,21,43);
        System.out.println(topla3);
    }
}