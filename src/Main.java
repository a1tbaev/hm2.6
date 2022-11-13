public class Main {
    public static void main(String[] args) {

        Animal animals[] = {new Shark("Fish", "meat", 90),
                new Turtle("Reptiles", "strawberry", 20),
                new Eagle("Birds", "meat", 80)
        };
        getAll(animals);

    }
    public static void getAll(Animal[] animal){
        for (Animal animals: animal) {
            animals.getInfo();
            System.out.println(animals);
            if (animals.getClass().equals(Shark.class)){
                if (animals instanceof Shark){
                    new Shark().attack();
                }
            } else if (animals.getClass().equals(Turtle.class)) {
                if (animals instanceof Turtle){
                    new Turtle().swim();
                }
            }else {
                new Eagle().fly();
            }
        }
    }
}