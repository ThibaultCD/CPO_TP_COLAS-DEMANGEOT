/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightsoff;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author 33781
 */
public class CelluleGraphique extends JButton {
    CelluleLumineuse celluleAssociee;
    ImageIcon img_allumee = new javax.swing.ImageIcon(getClass().getResource("/images/image ampoule allumée100x100.jpg"));
    ImageIcon img_eteint = new javax.swing.ImageIcon(getClass().getResource("/images/photo eteinte100x100.jpg"));
    
public CelluleGraphique (CelluleLumineuse cellule){
    celluleAssociee = cellule;
}
    @Override
    public void paintComponent(Graphics G){
        super.paintComponent(G);
        if (celluleAssociee.celluleAllumee()==false){
            setIcon(img_eteint);
        }else {
            setIcon(img_allumee);
        }
    }
}
