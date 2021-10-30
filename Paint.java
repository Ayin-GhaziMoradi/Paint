import java.util.ArrayList;

public class Paint {
    ArrayList<Circle> circles;
    ArrayList<Triangle> triangles;
    ArrayList<Rectangle> rectangles;

    /**
     * class's constructor
     */
    public Paint() {
        circles = new ArrayList<>();
        triangles = new ArrayList<>();
        rectangles = new ArrayList<>();
    }

    /**
     * adds a Triangle to its list
     * @param inputTriangle the Triangle to be added
     */
    public void addTriangle(Triangle inputTriangle){
        triangles.add(inputTriangle);
    }

    /**
     * adds a Circle to its list
     * @param inputCircle the Circle to be added
     */
    public void addCircle(Circle inputCircle){
        circles.add(inputCircle);
    }

    /**
     * adds a Rectangle to its list
     * @param inputRectangle the Rectangle to be added
     */
    public void addRectangle(Rectangle inputRectangle){
        rectangles.add(inputRectangle);
    }

    /**
     * draws every shape using 3 for each loops
     */
    public void drawAll(){
        for (Circle cir : circles){
            cir.draw();
        }

        for (Rectangle rec : rectangles){
            rec.draw();
        }

        for (Triangle tri : triangles){
            tri.draw();
        }
    }

    /**
     * prints every shape using 3 for each loops
     */
    public void printAll(){
        for (Circle cir : circles){
            System.out.println(cir.toString());
        }

        for (Rectangle rec : rectangles){
            System.out.println(rec.toString());
        }

        for (Triangle tri : triangles){
            System.out.println(tri.toString());
        }
    }
}
