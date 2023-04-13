public class Main {
    public static void main(String[] args) {
        A x = new B("Davit");
        System.out.println(x.name);

        String name = x.f("Ara");
        System.out.println(name);
    }
}