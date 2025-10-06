import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet <Restaurant> newRestaurantList= new HashSet<>();

        Restaurant pepito = new Restaurant("Pepito", 5);
        Restaurant manolito = new Restaurant("Manolito", 3);
        Restaurant pepito2 = new Restaurant("Pepito", 3);
        Restaurant chiringuito = new Restaurant("El chiringuito de Carlitos", 1);
        Restaurant pepito3 = new Restaurant("Pepito", 5);


        newRestaurantList.add(pepito);
        newRestaurantList.add(pepito2);
        newRestaurantList.add(manolito);
        newRestaurantList.add(chiringuito);



        System.out.println("The list of total restaurants is: "+newRestaurantList.size());

        for (Restaurant r : newRestaurantList) {
            System.out.println(r);
        }



    }
}
