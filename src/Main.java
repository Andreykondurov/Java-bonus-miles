

public class Main {
    public static void main(String[] args) {

        int ticketPrice = 24_862;
        int priceForOneMiles = 20;

        int miles = ticketPrice / priceForOneMiles;
        System.out.println("Вам начислено " + miles + " бонусных(-ые/-ая) миль(-и/-я)");
    }
}
