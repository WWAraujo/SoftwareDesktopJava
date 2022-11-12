
import SQL.DAO.ClienteDAO;
import cadastro.model.Cliente;
import java.text.ParseException;
import java.util.ArrayList;
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
 * @author wallace.waraujo
 */
public class TelaConsultaCliente extends javax.swing.JFrame {

    /**
     * Creates new form TelaConsultaCliente
     */
    public TelaConsultaCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtConsultaCli = new javax.swing.JTextField();
        btnConsultaCli = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblConsultaCli = new javax.swing.JTable();
        btnColocarCPFNota = new javax.swing.JButton();
        btnExcluirCliente = new javax.swing.JButton();
        btnCancelarPesquisa = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar Cliente");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Nome do cliente:");

        txtConsultaCli.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnConsultaCli.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnConsultaCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Start-Menu-Search-icon.png"))); // NOI18N
        btnConsultaCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaCliActionPerformed(evt);
            }
        });

        tblConsultaCli.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblConsultaCli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "CPF", "Telefone", "Endereço", "E-mail", "Estado Civil", "Data Nascimento", "Sexo"
            }
        ));
        jScrollPane1.setViewportView(tblConsultaCli);

        btnColocarCPFNota.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnColocarCPFNota.setText("Inserir CPF na Nota Fiscal");
        btnColocarCPFNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColocarCPFNotaActionPerformed(evt);
            }
        });

        btnExcluirCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnExcluirCliente.setText("Excluir ");
        btnExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirClienteActionPerformed(evt);
            }
        });

        btnCancelarPesquisa.setText("Cancelar");
        btnCancelarPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPesquisaActionPerformed(evt);
            }
        });

        jButton1.setText("Alterar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtConsultaCli, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnConsultaCli, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelarPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnColocarCPFNota, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelarPesquisa, btnExcluirCliente, jButton1});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnConsultaCli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtConsultaCli, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnCancelarPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnExcluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(btnColocarCPFNota, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnColocarCPFNota, btnExcluirCliente});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultaCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaCliActionPerformed

        //Chamando a pesquisa clienteDAO e passando em uma lista
        String nomeCliente = String.valueOf(txtConsultaCli.getText());

        ArrayList<Cliente> lista = ClienteDAO.pesquisarNome(nomeCliente);
        DefaultTableModel modelo = (DefaultTableModel) tblConsultaCli.getModel();

        //Limpar a tabela
        modelo.setRowCount(0);
        //Atualizar ou Preencher tabela
        for (Cliente item : lista) {
            modelo.addRow(new String[]{
                String.valueOf(item.getIdCliente()),
                String.valueOf(item.getNomeCliente()),
                String.valueOf(item.getCPFCliente()),
                String.valueOf(item.getCelularCliente()),
                String.valueOf(item.getEnderecoCliente()),
                String.valueOf(item.getEmailCliente()),
                String.valueOf(item.getEstadoCivil()),
                String.valueOf(item.getAniverCliente()),
                String.valueOf(item.getSexoCliente()),});
            
        }
    }//GEN-LAST:event_btnConsultaCliActionPerformed

    private void btnExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirClienteActionPerformed

        int indiceLinha = tblConsultaCli.getSelectedRow();
        int id = 0;
        if (indiceLinha >= 0) {
            id = Integer.parseInt(tblConsultaCli.getValueAt(indiceLinha, 0).toString());
            DefaultTableModel modelo = (DefaultTableModel) tblConsultaCli.getModel();
            modelo.removeRow(indiceLinha);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha");
        }
//Precisa fazer essa linha funcionar 

        boolean retorno = ClienteDAO.excluir(id);
        if (retorno) {
            JOptionPane.showMessageDialog(this, "Excluído com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Falha na exclusão!");
        }
    }//GEN-LAST:event_btnExcluirClienteActionPerformed

    private void btnColocarCPFNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColocarCPFNotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnColocarCPFNotaActionPerformed

    private void btnCancelarPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPesquisaActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarPesquisaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int linhaSelecionada = tblConsultaCli.getSelectedRow();

        if (linhaSelecionada >= 0) {
            Cliente obj = new Cliente();
            obj.setIdCliente(Integer.parseInt(tblConsultaCli.getValueAt(linhaSelecionada, 0).toString()));
            obj.setNomeCliente(String.valueOf(tblConsultaCli.getValueAt(linhaSelecionada, 1)));
            obj.setCPFCliente(String.valueOf(tblConsultaCli.getValueAt(linhaSelecionada, 2)));
            obj.setCelularCliente(String.valueOf(tblConsultaCli.getValueAt(linhaSelecionada, 3)));
            obj.setEnderecoCliente(String.valueOf(tblConsultaCli.getValueAt(linhaSelecionada, 4)));
            obj.setEmailCliente(String.valueOf(tblConsultaCli.getValueAt(linhaSelecionada, 5)));
            obj.setEstadoCivil(String.valueOf(tblConsultaCli.getValueAt(linhaSelecionada, 6)));
            obj.setAniverCliente(String.valueOf(tblConsultaCli.getValueAt(linhaSelecionada, 7)));
            obj.setSexoCliente(String.valueOf(tblConsultaCli.getValueAt(linhaSelecionada, 8)));
            
            CadastroCliente cadastro;
            try {
                cadastro = new CadastroCliente(obj);
                cadastro.setVisible(true);
            } catch (ParseException ex) {
                Logger.getLogger(TelaConsultaCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else{
            JOptionPane.showMessageDialog(this, "Selecione uma linha");
        }
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
            java.util.logging.Logger.getLogger(TelaConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarPesquisa;
    private javax.swing.JButton btnColocarCPFNota;
    private javax.swing.JButton btnConsultaCli;
    private javax.swing.JButton btnExcluirCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblConsultaCli;
    private javax.swing.JTextField txtConsultaCli;
    // End of variables declaration//GEN-END:variables
}
