package Object_oriented1;

/**
 * Created by bobsang89@gmail.com on 2018-12-25
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class Document {
    static int count = 0;
    String name;

    Document(){
        this("Untitled" + ++count);
    }

    Document(String name){
        this.name = name;
        System.out.println("Document " + this.name + " is created");
    }
}
public class DocumentTest {
    public static void main(String[] args) {
        Document d1 = new Document();
        Document d2 = new Document("java.txt");
        Document d3 = new Document();
        Document d4 = new Document();
    }
}
