class OptionalEx{
    public static void main(String args[]){
        Optional<String> opt=Optional.of("Hello");
        if(opt.isPresent()){
            System.out.println(opt.get());
        }
    }
}