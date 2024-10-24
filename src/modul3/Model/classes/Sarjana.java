package modul3.Model.classes;

import java.util.ArrayList;

public class Sarjana extends Mahasiswa{
    private ArrayList<MatkulAmbil> mataKuliah;

    public Sarjana(String nama, String alamat, String TTL, String telepon, int NIM, String jurusan, ArrayList<MatkulAmbil> mataKuliah) { 
        super(nama, alamat, TTL, telepon, NIM, jurusan);
        this.mataKuliah = mataKuliah;
    }
    
    public ArrayList<MatkulAmbil> getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(ArrayList<MatkulAmbil> mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", List Matakuliah: " + getMataKuliah();
    }
}
