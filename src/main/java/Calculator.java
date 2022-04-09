import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){
        //System.out.print("Helllo");
        Scanner scanner=new Scanner(System.in);
        Calculator scientificCalculator=new Calculator();
        int choice=0;
        boolean done=false;
        while(!done){
            System.out.print("\n------------Scientific Calculator-----------");
            System.out.print("\n1-Squareroot");
            System.out.print("\n2-Factorial");
            System.out.print("\n3-Natural Logarithm");
            System.out.print("\n4-Power function");
            System.out.print("\n5-Exit");
            System.out.print("\nEnter choice:");
            choice= scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.print("\nEnter a number:");
                    double number=scanner.nextDouble();
                    double sqrt=scientificCalculator.squareroot(number);
                    System.out.print("\nSquare root of "+number+" = "+sqrt);
                    break;

                case 2:
                    System.out.print("\nEnter integer number:");
                    int num=scanner.nextInt();
                    int factorial= scientificCalculator.factorial(num);
                    System.out.print("\nFactorial of "+num+" = "+factorial);
                    break;

                case 3:
                    System.out.print("\nEnter a number:");
                    double num1=scanner.nextDouble();
                    double log=scientificCalculator.naturalLog(num1);
                    System.out.print("\nNatural log of "+num1+" = "+log);
                    break;

                case 4:
                    System.out.print("\nEnter a number:");
                    double num2=scanner.nextDouble();
                    System.out.print("\nEnter the power:");
                    double num3=scanner.nextDouble();
                    double power=scientificCalculator.power(num2,num3);
                    System.out.print("\n "+num2+" to the power of "+num3+" = "+power);
                    break;

                case 5:
                    System.out.print("\nExiting......");
                    done=true;
                    break;
            }
        }

    }

    public double squareroot(double number){
        return Math.sqrt(number);
    }

    public int factorial(int number){
        int fact=1;
        while(number>0){
            fact=fact*number;
            number--;
        }
        return fact;
    }

    public double naturalLog(double number){
        return Math.log(number);
    }

    public double power(double number,double pow){
        return Math.pow(number,pow);
    }
}