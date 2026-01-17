package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;


public class Q1 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("London");
        cities.add("Berlin");
        cities.add("Paris");
        cities.add("Boston");
        cities.add("Milan");
        cities.add("Tokyo");
        Iterator<String> iterator = cities.iterator();
        while (iterator.hasNext()){
            String city = iterator.next();
            if (city.toLowerCase().endsWith("n")){
                iterator.remove();
            }
        }
        System.out.println(cities);
    }
}
