
package View;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Tela_GUI extends javax.swing.JFrame {
    //Códigos dos produtos----------------------
    static String Cod_coca;
    static String Cod_pao;
    static String Cod_leite;
    static String Cod_guarana;
    
    //Códigos dos valores-------------------
    static String valor_coca;
    static String valor_pao;
    static String valor_leite;
    static String valor_guarana;
    
    static float ValorTC;
    static float ValorTP;
    static float ValorTL;
    static float ValorTG;
    
    
    //Código das Quantidades--------------------
    static Integer Qtd_coca = 0;
    static Integer Qtd_pao =0;
    static Integer Qtd_leite = 0;
    static Integer Qtd_guarana = 0;
    static Integer QtdProd;
 
    //Códigos dos Nomes -------------------------
    static String prod_Coca;
    static String prod_Pao;
    static String prod_Leite;
    static String prod_Guarana;
    
    static String Produto; 
    
    static String confirm_cod;
    static String numE;
    static String n = "1";
    static float valor;  
    static Integer QtdTotal;
   
    
    
    public Tela_GUI() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        unchanging1 = new com.sun.animation.effects.Unchanging();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        panel1 = new org.edisoncor.gui.panel.Panel();
        Sobre_BTN = new org.edisoncor.gui.button.ButtonColoredAction();
        Titulo_LBL = new org.edisoncor.gui.label.LabelRound();
        Fechar_BTN1 = new org.edisoncor.gui.button.ButtonColoredAction();
        Cadastrar_BTN = new org.edisoncor.gui.button.ButtonColoredAction();
        labelMetric1 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric2 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric3 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric4 = new org.edisoncor.gui.label.LabelMetric();
        Produto_TXT = new org.edisoncor.gui.textField.TextFieldRound();
        QtdProd_TXT = new org.edisoncor.gui.textField.TextFieldRound();
        ValorP_TXT = new org.edisoncor.gui.textField.TextFieldRound();
        Cod_TXT = new org.edisoncor.gui.textField.TextFieldRound();
        lugarestoque = new org.edisoncor.gui.label.LabelMetric();
        num_estoque = new org.edisoncor.gui.textField.TextFieldRound();
        panel3 = new org.edisoncor.gui.panel.Panel();
        Sobre_BTN1 = new org.edisoncor.gui.button.ButtonColoredAction();
        Titulo_LBL1 = new org.edisoncor.gui.label.LabelRound();
        Fechar_BTN2 = new org.edisoncor.gui.button.ButtonColoredAction();
        Finalizar_BTN = new org.edisoncor.gui.button.ButtonColoredAction();
        labelMetric5 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric6 = new org.edisoncor.gui.label.LabelMetric();
        CodigoPC_TXT = new org.edisoncor.gui.textField.TextFieldRound();
        TotalC_TXT = new org.edisoncor.gui.textField.TextFieldRound();
        labelMetric9 = new org.edisoncor.gui.label.LabelMetric();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        guardar = new org.edisoncor.gui.button.ButtonColoredAction();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        panel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel1.setColorPrimario(new java.awt.Color(204, 204, 204));
        panel1.setColorSecundario(new java.awt.Color(102, 102, 102));
        panel1.setLayout(null);

        Sobre_BTN.setBackground(new java.awt.Color(153, 153, 255));
        Sobre_BTN.setText("?");
        Sobre_BTN.setToolTipText("Ajuda");
        Sobre_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sobre_BTNActionPerformed(evt);
            }
        });
        panel1.add(Sobre_BTN);
        Sobre_BTN.setBounds(760, 10, 40, 50);

        Titulo_LBL.setBackground(new java.awt.Color(51, 102, 255));
        Titulo_LBL.setText("Estoque");
        Titulo_LBL.setColorDeBorde(new java.awt.Color(51, 51, 51));
        Titulo_LBL.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        panel1.add(Titulo_LBL);
        Titulo_LBL.setBounds(210, 20, 490, 70);

        Fechar_BTN1.setBackground(new java.awt.Color(153, 0, 0));
        Fechar_BTN1.setText("X");
        Fechar_BTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fechar_BTN1ActionPerformed(evt);
            }
        });
        panel1.add(Fechar_BTN1);
        Fechar_BTN1.setBounds(810, 10, 80, 50);

        Cadastrar_BTN.setBackground(new java.awt.Color(0, 255, 204));
        Cadastrar_BTN.setText("Cadastrar");
        Cadastrar_BTN.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Cadastrar_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cadastrar_BTNActionPerformed(evt);
            }
        });
        panel1.add(Cadastrar_BTN);
        Cadastrar_BTN.setBounds(330, 370, 250, 60);

        labelMetric1.setText("Qtd.Prudutos:");
        labelMetric1.setColorDeSombra(new java.awt.Color(153, 153, 153));
        labelMetric1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        panel1.add(labelMetric1);
        labelMetric1.setBounds(470, 110, 170, 40);

        labelMetric2.setText("Código:");
        labelMetric2.setColorDeSombra(new java.awt.Color(153, 153, 153));
        labelMetric2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        panel1.add(labelMetric2);
        labelMetric2.setBounds(90, 110, 110, 40);

        labelMetric3.setText("Produto:");
        labelMetric3.setColorDeSombra(new java.awt.Color(153, 153, 153));
        labelMetric3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        panel1.add(labelMetric3);
        labelMetric3.setBounds(270, 110, 120, 40);

        labelMetric4.setText("Valor.U:");
        labelMetric4.setColorDeSombra(new java.awt.Color(153, 153, 153));
        labelMetric4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        panel1.add(labelMetric4);
        labelMetric4.setBounds(680, 110, 100, 40);

        Produto_TXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Produto_TXTActionPerformed(evt);
            }
        });
        panel1.add(Produto_TXT);
        Produto_TXT.setBounds(250, 160, 170, 40);

        QtdProd_TXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QtdProd_TXTActionPerformed(evt);
            }
        });
        panel1.add(QtdProd_TXT);
        QtdProd_TXT.setBounds(470, 160, 170, 40);

        ValorP_TXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorP_TXTActionPerformed(evt);
            }
        });
        panel1.add(ValorP_TXT);
        ValorP_TXT.setBounds(670, 160, 150, 40);

        Cod_TXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cod_TXTActionPerformed(evt);
            }
        });
        panel1.add(Cod_TXT);
        Cod_TXT.setBounds(50, 160, 170, 40);

        lugarestoque.setText("Lugar no Estoque: ");
        lugarestoque.setColorDeSombra(new java.awt.Color(153, 153, 153));
        lugarestoque.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        panel1.add(lugarestoque);
        lugarestoque.setBounds(350, 230, 220, 40);

        num_estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_estoqueActionPerformed(evt);
            }
        });
        panel1.add(num_estoque);
        num_estoque.setBounds(420, 290, 60, 40);

        jTabbedPane4.addTab("Estoque", panel1);

        panel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel3.setColorPrimario(new java.awt.Color(204, 204, 204));
        panel3.setColorSecundario(new java.awt.Color(102, 102, 102));
        panel3.setLayout(null);

        Sobre_BTN1.setBackground(new java.awt.Color(153, 153, 255));
        Sobre_BTN1.setText("?");
        Sobre_BTN1.setToolTipText("Ajuda");
        Sobre_BTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sobre_BTN1ActionPerformed(evt);
            }
        });
        panel3.add(Sobre_BTN1);
        Sobre_BTN1.setBounds(760, 10, 40, 50);

        Titulo_LBL1.setBackground(new java.awt.Color(51, 102, 255));
        Titulo_LBL1.setText("Caixa");
        Titulo_LBL1.setColorDeBorde(new java.awt.Color(51, 51, 51));
        Titulo_LBL1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        panel3.add(Titulo_LBL1);
        Titulo_LBL1.setBounds(210, 20, 490, 70);

        Fechar_BTN2.setBackground(new java.awt.Color(153, 0, 0));
        Fechar_BTN2.setText("X");
        Fechar_BTN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fechar_BTN2ActionPerformed(evt);
            }
        });
        panel3.add(Fechar_BTN2);
        Fechar_BTN2.setBounds(810, 10, 80, 50);

        Finalizar_BTN.setBackground(new java.awt.Color(0, 255, 204));
        Finalizar_BTN.setText("Finalizar compra");
        Finalizar_BTN.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Finalizar_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Finalizar_BTNActionPerformed(evt);
            }
        });
        panel3.add(Finalizar_BTN);
        Finalizar_BTN.setBounds(570, 410, 220, 50);

        labelMetric5.setText("Total da Compra:");
        labelMetric5.setColorDeSombra(new java.awt.Color(153, 153, 153));
        labelMetric5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        panel3.add(labelMetric5);
        labelMetric5.setBounds(570, 290, 230, 40);

        labelMetric6.setText("Tabela de Preços");
        labelMetric6.setColorDeSombra(new java.awt.Color(153, 153, 153));
        labelMetric6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        panel3.add(labelMetric6);
        labelMetric6.setBounds(80, 130, 230, 40);

        CodigoPC_TXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoPC_TXTActionPerformed(evt);
            }
        });
        panel3.add(CodigoPC_TXT);
        CodigoPC_TXT.setBounds(550, 160, 250, 50);

        TotalC_TXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalC_TXTActionPerformed(evt);
            }
        });
        panel3.add(TotalC_TXT);
        TotalC_TXT.setBounds(550, 340, 250, 50);

        labelMetric9.setText("Código do Produto:");
        labelMetric9.setColorDeSombra(new java.awt.Color(153, 153, 153));
        labelMetric9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        panel3.add(labelMetric9);
        labelMetric9.setBounds(550, 110, 230, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"        102", "Coca-Cola", "11,50"},
                {"        202", "Pão de Forma", "5,00"},
                {"        302", "Leite Integral", "3,00"},
                {"        402", "Guarana Antártica", "6,99"}
            },
            new String [] {
                "Código", "Produtos", "Preços"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        panel3.add(jScrollPane1);
        jScrollPane1.setBounds(40, 190, 440, 100);

        guardar.setBackground(new java.awt.Color(0, 255, 204));
        guardar.setText("Guardar no carrinho");
        guardar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        panel3.add(guardar);
        guardar.setBounds(580, 230, 190, 40);

        jTabbedPane4.addTab("Caixa", panel3);

        getContentPane().add(jTabbedPane4);
        jTabbedPane4.setBounds(0, 0, 910, 600);

        setSize(new java.awt.Dimension(894, 596));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void MostrarTotal (){
   
    }
    
    public void cadastroSucesso (){
        JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso!");
                
        
        QtdProd = 0;
        Cod_TXT.setText(""); 
        Produto_TXT.setText("");
        ValorP_TXT.setText ("");
        QtdProd_TXT.setText("");
        num_estoque.setText("");
    }
    private void Cadastrar_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cadastrar_BTNActionPerformed
        //Cadastro dos produtos
        numE = num_estoque.getText();
        if(Integer.parseInt(numE) == 1){
             Cod_coca = Cod_TXT.getText();
             valor_coca = ValorP_TXT.getText();
            QtdTotal = Integer.parseInt(QtdProd_TXT.getText());
             prod_Coca = Produto_TXT.getText();
            cadastroSucesso (); 
             
        }else if(Integer.parseInt(numE) == 2){
             Cod_pao = Cod_TXT.getText();
             valor_pao = ValorP_TXT.getText();
             Float.parseFloat(valor_pao); 
             QtdTotal = Integer.parseInt(QtdProd_TXT.getText());
             prod_Pao = Produto_TXT.getText();
             cadastroSucesso ();
             
        }else if(Integer.parseInt(numE) ==3){
             Cod_leite = Cod_TXT.getText();
             valor_leite = ValorP_TXT.getText();
             Float.parseFloat(valor_leite);
             QtdTotal = Integer.parseInt(QtdProd_TXT.getText());
             prod_Leite = Produto_TXT.getText();
             cadastroSucesso ();
             
        }else if(Integer.parseInt(numE) ==4){
             Cod_guarana = Cod_TXT.getText();
             valor_guarana = ValorP_TXT.getText();
             Float.parseFloat(valor_guarana);
             QtdTotal = Integer.parseInt(QtdProd_TXT.getText());
             prod_Guarana = Produto_TXT.getText();
             cadastroSucesso ();
           
        }else{
            JOptionPane.showMessageDialog(null,"Código Não correspondente ao \n Tamanho do estoque");
             Produto = "";
         
             QtdProd = 0;
             Cod_TXT.setText(""); 
             Produto_TXT.setText("");
             ValorP_TXT.setText ("");
             QtdProd_TXT.setText("");
             num_estoque.setText("");
        }
        
        
       
    }//GEN-LAST:event_Cadastrar_BTNActionPerformed

    private void Fechar_BTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fechar_BTN1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Fechar_BTN1ActionPerformed

    private void Sobre_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sobre_BTNActionPerformed
        new Sobre_GUI().setVisible(true);
    }//GEN-LAST:event_Sobre_BTNActionPerformed

    private void Fechar_BTN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fechar_BTN2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Fechar_BTN2ActionPerformed

    private void Sobre_BTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sobre_BTN1ActionPerformed
        new Sobre_GUI().setVisible(true);
    }//GEN-LAST:event_Sobre_BTN1ActionPerformed

    private void Finalizar_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Finalizar_BTNActionPerformed
        new Pagamento_GUI().setVisible(true);
        
        
        
    }//GEN-LAST:event_Finalizar_BTNActionPerformed

    private void Produto_TXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Produto_TXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Produto_TXTActionPerformed

    private void QtdProd_TXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QtdProd_TXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QtdProd_TXTActionPerformed

    private void ValorP_TXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorP_TXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValorP_TXTActionPerformed

    private void Cod_TXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cod_TXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cod_TXTActionPerformed

    private void num_estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_estoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num_estoqueActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        confirm_cod = CodigoPC_TXT.getText();
        
        if(Integer.parseInt(confirm_cod) == Integer.parseInt(Cod_coca)){
           
          Qtd_coca += Integer.parseInt(n);
          valor += Float.parseFloat(valor_coca);
          ValorTC +=Float.parseFloat(valor_coca);
          TotalC_TXT.setText(String.valueOf(valor));
          
        }else if(Integer.parseInt(confirm_cod) == Integer.parseInt(Cod_pao)){
            
            Qtd_pao += Integer.parseInt(n);
            valor += Float.parseFloat(valor_pao);
            ValorTP += Float.parseFloat(valor_pao);
            TotalC_TXT.setText(String.valueOf(valor));
            
        }else if(Integer.parseInt(confirm_cod) == Integer.parseInt(Cod_leite)){
            
            Qtd_leite += Integer.parseInt(n);
            valor += Float.parseFloat(valor_leite);
            ValorTL += Float.parseFloat(valor_leite);
            TotalC_TXT.setText(String.valueOf(valor));
            
        }else if(Integer.parseInt(confirm_cod) == Integer.parseInt(Cod_guarana)){
            
            Qtd_guarana += Integer.parseInt(n);
            valor += Float.parseFloat(valor_guarana);
            ValorTG += Float.parseFloat(valor_guarana);
            TotalC_TXT.setText(String.valueOf(valor));
        }
        
        
    }//GEN-LAST:event_guardarActionPerformed

    private void TotalC_TXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalC_TXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalC_TXTActionPerformed

    private void CodigoPC_TXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoPC_TXTActionPerformed

    }//GEN-LAST:event_CodigoPC_TXTActionPerformed

    
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(Tela_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonColoredAction Cadastrar_BTN;
    private org.edisoncor.gui.textField.TextFieldRound Cod_TXT;
    private org.edisoncor.gui.textField.TextFieldRound CodigoPC_TXT;
    private org.edisoncor.gui.button.ButtonColoredAction Fechar_BTN1;
    private org.edisoncor.gui.button.ButtonColoredAction Fechar_BTN2;
    private org.edisoncor.gui.button.ButtonColoredAction Finalizar_BTN;
    private org.edisoncor.gui.textField.TextFieldRound Produto_TXT;
    private org.edisoncor.gui.textField.TextFieldRound QtdProd_TXT;
    private org.edisoncor.gui.button.ButtonColoredAction Sobre_BTN;
    private org.edisoncor.gui.button.ButtonColoredAction Sobre_BTN1;
    private org.edisoncor.gui.label.LabelRound Titulo_LBL;
    private org.edisoncor.gui.label.LabelRound Titulo_LBL1;
    private org.edisoncor.gui.textField.TextFieldRound TotalC_TXT;
    private org.edisoncor.gui.textField.TextFieldRound ValorP_TXT;
    private org.edisoncor.gui.button.ButtonColoredAction guardar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTable jTable1;
    private org.edisoncor.gui.label.LabelMetric labelMetric1;
    private org.edisoncor.gui.label.LabelMetric labelMetric2;
    private org.edisoncor.gui.label.LabelMetric labelMetric3;
    private org.edisoncor.gui.label.LabelMetric labelMetric4;
    private org.edisoncor.gui.label.LabelMetric labelMetric5;
    private org.edisoncor.gui.label.LabelMetric labelMetric6;
    private org.edisoncor.gui.label.LabelMetric labelMetric9;
    private org.edisoncor.gui.label.LabelMetric lugarestoque;
    private org.edisoncor.gui.textField.TextFieldRound num_estoque;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.Panel panel3;
    private com.sun.animation.effects.Unchanging unchanging1;
    // End of variables declaration//GEN-END:variables
}
