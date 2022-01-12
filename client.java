import java.util.jar.Attributes.Name;

public class client {
    public static void main(String[] args) {

        System.out.println("Testing vehicle class");

        bicycle bike = new bicycle(name: "Anu", wheels: 2);
        motorizedvehicle mv = new motorizedvehicle(name: "Anu", wheels: 4, volumeDisplacement: 20);

        System.out.println("Print bike\n" + bike + "\n");

        System.out.println("Print motor vehicle\n" + mv);
        System.out.println("Horsepower: " + mv.horsepower() + "\n");


        System.out.println("Testing food class");

        fruit lemon = new fruit(name: "lemon", calories: 50, season: "Spring");
        liquidfood honey = new liquidfood(name: "honey", calories: 100, viscosity: 2000);

        System.out.println("Print lemon\n" + lemon);
        System.out.println("Calories of 2 serving of lemon: " + lemon.totalCalories(serving:2));
        System.out.println("Best season to grow them: " + lemon.getSeason() + "\n");

        System.out.println("Print honey\n" + honey);
        System.out.println("Calories of 3 serving of honey: " + honey.totalCalories(serving:3));
        System.out.println("Viscosity of honey: " + honey.getViscosity() + " centipoise");
        
    
    }

}
