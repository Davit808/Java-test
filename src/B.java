public class B implements A{
    public final String name;

    public B(String name) {
        this.name = name;
    }

    @Override
    public String f(String name) {
        System.out.println("5+");
        return name;
    }
}
