package com.chen.google.guava;

import com.google.common.base.Preconditions;

/**
 * @author liang.chen
 * @date 2016-11-15
 */
public class PreconditionsDemo {

    public static void main(String[] args) {
        try {
            PreconditionsDemo demo = new PreconditionsDemo();

//            String test = (" ");
//            if(Strings.isNullOrEmpty(test)){
//                System.out.println("null or empty");
//            }else {
//                System.out.println("not null or emtpy");
//            }

//            System.out.println(Strings.padEnd("123", 5, '0'));

//        demo.doSomething(" ", 19, "hello world, hello java");
//            Preconditions.checkNotNull(null, "xx can not be null");
//            int index = Preconditions.checkElementIndex(3, 3, "TEST");
//            System.out.println("index:" + index);
        }catch (Exception e) {
            System.out.println("dd:" + e.getMessage());
        }

    }

    public void doSomething(String name, int age, String desc) {
        Preconditions.checkNotNull(name, "name may not be null");
        Preconditions.checkArgument(age >= 18 && age < 99, "age must in range (18,99)");
        Preconditions.checkArgument(desc !=null && desc.length() < 10, "desc too long, max length is %s", 10);

        //do things
    }
}
