package com.fxj.text;

import java.util.Scanner;
import java.lang.*;

/**
 * Created by Administrator on 2017/7/28.
 */
public class Fruit {
    public String name = "apple";
    public String taste = "good";

    public static void main(String[] args) {
       Scanner ss = new Scanner(System.in);
       System.out.println("请选择需要购买的水果（1.榴莲  2.苹果  3.香蕉）");
       int indx = ss.nextInt();
       switch (indx){
           case 1:
               Durian dd = new Durian();
               dd.Durian();
               dd.eat();
               break;
           case 2:
               Apple aa = new Apple();
               aa.Apple();
               aa.eat();
               break;
           case 3:
               Banana bb = new Banana();
               bb.Banana();
               bb.eat();
               break;
       }
    }
}



