import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.


        Scanner sc=new Scanner(System.in);
        int a=5;
        int b=6;
        int sum=a+b;
        System.out.println("sum="+sum);


        System.out.println("Area of circle");
        float pi=3.14f;
        int r=10;
        float area = pi * r * r;
        System.out.println(area);


        System.out.println("area of rectangle");
        int length=sc.nextInt();
        int bredth=sc.nextInt();
        int area_rec= length * bredth;
        System.out.println(area_rec);

        System.out.println("simple interest");
        int principle=sc.nextInt();
        int Time=sc.nextInt();
        int interest=sc.nextInt();
        float simple_interesrt=(principle* Time *interest)/100f;
        System.out.println(simple_interesrt);

        System.out.println("leep year");
        int year=sc.nextInt();
        if(year%4==0 || year%400==0 && year%100!=0){
            System.out.println("given year is a leep year");

        }

        System.out.println("even numbers");
        int start=sc.nextInt();
        int end=sc.nextInt();
        for(int i=start;i<=end;i++){
            if(i%2==0)
                System.out.println(i);
        }
        System.out.println("max");
        int first=sc.nextInt();
        int second=sc.nextInt();
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
            System.out.println(num + "is not divisible by 7");
        }

        







        // Press Shift+F10 or click the green arrow button in the gutter to run the code.

    }
}