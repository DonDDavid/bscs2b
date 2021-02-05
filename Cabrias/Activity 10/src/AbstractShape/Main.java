package AbstractShape;

import java.util.ArrayList;
import java.util.List;
public class Main{
public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Square();


        //     s1.Area();
        //     s2.Area();


        //     s1.Name();
        //       s2.Name();

        List<Shape> shape = new ArrayList<>();

        shape.add(s1);
        shape.add(s2);

        for(Shape ext : shape) {
        if (ext instanceof Circle) {
        s1.Area();
        s1.Name();
        }
        if (ext instanceof Square) {
        s2.Area();
        s2.Name();
            }

        }

    }
}
