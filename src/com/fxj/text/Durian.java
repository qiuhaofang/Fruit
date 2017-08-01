package com.fxj.text;

import com.fxj.text.Fruit;
/**
 * Created by Administrator on 2017/7/28.
 */
public class Durian extends Fruit{

    public void Durian(){
        this.name="榴莲";
        this.taste="闻着臭，吃着香";
        System.out.println(name + "：\n口感： " + this.taste);
    }

    public static void eat(){
        System.out.println("吃法: 需要剥掉厚重的外壳之后再吃！" );
    }

}
