class fibonacci {

    static int fibonacciSequence {

        //Check base case 1st! 1 & 0 are special values
        if(n <= 1)
            return n;

        //If not 1 or 0, then use F(N) = F(N-1) + F(N-2)
        return fibonacciSequence(n - 1) + fibonacciSequence(n - 2);

    }

    public static void main (String args[]) {
        int n = 3;
        System.out.println(fibonacciSequence(n));
    }
    
}