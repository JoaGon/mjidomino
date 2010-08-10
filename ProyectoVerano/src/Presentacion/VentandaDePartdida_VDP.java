/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VentandaDePartdida_VDP.java
 *
 * Created on Aug 3, 2010, 12:29:54 PM
 */

package Presentacion;

/**
 *
 * @author Isra
 */
public class VentandaDePartdida_VDP extends javax.swing.JFrame {

    /** Creates new form VentandaDePartdida_VDP */
    public VentandaDePartdida_VDP() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbTitulo = new javax.swing.JLabel();
        jbCrearParida = new javax.swing.JButton();
        jbCargarPartida = new javax.swing.JButton();
        jlimg1VDP = new javax.swing.JLabel();
        jlimgVDP3 = new javax.swing.JLabel();
        jbRecords = new javax.swing.JButton();
        jlimgVDP4 = new javax.swing.JLabel();
        jbMyprofile = new javax.swing.JButton();
        jlimgVDP5 = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();
        jlimgVDP6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jbTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/titulotext.png"))); // NOI18N

        jbCrearParida.setText("Crear Partida");
        jbCrearParida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearParidaActionPerformed(evt);
            }
        });

        jbCargarPartida.setText("Cargar Partida");
        jbCargarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCargarPartidaActionPerformed(evt);
            }
        });

        jlimg1VDP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/img1VDP.png"))); // NOI18N

        jlimgVDP3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/img3VDP.png"))); // NOI18N

        jbRecords.setText("Records");
        jbRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRecordsActionPerformed(evt);
            }
        });

        jlimgVDP4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/trofeoVDP.png"))); // NOI18N

        jbMyprofile.setText("MyProfile");

        jlimgVDP5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/perfilVDP.png"))); // NOI18N

        jbSalir.setText("Salir!");

        jlimgVDP6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/salirVDP.png"))); // NOI18N

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jbCrearParida)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(18, 18, 18)
                                .add(jlimgVDP3))
                            .add(jlimg1VDP)))
                    .add(layout.createSequentialGroup()
                        .add(jbRecords, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 131, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(26, 26, 26)
                        .add(jlimgVDP4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 127, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(143, 143, 143)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jbMyprofile)
                    .add(jbSalir, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 111, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jlimgVDP6)
                    .add(jlimgVDP5))
                .add(192, 192, 192))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(344, Short.MAX_VALUE)
                .add(jbTitulo)
                .add(250, 250, 250))
            .add(layout.createSequentialGroup()
                .add(jbCargarPartida)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jbTitulo)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jbCrearParida)
                            .add(jlimg1VDP))
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jlimgVDP4))
                            .add(layout.createSequentialGroup()
                                .add(25, 25, 25)
                                .add(jbRecords)))
                        .add(24, 24, 24)
                        .add(jbCargarPartida)
                        .add(5, 5, 5)
                        .add(jlimgVDP3))
                    .add(layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jlimgVDP5)
                            .add(jbMyprofile))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jbSalir)
                            .add(jlimgVDP6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 168, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCargarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCargarPartidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbCargarPartidaActionPerformed

    private void jbCrearParidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearParidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbCrearParidaActionPerformed

    private void jbRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRecordsActionPerformed
    new Presentacion.VentanRecord().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jbRecordsActionPerformed

    /**
    * @param args the command line arguments
    */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbCargarPartida;
    private javax.swing.JButton jbCrearParida;
    private javax.swing.JButton jbMyprofile;
    private javax.swing.JButton jbRecords;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jbTitulo;
    private javax.swing.JLabel jlimg1VDP;
    private javax.swing.JLabel jlimgVDP3;
    private javax.swing.JLabel jlimgVDP4;
    private javax.swing.JLabel jlimgVDP5;
    private javax.swing.JLabel jlimgVDP6;
    // End of variables declaration//GEN-END:variables

}