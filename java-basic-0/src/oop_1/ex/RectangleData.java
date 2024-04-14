package oop_1.ex;

public class RectangleData {
    int width;
    int height;
//    int area;

//    void calculateArea(int width, int height){
    int calculateArea(){
//        this.width = width;
//        this.height = height;
//        this.area = this.width * this.height;
//        System.out.println("넓이: " + this.width * this.height);
        return this.width * this.height;
    }

//    void calculatePerimeter(int width, int height){
    int calculatePerimeter(){
//        this.width = width;
//        this.height = height;
//        System.out.println("perimeter = " + (2 * (this.width + this.height)));
        return (2 * (this.width + this.height));
    }

//    boolean isSquare(int width, int height){
    boolean isSquare(){
//        boolean isSquare = (width == height);
//        System.out.println("square = " + isSquare);
        return (width == height);
    }
}
