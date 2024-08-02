import java.util.Scanner;
import java.util.Date;
import java.util.Random;
public class PRACTICE {

    private double radius;
    private static int noOfObject;

    PRACTICE() {
        this.radius = 1;
        noOfObject++;
    }
    PRACTICE(double radius){
        this.radius=radius;
        noOfObject++;
    }
    public double getRadius(){return radius;}
    public void setRadius(double radius){this.radius=radius;}
    public static int getNoOfObject(){
        return noOfObject;
    }
    public double area(){
        return 2*radius*Math.PI;
    }

    public static void main(String[] args) {
        System.out.print("the no of object before creating object is: ");
        System.out.println(getNoOfObject());

        PRACTICE myObj1 = new PRACTICE();
        System.out.println("the radius is : "+myObj1.getRadius()+" and object is: "+getNoOfObject());
        myObj1.setRadius(56);
        System.out.println("new radius is: "+myObj1.getRadius());

        PRACTICE myObj2 = new PRACTICE(5);
        System.out.println(getNoOfObject());
        System.out.println("the radius is : "+myObj2.getRadius()+" and object is: "+getNoOfObject());

    }
}

//        // PRINT STATEMENT:-
//        System.out.println("moiz");
//        System.out.println(345);
//        System.out.println(345+34);
//        System.out.println(345-34);
//        System.out.println(345*34);
//        System.out.println(345/34);
//        System.out.println(345%34);
//        System.out.println("____________________________");
//
//        // COMMENT:-
//
//        //  THIS IS A SINGLE LINE COMMENT
//
//        /*
//        THIS
//        IS
//        A
//        MULTI-LINE
//        COMMENT
//         */
//
//       // VARIABLE:-
//       int number1 = 23;
//
//       int num1=23,num2=34,num3=89;
//
//       int a,b,c;
//       a=23;
//       b=45;
//       c=67;
//
//       int aa,bb,cc;
//       aa=bb=cc=45;
//
//       number1=99;
//
//        System.out.println("the number is : "+number1);
//
//        String fname="abdul";
//        String lname="moiz";
//        System.out.println("the name is : "+fname+" "+lname);
//
//        final double pie = Math.PI;
//
//        System.out.println("______________________________");
//
//        // DATATYPES:-
//
//        byte a1=23;
//        short a2 = 6789;
//        int a3 = 4567890;
//        long a4 = 234567897;
//        float a5 = 3.444f;
//        double a6 = 3.43454454d;
//        char a7 = 'a'; // 'A' , '34'
//        boolean a8 = true; // false
//        String name ="moiz";
//
//        double massOfEarth1 = 2e30d;
//        double massOfEarth2 = 2E30d;
//
//        int octal = 0765;
//        int hexa = 0x7ABC;
//
//        //TYPE-CASTING:-
//
//        int add = 356;
//        double sub = add;
//
//        double mul = 5.45678;
//        int div = (int)mul;
//
//        // INDENTIFIER:-
//
//        // MYClass , Moiz , MyClassIsOpen
//        // myMethiod ,add , myClassIsOpen
//        // myVar , abdul123moiz34 , moiz_abdul$ , _moiz , $moiz
//
//        // INPUT:-
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter the age plz: ");
//        int age = sc.nextInt();
//        System.out.println(age);
//
//        System.out.println("________________________________");
//
//        // IF-ELSE AND SWITCH:-
//
//        int age1 = 18;
//        if(age>=18){
//            System.out.println("adult");
//        }else {
//            System.out.println("kid");
//        }
//
//        int percentage = 73;
//        if (percentage<=45){
//            System.out.println("your grade is: D");
//        } else if (percentage>45 && percentage<=60) {
//            System.out.println("your grade is: C");
//        } else if (percentage>60 && percentage<=79) {
//            System.out.println("your grade is: B");
//        } else if (percentage>79 && percentage==100) {
//            System.out.println("your grade is: A");
//        }else {
//            System.out.println("invalid input try again");
//        }
//
//        int month = 4;
//        String name1 = "";
//
//        switch (month){
//            case 1:
//                name1="jan";
//                break;
//            case 2:
//                name1="feb";
//                break;
//            default:
//                System.out.println("invalid");
//        }
//        System.out.println(name1);
//
//        System.out.println("______________________________");
//
//        // OPERATOR:-
//
//        int q = 23 , w = 22;
//
//        System.out.println(q+w);
//        System.out.println(q-w);
//        System.out.println(q*w);
//        System.out.println(q/w);
//        System.out.println(q%w);
//        System.out.println(q^w);
//        System.out.println(w++);
//        System.out.println(w--);
//        System.out.println(++w);
//        System.out.println(--w);
//
//        System.out.println(q+=2);
//        System.out.println(q-=2);
//        System.out.println(q*=2);
//        System.out.println(q/=2);
//        System.out.println(q%=2);
//        System.out.println(q^=2);
//
//        System.out.println(q==w);
//        System.out.println(q!=w);
//        System.out.println(q<=w);
//        System.out.println(q>=w);
//        System.out.println(q<w);
//        System.out.println(q>w);
//
//        System.out.println(q>w && w>q);
//        System.out.println(!(q>w && w>q));
//        System.out.println(q>w || w>q);
//        System.out.println(!(q>w || w>q));
//
//        System.out.println("_____________________________");
//
//        // STRING:-
//
//        String momo = "moiz is a bot";
//
//        System.out.println(momo.toLowerCase());
//        System.out.println(momo.replace('m','p'));
//        System.out.println(momo.replace("moiz","rafay"));
//        System.out.println(momo.startsWith("moiz"));
//        System.out.println(momo.toUpperCase());
//        System.out.println(momo.lastIndexOf('i',3));
//        System.out.println(momo.lastIndexOf('i'));
//        System.out.println(momo.isEmpty());
//
//        System.out.println("_____________________________");




