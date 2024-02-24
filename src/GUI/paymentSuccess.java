package GUI;
import java.util.Date;
import java.text.SimpleDateFormat;
import User.*;

public class paymentSuccess extends javax.swing.JFrame {
    public paymentSuccess(String cardType,int total,int sClass,int trainNo,int adults,int child,int paymentID,String start,String end,int month,int day) {
        this.cardType=cardType;
        this.total=total;
        this.sClass=sClass;
        this.trainNo=trainNo;
        this.adults=adults;
        this.child=child;
        this.paymentID=paymentID;
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
    private int paymentID;
    private String start;
    private String end;
    private int month;
    private int day;

    Date time=new Date();
    SimpleDateFormat nowTime=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    userData access8=new userData();

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 36));
        jLabel2.setText(access8.getFirstName().toUpperCase()+",");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24));

        if(access8.getCardNumber().length()==16)
            jLabel4.setText("Your payment is successful");
        else
            jLabel4.setText("Your payment is un-successful");

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14));
        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("All Rights Reserved. Created by Oshith Roshantha.");

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 24));

        if(access8.getCardNumber().length()==16)
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/media/success.jpg")));
        else
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/media/unsuccess.jpg")));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/media/completetag.jpg")));

        jLabel17.setFont(new java.awt.Font("Calibri", 1, 18));
        jLabel17.setForeground(new java.awt.Color(0, 51, 102));
        jLabel17.setText("Transaction ID");

        jLabel16.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel16.setText("Date");

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SUB TOTAL");

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 14));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("(LRK)");

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(String.valueOf(total));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(13, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9))
                                .addContainerGap())
        );

        jLabel18.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel18.setText("Status");

        jLabel19.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel19.setText("Payment type");

        jLabel20.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel20.setText("Card Number");

        jLabel21.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel21.setText("Collect your printed payment slip and E-ticket from");

        jLabel22.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel22.setText("\"TrainReservationPortal\" folder");

        jButton1.setBackground(new java.awt.Color(0, 51, 102));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 18));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));

        if(access8.getCardNumber().length()==16)
            jButton1.setText("E-ticket Preview");
        else
            jButton1.setText("Try again");

        jButton1.setBorder(null);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Calibri", 1, 18));
        jLabel23.setForeground(new java.awt.Color(0, 51, 102));
        jLabel23.setText(String.valueOf(paymentID));

        jLabel24.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel24.setText(nowTime.format(time));

        jLabel25.setFont(new java.awt.Font("Calibri", 1, 12));

        if(access8.getCardNumber().length()==16)
            jLabel25.setText("Success");
        else
            jLabel25.setText("Un-success");

        jLabel26.setFont(new java.awt.Font("Calibri", 1, 12));

        if(cardType.equals("visa"))
            jLabel26.setText("VISA");
        else
            jLabel26.setText("MasterCard");

        jLabel27.setFont(new java.awt.Font("Calibri", 1, 12));

        if(access8.getCardNumber().length()==16)
            jLabel27.setText("XXXX-XXXX-"+access8.getCardNumber().substring(8,12)+"-"+access8.getCardNumber().substring(12));
        else
            jLabel27.setText("Invalid Card Number");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(42, 42, 42)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                        .addComponent(jLabel17)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addGap(26, 26, 26))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                                        .addGap(25, 25, 25)
                                                                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jLabel23)
                                                                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(3, 3, 3)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(62, 62, 62)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(100, 100, 100)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(129, 129, 129)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(41, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(89, 89, 89)
                                        .addComponent(jLabel5)
                                        .addContainerGap(90, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel17)
                                        .addComponent(jLabel23))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel24))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel18)
                                        .addComponent(jLabel25))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel19)
                                        .addComponent(jLabel26))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel20)
                                        .addComponent(jLabel27))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel22)
                                .addGap(27, 27, 27)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel7)
                                .addGap(20, 20, 20))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(380, 380, 380)
                                        .addComponent(jLabel5)
                                        .addContainerGap(380, Short.MAX_VALUE)))
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
        if(access8.getCardNumber().length()==16){
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new eTicket(trainNo,total,sClass,start,end,adults,child,month,day).setVisible(true);
                }
            });
            dispose();
        }

        else{
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new paymentGateway(sClass,trainNo,adults,child,total,start,end,month,day).setVisible(true);
                }
            });
            dispose();
        }

    }
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;

}