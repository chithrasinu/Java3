package stringpractice;

import java.util.Arrays;

public class SplitPractice {
    public static void main(String[] args) {
        String vowels = "a::b::c::d:e";

        // splitting the string at "::"
        // storing the result in an array of strings
        String[] result = vowels.split("::");
      //// String[] newArray =Arrays.toString(result);

        // converting array to string and printing it
       // System.out.println(result);
        System.out.println("result = " + Arrays.toString(result));
    }
}


