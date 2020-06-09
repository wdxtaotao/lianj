package test;

import com.Student;//导入包   指定在当前文件中    Student 用的是   com.pojo.Student

//什么时候需要导报   使用了其他包中的类  需要导包   同包中的类使用时不需要导包的


public class Test3 {
    public static void main(String[] args) {

        //得到学生对象
        Student student = new Student();
        //没有赋值之前  用默认值
        System.out.println(student.getAge());
        System.out.println(student.getName());

        //给属性赋值
        student.setAge(38);
        student.setName("菜菜");

        System.out.println(student.getAge());
        System.out.println(student.getName());

        student.doHomework();//调用做作业方法   指的是执行方法中的代码

        int a = student.add(1,2);//接收方法的返回结果
        System.out.println(a);

        //java中  方法的调用  由方法名和参数  共同决定调用哪个方法
        String s = student.add("sun" , "job");
        System.out.println(s);

        //  根据方法名和参数能找到唯一的方法   ok  否则报错


    }
}
