class Address {

    public static void printCircle(PRACTICE c , int n){
        double result=0;
        while(n>=1){
            System.out.println("the radius is: "+c.getRadius()+" and area is: "+ c.area());
            result+=c.area();
            c.setRadius(c.getRadius()+1);
            n--;
        }
        System.out.println("the total arae is: "+result);
    }

    public static void main(String[] args) {
        PRACTICE sw = new PRACTICE(1);
        int n = 5;
        printCircle(sw,n);
    }
}
//    String country,city;
//
//    public Address(String country,String city){
//        this.country=country;
//        this.city=city;
//    }
//}
//
//public class Student {
//    String name ;
//    int rollNo;
//    Address address;
//
//    public Student(String name,int rollNo,Address address){
//        this.name=name;
//        this.rollNo=rollNo;
//        this.address=address;
//    }
//
//    void diaplay(){
//        System.out.println("the name is: "+name+" and roll no is: "+rollNo);
//        System.out.println("the contry is: "+address.country+" and in city: "+address.city);
//    }
//
//    public static void main(String[] args) {
//        Address a1 = new Address("pakistan","karachi");
//        Student s1 = new Student("moiz",23,a1);
//        s1.diaplay();
//    }
//}
