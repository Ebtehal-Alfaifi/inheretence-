public class Squar extends Rectangle {

  Squar(){

  }


    Squar(String color,boolean filled,double width,double length){

    }
public void setside(double side){
 super.setWidth(side);

}

public double getside(){

    return super.getWidth();
}



  public double getParameter() {

    return super.getWidth()*4;
  }

  public double getArea(){


      return super.getWidth()*super.getWidth();
  }








}

