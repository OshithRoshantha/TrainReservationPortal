package GUI;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import User.*;

public class eTicket extends javax.swing.JFrame {

    public eTicket(int trainNo,int total,int sClass,String start,String end,int adults,int child,int month,int day) {
        this.cardType=cardType;
        this.total=total;
        this.sClass=sClass;
        this.trainNo=trainNo;
        this.adults=adults;
        this.child=child;
        this.start=start;
        this.end=end;
        this.day=day;
        this.month=month;
        initComponents();
    }

    private String cardType;
    private int total;
    private int sClass;
    private int trainNo;
    private int adults;
    private int child;
    private String start;
    private String end;
    private int month;
    private int day;
    Random randomNo = new Random();
    int refNo = randomNo.nextInt(40001) + 40000;
    String timeNow = new SimpleDateFormat("HH:mm:ss").format(new Date());
    userData access10=new userData();

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14));
        jLabel9.setForeground(new java.awt.Color(0, 51, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("All Rights Reserved. Created by Oshith Roshantha.");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 36));
        jLabel4.setText(access10.getFirstName().toUpperCase());

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 24));
        jLabel5.setText("This is your e-ticket,");

        jLabel16.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel16.setText("Ref No:");

        jLabel17.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel17.setText(String.valueOf(refNo));

        jLabel18.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel18.setText("Date:");

        jLabel19.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel19.setText(String.valueOf(LocalDate.now()));

        jLabel20.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel20.setText("Train No");

        jLabel21.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel21.setText("Total Amount");

        jLabel22.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel22.setText("From");

        jLabel23.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel23.setText("To");

        jLabel24.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel24.setText("Departure Date");

        jLabel25.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel25.setText("Train Class (Selected)");

        jLabel26.setFont(new java.awt.Font("Calibri", 1, 12));
        if(sClass==1)
            jLabel26.setText("Air Conditioned Saloon");
        else if(sClass==2)
            jLabel26.setText("Second Class Reserved Seats");
        else
            jLabel26.setText("Third Class Reserved Seats");

        jLabel27.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel27.setText(String.valueOf(adults)+"ADULT "+String.valueOf(child)+" CHILD seat(s) reserved.");

        jLabel28.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel28.setText("Passenger Name");

        jLabel29.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel29.setText("Contact");

        jLabel30.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel30.setText("Issued Time");

        jLabel31.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel31.setText(String.valueOf(trainNo));

        jLabel32.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel32.setText("(LRK) "+String.valueOf(total));

        jLabel33.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel33.setText(start.toUpperCase());

        jLabel34.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel34.setText(end.toUpperCase());

        jLabel35.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel35.setText("2023-"+(month+1)+"-"+(day+1));

        jLabel36.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel36.setText(access10.getFirstName().toUpperCase().charAt(0)+"."+access10.getLastName().toUpperCase());

        jLabel37.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel37.setText(access10.getContactNo());

        jLabel38.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel38.setText(timeNow);

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setForeground(new java.awt.Color(0, 51, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/media/qr.jpg")));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel39.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel39.setText("Scan at the station");

        jButton2.setBackground(new java.awt.Color(0, 51, 102));
        jButton2.setFont(new java.awt.Font("Calibri", 1, 18));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Exit");
        jButton2.setBorder(null);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(99, 99, 99)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(41, 41, 41)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel5)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jLabel16)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(jLabel17)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(jLabel18))
                                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jLabel25)
                                                        .addComponent(jLabel27)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(jLabel30)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(jLabel29)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(jLabel28)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel20)
                                                                                .addComponent(jLabel21)
                                                                                .addComponent(jLabel22)
                                                                                .addComponent(jLabel23)
                                                                                .addComponent(jLabel24))
                                                                        .addGap(37, 37, 37)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(59, 59, 59)
                                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(139, 139, 139)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addComponent(jLabel39))
                                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(130, 130, 130)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel17)
                                        .addComponent(jLabel18)
                                        .addComponent(jLabel19))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel20)
                                        .addComponent(jLabel31))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel21)
                                        .addComponent(jLabel32))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel22)
                                        .addComponent(jLabel33))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel23)
                                        .addComponent(jLabel34))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel24)
                                        .addComponent(jLabel35))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel27)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel28)
                                        .addComponent(jLabel36))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel29)
                                        .addComponent(jLabel37))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel30)
                                        .addComponent(jLabel38))
                                .addGap(38, 38, 38)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel39)
                                .addGap(35, 35, 35)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addGap(20, 20, 20))
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }


    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;

}

