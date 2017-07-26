
public class WorkWithAnimals {

    public static void main(String[] args){

        Dog DuoDuo = new Dog();
        DuoDuo.setName("duoduo");

        System.out.println(DuoDuo.getName());
        DuoDuo.digHole();
        DuoDuo.setWeight(-3);


        //We can change!!

        changeObjectName(DuoDuo);
        System.out.println("Dog name after method call " + DuoDuo.getName());

        System.out.println("duoduo " + DuoDuo.tryToFly());

        Bird beedy = new Bird();
        System.out.println("Beedy" + beedy.tryToFly());
    }


    public static void  changeObjectName(Dog duoduo){

        duoduo.setName("Fido");
    }


}
