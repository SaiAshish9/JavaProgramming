package com.javaprogramming;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main1 {
    public static void main(String[] args) {
        List<String> numbers= Arrays.asList(
                "a1","a2",
                "b1","b2",
                "c1","c2"
        );


        List<String> numbers1=new ArrayList<>();


//        numbers.forEach(
//                x->{
//                    if(x.startsWith("a")){
//                        numbers1.add(x);
//                    }
//                }
//        );

               numbers
                .stream()
                .map(String::toLowerCase)
                .filter(s->s.startsWith("a"))
                .sorted();
//                .forEach(System.out::println);

//  stream is a set of object references
//. A stream is a sequence of objects that
// supports various methods which can be
// pipelined to produce the desired result.


        Stream<String> s1=Stream.of("a1","b1");
        Stream<String> s2=Stream.of("c1","d1");
        Stream<String> s4=Stream.concat(s1,s2);
//        System.out.println(
//                s4.distinct().peek(System.out::println).count()
//        );
//        s4 can be used only once
//        System.out.println(s4.distinct().count());
        List<String> u=Stream.of("a","b","c").collect(Collectors.toList());

//    flatmap and lambda functions

         Employee sai=new Employee("sai",7);
         Employee sai9=new Employee("sai9",9);

         Department hr=new Department("Human Resources");
         hr.addEmployee(sai);
         hr.addEmployee(sai9);

//         hr.getEmployees().forEach(x-> System.out.println(x));

         Department accounting=new Department("Accounting");
         accounting.addEmployee(sai);

         List<Department> departments=new ArrayList<>();
         departments.add(hr);
         departments.add(accounting);

         departments
                 .stream()
                 .flatMap(department -> department.getEmployees().stream())
                 .forEach(System.out::println);

         Stream.of("a","bb","c","d")
                 .filter(s->{
                     return s.length()==1;
                 })
                 .reduce((a,b) ->a.compareTo(b)>0 ?a:b)
                 .stream()
                 .forEach(System.out::println)
         ;


    }
}
