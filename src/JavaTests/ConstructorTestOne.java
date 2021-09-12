package JavaTests;

public class ConstructorTestOne {

    public ConstructorTestOne() {
//        test();
        System.out.println(test());
    }


    public static void main(String[] args) {
        ConstructorTestOne one = new ConstructorTestOne();
    }

    public String test() {
//        System.out.println("hieee");
        return "hi";
    }
}
