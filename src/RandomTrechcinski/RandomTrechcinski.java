package RandomTrechcinski;
import java.util.Random;

public class RandomTrechcinski {
    public static void main(String[] args) {

        Random random = new Random();
        int losowaLiczbaTrechcinski = random.nextInt(100)+1; //1-100
        System.out.println("Wylosowałeś liczbę: "+losowaLiczbaTrechcinski);

        if (losowaLiczbaTrechcinski%2 == 0)
            System.out.println("Twoja liczba jest parzysta");
        else
            System.out.println("Twoja liczba jest nieparzysta");

    }
}
