//import java.util.Scanner;
//
//public class userIO {
//    public static void main(String[] args) {
//        Scanner scanner= new Scanner(System.in);
//        System.out.println("Enter your name: ");
//        System.out.println("Enter your age:");
//        System.out.println("Enter your address:");
//        String name= scanner.nextLine();
//
//        System.out.println(name);
//    }
//}

//import java.util.Scanner;
//
//public class userIO {
//    public static void main(String[] args) {
//        Scanner scanner= new Scanner(System.in);
//        System.out.println("Enter number a: ");
//        System.out.println("Enter number b:");
//        int sum1= scanner.nextInt();
//        int sum2= scanner.nextInt();
//
//
//        System.out.println(sum1+sum2);
//    }
//}

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;
//import java.util.Scanner;
//import java.util.Scanner;
//
//class SimpleInterest{
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter principle:");
//        float num1=scanner.nextFloat();
//        System.out.println("Enter time:");
//        float num2=scanner.nextFloat();
//        System.out.println("Enter rate:");
//        float num3=scanner.nextFloat();
//        float num4=(num1*num2*num3)/100;
//        System.out.println("Simple interest is:"+num4);
//    }
//
//
//class Pare{
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter first number:");
//        String num1= scanner.nextLine();
//        System.out.println("Enter second number:");
//        String num2= scanner.nextLine();
//        double numD1=Double.parseDouble(num1);
//        double numD2=Double.parseDouble(num2);
//        double sum= numD1+numD2;
//        System.out.println("The sum of given number is:"+sum);
//        }
//    }
//}

//public class userIO {
//    public static void main(String[] args) {
//        int num1,num2,answer;
//        num1=Integer.parseInt(JOptionPane.showInputDialog("Enter first number"));
//        num2=Integer.parseInt(JOptionPane.showInputDialog("Enter second number"));
//        answer=num1+num2;
//        JOptionPane.showInputDialog("The sum is" + answer);
//
//
//    }
//}

class SimpleInterest{
    public static void main(String[] args) {
        double p,t,r,SI;
        p= Double.parseDouble(JOptionPane.showInputDialog("Enter principle:"));
        t=Double.parseDouble(JOptionPane.showInputDialog("Enter time:"));
        r=Double.parseDouble(JOptionPane.showInputDialog("Enter rate:"));
        SI=p*t*r/100;
        JOptionPane.showMessageDialog(null,"Simple interest is:"+SI);

    }
}


