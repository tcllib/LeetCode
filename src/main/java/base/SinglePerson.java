package base;

import java.util.List;

public class SinglePerson extends BasePerson {
    private String age;

    public SinglePerson(String age) {
        this.age = age;
    }

    public static void main(String[] args) {
        List<Object> age = List.of(new SinglePerson("age"));
    }
    
    
}
