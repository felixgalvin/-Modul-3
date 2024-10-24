package modul3.Model.classes;

abstract class Staff extends User{
    private int NIK;

    public Staff(String nama, String alamat, String TTL, String telepon, int NIK) {
        super(nama, alamat, TTL, telepon);
        this.NIK = NIK;
    }

    public int getNIK() {
        return NIK;
    }

    public void setNIM(int NIK) {
        this.NIK = NIK;
    }

    @Override
    public String toString() {
        return super.toString() + ", NIK: " + getNIK();
    }
}
