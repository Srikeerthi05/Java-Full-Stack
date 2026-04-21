import java.util.*;
import
class Demo{
    Demo(){
        System.out.println("Constructor");
    }
}
class MethodRef{
    public static void main(String args[]){
        //Method Reference
        List<String> list= Arrays.asList("Keerthi","Teertha","Vikas","Smaran","Vinay");
        list.forEach(System.out::println);
        //Constructor Reference
        Supplier<Demo> s=Demo::new;
        Demo d=s.get();
    }
}