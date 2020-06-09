package test;

public class Test {
    public static void main(String[] args) {

        /*
        int a = 10;
      //  a=a+10;  // a+10;
        System.out.println(a);
        a+=10;
        System.out.println(a);
        */

        //int以及int以下的数据类型进行数学运算结果是 int

        /*
        byte a = 10 ;
        //a = (byte)(a + 10);//
        a+=10;
        System.out.println(a);
         */

        //小数默认是double    大转小  强转
        //float f = (float)1.234;

        /*
        int i = 10;
        System.out.println(i++);//10  i 11
        System.out.println(++i);// 12
         */

        /*
        System.out.println(1>2);// false
        System.out.println(1!=2);
         */

        /*
        System.out.println(true&& false);
        System.out.println(true & false);
        //  与  有假为假    或  有真就为真   ^  相同为假  不同为真
        System.out.println(true ^ false);
        System.out.println(4 | 5);// 如果 & 左右两边是数字   位运算

        //短路
        int i =10;
        if(i>10 || i++>10){// i>10  false   短路条件  假与真或
            System.out.println(i);
        }
        System.out.println(i);

         */

        //三元  a(boolean)  ? b  :  c
        //System.out.println(1>2 ? 1 : 2);

        /*
        if(1<2) {
            System.out.println(1);
        }
        else {
            System.out.println(2);
            System.out.println(3);
        }

         */

        //1.7之前   switch 条件只能是int以及int以下
        // 1.7开始    支持String
        String season = "springs";//季节
        switch (season){
            default:System.out.println("季节有错误");
            case "summer": System.out.println("summer");
            case "autom": System.out.println("autom");
            case "winter": System.out.println("winter");
            case "spring": System.out.println("spring");
        }


    }
}
