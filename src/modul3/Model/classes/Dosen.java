package modul3.Model.classes;

import java.util.ArrayList;

abstract class Dosen extends Staff{
    private String dapartemen;
    private ArrayList<MatkulAjar> listMatkul;

    public Dosen(String nama, String alamat, String TTL, String telepon, int NIK, String dapartemen, ArrayList<MatkulAjar> listMatkul) {
        super(nama, alamat, TTL, telepon, NIK);
        this.dapartemen = dapartemen;
        this.listMatkul = listMatkul;
    }

    public String getDapartemen() {
        return dapartemen;
    }

    public void setDapartemen(String dapartemen) {
        this.dapartemen = dapartemen;
    }

    public ArrayList<MatkulAjar> getListMatkul() {
        return listMatkul;
    }

    public void setListMatkul(ArrayList<MatkulAjar> listMatkul) {
        this.listMatkul = listMatkul;
    }

    @Override
    public String toString() {
        return super.toString() + "Dapartemen: " + getDapartemen() + ", List Matakuliah: " + getListMatkul();
    }
}
