/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JPanel;

/**
 *
 * @author araceli
 */
public class CambiaPanel {
    
     //
    private JPanel container;
    private JPanel content;
    

    /**
     * Constructor de clase
     */
    public CambiaPanel(JPanel container, JPanel content) {
        //, int x, int y, int vertical, int horizontal
        this.container = container;
        this.content = content;
        this.container.removeAll();
        this.container.revalidate();
        this.container.repaint();
        // set Bounds(x: horizontal, y: vertical, 198: vertical, 157: horizontal)
        //this.content.setBounds(100, 0, 198, 157);
        
        //this.content.setBounds(x, y, vertical, horizontal);
     
        this.container.add(this.content);
        this.container.revalidate();
        this.container.repaint();
        
        this.content.setVisible(true);
        
    }
    
    
}
