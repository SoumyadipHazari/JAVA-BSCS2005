/*
Write a Java code that takes as input a positive number (length of an array here), and two arrays of that length - one of integers and another of strings. The code must also take an integer and a String as input, and print the number of occurrences of the integer and the string in the integer array and the string array, respectively.

Format of input:
Length of the arrays
Elements in the integer array (in separate lines)
Element to count in the integer array
Elements in the string array (in separate lines)
Element to count in the string array

Variables used in the code: 
len - represents length of array
s1 - represents an element to be counted for in Integer array 
s2 - represents an element to be counted for in String array 
*/

package Week_5;

import java.util.*;
class ArrayExample <T>{
    T[] a;
    // define constructor(s) as needed
    ArrayExample(T[] a){
        this.a =a;
    }
    //define method display() that print the elements of array a
    void display(){
        for (T i: a){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    // define method elementCount(T x) that
    int elementCount(T x){
        int count = 0;
        for (T i: a){
            if(i.equals(x)){
                count++;
            }
        }
        return count;
    }
    //counts the no. of times x is present in the array a 
}


public class grpa2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt(); // Taking input for length of the array
        Integer[] x = new Integer [len];
        for (int i = 0; i < len; i++){
            x[i] = sc.nextInt(); //taking input for string array
        } 
        // write the code here to create an object obj for integer array
        ArrayExample<Integer> obj = new ArrayExample<>(x);
        int s1 = sc.nextInt();
        String[] y = new String[len];
        for (int i = 0; i < len; i++ ){
            y[i] = sc.next();
        }
        // write the code here to create an object obj for string array
        ArrayExample<String> obj1 = new ArrayExample<>(y);
        String s2 = sc.next ();
        obj.display();
        System.out.println(obj.elementCount(s1));
        obj1.display();
        System.out.println(obj1.elementCount(s2));
    }
}
