/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erikthegod.periodico;

/**
 *
 * @author dam
 */
public class JPPanel extends javax.swing.JPanel {

    /**
     * Creates new form JPPanel
     */
    public JPPanel() {
        initComponents();
        jcbGenero.setVisible(false);
        jtaCuerpo.setVisible(false);
        jtfCategoria.setVisible(false);
        jlCategoria.setVisible(false);
        jlCuerpo.setVisible(false);
    }
    
    public static final String DEPORTE = "Deporte";
    public static final String CULTURA = "Cultura";
    NotDeporte dep;
    NotCultura cul;
    GestorNoticias gest = new GestorNoticias();
    String deporte;
    String categoria;
    String genero;
    String cuerpo;
    String titulo;
    String autor;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtfTitulo = new javax.swing.JTextField();
        jlTitulo = new javax.swing.JLabel();
        jtfAutor = new javax.swing.JTextField();
        jlAutor = new javax.swing.JLabel();
        jcbNoticia = new javax.swing.JComboBox<>();
        jtfCategoria = new javax.swing.JTextField();
        jlCategoria = new javax.swing.JLabel();
        jlCuerpo = new javax.swing.JLabel();
        jcbGenero = new javax.swing.JComboBox<>();
        jbAniadir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaCuerpo = new javax.swing.JTextArea();
        jbGenerar = new javax.swing.JButton();

        jlTitulo.setText("Titulo");

        jlAutor.setText("Autor");

        jcbNoticia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cultura", "Deporte" }));
        jcbNoticia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbNoticiaActionPerformed(evt);
            }
        });

        jlCategoria.setText("Categoria");

        jlCuerpo.setText("Cuerpo Noticia");

        jcbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        jbAniadir.setText("Añadir Noticia");
        jbAniadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAniadirActionPerformed(evt);
            }
        });

        jtaCuerpo.setColumns(20);
        jtaCuerpo.setRows(5);
        jScrollPane1.setViewportView(jtaCuerpo);

        jbGenerar.setText("Generar HTML");
        jbGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGenerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbNoticia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jlCategoria)
                                .addGap(25, 25, 25)
                                .addComponent(jtfCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlCuerpo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(103, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlTitulo)
                            .addComponent(jbAniadir)
                            .addComponent(jlAutor))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbGenerar)
                                .addGap(35, 35, 35))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAniadir)
                    .addComponent(jbGenerar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlAutor))
                .addGap(13, 13, 13)
                .addComponent(jcbNoticia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCategoria)
                    .addComponent(jtfCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCuerpo)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void reset(){
        jtaCuerpo.setText("");
        jtfCategoria.setText("");
        jtfAutor.setText("");
        jtfTitulo.setText("");
    }
    private void jcbNoticiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbNoticiaActionPerformed
        // TODO add your handling code here:
        if (jcbNoticia.getSelectedItem() == DEPORTE) {
            jcbGenero.setVisible(true);
            jlCategoria.setText(DEPORTE);

        } else if (jcbNoticia.getSelectedItem() == CULTURA) {            
            jcbGenero.setVisible(false);
            jlCategoria.setText("Categoria");
        }
        jlCategoria.setVisible(true);
        jlCuerpo.setVisible(true);
        jtfCategoria.setVisible(true);
        jtaCuerpo.setVisible(true);
    }//GEN-LAST:event_jcbNoticiaActionPerformed

    private void jbAniadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAniadirActionPerformed
        // TODO add your handling code here:
        if (jcbNoticia.getSelectedItem() == DEPORTE) {
            titulo = jtfTitulo.getText();
            autor = jtfAutor.getText();
            deporte = jtfCategoria.getText();
            genero = jcbGenero.getSelectedItem().toString();
            cuerpo = jtaCuerpo.getText();
            dep = new NotDeporte(titulo, autor, deporte, genero, cuerpo);
            gest.noticias.add(dep);
        } else if (jcbNoticia.getSelectedItem() == CULTURA){            
            titulo = jtfTitulo.getText();
            autor = jtfAutor.getText();
            categoria = jtfCategoria.getText();
            cuerpo = jtaCuerpo.getText();
            cul = new NotCultura(titulo, autor, categoria, cuerpo);
            gest.noticias.add(cul);
        }
        reset();
    }//GEN-LAST:event_jbAniadirActionPerformed

    private void jbGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGenerarActionPerformed
        // TODO add your handling code here:
        gest.paginaPrincipalHTML();
        gest.exportarHtml();
        
    }//GEN-LAST:event_jbGenerarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAniadir;
    private javax.swing.JButton jbGenerar;
    private javax.swing.JComboBox<String> jcbGenero;
    private javax.swing.JComboBox<String> jcbNoticia;
    private javax.swing.JLabel jlAutor;
    private javax.swing.JLabel jlCategoria;
    private javax.swing.JLabel jlCuerpo;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextArea jtaCuerpo;
    private javax.swing.JTextField jtfAutor;
    private javax.swing.JTextField jtfCategoria;
    private javax.swing.JTextField jtfTitulo;
    // End of variables declaration//GEN-END:variables
}
