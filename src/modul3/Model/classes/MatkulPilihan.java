package modul3.Model.classes;

public class MatkulPilihan extends MataKuliah {
    private int jumlahMinimum;

    public MatkulPilihan(String kode, int SKS, String nama, int jumlahMinimum) {
        super(kode, SKS, nama);
        this.jumlahMinimum = jumlahMinimum;
    }

    public int getJumlahMinimum() {
        return jumlahMinimum;
    }

    public void setJumlahMinimum(int jumlahMinimum) {
        this.jumlahMinimum = jumlahMinimum;
    }
}
