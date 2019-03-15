package Lambda_Stream;

import java.util.*;
import java.util.stream.Stream;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;

/**
 * Created by bobsang89@gmail.com on 2019-03-14
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class Student8 {
    String name;
    boolean isMale;
    int grade;
    int classNum;
    int score;

    Student8(String name, boolean isMale, int grade, int classNum, int score){
        this.name = name;
        this.isMale = isMale;
        this.grade = grade;
        this.classNum = classNum;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public boolean isMale() {
        return isMale;
    }

    public int getGrade() {
        return grade;
    }

    public int getClassNum() {
        return classNum;
    }

    public int getScore() {
        return score;
    }

    public String toString(){
        return String.format("[%s, %s, %dgrade, %dclassNum, %3dsocre]", name, isMale ? "Male" : "Female", grade, classNum, score);
    }

    enum Level{
        HIGH, MID, LOW
    }
}
public class StreamEx8 {
    public static void main(String[] args) {
        Student8[] stuArr = {
                new Student8("Sang", true, 1, 1, 300),
                new Student8("Jun", false, 1, 1, 250),
                new Student8("Park", true, 1, 1, 200),
                new Student8("SangJun", false, 1, 2, 150),
                new Student8("Ha", true, 1, 2, 100),
                new Student8("Yeon", false, 1, 2, 50),
                new Student8("Kim", false, 1, 3, 100),
                new Student8("HaYeon", false, 1, 3, 150),
                new Student8("SangJunPark", true, 1, 3, 200),

                new Student8("Sang", true, 2, 1, 300),
                new Student8("Jun", false, 2, 1, 250),
                new Student8("Park", true, 2, 1, 200),
                new Student8("SangJun", false, 2, 2, 150),
                new Student8("Ha", true, 2, 2, 100),
                new Student8("Yeon", false, 2, 2, 50),
                new Student8("Kim", false, 2, 3, 100),
                new Student8("HaYeon", false, 2, 3, 150),
                new Student8("SangJunPark", true, 2, 3, 200),
        };
        System.out.printf("1. Simple Split(students by class)\n");
        Map<Integer, List<Student8>> stuByClass = Stream.of(stuArr)
                .collect(groupingBy(Student8::getClassNum));
        for (List<Student8> classNum : stuByClass.values()) {
            for (Student8 s : classNum)
                System.out.println(s);
        }

        System.out.printf("\n2. Simple Split(students by score)\n");
        Map<Student8.Level, List<Student8>> stuByLevel = Stream.of(stuArr)
                .collect(groupingBy(s -> {
                    if (s.getScore() >= 200) return Student8.Level.HIGH;
                    else if (s.getScore() >= 100) return Student8.Level.MID;
                    else return Student8.Level.LOW;
                }));

        TreeSet<Student8.Level> keySet = new TreeSet<>(stuByLevel.keySet());
        for (Student8.Level key : keySet) {
            System.out.println("[" + key + "]");
            for (Student8 s : stuByLevel.get(key))
                System.out.println(s);
            System.out.println();
        }

        System.out.printf("\n3. Simple Split(number of students by score)\n");
        Map<Student8.Level, Long> stuCntByLevel = Stream.of(stuArr)
                .collect(groupingBy(s -> {
                    if (s.getScore() >= 200) return Student8.Level.HIGH;
                    else if (s.getScore() >= 100) return Student8.Level.MID;
                    else return Student8.Level.LOW;
                }, counting()));
        for (Student8.Level key : stuByLevel.keySet())
            System.out.printf("[%s] - %d students, ", key, stuCntByLevel.get(key));
        System.out.println();
/*
        for(List<Student8> level : stuByLevel.values()){
            System.out.println();
            for(Student8 s : level)
                System.out.println(s);
        }
*/
        System.out.printf("\n4. Multiple grouping(by grade, in classes)\n");
        Map<Integer, Map<Integer, List<Student8>>> stuByGradeAndClassNum = Stream.of(stuArr)
                .collect(groupingBy(Student8::getGrade, groupingBy(Student8::getClassNum)));
        for (Map<Integer, List<Student8>> grade : stuByGradeAndClassNum.values()) {
            for (List<Student8> classNum : grade.values()) {
                System.out.println();
                for (Student8 s : classNum)
                    System.out.println(s);
            }
        }

        System.out.printf("\n5. Multiple grouping + statistics(by grade, the best student in classes)\n");
        Map<Integer, Map<Integer, Student8>> topStuByGradeAndClassNum = Stream.of(stuArr)
                .collect(groupingBy(Student8::getGrade, groupingBy(Student8::getClassNum,
                                collectingAndThen(maxBy(comparingInt(Student8::getScore)), Optional::get))));
        for(Map<Integer, Student8> classNum : topStuByGradeAndClassNum.values()){
            for(Student8 s : classNum.values())
                System.out.println(s);
        }

        System.out.printf("\n6. Multiple grouping + statistics(by grade, score group in classes)\n");
        Map<String, Set<Student8.Level>> stuByScoreGroup = Stream.of(stuArr)
                .collect(groupingBy(s -> s.getGrade() + "-" + s.getClassNum(),
                        mapping(s -> {
                            if(s.getScore() >= 200) return Student8.Level.HIGH;
                            else if(s.getScore() >= 100) return Student8.Level.MID;
                            else return Student8.Level.LOW;
                        }, toSet())));
        Set<String> keySet2 = stuByScoreGroup.keySet();
        for(String key : keySet2)
            System.out.println("["+key+"]" + stuByScoreGroup.get(key));
    }
}
