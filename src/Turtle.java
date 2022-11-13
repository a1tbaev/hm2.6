public class Turtle extends Animal{

    public Turtle(String type, String food, int speed) {
        super(type, food, speed);
    }
    public Turtle(){

    }
    @Override
    public void getInfo(){
        System.out.println( "\nTurtle is type of '" + getType() + "' animals, he likes " + getFood() + " and he's speed " + getSpeed() + " km/h");
    }
    public void swim(){
        System.out.println("Turtle can swim");
    }
}
