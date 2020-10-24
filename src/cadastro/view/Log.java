
package cadastro.view;

import cadastro.Cadastro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Log extends javax.swing.JInternalFrame {
PreparedStatement pst = null;
Connection con = null;
ResultSet rs = null;
public void consultar() {
        String Sql = "Select * from pessoa"
                + " where id =?";
        try {
            pst = con.prepareStatement(Sql);
           pst.setString(1, txtId.getText());
           rs = pst.executeQuery();
           if(rs.next())
           {
           txtNome.setText(rs.getString(2));
           txtendereco.setText(rs.getString(3));
           txtbairro.setText(rs.getString(4));
           txtcidade.setText(rs.getString(5));
           txtestado.setText(rs.getString(6));
           txtcep.setText(rs.getString(7));
           cbSexo.setSelectedItem(rs.getString(8));
           txtcpf.setText(rs.getString(9));
           txtrg.setText(rs.getString(10));
           cbEstado.setSelectedItem(rs.getString(11));
           txtData.setText(rs.getString(12));
           txtcel.setText(rs.getString(13));
           txtemail.setText(rs.getString(14));
           cbperfil.setSelectedItem(rs.getString(15));
           txtesp.setText(rs.getString(16));
           }

        } catch(Exception e)
                {
                     JOptionPane.showMessageDialog(null,"Erro:"+e);
        }
        
    }

public void deletar()
    {
        String Sql = "DELETE FROM pessoa where id = ?";

        try
        {
        pst = con.prepareStatement(Sql);
        pst.setString(1,txtId.getText());
        pst.executeUpdate();
        pst.close();
        JOptionPane.showMessageDialog(null,"Deu certin pai");
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Não foi possível a exclusão"+e);
        }

    }

public void atualizar(){
        String Sql = "UPDATE pessoa SET nome =?, endereco =?, bairro=?, cidade=?, estado = ?, CEP = ?, sexo = ?, cpf = ?, rg = ?," 
                +" estadociv = ?, datanasc = ?, celular = ?, email = ?, perfil = ?, especialidade = ? where id = ? ";
               
        try{
            pst = con.prepareStatement(Sql);
            pst.setString(1,txtNome.getText());
            pst.setString(2,txtendereco.getText());
            pst.setString(3,txtbairro.getText());
            pst.setString(4,txtcidade.getText());
            pst.setString(5,txtestado.getText());
            pst.setString(6,txtcep.getText());
            pst.setString(7,cbSexo.getSelectedItem().toString());
            pst.setString(8,txtcpf.getText());
            pst.setString(9,txtrg.getText());
            pst.setString(10,cbEstado.getSelectedItem().toString());
            pst.setString(11,txtData.getText());
            pst.setString(12,txtcel.getText());
            pst.setString(13,txtemail.getText());
            pst.setString(14,cbperfil.getSelectedItem().toString());
            pst.setString(15,txtesp.getText());
            pst.setString(16,txtId.getText());
            JOptionPane.showMessageDialog(null,"Deu certin pai");
            pst.executeUpdate();
            pst.close();


        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Não foi possível atualizar."+e);
        }
       
    }



    public Log() {
        initComponents();
       con =  Cadastro.conectar();
        cbEstado.setSelectedIndex(-1);
      cbSexo.setSelectedIndex(-1);
      txtNome.setEnabled(false);
      cbSexo.setEnabled(false);
      cbperfil.setEnabled(false);
      cbEstado.setEnabled(false);
      txtestado.setEnabled(false);
      txtData.setEnabled(false);
      txtbairro.setEnabled(false);
      txtcel.setEnabled(false);
      txtcep.setEnabled(false);
      txtcidade.setEnabled(false);
      txtcpf.setEnabled(false);
      txtrg.setEnabled(false);
      txtesp.setEnabled(false);
      txtendereco.setEnabled(false);
      txtemail.setEnabled(false);
lblesp.setEnabled(false);

  cbperfil.setSelectedIndex(-1);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblendereco = new javax.swing.JLabel();
        lblbairro = new javax.swing.JLabel();
        lblcidade = new javax.swing.JLabel();
        lblestado = new javax.swing.JLabel();
        lblcep = new javax.swing.JLabel();
        lblsexo = new javax.swing.JLabel();
        lblestadociv = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblcel = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        lblrg = new javax.swing.JLabel();
        lblcpf = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtendereco = new javax.swing.JTextField();
        txtbairro = new javax.swing.JTextField();
        txtrg = new javax.swing.JTextField();
        txtcidade = new javax.swing.JTextField();
        txtestado = new javax.swing.JTextField();
        txtcep = new javax.swing.JTextField();
        txtData = new javax.swing.JTextField();
        txtcpf = new javax.swing.JTextField();
        txtcel = new javax.swing.JTextField();
        cbSexo = new javax.swing.JComboBox<>();
        cbEstado = new javax.swing.JComboBox<>();
        lblprofile = new javax.swing.JLabel();
        cbperfil = new javax.swing.JComboBox<>();
        lblesp = new javax.swing.JLabel();
        txtesp = new javax.swing.JTextField();
        btnPesquisa = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Nome");

        lblendereco.setText("Endereço");

        lblbairro.setText("Bairro");

        lblcidade.setText("Cidade");

        lblestado.setText("Estado");

        lblcep.setText("CEP");

        lblsexo.setText("Sexo");

        lblestadociv.setText("Estado Civil");

        lblData.setText("Data de Nascimento");

        lblcel.setText("Celular");

        lblemail.setText("Email");

        lblrg.setText("RG");

        lblcpf.setText("CPF");

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });

        txtendereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtenderecoActionPerformed(evt);
            }
        });

        txtestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtestadoActionPerformed(evt);
            }
        });

        txtcep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcepActionPerformed(evt);
            }
        });

        txtcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcelActionPerformed(evt);
            }
        });

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro(a)", "Casado(a)", "Divorciado(a)", "Viúvo(a)", "Separado(a)", "União Estável" }));

        lblprofile.setText("Profile");

        cbperfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Funcionario", "Cliente" }));
        cbperfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbperfilActionPerformed(evt);
            }
        });
        cbperfil.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cbperfilPropertyChange(evt);
            }
        });

        lblesp.setText("Especialidade");

        btnPesquisa.setText("Pesquisar");
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });

        btnEdit.setText("Editar");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblbairro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(txtbairro, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(424, 424, 424))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblemail)
                            .addComponent(lblcel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcel, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblesp)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtesp))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblcpf)
                                .addComponent(lblrg))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtrg, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblprofile)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbperfil, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblendereco)
                        .addGap(5, 5, 5)
                        .addComponent(txtendereco, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblcep)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtcep, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblestado)
                                        .addComponent(lblcidade, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtestado, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblsexo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblestadociv)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnExcluir)
                            .addComponent(btnPesquisa)
                            .addComponent(btnEdit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(209, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblprofile)
                    .addComponent(cbperfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblendereco)
                    .addComponent(txtendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblbairro)
                    .addComponent(txtbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblcidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblestado)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPesquisa)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcep)
                    .addComponent(txtcep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsexo)
                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblestadociv)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblemail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblrg)
                    .addComponent(txtrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcpf)
                    .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblesp)
                    .addComponent(txtesp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtenderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtenderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtenderecoActionPerformed

    private void txtestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtestadoActionPerformed

    private void txtcepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcepActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcelActionPerformed

    private void cbperfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbperfilActionPerformed
int selectedindex = cbperfil.getSelectedIndex();
if(selectedindex == 1 || selectedindex == -1)
{
txtesp.setEnabled(false);
lblesp.setEnabled(false);
}
else{
txtesp.setEnabled(true);
lblesp.setEnabled(true);
}
    }//GEN-LAST:event_cbperfilActionPerformed

    private void cbperfilPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cbperfilPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_cbperfilPropertyChange

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
  
        
      consultar();
      txtNome.setEnabled(true);
      cbSexo.setEnabled(true);
      cbperfil.setEnabled(true);
      cbEstado.setEnabled(true);
      txtestado.setEnabled(true);
      txtData.setEnabled(true);
      txtbairro.setEnabled(true);
      txtcel.setEnabled(true);
      txtcep.setEnabled(true);
      txtcidade.setEnabled(true);
      txtcpf.setEnabled(true);
      txtrg.setEnabled(true);
      txtendereco.setEnabled(true);
      txtemail.setEnabled(true);       
    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
       atualizar();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        deletar();
         cbEstado.setSelectedIndex(-1);
      cbSexo.setSelectedIndex(-1);
      txtNome.setEnabled(false);
      cbSexo.setEnabled(false);
      cbperfil.setEnabled(false);
      cbEstado.setEnabled(false);
      txtestado.setEnabled(false);
      txtData.setEnabled(false);
      txtbairro.setEnabled(false);
      txtcel.setEnabled(false);
      txtcep.setEnabled(false);
      txtcidade.setEnabled(false);
      txtcpf.setEnabled(false);
      txtrg.setEnabled(false);
      txtesp.setEnabled(false);
      txtendereco.setEnabled(false);
      txtemail.setEnabled(false);
lblesp.setEnabled(false);
    }//GEN-LAST:event_btnExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JComboBox<String> cbperfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblbairro;
    private javax.swing.JLabel lblcel;
    private javax.swing.JLabel lblcep;
    private javax.swing.JLabel lblcidade;
    private javax.swing.JLabel lblcpf;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblendereco;
    private javax.swing.JLabel lblesp;
    private javax.swing.JLabel lblestado;
    private javax.swing.JLabel lblestadociv;
    private javax.swing.JLabel lblprofile;
    private javax.swing.JLabel lblrg;
    private javax.swing.JLabel lblsexo;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtbairro;
    private javax.swing.JTextField txtcel;
    private javax.swing.JTextField txtcep;
    private javax.swing.JTextField txtcidade;
    private javax.swing.JTextField txtcpf;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtendereco;
    private javax.swing.JTextField txtesp;
    private javax.swing.JTextField txtestado;
    private javax.swing.JTextField txtrg;
    // End of variables declaration//GEN-END:variables
}
