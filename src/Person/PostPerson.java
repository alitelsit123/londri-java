package Person;
import StoreData.ParseData;
import java.util.ArrayList;
import java.util.Arrays;

/*  INI BUAT NAMPUNG ORANG KAYA PETUGAS SAMA PELANGGAN
*   JADI NAMPUNGNYA MAKE ARRAY TIPE OBJECT 
*   MAKENYA ARRAY LIST BIAR GAMPANG NAMBAH IN NYA
    IMPLEMENT PARSEDATA ITU NGGA JADI MAKE ITU
*/
public final class PostPerson implements ParseData{
//    INI DEKLARASI ARRAYLIST BUAT NAMPUNG OBJEK PERSON KAYA PETUGAS SAMA PELANGGAN
    public ArrayList<Petugas> petugas = new ArrayList(100);
    public ArrayList<Pelanggan> pelanggan = new ArrayList(100);
//    SET PETUGAS STATIS DENGAN ARRAY
    public void setPetugas(){
//        INI KELAS PETUGASNYA DIBIKIN ARRAY BATAS NYA 4
        Petugas[] listPetugas = new Petugas[4];
//        INI DEKLARASI DATA ARRAY TADI
        listPetugas[0] = new Petugas("Fariz", "1", "Yogyakarta", "Laki laki", "amikom");
        listPetugas[1] = new Petugas("Reja", "2", "Yogyakarta", "Laki laki", "amikom");
        listPetugas[2] = new Petugas("Lola", "3", "Yogyakarta", "Perempuan", "amikom");
        listPetugas[3] = new Petugas("Nanang", "4", "Yogyakarta", "Laki laki", "amikom");
//        MASUKIN DATA PETUGAS KE ARRAYLIST
        this.petugas.addAll(Arrays.asList(listPetugas));
    }
//    METHOD SET DATA PELANGGAN
    public void setPelanggan(Pelanggan p){
        this.pelanggan.add(p);
    }
    
    @Override
    public String[] parsePetugas() {return null;}
    @Override
    public String[] parsePelanggan() {return null;}
    @Override
    public String[] parseAsset() {return null;}
}
