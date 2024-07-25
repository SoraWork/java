/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.util.List;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import view.CapNhatHang;
import view.QuanLyNhanVien;
import view.ThemHang;
import view.ThongKe;
import view.TrangChu;
import view.XuatHang;


/**
 *
 * @author Windows 10 Pro
 */
public class dieukhien {
    public JPanel goc;
    public String kindselected = "";

    public List<danhmucbean> listItem = null; 
    
    public dieukhien(JPanel jpngoc) {
        this.goc = jpngoc;
    }
    
    public void SetView(JPanel jpnItem, JLabel jlbItem){
        kindselected = "TrangChu";
        jpnItem.setBackground(new Color (96,100,191));
        jlbItem.setBackground(new Color (96,100,191));
        goc.removeAll();
        goc.setLayout(new BorderLayout());
        goc.add(new TrangChu());
        goc.validate();
        goc.repaint();
    }
    
    
    public void SetEvent (List<danhmucbean> listItem){
        this.listItem = listItem;
        for(danhmucbean item : listItem){
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(),item.getJpn(),item.getJlb(),item.getTk()));
        }
    }
    
    
    class LabelEvent implements MouseListener{
        
        private JPanel node;
        
        private String kind;
        private JPanel jpnItem;
        private JLabel jlbItem;
        private String tk;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem,String tk) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
            this.tk=tk;
        }

        
        @Override
        public void mouseClicked(MouseEvent e) {
            switch(kind){
                case "TrangChu": 
                    node = new TrangChu();
                    break;
                case "ThemHang" :
                    node = new ThemHang(tk);
                    break;
                case "XuatHang":
                    node = new XuatHang(tk);
                    break;
                case "CapNhatHang":
                    node = new CapNhatHang(tk);
                    break;
                case "ThongKe":
                    node = new ThongKe(tk);
                    break;
                case "QuanLyNhanVien":
                    node = new QuanLyNhanVien(tk);
                default:
                    
                    break;
            }
            goc.removeAll();
            goc.setLayout(new BorderLayout());
            goc.add(node);
            goc.validate();
            goc.repaint();
            SetChangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindselected = kind;
            jpnItem.setBackground(new Color(96,100,191));
            jlbItem.setBackground(new Color(96,100,191));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
           
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnItem.setBackground(new Color(96,100,191));
            jlbItem.setBackground(new Color(96,100,191));
            
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (!kindselected.equalsIgnoreCase(kind)){
                jpnItem.setBackground(new Color(25,174,144));
                jlbItem.setBackground(new Color(25,174,144));
            }
        }
        
    }
    
    public void SetChangeBackground(String kind){
        for (danhmucbean item : listItem){
            if(item.getKind().equalsIgnoreCase(kind)){
                item.getJpn().setBackground(new Color(96,100,191));
                item.getJlb().setBackground(new Color(96,100,191));
            }
            else {
                item.getJpn().setBackground(new Color(25,174,144));
                item.getJlb().setBackground(new Color(25,174,144));
            }
        }
    }
}
