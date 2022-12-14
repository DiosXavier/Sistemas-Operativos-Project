
import static java.lang.Integer.parseInt;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author pc
 */
public class RR extends javax.swing.JFrame {
    
    /*RR*/
    int contador_RR;
    int n_proceso;
    int rafaga=0;
    int quantum=0;
    int residuo_de_rafaga=0;
    int tiempo_de_proceso=0;
    int valor_de_barra;
    int cantidad_de_procesos;

    /**
     * Creates new form RR
     */
    public RR() {
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

        RR = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Ingreso = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTRafaga = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        JTQuantum = new javax.swing.JTextArea();
        Iniciar = new javax.swing.JButton();
        Agregar = new javax.swing.JButton();
        barra_procesos = new javax.swing.JProgressBar();
        jScrollPane4 = new javax.swing.JScrollPane();
        Porcentaje = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        P_completados = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        num_proceso = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        jLCantidadRR = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        jLTiempoProcesosRR = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 0));

        RR.setBackground(new java.awt.Color(0, 204, 204));
        RR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Ingreso.setBackground(new java.awt.Color(204, 204, 204));
        Ingreso.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Ingreso.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        Ingreso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N. Proceso", "Rafaga", "Quantum", "Residuo", "Estado"
            }
        ));
        jScrollPane1.setViewportView(Ingreso);
        Ingreso.getAccessibleContext().setAccessibleParent(jScrollPane2);

        jLabel6.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel6.setText("Rafaga:");

        jLabel7.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel7.setText("Quantum:");

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        JTRafaga.setColumns(20);
        JTRafaga.setRows(5);
        JTRafaga.setAutoscrolls(false);
        jScrollPane2.setViewportView(JTRafaga);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        JTQuantum.setColumns(20);
        JTQuantum.setRows(5);
        JTQuantum.setAutoscrolls(false);
        jScrollPane3.setViewportView(JTQuantum);

        Iniciar.setBackground(new java.awt.Color(0, 255, 204));
        Iniciar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Iniciar.setText("Iniciar");
        Iniciar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarActionPerformed(evt);
            }
        });

        Agregar.setBackground(new java.awt.Color(102, 255, 0));
        Agregar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Agregar.setText("Agregar");
        Agregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        barra_procesos.setBackground(new java.awt.Color(51, 51, 51));
        barra_procesos.setBorder(null);

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Porcentaje.setBackground(new java.awt.Color(153, 255, 0));
        Porcentaje.setColumns(20);
        Porcentaje.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Porcentaje.setRows(5);
        jScrollPane4.setViewportView(Porcentaje);

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 18)); // NOI18N
        jLabel8.setText("Tiempo de Procesos:");

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 24)); // NOI18N
        jLabel9.setText("Progreso de Procesos:");

        jLabel10.setFont(new java.awt.Font("Yu Gothic Light", 3, 24)); // NOI18N
        jLabel10.setText("Historial de Procesos:");

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 18)); // NOI18N
        jLabel11.setText("Cantidad de Procesos:");

        P_completados.setBackground(new java.awt.Color(204, 204, 204));
        P_completados.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        P_completados.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        P_completados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N. Proceso", "Rafaga", "Quantum", "Tiempo Final", "Estado"
            }
        ));
        jScrollPane6.setViewportView(P_completados);

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 18)); // NOI18N
        jLabel12.setText("Lista de Procesos:");

        jScrollPane7.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane7.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        num_proceso.setBackground(new java.awt.Color(153, 255, 0));
        num_proceso.setColumns(20);
        num_proceso.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        num_proceso.setRows(5);
        jScrollPane7.setViewportView(num_proceso);

        jScrollPane9.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane9.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jLCantidadRR.setBackground(new java.awt.Color(153, 255, 0));
        jLCantidadRR.setColumns(20);
        jLCantidadRR.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLCantidadRR.setRows(5);
        jScrollPane9.setViewportView(jLCantidadRR);

        jScrollPane11.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane11.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jLTiempoProcesosRR.setBackground(new java.awt.Color(153, 255, 0));
        jLTiempoProcesosRR.setColumns(20);
        jLTiempoProcesosRR.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLTiempoProcesosRR.setRows(5);
        jScrollPane11.setViewportView(jLTiempoProcesosRR);

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton1.setText("Menu");
        jButton1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 18)); // NOI18N
        jLabel13.setText("Lista de Procesos Terminados:");

        javax.swing.GroupLayout RRLayout = new javax.swing.GroupLayout(RR);
        RR.setLayout(RRLayout);
        RRLayout.setHorizontalGroup(
            RRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RRLayout.createSequentialGroup()
                .addGroup(RRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RRLayout.createSequentialGroup()
                        .addGroup(RRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RRLayout.createSequentialGroup()
                                .addGap(283, 283, 283)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(RRLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(RRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(RRLayout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(RRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, RRLayout.createSequentialGroup()
                                            .addGap(25, 25, 25)
                                            .addGroup(RRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(barra_procesos, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(23, 23, 23)
                        .addGroup(RRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Agregar)
                            .addComponent(Iniciar)))
                    .addGroup(RRLayout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(RRLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RRLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(241, 241, 241))
            .addGroup(RRLayout.createSequentialGroup()
                .addComponent(jScrollPane6)
                .addGap(184, 184, 184))
        );
        RRLayout.setVerticalGroup(
            RRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RRLayout.createSequentialGroup()
                .addGroup(RRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RRLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(RRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(RRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(RRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RRLayout.createSequentialGroup()
                                .addComponent(Agregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Iniciar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(9, 9, 9)
                .addGroup(RRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RRLayout.createSequentialGroup()
                        .addGroup(RRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(barra_procesos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(RRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarActionPerformed
        // TODO add your handling code here:
        /*Metodo iniar RR*/
        new Thread(new Hilo()).start();
        //Iniciar();
    }//GEN-LAST:event_IniciarActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        // TODO add your handling code here:
        /*Metodo Ingresar del RR*/
        if(Integer.parseInt(JTRafaga.getText())<=100){
            Ingresar();
            JTQuantum.setEditable(false);
        }else{
            JOptionPane.showMessageDialog(null,"Las rafagas no pueden exceder de 100");
            JTRafaga.setText(null);
            JTRafaga.grabFocus();
        }

    }//GEN-LAST:event_AgregarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //RR:
        Ventana V1 = new Ventana();
        V1.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(RR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RR().setVisible(true);
            }
        });
    }
    
     /*Hilo*/
    private class Hilo implements Runnable {
        
        @Override
        public void run() {
            int estado=1; //Estado de while que indica si se puede seguir o no
            int i=0; // contador de while
        
        while(estado!=0){
            while(i<contador_RR){ //Recorrer las filas
                Cargar(i);
                if(residuo_de_rafaga!=0 && residuo_de_rafaga>quantum){ //Ejecutando Procesos
                    for(int c=1; c<=quantum; c++){
                        Ingreso.setValueAt("Procesando",i,4);
                        residuo_de_rafaga--;
                        Barra(rafaga,residuo_de_rafaga);
                        Pintar();
                        Ingreso.setValueAt(String.valueOf(residuo_de_rafaga),i,3);
                        tiempo_de_proceso++;
                        Dormir();
                    }
                    Ingreso.setValueAt("Espera",i,4);
                    if(residuo_de_rafaga==0){
                        Ingreso.setValueAt("Terminado",i,4);
                        Pintar();
                        Informe(i);
                        Borrar(i);
                        barra_procesos.setValue(0);
                    }
            }else{
                if(residuo_de_rafaga>0 && quantum!=0){
                    while(residuo_de_rafaga>0){
                        Ingreso.setValueAt("Procesando",i,4);
                        residuo_de_rafaga--;
                        Barra(rafaga,residuo_de_rafaga);
                        Pintar();
                        Ingreso.setValueAt(String.valueOf(residuo_de_rafaga),i,3);
                        tiempo_de_proceso++;
                        Dormir();
                    }
                    Ingreso.setValueAt("Espera",i,4);
                    if(residuo_de_rafaga==0 && quantum!=0){
                        Ingreso.setValueAt("Terminado",i,4);
                        Pintar();
                        Informe(i);
                        Borrar(i);
                        barra_procesos.setValue(0);
                     }
                    }else{
                        if(residuo_de_rafaga==0 && quantum!=0){
                            Ingreso.setValueAt("Terminado",i,4);
                            Pintar();
                            Informe(i);
                            Borrar(i);
                            barra_procesos.setValue(0);
                        }
                    }
                }
                num_proceso.setText(String.valueOf("")); //Borrar contenido
                Porcentaje.setText(String.valueOf(""));
                i++;
            }
            i=0;
            num_proceso.setText(String.valueOf("")); //Borrar contenido
            Porcentaje.setText(String.valueOf(""));
            
        }
        }
    }
    
    /*Codigo RR*/
    public void Ingresar(){
        DefaultTableModel modelo = (DefaultTableModel) Ingreso.getModel();
        contador_RR++;
        Object[] miTabla = new Object [5];
        miTabla[0]=contador_RR;
        miTabla[1]=JTRafaga.getText();
        miTabla[2]=JTQuantum.getText();
        miTabla[3]=JTRafaga.getText();
        miTabla[4]="Listo";
        modelo.addRow(miTabla);
        Ingreso.setModel(modelo);
        JTRafaga.setText(null);
        JTRafaga.grabFocus();
    }
    
    public void Inicar(){
        
    }
    
       public void Dormir(){
    try{
        Thread.sleep(700); //Dormir sistema
    }catch(InterruptedException ex){
        Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE,null,ex);
    }

}
    
public void Cargar(int i){ //Carga los valores de la Tabla
        n_proceso = (int)Ingreso.getValueAt(i,0);
        rafaga = parseInt((String)(Ingreso.getValueAt(i,1)));
        quantum = parseInt((String)(Ingreso.getValueAt(i,2)));
        residuo_de_rafaga = parseInt((String)(Ingreso.getValueAt(i,3)));
    if(n_proceso>0){
        num_proceso.setText(String.valueOf(n_proceso));
    }
}


public void Barra(int rafaga, int residuo){ //Calcula porcentaje de la barra y su progreso
        int Rafaga=rafaga;
        int valor=100/rafaga;
        int porcentaje=100-(valor*residuo);
        valor_de_barra=porcentaje;
        Porcentaje.setText(String.valueOf(valor_de_barra+"%"));
}

public void Pintar(){
        barra_procesos.setValue(valor_de_barra);
        barra_procesos.repaint();
    }


public void Informe(int c){
    DefaultTableModel modelo2 = (DefaultTableModel) P_completados.getModel();

    Object[] TablaRRFinal= new Object[5];
    TablaRRFinal[0]= c+1;
    TablaRRFinal[1]= rafaga;
    TablaRRFinal[2]= quantum;
    TablaRRFinal[3]= tiempo_de_proceso+" Segundos";
    TablaRRFinal[4]= "Terminado";
    modelo2.addRow(TablaRRFinal);
    P_completados.setModel(modelo2);

    n_proceso++;
    jLCantidadRR.setText(String.valueOf(n_proceso+" Terminados"));
    jLTiempoProcesosRR.setText(String.valueOf(tiempo_de_proceso+" Segundos"));
}

public void Borrar(int c){ //Elimina los registros de la tabla procesos
    Ingreso.setValueAt(0,c,0);
    Ingreso.setValueAt("0",c,1);
    Ingreso.setValueAt("0",c,2);
    Ingreso.setValueAt("0",c,3);
    Ingreso.setValueAt("Terminando...",c,4);
}
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JTable Ingreso;
    private javax.swing.JButton Iniciar;
    private javax.swing.JTextArea JTQuantum;
    private javax.swing.JTextArea JTRafaga;
    private javax.swing.JTable P_completados;
    private javax.swing.JTextArea Porcentaje;
    private javax.swing.JPanel RR;
    private javax.swing.JProgressBar barra_procesos;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextArea jLCantidadRR;
    private javax.swing.JTextArea jLTiempoProcesosRR;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea num_proceso;
    // End of variables declaration//GEN-END:variables
}
