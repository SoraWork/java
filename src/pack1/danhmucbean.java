/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack1;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Windows 10 Pro
 */
public class danhmucbean {
    public String kind;
    public JPanel jpn;
    public JLabel jlb;
    public String tk;

    public danhmucbean(String kind, JPanel jpn, JLabel jlb,String tk) {
        this.kind = kind;
        this.jpn = jpn;
        this.jlb = jlb;
        this.tk=tk;
    }

    public danhmucbean() {
    }

    public String getKind() {
        return kind;
    }

    public JPanel getJpn() {
        return jpn;
    }

    public JLabel getJlb() {
        return jlb;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setJpn(JPanel jpn) {
        this.jpn = jpn;
    }

    public void setJlb(JLabel jlb) {
        this.jlb = jlb;
    }

    public String getTk() {
        return tk;
    }

    public void setTk(String tk) {
        this.tk = tk;
    }
    
    
}
