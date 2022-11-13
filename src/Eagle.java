public class Eagle extends Animal{

    public Eagle(String type, String food, int speed) {
        super(type, food, speed);
    }
    public Eagle(){

    }
    @Override
    public void getInfo(){
        System.out.println( "\nEagle is type of '" + getType() + "' animals, he likes " + getFood() + " and he's speed " + getSpeed() + " km/h");
    }
    public void fly(){
        System.out.println("Eagle can fly");
    }
}
