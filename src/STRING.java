public class STRING {
    public static void main(String[] args) {

        //STRING:-

        // 1) text written inside the double quote
        // 2) you can apply many method on string by using dot operator

        // METHODS:-

        String fname = "abdul moiz ";
        String lname = "qayyum";

        System.out.println(fname.length());

        System.out.println(fname.concat(lname));

        System.out.println(fname.charAt(3));

        System.out.println(fname.codePointAt(5));

        System.out.println(fname.codePointCount(2,6));

        System.out.println(fname.codePointBefore(3));

        System.out.println(fname.compareTo(lname));

        System.out.println(fname.compareToIgnoreCase(lname));

        System.out.println(fname.contains(lname));

        System.out.println(fname.contentEquals(lname));

        System.out.println(fname.contentEquals(lname));

        System.out.println(fname.endsWith("z"));

        System.out.println(fname.equals(lname));

        System.out.println(fname.equalsIgnoreCase(lname));

        System.out.println(fname.hashCode());

        System.out.println(fname.indexOf("m"));

        System.out.println(fname.isEmpty());

        System.out.println(fname.lastIndexOf('z'));

        System.out.println(fname.startsWith("abdul"));

        System.out.println(fname.replace('a' , 's'));

        System.out.println(fname.toLowerCase());

        System.out.println(fname.toUpperCase());


    }
}
