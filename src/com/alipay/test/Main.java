package com.alipay.test;

import java.util.Scanner;

/**
 * Created by qian on 2017/8/22.
 */
public class Main {
   public static void main(String[] args)
   {
     Scanner s=new Scanner(System.in);

     while(s.hasNext()){//判断是否数据结束

       int result=-1;
       int a=s.nextInt();
       int b[]=new int[a];
       for(int i=0;i<a;i++)
       {
           b[i]=s.nextInt();
         //  System.out.println("i"+b[i]);
       }

       int min=-1;
       int max=-1;
       int sum=0;
       for(int i=0;i<b.length;i++)
       {
         if(i==0)
         {
           min=b[i];
           max=b[i]*b[i];
           sum+=b[i];
         }
         else
         {

           if (b[i] > min) {
              int mintemp=b[i];
              int sumtemp=0;
              for(int j=i;j>0;j--)
              {
                sumtemp+=b[j];
                if (b[j]<mintemp) {
                  mintemp = b[j];
                }
                if(sumtemp*mintemp>max)
                {
                  max=sumtemp*mintemp;
                  //System.out.println("max"+max+"sumtemp"+sumtemp+"mintemp"+mintemp);
                }
              }




           } else {
             max = (sum + b[i]) * b[i];
             min = b[i];
           }
           sum=sum+b[i];
         }

         if(max>result)
         {
            result=max;
         }
       }
         System.out.println(result);
     }
   }
}
