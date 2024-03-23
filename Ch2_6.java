/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ch2_20240222;

/**
 *
 * @author 蓮
 */
public class Ch2_6 {
    
    static int func1(){
        System.out.println("Func1");
        return 1;
    }
    
    static boolean func2(){
        System.out.println("Func2");
        return true;
    }
    
    static void func3(){
        System.out.println("Func3");
    }
    
    static void func4(){
        System.out.println("Func4");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i = func1(); i<=3 && func2(); i++, func3()){
            func4();
        }
    }
    
}


