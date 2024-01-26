import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Don't node"));






    }


    public static boolean checkForPalindrome(String text) {

        System.out.println("Initial Text: " + text);
        text = text.replaceAll("[.,'?\\-\\s]","").toLowerCase(Locale.ENGLISH);

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        char[] chars = text.toCharArray();
        for(char c: chars){
            stack.push(c);
            queue.offer(c);
        }

        while(!queue.isEmpty()){
            Character character = queue.remove();
            System.out.println("Character: " + character);
            //stact LIFO;
            //queque FIFO;
            if(character != stack.pop()){
                return false;
            }

        }


        return true;

    }
}