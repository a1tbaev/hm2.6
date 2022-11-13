public class Shark extends Animal{

    public Shark(String type, String food, int speed) {
        super(type, food, speed);
    }
    public Shark(){

    }

    @Override
    public void getInfo(){
        System.out.println( "\nShark is type of '" + getType() + "' animals, he likes " + getFood() + " and he's speed " + getSpeed() + " km/h");
    }
    public void attack(){
        System.out.println("The shark lives in the ocean");
    }
}
