
public class Dog extends Animal{

    public void digHole(){
        System.out.println("Dug a hole");
    }

    //constructor

    public Dog(){
        super(); // inheritance all the things from animal class

        setSound("Bark");

        flyingtype = new CantFly();
    }
}
