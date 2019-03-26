package Input_Output;

/**
 * Created by bobsang89@gmail.com on 2019-03-25
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class UserInfo {
    String name;
    String password;
    int age;

    public UserInfo(){
        this("Unkown", "1111", 0);
    }

    public UserInfo(String name, String password, int age){
        this.name = name;
        this.password = password;
        this.age = age;
    }

    public String toString(){
        return "(" + name + "," + password + "," + age + ")";
    }
}
