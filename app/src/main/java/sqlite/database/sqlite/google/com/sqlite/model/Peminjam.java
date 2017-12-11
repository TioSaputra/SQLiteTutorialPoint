package sqlite.database.sqlite.google.com.sqlite.model;

/**
 * Created by tio on 12/11/17.
 */

public class Peminjam {

    private int id;
    private String nama;
    private int no_handphone;
    private String barang;

    public Peminjam(){

    }

    public Peminjam(int id, String nama, int no_handphone, String barang){
        this.id = id;
        this.nama = nama;
        this.no_handphone = no_handphone;
        this.barang = barang;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNo_handphone() {
        return no_handphone;
    }

    public void setNo_handphone(int no_handphone) {
        this.no_handphone = no_handphone;
    }

    public String getBarang() {
        return barang;
    }

    public void setBarang(String barang) {
        this.barang = barang;
    }
}
