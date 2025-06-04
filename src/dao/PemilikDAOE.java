package dao;

import model.PemilikE;
import interfaceDAO.IShowForDropdown;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PemilikDAOE extends dao.PemilikDAO implements IShowForDropdown {
    
    @Override
    public List<PemilikE> IShowForDropdown() {
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM pemilik";
        System.out.println("Fetching data...");
        List<PemilikE> p = new ArrayList();
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null)
                while(rs.next())
                    p.add(new PemilikE(
                        rs.getInt("id_pemilik"),
                        rs.getString("nama"),
                        rs.getInt("umur"),
                        rs.getString("notelp")));
            rs.close();
            statement.close();
        } catch (Exception e) {
            System.out.println("Error Fetching Data...");
            System.out.println(e);
        }
        dbCon.closeConnection();
        return p;
    }
}
