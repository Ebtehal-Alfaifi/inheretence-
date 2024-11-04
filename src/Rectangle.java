public class Rectangle extends Shap {
    private double width;
    private double length;


    Rectangle() {
this.width=1.0;
this.length=1.0;
    }

    Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;

    }

    public double setWidth(double width) {
        this.width = width;
        return width;
    }

    public double setLength(double par) {
        this.length = length;
        return length;
    }


    public double getWidth() {

        return width;
    }

    public double getLength() {

        return length;
    }


    public double getParameter() {


        return (width+length)*2;
    }

public double getArea(){


    return length* width;
}



}


