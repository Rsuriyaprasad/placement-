#include<stdio.h>
#include<string.h>
long nthfibonacci(int input1)
 if(input1 == 1)
    {
        return 0;
    
    }
     if(input1 == 2)
    {
        return 1;
    
    }
    if(input1 == 3 )
     {
         return 1;

     }

     else
      return nthFibonacci(input1-1) + nthFibonacci(input1-2);
       
    
    

}
