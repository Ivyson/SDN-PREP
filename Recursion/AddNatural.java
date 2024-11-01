package Recursion;

public class AddNatural {
    public static int add(int number){
        int result = 0;
        if(number == 0){
            return 0;
        }
        else if(number > 0){
            //Add from the number itself and decriment it to zero
            result = number + add(number-1);
        }
        else if(number < 0){
            result = number + add(number+1);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(add(-10));
    }
}
