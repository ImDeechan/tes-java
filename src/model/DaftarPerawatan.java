package model;

public class DaftarPerawatan {
    private int id_daftar_perawatan, id_pemilik;
    private String id_anabul, perawatan, metode_pembayaran, tanggal_masuk, tanggal_keluar;
    private float harga;
    private PemilikE pemilikE;
    private AnabulE anabulE;

    public DaftarPerawatan(int id_daftar_perawatan, int id_pemilik, String id_anabul, float harga, String perawatan, String metode_pembayaran, String tanggal_masuk, String tanggal_keluar, PemilikE pemilikE, AnabulE anabulE) {
        this.id_daftar_perawatan = id_daftar_perawatan;
        this.id_pemilik = id_pemilik;
        this.id_anabul = id_anabul;
        this.harga = harga;
        this.perawatan = perawatan;
        this.metode_pembayaran = metode_pembayaran;
        this.tanggal_masuk = tanggal_masuk;
        this.tanggal_keluar = tanggal_keluar;
        this.pemilikE = pemilikE;
        this.anabulE = anabulE;
    }

    public DaftarPerawatan(int id_pemilik, String id_anabul, float harga, String perawatan, String metode_pembayaran, String tanggal_masuk, String tanggal_keluar, PemilikE pemilikE, AnabulE anabulE) {
        this.id_pemilik = id_pemilik;
        this.id_anabul = id_anabul;
        this.harga = harga;
        this.perawatan = perawatan;
        this.metode_pembayaran = metode_pembayaran;
        this.tanggal_masuk = tanggal_masuk;
        this.tanggal_keluar = tanggal_keluar;
        this.pemilikE = pemilikE;
        this.anabulE = anabulE;
    }

    public void setId_daftar_perawatan(int id_daftar_perawatan) {
        this.id_daftar_perawatan = id_daftar_perawatan;
    }

    public void setId_pemilik(int id_pemilik) {
        this.id_pemilik = id_pemilik;
    }

    public void setId_anabul(String id_anabul) {
        this.id_anabul = id_anabul;
    }

    public void setPerawatan(String perawatan) {
        this.perawatan = perawatan;
    }

    public void setMetode_pembayaran(String metode_pembayaran) {
        this.metode_pembayaran = metode_pembayaran;
    }

    public void setTanggal_masuk(String tanggal_masuk) {
        this.tanggal_masuk = tanggal_masuk;
    }

    public void setTanggal_keluar(String tanggal_keluar) {
        this.tanggal_keluar = tanggal_keluar;
    }

    public void setHarga(float harga) {
        this.harga = harga;
    }

    public void setPemilikE(PemilikE pemilikE) {
        this.pemilikE = pemilikE;
    }

    public void setAnabulE(AnabulE anabulE) {
        this.anabulE = anabulE;
    }

    public int getId_daftar_perawatan() {
        return id_daftar_perawatan;
    }

    public int getId_pemilik() {
        return id_pemilik;
    }

    public String getId_anabul() {
        return id_anabul;
    }

    public String getPerawatan() {
        return perawatan;
    }

    public String getMetode_pembayaran() {
        return metode_pembayaran;
    }

    public String getTanggal_masuk() {
        return tanggal_masuk;
    }

    public String getTanggal_keluar() {
        return tanggal_keluar;
    }

    public float getHarga() {
        return harga;
    }

    public PemilikE getPemilikE() {
        return pemilikE;
    }

    public AnabulE getAnabulE() {
        return anabulE;
    }
}
