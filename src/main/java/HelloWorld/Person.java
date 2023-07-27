package HelloWorld;

import java.sql.SQLOutput;

public class Person {
    Float height;
    Float weight;
    public void hello(){
        System.out.println("Hello world");
    }
    public float bmi(){
        float bmi = weight/(height*height);
        return bmi;
    }

}
