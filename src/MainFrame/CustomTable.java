package MainFrame;

import Person.PostPerson;
import Stuff.PostAssets;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
/*
    INTERFACE INI ISI E METOT NGGO NGEDIT TABEL KARNA NGEDITNYA HARUS NGODING
    KAYA GANTI BACKGROUND HEADER NAMBAH DATA DLL
*/

public abstract interface CustomTable {
//    BUAT NGAMBIL MODEL TABEL BARIS E
    void rowsDataModel(DefaultTableCellRenderer rend);
//    BUAT PRINT DATA / PUSH KE BARIS BARU
//    OVERLOADING KARNA EMANG BUAT NGEPARINT DATA AJA
//    INI PERCOBAAN ANONYMOUS CLASS GADIPAKE
    void printData(DefaultTableModel tabel,Class<?> target);
//    NGEPRINT DATA DENGAN PARAM MODEL TABEL SAMA OBJEK ORANG
    void printData(DefaultTableModel tabel,PostPerson target);
//    NGEPRINT DATA PARAM MODEL TABEL SAMA OBJEK BARANG
    void printData(DefaultTableModel tabel,PostAssets target);
}
