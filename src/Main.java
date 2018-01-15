import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        File input = new File("resources/plants.txt");
        try {
            Scanner sc = new Scanner(input);
            int numberOfDays = sc.nextInt();

            List<Care> cares = new ArrayList<>();

            for (int i = 0; i < numberOfDays; i++) {
                int care = sc.nextInt();
                cares.add(Care.getEnum(care));
            }

            List<Plant> plants = new ArrayList<>();

            while (sc.hasNext()) {
                String plantType = sc.next();
                String plantCode = sc.next();
                int startSize = sc.nextInt();

                Plant plant = null;
                switch(plantType){
                    case "Virag":
                        plant = new Flower(plantCode, startSize);
                        break;
                    case "Bokor":
                        plant = new Bush(plantCode, startSize);
                        break;
                    case "Kaktusz":
                        plant = new Cactus(plantCode, startSize);
                        break;
                }
                plants.add(plant);

            }
            for (Care care: cares
                 ) {
                for (Plant plant:
                     plants) {
                    plant.grow(care);
                }
            }
            for (Plant plant: plants) {
                if (plant.isAlive()) {
                    System.out.println(plant.getCode());
                }
            }
            } catch (FileNotFoundException e1) {
            System.out.println("Error reading files.");
            e1.printStackTrace();
        }

    }

}
