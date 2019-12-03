class fibonacciSpace {
    /* With the fibonacciDynamic program, memory is 
       being consumed because we store ALL past values in 
       an array. We can fix this to optomize memory space
       by only storing the previous 2 values necessary for
       the next calculation.
    */

    static int optimizeSpace(int n) {

        /* We don't need an array since we only
           Care about saving 2 values each loop */
        int x = 0, y = 1, z;

        //Deal with base case
        if(n == 0) {
            return a;

        //Use a for loop to determine the 2 values to store for the 
        //Next iteration  
        for(int i = 2; i <= n; i++) {

            z = x + y;
            x = y;
            y = z;
        }
        return y;

    }

    public static void main(String args[]) {
        int a = 50;
        System.out.println(optimizeSpace(a));
    }


    }

}













