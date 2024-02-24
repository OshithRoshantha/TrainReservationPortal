package GUI;
import User.*;
public class displayPrice extends javax.swing.JFrame {
    public displayPrice(int sClass,int trainNo,int adults,int child,int total,String start,String end,int month,int day) {
        this.sClass=sClass;
        this.trainNo=trainNo;
        this.adults=adults;
        this.child=child;
        this.total=total;
        this.start=start;
        this.end=end;
        this.day=day;
        this.month=month;

        initComponents();
    }
    private int sClass;
    private int trainNo;
    private int adults;
    private int child;
    private int total;
    private String start;
    private String end;
    private int month;
    private int day;
    userData access6=new userData();

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel11.setText("No. Child Tickets");

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel12.setText("No. Adult Tickets");

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel13.setText("--");

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel14.setText("--");

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel15.setText("--");

        jLabel16.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel16.setText("Train Number");

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel10.setText(String.valueOf(trainNo));

        jLabel18.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel18.setText(String.valueOf(adults));

        jLabel19.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel19.setText(String.valueOf(child));

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SUB TOTAL");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("(LRK)");

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(String.valueOf(total));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(13, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel6))
                                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap())
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 6, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel19))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14));
        jLabel9.setForeground(new java.awt.Color(0, 51, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("All Rights Reserved. Created by Oshith Roshantha.");

        jButton1.setBackground(new java.awt.Color(0, 51, 102));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 18));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Checkout");
        jButton1.setBorder(null);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 51, 102));
        jButton2.setFont(new java.awt.Font("Calibri", 1, 18));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.setBorder(null);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 36));
        jLabel4.setText("Hey "+access6.getFirstName().toUpperCase()+",");

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 24));
        jLabel5.setText("Here's your Summary:");

        jLabel17.setFont(new java.awt.Font("Calibri", 1, 18));
        jLabel17.setForeground(new java.awt.Color(0, 51, 102));
        if(sClass==1)
            jLabel17.setText("Air Conditioned Saloon");
        else if(sClass==2)
            jLabel17.setText("Second Class Reserved Seats");
        else
            jLabel17.setText("Third Class Reserved Seats");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/media/step2.jpg")));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/media/ptag.jpg")));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/media/img.jpg")));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addContainerGap(49, Short.MAX_VALUE)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                .addGap(40, 40, 40)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel5)
                                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                .addGap(99, 99, 99)
                                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap(31, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(134, 134, 134)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(91, 91, 91)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(75, 75, 75)
                                                .addComponent(jLabel17))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(60, 60, 60)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 181, Short.MAX_VALUE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel9)
                                .addGap(16, 16, 16))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new paymentGateway(sClass,trainNo,adults,child,total,start,end,month,day).setVisible(true);
            }
        });
        dispose();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userSelection2(trainNo,start,end).setVisible(true);
            }
        });
        dispose();
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;

}


