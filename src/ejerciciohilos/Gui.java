
package ejerciciohilos;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Gui extends javax.swing.JFrame implements Runnable {

int c1=0;
int c2=0;
int c3=0;

Thread h1;
Thread h2;
Thread h3;
    
public Gui() {
        initComponents();
    }

public void corredor1(){
c1++;
p1.setValue(c1);

panel1.x=c1;
panel1.repaint();
    try {
        Thread.sleep(100);
    } catch (InterruptedException ex) {
        Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
    }
}
public void corredor2(){
c2++;
p2.setValue(c2);
panel1.y=c2;
panel1.repaint();
 try {
        Thread.sleep(1000);
    } catch (InterruptedException ex) {
        Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
    }
}
public void corredor3() {
c3++;
p3.setValue(c3);
panel1.r=c3;
panel1.repaint();
    try {
        Thread.sleep(100);
    } catch (InterruptedException ex) {
        Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
    }
}

public void run(){
    Thread temp=Thread.currentThread(); // retorna el hilo que se ejecuta acutalmente
    while(temp==h1 && c1<650){
        corredor1();
    }
    while(temp==h2 && c2<297){
        corredor2();
    }
    while(temp==h3 && c3<255){
        corredor3();
    } 
}  


/*public void run(){
     Thread temp=Thread.currentThread(); // retorna el hilo que se ejecuta acutalmente
     while(temp==h1){
         buscarID();
       }
     while(temp==h2){
         buscarNom();
       }
    }  
    public void buscarID(){
        String parametro = t1.getText();
        TableRowSorter<TableModel> filtro = new TableRowSorter<TableModel>(tab);
        tablacli.setRowSorter(filtro);
        filtro.setRowFilter(RowFilter.regexFilter(parametro, 0));
    }
    public void buscarNom(){
        String parametro = t1.getText();
        TableRowSorter<TableModel> filtro = new TableRowSorter<TableModel>(tab);
        tablacli.setRowSorter(filtro);
        filtro.setRowFilter(RowFilter.regexFilter(parametro, 1));
    }
    */

/*public void Buscar(){
           
        String parametro = t1.getText();
        TableRowSorter<TableModel> filtro = new TableRowSorter<TableModel>(tab);
        tablacli.setRowSorter(filtro);
        
        //Esta filtrando la ultima columna escrita
        filtro.setRowFilter(RowFilter.regexFilter(parametro, 0));
        filtro.setRowFilter(RowFilter.regexFilter(parametro, 1));    
        filtro.setRowFilter(RowFilter.regexFilter(parametro, 2));
        filtro.setRowFilter(RowFilter.regexFilter(parametro, 3)); 
        
    }
      */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new ejerciciohilos.Panel();
        jButton1 = new javax.swing.JButton();
        p1 = new javax.swing.JProgressBar();
        p2 = new javax.swing.JProgressBar();
        p3 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 662, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 348, Short.MAX_VALUE)
        );

        jButton1.setText("Hilos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 267, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(219, 219, 219))
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(p3, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                    .addComponent(p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58)
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      h1=new Thread(this);
      h2=new Thread(this);
      h3=new Thread(this);
      
      h1.start();
      h2.start();
      h3.start();
    }//GEN-LAST:event_jButton1ActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JProgressBar p1;
    private javax.swing.JProgressBar p2;
    private javax.swing.JProgressBar p3;
    private ejerciciohilos.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
