package practicalseven;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;


public class YearChecker {


  // The reference year for the checking.
  private static final int REFERENCE_YEAR = 2013;


  public static void main(String[] args) {

    // Step One: Declare the starting file and scanner
    File yearInputFile = null;
    Scanner scanner = null;

    // Step Two: Connect the scanner to the input file
    try {
      yearInputFile = new File("inputs/year_input.txt");
      scanner = new Scanner(yearInputFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate the file.");
    }
    
    // Step Three: Display a welcome message and the date

    // Step Four: Read in the year from the file

    // Step Five: Check if it is a leap year and produce "yes"/"no" output

    // Step Six: Check if it is an emergence year and produce "yes"/"no" output

    // Step Seven: Check if it is sunspot year and produce "yes"/"no" output

    // Step Eight: Display the closing message
  }
}
