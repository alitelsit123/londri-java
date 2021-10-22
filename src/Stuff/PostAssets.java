package Stuff;

import StoreData.ParseData;
import java.util.ArrayList;

/*  INI BUAT NAMPUNG DATA DATA BARANG KITA MAUPUN BARANG PELANGGAN
*   JADI NAMPUNGNYA MAKE ARRAY TIPE OBJECT 
*   MAKENYA ARRAY LIST BIAR GAMPANG NAMBAH IN NYA
*/
public class PostAssets implements ParseData{
//    ARAYLIST TIPENYA OBJEK ASSET PELANGGAN
    public ArrayList<AssetPelanggan> asset_pelanggan = new ArrayList(50);
//    SET BARANG NYA DISINI DIMASUKKIN KE ARRAYLIST
    public void setAssetPelanggan(AssetPelanggan p){
        this.asset_pelanggan.add(p);
    }
    @Override
    public String[] parsePetugas() {return null;}

    @Override
    public String[] parsePelanggan() {return null;}

    @Override
    public String[] parseAsset() {return null;}
    
}
