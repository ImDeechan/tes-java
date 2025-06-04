package model;

public class KucingE extends model.AnabulE {
    private String jenis_bulu;

    public KucingE(String jenis_bulu, String id_anabul, String nama, String jenis, int umur) {
        super(id_anabul, nama, jenis, umur);
        this.jenis_bulu = jenis_bulu;
    }

    public KucingE(String jenis_bulu, String nama, String jenis, int umur) {
        super(nama, jenis, umur);
        this.jenis_bulu = jenis_bulu;
    }

    public KucingE(String jenis_bulu, String id_anabul, String nama, String jenis) {
        super(id_anabul, nama, jenis);
        this.jenis_bulu = jenis_bulu;
    }

    public String getJenis_bulu() {
        return jenis_bulu;
    }
    
    @Override
    public String getSpecial() {
        return jenis_bulu;
    }
}
