package com.fxj.text;

/**
 * Created by Administrator on 2017/7/28.
 */
public class Apple extends Fruit{

    public void Apple(){
        this.name="苹果";
        this.taste="吃着香";
        System.out.println(name + "：\n口感： " + this.taste);
    }

    public static void eat(){
        System.out.println("吃法: 需要削掉皮之后再吃！" );
    }

}
