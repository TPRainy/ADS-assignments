import java.util.Scanner;

public class ADS_Assignment_1{
    static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1 ; i <= n; i++){
            if (i<n) {System.out.print(i+"^2+");
            } else System.out.print(i+"^2=");
        }
        System.out.println(sumOfSquares(n));
        //Complexity of this algorithm is O(n) due to the recursion method for finding the squares of numbers
        // The printing loop adds O(n), but the overall complexity of the algorithm is still O(n)

        System.out.print(sumOfArray(n,sc));
        //Complexity of this algorithm is O(n).
        //Same as previous task but with usage of scanner inside the recursion

        int b = sc.nextInt();
        for (int i=0 ; i <= n; i++){
            if (i<n) {System.out.print(b+"^"+i+"+");
            } else System.out.print(b+"^"+n+"=");
        }
        System.out.println(sumOfPowers(b,n));
        //Complexity of the algorithm is O(n^2) due to the double recursion inside
        //First recursion of finding sum triggers second recursion of finding power of numbers

        reverseArray(n,sc);
        //Complexity of this algorithm is O(n)
        //Similar task to sumOfArray with usage of 1 recursion and scanner inside
        //Shows usage of stack for completing task without implementing arrays or loops

    }

    public static int sumOfSquares(int n){
        if (n==1) return 1;
        return sumOfSquares(n - 1)+n*n;
    }

    public static int sumOfArray(int n,Scanner sc){
        if (n==0) return 0;
        int currentNumber = sc.nextInt();
        return sumOfArray(n-1,sc) + currentNumber;
    }

    public static int sumOfPowers(int b, int n){
        if (n==0) return 1;
        return sumOfPowers(b,n-1)+pow(b,n);
    }

    public static int pow (int b, int n){
        if (n==0) return 1;
        if (n==1) return b;
        if (n==2) return b*b;
        return pow(b,1) * pow(b,n-1);
    }

    public static void reverseArray(int n,Scanner sc){
        if (n==0) return;
        int currentNumber = sc.nextInt();
        reverseArray(n-1,sc);
        System.out.print(currentNumber+ " ");
    }

}


