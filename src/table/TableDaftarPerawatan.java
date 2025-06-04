package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.DaftarPerawatan;

public class TableDaftarPerawatan extends AbstractTableModel {
    private List<DaftarPerawatan> list;

    public TableDaftarPerawatan(List<DaftarPerawatan> list) {
        this.list = list;
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }
    
    @Override
    public int getColumnCount() {
        return 9;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0:
                return list.get(rowIndex).getId_daftar_perawatan();
            case 1:
                return list.get(rowIndex).getPemilikE().getNama();
            case 2:
                return list.get(rowIndex).getAnabulE().getNama();
            case 3:
                return list.get(rowIndex).getPerawatan();
            case 4:
                return list.get(rowIndex).getHarga();
            case 5:
                return list.get(rowIndex).getMetode_pembayaran();
            case 6:
                return list.get(rowIndex).getTanggal_masuk();
            case 7:
                return list.get(rowIndex).getTanggal_keluar();
            case 8:
                return list.get(rowIndex).getId_pemilik();
            case 9:
                return list.get(rowIndex).getId_anabul();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0:
                return "ID Perawatan";
            case 1:
                return "Nama Pemilik";
            case 2:
                return "Nama Anabul";
            case 3:
                return "Jenis Perawatan";
            case 4:
                return "Harga";
            case 5:
                return "Metode Pembayaran";
            case 6:
                return "Tanggal Masuk";
            case 7:
                return "Tanggal Keluar";
            default:
                return null;
        }
    }
}
