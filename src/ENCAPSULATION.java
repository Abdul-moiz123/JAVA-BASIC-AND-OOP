public class ENCAPSULATION {

    // ENCAPSULATION MEANS BINDING DATA-FIRLD AND METHOD TOGETHER.

    // IF YOU ARE CREATING CLASS YOU ARE DOING ENCAPSULATION

    // ENCAPSULATION ARE THE SECURITY OF DATA-DFEILD AND METHODS THAT YOY WANT TO HIDE FROM USER

    // TO ACHEIVE THIS WE MAKE THE DATA-FIELD PRIVATE AND PRIVIDE THE METHOD (GET AND SET) IN ORDER
    // TO CHANGE THE PRIVATE DATA-FIELD WITHOUT AFFECTING THE CODE

    private String name ;  // PRIVATE DAT-FIELD
    private int age;  // PRIVATE DATA-FIELD

    ENCAPSULATION(){}
    ENCAPSULATION(String name , int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public static void info(String name , int age){
        System.out.println("the name of student is: "+name+" and age of: "+age);
    }

    public static void main(String[] args) {

        info("moiz",19);

        ENCAPSULATION myObj = new ENCAPSULATION();
        myObj.setName("rafay");
        myObj.setAge(89);
        info(myObj.getName(), myObj.getAge());
        info("haseeb",88);
    }

}
