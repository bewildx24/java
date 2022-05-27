/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package luyentap1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vũ Nguyên Hướng
 */
public class FormPhong extends javax.swing.JFrame {

    private DefaultTableModel defaultTableModel;
    private DefaultComboBoxModel defaultComboBoxModel;

    private List<Phong> listPhong = new ArrayList<>();

    public FormPhong() {
        initComponents();
        tinhTrang();
        addColumn();
        addSoNguoi();
        loadDataTable();
        dongHo();
        setLocationRelativeTo(null);
    }

    public void fakeData() {
        listPhong.add(new Phong("1", "Nam Dinh", "Vu Nguyen Huong", 1, 2));
        listPhong.add(new Phong("2", "Thai Binh", "Nguyen Van Tuan", 1, 3));
        listPhong.add(new Phong("3", "Ha Noi", "Pham Tien Dat", 2, 4));
        listPhong.add(new Phong("4", "Sout Earth", "Dinh Hai Duong", 2, 1));
    }

    public void dongHo() {
        new Thread() {
            public void run() {
                while (true) {
                    Calendar ca = new GregorianCalendar();
                    int hour = ca.get(Calendar.HOUR);
                    int minute = ca.get(Calendar.MINUTE);
                    int second = ca.get(Calendar.SECOND);
                    int PM_AM = ca.get(Calendar.AM_PM);

                    String day_night;
                    if (PM_AM == 1) {
                        day_night = "PM";
                    } else {
                        day_night = "AM";
                    }
                    String time = hour + ":" + minute + ":" + second + " " + day_night;
                    jlb_dongho.setText(time);
                }
            }
        }.start();
    }
    ButtonGroup buttonGroup = new ButtonGroup();

    void tinhTrang() {
        buttonGroup.add(rd_chuathue);
        buttonGroup.add(rd_dathue);
    }

    public void addColumn() {
        ArrayList<String> listColumn = new ArrayList<>();
        listColumn.add("Số phòng");
        listColumn.add("Địa chỉ");
        listColumn.add("Người thuê");
        listColumn.add("Tình trạng");
        listColumn.add("Số người");

        defaultTableModel = (DefaultTableModel) tb_table.getModel();
        for (String item : listColumn) {
            defaultTableModel.addColumn(item);
        }
    }

    public void addSoNguoi() {
        ArrayList<Integer> listSoNguoi = new ArrayList<>();
        listSoNguoi.add(1);
        listSoNguoi.add(2);
        listSoNguoi.add(3);
        listSoNguoi.add(4);

        defaultComboBoxModel = (DefaultComboBoxModel) cb_songuoi.getModel();
        for (Integer item : listSoNguoi) {
            defaultComboBoxModel.addElement(item);
        }
    }

    public String getTenTinhTrang(int tinhTrang) {
        if (tinhTrang == 1) {
            return "Chưa thuê";
        } else {
            return "Đã thuê";
        }
    }

    public void loadDataTable() {
        defaultTableModel = (DefaultTableModel) tb_table.getModel();
        defaultTableModel.setRowCount(0);
        for (Phong x : listPhong) {
            defaultTableModel.addRow(new Object[]{
                x.getSoPhong(), x.getDiaChi(), x.getNguoiThue(), getTenTinhTrang(x.getTinhTrang()), x.getSoNguoi()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jlb_quanlyphong = new javax.swing.JLabel();
        jlb_sophong = new javax.swing.JLabel();
        txt_sophong = new javax.swing.JTextField();
        jlb_diachi = new javax.swing.JLabel();
        txt_diachi = new javax.swing.JTextField();
        jlb_nguoithue = new javax.swing.JLabel();
        txt_nguoithue = new javax.swing.JTextField();
        jlb_tinhtrang = new javax.swing.JLabel();
        rd_chuathue = new javax.swing.JRadioButton();
        rd_dathue = new javax.swing.JRadioButton();
        jlb_songuoi = new javax.swing.JLabel();
        cb_songuoi = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_table = new javax.swing.JTable();
        btn_them = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_thoat = new javax.swing.JButton();
        jlb_dongho = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_timkiem = new javax.swing.JTextField();
        btn_timkiem = new javax.swing.JButton();
        btn_fakedata = new javax.swing.JButton();
        jlb_er_sophong = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlb_quanlyphong.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlb_quanlyphong.setForeground(java.awt.Color.red);
        jlb_quanlyphong.setText("Quản Lý Phòng");

        jlb_sophong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlb_sophong.setText("Số phòng");

        txt_sophong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jlb_diachi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlb_diachi.setText("Địa chỉ");

        txt_diachi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_diachi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_diachiActionPerformed(evt);
            }
        });

        jlb_nguoithue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlb_nguoithue.setText("Người thuê");

        txt_nguoithue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jlb_tinhtrang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlb_tinhtrang.setText("Tình trạng");

        rd_chuathue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rd_chuathue.setText("Chưa thuê");

        rd_dathue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rd_dathue.setText("Đã thuê");

        jlb_songuoi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlb_songuoi.setText("Số người");

        cb_songuoi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tb_table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tb_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tb_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_table);

        btn_them.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_clear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        btn_thoat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_thoat.setText("Thoát");
        btn_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thoatActionPerformed(evt);
            }
        });

        jlb_dongho.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlb_dongho.setForeground(java.awt.Color.red);
        jlb_dongho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_dongho.setText("00:00:00 AM");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Tìm kiếm");

        txt_timkiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btn_timkiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_timkiem.setText("Tìm kiếm");
        btn_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timkiemActionPerformed(evt);
            }
        });

        btn_fakedata.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_fakedata.setText("Fake Data");
        btn_fakedata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fakedataActionPerformed(evt);
            }
        });

        jlb_er_sophong.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jlb_er_sophong.setForeground(java.awt.Color.red);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlb_sophong)
                        .addGap(129, 129, 129)
                        .addComponent(jlb_quanlyphong)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlb_nguoithue)
                                .addGap(18, 18, 18)
                                .addComponent(txt_nguoithue, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlb_songuoi)
                                .addGap(36, 36, 36)
                                .addComponent(cb_songuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlb_diachi)
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jlb_er_sophong, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_diachi, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                    .addComponent(txt_sophong)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(35, 35, 35)
                                .addComponent(txt_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jlb_dongho, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jlb_tinhtrang)
                                .addGap(28, 28, 28)
                                .addComponent(rd_chuathue)
                                .addGap(18, 18, 18)
                                .addComponent(rd_dathue)
                                .addGap(140, 140, 140)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_them, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_fakedata)
                                            .addComponent(btn_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(57, 57, 57))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_quanlyphong)
                    .addComponent(jlb_dongho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_sophong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlb_sophong))
                    .addComponent(btn_them, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlb_er_sophong)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_diachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_clear)
                    .addComponent(jlb_diachi))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_nguoithue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlb_nguoithue))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_thoat)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_fakedata)
                            .addComponent(jlb_tinhtrang)
                            .addComponent(rd_chuathue)
                            .addComponent(rd_dathue))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_songuoi)
                    .addComponent(cb_songuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_timkiem)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if (txt_sophong.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số phòng!");
        } else if (txt_diachi.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập địa chỉ!");
        } else if (txt_nguoithue.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập người thuê!");
        } else {
            Phong p1 = new Phong();
            p1.setSoPhong(txt_sophong.getText());
            p1.setDiaChi(txt_diachi.getText());
            p1.setNguoiThue(txt_nguoithue.getText());
            p1.setSoNguoi((int) cb_songuoi.getSelectedItem());
            if (rd_chuathue.isSelected()) {
                p1.setTinhTrang(1);
                listPhong.add(p1);
                JOptionPane.showMessageDialog(this, "Thêm thành công!");
            } else if (rd_dathue.isSelected()) {
                p1.setTinhTrang(0);
                listPhong.add(p1);
                JOptionPane.showMessageDialog(this, "Thêm thành công!");
            } else {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn tình trạng!");
            }
        }
        loadDataTable();
    }                                        

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {                                          
        txt_sophong.setText("");
        txt_diachi.setText("");
        txt_nguoithue.setText("");
        buttonGroup.clearSelection();
        cb_songuoi.setSelectedIndex(0);
    }                                         

    private void btn_thoatActionPerformed(java.awt.event.ActionEvent evt) {                                          
        int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát khỏi chương trình ?", "Message", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (choice == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Đã thoát khỏi chương trình!");
            System.exit(0);
        }
    }                                         

    private void tb_tableMouseClicked(java.awt.event.MouseEvent evt) {                                      
        int row = tb_table.getSelectedRow();
        txt_sophong.setText((String) tb_table.getValueAt(row, 0));
        txt_diachi.setText((String) tb_table.getValueAt(row, 1));
        txt_nguoithue.setText((String) tb_table.getValueAt(row, 2));
        if (tb_table.getValueAt(row, 3).equals("Chưa thuê")) {
            rd_chuathue.setSelected(true);
        } else {
            rd_dathue.setSelected(true);
        }
        cb_songuoi.setSelectedItem(tb_table.getValueAt(row, 4));
    }                                     

    private void btn_timkiemActionPerformed(java.awt.event.ActionEvent evt) {                                            

        if (txt_timkiem.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập tên người thuê!");
        } else {
            for (Phong x : listPhong) {
                if (x.getNguoiThue().equalsIgnoreCase(txt_timkiem.getText())) {
                    txt_sophong.setText(x.getSoPhong());
                    txt_diachi.setText(x.getDiaChi());
                    if (x.getTinhTrang() == 1) {
                        rd_chuathue.setSelected(true);
                    } else {
                        rd_dathue.setSelected(true);
                    }
                    txt_nguoithue.setText(x.getNguoiThue());
                    cb_songuoi.setSelectedItem(x.getSoNguoi());
                }
            }
        }
    }                                           

    private void btn_fakedataActionPerformed(java.awt.event.ActionEvent evt) {                                             
        fakeData();
        loadDataTable();
    }                                            

    private void txt_diachiActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(FormPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPhong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_fakedata;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_thoat;
    private javax.swing.JButton btn_timkiem;
    private javax.swing.JComboBox<String> cb_songuoi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlb_diachi;
    private javax.swing.JLabel jlb_dongho;
    private javax.swing.JLabel jlb_er_sophong;
    private javax.swing.JLabel jlb_nguoithue;
    private javax.swing.JLabel jlb_quanlyphong;
    private javax.swing.JLabel jlb_songuoi;
    private javax.swing.JLabel jlb_sophong;
    private javax.swing.JLabel jlb_tinhtrang;
    private javax.swing.JRadioButton rd_chuathue;
    private javax.swing.JRadioButton rd_dathue;
    private javax.swing.JTable tb_table;
    private javax.swing.JTextField txt_diachi;
    private javax.swing.JTextField txt_nguoithue;
    private javax.swing.JTextField txt_sophong;
    private javax.swing.JTextField txt_timkiem;
    // End of variables declaration                   
}
