
package View;
import static View.Tela_GUI.Qtd_coca;
import static View.Tela_GUI.ValorTC;
import static View.Tela_GUI.prod_Coca;
import static View.Tela_GUI.valor;
import static View.Tela_GUI.prod_Pao;
import static View.Tela_GUI.prod_Leite;
import static View.Tela_GUI.prod_Guarana;
import static View.Tela_GUI.Qtd_pao;
import static View.Tela_GUI.Qtd_leite;
import static View.Tela_GUI.Qtd_guarana;
import static View.Tela_GUI.ValorTP;
import static View.Tela_GUI.ValorTL;
import static View.Tela_GUI.ValorTG;
import static java.util.EnumSet.range;
import java.util.Random;
import javax.swing.JOptionPane;

public class Pagamento_GUI extends javax.swing.JFrame {
    static float Recebido = 0;
    static float Troco = 0;
    static String Nome = " ";
    static int Contato = 0;
    static int CPF = 0;
    static String Vazio = " ";
    static Integer num;
    static String formaPag ="";
    static String pix = "PIX";
    static String dinheiro = "Dinheiro";
    
    public Pagamento_GUI() {
        initComponents();
        TotalP_TXT.setText(String.valueOf(valor));
        
        
    }
    public void Infos(){
        Nome = Nome_TXT.getText()+" ";
        Contato = Integer.parseInt(Contato_TXT.getText()+0);
        CPF = Integer.parseInt(CPF_TXT.getText()+0);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel3 = new org.edisoncor.gui.panel.Panel();
        Sobre_BTN1 = new org.edisoncor.gui.button.ButtonColoredAction();
        Titulo_LBL1 = new org.edisoncor.gui.label.LabelRound();
        Fechar_BTN2 = new org.edisoncor.gui.button.ButtonColoredAction();
        Encerrar_BTN = new org.edisoncor.gui.button.ButtonColoredAction();
        labelMetric5 = new org.edisoncor.gui.label.LabelMetric();
        TotalP_TXT = new org.edisoncor.gui.textField.TextFieldRound();
        CPF_TXT = new org.edisoncor.gui.textField.TextFieldRound();
        labelMetric10 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric12 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric13 = new org.edisoncor.gui.label.LabelMetric();
        GerarChave_BTN = new org.edisoncor.gui.button.ButtonColoredAction();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        Recebido_TXT = new org.edisoncor.gui.textField.TextFieldRound();
        Nome_TXT = new org.edisoncor.gui.textField.TextFieldRound();
        Contato_TXT = new org.edisoncor.gui.textField.TextFieldRound();
        labelMetric14 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric15 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric16 = new org.edisoncor.gui.label.LabelMetric();
        Pagar_BTN = new org.edisoncor.gui.button.ButtonColoredAction();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

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
        Sobre_BTN1.setBounds(500, 20, 40, 50);

        Titulo_LBL1.setBackground(new java.awt.Color(51, 102, 255));
        Titulo_LBL1.setText("Pagamento");
        Titulo_LBL1.setColorDeBorde(new java.awt.Color(51, 51, 51));
        Titulo_LBL1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        panel3.add(Titulo_LBL1);
        Titulo_LBL1.setBounds(20, 10, 460, 70);

        Fechar_BTN2.setBackground(new java.awt.Color(153, 0, 0));
        Fechar_BTN2.setText("X");
        Fechar_BTN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fechar_BTN2ActionPerformed(evt);
            }
        });
        panel3.add(Fechar_BTN2);
        Fechar_BTN2.setBounds(550, 20, 80, 50);

        Encerrar_BTN.setBackground(new java.awt.Color(0, 255, 204));
        Encerrar_BTN.setText("Encerrar");
        Encerrar_BTN.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Encerrar_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Encerrar_BTNActionPerformed(evt);
            }
        });
        panel3.add(Encerrar_BTN);
        Encerrar_BTN.setBounds(460, 420, 150, 40);

        labelMetric5.setText("Total da Compra:");
        labelMetric5.setColorDeSombra(new java.awt.Color(153, 153, 153));
        labelMetric5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        panel3.add(labelMetric5);
        labelMetric5.setBounds(160, 370, 230, 40);

        TotalP_TXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalP_TXTActionPerformed(evt);
            }
        });
        panel3.add(TotalP_TXT);
        TotalP_TXT.setBounds(160, 420, 220, 40);

        CPF_TXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPF_TXTActionPerformed(evt);
            }
        });
        panel3.add(CPF_TXT);
        CPF_TXT.setBounds(480, 130, 120, 30);

        labelMetric10.setText("Pix");
        labelMetric10.setColorDeSombra(new java.awt.Color(153, 153, 153));
        labelMetric10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        panel3.add(labelMetric10);
        labelMetric10.setBounds(360, 220, 230, 20);

        labelMetric12.setText("CPF:");
        labelMetric12.setColorDeSombra(new java.awt.Color(153, 153, 153));
        labelMetric12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        panel3.add(labelMetric12);
        labelMetric12.setBounds(420, 130, 120, 30);

        labelMetric13.setText("Dinheiro");
        labelMetric13.setColorDeSombra(new java.awt.Color(153, 153, 153));
        labelMetric13.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        panel3.add(labelMetric13);
        labelMetric13.setBounds(20, 220, 230, 20);

        GerarChave_BTN.setBackground(new java.awt.Color(51, 102, 255));
        GerarChave_BTN.setText("Gerar chave aleatória ");
        GerarChave_BTN.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        GerarChave_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerarChave_BTNActionPerformed(evt);
            }
        });
        panel3.add(GerarChave_BTN);
        GerarChave_BTN.setBounds(370, 320, 260, 40);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panel3.add(jSeparator1);
        jSeparator1.setBounds(320, 200, 10, 160);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/qrcode.png"))); // NOI18N
        panel3.add(jLabel1);
        jLabel1.setBounds(450, 210, 90, 90);

        Recebido_TXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Recebido_TXTActionPerformed(evt);
            }
        });
        panel3.add(Recebido_TXT);
        Recebido_TXT.setBounds(20, 280, 120, 30);

        Nome_TXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nome_TXTActionPerformed(evt);
            }
        });
        panel3.add(Nome_TXT);
        Nome_TXT.setBounds(90, 130, 120, 30);

        Contato_TXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Contato_TXTActionPerformed(evt);
            }
        });
        panel3.add(Contato_TXT);
        Contato_TXT.setBounds(290, 130, 120, 30);

        labelMetric14.setText("Recebido:");
        labelMetric14.setColorDeSombra(new java.awt.Color(153, 153, 153));
        panel3.add(labelMetric14);
        labelMetric14.setBounds(20, 250, 120, 20);

        labelMetric15.setText("Nome:");
        labelMetric15.setColorDeSombra(new java.awt.Color(153, 153, 153));
        labelMetric15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        panel3.add(labelMetric15);
        labelMetric15.setBounds(30, 130, 120, 30);

        labelMetric16.setText("Contato:");
        labelMetric16.setColorDeSombra(new java.awt.Color(153, 153, 153));
        labelMetric16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        panel3.add(labelMetric16);
        labelMetric16.setBounds(220, 130, 120, 30);

        Pagar_BTN.setBackground(new java.awt.Color(51, 102, 255));
        Pagar_BTN.setText("Pagar");
        Pagar_BTN.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Pagar_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pagar_BTNActionPerformed(evt);
            }
        });
        panel3.add(Pagar_BTN);
        Pagar_BTN.setBounds(20, 320, 260, 40);

        getContentPane().add(panel3);
        panel3.setBounds(0, 0, 640, 480);

        setSize(new java.awt.Dimension(640, 471));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void Sobre_BTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sobre_BTN1ActionPerformed
        new Sobre_GUI().setVisible(true);
    }//GEN-LAST:event_Sobre_BTN1ActionPerformed

    private void Fechar_BTN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fechar_BTN2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Fechar_BTN2ActionPerformed

    private void Encerrar_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Encerrar_BTNActionPerformed
        this.dispose();
    }//GEN-LAST:event_Encerrar_BTNActionPerformed

    private void TotalP_TXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalP_TXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalP_TXTActionPerformed

    private void CPF_TXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPF_TXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPF_TXTActionPerformed

    private void GerarChave_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerarChave_BTNActionPerformed
        Infos();
        num=0;
         num=1;
        if(Nome == "" || Contato == 0 || CPF == 0 ){
            JOptionPane.showMessageDialog(null,"Prencha todos os campos!"); 
                
        }else{
        
        String chave = "";
        int index = 0;
        String letras = "ABCDEFGHIJKLMNOPQRSTUVYWXZ";
        Random random = new Random();

            for (int i = 0; i < 32; i++)
            {
               chave += random.nextInt( letras.length() );
            }
        JOptionPane.showMessageDialog(null,chave);
        JOptionPane.showMessageDialog(null, "=========MERCADO=========\n"
                + "CNPJ: 12.345.678/0001-01\n"
                + "R. José Vieira Martins, 270\n"
                + "Jardim Itapura - São Paulo - SP\n"
                + "==========================\n"
                + "               Compra Nº 0001    \n"
                + "==========================\n"
                + "Data: 21/03/20023      Hora: 14:30\n"
                + "Cliente: Consumidor\n"
                + "=========PRODUTOS=======\n"
                + "Nome                  Qtd                Preço\n"
                + prod_Coca+"            "+Qtd_coca+"                   "+ValorTC+"\n"
                + prod_Pao+"                        "+Qtd_pao+"                   "+ValorTP+"\n"
                + prod_Leite+"                      "+Qtd_leite+"                   "+ValorTL+"\n"
                + prod_Guarana+"               "+Qtd_guarana+"                     "+ValorTG+"\n"
                +"==========PAGAMENTO=========\n"
                + "             Total da Compra:        "+valor+"\n"
                + "-----------------------------------------------\n"
                + "Vencimento      Valor     Forma Pag.\n"
                + "21/03/2023       "+valor+"       PIX \n"
                + "-------------------------------------------------\n"
                + "*Este ticket não é um Documento oficial*\n"
                + "                                            \n"
                + "Software by Gustavo, João  e Pedro \n");
       
        }
        
        
        
        
        
    }//GEN-LAST:event_GerarChave_BTNActionPerformed

    private void Recebido_TXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Recebido_TXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Recebido_TXTActionPerformed

    private void Nome_TXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nome_TXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nome_TXTActionPerformed

    private void Contato_TXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Contato_TXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Contato_TXTActionPerformed

    private void Pagar_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pagar_BTNActionPerformed
        Infos();
        num=0;
        num=2;
        //static String Coca = ""Coca-Cola            "+Qtd_coca+"                   "+ValorTC+"\n"";
        //static String Pao = "Pão"                        "+Qtd_pao+"                   "+ValorTP+"\n"";
        //static String Leite = "Leite"                      "+Qtd_leite+"                   "+ValorTL+"\n"";
        //static String Guarana = "Guarana"               "+Qtd_guarana+"                     "+ValorTG+"\n"";
        //static String Produtos = " ";
        
        if(Nome == "" || Contato == 0 || CPF == 0 ){
            JOptionPane.showMessageDialog(null,"Prencha todos os campos!");
        }else{
            Infos();
            Recebido = Float.parseFloat(Recebido_TXT.getText());
            Troco = Recebido - valor;
            if(Troco <0){
                JOptionPane.showMessageDialog(null,"Você ainda precisa pagar:\n\n"+(valor-Recebido));
            }else{
                
                JOptionPane.showMessageDialog(null,"O seu troco é:\n\n"+Troco);
                JOptionPane.showMessageDialog(null, "=========MERCADO=========\n"
                + "CNPJ: 12.345.678/0001-01\n"
                + "R. José Vieira Martins, 270\n"
                + "Jardim Itapura - São Paulo - SP\n"
                + "==========================\n"
                + "               Compra Nº 0001    \n"
                + "==========================\n"
                + "Data: 21/03/20023      Hora: 14:30\n"
                + "Cliente: Consumidor\n"
                + "=========PRODUTOS=======\n"
                + "Nome                  Qtd                Preço\n"
                + prod_Coca+"            "+Qtd_coca+"                   "+ValorTC+"\n"
                + prod_Pao+"                        "+Qtd_pao+"                   "+ValorTP+"\n"
                + prod_Leite+"                      "+Qtd_leite+"                   "+ValorTL+"\n"
                + prod_Guarana+"               "+Qtd_guarana+"                     "+ValorTG+"\n"
                +"==========PAGAMENTO=========\n"
                + "             Total da Compra:        "+valor+"\n"
                + "-----------------------------------------------\n"
                + "Vencimento      Valor     Forma Pag.\n"
                + "21/03/2023       "+valor+"     Dinheiro \n"
                + "-------------------------------------------------\n"
                + "*Este ticket não é um Documento oficial*\n"
                + "                                            \n"
                + "Software by Gustavo, João  e Pedro \n");
                 
             }
             
        }
        
        
    }//GEN-LAST:event_Pagar_BTNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        if(num==1){
           formaPag = pix;
        }else{
            formaPag = dinheiro;
        }
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
            java.util.logging.Logger.getLogger(Pagamento_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pagamento_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pagamento_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pagamento_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pagamento_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.textField.TextFieldRound CPF_TXT;
    private org.edisoncor.gui.textField.TextFieldRound Contato_TXT;
    private org.edisoncor.gui.button.ButtonColoredAction Encerrar_BTN;
    private org.edisoncor.gui.button.ButtonColoredAction Fechar_BTN2;
    private org.edisoncor.gui.button.ButtonColoredAction GerarChave_BTN;
    private org.edisoncor.gui.textField.TextFieldRound Nome_TXT;
    private org.edisoncor.gui.button.ButtonColoredAction Pagar_BTN;
    private org.edisoncor.gui.textField.TextFieldRound Recebido_TXT;
    private org.edisoncor.gui.button.ButtonColoredAction Sobre_BTN1;
    private org.edisoncor.gui.label.LabelRound Titulo_LBL1;
    private org.edisoncor.gui.textField.TextFieldRound TotalP_TXT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private org.edisoncor.gui.label.LabelMetric labelMetric10;
    private org.edisoncor.gui.label.LabelMetric labelMetric12;
    private org.edisoncor.gui.label.LabelMetric labelMetric13;
    private org.edisoncor.gui.label.LabelMetric labelMetric14;
    private org.edisoncor.gui.label.LabelMetric labelMetric15;
    private org.edisoncor.gui.label.LabelMetric labelMetric16;
    private org.edisoncor.gui.label.LabelMetric labelMetric5;
    private org.edisoncor.gui.panel.Panel panel3;
    // End of variables declaration//GEN-END:variables
}
