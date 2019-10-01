import java.util.ArrayList;

class Main {

    public static void main(String[] args) {
        // creating an Empty String ArrayList
        ArrayList<String> arr = new ArrayList<String>(4);

        // using add() to initialize values
        // ["geeks", "for", "geeks"]
        arr.add("geek geeks");
        arr.add("for");
        //arr.add("geeks");
        String n2 ="J H SPAANS,BUDDY MED CC,TSHWANE NOOD DIENST";
        String n1 ="BUDDY MED CC";

        if(n2.contains(n1))
            System.out.println("Yes");
        else
            System.out.println("No");
        // use contains() to check if the element
        // "geeks" exits or not
        boolean ans = arr.contains("geeks");

        if (ans)
            System.out.println("The list contains geeks");
        else
            System.out.println("The list does not contains geeks");

        // use contains() to check if the element
        // "coding" exits or not
        ans = arr.contains("coding");

        if (ans)
            System.out.println("The list contains coding");
        else
            System.out.println("The list does not contains coding");
    }
}
