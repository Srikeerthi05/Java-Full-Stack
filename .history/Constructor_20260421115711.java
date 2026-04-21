class Constructor{
    Constructor(){
        System.out.println("Constructor Reference");
    }
    public static void main(String args[]){
        //Constructor Reference
        Constructor c=Constructor::new;
        c.getClass();
    }
}