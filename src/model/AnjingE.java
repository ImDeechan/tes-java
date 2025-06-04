package model;

public class AnjingE extends model.AnabulE {
    private String ras;

    public AnjingE(String ras, String id_anabul, String nama, String jenis, int umur) {
        super(id_anabul, nama, jenis, umur);
        this.ras = ras;
    }

    public AnjingE(String ras, String nama, String jenis, int umur) {
        super(nama, jenis, umur);
        this.ras = ras;
    }

    public AnjingE(String ras, String id_anabul, String nama, String jenis) {
        super(id_anabul, nama, jenis);
        this.ras = ras;
    }

    public String getRas() {
        return ras;
    }
    
    @Override
    public String getSpecial() {
        return ras;
    }   
}
