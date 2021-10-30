import java.util.ArrayList;
import java.util.Collections;

public class Triangle {
    private ArrayList<Double> sides;

    /**
     * class's constructor
     * @param num1 1st side's length
     * @param num2 2nd side's length
     * @param num3 3rd side's length
     */
    public Triangle(double num1, double num2 , double num3) {
        sides = new ArrayList<>();
        sides.add(num1);
        sides.add(num2);
        sides.add(num3);
        Collections.sort(this.sides);
        this.sides = sides;
    }

    /**
     * calculates and returns the Triangle perimeter
     * @return Triangle perimeter
     */
    public double calculatePerimeter(){
        double perimeter = 0;
        for(int i = 0 ; i < 3 ; i++)
            perimeter += sides.get(i);

        return perimeter;
    }

    /**
     * calculates and returns the triangle area (using p which is (a+b+c)/2)
     * @return triangle area
     */
    public double calculateArea(){
        double perimeterHalf = calculatePerimeter()/2;
        double area = perimeterHalf * (perimeterHalf - sides.get(0)) * (perimeterHalf - sides.get(1))
                * (perimeterHalf - sides.get(2));
        area = Math.sqrt(area);
        return area;
    }

    /**
     * prints the type of this shape (Triangle in this class) + perimeter + area
     */
    public void draw(){
        System.out.println("Type : Triangle | Perimeter = " + calculatePerimeter()
                + " | Area = " + calculateArea());
    }

    /**
     * checks if input triangle is equal to this triangle (check all sides)
     * @param testTriangle the input triangle to be tested
     * @return true if it equals / false if not
     */

    public boolean equals(Triangle testTriangle){
        for (int i = 0 ; i<3 ; i++) {
            if (this.getSides().get(i) != testTriangle.getSides().get(i))
                return false;
        }
        return true;
    }

    /**
     * returns a string representing shape type (triangle in this class) + every side length
     * @return the string that stores this triangle's details
     */
    public String toString(){
        return ("Type : Triangle | sides : " + getSides().get(0) + " " + getSides().get(1) + " "
                + getSides().get(2));
    }

    /**
     * get all 3 side lengths
     * @return an arraylist that stores all 3 side lengths
     */
    public ArrayList<Double> getSides() {
        return sides;
    }

    /**
     * checks if all 3 sides have the same length
     * @return true if all are the same / false if not
     */
    public boolean isEquilateral(){
        if(getSides().get(0) == getSides().get(1) && getSides().get(1) == getSides().get(2))
            return true;
        else
            return false;
    }
}
