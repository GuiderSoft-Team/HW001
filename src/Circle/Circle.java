package Circle;

public class Circle {
    public static void main(String[] args) {
        //Write a Java program that displays the area and perimeter of a circle that has a radius of
        //5.5 using the following formulas:
        //perimeter = 2 * radius * 𝜋
        //area = radius * radius * 𝜋
        double radius=5.5;
        double perimeter=2 * radius *Math.PI;
        double area=radius * radius *Math.PI;
        System.out.println("The perimeter of circle:"+perimeter);
        System.out.println("The area of circle :"+area);

    }
}
