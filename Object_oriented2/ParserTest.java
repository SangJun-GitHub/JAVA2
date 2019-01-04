package Object_oriented2;

/**
 * Created by bobsang89@gmail.com on 2019-01-03
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
interface Parseable{
    public abstract void parse(String fileName);
}
class ParserManager{
    public static Parseable getParser(String type){
        if(type.equals("XML"))
            return new XMLParser();
        else{
            Parseable p = new HTMLParser();
            return p;
        }
    }
}
class XMLParser implements Parseable{
    public void parse(String fileName){
        System.out.println(fileName + " - XML parsing completed.");
    }
}
class HTMLParser implements Parseable{
    public void parse(String fileName){
        System.out.println(fileName + " - HTML parsing completed.");
    }
}
public class ParserTest {
    public static void main(String[] args) {
        Parseable parser = ParserManager.getParser("XML");
        parser.parse("document.xml");
        parser = ParserManager.getParser("HML");
        parser.parse("document2.html");
    }
}
