package basicpractice;

//This is an interface. All the classes that implements interfaces must have these properties
@FunctionalInterface //optional heading
//When an interface has exactly 1 abstract fucntion, it is called funtional interface
interface BluePrint{
    int value = 1;
    void execute();
}

//this is an abstract class. You can access its information only from its child class
abstract class TopSecret{
    String password = "CandiesAreBoring@123";
    int ContractCode = 63486245;

    //Abstract menthod
    //Every abstract method in abstract class must be overridden to extend abstract class
    public abstract void access();
    public void hitman(){
        System.out.println("This is a topSecret class");
    }
}

//This class extends abstract class and implemets interface
//Although this extends abstract class abstract data cannt be accessed in this class.
class Sample extends TopSecret implements BluePrint{
    @Override
    public void execute() {
        System.out.println(value);
    }
    void running(){
        System.out.println(value);
    }

    @Override
    public void access() {
        System.out.println("access granted");
    }
}

public class AbstractionAndInterfaces implements BluePrint {
    public static void main(String[] args) {
        //accessing abstract data in this class by creating object of its child class.
        Sample sample = new Sample();
        System.out.println(sample.password);
        sample.hitman();
        AbstractionAndInterfaces ai = new AbstractionAndInterfaces();
        ai.execute();
        System.out.println("printing anonymously from anonymouse class function: "+new Anonymous().anony());
    }

    @Override
    public void execute() {
        System.out.println("This is a Blueprint function has a value of : "+value);
    }
}

//We can create an object of the interface in an anonymous object
class Anonymous{
    public boolean anony(){
        //anonymous object
        new BluePrint() {
            //Even the object must override the functions of interface
            @Override
            public void execute() {
                System.out.println("Anonymous object is created of Blueprint interface");
            }
        };
        System.out.println("this is a function from anonymous class");
        return true;
    }
}