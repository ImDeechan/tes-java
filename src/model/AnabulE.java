package model;

public abstract class AnabulE extends model.Anabul {

    public AnabulE(String id_anabul, String nama, String jenis, int umur) {
        super(id_anabul, nama, jenis, umur);
    }

    public AnabulE(String nama, String jenis, int umur) {
        super(nama, jenis, umur);
    }

    public AnabulE(String id_anabul, String nama, String jenis) {
        super(id_anabul, nama, jenis);
    }
    
    @Override
    public String toString() {
        return getNama();
    }
}
