public class Animal {
    private String type;
    private String food;
    private int speed;

    public Animal(String type, String food, int speed) {
        this.type = type;
        this.food = food;
        this.speed = speed;
    }

    public Animal() {

    }

    public void getInfo(){
        System.out.println( " is type of '" + type + "' animals, he likes " + food + " and he's speed " + speed + " km/h");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", food='" + food + '\'' +
                ", speed=" + speed +
                '}';
    }
}
