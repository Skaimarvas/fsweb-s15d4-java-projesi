package com.workintech.binary;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class binary {
    public static void main(String[] args) {

        System.out.println(convertBinary(5));
        System.out.println(convertBinary(6));
        System.out.println(convertBinary(13));


    }

    public static LinkedList<Integer> convertBinary(int number){
        //stact LIFO
        Stack<Integer> remainStack = new Stack<>();
        LinkedList<Integer> result = new LinkedList<>();

        while(number> 0 ){
            int remain = number % 2;
            remainStack.push(remain);
            number = number / 2;
        }

        Iterator<Integer> iterator = remainStack.iterator();
        while(iterator.hasNext()){
            Integer binary = iterator.next();
            result.push(binary);
        }




        return result;
    }
}
