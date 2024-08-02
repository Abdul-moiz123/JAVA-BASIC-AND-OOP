public class METHODS {

    // METHOD ARE OF TWO TYPE (RETURN TYPE AND NON-RETURE TYPE)
    // RETURN TYPE CONTAIN THE PRIMITIVE DATATYPE IN ORDER TO RETURN VALUE
    // NON-RETURN TYPE CONTAIN THE VOID KEYWORD IN ORDER TO NON RETURN ANY VALUE
    //STATIC METHOD ARE THOSE METHOD WHICH CAN BE ACCESS WITHOUT THE OBJECT
    // METHOD CAN USED THE ACCESS MODIFIER


    // ALL THE METHODS HAVE SAME NAME WHICH IS KNOW AS METHOD-OVERLOADING


    public int myMethod(int a , int b){   // return type method
        return a+b;
    }

    public void myMethod(double a , double b){  // non return type
        double c = a+b;
        System.out.println(c);
    }

    public static int myMethod(float a , float b){  // static return type
        return (int) ((float)a+(float) b);
    }

    public static void myMethod(int a , int b, int c){  // static non return type
        int d = a+b+c;
        System.out.println(d);
    }

    public static void main(String[] args) {
        // YOU CAN ACCESS STATIC METHOD WITHOUT THE CREATING OF OBJECT
        // YOU CAN ACCESS OTHER METHODS WITH THE CREATING OF OBJECT
        // YOU CAN PASS THE ARUGUMENT

        myMethod(3.3f, 4f);  // static type return type
        myMethod(2,4,6);  // static type non return type

        METHODS myObj = new METHODS();  // object
        myObj.myMethod(2,3);  // return type only access via object
        myObj.myMethod(2.33d,4.55d);  // non return type only access via object


    }
}
