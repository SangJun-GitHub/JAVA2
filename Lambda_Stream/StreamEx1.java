package Lambda_Stream;


import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Created by bobsang89@gmail.com on 2019-03-11
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class Student implements Comparable<Student>{
    String name;
    int ban;
    int totalScore;

    Student(String name, int ban, int totalScore){
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
    public int compareTo(Student s){
        return s.totalScore = this.totalScore;
    }
}
public class StreamEx1 {
    public static void main(String[] args) {
        Stream<Student> studentStream = Stream.of(
                new Student("Sang", 3 , 200),
                new Student("Jun", 1, 200),
                new Student("Park", 2 , 100),
                new Student("SangJun", 2, 150),
                new Student("Kim", 1, 200),
                new Student("Ha", 3,290),
                new Student("Yeon", 3, 180)
        );

        studentStream.sorted(Comparator.comparing(Student::getBan)
                .thenComparing(Comparator.naturalOrder()))
                .forEach(System.out::println);
    }
}
