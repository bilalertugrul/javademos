public class Main {
    public static void main(String[] args) {

        GameCalculator gameCalculator = new GameCalculator() {
            @Override
            public void hesapla() {

            }
        }
        GameCalculator gameCalculator = new ManGameCalculator();
        gameCalculator.hesapla();
        gameCalculator.gameover();
    }
}