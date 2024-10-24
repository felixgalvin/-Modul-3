package modul3.Model.classes;

import modul3.Model.enums.Status;
import java.sql.Date;
import java.time.LocalTime;

public class PresensiStaff {
    private Date tanggal;
    private Status status;
    private LocalTime jam;

    public PresensiStaff(Date tanggal, Status status, LocalTime jam) {
        this.tanggal = tanggal;
        this.status = status;
        this.jam = jam;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalTime getJam() {
        return jam;
    }

    public void setJam(LocalTime jam) {
        this.jam = jam;
    }
}
