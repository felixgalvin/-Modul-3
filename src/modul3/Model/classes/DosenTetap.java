package modul3.Model.classes;

import java.util.ArrayList;

public class DosenTetap extends Dosen{
    private int salary;

    public DosenTetap(String nama, String alamat, String TTL, String telepon, int NIK, String dapartemen, ArrayList<MatkulAjar> listMatkul, int salary) {
        super(nama, alamat, TTL, telepon, NIK, dapartemen, listMatkul);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "Salary: " + getSalary();
    }
}
