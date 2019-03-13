package Lambda_Stream;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;

/**
 * Created by bobsang89@gmail.com on 2019-03-13
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class Student7{
    String name;
    boolean isMale;
    int grade;
    int classNum;
    int score;

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

    Student7(String name, boolean isMale, int grade, int classNum, int score){
        this.name = name;
        this.isMale = isMale;
        this.grade = grade;
        this.classNum = classNum;
        this.score = score;
    }

    public String toString(){
        return String.format("[%s, %s , %dgrade, %dclass, %3dsocre]",
                name, isMale?"male":"female", grade, classNum, score);
    }
    enum Level{HIGH, MID, LOW}

}
public class StreamEx7 {
    public static void main(String[] args) {
        Student7[] stuArr = {
                new Student7("Sang", true, 1, 1, 300),
                new Student7("Jun", false, 1, 1, 250),
                new Student7("Park", true, 1, 1, 200),
                new Student7("SangJun", false, 1, 2, 150),
                new Student7("Ha", true, 1, 2, 100),
                new Student7("Yeon", false, 1, 2, 50),
                new Student7("Kim", false, 1, 3, 100),
                new Student7("HaYeon", false, 1, 3, 150),
                new Student7("SangJunPark", true, 1, 3, 200),

                new Student7("Sang", true, 2, 1, 300),
                new Student7("Jun", false, 2, 1, 250),
                new Student7("Park", true, 2, 1, 200),
                new Student7("SangJun", false, 2, 2, 150),
                new Student7("Ha", true, 2, 2, 100),
                new Student7("Yeon", false, 2, 2, 50),
                new Student7("Kim", false, 2, 3, 100),
                new Student7("HaYeon", false, 2, 3, 150),
                new Student7("SangJunPark", true, 2, 3, 200),
        };

        System.out.printf("1. Simple Split(students by gender)\n");
        Map<Boolean, List<Student7>> stuByGender = Stream.of(stuArr)
                .collect(partitioningBy(Student7::isMale));

        List<Student7> maleStudent = stuByGender.get(true);
        List<Student7> femaleStudent = stuByGender.get(false);

        for(Student7 s : maleStudent)
            System.out.println(s);
        for(Student7 s : femaleStudent)
            System.out.println(s);

        System.out.printf("\n2. Simple Split + Statistics(Number of students by gender)\n");
        Map<Boolean, Long> stuNumByGender = Stream.of(stuArr)
                .collect(partitioningBy(Student7::isMale, counting()));

        System.out.println("number of male students :" + stuNumByGender.get(true));
        System.out.println("number of female students :" + stuNumByGender.get(false));

        System.out.printf("\n3. Simple Split + Statistics(the top score students by gender)\n");
        Map<Boolean, Optional<Student7>> topScoreByGender = Stream.of(stuArr)
                .collect(partitioningBy(Student7::isMale,
                        maxBy(comparingInt(Student7::getScore))));
        System.out.println("the top student of male students :" + topScoreByGender.get(true));
        System.out.println("the top student of female students :" + topScoreByGender.get(false));

        Map<Boolean, Student7> topScoreByGender2 = Stream.of(stuArr)
                .collect(partitioningBy(Student7::isMale,
                        collectingAndThen(maxBy(comparingInt(Student7::getScore)),
                                Optional::get)));
        System.out.println("the top student of male students :" + topScoreByGender2.get(true));
        System.out.println("the top student of female students :" + topScoreByGender2.get(false));

        System.out.printf("\n4. Multiple Split(failed student by gender(less than 100 scores))");

        Map<Boolean, Map<Boolean, List<Student7>>> failedStuByGender = Stream.of(stuArr)
                .collect(partitioningBy(Student7::isMale, partitioningBy(s -> s.getScore() <= 100)));
        List<Student7> failedMaleStu = failedStuByGender.get(true).get(true);
        List<Student7> failedFemaleStu = failedStuByGender.get(false).get(true);

        for(Student7 s : failedMaleStu)
            System.out.println(s);
        for(Student7 s : failedFemaleStu)
            System.out.println(s);
    }
}
