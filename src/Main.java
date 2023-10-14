public class Main {
    public static void main(String[] args) {
Circle c1 = new Circle();

        Circle c2 = new Circle(2,"red");
        c2.setColor("blue");

        System.out.println(c2.toString());
        System.out.println(c2);

    }
}