package model;

public class PemilikE extends model.Pemilik {

    public PemilikE(int id_pemilik, String nama, int umur, String notelp) {
        super(id_pemilik, nama, umur, notelp);
    }

    public PemilikE(String nama, int umur, String notelp) {
        super(nama, umur, notelp);
    }
    
    @Override
    public String toString() {
        return getNama();
    }
}
