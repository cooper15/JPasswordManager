
package ui;

import conexiones.InterfazConexion;
import cifrado.AccCifrado;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

/**
 *
 * @author cooper15
 */
public class AgregarPass extends javax.swing.JDialog {

    /**
     * Creates new form AgregarPass
     */

    String nombre_usuario;
    public AgregarPass(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(parent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFormulario = new javax.swing.JPanel();
        jpLabels = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jpTextos = new javax.swing.JPanel();
        contrasena_txt = new javax.swing.JPasswordField();
        repita_contrass_txt = new javax.swing.JPasswordField();
        nombre_sitio_txt = new javax.swing.JTextField();
        url_sitio_txt = new javax.swing.JTextField();
        fechaDch = new datechooser.beans.DateChooserCombo();
        jpBotones = new javax.swing.JPanel();
        bntAceptarPass = new javax.swing.JButton();
        ver_password_btn = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Contraseña");
        setName("AgregarPass"); // NOI18N

        jpFormulario.setLayout(new java.awt.BorderLayout());

        jpLabels.setLayout(new java.awt.GridLayout(5, 0, 10, 20));

        jLabel1.setText("Contraseña");
        jpLabels.add(jLabel1);

        jLabel2.setText("Repita la contraseña");
        jpLabels.add(jLabel2);

        jLabel3.setText("Nombre del Sitio             ");
        jpLabels.add(jLabel3);

        jLabel4.setText("Url del Sitio");
        jpLabels.add(jLabel4);

        jLabel5.setText("Fecha de vencimiento      ");
        jpLabels.add(jLabel5);

        jpFormulario.add(jpLabels, java.awt.BorderLayout.LINE_START);

        jpTextos.setLayout(new java.awt.GridLayout(5, 0, 0, 20));

        contrasena_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contrasena_txtMousePressed(evt);
            }
        });
        jpTextos.add(contrasena_txt);

        repita_contrass_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                repita_contrass_txtMousePressed(evt);
            }
        });
        jpTextos.add(repita_contrass_txt);

        nombre_sitio_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombre_sitio_txtMousePressed(evt);
            }
        });
        jpTextos.add(nombre_sitio_txt);

        url_sitio_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                url_sitio_txtMousePressed(evt);
            }
        });
        jpTextos.add(url_sitio_txt);

        try {
            fechaDch.setDefaultPeriods(new datechooser.model.multiple.PeriodSet());
        } catch (datechooser.model.exeptions.IncompatibleDataExeption e1) {
            e1.printStackTrace();
        }
        jpTextos.add(fechaDch);

        jpFormulario.add(jpTextos, java.awt.BorderLayout.CENTER);

        bntAceptarPass.setText("Aceptar");
        bntAceptarPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAceptarPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpBotonesLayout = new javax.swing.GroupLayout(jpBotones);
        jpBotones.setLayout(jpBotonesLayout);
        jpBotonesLayout.setHorizontalGroup(
            jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBotonesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bntAceptarPass)
                .addContainerGap())
        );
        jpBotonesLayout.setVerticalGroup(
            jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBotonesLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(bntAceptarPass)
                .addContainerGap())
        );

        ver_password_btn.setText("V");
        ver_password_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ver_password_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ver_password_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ver_password_btn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jpBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntAceptarPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAceptarPassActionPerformed
        String contrasena = new String ( contrasena_txt.getPassword() );
            if (!valida_datos() && coincide_passwords()){
                AccCifrado cifrar = new AccCifrado();
                contrasena = cifrar.cifrar_password(contrasena);
            // llama codigo para insersión..
                String dia_mes = 
                        Integer.toString(fechaDch.getCurrent().get(Calendar.DAY_OF_MONTH));
                String mes = 
                        Integer.toString(fechaDch.getCurrent().get(Calendar.MONTH ) +1);
                String anio = 
                        Integer.toString(fechaDch.getCurrent().get(Calendar.YEAR));
                String fecha = "'"+anio+"-"+mes+"-"+dia_mes+"'";
                String datos = "'"+nombre_usuario+"'"+","+"'"+contrasena+"'"+","
                         +"'"+nombre_sitio_txt.getText()+"'"+","
                         +"'"+url_sitio_txt.getText()+"'"+","+fecha;
                JOptionPane.showMessageDialog(null,datos);
                InterfazConexion nueva_conexion = new InterfazConexion();
                nueva_conexion.ingresaPassword(datos);
                this.dispose();
        }
            else 
                if( !coincide_passwords() )
                    JOptionPane.showMessageDialog(this,"Las contraseñas no coinciden");
        
            else
                JOptionPane.showMessageDialog(this,"Existen datos vacíos, "
                        +"por favor rellene el formulario completo","Atención",
                        JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_bntAceptarPassActionPerformed

    private void contrasena_txtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contrasena_txtMousePressed
        MenuContextual m = new MenuContextual();
        m.menuContextual(contrasena_txt);
        contrasena_txt.requestFocus();
        JPopupMenu nuevo_menu = m.menuContextual(contrasena_txt);
        contrasena_txt.setComponentPopupMenu(nuevo_menu); 
    }//GEN-LAST:event_contrasena_txtMousePressed

    private void repita_contrass_txtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repita_contrass_txtMousePressed
        MenuContextual m = new MenuContextual();
        m.menuContextual(repita_contrass_txt);
        repita_contrass_txt.requestFocus();
        JPopupMenu nuevo_menu = m.menuContextual(repita_contrass_txt);
        repita_contrass_txt.setComponentPopupMenu(nuevo_menu);
    }//GEN-LAST:event_repita_contrass_txtMousePressed

    private void nombre_sitio_txtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombre_sitio_txtMousePressed
        MenuContextual m = new MenuContextual();        
        m.menuContextual(nombre_sitio_txt);
        nombre_sitio_txt.requestFocus();
        JPopupMenu nuevo_menu = m.menuContextual(nombre_sitio_txt);
        nombre_sitio_txt.setComponentPopupMenu(nuevo_menu);
    }//GEN-LAST:event_nombre_sitio_txtMousePressed

    private void url_sitio_txtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_url_sitio_txtMousePressed
        MenuContextual m = new MenuContextual();
        m.menuContextual(url_sitio_txt);
        url_sitio_txt.requestFocus();
        JPopupMenu nuevo_menu = m.menuContextual(url_sitio_txt);
        url_sitio_txt.setComponentPopupMenu(nuevo_menu);    
    }//GEN-LAST:event_url_sitio_txtMousePressed

    private void ver_password_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ver_password_btnActionPerformed
        if(ver_password_btn.isSelected())
            contrasena_txt.setEchoChar('0');
        else
            contrasena_txt.setEchoChar('*');
    }//GEN-LAST:event_ver_password_btnActionPerformed

    private boolean valida_datos(){
        boolean vacio = false;
        String contrasena1 = new String (contrasena_txt.getPassword());
        String contrasena2 = new String (repita_contrass_txt.getPassword());
           if (contrasena1.equals("") || contrasena2.equals("")
                || nombre_sitio_txt.getText().equals("")  || url_sitio_txt.getText().equals("")
                )
               vacio = true;
           
        return vacio;
    }

    private boolean coincide_passwords(){
        boolean coincide = false;
        String contrasena1 = new String ( contrasena_txt.getPassword() );
        String contrasena2 = new String ( repita_contrass_txt.getPassword() );   
        if (contrasena1.equals(contrasena2))
            coincide = true;
        return coincide;
    }

    

    /**
     * @param args the command line arguments
     */
    
    /**
     *
     * @param nombreUsuario
     * @param args the command line arguments
     */
    public void setNombreUsuario(String nombreUsuario){
        this.nombre_usuario = nombreUsuario;
    }
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
            java.util.logging.Logger.getLogger(AgregarPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AgregarPass dialog = new AgregarPass(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAceptarPass;
    private javax.swing.JPasswordField contrasena_txt;
    private datechooser.beans.DateChooserCombo fechaDch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jpBotones;
    private javax.swing.JPanel jpFormulario;
    private javax.swing.JPanel jpLabels;
    private javax.swing.JPanel jpTextos;
    private javax.swing.JTextField nombre_sitio_txt;
    private javax.swing.JPasswordField repita_contrass_txt;
    private javax.swing.JTextField url_sitio_txt;
    private javax.swing.JToggleButton ver_password_btn;
    // End of variables declaration//GEN-END:variables
}
