package Lambda_Stream;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

/**
 * Created by bobsang89@gmail.com on 2019-03-13
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class Student6 implements Comparable<Student6>{
    String name;
    int ban;
    int totalScore;

    Student6(String name, int ban, int totalScore){
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    public String toString(){
        return String.format("[%s, %d, %d]", name, ban, totalScore).toString();
    }

    String getName(){
        return name;
    }
    int getBan(){
        return ban;
    }
    int getTotalScore(){
        return totalScore;
    }

    public int compareTo(Student6 s){
        return s.totalScore - this.totalScore;
    }
}
public class StreamEx6 {
    public static void main(String[] args) {
        Student6[] stuArr = {
                new Student6("Sang", 3 , 300),
                new Student6("Jun", 1, 200),
                new Student6("Park", 2, 100),
                new Student6("SangJun", 2, 150),
                new Student6("Ha", 1, 200),
                new Student6("Yeon", 3, 290),
                new Student6("Kim", 3, 180)
        };

        List<String> names = Stream.of(stuArr)
                .map(Student6::getName)
                .collect(Collectors.toList());
        System.out.println(names);

        //Stream -> array
        Student6[] stuArr2 = Stream.of(stuArr).toArray(Student6[]::new);

        for(Student6 s : stuArr2)
            System.out.println(s);

        //Stream -> map         // student name = key
        Map<String, Student6> stuMap = Stream.of(stuArr)
                .collect(Collectors.toMap(s -> s.getName(), p -> p));

        for(String name : stuMap.keySet())
            System.out.println(name + "-" + stuMap.get(name));

        long count = Stream.of(stuArr).collect(counting());
        long totalScore = Stream.of(stuArr).collect(summingInt(Student6::getTotalScore));
        System.out.println("count=" + count);
        System.out.println("totalScore=" + totalScore);

        totalScore = Stream.of(stuArr)
                .collect(reducing(0, Student6::getTotalScore, Integer::sum));
        System.out.println("totalScore=" + totalScore);

        Optional<Student6> topStudent = Stream.of(stuArr)
                .collect(maxBy(Comparator.comparingInt(Student6::getTotalScore)));
        System.out.println("topStudent=" + topStudent.get());

        IntSummaryStatistics stat = Stream.of(stuArr)
                .collect(summarizingInt(Student6::getTotalScore));
        System.out.println(stat);

        String stuNames = Stream.of(stuArr).map(Student6::getName)
                .collect(joining(",", "{", "}"));
        System.out.println(stuNames);
    }
}
