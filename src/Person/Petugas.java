package Person;

//  KELAS PETUGAS UNTUK OBJEK PETUGAS
public final class Petugas {
    public String nama, id, alamat, kelamin,password;
//    SET PROPERTY DENGAN ARRAY DI KONSTRUKTOR BUAT INPUTIN STATIS 
//      INPUTNYA BUAT DI POST PERSON OBJEK PETUGAS DIMASUKKIN KE ARRAYLIST
    public Petugas(String[] listProp){
//        setProp();
        this.nama = listProp[0];
        this.id = listProp[1];
        this.alamat = listProp[2];
        this.kelamin = listProp[3];
        this.password = listProp[4];
    }
//    KALO TADI MAKE ARRAY INI MANUAL MAKE STRING TERSERAH TAPI NTAR MAKENYA YG ATAS
    public Petugas(String n, String i, String a, String k, String p){
//        setProp();
        this.nama = n;
        this.id = i;
        this.alamat = a;
        this.kelamin = k;
        this.password = p;
    }
    public void setProp(){}
}
