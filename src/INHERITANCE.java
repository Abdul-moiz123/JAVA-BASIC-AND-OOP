public class INHERITANCE {

    double square(double n){
        return n*n;
    }
}

class circle{
    INHERITANCE op;
    double PI = Math.PI;

    double area(double radius){
        op= new INHERITANCE();
        double rsquare = op.square(radius);
        return PI*rsquare;
    }

    public static void main(String[] args) {
        INHERITANCE myObj = new INHERITANCE();
        double result = myObj.square(5);
        System.out.println(" result : "+result);
        System.out.println(myObj.toString());
        System.out.println();
    }
}