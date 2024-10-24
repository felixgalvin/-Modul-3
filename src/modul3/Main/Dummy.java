package modul3.Main;

import java.util.ArrayList;
import java.sql.Date;
import java.time.LocalTime;

import modul3.Model.classes.*;
import modul3.Model.enums.Status;

public class Dummy {
    public static void main(String[] args) {

        //=========================================================== DUMMY MAHASISWA ===========================================================

        // Data Dummy class Presensi
        ArrayList<Presensi> presensiList = new ArrayList<>();
        presensiList.add(new Presensi(Date.valueOf("2024-10-01"), 1)); 
        presensiList.add(new Presensi(Date.valueOf("2024-09-02"), 0)); 
        presensiList.add(new Presensi(Date.valueOf("2024-10-03"), 1)); 
        presensiList.add(new Presensi(Date.valueOf("2024-11-04"), 1)); 
        presensiList.add(new Presensi(Date.valueOf("2024-10-05"), 0));

        ArrayList<Presensi> presensiList2 = new ArrayList<>();
        presensiList2.add(new Presensi(Date.valueOf("2024-10-01"), 0));
        presensiList2.add(new Presensi(Date.valueOf("2024-10-08"), 1));
        presensiList2.add(new Presensi(Date.valueOf("2024-10-15"), 1));
        presensiList2.add(new Presensi(Date.valueOf("2024-12-23"), 1)); 
        presensiList2.add(new Presensi(Date.valueOf("2024-11-14"), 1)); 

        // Data Dummy class mata kuliah SARJANA
        MataKuliah mataKuliah = new MataKuliah("CS101", 3, "Introduction to Computer Science");
        MataKuliah mataKuliah2 = new MataKuliah("CS102", 4, "Data Structures");
        MataKuliah mataKuliah3 = new MatkulPilihan("CS103", 2, "AI", 15); //matkul pilihan

        ArrayList<MatkulAmbil> matkulAmbilSarjana = new ArrayList<>();
        matkulAmbilSarjana.add(new MatkulAmbil(mataKuliah, presensiList, 80, 88, 78));
        matkulAmbilSarjana.add(new MatkulAmbil(mataKuliah2, presensiList, 88, 81, 98));
        matkulAmbilSarjana.add(new MatkulAmbil(mataKuliah3, presensiList2, 90, 58, 78));

        // Data Dummy class SARJANA
        ArrayList<Sarjana> sarjana = new ArrayList<>();
        sarjana.add(new Sarjana("Felix", "TKI", "Bandung, 20 September 2004", "09474657676", 1123042, "Informatika", matkulAmbilSarjana));
        sarjana.add(new Sarjana("Calvin", "Holis", "Bandung, 24 September 2004", "0947454577676", 1123040, "Sistem Informasi", matkulAmbilSarjana));
        sarjana.add(new Sarjana("Bryan", "Mekar Wangi", "Bandung, 27 September 2004", "08375757676", 1123041, "MIT", matkulAmbilSarjana));

        // Data Dummy class mata kuliah MAGISTER
        MataKuliah mataKuliah4 = new MataKuliah("CS202", 2, "Software Engineering");
        MataKuliah mataKuliah5 = new MataKuliah("CS301", 3, "Database Systems");
        MataKuliah mataKuliah6 = new MatkulPilihan("CS304", 3, "SI", 15); //matkul pilihan

        ArrayList<MatkulAmbil> matkulAmbilMagister = new ArrayList<>();
        matkulAmbilMagister.add(new MatkulAmbil(mataKuliah4, presensiList, 80, 88, 78));
        matkulAmbilMagister.add(new MatkulAmbil(mataKuliah5, presensiList2, 88, 88, 98));
        matkulAmbilMagister.add(new MatkulAmbil(mataKuliah6, presensiList2, 91, 78, 79));

        // Data Dummy class MAGISTER
        ArrayList<Magister> magister = new ArrayList<>();
        magister.add(new Magister("Alex", "TKI", "Bandung, 28 September 2004", "087454577676", 1123045, "Informatika", matkulAmbilMagister, "Aplikasi terhadap kehidupan"));
        magister.add(new Magister("Boston", "TKI", "Bandung, 29 September 2004", "0847554577676", 1123042, "MIT", matkulAmbilMagister, "Pengaruh dodol terhadap laptop"));
        magister.add(new Magister("Pol", "Husein", "Bandung, 21 September 2004", "083743577676", 1123043, "DKV", matkulAmbilMagister, "Pengaruh beasiswa terhadap ekonomi"));

        // Data Dummy class DOKTOR
        ArrayList<Doktor> doktor = new ArrayList<>();
        doktor.add(new Doktor("Juvi", "TKI", "Bandung, 22 September 2004", "08743577676", 1123645, "Informatika", "Pengaruh IF terhadap ini",56, 90, 80));
        doktor.add(new Doktor("Rich", "Kopo", "Bandung, 23 September 2004", "08744357676", 1123055, "Sistem Informasi", "Pencit muka", 70, 80, 70));
        doktor.add(new Doktor("Felc", "Babakan", "Bandung, 24 September 2004", "08745457676", 1123049, "MIT", "Praise the Lord", 90, 80, 80));
        
        //=========================================================== DUMMY STAFF ===========================================================

        // Data Dummy class PresensiStaff
        ArrayList<PresensiStaff> presensiStaffList = new ArrayList<>();
        presensiStaffList.add(new PresensiStaff(Date.valueOf("2024-10-01"), Status.ALPHA, LocalTime.of(8, 30)));  
        presensiStaffList.add(new PresensiStaff(Date.valueOf("2024-10-02"), Status.HADIR, LocalTime.of(9, 0)));    
        presensiStaffList.add(new PresensiStaff(Date.valueOf("2024-10-03"), Status.ALPHA, LocalTime.of(8, 0))); 
        presensiStaffList.add(new PresensiStaff(Date.valueOf("2024-10-04"), Status.ALPHA, LocalTime.of(7, 45)));  
        presensiStaffList.add(new PresensiStaff(Date.valueOf("2024-10-05"), Status.HADIR, LocalTime.of(9, 15)));   

        ArrayList<PresensiStaff> presensiStaffList2 = new ArrayList<>();
        presensiStaffList2.add(new PresensiStaff(Date.valueOf("2024-10-01"), Status.ALPHA, LocalTime.of(8, 30)));  
        presensiStaffList2.add(new PresensiStaff(Date.valueOf("2024-11-02"), Status.HADIR, LocalTime.of(9, 0)));    
        presensiStaffList2.add(new PresensiStaff(Date.valueOf("2024-12-13"), Status.ALPHA, LocalTime.of(8, 0))); 
        presensiStaffList2.add(new PresensiStaff(Date.valueOf("2024-10-08"), Status.HADIR, LocalTime.of(7, 45)));  
        presensiStaffList2.add(new PresensiStaff(Date.valueOf("2024-11-25"), Status.HADIR, LocalTime.of(9, 15)));   

        // Data Dummy class Karyawan
        ArrayList<Karyawan> karyawan = new ArrayList<>();
        karyawan.add(new Karyawan("Stefan", "TKI", "Bandung, 25 September 2004", "09347535737", 29174, 1000000, presensiStaffList));
        karyawan.add(new Karyawan("Shoosh", "Kopo", "Bandung, 26 September 2004", "0836436472", 275940, 2000000, presensiStaffList));
        karyawan.add(new Karyawan("Wistard", "Rahayu", "Bandung, 30 September 2004", "0825252343", 38473, 1500000, presensiStaffList2));

        // Data Dummy class Matkul Diajar
        ArrayList<MatkulAjar> MatkulAjars1 = new ArrayList<>();
        ArrayList<MatkulAjar> MatkulAjars2 = new ArrayList<>();
        ArrayList<MatkulAjar> MatkulAjars3 = new ArrayList<>();

        MatkulAjars1.add(new MatkulAjar(mataKuliah, presensiStaffList));
        MatkulAjars1.add(new MatkulAjar(mataKuliah2, presensiStaffList2));
        MatkulAjars1.add(new MatkulAjar(mataKuliah3, presensiStaffList));       

        MatkulAjars2.add(new MatkulAjar(mataKuliah4, presensiStaffList2));
        MatkulAjars2.add(new MatkulAjar(mataKuliah5, presensiStaffList2));
        MatkulAjars2.add(new MatkulAjar(mataKuliah6, presensiStaffList));  

        MatkulAjars3.add(new MatkulAjar(mataKuliah2, presensiStaffList));
        MatkulAjars3.add(new MatkulAjar(mataKuliah4, presensiStaffList2));
        MatkulAjars3.add(new MatkulAjar(mataKuliah6, presensiStaffList2));
       
        // Data Dummy class Dosen Tetap
        ArrayList<DosenTetap> dosenTetap = new ArrayList<>();
        dosenTetap.add(new DosenTetap("Molly", "TKI", "Bandung, 01 September 2003", "08736364455", 3847365, "Informatika", MatkulAjars1, 2000000));
        dosenTetap.add(new DosenTetap("Benny", "Husein", "Bandung, 11 September 2003", "08567364455", 3847945, "Sistem Informasi", MatkulAjars2, 3000000));
        dosenTetap.add(new DosenTetap("Sam", "Aruna", "Bandung, 21 September 2003", "08775364455", 3347365, "MIT", MatkulAjars3, 2000000));

        // Data Dummy class Dosen Honorer
        ArrayList<DosenHonorer> dosenHonorer = new ArrayList<>();
        dosenHonorer.add(new DosenHonorer("Larry", "TKI", "Bandung, 19 September 2004", "08274837534", 3328473, "Informatika", MatkulAjars1, 250000));
        dosenHonorer.add(new DosenHonorer("Bird", "Rahayu", "Bandung, 12 September 2004", "082748457534", 33245773, "Sistem Informasi", MatkulAjars2, 250000));
        dosenHonorer.add(new DosenHonorer("Awesmy", "TKI", "Bandung, 16 September 2004", "082359337534", 333535473, "MIT", MatkulAjars3, 250000));

        
        System.out.println(dosenHonorer.get(0).toString());
    }
}
