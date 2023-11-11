
import control.CEmployeeDetails;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EmployeeDetails extends javax.swing.JFrame {

    public EmployeeDetails() {
        initComponents();
        
        
        
        JFrame jframe = new JFrame();
    jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // set the jframe size and location, and make it visible
    jframe.setPreferredSize(new Dimension(400, 300));
    jframe.pack();
        
    }
    Connection con = null;
    PreparedStatement ps = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_eid = new javax.swing.JTextField();
        txt_fn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_ln = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_address = new javax.swing.JTextPane();
        txt_email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_Male = new javax.swing.JRadioButton();
        txt_Female = new javax.swing.JRadioButton();
        txt_tp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txt_uname = new javax.swing.JTextField();
        txt_pword = new javax.swing.JPasswordField();
        txt_conpword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txt_depname = new javax.swing.JComboBox<>();
        txt_depid = new javax.swing.JComboBox<>();
        txt_acctype = new javax.swing.JComboBox<>();
        txt_jrole = new javax.swing.JTextField();
        txt_empst = new javax.swing.JComboBox<>();
        txt_bankname = new javax.swing.JTextField();
        txt_branchname = new javax.swing.JTextField();
        txt_accnum = new javax.swing.JTextField();
        txt_accname = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Insert Employee Details");
        setBackground(new java.awt.Color(255, 255, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(255, 255, 153));
        setLocation(new java.awt.Point(0, 0));
        setSize(new java.awt.Dimension(900, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Employee Details");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Employee ID");

        txt_eid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_eid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_eidKeyTyped(evt);
            }
        });

        txt_fn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_fn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_fnKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_fnKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("First Name");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Last Name");

        txt_ln.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_ln.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_lnKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Address");

        txt_address.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(txt_address);

        txt_email.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Email");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Gender");

        txt_Male.setBackground(new java.awt.Color(255, 255, 255));
        txt_Male.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_Male.setText("Male");

        txt_Female.setBackground(new java.awt.Color(255, 255, 255));
        txt_Female.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_Female.setText("FeMale");

        txt_tp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_tp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_tpKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Telephone Number");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel17.setText("Username");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel18.setText("Password");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel20.setText("Confirm Password");

        txt_uname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txt_pword.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txt_conpword.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jButton3.setText("<<Back");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setText("Job Details");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Department Name");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Department ID");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Account Type");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Job Role");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Employee Status");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setText("Bank Details");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel22.setText("Bank Name");

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel23.setText("Branch Name");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel24.setText("Account Number");

        txt_depname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_depname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Human Resource - D1", "IT - D2", "Accounting and Finance - D3", "Marketing- D4", "Production - D5" }));

        txt_depid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_depid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "D1", "D2", "D3", "D4", "D5" }));

        txt_acctype.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_acctype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Employee", "Management" }));

        txt_jrole.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_jrole.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_jroleKeyTyped(evt);
            }
        });

        txt_empst.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_empst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive" }));

        txt_bankname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_bankname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_banknameKeyTyped(evt);
            }
        });

        txt_branchname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_branchname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_branchnameKeyTyped(evt);
            }
        });

        txt_accnum.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txt_accname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_accname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_accnameKeyTyped(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel25.setText("Account Name");

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jButton2.setText("Clear");
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
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel20)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                    .addComponent(txt_conpword, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_pword, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)))
                                    .addGap(92, 92, 92)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                                        .addComponent(txt_ln)
                                        .addComponent(txt_fn)
                                        .addComponent(txt_eid)
                                        .addComponent(txt_email)))
                                .addComponent(jLabel8)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel17)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_uname, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txt_Male)
                                    .addGap(158, 158, 158)
                                    .addComponent(txt_Female))
                                .addComponent(txt_tp, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1)))
                .addGap(0, 151, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_bankname)
                        .addComponent(txt_jrole)
                        .addComponent(txt_empst, 0, 310, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24)
                            .addComponent(jLabel22)
                            .addComponent(jLabel16)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel19))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_depname, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_acctype, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_accnum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                                        .addComponent(txt_branchname)
                                        .addComponent(txt_accname))
                                    .addComponent(txt_depid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(46, 46, 46))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(325, 325, 325))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel19))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_eid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_fn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_ln, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(58, 58, 58)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txt_depname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txt_depid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txt_acctype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txt_jrole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txt_empst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_Male)
                        .addComponent(jLabel7))
                    .addComponent(txt_Female))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_tp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel22)
                    .addComponent(txt_bankname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txt_uname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(txt_branchname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txt_pword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(txt_accnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txt_conpword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_accname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jButton3)
                .addGap(0, 125, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_accnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_accnameKeyTyped
        char c=evt.getKeyChar();
        if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c))
        {
            txt_accname.setEditable(true);
        }
        else
        {
            txt_accname.setEditable(false);
        }    
    }//GEN-LAST:event_txt_accnameKeyTyped

    private void txt_branchnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_branchnameKeyTyped
        char c=evt.getKeyChar();
        if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c))
        {
            txt_branchname.setEditable(true);
        }
        else
        {
            txt_branchname.setEditable(false);
        }   
    }//GEN-LAST:event_txt_branchnameKeyTyped

    private void txt_banknameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_banknameKeyTyped
        char c=evt.getKeyChar();
        if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c))
        {
            txt_bankname.setEditable(true);
        }
        else
        {
            txt_bankname.setEditable(false);
        }   
    }//GEN-LAST:event_txt_banknameKeyTyped

    private void txt_jroleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_jroleKeyTyped
        char c=evt.getKeyChar();
        if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c))
        {
            txt_jrole.setEditable(true);
        }
        else
        {
            txt_jrole.setEditable(false);
        }
    }//GEN-LAST:event_txt_jroleKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        dispose();
        choosetask c=new choosetask();
        c.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {
            String empID,fn,ln,address,email,gender,tp,username,password,conpword;
            String depID,depName,accType,jobRole,empStatus,bankName,branchName,accNumber,accName;

            empID=txt_eid.getText();
            fn=txt_fn.getText();
            ln=txt_ln.getText();
            address=txt_address.getText();
            email=txt_email.getText();
            if(txt_Male.isSelected())
            {
                gender = "M";
            }
            else
            {
                gender = "F";
            }
            tp=txt_tp.getText();
            username=txt_uname.getText();
            password=txt_pword.getText();
            conpword=txt_conpword.getText();
            depID=txt_depid.getSelectedItem().toString();
            depName=txt_depname.getSelectedItem().toString();
            accType=txt_acctype.getSelectedItem().toString();
            jobRole = txt_jrole.getText();
            empStatus = txt_empst.getSelectedItem().toString();
            bankName =  txt_bankname.getText();
            branchName= txt_branchname.getText();
            accNumber = txt_accnum.getText();
            accName  =txt_accname.getText();

            if(empID.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Employee ID should not be empty","Error",JOptionPane.ERROR_MESSAGE);
            }
            else if(fn.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "First Name should not be empty","Error",JOptionPane.ERROR_MESSAGE);
            }
            else if(ln.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Last Name should not be empty","Error",JOptionPane.ERROR_MESSAGE);
            }
            else if(address.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Address should not be empty","Error",JOptionPane.ERROR_MESSAGE);
            }
            else if(email.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Email should not be empty","Error",JOptionPane.ERROR_MESSAGE);
            }
            else if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", txt_email.getText())))
            {
                JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if((txt_Male.isSelected()==false)&&(txt_Female.isSelected()==false))
            {
                JOptionPane.showMessageDialog(null,"Please select a Gender", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(tp.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Telephone Number should not be empty","Error",JOptionPane.ERROR_MESSAGE);
            }
            else if(tp.length()!=10)
            {
                JOptionPane.showMessageDialog(null, "Telephone Number should have 10 characters","Error",JOptionPane.ERROR_MESSAGE);
            }
            else if(username.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Username should not be empty","Error",JOptionPane.ERROR_MESSAGE);
            }
            else if(password.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Password should not be empty","Error",JOptionPane.ERROR_MESSAGE);
            }
            else if(conpword.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Confirm Password should not be empty","Error",JOptionPane.ERROR_MESSAGE);
            }
            else if(!password.equals(conpword))
            {
                JOptionPane.showMessageDialog(null, "Password and Confirm Password have to be same","Error",JOptionPane.ERROR_MESSAGE);
            }
            else if(jobRole.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Job Role should not be empty","Error",JOptionPane.ERROR_MESSAGE);
            }
            else if(bankName.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Bank Name should not be empty","Error",JOptionPane.ERROR_MESSAGE);
            }
            else if(branchName.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Branch Name should not be empty","Error",JOptionPane.ERROR_MESSAGE);
            }
            else if(accNumber.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Account Number should not be empty","Error",JOptionPane.ERROR_MESSAGE);
            }
            else if(accName.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Account Name should not be empty","Error",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                CEmployeeDetails cu=new CEmployeeDetails();
                cu.submitUser( empID, fn, ln, address, email, gender, tp, username, password, depID, depName, accType, jobRole, empStatus, bankName, branchName, accNumber, accName);
                cu.log(username, password, accType);
            }
        }
        catch(NullPointerException e)
        {
            System.out.println("Wrong input");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_tpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tpKeyTyped
        char c=evt.getKeyChar();
        if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c))
        {
            txt_tp.setEditable(false);
        }
        else
        {
            txt_tp.setEditable(true);
        }     // TODO add your handling code here:
    }//GEN-LAST:event_txt_tpKeyTyped

    private void txt_lnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_lnKeyTyped
        char c=evt.getKeyChar();
        if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c))
        {
            txt_ln.setEditable(true);
        }
        else
        {
            txt_ln.setEditable(false);
        }  // TODO add your handling code here:
    }//GEN-LAST:event_txt_lnKeyTyped

    private void txt_fnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fnKeyTyped
        char c=evt.getKeyChar();
        if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c))
        {
            txt_fn.setEditable(true);
        }
        else
        {
            txt_fn.setEditable(false);
        }// TODO add your handling code here:
    }//GEN-LAST:event_txt_fnKeyTyped

    private void txt_fnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fnKeyReleased
        
    }//GEN-LAST:event_txt_fnKeyReleased

    private void txt_eidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_eidKeyTyped
        
    }//GEN-LAST:event_txt_eidKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
txt_eid.setText("");
txt_fn.setText("");
txt_ln.setText("");
txt_address.setText("");
txt_email.setText("");
txt_tp.setText("");
txt_uname.setText("");
txt_pword.setText("");
txt_conpword.setText("");
txt_jrole.setText("");
txt_bankname.setText("");
txt_branchname.setText("");
txt_accnum.setText("");
txt_accname.setText("");
txt_depname.setSelectedItem(null);
txt_depid.setSelectedItem(null);
txt_empst.setSelectedItem(null);
txt_acctype.setSelectedItem(null);
txt_Female.setSelected(false);
txt_Male.setSelected(false);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
        
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(EmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JRadioButton txt_Female;
    private javax.swing.JRadioButton txt_Male;
    private javax.swing.JTextField txt_accname;
    private javax.swing.JTextField txt_accnum;
    private javax.swing.JComboBox<String> txt_acctype;
    private javax.swing.JTextPane txt_address;
    private javax.swing.JTextField txt_bankname;
    private javax.swing.JTextField txt_branchname;
    private javax.swing.JPasswordField txt_conpword;
    private javax.swing.JComboBox<String> txt_depid;
    private javax.swing.JComboBox<String> txt_depname;
    private javax.swing.JTextField txt_eid;
    private javax.swing.JTextField txt_email;
    private javax.swing.JComboBox<String> txt_empst;
    private javax.swing.JTextField txt_fn;
    private javax.swing.JTextField txt_jrole;
    private javax.swing.JTextField txt_ln;
    private javax.swing.JPasswordField txt_pword;
    private javax.swing.JTextField txt_tp;
    private javax.swing.JTextField txt_uname;
    // End of variables declaration//GEN-END:variables
}
