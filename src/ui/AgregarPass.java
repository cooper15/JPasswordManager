
package ui;

import conexiones.InterfazConexion;
import cifrado.AccCifrado;
import java.awt.HeadlessException;
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
        contrasenaTxt = new javax.swing.JPasswordField();
        repitaContrasenaTxt = new javax.swing.JPasswordField();
        nombreSitioTxt = new javax.swing.JTextField();
        urlSitioTxt = new javax.swing.JTextField();
        fechaDch = new datechooser.beans.DateChooserCombo();
        jpBotones = new javax.swing.JPanel();
        bntAceptarPass = new javax.swing.JButton();
        verPasswordBtn = new javax.swing.JToggleButton();

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

        contrasenaTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contrasenaTxtMousePressed(evt);
            }
        });
        jpTextos.add(contrasenaTxt);

        repitaContrasenaTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                repitaContrasenaTxtMousePressed(evt);
            }
        });
        jpTextos.add(repitaContrasenaTxt);

        nombreSitioTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombreSitioTxtMousePressed(evt);
            }
        });
        jpTextos.add(nombreSitioTxt);

        urlSitioTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                urlSitioTxtMousePressed(evt);
            }
        });
        jpTextos.add(urlSitioTxt);

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

        verPasswordBtn.setText("V");
        verPasswordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verPasswordBtnActionPerformed(evt);
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
                        .addComponent(verPasswordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(verPasswordBtn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jpBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntAceptarPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAceptarPassActionPerformed
        agregarPassword();
    }//GEN-LAST:event_bntAceptarPassActionPerformed

    private void agregarPassword() throws HeadlessException {
        String contrasena = new String ( contrasenaTxt.getPassword() );
        if (!datosVacios() && coincidePassword()){
            AccCifrado cifrar = new AccCifrado();
            contrasena = cifrar.cifrar_password(contrasena);
            String fecha = obtieneFecha();
            String datos = "'"+nombreUsuario+"'"+","+"'"+contrasena+"'"+","
                         + "'"+nombreSitioTxt.getText()+"'"+","
                         + "'"+urlSitioTxt.getText()+"'"+","+fecha;
            InterfazConexion nuevaConexion = new InterfazConexion();
            nuevaConexion.ingresaPassword(datos);
            this.dispose();
        }
        else
            if(!coincidePassword())
                JOptionPane.showMessageDialog(this,"Las contraseñas no coinciden");
            else
                JOptionPane.showMessageDialog(this,"Existen datos vacíos, "
                        +"por favor rellene el formulario completo","Atención",
                        JOptionPane.INFORMATION_MESSAGE);
    }

    private String obtieneFecha() {
        final int obtieneDia = fechaDch.getCurrent().get(Calendar.DAY_OF_MONTH);
        final int obtieneAnio = fechaDch.getCurrent().get(Calendar.YEAR);
        final int obtieneMes = fechaDch.getCurrent().get(Calendar.MONTH ) +1;
        String diaMes =Integer.toString(obtieneDia);
        String mes =Integer.toString(obtieneMes);
        String anio =Integer.toString(obtieneAnio);
        String fecha = "'"+anio+"-"+mes+"-"+diaMes+"'";
        return fecha;
    }

    private void contrasenaTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contrasenaTxtMousePressed
        MenuContextual m = new MenuContextual();
        m.menuContextual(contrasenaTxt);
        contrasenaTxt.requestFocus();
        JPopupMenu nuevoMenu = m.menuContextual(contrasenaTxt);
        contrasenaTxt.setComponentPopupMenu(nuevoMenu); 
    }//GEN-LAST:event_contrasenaTxtMousePressed

    private void repitaContrasenaTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repitaContrasenaTxtMousePressed
        MenuContextual m = new MenuContextual();
        m.menuContextual(repitaContrasenaTxt);
        repitaContrasenaTxt.requestFocus();
        JPopupMenu nuevoMenu = m.menuContextual(repitaContrasenaTxt);
        repitaContrasenaTxt.setComponentPopupMenu(nuevoMenu);
    }//GEN-LAST:event_repitaContrasenaTxtMousePressed

    private void nombreSitioTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreSitioTxtMousePressed
        MenuContextual m = new MenuContextual();        
        m.menuContextual(nombreSitioTxt);
        nombreSitioTxt.requestFocus();
        JPopupMenu nuevoMenu = m.menuContextual(nombreSitioTxt);
        nombreSitioTxt.setComponentPopupMenu(nuevoMenu);
    }//GEN-LAST:event_nombreSitioTxtMousePressed

    private void urlSitioTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_urlSitioTxtMousePressed
        MenuContextual m = new MenuContextual();
        m.menuContextual(urlSitioTxt);
        urlSitioTxt.requestFocus();
        JPopupMenu nuevoMenu = m.menuContextual(urlSitioTxt);
        urlSitioTxt.setComponentPopupMenu(nuevoMenu);    
    }//GEN-LAST:event_urlSitioTxtMousePressed

    private void verPasswordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verPasswordBtnActionPerformed
        if(verPasswordBtn.isSelected())
            contrasenaTxt.setEchoChar((char) 0);
        else
            contrasenaTxt.setEchoChar('*');
    }//GEN-LAST:event_verPasswordBtnActionPerformed

    private boolean datosVacios(){
        boolean vacio = false;
        String contrasena1 = new String(contrasenaTxt.getPassword());
        String contrasena2 = new String(repitaContrasenaTxt.getPassword());
        final boolean nombreSitioIgual = nombreSitioTxt.getText().equals("");
        final boolean urlSitioIgual = urlSitioTxt.getText().equals("");
        final boolean contrasenaDosIgual = contrasena2.equals("");
        final boolean contrasenaIgual = contrasena1.equals("");
        if (contrasenaIgual || contrasenaDosIgual 
           || nombreSitioIgual  || urlSitioIgual)
            vacio = true;     
        return vacio;
    }

    private boolean coincidePassword(){
        boolean coincide = false;
        String contrasena1 = new String(contrasenaTxt.getPassword());
        String contrasena2 = new String(repitaContrasenaTxt.getPassword());   
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
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
    private javax.swing.JPasswordField contrasenaTxt;
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
    private javax.swing.JTextField nombreSitioTxt;
    private javax.swing.JPasswordField repitaContrasenaTxt;
    private javax.swing.JTextField urlSitioTxt;
    private javax.swing.JToggleButton verPasswordBtn;
    // End of variables declaration//GEN-END:variables
}
