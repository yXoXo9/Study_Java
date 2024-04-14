package oop_1.ex;

public class RectangleProceduraMain {
    public static void main(String[] args){
        RectangleData rectData = new RectangleData();
//        int width = 5;
//        int height = 8;
//        int area = calculateArea(width, height);
//        System.out.println("넓이: " + area);
//        int perimeter = calculatePerimeter(width, height);
//        System.out.println("perimeter = " + perimeter);
//        boolean square = isSquare(width, height);
//        System.out.println("square = " + square);
        rectData.width = 5;
        rectData.height = 8;

        int area = rectData.calculateArea();
        System.out.println("area = " + area);
        int perimeter = rectData.calculatePerimeter();
        System.out.println("perimeter = " + perimeter);
        boolean square = rectData.isSquare();
        System.out.println("square = " + square);
    }

    /*static int calculateArea(int width, int height){
        return width * height;
    }

    static int calculatePerimeter(int width, int height){
        return 2 * (width + height);
    }

    static boolean isSquare(int width, int height){
        return width == height;
    }*/
}
