package control;

import dao.AnabulDAOE;
import java.util.List;
import model.AnabulE;

public class AnabulControlE {
    AnabulDAOE aDao = new AnabulDAOE();
    
    public List<AnabulE> showListAnabul() {
        List<AnabulE> dataAnabul = aDao.IShowForDropdown();
        return dataAnabul;
    }
}
