package HelloWorld;

import java.sql.SQLOutput;

public class Person {
    float height;
    float weight;
    String name;
    public Person(float height,float weight){
        this.height = height;
        this.weight = weight;
    }
    public Person(String name,float height,float weight){
        this(height, weight);
        this.name = name;
    }
    public void hello(){
        System.out.println("Hello world");
    }
    public float bmi(){
        float bmi = weight/(height*height);
        return bmi;
    }

}
