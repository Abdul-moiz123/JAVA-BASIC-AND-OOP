public class FOR_LOOP {
    public static void main(String[] args) {

        // FOR LOOP IS USED WHEN YOU HAVE TO REPEAT SOME TASK AGAIN AND AGAIN IN THE LIMITED TIME

        for (int i = 0 ; i<=10 ; i++){
            System.out.println("2 X "+ i +" "+"= "+i*2);
        }

        int j = 0;
        for(;j<=10;j++){
            System.out.println(j);
        }

        int k = 0;
        for(;k<=10;){
            System.out.println(k);
            k++;
        }

        int l = 0;
        for(;;){
            if(l<=10){
                System.out.println(l);
                l++;
            }
        }
    }
}
