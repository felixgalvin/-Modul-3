package modul3.Model.classes;

public class MataKuliah {
    private String kode;
    private int SKS;
    private String nama;

    public MataKuliah(String kode, int SKS, String nama) {
        this.kode = kode;
        this.SKS = SKS;
        this.nama = nama;
    }
    
    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public int getSKS() {
        return SKS;
    }

    public void setSKS(int sKS) {
        SKS = sKS;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
