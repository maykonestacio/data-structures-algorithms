
public class Main {

    public static void main(String[] args){

        String[] cars = {"Camaro", "Corvette", "Tesla", "BMW"};

        cars[0] = "Mustang";

        String[] names = new String[3];

        names[0] = "Maykon";  

        System.out.println(cars[0]);


        for (Object elem : cars) {
            System.out.println(elem);
        }

        for (int i = 0; i < cars.length; i++){
            
            System.out.println(cars[i]);

        }

    }

}
