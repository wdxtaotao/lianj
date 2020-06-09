package test;

public class Test2 {

    public static void main(String[] args) {

        /*
        //控制的是行数
        for (int i = 1 ; i<=9 ;i++){// 循环一次是输出一行
            //控制的是列数
            for(int j = 1 ;  j<=i;j++){// 循环一次是输出一个表达式
                //  i 1  j 1    1*1=1   \t--> tab
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();//换行
        }

         */

        //数组    容器   有多个数据需要保存的时候用容器
        int[] a = new int[]{1,2,3,4,5};
       // int[] b = {1,2,3,4};
        //  长度是5  下标是0-4
        for (int i = 0 ;i<a.length;i++){
            System.out.println(a[i]);
        }

        //   int  表示的是数组中所放的数据的数据类型   i 自己定义的变量名
        //    a 表示要遍历的数组
        for(int i:a){
            System.out.println(i);
        }









    }

}
