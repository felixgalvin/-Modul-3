package modul3.Model.classes;
import modul3.Model.interfaces.Action;;

abstract class User implements Action{
    private String nama;
    private String alamat;
    private String TTL;
    private String telepon;
    
    public User(String nama, String alamat, String TTL, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.TTL = TTL;
        this.telepon = telepon;
    }

    public String getName() {
        return nama;
    }

    public void setName(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTTL() {
        return TTL;
    }

    public void setTTL(String TTL) {
        this.TTL = TTL;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    @Override
    public String toString() {
        return "Nama: " + getName() + ", Alamat: " + getAlamat() + ", TTL: " + getTTL() + ", Telepon: " + getTelepon();
    }
}
