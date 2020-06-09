package com;//指定包   指定该类在哪个包中

public class Student {

    private int age ;
    private String name ;

    //get   取值 set  赋值

    //取值
    public int getAge(){
        return age ;
    }

    public void setAge(int age){
        this.age = age ;
    }

    public String getName(){
        return name ;
    }

    public void setName(String name){
        this.name = name ;
    }


    // 访问修饰符  返回类型   方法名称    (参数) {方法体}    定义方法指的是可以做某件事情   什么时候做   调用
    public void doHomework(){
        System.out.println("做作业");
        return ;
    }

    // 如果方法的返回类是是void  可以不写return  如果返回类型   不是void   一定要return
    public int add(int a ,int b ){//  要求的返回类型是int
        int c = a+ b ;
        return c ;
    }


    public String add(String a , String b){
        String c = a + b ;
        return c ;
    }

    //同一个类中  方法名相同   参数不同的方法   称之为方法的重载   重载是一个类  重写两个类



}
