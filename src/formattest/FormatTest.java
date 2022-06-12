package formattest;

public class FormatTest {
    public static void main(String[] args){
        String name="John Smith";
        Integer age=25;
        Double height=1.84;
        String personDetails=String.format("%-20s%10s%12s\n",name, age, height);
        System.out.println(personDetails);
    }
}
