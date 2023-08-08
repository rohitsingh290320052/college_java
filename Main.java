import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.


        Scanner sc=new Scanner(System.in);
        System.out.println("sum of two numbers");
        System.out.println("enter numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("sum="+sum);


        System.out.println("Area of circle");
        float pi=3.14f;
        System.out.println("enter radius");
        int r=sc.nextInt();
        float area = pi * r * r;
        System.out.println(area);


        System.out.println("area of rectangle");
        System.out.println("enter length");
        int length=sc.nextInt();
        System.out.println("enter bredth");
        int bredth=sc.nextInt();
        int area_rec= length * bredth;
        System.out.println(area_rec);

        System.out.println("simple interest");
        System.out.println("principle=");
        int principle=sc.nextInt();
        System.out.println("time=");
        float Time=sc.nextFloat();
        System.out.println("rate=");
        int interest=sc.nextInt();
        float simple_interesrt=(principle* Time *interest);
        System.out.println("simple interest="+simple_interesrt);


        System.out.println("leep year");
        System.out.println("enter year");
        int year=sc.nextInt();
        if(year%4==0 || year%400==0 && year%100!=0){
            System.out.println("given year is a leep year");
        }
        else
            System.out.println("year is not leep");

        System.out.println("even number");
        int num_even=sc.nextInt();
        if(num_even%2==0)
            System.out.println("even");
        else
            System.out.println("not even");
        System.out.println("max");
        System.out.println("first num=");
        int first=sc.nextInt();
        System.out.println("second num=");
        int second=sc.nextInt();
        System.out.println("third num=");
        int third=sc.nextInt();
        if(first>=second && first>=third)
            System.out.println(first +"is greatest");
        else if(second>=first && second>=third)
            System.out.println(second+ "is greatest");
        else{
            System.out.println(third+"is greatest");

        }

        System.out.println("divisible by 6 and 7");
        int num=sc.nextInt();
        if(num%6==0 && num%7==0)
            System.out.println(num + "is diviseble by both 6 and 7");
        else{
            System.out.println(num + "is not divisible by 6 and 7");
        }

        







        // Press Shift+F10 or click the green arrow button in the gutter to run the code.

    }
}