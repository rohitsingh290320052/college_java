import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.



/* 1.write a program to print 1 to N natural number using while loop ;
        2.do the same using do while;
        3.1 to n natrural number using for loop;
        4.calculator using switch case;
        5.write a program to calculate a facrorial of number;
        6.write a program to print the table of a number;
        7.write a program to reverse a number;
        8.wap for compound interest;
        9.wap a check whether a number is pallendrome or not
        10.wap to print first and last digit of a number
        */



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

        System.out.println("natural numbers using do while loop");
        int w= 1;
        do {
            System.out.println(w);
            w++;
        }
        while (w <= a);

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
                if(y==0){
                    System.out.println("denominator can't be zero");
                    break;
                }
                else
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

        System.out.println("Enter the number you want to check whether it is pallendrome of not");
        int pallen_num=sc.nextInt();
        int final_ans=0;
        int pellen=pallen_num;
        while (pallen_num>0){
            int remainder=pallen_num%10;
            final_ans=(final_ans*10)+remainder;
            pallen_num=pallen_num/10;
        }
        if(final_ans==pellen)
            System.out.println("number is pallendrome");
        else
            System.out.println("number is not pallendrome");

        System.out.println("reverse a number");
        System.out.println("entre the number you want to reverse");
        int reverse_num=sc.nextInt();
        int after_rev=0;
        while (reverse_num>0){
            int rem=reverse_num%10;
            after_rev=(after_rev*10)+rem;
            reverse_num/=10;
        }
        System.out.println("number after reverse="+after_rev);

        System.out.println("first and last digit of number");
        System.out.println("enter num");
        int first_last=sc.nextInt();
        int last_digit=first_last%10;
        while (first_last>10){
            first_last/=10;
        }
        System.out.println("first digit="+first_last);
        System.out.println("last digit="+last_digit);

        System.out.println("compound interest");
        System.out.println("enter principal");
        int principal=sc.nextInt();
        System.out.println("enter interesrt");
        int interest=sc.nextInt();
        System.out.println("enter time");
        float time=sc.nextFloat();
        System.out.println("enter no. of times interest is compounded per year");
        int nu_of_times=sc.nextInt();
        double compound_interest=principal*Math.pow((1+(time/100)),nu_of_times);
        System.out.println("compound interest="+compound_interest);







    }

}