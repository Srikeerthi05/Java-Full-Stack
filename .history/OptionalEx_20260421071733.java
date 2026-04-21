import java.util.Arrays;
import java.util.List;
class OptionalEx{
    public static void main(String args[]){
        List<String> list=Arrays.asList("Hello","World","Welcome","to","Java");
        Optional<String> opt=list.stream()
            .filter(s->s.length()>5)
            .findFirst();
        System.out.println(opt.orElse("Not found"));
    }
}