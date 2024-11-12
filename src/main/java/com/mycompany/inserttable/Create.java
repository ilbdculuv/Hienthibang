package com.mycompany.inserttable;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import sample.connection.DatabaseConnection;
import sample.model.Model_khoanthu;
import sample.model.Model_loaikhoanthu;
import sample.service.Service_khoanthu;

public class Create extends javax.swing.JPanel {

    public Create() {
        initComponents();
        jComboBox1.setEditable(true);
        datePicker.setCloseAfterSelected(true);
        datePicker1.setCloseAfterSelected(true);
        datePicker.setEditor(txtNgaybatdauthu);
        datePicker1.setEditor(txtNgayketthuc);
    }
    //Sua pthuc loaddata
    public void loadData(Service_khoanthu service, Model_khoanthu data){
        try{
            for(Model_loaikhoanthu pos:service.getService_loaikhoanthu().getAll()){
                jComboBox1.addItem(pos); 
                if(data != null&&data.getTenkhoanthu().getTenKhoanThuId()==pos.getTenKhoanThuId()){
                    jComboBox1.setSelectedItem(pos);
                }
                
            }
        }catch(SQLException e){
            e.printStackTrace();
            System.out.println("Lỗi dòng 38");
    }
        if(data != null){
            //khac mau video
            //thieu cai txtName nhu mau ???
            txtSotienthu.setValue(data.getSotienthu());
            // Chuyển đổi Date sang String để dùng với setText()
            if (data.getNgaybatdauthu() != null) {
                txtNgaybatdauthu.setText(data.getNgaybatdauthu().toString());
            } else {
                txtNgaybatdauthu.setText(""); // Xử lý trường hợp null
            }

            if (data.getNgayketthuc() != null) {
                txtNgayketthuc.setText(data.getNgayketthuc().toString());
            } else {
                txtNgayketthuc.setText(""); // Xử lý trường hợp null
            }
            txtMota.setText(data.getMota());
         }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        datePicker = new raven.datetime.component.date.DatePicker();
        datePicker1 = new raven.datetime.component.date.DatePicker();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSotienthu = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMota = new javax.swing.JTextArea();
        txtNgaybatdauthu = new javax.swing.JFormattedTextField();
        txtNgayketthuc = new javax.swing.JFormattedTextField();

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Mã khoản thu");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Tên khoàn thu");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Số tiền thu");

        txtSotienthu.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0"))));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Ngày bắt đầu");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Ngày kết thúc");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Mô tả");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        txtMota.setColumns(20);
        txtMota.setRows(5);
        jScrollPane1.setViewportView(txtMota);

        txtNgaybatdauthu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgaybatdauthuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSotienthu)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtName)
                    .addComponent(jScrollPane1)
                    .addComponent(txtNgaybatdauthu)
                    .addComponent(txtNgayketthuc))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSotienthu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgaybatdauthu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgayketthuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    public Model_khoanthu getData(){
        Object selectedItem = jComboBox1.getSelectedItem();
    Model_loaikhoanthu tenkhoanthu = null;

    // Kiểm tra nếu đối tượng là Model_loaikhoanthu
    if (selectedItem instanceof Model_loaikhoanthu) {
        tenkhoanthu = (Model_loaikhoanthu) selectedItem;
    } else if (selectedItem instanceof String) {
        // Tìm kiếm trong cơ sở dữ liệu nếu đối tượng là String
        String tenKhoanThuStr = (String) selectedItem;
        tenkhoanthu = searchLoaiKhoanThuFromDatabase(tenKhoanThuStr);
        
        if (tenkhoanthu == null) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy loại khoản thu trong cơ sở dữ liệu!", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
            return null; // Không tìm thấy loại khoản thu phù hợp
        }
    }
        int sotienthu = 0;
        if (!txtSotienthu.getText().trim().isEmpty()) {
            sotienthu = Integer.parseInt(txtSotienthu.getText().trim().replace(",", ""));
        }
        Date sqlDate = Date.valueOf("1990-01-01");
        Date ngaybatdauthu = null;
        Date ngaykethuc = null;
        if (!txtNgaybatdauthu.getText().trim().isEmpty()) {
            ngaybatdauthu = datePicker.isDateSelected()?Date.valueOf(datePicker.getSelectedDate()):sqlDate;
        }
        if (!txtNgayketthuc.getText().trim().isEmpty()) {
            ngaykethuc = datePicker1.isDateSelected()?Date.valueOf(datePicker1.getSelectedDate()):sqlDate;
        }

        String mota = txtMota.getText().trim();

        return new Model_khoanthu(0, tenkhoanthu, ngaybatdauthu, sotienthu, ngaykethuc, mota);
    }
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        JComboBox cb = (JComboBox) evt.getSource();
                Object selectedItem = cb.getSelectedItem();

                if (selectedItem instanceof String) {
                    String newEntry = (String) selectedItem;

                    // Kiểm tra nếu mục nhập mới không có trong danh sách hiện tại
                    if (!newEntry.trim().isEmpty() && !newEntryExistsInComboBox(cb, newEntry)) {
                        int response = JOptionPane.showConfirmDialog(this,
                                "Bạn có muốn thêm loại khoản thu mới: \"" + newEntry + "\"?",
                                "Thêm mục mới",
                                JOptionPane.YES_NO_OPTION);

                        if (response == JOptionPane.YES_OPTION) {
                            // Tạo một đối tượng Model_loaikhoanthu từ newEntry
                            Model_loaikhoanthu newModel = new Model_loaikhoanthu(generateNewId(), newEntry); // generateNewId() là phương thức giả định để tạo ID mới
                            cb.addItem(newModel); // Thêm vào JComboBox dưới dạng đối tượng
                            addLoaiKhoanThuToDatabase(newModel); // Lưu vào cơ sở dữ liệu
                        }
                    }
                }
    }//GEN-LAST:event_jComboBox1ActionPerformed
private Model_loaikhoanthu searchLoaiKhoanThuFromDatabase(String tenKhoanThu) {
    Connection con = null;
    PreparedStatement p = null;
    ResultSet rs = null;
    try {
        con = DatabaseConnection.getInstance().createConnection();
        String query = "SELECT * FROM `loại khoản thu` WHERE `tenkhoanthu_name` = ?";
        p = con.prepareStatement(query);
        p.setString(1, tenKhoanThu);
        rs = p.executeQuery();

        if (rs.next()) {
            // Giả sử Model_loaikhoanthu có constructor nhận id và name
            return new Model_loaikhoanthu(rs.getInt("tenkhoanthu_id"), rs.getString("tenkhoanthu_name"));
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Lỗi khi truy vấn cơ sở dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
    } finally {
        try {
            DatabaseConnection.getInstance().close(rs, p, con);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    return null; // Không tìm thấy loại khoản thu
}
    private void txtNgaybatdauthuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgaybatdauthuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgaybatdauthuActionPerformed
    private boolean newEntryExistsInComboBox(JComboBox cb, String entry) {
                for (int i = 0; i < cb.getItemCount(); i++) {
                    Object item = cb.getItemAt(i);
                    if (item instanceof Model_loaikhoanthu) {
                        Model_loaikhoanthu model = (Model_loaikhoanthu) item;
                        if (model.getTenKhoanThuName().equals(entry)) { // getTenkhoanthuName() là phương thức getter giả định
                            return true;
                        }
                    }
                }
                return false;
            }

    private int generateNewId() {
       // Giả lập tạo ID mới, bạn có thể thay thế bằng logic thực tế để tạo ID mới.
        return (int) (Math.random() * 1000);
    }

            private void addLoaiKhoanThuToDatabase(Model_loaikhoanthu model) {
                Connection con = null;
                PreparedStatement p = null;
                try {
                    // Giả sử bảng `loại khoản thu` có các cột `tenkhoanthu_id` và `tenkhoanthu_name`
                    con = DatabaseConnection.getInstance().createConnection();
                    p = con.prepareStatement("INSERT INTO `loại khoản thu` (tenkhoanthu_id, tenkhoanthu_name) VALUES (?, ?)");
                    p.setInt(1, model.getTenKhoanThuId()); // Lấy ID từ đối tượng model
                    p.setString(2, model.getTenKhoanThuName()); // Lấy tên từ đối tượng model
                    int rowsInserted = p.executeUpdate(); // Thực hiện thêm vào cơ sở dữ liệu

                    if (rowsInserted > 0) {
                        JOptionPane.showMessageDialog(this, "Đã thêm loại khoản thu: " + model.getTenKhoanThuName() + " vào cơ sở dữ liệu.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(this, "Không thể thêm loại khoản thu: " + model.getTenKhoanThuName(), "Thông báo", JOptionPane.WARNING_MESSAGE);
                    }

                } catch (SQLException ex) {
                    ex.printStackTrace(); // Hiển thị thông báo lỗi hoặc ghi log lỗi
                    System.out.println("Lỗi dòng 252");
                    JOptionPane.showMessageDialog(null, "Lỗi khi thêm loại khoản thu vào cơ sở dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                } finally {
                    try {
                        // Đảm bảo đóng tài nguyên
                        DatabaseConnection.getInstance().close(null, p, con);
                    } catch (SQLException ex) {
                        Logger.getLogger(Create.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private raven.datetime.component.date.DatePicker datePicker;
    private raven.datetime.component.date.DatePicker datePicker1;
    private javax.swing.JComboBox<Object> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtMota;
    private javax.swing.JTextField txtName;
    private javax.swing.JFormattedTextField txtNgaybatdauthu;
    private javax.swing.JFormattedTextField txtNgayketthuc;
    private javax.swing.JFormattedTextField txtSotienthu;
    // End of variables declaration//GEN-END:variables
}
