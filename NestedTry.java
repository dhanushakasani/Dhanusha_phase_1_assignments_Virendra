package abstractclass.java;

public class NestedTry {


public static void main(String[] args) {

    {  
    //outer try block  
     try{    
     //inner try block 1  
       try{    
     
        int a[]=new int[5];    
                a[5]=30/0;    
      }  
       //catch block of inner try block 1  
       catch(ArithmeticException e)  
       {  
         System.out.println("Arithmetic Exception occurs");  
       }    
         
       
       //inner try block 2  
       try{    
        int a[]=new int[5];  
     
       //assigning the value out of array bounds  
        a[6]=4;    
        }  
     
       //catch block of inner try block 2  
       catch(ArrayIndexOutOfBoundsException e)  
       {  
     
       System.out.println("ArrayIndexOutOfBounds Exception occurs");  
   
       }    
     
     }  
     //catch block of outer try block  
     catch(Exception e)  
     {  
       System.out.println("Parent Exception occurs");  
     }    
       finally{  
     System.out.println("rest of the code");    
     }
       
     
   
     }}}

