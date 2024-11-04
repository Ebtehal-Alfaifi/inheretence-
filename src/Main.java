//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Shap s2 = new Shap("red", true);
        System.out.println(" the shap color is " + s2.getColor());
        System.out.println(" is filled " + s2.getFilled());
        System.out.println("----------------------------");


        Circal cc1 = new Circal("purpol", true, 5.7);
        System.out.println(" the shape color is " + cc1.getColor());
        System.out.println(" is filled " + cc1.getFilled());
        System.out.println(" the area of circul is " + cc1.getArea());
        System.out.println(" the parameter of circul is " + cc1.getParammeter());
        System.out.println("-------------------");



        Rectangle r2 = new Rectangle("pink", true, 1.0, 1.0);
        System.out.println(" the area of rectangel  " + "=" + r2.getParameter());
        System.out.println(" the parameter of rectangle is " + r2.getParameter());
        System.out.println("---------------------");

        Squar sq = new Squar();
        sq.setColor("grey");
        sq.setFilled(false);     // القيمه حقه خليتها نفس المعرفه الي عرفتها بكلاس المستطيل
        System.out.println(" square color is " + sq.getColor());
        System.out.println(" is fallid ?" +sq.getFilled());
        System.out.println("the parameter of squar " + "= " + sq.getParameter());
        System.out.println(" the area of Squar is " + sq.getArea());


}}