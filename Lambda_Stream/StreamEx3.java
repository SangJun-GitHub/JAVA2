package Lambda_Stream;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by bobsang89@gmail.com on 2019-03-12
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class Student3 implements Comparable<Student3>{
    String name;
    int classNum;
    int totalScore;

    Student3(String name, int classNum, int totalScore){
        this.name = name;
        this.classNum = classNum;
        this.totalScore = totalScore;
    }
    public String toString(){
        return String.format("[%s, %d, %d]", name, classNum, totalScore).toString();
    }

    String getName(){
       return name;
    }
    int getClassNum(){
        return classNum;
    }
    int getTotalScore(){
        return totalScore;
    }
    public int compareTo(Student3 s){
        return s.totalScore - this.totalScore;
    }
}
public class StreamEx3 {
    public static void main(String[] args) {
        Student3[] stuArr = {
                new Student3("Sang", 3, 300),
                new Student3("Jun", 1, 200),
                new Student3("Park", 2, 100),
                new Student3("SangJun", 2, 150),
                new Student3("Kim", 1 , 200),
                new Student3("Ha", 3, 290),
                new Student3("Yoen", 3, 180)
        };

        Stream<Student3> studentStream = Stream.of(stuArr);

        studentStream.sorted(Comparator.comparing(Student3::getClassNum)
                .thenComparing(Comparator.naturalOrder()))
                .forEach(System.out::println);

        studentStream = Stream.of(stuArr);          //create new Stream
        IntStream stuScoreStream = studentStream.mapToInt(Student3::getTotalScore);

        IntSummaryStatistics stat = stuScoreStream.summaryStatistics();
        System.out.println("count=" + stat.getCount());
        System.out.println("sum=" + stat.getSum());
        System.out.printf("avg=%.2f\n", stat.getAverage());
        System.out.println("min=" + stat.getMin());
        System.out.println("max=" + stat.getMax());
    }
}
