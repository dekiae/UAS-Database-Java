/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

import javax.swing.JOptionPane;

/**
 *
 * @author Smart Media PC
 */
public class update {

    KoneksiDatabase konek = new KoneksiDatabase();

    public void update(int id, String nama, String alamat, String jk) {

        try {
            konek.koneksi();
            java.sql.Statement statement = konek.con.createStatement();

            String sql_nama = "update data set nama = '" + nama + "'where id = '" + id + "'";
            String sql_alamat = "update data set alamat = '" + alamat + "'where id = '" + id + "'";
            String sql_jk = "update data set jeniskelamin = '" + jk + "'where id = '" + id + "'";
            String sql_id1 = "update data set id = '" + id + "'where nama = '" + nama + "'";
            String sql_id2 = "update data set id = '" + id + "'where alamat = '" + alamat + "'";

            statement.executeUpdate(sql_id1);
            statement.executeUpdate(sql_id2);
            statement.executeUpdate(sql_nama);
            statement.executeUpdate(sql_alamat);
            statement.executeUpdate(sql_jk);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
