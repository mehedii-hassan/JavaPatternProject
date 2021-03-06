package techcrashcourse.com;

import java.awt.Point;

class ReferencesTest {

    public static void main(String[] arguments) {
        Point ob, head;
        Point r2;
        ob = new Point(100, 100);
        head = ob;
        r2 = head;

        ob.x = 200;
        ob.y = 200;
        System.out.println("Point1: " + ob.x + ", " + ob.y);
        System.out.println("Point2: " + head.x + ", " + head.y);
        System.out.println("\n\n");

        r2.x = 50;
        r2.y = 50;
        System.out.println("Point1: " + ob.x + ", " + ob.y);
        System.out.println("Point2: " + head.x + ", " + head.y);
        System.out.println("\n\n");
        System.out.println("Point1: " + ob.x + ", " + ob.x);
        System.out.println("Point2: " + head.x + ", " + ob.y);
        System.out.println("\n\n");

    }
}
