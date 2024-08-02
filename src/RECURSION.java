public class RECURSION {
    // RECURSION IS THE TECHNIQUE OF MAKING THE FUNCTION TO CALL ITSELF

    // THIS HELP TO BREAK THE BIGGER PROBLEMS INTO SMALLER ONE

    // IT WILL NOT STOP UNTILL THE GIVEN CONDITION BECOMES FALSE

    static int num=5;
    static long fact=0;
    public static int fact(int num){
        if(num==0 || num==1){
            return 1;
        }else {
            return num * fact(num-1);
        }
    }

    public static void main(String[] args) {
        long aaa=fact(num);
        System.out.println(aaa);
    }
}
