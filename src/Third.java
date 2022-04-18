//public class Third{
//    public static void main(String[] args) {
//        int a = 2;
//        int b = 3;
//        int c = 15;
//        int d = 12;
//        int e =10;
//        System.out.println(a+b);
//        System.out.println(b-a);
//        System.out.println(c/a);
//        System.out.println(e*b);
//        System.out.println(a+b);
//        System.out.println(d%b);
//
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        // create variables
//        int a = 100;
//        int var;
//        // assign value using =
//        var = a;
//        System.out.println("var using =: " + var);
//        // assign value using =+
//        var += a;
//        System.out.println("var using +=: " + var);
//        // assign value using =*
//        var *= a;
//        System.out.println("var using *=: " + var);
//    }
//}

//class Main{
//    public static void main(String[] args) {
//        int a = 9 ,b = 12;
//        System.out.println("a is" + a +"and b is" + b);
//        // == operator
//        System.out.println(a == b);
//        System.out.println(a != b);
//        System.out.println(a > b);
//        System.out.println(a < b);
//        System.out.println(a >= b);
//        System.out.println(a <= b);
//    }
//}

//class Main{
//    public static void main(String[] args) {
//                // && operator
//                System.out.println((5 > 3) && (8 > 5)); // true
//                System.out.println((5 > 3) && (8 < 5)); // false
//                // || operator
//                System.out.println((5 < 3) || (8 > 5)); // true
//                System.out.println((5 > 3) || (8 < 5)); // true
//                System.out.println((5 < 3) || (8 < 5)); // false
//                // ! operator
//                System.out.println(!(5 == 3)); // true
//                System.out.println(!(5 > 3)); // false
//            }
//


//class Practice{
//    public static void main(String[] args) {
//        int a,b,e;
//        String c,d,f;
//        a=3;
//        b=6;
//        e=a;
//        c="hello";
//        d="world";
//        f=d;
//        System.out.println(e<b);
//        System.out.println(f!= c);
//    }
//}


//class Ternary{
//    public static void main(String[] args) {
//        int age = 20;
//        String eligibility;
//        eligibility=(age>20)?"You can vote.":"You cannot vote.";
//        System.out.println(eligibility);
//    }
//}

class Task{
    public static void main(String[] args) {
        int p=10,t=5,r=20;
        int SI;
        int base=4,height=5;
        int area;
        int volume;
        int length=2, breadth=3,height1=4;
        int volumeCuboid;
        SI=p*t*r/100;
        System.out.println("SI is:"+SI);
        area=base*height;
        System.out.println("Area of triangle is:"+area);
        volume=height*height*height;
        System.out.println("Volume of cube is:"+volume);
        volumeCuboid=length*breadth*height;
        System.out.println("Volume of cuboid is:"+volumeCuboid);

    }
}

//

class Student{
    public static void main(String[] args) {
        int maths=40, java=60, python=72,database=81;
        int total;
        float percentage;
        total=maths+java+python+database;
        System.out.println("Total marks of four subjects is:"+total);
        percentage=(total*100)/400;
        System.out.println("Total percentage is:"+percentage+"%");
        if(percentage>=70){
            System.out.println("First Class");
        }
        else if(percentage>59 && percentage<70){
            System.out.println("Upper second class");
        }
        else if(percentage>49 && percentage<59){
            System.out.println("Second class");
        }
        else if (percentage>39 && percentage<49){
            System.out.println("Third class");
        }
        else{
            System.out.println("Fail");
        }
    }
}





