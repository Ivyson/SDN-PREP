import java.util.*;
import java.io.*;
public class Task1{
    static Scanner scanner = null;
    Task1(){
        
    }
    public static void main(String[] args){
        String regex = "[aeiouAEIOU]";        
        scanner = new Scanner(System.in);
        System.out.printf("Enter a random Sentence: ");
        String sentence = scanner.nextLine();
        System.out.println(sentence);
        // System.out.println(sentence);
        // Remove non-word characters and tokenize the sentence
        String[] tokens = sentence.split("\\W+");
        System.out.println(tokens[1]);
        String[] Capitalise = new String[tokens.length];
        int count = 0;
        for(int i  = 0; i < tokens.length; i++){
            if(Character.toString(tokens[i].charAt(0)).matches(regex))
            {
                count++;
            }
            Capitalise[i] = Character.toString(tokens[i].charAt(0)).toUpperCase();
            // System.out.println(tokens[i]);
            Capitalise[i] += tokens[i].substring(1);
            System.out.println(Capitalise[i]);
        }
        // // Determine the number of words that make up the string
        
        System.out.println(count);
        int length = Capitalise.length;
        String string = "Your String Has "+length+" of Words\nYour sentence has "+count+" Words starting with a Vowel";
        System.out.println("Your String Has "+length+" of Words\nYour sentence has "+count+" Words starting with a Vowel");
        try {
            // FileWriter file = new FileWriter("Strings_And_File_Text.txt");
            FileWriter file = new FileWriter("/Users/sam/Downloads/SDN-PREP/Strings And File/Text.txt");
            System.out.println("Writing to file: " + file.toString());
            file.append(string);
            file.append("\n");
            for(String word : Capitalise){
                file.append(word+"\n");
            }
            // Read the content currently stored within the file
            // BufferedReader reader = new BufferedReader(new FileReader("/Users/sam/Downloads/SDN-PREP/Strings And File/Text.txt"));
            // String line;
            // System.out.println("Current content of the file:");
            // while ((line = reader.readLine()) != null) {
            //     System.out.println(line);
            // }
            // reader.close();
            file.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error Occured"+e);
        }
    }
}