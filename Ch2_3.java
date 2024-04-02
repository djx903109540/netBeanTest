/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ch2_20240222;

/**
 *
 * @author 蓮
 */
public class Ch2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name1 = "Ken";
        String name2 = "Ken";
        String name3 = new String("Ken");
        String name4 = null;
        System.out.println(name1 == name2);
        System.out.println(name1 == name3);
        System.out.println(name1.equals(name2));
        System.out.println(name1.equals(name3));
        System.out.println(name4 == name3);
        System.out.println(name4.equals(name3)); //報錯，空指針異常 null不能調用equals
    }
    
}
