package competitive;

@FunctionalInterface
public interface InterfaceReference {

    void meth(int a);

    default void func() {
        System.out.println("inside func");
    }

    static void sys() {
        System.out.println("inside sys");
    }
}
