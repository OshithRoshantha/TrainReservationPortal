package GUI;
import trainData.*;
import User.*;

import java.util.ArrayList;
import java.util.Arrays;

public class userSelection1 extends javax.swing.JFrame {
    public userSelection1() {
        initComponents();
    }
    userData access4=new userData();

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18));
        jLabel6.setText("the start and end of the your journey");

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 18));
        jLabel8.setText("Feel free to select");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/media/endStart.jpg")));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setForeground(new java.awt.Color(0, 51, 102));
        jPanel2.setMaximumSize(new java.awt.Dimension(1, 32767));
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 201, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 2, Short.MAX_VALUE)
        );

        jTextField1.setFont(new java.awt.Font("Calibri", 1, 18));
        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.setText("End Station");
        jTextField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Calibri", 1, 18));
        jTextField2.setForeground(new java.awt.Color(153, 153, 153));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField2.setText("Start Station");
        jTextField2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
        jPanel3.setForeground(new java.awt.Color(0, 51, 102));
        jPanel3.setMaximumSize(new java.awt.Dimension(1, 32767));
        jPanel3.setPreferredSize(new java.awt.Dimension(100, 1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 201, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 2, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14));
        jLabel9.setForeground(new java.awt.Color(0, 51, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("All Rights Reserved. Created by Oshith Roshantha.");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/media/search.jpg")));

        jButton1.setBackground(new java.awt.Color(0, 51, 102));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 18));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search");
        jButton1.setBorder(null);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/media/stag.jpg")));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 36));
        jLabel2.setText(access4.getFirstName().toUpperCase()+",");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(50, 50, 50)))
                                .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(70, 70, 70)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(58, 58, 58)
                                                .addComponent(jLabel6))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(124, 124, 124)
                                                .addComponent(jLabel8)))
                                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel4)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel2)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addGap(69, 69, 69)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(28, 28, 28)))
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel9)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {
        jTextField1.setText("");
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {
        jTextField2.setText("");
    }

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String startStation=jTextField1.getText();
        String endStation=jTextField2.getText();
        displayTrainList ob9=new displayTrainList();
        String[] trainArray=ob9.trainList(startStation,endStation);

        if(trainArray.length==0){
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new noResult().setVisible(true);
                }
            });
            dispose();
        }
        else{
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new displayTrain(startStation,endStation,trainArray).setVisible(true);
                }
            });
            dispose();
        }
        dispose();
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
}