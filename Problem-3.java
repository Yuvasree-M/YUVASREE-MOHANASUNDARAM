import java.util.Scanner;

public class Problem_3{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a: ");
    int a = sc.nextInt();
    int n;
    if(a%2 == 0){
      n=a-1;
    }
    else{
      n=a;
    }
    
    for(int i=0;i<n;i++){
      System.out.print((2*i+1) + " ");
    }
  }
}
      
