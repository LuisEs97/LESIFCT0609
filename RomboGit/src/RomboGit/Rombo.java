package RomboGit;

public class Rombo {
	 
    public static void main(String[] args)
    {
        System.out.println("Hola, este es el cambio que acabo de hacer a ver si va\n");
    	
    	int max=30;
        int i=0,j=0,k=0;
 
      
        if(max%2==0)
        {
            max++;
        }
 
      
        for(i=1;i<=max;i=i+2)
        {
     
            for(k=max+1;k>=i;k=k-2)
            {
                System.out.print(" ");
            }
      
            for(j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
   
        for(i=max;i>=1;i=i-2)
        {
         
            for(k=i;k<=max+2;k=k+2)
            {
                System.out.print(" ");
            }
            
            for(j=i-2;j>0;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}