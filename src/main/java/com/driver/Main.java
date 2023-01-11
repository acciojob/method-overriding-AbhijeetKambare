package com.driver;
class A{
String meth(){
String s="Invoking method from class A";
return s;
}
}
class B extends A{
String meth(){
String s="Method is overridden in Extendend class B";
return s;
}
}
public class Main {
B s=new B();
System.out.println(s.meth());
}
