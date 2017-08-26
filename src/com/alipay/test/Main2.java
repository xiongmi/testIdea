package com.alipay.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by qian on 2017/8/22.
 */
public class Main2 {
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);

    while(s.hasNext())
    {

      String[] save=s.nextLine().split(" ");
      //int revert[]=new int[save.length];

      ArrayList<Integer>revert2=new ArrayList<>();
      for(int i=0;i<save.length;i++)
      {
        revert2.add(Integer.parseInt(save[i]));
      }

      int k=s.nextInt();

      Collections.sort(revert2);

      System.out.println(revert2.get(revert2.size()-k));



    }
  }
}

