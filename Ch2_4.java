/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ch2_20240222;

/**
 *
 * @author 蓮
 */
public class Ch2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String myName = "Vivin";
        int code = myName.hashCode();
        if(code == "Vivin".hashCode()){
        }
        else if(code == "Ken".hashCode()){
        }
        
        String name = null;
        switch(name){
            case "Vivin":
                System.out.println("RD");
                break;
            case "Lucy":
                System.out.println("HR");
                break;
            case "Ken":
                System.out.println("PM");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
    
}
