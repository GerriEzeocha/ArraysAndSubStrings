/**I declare that all material in this assessment task is my own work except where there is clear acknowledgement or reference to the work of others. I further declare that I have complied with, and agree to
abide by, the UIS Academic Integrity Policy at the University website. http://www.uis.edu/academicintegrity
 Date: 02/16/2019*/
package ezeochaTask3;
/** Goal of Task: To implement a method that returns an array of Strings consisting of
 * substrings split by matching delimiters. The output of the Split string is to 
 * include the matching delimiters.
 */

import java.util.*;
public class ezeochaTask3 {

	public static void main(String args[]) {
		//Opened scanner to get user String, with delimiter separated by a space
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string and delimiter separated by space: ");
        String wrdEnt = input.nextLine();
        input.close();
        
        //User string is passed to this method to perform split and print output
        spilt(wrdEnt);
 }
        
    public static String[] spilt(String wrdEnt){
        //delimiter is retrieved from user input and assigned to a Char variable.
        char del = wrdEnt.charAt(wrdEnt.length()-1);
        
        //Delimiter needs to be converted to a String in order to be used to 
        //split a String array. Character.toString() is used to do this.
        String deli = Character.toString(del).trim();
        
        //String Array is created to hold substrings as split by delimiter
        String [] words = wrdEnt.split(deli); 
        
        System.out.println();
        System.out.println("Split List, by and with delimter: ");
        //Using a for-loop, words array is passed through and printed
        for (int i = 0; i < words.length; i++){
             System.out.println(words[i]); 
        //using an if statement, each substring is compared to the delimiter and where
        //there is NO match, delimiter is printed. - 
        //Both statements therefore combine to print/output substrings and delimiter.   
             if(!words[i].equalsIgnoreCase(deli))
            {
                System.out.println(deli);
            }
        }

        return words;    
        }
        
 }

