package com.chen.google.guava.collection.order;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author liang.chen
 * @date 2017-03-22
 */
public class ComplexOrderingTest {

    public static void main(String[] args) {


//        List<Person> persons = ImmutableList.of(
//                new Person("d", "a1", 1),
//                new Person("c", "c1", 3),
//                new Person("b", "b1", 2),
//                new Person("c", "b1", 1),
//                new Person("c", "a1", 1)
//        );

        List<OrderConext> orderConextList = new ArrayList<>();

        OrderConext orderConext01 = new OrderConext();
        orderConext01.setUser(new User("a", 1));
        orderConext01.setAddress(new Address("INSTALMENT"));

        OrderConext orderConext02 = new OrderConext();
        orderConext02.setUser(new User("a", 1));
        orderConext02.setAddress(new Address("BORROW_PAYBACK"));

        OrderConext orderConext03 = new OrderConext();
        orderConext03.setUser(new User("b", 1));
        orderConext03.setAddress(new Address("ae"));

        OrderConext orderConext04 = new OrderConext();
        orderConext04.setUser(new User("a", 2));
        orderConext04.setAddress(new Address("ad"));

        orderConextList.add(orderConext01);
        orderConextList.add(orderConext02);
        orderConextList.add(orderConext03);
        orderConextList.add(orderConext04);

        Ordering<OrderConext> ordering = Ordering.from(new Comparator<OrderConext>() {
            @Override
            public int compare(OrderConext left, OrderConext right) {
                return left.getUser().getId() - right.getUser().getId();
            }
        });
        appendByUserName(ordering);
        appendByAddress(ordering);

        List<OrderConext> orderConexts = ordering.sortedCopy(orderConextList);

        for (OrderConext conext : orderConexts){
            System.out.println(JSON.toJSONString(conext));
        }
    }

    public static void appendByUserName(Ordering<OrderConext> ordering) {
        ordering.compound(new Comparator<OrderConext>() {
            @Override
            public int compare(OrderConext left, OrderConext right) {
                return left.getUser().getName().compareTo(right.getUser().getName());
            }
        });
    }

    public static void appendByAddress(Ordering<OrderConext> ordering) {
        ordering.compound(new Comparator<OrderConext>() {
            @Override
            public int compare(OrderConext left, OrderConext right) {
                return left.getAddress().getAddress().compareTo(right.getAddress().getAddress());
            }
        });
    }

}
