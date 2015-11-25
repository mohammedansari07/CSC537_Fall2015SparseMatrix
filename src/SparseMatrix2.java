package sparsematrix;

import java.util.ArrayList;
import java.util.Scanner;
public class SparseMatrix2
{
    public static void main(String args[])
    {
 	int i, j, zero = 0, count = 0; 
 	int array[][] = new int[10][10];
 	ArrayList al=new ArrayList();
 	System.out.println("Enter total rows and columns: ");
 	Scanner s = new Scanner(System.in);
 	int row = s.nextInt();
 	int column = s.nextInt();
 	int k=0;
 	int yrow[]=new int[row];ArrayList yrows=new ArrayList(); ArrayList ycolumn=new ArrayList();
 	System.out.println("Enter  non-zero elements");
 	int z=s.nextInt();
 	ArrayList al1=new ArrayList();Randomvalues r=new Randomvalues();
 	al1=r.values(z, row*column);
 	
        for(i = 0; i < row; i++)
        {
            for(j = 0; j < column; j++) 
    	    {
            	
                 array[i][j] = (int) al1.get(k);
                 k++;
                 //System.out.print(" ");
    	     }
        }
        for(i = 0; i < row; i++)
        {
            for(j = 0; j < column; j++) 
    	    {
                 System.out.print("\t"+array[i][j]);
                
    	     }
            System.out.println("");
        }
        for(i = 0; i < row; i++)
        {
 	    for(j = 0; j < column; j++) 
  	    {
                if(array[i][j] == 0)
    		{
        	    zero++; 
    		}
    	   	else
            	{
    	   		yrows.add(i);
    	   		ycolumn.add(j);
    	   		al.add(array[i][j]);
      	           // count++;
    	    	}
   	   }
       }
       if(zero>count)
       {
           System.out.println("Yale algoritham implementation");
          System.out.print("A");
           for(i=0;i<al.size();i++){
        	   
        	   System.out.print(" \t"+al.get(i));
           }
           System.out.println("");
           System.out.print("IA");
           for(i=0;i<yrows.size();i++){
        	   System.out.print("\t"+yrows.get(i));
           }
           System.out.print("\t"+al.size());
           System.out.println("");
           System.out.print("JA");
           for(i=0;i<ycolumn.size();i++){
        	   System.out.print("\t"+ycolumn.get(i));
           }
       }
       else
       {
           System.out.println("the matrix is not a sparse matrix");
       }
    }
}
