package com.chen.google.guava.collection.order;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;

import java.util.Comparator;
import java.util.List;

/**
 * @author liang.chen
 * @date 2016-11-21
 */
public class OrderingTest {
    public static void main(String[] args) {

//        List<Integer> numbers = Lists.newArrayList(30, 20, 60, 80, 10);
//
//        System.out.println("origin list:" + numbers);
//
//        List<Integer> sortList = Ordering.natural().sortedCopy(numbers); //10,20,30,60,80
//
//        System.out.println("Ordering.natural().sortedCopy(numbers) : " + sortList);
//
//
//        List<Integer> reverseList = Ordering.natural().reverse().sortedCopy(numbers); //80,60,30,20,10
//
//        System.out.println("Ordering.natural().reverse().sortedCopy(numbers) : " + reverseList);
//
//        Integer min = Ordering.natural().min(numbers); //10
//
//        System.out.println("Ordering.natural().min(numbers):" + min);
//
//        Ordering.natural().max(numbers); //80
//
//        Lists.newArrayList(30, 20, 60, 80, null, 10);
//
//        List<Integer> nullsList = Ordering.natural().nullsLast().sortedCopy(numbers); //10, 20,30,60,80,null
//        System.out.println("Ordering.natural().nullsLast().sortedCopy(numbers):" + nullsList);
//
//        Ordering.natural().nullsFirst().sortedCopy(numbers); //null,10,20,30,60,80


//        List<Person> persons = ImmutableList.of(new Person("a", "a1", 1), new Person("c", "c1", 3), new Person("b", "b1", 2), new Person("c", "b1", 1));
//
//        Ordering<Person> orderById = new Ordering<Person>() {
//            @Override
//            public int compare( Person left, Person right) {
//                return left.getId()-right.getId();
//            }
//        };
//
//       List<Person> sortPersonList = orderById.sortedCopy(persons);
//        System.out.println("sortPersonList:" + JSON.toJSONString(sortPersonList));
//        System.out.println("sortPersonList:" + JSON.toJSONString(persons));

//        List<Integer> list = Lists.newArrayList(30, 20, 60, 80, 10);
//
//        System.out.println("list:"+ list);
//
//        Ordering<Integer> naturalOrdering = Ordering.natural();
//        Ordering<Object> usingToStringOrdering = Ordering.usingToString();
//        Ordering<Object> arbitraryOrdering = Ordering.arbitrary();
//
//        System.out.println("naturalOrdering:"+ naturalOrdering.reverse().sortedCopy(list));
//        System.out.println("usingToStringOrdering:"+ usingToStringOrdering.sortedCopy(list));
//        System.out.println("arbitraryOrdering:"+ arbitraryOrdering.sortedCopy(list));


        /**************************************************************************************/

//        List<String> list = Lists.newArrayList();
//        list.add("peida");
//        list.add("jerry");
//        list.add("harry");
//        list.add("eva");
//        list.add("jhon");
//        list.add("neron");
//
//        System.out.println("list:"+ list);
//
//        Ordering<String> naturalOrdering = Ordering.natural();
//        System.out.println("naturalOrdering:"+ naturalOrdering.sortedCopy(list));
//
//        List<Integer> listReduce= Lists.newArrayList();
//        for(int i=9;i>0;i--){
//            listReduce.add(i);
//        }
//
//        List<Integer> listtest= Lists.newArrayList();
//        listtest.add(1);
//        listtest.add(1);
//        listtest.add(1);
//        listtest.add(2);
//
//
//        Ordering<Integer> naturalIntReduceOrdering = Ordering.natural();
//
//        System.out.println("listtest:"+ listtest);
//        System.out.println(naturalIntReduceOrdering.isOrdered(listtest));
//        System.out.println(naturalIntReduceOrdering.isStrictlyOrdered(listtest));
//
//
//        System.out.println("naturalIntReduceOrdering:"+ naturalIntReduceOrdering.sortedCopy(listReduce));
//        System.out.println("listReduce:"+ listReduce);
//
//
//        System.out.println(naturalIntReduceOrdering.isOrdered(naturalIntReduceOrdering.sortedCopy(listReduce)));
//        System.out.println(naturalIntReduceOrdering.isStrictlyOrdered(naturalIntReduceOrdering.sortedCopy(listReduce)));
//
//
//        Ordering<String> natural = Ordering.natural();
//
//        List<String> abc = ImmutableList.of("a", "b", "c");
//        System.out.println(natural.isOrdered(abc));
//        System.out.println(natural.isStrictlyOrdered(abc));
//
//        System.out.println("isOrdered reverse :"+ natural.reverse().isOrdered(abc));
//
//        List<String> cba = ImmutableList.of("c", "b", "a");
//        System.out.println(natural.isOrdered(cba));
//        System.out.println(natural.isStrictlyOrdered(cba));
//        System.out.println(cba = natural.sortedCopy(cba));
//
//        System.out.println("max:"+natural.max(cba));
//        System.out.println("min:"+natural.min(cba));
//
//        System.out.println("leastOf:"+natural.leastOf(cba, 2));
//        System.out.println("naturalOrdering:"+ naturalOrdering.sortedCopy(list));
//        System.out.println("leastOf list:"+naturalOrdering.leastOf(list, 3));
//        System.out.println("greatestOf:"+naturalOrdering.greatestOf(list, 3));
//        System.out.println("reverse list :"+ naturalOrdering.reverse().sortedCopy(list));
//        System.out.println("isOrdered list :"+ naturalOrdering.isOrdered(list));
//        System.out.println("isOrdered list :"+ naturalOrdering.reverse().isOrdered(list));
//        list.add(null);
//        System.out.println(" add null list:"+list);
//        System.out.println("nullsFirst list :"+ naturalOrdering.nullsFirst().sortedCopy(list));
//        System.out.println("nullsLast list :"+ naturalOrdering.nullsLast().sortedCopy(list));

//        List<Integer> list = ImmutableList.of(1, 23, 5, 6);

//        Ordering<Integer> ordering = new Ordering<Integer>() {
//            @Override
//            public int compare(Integer left, Integer right) {
//                return left - right;
//            }
//        };

//        Ordering<Integer> ordering = Ordering.natural();

//        Ordering<Integer> ordering = Ordering.from(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return (o1 - o2);
//            }
//        });

//        Ordering<Integer> ordering = Ordering

//        Collections.sort(list, ordering);


        /************************************************************************************/

        List<Person> persons = ImmutableList.of(
                new Person(false,"d", "a1", 1),
                new Person(false,"c", "c1", 3),
                new Person(true,"b", "b1", 2),
                new Person(true,"c", "b1", 1),
                new Person(false,"c", "a1", 1)
        );

        Ordering<Person> ordering = Ordering.from(new Comparator<Person>() {
            @Override
            public int compare(Person left, Person right) {
                return Boolean.valueOf(right.isFlag()).compareTo(Boolean.valueOf(left.isFlag()));
            }
        }).compound(new Comparator<Person>() {
            @Override
            public int compare(Person left, Person right) {
                return left.getId() - right.getId();
            }
        }).compound(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }).compound(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAddress().compareTo(o2.getAddress());
            }
        });

        for (Person person : ordering.sortedCopy(persons)){
            System.out.println(JSON.toJSONString(person));
        }

        System.out.println(ordering.reverse().sortedCopy(persons));
//        Ordering<Integer> firstOrdering = Ordering.from(cityByRainfall).reverse();

        /*****************************************************************************************/
//
//        List<Integer> list = ImmutableList.of(1, 23, 5, 6);
//        Ordering<Integer> ordering = Ordering.from(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return Ints.compare(o1, o2);
//            }
//        });
//
//        System.out.println(ordering.sortedCopy(list));
//        System.out.println(list);
////        System.out.println(ordering.greatestOf(list, 2));

        System.out.println(!new Integer(1).equals(null));

    }
}

