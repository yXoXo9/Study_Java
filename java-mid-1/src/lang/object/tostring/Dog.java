package lang.object.tostring;

public class Dog {
    private String dogNm;
    private int age;

    public Dog(String dogNm, int age) {
        this.dogNm = dogNm;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogNm='" + dogNm + '\'' +
                ", age=" + age +
                '}';
    }
}
