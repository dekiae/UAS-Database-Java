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
public class Delete {
    KoneksiDatabase konek = new KoneksiDatabase();

    public void delete(int id) {

        try {
            konek.koneksi();
            java.sql.Statement statement = konek.con.createStatement();
            String sql = "delete from data where id = '" + id + "'";

            statement.executeUpdate(sql);
            statement.close();
            
            int hps = 0;
            JOptionPane.showConfirmDialog(null,"Apakah anda ingin menghapus data tersebut?");
            if(hps == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null, "Berhasil dihapus");
            }else{
        }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
