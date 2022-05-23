/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlysach;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vũ Nguyên Hướng
 */
public class SachForm extends javax.swing.JFrame {
    
    private DefaultTableModel defaultTableModel;
    private DefaultComboBoxModel defaultComboBoxModel;
    private List<Sach> listSach = new ArrayList<>();
    public SachForm() {
        initComponents();
        theLoai();
        addColumn();
        addNamIn();
        loadDataTable();
    }
    
    ButtonGroup buttonGroup = new ButtonGroup();
    
    void theLoai(){
        buttonGroup.add(rd_tieuthuyet);
        buttonGroup.add(rd_truyenngan);
    }
    
    public void addColumn(){
        ArrayList<String> listColumn = new ArrayList<>();
        listColumn.add("Tên sách");
        listColumn.add("Tác giả");
        listColumn.add("Thể loại");
        listColumn.add("Năm in");
        
        defaultTableModel = (DefaultTableModel) tb_table.getModel();
        for (String item : listColumn) {
            defaultTableModel.addColumn(item);
        }
    }
    
    public void addNamIn(){
        ArrayList<Integer> listNamIn = new ArrayList<>();
        listNamIn.add(2010);
        listNamIn.add(2011);
        listNamIn.add(2012);
        listNamIn.add(2013);
        listNamIn.add(2014);
        listNamIn.add(2015);
        listNamIn.add(2016);
        listNamIn.add(2017);
        listNamIn.add(2018);
        listNamIn.add(2019);
        listNamIn.add(2020);
        
        defaultComboBoxModel = (DefaultComboBoxModel) cb_namin.getModel();
        for (Integer item : listNamIn) {
            defaultComboBoxModel.addElement(item);
        }
    }
    
    public String getTenTheLoai(int theLoai){
        if(theLoai == 1){
            return "Truyện ngắn";
        }else{
            return "Tiểu thuyết";
        }
    }
    public void loadDataTable(){
        defaultTableModel = (DefaultTableModel) tb_table.getModel();
        defaultTableModel.setRowCount(0);
        for (Sach x : listSach) {
            defaultTableModel.addRow(new Object[]{
                x.getTen(),x.getTacGia(),getTenTheLoai(x.getTheLoai()),x.getNamIn()
            });
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_tensach = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_tacgia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rd_truyenngan = new javax.swing.JRadioButton();
        rd_tieuthuyet = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        cb_namin = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_table = new javax.swing.JTable();
        btn_them = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.orange);
        jLabel1.setText("Quản Lý Sách");

        jLabel2.setText("Tên Sách");

        jLabel3.setText("Tác Giả");

        jLabel4.setText("Thể Loại");

        rd_truyenngan.setText("Truyện ngắn");

        rd_tieuthuyet.setText("Tiểu thuyết");

        jLabel5.setText("Năm in");

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

        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(243, 243, 243)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_tensach, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_tacgia, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(cb_namin, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(rd_truyenngan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addComponent(rd_tieuthuyet)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_clear, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(btn_xoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_them, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))))
                        .addGap(96, 96, 96))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_tensach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_them))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_tacgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoa))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rd_truyenngan)
                    .addComponent(rd_tieuthuyet)
                    .addComponent(btn_clear))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cb_namin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        if(txt_tensach.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Tên sách không được để trống!");
        }else if(txt_tacgia.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Tên tác giả không được để trống!");
        }else{
            Sach s1 = new Sach();
            s1.setTen(txt_tensach.getText());
            s1.setTacGia(txt_tacgia.getText());
            if(rd_tieuthuyet.isSelected()){
                s1.setTheLoai(2);
                listSach.add(s1);
            }else if(rd_truyenngan.isSelected()){
                s1.setTheLoai(1);
                listSach.add(s1);
            }else{
                JOptionPane.showMessageDialog(this, "Vui lòng chọn thể loại!");
            }
            s1.setNamIn(Integer.parseInt(cb_namin.getSelectedItem().toString()));
        }
        loadDataTable();
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        int rows = tb_table.getSelectedRow();
        if(rows == -1){
            JOptionPane.showMessageDialog(this, "Hãy chọn 1 dòng rồi xóa!");
        }else{
            int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa\"" + tb_table.getValueAt(rows, 0) + "\" ra khỏi danh sách ?","Message",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(choice == JOptionPane.YES_OPTION){
                listSach.remove(rows);
                loadDataTable();
                JOptionPane.showMessageDialog(this, "Xóa thành công!");
            }
        }
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        txt_tensach.setText("");
        txt_tacgia.setText("");
        buttonGroup.clearSelection();
        cb_namin.setSelectedIndex(5);
    }//GEN-LAST:event_btn_clearActionPerformed

    private void tb_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_tableMouseClicked
        int rows = tb_table.getSelectedRow();
        txt_tensach.setText((String) tb_table.getValueAt(rows, 0));
        txt_tacgia.setText((String) tb_table.getValueAt(rows, 1));
        if(tb_table.getValueAt(rows, 2).equals("Tiểu thuyết")){
            rd_tieuthuyet.setSelected(true);
        }else{
            rd_truyenngan.setSelected(true);
        }
        cb_namin.setSelectedItem(tb_table.getValueAt(rows, 3));
    }//GEN-LAST:event_tb_tableMouseClicked

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
            java.util.logging.Logger.getLogger(SachForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SachForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SachForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SachForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SachForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JComboBox<String> cb_namin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rd_tieuthuyet;
    private javax.swing.JRadioButton rd_truyenngan;
    private javax.swing.JTable tb_table;
    private javax.swing.JTextField txt_tacgia;
    private javax.swing.JTextField txt_tensach;
    // End of variables declaration//GEN-END:variables
}
