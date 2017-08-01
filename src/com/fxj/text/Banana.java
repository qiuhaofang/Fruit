package com.fxj.text;

/**
 * Created by Administrator on 2017/7/28.
 */
public class Banana extends Fruit{

    public void Banana(){
        this.name="香蕉";
        this.taste="味道不错";
        System.out.println(name + "：\n口感： " + this.taste);
    }

    public static void eat(){
        System.out.println("吃法: 需要削掉皮之后再吃！" );
    }

}
