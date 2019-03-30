/*
 * Team 9 - W. Robleh, M. Mariscal, T. Doan, Y. Nikulyak, C. Piwarski
 * CST338 - Software Design
 * Assignment 4
 * 27 March 2019
 */


public class Assign4
{

   public static void main(String[] args)
   {
      // TODO Auto-generated method stub

   }

}


   public interface BarcodeIO {
   /*public mutator methods to accept BarcodeImage as argument and
   store it locally for class data member
   */
	boolean scan(final BarcodeImage bc);
	//accpet string as an argument
	boolean readText(final String test);
	//generate barcodeImage representing loca data memeber text
	boolean generateImageFromText();
	//generate text based on local barCodeImage
	boolean translateImageToText();
	//display prints line out text to console
	void displayTextToConsole();
	//print out image to console
	void displayImageToConsole();
	
   }
