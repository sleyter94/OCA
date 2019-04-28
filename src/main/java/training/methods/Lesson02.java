/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.methods;

/**
 *
 * @author Usuario
 */


class Test{

    //Overloading a method
    public void method(int i){
        System.out.println("int");
    }
    
    public void method(double x){
        System.out.println("double");
    }
    //Overloading only depends of quantity and types of parameters
    //If the overload like Object and String, the compiler always choose the more specific.
    public static void main(String[] args){
        new Test().method(15);//int
        new Test().method(15.0);//double
        new Test().method("random");//string
        new Test().method((Object)"random");//object
        
        String x = "random";
        Object y = x;
        
        new Test().method(x);//String
        new Test().method(y);//Object
        
        new Test().method("guilherme",33.0);//1
        new Test().method(33.0, "guilherme");//2
        new Test().method(2.0, 3);
        new Test().method(2, 3.0);
        //new Test().method(2,3); Compile Error
//        new Test().method("string","string"); Compile Error when one is specific the other is generic
    }
    
    
    //Overloading specific parameters
    void method(Object o){
        System.out.println("Object");
    }
    
    void method(String o){
        System.out.println("String");
    }
    
    
    void method(String i, double x){
        System.out.println(1);
    }
    
    void method(double x,String i){
        System.out.println(2);
    }
    
    void method(int i, double x){
    
    }
    
    void method(double x, int i){
    
    }
    
    void method(String s,Object o){
        System.out.println("string");
    }
    
    void method(Object o, String s){
        System.out.println("object");
    }
    
}
