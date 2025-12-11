import java.util.Scanner;
import java.util.Map;
import java.util.LinkedHashMap;

public class Problem_4{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter array size : ");
    int n = sc.nextInt();

    int[] arr = new int[n];
    System.out.println("Enter array elements");

    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }

    Map<Integer,Integer> res = new LinkedHashMap<>();
    for(int i=1;i<=9;i++){
      int count = 0;
      for(int a : arr){
        if(a%i==0){
          count++;
        }
      }
      res.put(i,count);
    }
    System.out.println(res);
  }
}
    
    
