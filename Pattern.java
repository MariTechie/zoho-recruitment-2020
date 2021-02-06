/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Pattern
{
    public static void main(String[] args)
    {
      int N = 5,i,j,value;
      for (i = 1; i <= N; i++)
      {
          for (j =1; j<=N;j++)
          {
              value = i < j ? i : j;
              System.out.print( N - value + 1 +" ");
          }
          System.out.println();
      }
    }
}