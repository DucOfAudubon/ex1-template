package aup.cs;

import java.util.Arrays;

/**
 * The class is defined as final since utility classes should not be extensible.
 */

public final class Exercise1 {

    public static void main(String[] args) {
        System.out.println("\n===============Hello=============");
        char testChar = 'a';
        int testInt = testChar;
        boolean[] testArr = new boolean[]{true,false,false,true};
        boolean [] char2bit = char2bitArray(testChar); 
        printCharInt(testChar);
        printIntBase2(testInt);
        printBitArray(testArr);
        System.out.println("This is the char2bitArray method");
        for( int i = 0; i < char2bit.length; i++) {
            System.out.print(char2bit[i]);
        }
    }

    /**
    * Utility classes should not have a public or default constructor.
    */
    private Exercise1() { }

    /**
     * Print 1 character to System.out.
     * For example printCharInt('*') prints 42
     * @param c the character to print
     */

    static void printCharInt(char c) {
      int num = c;
      System.out.println(num);
    }

    /**
     * Print the base 2 of an integer.
     * For example printIntBase2(42) should print 101010
     * @param n the number to print
     */
    static void printIntBase2(int n) {
      String bin = Integer.toBinaryString(n);
      System.out.println(bin);
    }

    /**
     * Print the given bit array to System.out.
     * It should print 1 for each true value and 0 for a false one
     * @param arr the boolean array to print
     */
    static void printBitArray(boolean[] arr) {
      for (int i = 0; i < arr.length; i++){
          int veracity = arr[i] ? 1 : 0;
          System.out.print(veracity);
      }
    }

    // part 2

    /**
     * Convert a char into a 16 bits array.
     * @param c the char to print
     * @return a boolean array of length 16 representing the bit presentation of the character
     */
    static boolean[] char2bitArray(char c) {
      int num = c;
      String Bina = Integer.toBinaryString(num);
      for(int i = Bina.length(); i < 16; i++) {
          Bina = "0" + Bina;
      }
      char[] charBina = Bina.toCharArray();
      int len = charBina.length;
      boolean[] sixteenBit = new boolean[len];
      for(int i = 0; i < len; i++) {
          sixteenBit[i] = (charBina[i] == '1');
      } 
      return sixteenBit;
    }


    /**
     * Convert a 16 bits array into a char.
     * @param arr a boolean array of length 16 representing a bit array
     * @return the character denoted by the bit array
     */
    static char bitArray2char(boolean[] arr) {
      throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Test the previous two coding functions by converting the text into an array of characters.
     * Then for each character, it converts it into a bit array and
     * then converts the bit array back into a character.
     * Finally, the program constructs a new String given an array of all the generated characters.
     * Print the text before and after the transformations.
     * @param text an input string to test
     */
    static void testCoding(String text) {
      throw new java.lang.UnsupportedOperationException();
    }

    // part 3

    /**
     * Computes the next bit of LFSR.
     * @param arr the bit array (initially the seed)
     * @param coefs the binary coefficients
     * @return a boolean the combination of adding the multiplication of each bit with a coefficient
     */
    static boolean feedbackLfsr(boolean[] arr, boolean[] coefs) {
      throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Computes the next state of the bit array.
     * @param arr the bit array (initially the seed)
     * @param coefs the binary coefficients
     * @return the next bit to use for encoding.
     */
    static boolean feedbackUpdateLfsr(boolean[] arr, boolean[] coefs) {
      throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Encode the char by XORing each bit with the returned one from feedbackUpdateLFSR.
     * @param c the char to encode
     * @param arr the bit array (initially the seed)
     * @param coefs the binary coefficients
     * @return the encoded char
     */
    static char encodeCharLfsr(char c, boolean[] arr, boolean[] coefs) {
      throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Encode the char array by encoding each char in it.
     * @param chars the char array to encode
     * @param arr the bit array (initially the seed)
     * @param coefs the binary coefficients
     * @return the encoded char
     */
    static char[] encodeCharArrayLfsr(char[] chars, boolean[] arr, boolean[] coefs) {
      throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Test the LFSR encoding and decoding.
     * 1. copy the bit array (the seed) and put aside
     * 2. Transform the text into a char array
     * 3. Encode using encodeCharArrayLFSR and print
     * 4. Decode the encoded message using the copied seed and encodeCharArrayLFSR and print
     * @param text the text to test
     * @param arr the bit array (initially the seed)
     * @param coefs the binary coefficients
     */
    static void testLfsr(String text, boolean[] arr, boolean[] coefs) {
      throw new java.lang.UnsupportedOperationException();
    }

}
