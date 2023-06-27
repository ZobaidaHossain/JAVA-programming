
class A {
    A(){
        System.out.println("This is a");
    }
}
class B extends A{
    B(){
        System.out.println("this is b");
    }
}
class C extends B{
    C(){
        System.out.println("this is c");
    }
}
public class default_constructor {
     public static void main(String[]args){
        C c1=new C();
        //C=class
        //c1=variable
        //c=constructir
        
    }
}

