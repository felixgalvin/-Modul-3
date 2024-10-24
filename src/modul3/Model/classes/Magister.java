package modul3.Model.classes;

import java.util.ArrayList;

public class Magister extends Mahasiswa{
    private ArrayList<MatkulAmbil> mataKuliah;
    private String judulTesis;

    public Magister(String nama, String alamat, String TTL, String telepon, int NIM, String jurusan, ArrayList<MatkulAmbil> mataKuliah, String judulTesis) {
        super(nama, alamat, TTL, telepon, NIM, jurusan);
        this.mataKuliah = mataKuliah;
        this.judulTesis = judulTesis;
    }

    public ArrayList<MatkulAmbil> getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(ArrayList<MatkulAmbil> mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public String getJudulTesis() {
        return judulTesis;
    }

    public void setJudulTesis(String judulTesis) {
        this.judulTesis = judulTesis;
    }

    @Override
    public String toString() {
        return super.toString() + ", List Matakuliah: " + getMataKuliah() + ", Judul Tesis: " + getJudulTesis();
    }
}
