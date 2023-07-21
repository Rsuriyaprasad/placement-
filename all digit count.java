import java.io.*;
import  java.util.*;
class usermaincode
public int allDigitscount(int input1)
   int count=0,i;
		while(input1>0)
        {
         input1=input1/10;
          count++;
        }
        return count;
	}
}
