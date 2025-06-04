package dao;

import connection.DbConnection;
import interfaceDAO.IDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.*;

public class DaftarPerawatanDAO implements IDAO<DaftarPerawatan, String> {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    @Override
    public void insert(DaftarPerawatan dp) {
        con = dbCon.makeConnection();
        
        String sql = "INSERT INTO daftar_perawatan "
                + "(id_pemilik, id_anabul, perawatan, harga, metode_pembayaran, tanggal_masuk, tanggal_keluar"
                + " VALUES "
                + "('" +dp.getId_pemilik() + "', '" +dp.getId_anabul() + "', '"
                +dp.getPerawatan() + "', '" +dp.getHarga() + "', '" +dp.getMetode_pembayaran() + "', '" +dp.getTanggal_masuk() + "', '" +dp.getTanggal_keluar() + "')";
        System.out.println("Adding Perawatan...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added " +result+ " Perawatan");
            statement.close();
        } catch(Exception e) {
            System.out.println("Error Fetching data...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    @Override
    public List<DaftarPerawatan> showData(String query) {
        con = dbCon.makeConnection();
        
        String sql = "SELECT * "
                + "FROM daftar_perawatan DP "
                + "JOIN pemilik P ON (DP.id_pemilik = P.id_pemilik) "
                + "JOIN anabul A ON (DP.id_anabul = A.id_anabul) "
                + "WHERE (P.nama LIKE '%'" +query+ "%' "
                + "OR A.nama LIKE '%" +query+ "%' "
                + "OR DP.perawatan LIKE '%" +query+ "%' "
                + "OR DP.metode_pembayaran LIKE '%" +query+ "%')";
        System.out.println("Mengambil data Perawatan...");
        List<DaftarPerawatan> listPerawatan = new ArrayList();
        AnabulE A = null;
        
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null) {
                while(rs.next()) {
                    PemilikE p = new PemilikE(
                        rs.getInt("p.id_pemilik"),
                        rs.getString("p.nama"),
                        rs.getInt("p.umur"),
                        rs.getString("p.notelp")
                    );
                    
                    if(rs.getString("jenis").equals("Kucing")) {
                        A = new KucingE(
                            rs.getString("A.jenis_bulu"),
                            rs.getString("A.id_anabul"),
                            rs.getString("A.nama"),
                            rs.getString("A.jenis"));
                    } else {
                        A = new AnjingE(
                            rs.getString("A.ras"),
                            rs.getString("A.id_anabul"),
                            rs.getString("A.nama"),
                            rs.getString("A.jenis"));
                    }
                    
                    DaftarPerawatan DP = new DaftarPerawatan(
                        rs.getInt("DP.id_daftar_perawatan"),
                        rs.getInt("DP.id_pemilik"),
                        rs.getString("DP.id_anabul"),
                        rs.getFloat("DP.harga"),
                        rs.getString("DP.perawatan"),
                        rs.getString("DP.metode_pembayaran"),
                        rs.getString("tanggal_masuk"),
                        rs.getString("tanggal_keluar"),
                        p,
                        A
                    );
                    listPerawatan.add(DP);
                }
            }
            rs.close();
            statement.close();
        } catch(Exception e) {
            System.out.println("Error Fetching data...");
            System.out.println(e);
        }
        System.out.println("Berhasil");
        dbCon.closeConnection();
        return listPerawatan;
    }
    
    @Override
    public void update(DaftarPerawatan dp, String id) {
        con = dbCon.makeConnection();
        
        String sql = "UPDATE daftar_perawatan SET "
                + "id_anabul = '" +dp.getId_anabul() + "', harga = " +dp.getHarga() + ", "
                + "perawatan = '" +dp.getPerawatan() + "' "
                + "WHERE id_daftar_perawatan = " +id+ "";
        System.out.println("Editing Daftar Perawatan...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited " +result+ " Perawatan");
            statement.close();
        } catch(Exception e) {
            System.out.println("Error Fetching data...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    @Override
    public void delete(String id) {
        con = dbCon.makeConnection();
        
        String sql = "DELETE FROM daftar_perawatan "
                + "WHERE id_daftar_perawatan = " +id+ "";
        System.out.println("Deleting Daftar Perawatan...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete " +result+ " Pembelian " +id);
            statement.close();
        } catch(Exception e) {
            System.out.println("Error Fetching data...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    @Override
    public DaftarPerawatan search(String data) {
        return null;
    }
}
