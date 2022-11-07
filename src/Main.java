import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MyClass myClass=new MyClass("Baiysh","Orozaliev",22,new String[]{"java","english","softSkills"},"sushi");
        MyClass myClass2=new MyClass("Baiysh","Orozaliev",22,new String[]{"backEnd,samsrazvitya,bookRead"},"plow");
        System.out.println(myClass.getName()+"\n"+myClass.getSurname()+"\n"+myClass.getAge()+"\n"+myClass.getFovariteFood());
        System.out.println(Arrays.toString(myClass.getCourse()));
        System.out.println("_____________________________________");
        System.out.println(myClass2.getName()+"\n"+myClass2.getSurname()+"\n"+myClass2.getAge()+"\n"+myClass2.getFovariteFood());

        System.out.println(Arrays.toString(myClass2.getCourse()));

    }
}