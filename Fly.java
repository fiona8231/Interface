
public interface Fly {
    // all the class inside interface is Abstract!

    String fly();
}

class ItFlys implements Fly{

    public String fly(){
        return "Fly High";
        }
}

class CantFly implements Fly{

    public String fly(){
        return "I can't fly";
    }
}