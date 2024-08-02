//import java.util.Arrays;
//public class ARRAY {
//    public static void main(String[] args) {
//
//        // ARRAY--> USED TO STORE MULTIPLE OBJECT INSTED OF DECLARING VAROUS VARIABLE
//        // YOU CAN CREATE ARRAY OF ONLY ONE TYPE IN JAVA
//
//        // HOW TO DECLAER AN ARRAY:-
//        int [] myArray ={1,2,3,4,5,6,7,8,9};
//
//        // HOW TO ACCESS THE ELEMENTS OF ARRAY:-
//        System.out.println(myArray[3]); // with the help of index(start from 0 , end at n-1)
//
//        // HOW TO CHANGE ONE ELEMENT OF ARRAY:-
//        myArray[3]=55;
//        System.out.println(myArray[3]);
//
//        // METHODS OF ARRAY:-
//        System.out.println(myArray.length);
//        System.out.println(Arrays.stream(myArray).min());
//        System.out.println(Arrays.stream(myArray).max());
//        System.out.println(Arrays.stream(myArray).average());
//        System.out.println(Arrays.stream(myArray).sum());
//
//        // FOR-EACH LOOP IN ARRAY:-
//        for(int myVar : myArray){
//            System.out.println(myVar);
//        }
//
//
//
//        // MULTI-DEMENSION ARRAY :- THESE ARE THE ARRAY SUCH AS ARRAY OF AN ARRAY
//        // IN ORDER WORDS ARRAY CONTAIN OBJECT OF ARRAY
//
//        // HOE TO DECLARE AN MULTI-DEMENSION ARRAY:-
//        int [][] array ={ {1,2} , {3,4} , {5,6} , {7,8,2} };
//        //                  0       1       2       3
//        //                 0,1     0,1     0,1     0,1,2
//
//        System.out.println(array[2][1]); // index 2 of index 1
//
//        array[2][0]=45;
//        System.out.println(array[2][0]);
//
//        // FOR LOOP :-
//
//        for(int i = 0 ; i<array.length ; ++i){
//            for(int j = 0 ; j<array[i].length ; ++j){
//                System.out.println(array[i][j]);
//            }
//        }
//
//    }
//}
