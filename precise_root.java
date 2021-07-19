/**
 * Program of Finding Square Root of a Number using Binary Search
 * 19th July , 2021
 * Anupam Gupta - 1910990303
 */
import java.util.Scanner;

class precise_root
{
    static float binary_search(int number,int precision)
    {
       int left =  0;
       int right = number;
       int mid,i;
       double ans = 0.0;
       
       //Binary Search
       while (left<=right)
       {
         mid = (left+right)/2;
         
         if (mid*mid == number)
         {
             ans = mid;
             break;
         }
         if (mid*mid < number)
         {
             left = mid+1;
             ans = mid;
         }
         else
         {
             right=mid-1;
         }
       }
       
       double deci=0.1;
       
       //getting square root in decimal to the given precision
       for (i = 0;i < precision;i++)
       {
           while (ans*ans <= number)
           {
               ans += deci;
           }
           
           ans = ans - deci;
           deci = deci/10;
       }
       
       return (float)ans;
    }
    
    //getting input value
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int number,precision;
        number = sc.nextInt();
        precision = sc.nextInt();
        System.out.println(binary_search(number,precision));
    }
}