class Constructor{
    Constructor(){
        System.out.println("Constructor Reference");
    }
    public static void main(String args[]){
        Constructor c=new Constructor();
        //the thing here about constructor is you dont have to create an object to call the constructor reference, you can directly call it using the class name and the new keyword
    }
}