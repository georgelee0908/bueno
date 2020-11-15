/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;


public class NewJFrame extends javax.swing.JFrame {
    
    public NewJFrame() { //constructor
        initComponents(); //method
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Num1Label = new javax.swing.JLabel();
        Num2Label = new javax.swing.JLabel();
        Num1Field = new javax.swing.JTextField();
        Num2Field = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        Sub = new javax.swing.JButton();
        Mul = new javax.swing.JButton();
        Div = new javax.swing.JButton();
        ResultLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Num1Label.setText("Number 1");

        Num2Label.setText("Number 2");

        Add.setText("+");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Sub.setText("-");
        Sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubActionPerformed(evt);
            }
        });

        Mul.setText("*");
        Mul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MulActionPerformed(evt);
            }
        });

        Div.setText("/");
        Div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivActionPerformed(evt);
            }
        });

        ResultLabel.setText("Result:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Num2Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Num2Field))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Num1Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Num1Field))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ResultLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Sub, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Mul, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Div, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Num1Label)
                    .addComponent(Num1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Num2Label)
                    .addComponent(Num2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add)
                    .addComponent(Sub)
                    .addComponent(Mul)
                    .addComponent(Div))
                .addGap(18, 18, 18)
                .addComponent(ResultLabel)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    void gatherUserInput()
    {
        String n1 = Num1Field.getText();   
        String n2 = Num2Field.getText();
       
        try
        {
            num1 = Double.parseDouble(n1);
            num2 = Double.parseDouble(n2);
        }
        catch (NumberFormatException e)
        {
            ResultLabel.setText("Invalid Input");
        }
    }
    
    double num1, num2; 
    
    private void AddActionPerformed(java.awt.event.ActionEvent evt) {                                    
            
            getUserInput();
            ResultLabel.setText( String.valueOf( num1 + num2));
     
//        catch (NumberFormatException e)
//        {
//            ResultLabel.setText("Invalid Input");
//        }
        
        // name of numberformatexception can be anything but traditionally "e"  
        //System.out.println(num1 + num2);
        
    }                                   

    private void SubActionPerformed(java.awt.event.ActionEvent evt) {                                    
        String n1 = Num1Field.getText();   
        String n2 = Num2Field.getText();
        
        try
        {
            double num1 = Double.parseDouble(n1);
            double num2 = Double.parseDouble(n2);
            ResultLabel.setText( String.valueOf( num1 - num2));

        }
        catch (NumberFormatException e)
        {
            ResultLabel.setText("Invalid Input");
        }
    }                                   

    private void MulActionPerformed(java.awt.event.ActionEvent evt) {                                    
        String n1 = Num1Field.getText();   
        String n2 = Num2Field.getText();
        
        try
        {
            double num1 = Double.parseDouble(n1);
            double num2 = Double.parseDouble(n2);
            ResultLabel.setText( String.valueOf( num1 * num2));

        }
        catch (NumberFormatException e)
        {
            ResultLabel.setText("Invalid Input");
        }
    }                                   

    private void DivActionPerformed(java.awt.event.ActionEvent evt) {                                    
        String n1 = Num1Field.getText();   
        String n2 = Num2Field.getText();
        
        try
        {
            double num1 = Double.parseDouble(n1);
            double num2 = Double.parseDouble(n2);
            ResultLabel.setText( String.valueOf( num1 / num2));

        }
        catch (NumberFormatException e)
        {
            ResultLabel.setText("Invalid Input");
        }
    }                                   

    
    
    
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
            java.util.logging.Logger.getLogger(FormA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Add;
    private javax.swing.JButton Div;
    private javax.swing.JButton Mul;
    private javax.swing.JTextField Num1Field;
    private javax.swing.JLabel Num1Label;
    private javax.swing.JTextField Num2Field;
    private javax.swing.JLabel Num2Label;
    private javax.swing.JLabel ResultLabel;
    private javax.swing.JButton Sub;
    // End of variables declaration                   


}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
