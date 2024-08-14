package com.javafirst;

import com.javafirst.ArrayIncrementer;

public class ArrayIncrementer {
	
	public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Start from the last digit and move backwards
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;  // Set to 0 if the digit was 9
        }
        
        // If all digits were 9, add a new digit at the front
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        return newDigits;
    }
    
    /* it will Tests plusOne with {1, 2, 3} and Prints the result.*/

    public static void main(String[] args) {
        ArrayIncrementer solution = new ArrayIncrementer();  
        int[] digits = {1, 2, 3};
        int[] result = solution.plusOne(digits);

        // Output the result
        for (int digit : result) {
            System.out.print(digit + " ");
        }
        // Expected Output: 1 2 4
    }

	
	

}
