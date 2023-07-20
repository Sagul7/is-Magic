import java.util.Scanner;

public class IsMagic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int x = checkMagic(number);
        if(x == 1) System.out.println(1);
        else System.out.println(0);
    }
    public static int checkMagic(int num)
    {
        while(num>9)
        {
            int sum = 0;
            while(num!=0)
            {
             sum += num % 10;
             num/=10;
            }
            num = sum;
        }
        return num;
    }
}
/*
is Magic?
Given a number A, check if it is a magic number or not.

A number is said to be a magic number if the sum of its digits is calculated till a single
digit recursively by adding the sum of the digits after every addition.
If the single digit comes out to be 1, then the number is a magic number.

Example Input

Input 1:
A = 83557
Input 2:
A = 1291

Output 1:
1
Output 2:
0
 */
