public class Main {
    public static void main(String[] args) {

        double[] numberList = {6.2,5.4,4.3,7.2,6.3};
        double total = 0;
        double max = numberList[0];
        for(double number:numberList){
            if(max<number){
                max=number;
            }
            total += number;
            System.out.println(number);

        }
        System.out.println("Total : " + total);
        System.out.println("Max : " + max);
    }
}