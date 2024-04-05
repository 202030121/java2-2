public class Circle {
    int radius;
    String name;

    public Circle() {
        radius = 1;
        name = "";
    }

    public Circle(int r, String n) {
        radius = r;
        name = n;
    }

    public double g() {
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        Circle pizza = new Circle(10, "자바피자");
        double g = pizza.g();
        System.out.println(pizza.name + "의 면적은 " + g);

        Circle donut = new Circle();
        donut.name = "도넛피자";
        g = donut.g();
        System.out.println(donut.name + "의 면적은 " + g);
    }
}
