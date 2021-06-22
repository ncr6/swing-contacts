package presentacion;

import com.formdev.flatlaf.FlatLightLaf;
import entidades.*;
import java.util.Collections;
import javax.swing.*;

/**
 *
 * @author deerfox@debian
 */
public class FrmEditarContacto extends javax.swing.JFrame {

    /**
     * Creates new form FrmEditarContacto
     */
    public FrmEditarContacto(){}
    
    public FrmEditarContacto(ControlTabla ctbl, ListaContactos list, Contacto c) {
        initComponents();
        this.ctbl = ctbl;
        this.list = list;
        this.c = c;
        
        ImageIcon editContactIcon = new ImageIcon("icons/48/edit.png");
        ImageIcon lastnameIcon = new ImageIcon("icons/25/lastname.png");
        ImageIcon nameIcon = new ImageIcon("icons/25/name.png");
        ImageIcon phoneIcon = new ImageIcon("icons/25/phone.png");
        ImageIcon cellphoneIcon = new ImageIcon("icons/25/cellphone.png");
        ImageIcon emailIcon = new ImageIcon("icons/25/email.png");
        ImageIcon saveIcon = new ImageIcon("icons/25/check.png");
        ImageIcon discardIcon = new ImageIcon("icons/25/close.png");
        
        titleLbl.setIcon(editContactIcon);
        lastnameLbl.setIcon(lastnameIcon);
        nameLbl.setIcon(nameIcon);
        phoneLbl.setIcon(phoneIcon);
        cellphoneLbl.setIcon(cellphoneIcon);
        emailLbl.setIcon(emailIcon);
        saveBtn.setIcon(saveIcon);
        discardBtn.setIcon(discardIcon);
        
        lastnameTxt.setText(c.getApellido());
        nameTxt.setText(c.getNombre());
        phoneTxt.setText(c.getFijo());
        cellphoneTxt.setText(c.getCelular());
        emailTxt.setText(c.getCorreo());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLbl = new javax.swing.JLabel();
        lastnameTxt = new javax.swing.JTextField();
        lastnameLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        phoneLbl = new javax.swing.JLabel();
        phoneTxt = new javax.swing.JTextField();
        cellphoneLbl = new javax.swing.JLabel();
        cellphoneTxt = new javax.swing.JTextField();
        emailLbl = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        discardBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar Contacto");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        titleLbl.setFont(new java.awt.Font("Fira Sans", 1, 24)); // NOI18N
        titleLbl.setText(" Editar Contacto");

        lastnameLbl.setLabelFor(lastnameTxt);
        lastnameLbl.setText("Apellido:");

        nameLbl.setLabelFor(nameTxt);
        nameLbl.setText("Nombre:");

        phoneLbl.setLabelFor(phoneTxt);
        phoneLbl.setText("Teléfono Fijo:");

        cellphoneLbl.setLabelFor(cellphoneTxt);
        cellphoneLbl.setText("Celular:");

        emailLbl.setLabelFor(emailTxt);
        emailLbl.setText("Correo electrónico:");

        saveBtn.setFont(new java.awt.Font("Fira Sans", 0, 12)); // NOI18N
        saveBtn.setText("Guardar");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        discardBtn.setFont(new java.awt.Font("Fira Sans", 0, 12)); // NOI18N
        discardBtn.setText("Descartar");
        discardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discardBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailLbl)
                    .addComponent(cellphoneLbl)
                    .addComponent(phoneLbl)
                    .addComponent(nameLbl)
                    .addComponent(lastnameLbl)
                    .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(saveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(discardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(emailTxt, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cellphoneTxt, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(phoneTxt, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nameTxt, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lastnameTxt, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lastnameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lastnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cellphoneLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cellphoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(discardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void discardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discardBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_discardBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        c.setApellido(lastnameTxt.getText()); c.setNombre(nameTxt.getText());
        c.setFijo(phoneTxt.getText()); c.setCelular(cellphoneTxt.getText());
        c.setCorreo(emailTxt.getText());
        if (list.guardar()) {
            ctbl.updateModelo(list);
            this.dispose();            
        } else {
            JOptionPane.showMessageDialog(null, "No pudimos editar este contacto", "Error", 2);
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the FlatLaf Light look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            javax.swing.UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEditarContacto().setVisible(true);
            }
        });
}
    private ControlTabla ctbl;
    private ListaContactos list;
    private Contacto c;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cellphoneLbl;
    private javax.swing.JTextField cellphoneTxt;
    private javax.swing.JButton discardBtn;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel lastnameLbl;
    private javax.swing.JTextField lastnameTxt;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JLabel phoneLbl;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
    
}
