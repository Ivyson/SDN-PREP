package Recursion;

public class AddOdd {
    private static int add(int number){
        int result = 0;
        while(true){
        if(number == 0){
            break;
        }
        else if(number > 0){
            //Add from the number itself and decriment it to zero
            if(number % 2 == 0){
                number--;
                continue;
            }
            else{
                result = number + add(number-1);
                break;
            }
        }
        else if(number < 0){
            if(number % 2 == 0){
                number++;
                continue;
            }
            else{
                result = number + add(number+1);
                break;
            }
        }
        
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(add(-100));
    }
}
