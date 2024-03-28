/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20240227;

import java.util.stream.IntStream;
/**
 *
 * @author 蓮
 */
public class Ch3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = new int[5];
        array[2] = 72;
        array[3] = 83;
        array[1] = 62;
        for(int i = 0; i < array.length; i++){
            System.out.println(i + ":"+array[i]); 
        }
        
        System.out.println("=============");
        
        for(int v : array){             //for-each 循环
            System.out.println(v);
        }
        
        System.out.println("=============");
        
        IntStream.of(array).forEach(System.out::println);
    }
    
}
