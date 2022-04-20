package basicpractice;

public class Oops {

}
class Employee{
    private String name;
    private int age;
    private static String compName;
    private static String projName;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
        this.compName = compName;
    }

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Naveen");
        long t= System.currentTimeMillis();
        String name= "Naveen";
        long ti = System.currentTimeMillis();

        System.out.println(t);
        System.out.println(ti);

    }
}
