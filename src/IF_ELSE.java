public class IF_ELSE {
    public static void main(String[] args) {

        // IF AND ELSE ARE USED IF YOU HAVE MANY ANSWER TO RESPOSIBE ACCOORDING TO THEIR ANSWER

        int age = 3;
        if(age>=18){
            System.out.println("you are an adult");
        }else{
            System.out.println("you are not an adult");
        }


        int day = 5;
        if(day==1) System.out.println("monday");
        else if (day==2) System.out.println("tuesay");
        else if (day==3) System.out.println("wednesday");
        else if (day==4) System.out.println("thrusday");
        else if (day==5) System.out.println("friday");
        else if (day==6) System.out.println("saturaday");
        else if (day==7) System.out.println("sunday");
        else System.out.println("invalid input");

        int month=4;
        String monthString="";
        switch (month){
            case 1 :
                monthString="jan";
                break;
            case 2 :
                monthString="feb";
                break;
            case 3 :
                monthString="march";
                break;
            case 4 :
                monthString="apirl";
                break;
            case 5 :
                monthString="may";
                break;
            case 6 :
                monthString="june";
                break;
            case 7 :
                monthString="july";
                break;
            case 8 :
                monthString="aug";
                break;
            case 9:
                monthString="sept";
                break;
            case 10 :
                monthString="oct";
                break;
            case 11 :
                monthString="nov";
                break;
            case 12 :
                monthString="dec";
                break;
            default:
                System.out.println("invalid input");
        }
        System.out.println(monthString);



    }
}
