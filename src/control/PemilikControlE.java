package control;

import dao.PemilikDAOE;
import java.util.List;
import model.PemilikE;

public class PemilikControlE {
    PemilikDAOE pDao = new PemilikDAOE();
    
    public List<PemilikE> showListPemilik() {
        List<PemilikE> dataPemilik = pDao.IShowForDropdown();
        return dataPemilik;
    }
}
