public class ATTRIBUTES{

    // CLASS CAN CONTAIN ATTRIBUTES,METHIODS, AND CONSTRUCTOR

    // ATTRIBUTES --> THESE ARE THE OTHER NAME OF VARIABLE BUT INSIDE THE CLASS AND OUSIDE THE METHOD

    // ATTRIBUTES CAN BE DEFAULT TYPE --> IF CAN ASSIGN VALUE AFTER CREATED IT
    // LOCAL VARIABLE --> IF HAVE TO ASSIGN VALUE WHEN YOU CREATE IT

    static String name;
    static int age;
    static char grade;
    static boolean on;

    ATTRIBUTES(){}
    ATTRIBUTES(String name , int age , char grade){
        this.name=name;
        this.age=age;
        this.grade=grade;
    }
    public static void info(String name , int age , char grade){
        System.out.println("the info of the student is : "+name+" "+age+" "+grade);
    }

    public static void main(String[] args) {
        info(name,age,grade);  // access beacuse the firlds are of static type
        name="rafay";  // modifier the field
        info(name,age,grade);

    }


}
