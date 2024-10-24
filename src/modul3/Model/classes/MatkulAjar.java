package modul3.Model.classes;

import java.util.ArrayList;

import modul3.Model.interfaces.Action;

public class MatkulAjar implements Action{
    private MataKuliah mataKuliah;
    private ArrayList<PresensiStaff> presensiStaff = new ArrayList<>();

    public MatkulAjar(MataKuliah mataKuliah, ArrayList<PresensiStaff> presensiStaff) {
        this.mataKuliah = mataKuliah;
        this.presensiStaff = presensiStaff;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public ArrayList<PresensiStaff> getPresensiStaff() {
        return presensiStaff;
    }
    
    public void setPresensiStaff(ArrayList<PresensiStaff> presensiStaff) {
        this.presensiStaff = presensiStaff;
    }

    public String toString() {
        return "Matakuliah: " + getMataKuliah() + ", Presensi Staff: " + getPresensiStaff();
    }
}
