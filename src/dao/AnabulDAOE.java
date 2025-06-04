package dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import interfaceDAO.IShowForDropdown;
import model.AnabulE;
import model.AnjingE;
import model.KucingE;

public class AnabulDAOE extends dao.AnabulDAO implements IShowForDropdown {
    
    @Override
    public List<AnabulE> IShowForDropdown() {
        con = dbCon.makeConnection();
        
        String sql = "SELECT anabul.*, kucing.jenis_bulu, anjing.ras FROM anabul\n"
                + "LEFT JOIN kucing ON anabul.id_anabul = kucing.id_anabul\n"
                + "LEFT JOIN anjing ON anabil.id_anabul = anjing.id_anabul; ";
        System.out.println("Fetching data...");
        List<AnabulE> listA = new ArrayList();
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            AnabulE a = null;
            if(rs != null)
                while(rs.next())
                    if(rs.getString("jenis").equals("Kucing")) {
                        a = new KucingE(
                        rs.getString("jenis_bulu"),
                        rs.getString("id_anabul"),
                        rs.getString("nama"),
                        rs.getString("jenis"),
                        rs.getInt("umur"));
                    } else {
                        a = new AnjingE(
                        rs.getString("ras"),
                        rs.getString("id_anabul"),
                        rs.getString("nama"),
                        rs.getString("jenis"),
                        rs.getInt("umur"));
                    }
            listA.add(a);
            rs.close();
            statement.close();
        } catch (Exception e) {
            System.out.println("Error Fetching Data...");
            System.out.println(e);
        }
        dbCon.closeConnection();
        return listA;
    }
}
