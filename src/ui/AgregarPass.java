
package ui;

import Conexiones.InterfazConexion;
import cifrado.AccCifrado;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author cooper15
 */
public class AgregarPass extends javax.swing.JDialog {

    /**
     * Creates new form AgregarPass
     */

    String nombreUsuario;
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
        txtContrasena = new javax.swing.JPasswordField();
        txtRepitaContrasena = new javax.swing.JPasswordField();
        txtNombreSitio = new javax.swing.JTextField();
        txtUrlSitio = new javax.swing.JTextField();
        fechaDch = new datechooser.beans.DateChooserCombo();
        jpBotones = new javax.swing.JPanel();
        bntAceptarPass = new javax.swing.JButton();

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
        jpTextos.add(txtContrasena);

        txtRepitaContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRepitaContrasenaActionPerformed(evt);
            }
        });
        jpTextos.add(txtRepitaContrasena);
        jpTextos.add(txtNombreSitio);
        jpTextos.add(txtUrlSitio);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                    .addComponent(jpBotones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jpBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntAceptarPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAceptarPassActionPerformed
        String contrasena = new String ( txtContrasena.getPassword() );
            if (!validaDatos() && coincidePasswords()){
                AccCifrado cifrar = new AccCifrado();
                contrasena = cifrar.cifrar_password(contrasena);
            // llama codigo para insersión..
                String diaMes = 
                        Integer.toString(fechaDch.getCurrent().get(Calendar.DAY_OF_MONTH));
                String mes = 
                        Integer.toString(fechaDch.getCurrent().get(Calendar.MONTH ) +1);
                String anio = 
                        Integer.toString(fechaDch.getCurrent().get(Calendar.YEAR));
                String fecha = "'"+anio+"-"+mes+"-"+diaMes+"'";
                String datos = "'"+nombreUsuario+"'"+","+"'"+contrasena+"'"+","
                         +"'"+txtNombreSitio.getText()+"'"+","
                         +"'"+txtUrlSitio.getText()+"'"+","+fecha;
                JOptionPane.showMessageDialog(null,datos);
                InterfazConexion nuevaConexion = new InterfazConexion();
                nuevaConexion.ingresaPassword(datos);
                this.dispose();
        }
            else 
                if( !coincidePasswords() )
                    JOptionPane.showMessageDialog(this,"Las contraseñas no coinciden");
        
            else
                JOptionPane.showMessageDialog(this,"Existen datos vacíos, por favor rellene el formulario completo","Atención",JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_bntAceptarPassActionPerformed

    private void txtRepitaContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRepitaContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRepitaContrasenaActionPerformed
    
    private boolean validaDatos(){
        boolean vacio = false;
        String contrasena1 = new String (txtContrasena.getPassword());
        String contrasena2 = new String (txtRepitaContrasena.getPassword());
           if (contrasena1.equals("") || contrasena2.equals("")
                || txtNombreSitio.getText().equals("")  || txtUrlSitio.getText().equals("")
                )
               vacio = true;
           
        return vacio;
    }

    private boolean coincidePasswords(){
        boolean coincide = false;
        String contrasena1 = new String ( txtContrasena.getPassword() );
        String contrasena2 = new String ( txtRepitaContrasena.getPassword() );   
        
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
        this.nombreUsuario = nombreUsuario;
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
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtNombreSitio;
    private javax.swing.JPasswordField txtRepitaContrasena;
    private javax.swing.JTextField txtUrlSitio;
    // End of variables declaration//GEN-END:variables
}
