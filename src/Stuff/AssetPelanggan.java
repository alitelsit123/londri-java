package Stuff;

import Person.Pelanggan;

//  INI KELAS BARANG
public final class AssetPelanggan extends Pelanggan{
    public String kode_barang, berat_barang, jenis_barang, nama_petugas, total_bayar;
//    MASUKIN LANGSUNG DATA PELANGGAN KE DATA BARANG
    public AssetPelanggan(Pelanggan p){
        this.setNama(p.nama);
        this.setId(p.id);
        this.setAlamat(p.alamat);
        this.setKode_Barang(p.kode_barang);
        this.setTotal_Bayar(total_bayar);
    }
//    SET SET
    public void setJenis_Barang(String j){
        this.jenis_barang = j;
    }
    public void setBeratBarang(String b){
        this.berat_barang = b;
    }
    public void setNama_Petugas(String n){
        this.nama_petugas = n;
    }
    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }
    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    @Override
    public void setKode_Barang(String n){
        this.kode_barang = n;
    }
    public void setTotal_Bayar(String n){
        this.total_bayar = n;
    }
}
