public class MyClass {
    private String name;
    private String surname;
    private int age;
    private String[] course;
    private String  fovariteFood;

    public MyClass(String name, String surname, int age, String[] course, String fovariteFood) {
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.course=course;
        this.fovariteFood=fovariteFood;
    }



    void setName(String name){
        this.name=name;
    }
    void setSurname(String surname){
        this.surname=surname;
    }
    void setAge(int age){
        this.age=age;
    }
    void setCourse(String[] course){
        this.course=course;
    }
    void setFovariteFood(String fovariteFood){
    }
    String getName(){
        return name;
    }
    String getSurname(){
        return surname;
    }
    int getAge(){
        return age;
    }
    String[] getCourse() {
        return course;
    }
    String getFovariteFood(){
        return fovariteFood;
    }

}
