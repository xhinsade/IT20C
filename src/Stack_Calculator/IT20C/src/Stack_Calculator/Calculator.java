
package Stack_Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class Calculator extends javax.swing.JFrame {

    private JTextField display;
    private Stack stack;

    public Calculator() {
        stack = new Stack<>();
        initComponents();   
      
    }
    
   
    

   

   
   


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        ButtonPanelNum = new javax.swing.JPanel();
        one = new javax.swing.JButton();
        four = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        two = new javax.swing.JButton();
        five = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        three = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        six = new javax.swing.JButton();
        equalbutton = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        backPanelArithmetic = new javax.swing.JPanel();
        addbutton = new javax.swing.JButton();
        substractButton = new javax.swing.JButton();
        DivisionButton = new javax.swing.JButton();
        multiplyButton = new javax.swing.JButton();
        backPanelInput = new javax.swing.JPanel();
        inputBox = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        push = new javax.swing.JButton();
        pop = new javax.swing.JButton();
        Peek = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MainPanel.setBackground(new java.awt.Color(51, 51, 51));
        MainPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 51, 102), new java.awt.Color(0, 102, 153), new java.awt.Color(0, 51, 51), new java.awt.Color(0, 51, 51)));
        MainPanel.setForeground(new java.awt.Color(51, 51, 51));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonPanelNum.setBackground(new java.awt.Color(102, 102, 102));
        ButtonPanelNum.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.orange));
        ButtonPanelNum.setForeground(new java.awt.Color(51, 51, 51));
        ButtonPanelNum.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        one.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        one.setText("1");
        one.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, java.awt.Color.darkGray, java.awt.Color.orange, java.awt.Color.darkGray));
        ButtonPanelNum.add(one, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 75, 60));

        four.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        four.setText("4");
        four.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, java.awt.Color.darkGray, java.awt.Color.orange, java.awt.Color.darkGray));
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });
        ButtonPanelNum.add(four, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 75, 60));

        seven.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        seven.setText("7");
        seven.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, java.awt.Color.darkGray, java.awt.Color.orange, java.awt.Color.darkGray));
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });
        ButtonPanelNum.add(seven, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 75, 56));

        two.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        two.setText("2");
        two.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, java.awt.Color.darkGray, java.awt.Color.orange, java.awt.Color.darkGray));
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });
        ButtonPanelNum.add(two, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 75, 56));

        five.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        five.setText("5");
        five.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, java.awt.Color.darkGray, java.awt.Color.orange, java.awt.Color.darkGray));
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });
        ButtonPanelNum.add(five, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 348, 75, 60));

        eight.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        eight.setText("8");
        eight.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, java.awt.Color.darkGray, java.awt.Color.orange, java.awt.Color.darkGray));
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });
        ButtonPanelNum.add(eight, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 428, 76, 56));

        three.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        three.setText("3");
        three.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, java.awt.Color.darkGray, java.awt.Color.orange, java.awt.Color.darkGray));
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });
        ButtonPanelNum.add(three, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 75, 60));

        nine.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        nine.setText("9");
        nine.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, java.awt.Color.darkGray, java.awt.Color.orange, java.awt.Color.darkGray));
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });
        ButtonPanelNum.add(nine, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 75, 56));

        six.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        six.setText("6");
        six.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, java.awt.Color.darkGray, java.awt.Color.orange, java.awt.Color.darkGray));
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });
        ButtonPanelNum.add(six, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 75, 60));

        equalbutton.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        equalbutton.setText("=");
        equalbutton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, java.awt.Color.darkGray, java.awt.Color.orange, java.awt.Color.darkGray));
        ButtonPanelNum.add(equalbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 70, 60));

        clear.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        clear.setIcon(new javax.swing.ImageIcon("C:\\Users\\ITLAB1-PC05-STUDENT\\Pictures\\bin (1).png")); // NOI18N
        clear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, java.awt.Color.darkGray, java.awt.Color.orange, java.awt.Color.darkGray));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        ButtonPanelNum.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 70, 62));

        zero.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        zero.setText("0");
        zero.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, java.awt.Color.darkGray, java.awt.Color.orange, java.awt.Color.darkGray));
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });
        ButtonPanelNum.add(zero, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 70, 56));

        backPanelArithmetic.setBackground(new java.awt.Color(153, 153, 153));
        backPanelArithmetic.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.orange));
        backPanelArithmetic.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addbutton.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        addbutton.setText("+");
        addbutton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, java.awt.Color.darkGray, java.awt.Color.orange, java.awt.Color.darkGray));
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });
        backPanelArithmetic.add(addbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 47));

        substractButton.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        substractButton.setText("-");
        substractButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, java.awt.Color.darkGray, java.awt.Color.orange, java.awt.Color.darkGray));
        substractButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                substractButtonActionPerformed(evt);
            }
        });
        backPanelArithmetic.add(substractButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 80, 49));

        DivisionButton.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        DivisionButton.setText("/");
        DivisionButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, java.awt.Color.darkGray, java.awt.Color.orange, java.awt.Color.darkGray));
        DivisionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivisionButtonActionPerformed(evt);
            }
        });
        backPanelArithmetic.add(DivisionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 76, 49));

        multiplyButton.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        multiplyButton.setText("*");
        multiplyButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, java.awt.Color.darkGray, java.awt.Color.orange, java.awt.Color.darkGray));
        multiplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyButtonActionPerformed(evt);
            }
        });
        backPanelArithmetic.add(multiplyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 68, 49));

        ButtonPanelNum.add(backPanelArithmetic, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 390, 70));

        backPanelInput.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.orange));

        inputBox.setBackground(new java.awt.Color(51, 51, 51));
        inputBox.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        inputBox.setForeground(new java.awt.Color(255, 255, 255));
        inputBox.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.orange));

        javax.swing.GroupLayout backPanelInputLayout = new javax.swing.GroupLayout(backPanelInput);
        backPanelInput.setLayout(backPanelInputLayout);
        backPanelInputLayout.setHorizontalGroup(
            backPanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backPanelInputLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputBox, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backPanelInputLayout.setVerticalGroup(
            backPanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backPanelInputLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputBox, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        ButtonPanelNum.add(backPanelInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 58, 410, -1));

        MainPanel.add(ButtonPanelNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 3, 440, 530));

        t5.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        t5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.lightGray));
        MainPanel.add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 200, -1));

        t2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        t2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.lightGray));
        MainPanel.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 200, 40));

        t1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        t1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.lightGray));
        MainPanel.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 200, 40));

        t3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        t3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.lightGray));
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        MainPanel.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 200, 40));

        t4.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        t4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.lightGray));
        MainPanel.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 200, 40));

        push.setBackground(new java.awt.Color(255, 153, 51));
        push.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        push.setForeground(new java.awt.Color(255, 255, 255));
        push.setText("Push");
        push.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.white));
        push.setOpaque(false);
        push.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pushActionPerformed(evt);
            }
        });
        MainPanel.add(push, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 403, 80, 40));

        pop.setBackground(new java.awt.Color(255, 153, 51));
        pop.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        pop.setForeground(new java.awt.Color(255, 255, 255));
        pop.setText("Pop");
        pop.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.white));
        pop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popActionPerformed(evt);
            }
        });
        MainPanel.add(pop, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 403, 80, 40));

        Peek.setBackground(new java.awt.Color(255, 153, 51));
        Peek.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        Peek.setForeground(new java.awt.Color(255, 255, 255));
        Peek.setText("Peek");
        Peek.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.white));
        Peek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PeekActionPerformed(evt);
            }
        });
        MainPanel.add(Peek, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 80, 40));

        getContentPane().add(MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        inputBox.setText(inputBox.getText() + "0");
    }//GEN-LAST:event_zeroActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        inputBox.setText(inputBox.getText() + "2");
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
       inputBox.setText(inputBox.getText() + "3");
    }//GEN-LAST:event_threeActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        inputBox.setText(inputBox.getText() + "4");
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        inputBox.setText(inputBox.getText() + "5");
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        inputBox.setText(inputBox.getText() + "6");
    }//GEN-LAST:event_sixActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        inputBox.setText(inputBox.getText() + "7");
    }//GEN-LAST:event_sevenActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        inputBox.setText(inputBox.getText() + "8");
    }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        inputBox.setText(inputBox.getText() + "9");
    }//GEN-LAST:event_nineActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void pushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pushActionPerformed
        try {
        // Get user input from inputBox
        double value = Double.parseDouble(inputBox.getText()); 

        // Check if all fields are filled
        if (!inputBox.getText().isEmpty() && 
            !t1.getText().isEmpty() &&
            !t2.getText().isEmpty() &&
            !t3.getText().isEmpty() &&
            !t4.getText().isEmpty() &&
            !t5.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Cannot push: All fields are full!");
            inputBox.setText("");  // Clear jTextField4 if unable to push
            return;
        }
        // Shift values upwards
        t1.setText(t2.getText());  
        t2.setText(t3.getText());
        t3.setText(t4.getText());  
        t4.setText(t5.getText());
        t5.setText(String.valueOf(value));  // Display new value in jTextField5

        // Push the value onto the stack
        stack.push(value);  // Only the value pushed from jTextField4 should go to the stack

        // Clear the input field for new input
        inputBox.setText("");  

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Please enter a valid number.");
    }
    }//GEN-LAST:event_pushActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
       stack.clear(); // Clear the stack
        clear.setText(""); // Clear the display
    }//GEN-LAST:event_clearActionPerformed

    private void popActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popActionPerformed
        // Check if the stack is empty (by checking if jTextField3 is empty)
    if (t5.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Nothing to pop: Stack is empty.");
        return;
    }

    // Get the current top value from jTextField3 to show in the message
    double poppedValue = Double.parseDouble(t5.getText()); 

    // Show a message with the popped value
    JOptionPane.showMessageDialog(this, "Popped element: " + poppedValue);

    // Shift values downwards
    t4.setText(t5.getText()); // Move value from jTextField2 to jTextField3 (new top)
    t3.setText(t4.getText());
    t2.setText(t3.getText());
    t1.setText(t2.getText()); // Move value from jTextField1 to jTextField2
    inputBox.setText("");
    }//GEN-LAST:event_popActionPerformed

    private void PeekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PeekActionPerformed
         // Check if jTextField5 is empty before trying to peek
    if (t5.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Stack is empty, nothing to peek.");
    } else {
        // Safely parse the top value from jTextField5
        double topValue = Double.parseDouble(t5.getText());
        // Display the top value in a JOptionPane message
        JOptionPane.showMessageDialog(this, "Top item of the stack: " + topValue);
    }
    }//GEN-LAST:event_PeekActionPerformed

    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed
        try {
        double num1 = t1.getText().isEmpty() ? 0 : Double.parseDouble(t1.getText());
        double num2 = t2.getText().isEmpty() ? 0 : Double.parseDouble(t2.getText());
        double num3 = t3.getText().isEmpty() ? 0 : Double.parseDouble(t3.getText());
        double num4 = t4.getText().isEmpty() ? 0 : Double.parseDouble(t4.getText());
        double num5 = t5.getText().isEmpty() ? 0 : Double.parseDouble(t5.getText());

        double sum = num1 + num2 + num3 + num4 + num5;

        // Display the result in a message dialog
        JOptionPane.showMessageDialog(this, "Sum of the five numbers: " + sum);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Please enter valid numbers in all fields.");
    }
        
    }//GEN-LAST:event_addbuttonActionPerformed

    private void substractButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_substractButtonActionPerformed
       
    }//GEN-LAST:event_substractButtonActionPerformed

    private void DivisionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivisionButtonActionPerformed
        
    }//GEN-LAST:event_DivisionButtonActionPerformed

    private void multiplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyButtonActionPerformed
        
    }//GEN-LAST:event_multiplyButtonActionPerformed

    
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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonPanelNum;
    private javax.swing.JButton DivisionButton;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton Peek;
    public javax.swing.JButton addbutton;
    private javax.swing.JPanel backPanelArithmetic;
    private javax.swing.JPanel backPanelInput;
    private javax.swing.JButton clear;
    private javax.swing.JButton eight;
    private javax.swing.JButton equalbutton;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JTextField inputBox;
    private javax.swing.JButton multiplyButton;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton pop;
    private javax.swing.JButton push;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton substractButton;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
