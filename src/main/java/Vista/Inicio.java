package Vista;


import Controlador.HiloInicio;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Inicio extends javax.swing.JFrame {

    HiloInicio hilo;

    public Inicio() {
        initComponents();
        //setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono.png")).getImage());
        this.setLocationRelativeTo(null);
        iniciarSplash();
        hilo = new HiloInicio(progreso);
        hilo.start();

        //Le damos tamaño y posición a nuestro Frame
        // this.setLocation(500, 150);
        //   this.setSize(331, 533);
        //Liberamos recursos
        hilo = null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progreso = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ybgestor");
        setModalExclusionType(null);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        progreso.setBackground(new java.awt.Color(0, 0, 102));
        progreso.setForeground(new java.awt.Color(204, 0, 0));
        progreso.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                progresoStateChanged(evt);
            }
        });
        getContentPane().add(progreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, 470, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\MATIAS\\Pictures\\FRENTE SISTEMA.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 487));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void progresoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_progresoStateChanged

        if (progreso.getValue() == 100) {
            this.dispose();
        }

    }//GEN-LAST:event_progresoStateChanged

    public javax.swing.JProgressBar getjProgressBar1() {
        return progreso;
    }

    /**
     * @param args the command line arguments
     */
    public void iniciarSplash() {
        this.getjProgressBar1().setBorderPainted(false);
        this.getjProgressBar1().setForeground(new Color(0,0,102));
        
        //[77,239,38]
        this.getjProgressBar1().setStringPainted(true);

    }

    public static void main(String args[]) {
        
                /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
               
             Inicio i;
                i = new Inicio();
                i.setVisible(true);
                AWTUtilities.setWindowOpaque(i, false);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar progreso;
    // End of variables declaration//GEN-END:variables
}