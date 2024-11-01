package Recursion;

public class Power {
    Power(){

    }
    /*
     * n^y = n*n*n*n*.....*n
     */
    static double power(double base, double exp){
        // return 0;
        double result = 0 ;
        if(base == 0){
            result =  0;
        }
        if(exp == 0){
            result =  1;
        }
        else if(exp > 0){
            result =  base*power(base, exp-1);
        }
        else if(exp < 0){
            result = (1/base)*power(base, exp+1);
        }
        return result;
    }
    public static void main(String[] args){
        // Implementing A code that acts as a Math.pow(n,m)  but now using Recursion
        double num = 2.4;
        double pow = power(num, 16);
        System.out.println(pow);
    }
}
