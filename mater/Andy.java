import java.util.Scanner;

/*HAD TO CHANGE class Andrew to class Andy because that needs to match the file name*/

class Andy {
    public static void main(String[] args)
     {
     Scanner scan = new Scanner (System.in);
     
     int dueday;
     int duemonth; 
     int dueyear; 
     int returnedday;
     int returnedmonth;
     int returnedyear;
     int cost = 0;
     do {
     System.out.println("Please enter the day, month and year of check out");
     dueday = scan.nextInt();
     duemonth = scan.nextInt();
     dueyear = scan.nextInt();
     
     System.out.println("Please enter the day, month and year of the return");
     returnedday = scan.nextInt();
     returnedmonth = scan.nextInt();
     returnedyear = scan.nextInt();
     /**
     * GREAT USE OF A DO WHILE LOOP!
     **/ 
     } while ((1 > dueday || dueday > 31 || 1 > duemonth || duemonth > 12 || 1 > dueyear || dueyear > 3000) || (1 > returnedday || returnedday > 31 || 1 > returnedmonth || returnedmonth > 12 || 1 > returnedyear || returnedyear > 3000));// 1 > D > 31 && 1 > M > 12 && 1 > Y > 3000
     //validation 
     
     
     System.out.println(dueday + " " + duemonth + " " + dueyear);
     System.out.println(returnedday + " " + returnedmonth + " " + returnedyear);
     
     //perfect FOR ALL POSSIBLE 0 FINES
     if (returnedyear < dueyear || (returnedyear <= dueyear && returnedmonth < duemonth) || (returnedyear <= dueyear && returnedmonth <= duemonth && returnedday < dueday)){
       System.out.println(cost); 
     }else if (returnedyear == dueyear && returnedmonth == duemonth && returnedday > dueday){
       cost = ((returnedday - dueday) * 15); //perfect for same month
       System.out.println(cost); 
    }else if (returnedyear == dueyear && returnedmonth > duemonth) { 
      cost = ((returnedmonth - duemonth) * 500); //perfect for different month
      System.out.println(cost);
    }else if (returnedyear > dueyear) { //perfect for different year
      cost = 10000;
      System.out.println(cost); 
    }
    }
}