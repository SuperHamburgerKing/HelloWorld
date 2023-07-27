package HelloWorld;

public class Hello {
    public static void main(String[] args) {
        //System.out.println("Hello world");
       Person p = new Person(1.76f,74.4f);
       p.height = 1.77f;
       p.weight = 74.4f;
       p.hello();
        System.out.println(p.bmi());
    }
}
