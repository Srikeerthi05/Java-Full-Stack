class OptionalEx{
    public static void main(String args[]){
        List<String> list=Arrays.asList("Hello","World","Wel");
        Optional<String> opt=Optional.of("Hello");
        if(opt.isPresent()){
            System.out.println(opt.get());
        }
    }
}