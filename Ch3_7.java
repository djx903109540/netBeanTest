/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20240227;

/**
 *
 * @author 蓮
 */
public class Ch3_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] arr = new int[3][];
        arr[0] = new int[]{8, 3};
        arr[2] = new int[]{4, 5, 6};
        System.out.println(arr[2][2]);
        //System.out.println(arr[0][2]);  //报错，索引值越界，运行错误
        //System.out.println(arr[1][0]);  //报错 NullPointerException
        
    }
    
}
