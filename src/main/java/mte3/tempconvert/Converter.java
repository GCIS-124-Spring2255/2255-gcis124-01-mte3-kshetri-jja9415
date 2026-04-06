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
            double inputTemp = scanner.nextDouble();

            
            TempConvert cToF = new CelsiusToFahrenheit();
            double resultCtoF = cToF.convert(inputTemp);
            System.out.println("C to F: " + resultCtoF);

            
            
            TempConvert fToC = (temp) -> (temp - 32) * 5.0 / 9.0;
            double resultFtoC = fToC.convert(inputTemp);
            System.out.println("F to C: " + resultFtoC);

            
            
            TempConvert fToK = (temp) -> (temp - 32) * 5.0 / 9.0 + 273.15;
            double resultFtoK = fToK.convert(inputTemp);
            System.out.println("F to K: " + resultFtoK);
            


        }  // try { } block closed

    } // main () method closed

} // Converter { } class closed

