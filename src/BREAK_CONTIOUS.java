public class BREAK_CONTIOUS {
    public static void main(String[] args) {

        //BREAK--> WHEN YOUR GIVEN CONDITION IS FALSE IT WILL BREAK THE LOOP
        //         AND CAME OUT OF LOOP AND IGNORE THE OTHER STATMENT NO MATTER WHAT

        for(int i = 0 ; i<=10 ; i++){
            System.out.println(i);
            if(i==5) {
                break;
            }
        }



        // CONTIOUS--> WHEN YOUR GIVEN CONDITION IS FALSE IT WILL LEAVE THAT POINT ONLY
        //             OF THE LOOP AND MOVE TO THE NEXT POINT AND CHECK THE CONDITION

        for (int j = 0 ; j<=10 ; j++){
            if(j%3==0){
                continue;
            }System.out.println(j);
        }


    }
}
