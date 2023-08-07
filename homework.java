import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.



/* 1.write a program to print 1 to N natural number using while loop ;
        2.do the same using do while;
        3.1 to n natrural number using for loop;
        4.calculator using switch case;
        5.write a program to calculate a facrorial of number;
        6.write a program to print the table of a number;*/



public class homework {
    public static int fact(int f){
        if(f==0)
            return 1;
        else
            return f*fact(f-1);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number you want the natural numbers to be up to");


        int a=sc.nextInt();
        System.out.println("nautural number using while loop");
        int i=1;
        while (i<=a){
            System.out.println(i);
            i++;
        }

        System.out.println("natural number using for loop");
        for(i=1;i<=a;i++){
            System.out.println(i);
        }

        System.out.println("calculator using switch case");
        System.out.println("enter values of x and y");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("enter operation");
        String operation=sc.next();
        switch (operation){
            case "+":
                System.out.println("sum="+(x+y));
                break;
            case "-":
                System.out.println("subtraction="+(x-y));
                break;
            case "/":
                System.out.println("division="+(x/y));
                break;
            case "%":
                if(y==0){
                    System.out.println("denominator can't be zero");
                    break;
                }
                else {
                    System.out.println("remainder=" + (x % y));
                    break;
                }
            case "*":
                System.out.println("multiplication="+(x*y));
                break;
            default:
                System.out.println("unknown operation");

        }
        System.out.println("factorial of a number");
        System.out.println("enter the number");
        int num=sc.nextInt();
        System.out.println("factorial="+fact(num));

        System.out.println("table of a number");
        int number=sc.nextInt();
        for(int t=1;t<=10;t++){
            System.out.println(number+"*"+t+"="+number*t);
        }


    }

}