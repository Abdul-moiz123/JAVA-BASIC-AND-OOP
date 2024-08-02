import java.util.Scanner;
public class INPUT {
    public static void main(String[] args) {

        //INPUT:-

        // 1) YOU HAVE TO IMPORT THE SCANNER CLASS FROM THE JAVA LIBRAY
        // 2) THAN YOU HAVE TU CREATE THE OBJECT FOR THE SCANNER CLSASS INSIDE THE MAIN METHOD
        // 3) THAN YOU CAN ACCESS ALL THE METHOD OF THE SCANNER CLASS BY USING OBJECT NAME WITH (.) DOT
        // 4) YOU CAN ACCESS DIFFERENT METHOD OF DIFFERENT TYPE
        // 5) STRING --> nextLine() , int --> nextInt() , double --> nextDuble() etc


        // OBJECT:-
        Scanner sc = new Scanner(System.in);

        // NOW DISPLAY THE STATEMENT BU USING SOUT:-

        System.out.print("enter the number plz: ");

        // NOW CREATE VARIABLE AND ACCESS THE METHOS BY DOT OPERATOR:-

        int add = sc.nextInt();

        // NOW DISPLAY THE OUTPUT OF THE USER NUMBER:-

        System.out.println(add);


    }
}
