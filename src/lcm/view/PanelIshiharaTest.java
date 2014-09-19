/*
 * Netbeans 8.0 
 * JDK 1.7  
 */
package lcm.view;

import java.awt.CardLayout;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import lcm.LCM;
import lcm.Plate;
import swingx.utility.FilterInput;

/**
 *
 * @author casper
 */
public class PanelIshiharaTest extends javax.swing.JPanel {

    /**
     * Creates new form PanelIshiharaTest
     */
    private List<Plate> listPlates;
    private final DecimalFormat format;
    private int number;
    private Object myAnswer = "";
    private FrameMain main;
    private StringBuilder answerLeft;
    private StringBuilder answerRight;

    public PanelIshiharaTest(FrameMain main) {
        initComponents();

        this.main = main;
        number = 0;
        format = new DecimalFormat("#00");
        reset();
        jTextField2.setDocument(new FilterInput().getTextLimit(2, false));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        iPanelIshihara1 = new lcm.component.IPanelIshihara();
        jLabel1 = new javax.swing.JLabel();
        panelAnswer = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        buttonNextQues = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        buttonLines0 = new javax.swing.JButton();
        buttonLines1 = new javax.swing.JButton();
        buttonLines2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        buttonResult = new javax.swing.JButton();
        labelAnswerLeft = new javax.swing.JLabel();
        labelAnswerRight = new javax.swing.JLabel();

        iPanelIshihara1.setOpaque(false);

        javax.swing.GroupLayout iPanelIshihara1Layout = new javax.swing.GroupLayout(iPanelIshihara1);
        iPanelIshihara1.setLayout(iPanelIshihara1Layout);
        iPanelIshihara1Layout.setHorizontalGroup(
            iPanelIshihara1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        iPanelIshihara1Layout.setVerticalGroup(
            iPanelIshihara1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Plate 01 from 38");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        panelAnswer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelAnswer.setOpaque(false);
        panelAnswer.setLayout(new java.awt.CardLayout());

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 65;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(jTextField2, gridBagConstraints);

        buttonNextQues.setText("Next");
        buttonNextQues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNextQuesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(buttonNextQues, gridBagConstraints);

        panelAnswer.add(jPanel1, "answer-number");

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Lines : ");
        jPanel2.add(jLabel3);

        buttonLines0.setText("0");
        buttonLines0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLines0ActionPerformed(evt);
            }
        });
        jPanel2.add(buttonLines0);

        buttonLines1.setText("1");
        buttonLines1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLines1ActionPerformed(evt);
            }
        });
        jPanel2.add(buttonLines1);

        buttonLines2.setText("2");
        buttonLines2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLines2ActionPerformed(evt);
            }
        });
        jPanel2.add(buttonLines2);

        jPanel3.add(jPanel2, java.awt.BorderLayout.CENTER);

        panelAnswer.add(jPanel3, "answer-line");

        jPanel4.setOpaque(false);

        buttonResult.setText("Show Result");
        buttonResult.setPreferredSize(new java.awt.Dimension(85, 28));
        buttonResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(buttonResult, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonResult, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        panelAnswer.add(jPanel4, "answer-result");

        labelAnswerLeft.setText("<html>\nPlate 01<br>\nPlate 02<br>\nPlate 03<br>\nPlate 04<br>\nPlate 05<br>\nPlate 06<br>\nPlate 07<br>\nPlate 08<br>\nPlate 09<br>\nPlate 10<br>\nPlate 11<br>\nPlate 12<br>\nPlate 13<br>\nPlate 14<br>\nPlate 15<br>\nPlate 16<br>\nPlate 17<br>\nPlate 18<br>\nPlate 19<br>\n</html>");
        labelAnswerLeft.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        labelAnswerRight.setText("<html>\nPlate 01<br>\nPlate 02<br>\nPlate 03<br>\nPlate 04<br>\nPlate 05<br>\nPlate 06<br>\nPlate 07<br>\nPlate 08<br>\nPlate 09<br>\nPlate 10<br>\nPlate 11<br>\nPlate 12<br>\nPlate 13<br>\nPlate 14<br>\nPlate 15<br>\nPlate 16<br>\nPlate 17<br>\nPlate 18<br>\nPlate 19<br>\n</html>");
        labelAnswerRight.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iPanelIshihara1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(panelAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(labelAnswerLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelAnswerRight, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelAnswerLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAnswerRight, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iPanelIshihara1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonNextQuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNextQuesActionPerformed
        myAnswer = jTextField2.getText();
        saveAnswer();
        number++;
        nextQuestion();
    }//GEN-LAST:event_buttonNextQuesActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        myAnswer = jTextField2.getText();
        saveAnswer();
        number++;
        nextQuestion();
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void buttonLines0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLines0ActionPerformed
        myAnswer = 0;
        saveAnswer();
        number++;
        nextQuestion();
    }//GEN-LAST:event_buttonLines0ActionPerformed

    private void buttonLines1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLines1ActionPerformed
        myAnswer = 1;
        saveAnswer();
        number++;
        nextQuestion();
    }//GEN-LAST:event_buttonLines1ActionPerformed

    private void buttonLines2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLines2ActionPerformed
        myAnswer = 2;
        saveAnswer();
        number++;
        nextQuestion();
    }//GEN-LAST:event_buttonLines2ActionPerformed

    private void buttonResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResultActionPerformed
        main.showResult();
    }//GEN-LAST:event_buttonResultActionPerformed

    private void saveAnswer() {
        listPlates.get(number).setType(iPanelIshihara1.getType()[number]);
        listPlates.get(number).setAnswer(myAnswer);

        if (number % 2 == 0) {
            answerLeft.append("<br>Plate " + format.format(number + 1) + " : " + myAnswer);
        } else if (number % 2 == 1) {
            answerRight.append("<br>Plate " + format.format(number + 1) + " : " + myAnswer);
        }
        labelAnswerLeft.setText("<html> " + answerLeft.toString() + " </html>");
        labelAnswerRight.setText("<html> " + answerRight.toString() + " </html>");
    }
    
    private void nextQuestion() {
        if (number == 38) {
            showCard("answer-result");
        } else {
            iPanelIshihara1.setPlate(listPlates.get(number).getPlate());
            listPlates.get(number).setType(iPanelIshihara1.getType()[listPlates.get(number).getPlate()]);
            showCard("answer-" + listPlates.get(number).getType());

            jLabel1.setText("Plate " + format.format(number + 1) + " from 38");
            jTextField2.setText("");
            jTextField2.requestFocus();
        }
    }

    public void reset() {
        number = 0;

        listPlates = new ArrayList<>();

        LCM main = new LCM();
        main.setA(1);
        main.setC(7);
        main.setM(38);

        int z = 21;
        for (int i = 0; i < 38; i++) {
            Plate plate = new Plate();
            plate.setPlate(z);
            plate.setType("");
            plate.setAnswer("");
            plate.setResult(false);
            listPlates.add(plate);

            z = main.getLinearCongruen(z);
        }

//        for (int i = 0; i < 38; i++) {
//            Plate plate = new Plate();
//            plate.setPlate(i);
//            plate.setType("");
//            plate.setAnswer("");
//            plate.setResult(false);
//            listPlates.add(plate);
//        }
        nextQuestion();

        jTextField2.setText("");
        jTextField2.requestFocus();
        
        answerLeft = new StringBuilder();
        answerRight = new StringBuilder();
        labelAnswerLeft.setText(answerLeft.toString());
        labelAnswerRight.setText(answerRight.toString());
    }

    private void showCard(String card) {
        ((CardLayout) panelAnswer.getLayout()).show(panelAnswer, card);
    }

    public List<Plate> getListPlates() {
        return listPlates;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLines0;
    private javax.swing.JButton buttonLines1;
    private javax.swing.JButton buttonLines2;
    private javax.swing.JButton buttonNextQues;
    private javax.swing.JButton buttonResult;
    private lcm.component.IPanelIshihara iPanelIshihara1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel labelAnswerLeft;
    private javax.swing.JLabel labelAnswerRight;
    private javax.swing.JPanel panelAnswer;
    // End of variables declaration//GEN-END:variables

}
