/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.vuelos;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 *
 * @author T-107
 */
public class Vuelos extends javax.swing.JFrame {

    /**
     * Creates new form Vuelos
     */
    public Vuelos() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        estatusExcel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        etiquetaTodos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        estatusExcel.setText("jLabel1");

        jButton1.setText("Cargar Excel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estatusExcel)
                    .addComponent(jButton1))
                .addContainerGap(534, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(estatusExcel)
                .addContainerGap(262, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cargar Excel", jPanel1);

        jButton2.setText("Buscar Todos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        etiquetaTodos.setText("jLabel2");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Numero de vuelo", "aerolinea", "numero de boletos", " fecha de salida", "origen", " destino"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jButton2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(etiquetaTodos)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etiquetaTodos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ver todos los registros", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   try{   
        JFileChooser selector=new JFileChooser();
        selector.showOpenDialog(this);
    File f=    selector.getSelectedFile();
       String nombreArchivo=f.getName();
       long tamano=f.length();
       //estatusExcel.setText("Nombre de archivo:"+nombreArchivo+
         //     " tamaño:"+tamano+" bytes");
       
   Workbook libro=    WorkbookFactory.create(f);
     Sheet hojaldra=libro.getSheetAt(0);
    int indiceUltima= hojaldra.getLastRowNum();
   // Row fila= hojaldra.getRow(1);
     ///   Cell celda=    fila.getCell(2);
        // double valor=     celda.getNumericCellValue();
   // estatusExcel.setText("l suelod de este usuario es:"+valor);
         
        PersistenciaCliente p=new PersistenciaCliente();
        for(int i=1;i<=indiceUltima;i++){
            Cliente u=new Cliente();
            Row filaActual=hojaldra.getRow(i);
            Cell celdanumeroDeVuelo= filaActual.getCell(0);
          Cell celdaaerolinea= filaActual.getCell(1);
          Cell celdanumeroDeBoletos= filaActual.getCell(2);
          Cell celdafechaDeSalida= filaActual.getCell(3);
          Cell celdaorigen= filaActual.getCell(4);
          Cell celdadestino= filaActual.getCell(5);
             u.setNumeroDeVuelo(celdanumeroDeVuelo.getStringCellValue());
             u.setAerolinea(celdaaerolinea.getStringCellValue());
            u.setNumeroDeBoletos(celdanumeroDeBoletos.getStringCellValue());          
          u.setFechaDeSalida(celdafechaDeSalida.getStringCellValue());          
          u.setOrigen(celdaorigen.getStringCellValue());
          u.setDestino(celdadestino.getStringCellValue());
              p.guardarUsuario(u);
        }
        estatusExcel.setText("Se guardaron" + indiceUltima+" filas");
     }catch(Exception e){
       estatusExcel.setText(e.getMessage());  
     }
    }                                        
/*
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
*/
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       try {
            // TODO add your handling code here:
            PersistenciaCliente p=new PersistenciaCliente();
            etiquetaTodos.setText("Clientes guardados"+   p.buscarTodos().size());
            jTable1.setModel(new DefaultTableModel(new String[]{"Numero de vuelo", "aerolinea","numero de boletos",
                " fecha de salida","origen"," destino"}, p.buscarTodos().size()));
            int i=0;
            for(Cliente u: p.buscarTodos()){
               jTable1.setValueAt(u.getNumeroDeVuelo(), i, 0);
                jTable1.setValueAt(u.getAerolinea(), i, 1);
                jTable1.setValueAt(u.getNumeroDeBoletos(), i, 2);
                 jTable1.setValueAt(u.getFechaDeSalida(), i, 3);
                  jTable1.setValueAt(u.getOrigen(), i, 4);
                   jTable1.setValueAt(u.getDestino(), i, 5);
                  
                
               i++;
            }
        } catch (Exception ex) {
            Logger.getLogger(Vuelos.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }//GEN-LAST:event_jButton2ActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vuelos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel estatusExcel;
    private javax.swing.JLabel etiquetaTodos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
