package Lambda_Stream;

import java.io.File;
import java.util.stream.Stream;

/**
 * Created by bobsang89@gmail.com on 2019-03-11
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class StreamEx2 {
    public static void main(String[] args) {
        File[] files = {new File("Ex1.java"), new File("Ex1.bak"),
                new File("Ex2.java"), new File("Ex1"), new File("Ex1.txt")};

        Stream<File> fileStream = Stream.of(files);

        Stream<String> filenameStream = fileStream.map(File::getName);
        filenameStream.forEach(System.out::println);

        fileStream = Stream.of(files);

        fileStream.map(File::getName)
                .filter(s -> s.indexOf('.') != 1)
                .map(s -> s.substring(s.indexOf('.')+1))
                .map(String::toUpperCase)
                .distinct()
                .forEach(System.out::print);
        System.out.println();
    }
}
