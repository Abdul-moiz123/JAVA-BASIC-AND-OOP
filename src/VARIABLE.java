public class VARIABLE {
    public static void main(String[] args) {

        // 1) VARIABLE ARE A COINTAINER USED TO STORE VALUE IN IT
        // 2) JAVA IS TYPE LANGUAGE DUE TOTHIS WE HAVE TO DEFINE THE TPE OF VARIABLE BEFORE IT
        // 3) THE ARE TWO TYPE OF DATA (PRIMITIVE AND NON-PRIMITIVE)
        // 4) PRIMITIVE DATA --> INT,DOUBLE,SHORT,LONG,CHAR,BOOLEAN,FLOAT,BYTE
        // 5) NON-PRIMITIVE DATA--> STRING,ARRAY,CLASS

//        HOW TO DEFINE THE VARIABLE:-

        String name = "ABDUL MOIZ";
        int a = 233443444;
        byte b = 100;
        short c = 12345;
        long d = 234345345;
        char e = 'a'; // 'A' OR 64 (ASCII CODE)
        float f = 2.345f;
        double g = 5.333333333d;
        boolean h = true; // false


        // crete first and assign after
        int aa;
        a=23;

        // create multiple variable of same type and assign different value
        int bb,cc,dd;
        bb=2;
        cc=4;
        dd=55;

        //  create multiple variable of same type and assign same value
        int qq,ww,ee;
        qq=ww=ee=67;

        // you can also change the value (modify the variable)
        qq=34;

        // final variable (constant value)
        // this value cannot be change or modify
        final Double pie = 3.412;

        // how to display variables / comblie two variable / combine string to variable

        System.out.println("hello my name is : "+ name); // use (+) to combine text with variable  (works as combining the text and var )

        System.out.println(2+3); // it will give the addition result (works as addition operator)

        String fname = "abdul";
        String lname = "moiz";
        System.out.println("my name is : "+fname+" "+lname);

    }
}
