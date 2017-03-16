import java.util.Scanner;
 
class BinarySearch 
{
  public static void main(String args[])
  {
    int c, first, last, middle, n, search, array[];
 
    Scanner in = new Scanner(System.in);	//Its is used to bring the inputs into single value
    System.out.println("Enter number of elements");
    n = in.nextInt(); 				//No. of elements that taking in runtime
    array = new int[n];
 
    System.out.println("Enter " + n + " integers"); 
 
 
    for (c = 0; c < n; c++)
      array[c] = in.nextInt();	//passing the input in single dimension array format
 
    System.out.println("Enter value to find");
    search = in.nextInt();     //Passing the value to search the place
 
    first  = 0;
    last   = n - 1;
    middle = (first + last)/2;			/*Inputs has been divided into two parts as per the 						binary search algorithm*/        
 
    while( first <= last )			//Here Binary search algorithm has been starts here
    {
      if ( array[middle] < search )		//searching in first half of the input
        first = middle + 1;    
      else if ( array[middle] == search ) 	//searching in second half of the input
      {
        System.out.println(search + " found at location  " + (middle + 1) + ".");
        break;
      }
      else
         last = middle - 1;			
 
      middle = (first + last)/2;		//It will divide the 1st/2nd half of input into half
   }
   if ( first > last )
      System.out.println(search + " is not present in the list.\n"); /* message will display if the 										finding number is not in 										input*/
  }
}