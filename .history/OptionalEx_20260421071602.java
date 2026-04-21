class OptionalEx{
    public static void main(String args[]){
        List<String> list=Arrays.asList("Hello","World","Welcome","to","Java");
        Optional<String> opt=list.stream()
        if(opt.isPresent()){
            System.out.println(opt.get());
        }
    }
}