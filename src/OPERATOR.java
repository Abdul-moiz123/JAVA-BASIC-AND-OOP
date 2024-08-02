public class OPERATOR {
    public static void main(String[] args) {

        // OPERATOR:-

        // 1) THERE ARE TOTAL 4 TYPE OF OPERATOR
        // 2) ARITHEMETIC OPERATOR
        // 3) ASSIGNMENT OPERATOR
        // 4) COMPARISION OPERATOR
        // 5) LOGICAL OPERATOR

        // ARITHEMETIC OPERATOR

        int a = 23;
        System.out.println(2+3);
        System.out.println(2-3);
        System.out.println(2*3);
        System.out.println(2/3);
        System.out.println(2%3);
        System.out.println(a++);  // new value of a is assign (now value of a is 24)
        System.out.println(a--);  //  new value of a is assign (now value of a is 23)
        System.out.println(++a);
        System.out.println(--a);

        // 3) ASSIGNMENT OPERATOR

        int aa=23, bb =55;
        System.out.println(aa+=bb);
        System.out.println(aa-=bb);
        System.out.println(aa*=bb);
        System.out.println(aa/=bb);
        System.out.println(aa%=bb);
        System.out.println(aa^=bb);

        // 4) COMPARISION OPERATOR

        System.out.println(aa==bb);
        System.out.println(aa!=bb);
        System.out.println(aa<=bb);
        System.out.println(aa>=bb);
        System.out.println(a<bb);
        System.out.println(aa>bb);

        // 5) LOGICAL OPERATOR

        System.out.println(aa>bb && bb<aa);
        System.out.println(aa>bb || bb<aa);
        System.out.println(!(aa>bb || bb<aa));
        System.out.println(!(aa>bb && bb<aa));

    }
}
