package AbstractShape;

public class Circle extends Shape {
    @Override
    public void Area() {
        System.out.println("area = π · r^2");

    }

    @Override
    public void Name() {
        System.out.println("    - is area of circle");

    }
}
