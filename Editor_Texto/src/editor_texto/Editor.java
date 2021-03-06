/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editor_texto;

import java.awt.Event;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.Action;
import javax.swing.KeyStroke;
import javax.swing.text.Caret;
import javax.swing.text.DefaultEditorKit;
/**
 *
 * @author Paco G. <DAW 2016/2017 Ponferrada-Distancia>
 * Tarea Tema 7 - Editor de Texto Simple.
 */
public class Editor extends javax.swing.JFrame {
  String path_archivo="";
  String nombre_archivo="";
  String contenido="";
  String textoTotal="";
  String textoABuscar="";
  long ms;
    /**
     * Creates new form Editor
     */
    public Editor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTPrincipal = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMArchivo = new javax.swing.JMenu();
        JMINuevo = new javax.swing.JMenuItem();
        JMIAbrir = new javax.swing.JMenuItem();
        JMIGuardar = new javax.swing.JMenuItem();
        JMIGuardarComo = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        JMISalir = new javax.swing.JMenuItem();
        JMMenu = new javax.swing.JMenu();
        JMIBuscar = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        JMICortar = new javax.swing.JMenuItem();
        JMICopiar = new javax.swing.JMenuItem();
        JMIPegar = new javax.swing.JMenuItem();
        JMAcerca = new javax.swing.JMenu();
        JMIAcerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editor de Texto");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(250, 100));

        jScrollPane1.setViewportView(JTPrincipal);

        JMArchivo.setText("Archivo");

        JMINuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        JMINuevo.setText("Nuevo");
        JMINuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMINuevoActionPerformed(evt);
            }
        });
        JMArchivo.add(JMINuevo);

        JMIAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        JMIAbrir.setText("Abrir");
        JMIAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIAbrirActionPerformed(evt);
            }
        });
        JMArchivo.add(JMIAbrir);

        JMIGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        JMIGuardar.setText("Guardar");
        JMIGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIGuardarActionPerformed(evt);
            }
        });
        JMArchivo.add(JMIGuardar);

        JMIGuardarComo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        JMIGuardarComo.setText("Guardar Como");
        JMIGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIGuardarComoActionPerformed(evt);
            }
        });
        JMArchivo.add(JMIGuardarComo);
        JMArchivo.add(jSeparator1);

        JMISalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        JMISalir.setText("Salir");
        JMISalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMISalirActionPerformed(evt);
            }
        });
        JMArchivo.add(JMISalir);

        jMenuBar1.add(JMArchivo);

        JMMenu.setText("Editar");

        JMIBuscar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        JMIBuscar.setText("Buscar");
        JMIBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIBuscarActionPerformed(evt);
            }
        });
        JMMenu.add(JMIBuscar);
        JMMenu.add(jSeparator2);

        Action accionCortar = JTPrincipal.getActionMap().get(DefaultEditorKit.cutAction);
        accionCortar.putValue(Action.NAME, "Cortar");
        accionCortar.putValue(
            Action.ACCELERATOR_KEY,
            KeyStroke.getAWTKeyStroke('X', Event.CTRL_MASK));
        JMICortar.setAction(accionCortar);
        JMICortar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        JMICortar.setText("Cortar");
        JMICortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMICortarActionPerformed(evt);
            }
        });
        JMMenu.add(JMICortar);

        Action accionCopiar = JTPrincipal.getActionMap().get(DefaultEditorKit.copyAction);
        accionCopiar.putValue(Action.NAME, "Copiar");
        accionCopiar.putValue(
            Action.ACCELERATOR_KEY,
            KeyStroke.getAWTKeyStroke('C', Event.CTRL_MASK));
        JMICopiar.setAction(accionCopiar);
        JMICopiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        JMICopiar.setText("Copiar");
        JMICopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMICopiarActionPerformed(evt);
            }
        });
        JMMenu.add(JMICopiar);

        Action accionPegar = JTPrincipal.getActionMap().get(DefaultEditorKit.pasteAction);
        accionPegar.putValue(Action.NAME, "Pegar");
        accionPegar.putValue(
            Action.ACCELERATOR_KEY,
            KeyStroke.getAWTKeyStroke('V', Event.CTRL_MASK));
        JMIPegar.setAction(accionPegar);
        JMIPegar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        JMIPegar.setText("Pegar");
        JMIPegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIPegarActionPerformed(evt);
            }
        });
        JMMenu.add(JMIPegar);

        jMenuBar1.add(JMMenu);

        JMAcerca.setText("Acerca de..");

        JMIAcerca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        JMIAcerca.setText("Acerca de..");
        JMIAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIAcercaActionPerformed(evt);
            }
        });
        JMAcerca.add(JMIAcerca);

        jMenuBar1.add(JMAcerca);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMINuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMINuevoActionPerformed
        File arch=new File(nombre_archivo);    
        if (!"".equals(nombre_archivo) && ms==arch.lastModified()){
            int sel=JOptionPane.showConfirmDialog(rootPane, "AL ABRIR UN ARCHIVO NUEVO\nSE PERDERA\nLO QUE NO HAYA GUARDADO", "ADVERTENCIA",JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
            if (sel==0){
                this.setTitle("Editor de Texto");
                nombre_archivo="nuevo";
                path_archivo="";
                contenido="";
                JTPrincipal.setText(contenido);
            }    
        }    
        
// TODO add your handling code here:
    }//GEN-LAST:event_JMINuevoActionPerformed

    private void JMIAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIAbrirActionPerformed
        File arch=new File(nombre_archivo);    
        if (!"".equals(nombre_archivo) && ms==arch.lastModified()){
            int sel=JOptionPane.showConfirmDialog(rootPane, "AL ABRIR UN ARCHIVO NUEVO\nSE PERDERA\nLO QUE NO HAYA GUARDADO", "ADVERTENCIA",JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);
            }
          JFileChooser fileChooser = new JFileChooser();
          fileChooser.setCurrentDirectory(new java.io.File("."));
          int seleccion = fileChooser.showOpenDialog(JTPrincipal);
          if (seleccion == JFileChooser.APPROVE_OPTION){
              
              File fichero= fileChooser.getSelectedFile();
              ms = fichero.lastModified();
              nombre_archivo=fichero.getName();
              path_archivo=fichero.getPath();
              this.setTitle(nombre_archivo+" : Editor de Texto");
              try {
                  try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
                      String text;
                      contenido="";
                      while ((text = br.readLine()) != null) {
                          contenido += text + "\n";
                          JTPrincipal.setText(contenido);
                          //System.out.println(text);
                      }
                  }
                  
              } catch (IOException e){
                  Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, e);
              }
             }
        
          
          // TODO add your handling code here:
      
            
        
    }//GEN-LAST:event_JMIAbrirActionPerformed

    private void JMIGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIGuardarActionPerformed
            try {
            contenido = JTPrincipal.getText();
            File archivo = new File(path_archivo);
            BufferedWriter bw;
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(contenido);
            bw.close();
            
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(JTPrincipal, "El archivo no existe, use \"GUARDAR COMO...\"","ERROR", JOptionPane.ERROR_MESSAGE);
            } catch (IOException ex){
               Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex); 
            }
          
            

            
              
          
    }//GEN-LAST:event_JMIGuardarActionPerformed

    private void JMIGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIGuardarComoActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar Como ...");
        fileChooser.setCurrentDirectory(new java.io.File("."));
        fileChooser.setSelectedFile(new File(nombre_archivo));
        int seleccion = fileChooser.showSaveDialog(JTPrincipal);
        if (seleccion == JFileChooser.APPROVE_OPTION){
            File fichero= fileChooser.getSelectedFile();
        try {
            contenido = JTPrincipal.getText();
            BufferedWriter bw;
            bw = new BufferedWriter(new FileWriter(fichero));
            bw.write(contenido);
            bw.close();
            nombre_archivo=fichero.getName();
            path_archivo=fichero.getPath();
            this.setTitle(nombre_archivo+" : Editor de Texto");
            } catch (IOException ex) {
            Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            }    
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_JMIGuardarComoActionPerformed

    private void JMISalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMISalirActionPerformed
        
        File fichero = new File(path_archivo);
        if (ms== fichero.lastModified()){
            int confirmacion = JOptionPane.showConfirmDialog(JTPrincipal, "EL DOCUMENTO NO SE HA GUARDADO\n REALMENTE QUIERE SALIR? ", "SALIR", JOptionPane.YES_NO_OPTION);
            if (confirmacion==JOptionPane.YES_OPTION){
            System.exit(0);
            }
        } else {
            System.exit(0);
        }
        
// TODO add your handling code here:
    }//GEN-LAST:event_JMISalirActionPerformed

    private void JMICortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMICortarActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_JMICortarActionPerformed

    private void JMICopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMICopiarActionPerformed
        
// TODO add your handling code here:
    }//GEN-LAST:event_JMICopiarActionPerformed

    private void JMIPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIPegarActionPerformed
        
// TODO add your handling code here:
    }//GEN-LAST:event_JMIPegarActionPerformed

    private void JMIAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIAcercaActionPerformed
        JOptionPane.showMessageDialog(rootPane, "EDITOR DE TEXTO\nVersión 1.0\nDAW 2016/2017 DISTANCIA\nPONFERRADA\n\n© 2017 Paco G.","Acerca de...",JOptionPane.DEFAULT_OPTION);
// TODO add your handling code here:
    }//GEN-LAST:event_JMIAcercaActionPerformed

    private void JMIBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIBuscarActionPerformed
        try {
            
            textoABuscar = JOptionPane.showInputDialog(JTPrincipal, "Texto a buscar", textoABuscar);
            textoTotal = JTPrincipal.getText();
            int posicion = textoTotal.indexOf(textoABuscar);
            Caret seleccion = JTPrincipal.getCaret();
            int posicionInicial;
            if (seleccion.getDot() != seleccion.getMark()) {
                // Hay algo seleccionado
                posicionInicial = seleccion.getDot();
                textoTotal = JTPrincipal.getText();
                posicion = textoTotal.indexOf(textoABuscar, posicionInicial);
            }
            if (posicion ==-1){
                JOptionPane.showMessageDialog(null, "Texto no encontrado", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            JTPrincipal.setCaretPosition(posicion);
            JTPrincipal.moveCaretPosition(posicion + textoABuscar.length());
        } catch (HeadlessException e) {
            
            
        }
        
// TODO add your handling code here:
    }//GEN-LAST:event_JMIBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      //</editor-fold>
      
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Editor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMAcerca;
    private javax.swing.JMenu JMArchivo;
    private javax.swing.JMenuItem JMIAbrir;
    private javax.swing.JMenuItem JMIAcerca;
    private javax.swing.JMenuItem JMIBuscar;
    private javax.swing.JMenuItem JMICopiar;
    private javax.swing.JMenuItem JMICortar;
    private javax.swing.JMenuItem JMIGuardar;
    private javax.swing.JMenuItem JMIGuardarComo;
    private javax.swing.JMenuItem JMINuevo;
    private javax.swing.JMenuItem JMIPegar;
    private javax.swing.JMenuItem JMISalir;
    private javax.swing.JMenu JMMenu;
    private javax.swing.JTextPane JTPrincipal;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
