public class Circal extends Shap{
    private double rad;

    Circal(){
this.rad=1.0;
    }

    Circal(String color,boolean filled,double rad){
        super(color,filled);
        this.rad=rad;

    }


    public void setRad(){
        this.rad=rad;
    }




    public double getRad(){

        return rad;
    }
 public double getArea(){

     return 3.14*rad*rad;
 }




    public double getParammeter() {

        return 2 * 3.14 * rad * rad;

    }

















}
