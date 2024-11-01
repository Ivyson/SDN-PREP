package Recursion;

public class Multiplication {
    Multiplication(){

    }
    /*
     * n*m = n added to itself m times
     */
    static double multply(double a, double b){
        double result = 0;
        if( a == 0 || b == 0){
            return 0;
        }
        if(a > 0){
            if(b > 0){
                result = a + multply(a, b-1);
            }
            else{
                result = -a + multply(a, b+1);
            }
        }
        else {
            if(b > 0){
                result = a + multply(a, b-1);
            }
            else{
                result = -a + multply(a, b+1);
            }
        }
        return result;
    }
    public static void main(String[] args){
        double num = 2.0;
        System.out.println(multply(-num, -num));
    }
}
