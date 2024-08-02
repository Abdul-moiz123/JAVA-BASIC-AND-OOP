public class WHILE_LOOP {
    public static void main(String[] args) {

        // WHILE LOOP IS USED WHEN YOU HAVE TO REPEAT SOME TASK BUT DONOT KNOW
        // HOW MANT TIME , FOR THIS WE USED WHILE LOOP WITH SOME SPECIFIC CONDITION

        // this loop will work contious until the given condition is become false
        // once the condition become false it will stop working and came out of loop

        int i =0;
        while(i<=10){
            System.out.println(i);
            i++;
        }

        // do-while loop is a type of while loop that works as
        // first its run the code and than check the condition
        // if the condition is false
        // it will surely run once (no matter condition is true or false)

        int j = 0;
        do{
            System.out.println(j);
            j++;
        }while (j<5);



    }
}
