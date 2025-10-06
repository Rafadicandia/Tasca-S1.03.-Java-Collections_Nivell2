
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<Restaurant> newRestaurantSet = new TreeSet<>();

        Restaurant pepito = new Restaurant("Pepito", 5);
        Restaurant manolito = new Restaurant("Manolito", 3);
        Restaurant pepito2 = new Restaurant("Pepito", 3);
        Restaurant chiringuito = new Restaurant("El chiringuito de Carlitos", 1);
        Restaurant pepito3 = new Restaurant("Pepito", 5);

        newRestaurantSet.add(pepito);
        newRestaurantSet.add(pepito2);
        newRestaurantSet.add(manolito);
        newRestaurantSet.add(chiringuito);

        System.out.println("The list of total restaurants is: "+newRestaurantSet.size());

        for (Restaurant r : newRestaurantSet) {
            System.out.println(r);
        }

    }
}
