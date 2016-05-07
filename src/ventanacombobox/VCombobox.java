
package ventanacombobox;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;

//https://www.youtube.com/watch?v=wZWK3uVlghQ
//Design/combox/BTDerecho/Events/item/itemStateChange
public class VCombobox extends javax.swing.JFrame {
    String[] petStrings = { "Bird", "Cat", "Dog", "Rabbit", "Pig" };
    
    ArrayList<String> ar = new ArrayList<String>();
    
     String  item;
    DefaultComboBoxModel dm= new  DefaultComboBoxModel();
     
    public VCombobox() {
        initComponents();
        initCB();
    }
   
     
      public void initCB(){
          ar.add("caballo");
          ar.add("pollo");
          ar.add("mono");
          dm = new DefaultComboBoxModel(ar.toArray());
         //dm = new DefaultComboBoxModel(petStrings);
         CB.setModel(dm);
      }
      
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CB = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        BTGuardar = new javax.swing.JButton();
        BTAddItem = new javax.swing.JButton();
        TFElementos = new javax.swing.JTextField();
        BTEliminarItem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Binario", "hexadecimal", "octal", " " }));
        CB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBItemStateChanged(evt);
            }
        });
        CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBActionPerformed(evt);
            }
        });

        jButton1.setText("salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        BTGuardar.setText("GuardarItem");
        BTGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTGuardarActionPerformed(evt);
            }
        });

        BTAddItem.setText("AñadirItem");
        BTAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTAddItemActionPerformed(evt);
            }
        });

        TFElementos.setText("elementos");

        BTEliminarItem.setText("EliminarItem");
        BTEliminarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTEliminarItemActionPerformed(evt);
            }
        });

        jLabel1.setText("Design/combox/BTDerecho/Events/item/itemStateChange");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jButton1))
                    .addComponent(TFElementos))
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTGuardar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTAddItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTEliminarItem)))
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFElementos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTAddItem)
                    .addComponent(BTEliminarItem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(BTGuardar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BTGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTGuardarActionPerformed
        item=CB.getSelectedItem().toString();
        JOptionPane.showMessageDialog(null, "El item: "+item);
    }//GEN-LAST:event_BTGuardarActionPerformed

    private void BTAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTAddItemActionPerformed
         dm = new DefaultComboBoxModel(petStrings);
         CB.setModel(dm);
    }//GEN-LAST:event_BTAddItemActionPerformed

    private void BTEliminarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTEliminarItemActionPerformed
         dm = new DefaultComboBoxModel();
         CB.setModel(dm);
    }//GEN-LAST:event_BTEliminarItemActionPerformed
     //pasar a dato
    private void CBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBItemStateChanged
        TFElementos.setText(CB.getSelectedItem().toString());
    }//GEN-LAST:event_CBItemStateChanged

    
     
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTAddItem;
    private javax.swing.JButton BTEliminarItem;
    private javax.swing.JButton BTGuardar;
    private javax.swing.JComboBox CB;
    private javax.swing.JTextField TFElementos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    public JComboBox getCB() {
        return CB;
    }

    public void setCB(JComboBox CB) {
        this.CB = CB;
    }
}
