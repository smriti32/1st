//public class First {
//    public static void main(String[] args){
//        System.out.println("\'smriti\' sharma");
//        System.out.println("\\Hello world");
//        System.out.println("\fHello world\f");
//        System.out.println("\bHello\b");
//        System.out.println("Hello\rsmriti");
//        System.out.println("\"smriti\"");
//        System.out.println("1 \n \t 2 \n \t\t 3 \n \t\t\t 4 \n \t\t\t\t 5");
//    }

//import java.util.Arrays;}
//class Hlo {
//public static void main(String[] args) {
//      System.out.println("Hello");
//    }
//}

//this is single line comment

import java.sql.Array;
import java.sql.SQLOutput;
//import java.util.Arrays;
//
//public class First {
//    public static void main(String[]args){
//        int[] arr =new int []{1,2,3,4};
//        System.out.println(Arrays.toString(arr));
//    }
//}

//import java.util.Arrays;
//
//public class First {
//    int a;
//    public static void main(String[]args){
//        int[] arr =new int []{1,2,3,4};
//        System.out.println(Arrays.toString(arr));
//        First smriti = new First();
//        System.out.println(smriti.a);
//    }
//}


import java.util.Arrays;

public class First {
    int a; //instance variable
    static int b=6; //class/static variable
    public static void main(String[]args){
        int[] arr =new int []{1,2,3,4};
        System.out.println(Arrays.toString(arr));
        First smriti = new First();
        System.out.println(smriti.a);
        System.out.println(b);
        smriti.printName();
    }
    public void printName(){
        String name = "Smriti Sharma";//local variable
        System.out.println(name);
    }
}





