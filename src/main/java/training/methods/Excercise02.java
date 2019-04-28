/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.methods;

public class Excercise02{
    public static void main(String[] args) {
        int x = b(15);
        System.out.println(x);
        System.out.println(15);
        System.out.println(15.0);
        
        System.out.println(new A2().a(new D()));
    }
    
    //public static void main(String... args){} COMPILE ERROR
    
    static int b(int i){return i;}
    //static double b(int i){return i;}  COMPILE ERROR
}

class B2{}
class C{}
class D extends B{}

class A2{
    static int a(D d){return 1;}
    static int a(C c){return 2;}
    static int a(B2 b){return 3;}
    static int a(A2 a){return 4;}
    
    
    
    
}