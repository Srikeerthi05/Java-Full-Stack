import java.util.*;
class Demo{
    
}
class MethodRef{
    public static void main(String args[]){
        //Method Reference
        List<String> list= Arrays.asList("Keerthi","Teertha","Vikas","Smaran","Vinay");
        list.forEach(System.out::println);
    }
}