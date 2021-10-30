import java.util.ArrayList;

public class Rectangle {
    private ArrayList<Double> sides;

    /**
     * class's constructor
     * @param num1 1st side's length
     * @param num2 2nd side's length
     * @param num3 3rd side's length
     * @param num4 4th side's length
     */
    public Rectangle(double num1 , double num2 , double num3 , double num4) {
        sides = new ArrayList<>();
        sides.add(num1);
        sides.add(num2);
        sides.add(num3);
        sides.add(num4);
    }

    /**
     * calculates and returns the Rectangle perimeter
     * @return Rectangle perimeter
     */
    public double calculatePerimeter(){
        double perimeter = 0;
        for (int i =0 ; i<4 ; i++)
            perimeter += sides.get(i);
        return perimeter;
    }

    /**
     * calculates and returns the Rectangle area
     * @return Rectangle area
     */
    public double calculateArea(){
        double area = sides.get(0) * sides.get(1);
        return area;
    }

    /**
     * prints the type of this shape (Rectangle in this class) + perimeter + area
     */
    public void draw(){
        System.out.println("Type : Rectangle | Perimeter = " + calculatePerimeter()
                + " | Area = " + calculateArea());
    }

    /**
     * checks if input Rectangle is equal to this Rectangle (check 2 sides)
     * @param testRect the input Rectangle to be tested
     * @return true if it equals / false if not
     */
    public boolean equals(Rectangle testRect){
        if(this.sides.get(0)==testRect.sides.get(0) && this.sides.get(1)==testRect.sides.get(1))
            return true;
        if(this.sides.get(1)==testRect.sides.get(0) && this.sides.get(0)==testRect.sides.get(1))
            return true;
        return false;
    }

    /**
     * returns a string representing shape type (Rectangle in this class) + every side length
     * @return the string that stores this Rectangle's details
     */
    public String toString(){
        return ("Type : Rectangle | sides : " + sides.get(0) + " " + sides.get(1) + " "
        + sides.get(2) + " " + sides.get(3));
    }

    /**
     * get all 4 side lengths
     * @return an arraylist that stores all 4 side lengths
     */
    public ArrayList<Double> getSides() {
        return sides;
    }

    /**
     * checks if all side lengths are equal
     * @return true if it is a square / false if not
     */
    public boolean isSquare(){
        if(sides.get(0)==sides.get(1) && sides.get(1)==sides.get(2) && sides.get(2)==sides.get(3))
            return true;
        else
            return false;
    }
}
