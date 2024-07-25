/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author Windows 10 Pro
 */
public class e extends Exception{
    String massage;

    public e(String massage) {
        this.massage = massage;
    }
    public String GetMassage(){
        return massage;
    }    
}
