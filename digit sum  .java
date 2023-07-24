import java.io.*;
import  java.util.*;
 class usermaincode
public int digitsum(int input1)

int rem,sum=0;
        while(input1/10!=0)
        {
         while(input1!=0)
         {
             rem = input1%10;
             sum = sum+rem;
             input1 = input1/10;

         }
         input1=sum;

	}
    return sum;

}
}
