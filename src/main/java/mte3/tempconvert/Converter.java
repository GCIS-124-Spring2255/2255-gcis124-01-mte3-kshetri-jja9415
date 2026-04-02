// Exam: 2255 GCIS 124, Mid Term Exam #3, Question 1
// Filename: Converter.java (inside tempconvert package)

package mte3.tempconvert;
import java.util.Scanner;

public class Converter {
    
    private static class CelsiusToFahrenheit implements TempConvert {

        @Override
        public double convert(double temp) {    return temp * 9.0 / 5.0 + 32;    }
        
    } // CelciusToFahrenheit closed

    public static void main(String[] args) {
        
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Please enter temperature (for conversion): ");

            // (part 1) conversion from C to F
            
            
            // (part 2) conversion from F to C
            
            
            // (part 3) conversion from F to K
            


        }  // try { } block closed

    } // main () method closed

} // Converter { } class closed