
package ejerciciohilos;

import java.awt.Color;
import java.awt.Graphics;


public class Panel extends javax.swing.JPanel {

   public int x=0,y=0;
   public int r=0;
    public Panel() {
        initComponents();
    }

   public void paintComponent(Graphics g){
       super.paintComponent(g);
       Color degrade=new Color(0,r,0);
       g.setColor(degrade);
       g.fillRect(x,y,50,50);
       
       
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
