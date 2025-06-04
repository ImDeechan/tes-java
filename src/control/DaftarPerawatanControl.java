package control;

import dao.DaftarPerawatanDAO;
import java.util.List;
import model.DaftarPerawatan;
import table.TableDaftarPerawatan;

public class DaftarPerawatanControl {
    DaftarPerawatanDAO dpDAO = new DaftarPerawatanDAO();
    
    public void insertDataDaftarPerawatan(DaftarPerawatan dp) {
        dpDAO.insert(dp);
    }
    
    public TableDaftarPerawatan showTable(String target) {
        List<DaftarPerawatan> dataPerawatan = dpDAO.showData(target);
        TableDaftarPerawatan tableDaftarPerawatan = new TableDaftarPerawatan(dataPerawatan);
        
        for(DaftarPerawatan perawatan : dataPerawatan) {
            System.out.println(perawatan.getAnabulE().getNama());
        }
        return tableDaftarPerawatan;
    }
    
    public void updateDaftarPerawatan(DaftarPerawatan dp, int id) {
        dpDAO.update(dp, Integer.toString(id));
    }
    
    public void deleteDaftarPerawatan(int id) {
        dpDAO.delete(Integer.toString(id));
    }
}
