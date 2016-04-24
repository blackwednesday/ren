package com.java.ch13;
import java.util.Scanner;
public class S{
public fruit[] fruits;
public int index;
public int add(int a){

return a*a;

}
public void menu(){
System.out.println("*******水果的价格*******");
System.out.println("******1.苹果：2元*******");
System.out.println("******2.香蕉：3元*******");
System.out.println("******3.菠萝：4元*******");
System.out.println("******4.葡萄：5元*******");
System.out.println("******5.橘子：2元*******");
System.out.println("************************");

}
public static void main(String[] args){
S s=new S();
 s.menu();
 System.out.println("请输入您需要买的水果");         
}
}






