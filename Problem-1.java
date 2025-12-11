import java.util.Scanner;

public class Calculator{
  public double calculate(double a, double b, String op){
    if(op.equals("add")){
      return a+b;
    }
    else if(op.equals("sub")){
      return a-b;
    }
    else if(op.equals("mul")){
      return a*b;
    }
    else if(op.equals("div")){
      if(b==0){
        System.out.println("Division by zero error");
        return 0;
      }
      return a/b;
    }
    else{
      System.out.println("Invalid Operation");
      return 0;
    }
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a: ");
    double a = sc.nextDouble();
    System.out.println("Enter b: ");
    double b = sc.nextDouble();
    System.out.println("Enter Operation (add/sub/mul/div)");
    String op = sc.next();
    Calculator cal = new Calculator();
    double res = cal.calculate(a,b,op);

    System.out.println("Result = " + res);
  }
}
      
