import java.io.*;
import java.lang.Math;
import java.util.Scanner;

class Main{
  
  public static void main (String[] args){
    Scanner scan = new Scanner(System.in);
    
    /**
    * Why do we got some strings initialized and some not? (returnedDate vs returnedDate = "")
    * all these values can be ints (change the strings to ints) (Later in the code you turn them into ints using Integer.parse) Why don't you just input them as ints
    * Keep a consistent naming convention it makes it way easier to follow: ex: returnedDate, returnedYear, returnedMonth etc etc
    **/
    String returnDate, dueDate, day, month = "", year = "", dDay, dMonth = "", dYear = "";

    int dueDay, dueMonth, dueYear, returnDay, returnMonth, returnYear;
    int fine = 0;

    /*I feel like these counts are not necessary*/
    int count = 0, count2 = 0;
    boolean printFine = true;
    
    System.out.println("Input the Return Date and Expected Date: ");
    /**
    * If you use scan.nextInt() you can input int by int
    * if you do this:
    * dueDay = scan.nextInt();
    * dueMonth = scan.nextInt();
    * dueYear = scan.nextInt();
    * returnedDay = scan.nextInt();
    * returnedMonth = scan.nextInt();
    * returnedYear = scan.nextInt();
    * 
    * if the user types: 6 6 2015 **Presses enter** then types 9 6 2015 
    * The scanner will automatically find the next int and put it into the digits!
    * YOU DON"T HAVE TO GO CRAZY PARSING THE STRINGS INTO INTS OR WHATEVER
    **/

    returnDate = scan.nextLine();
    dueDate = scan.nextLine();
    
    //////Get the values of Return Date into integers
    day = returnDate.substring(0,2);
        if(day.charAt(1) == ' '){
          day = returnDate.substring(0,1);
        }
    for(int i = 0; i < returnDate.length(); i++){
      
      if(count  == 1 && returnDate.charAt(i) == ' '){
        year = returnDate.substring(i+1, i + 5);
      }
      else if(returnDate.charAt(i) == ' '){
        month = returnDate.substring(i+1, i+3);
        if(month.charAt(1) == ' '){
          month = returnDate.substring(i+1, i+2);
        }
        count++;
      }
    }
    
    returnDay = Integer.parseInt(day);
    returnMonth = Integer.parseInt(month);
    returnYear = Integer.parseInt(year);
      
    //////Get the values of Due Date into integers
    dDay = dueDate.substring(0,2);
        if(dDay.charAt(1) == ' '){
          dDay = dueDate.substring(0,1);
        }
    for(int i = 0; i < dueDate.length(); i++){
      
      if(count2  == 1 && dueDate.charAt(i) == ' '){
        dYear = dueDate.substring(i+1, i + 5);
      }
      else if(dueDate.charAt(i) == ' '){
        dMonth = dueDate.substring(i+1, i+3);
         
        if(dMonth.charAt(1) == ' '){
          dMonth = dueDate.substring(i+1, i+2);
        }
        count2++;
      }
   }
    
    dueDay = Integer.parseInt(dDay);
    dueMonth = Integer.parseInt(dMonth);
    dueYear = Integer.parseInt(dYear);
    

    /**
    * This is all fine but the question says that the values are within the proper ranges
    * It's good to always be pessimistic and assume that people are trying to break your stuff but 
    * for future you don't got to do this
    **/
    ///////////////check if they are in range for Return dates
    if(returnDay < 1 || returnDay > 31){
      System.out.println("ERROR: Return Day is too large or small.");
      printFine = false;
    }
    
    if(returnMonth < 1 || returnMonth > 12){
      System.out.println("ERROR: Return Month is too large or small.");
      printFine = false;
    }
    
    if(returnYear < 1 || returnYear > 3000){
      System.out.println("ERROR: Return Year is too large or small.");
      printFine = false;
    }
    
    //////////////////////check range for Due Dates
    if(dueDay < 1 || dueDay > 31){
      System.out.println("ERROR: Expected Day is too large or small.");
      printFine = false;
    }
    
    if(dueMonth < 1 || dueMonth > 12){
      System.out.println("ERROR: Expected Month is too large or small.");
      printFine = false;
    }
    
    if(dueYear < 1 || dueYear > 3000){
      System.out.println("ERROR: Expected Year is too large or small.");
      printFine = false;
    }
    
    /****PERFECT*****/
    ///////Calculating the Money////////////
    if(returnYear == dueYear && returnMonth == dueMonth && returnDay <= dueDay){
      fine = 0;
    }else if(returnYear == dueYear && returnMonth == dueMonth && returnDay > dueDay){
      fine = 15 * (returnDay - dueDay);
    }else if(returnYear == dueYear && returnMonth != dueMonth){
      fine = 500 * (returnMonth - dueMonth);
    }else if(returnYear != dueYear){
      fine = 10000;
    }

    ////output the Fine
    if(printFine){
      System.out.println("Fine = " + fine );
    }
    
  }
}