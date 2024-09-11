import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.*;


//Program to sort primitive object 

class JavaObjectSorting{


public static void main(String[] arg){

    int[] arr = {23,22,11,44,55};

    Arrays.sort(arr);

    System.out.println(Arrays.toString(arr));


   String[] a = {"Y","Z","A","B","C","D","E"};

   Arrays.sort(a);

   System.out.println(Arrays.toString(a));


//char[] ch1 = {'d','e','f','g','k','l','e'} ;

char[] JavaCharArray = {'z', 'b', 'c', 'd', 'e'};

Arrays.sort(JavaCharArray);

System.out.println(Arrays.toString(JavaCharArray));


//Arrays.sort(JavaCharArray);

//System.out.println(Arrays.toString(JavaCharArray));


  List<String>  list = new ArrayList<String>();


  list.add("B");
  list.add("C");
  list.add("x");
  list.add("y");
  list.add("w");

  Collections.sort(list);


  System.out.println(list);

    }
    
   }