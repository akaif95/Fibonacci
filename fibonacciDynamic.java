class fibonacciDynamic {

    /*The traditional Fibonnaci Method is fine, but
      We can use arrays to hold calculations so that 
      The program doesn't have to recalculate previous
      values */

    static int fibonacciSequence(int n) {

        //Set up a new array to hold a NEW Fibonacci value
        int fibonacciArray[] = new int[n + 2];

        //Set up base-case values 0 & 1
        //From here we can store ALL values to be used
        fibonacciArray[0] = 0;
        fibonacciArray[0] = 1;

        //Use a for loop to loop through the array and use the previous 2 values 
        //For the new value
        for (int i = 2; i <= n; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];

        }
        return fibonacciArray[n]
    }

    public static void main(String args[]) {
        int x = 100;
        System.out.println(fibonacciSequence(x));
    }
}