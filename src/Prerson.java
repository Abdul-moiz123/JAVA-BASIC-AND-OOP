public class Prerson extends Object {
    @Override
    public String toString(){
        return "person";
    }
}
class Student extends Prerson{
    @Override
    public String toString(){
        return "student";
    }
}
class G_student extends Student{

}
class Class {

    public static void m (Prerson x){
        System.out.println(x.toString());
    }
    public static void main(String[] args) {
        m(new Student());
        m(new Prerson());
        m(new G_student());
//        m(new Object());
    }
}
//    private double radius;
//
//    public Prerson(double radius){
//        this.radius=radius;
//    }
//    public double getRadius(){return radius;}
//    public double area(){
//        return radius*radius*Math.PI;
//    }
//}

//class Employee extends Prerson{
//    private double length;
//
//    public Employee(double length,double radius){
//        super(radius);
//        this.length=length;
//    }
//    @Override
//    public double area(){
//        return super.area()*length ;
//    }
//
//    public static void main(String[] args) {
//        Employee sc = new Employee(5,3);
//        System.out.println(sc.area());
//
//    }
//}

//class Faculty extends Employee{
//    public Faculty(){
//        System.out.println("third constructor");
//    }
//
//    public static void main(String[] args) {
//        new Faculty();
//    }
//}

