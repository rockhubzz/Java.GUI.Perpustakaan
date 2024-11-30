package backend;

import java.sql.ResultSet;
import java.util.ArrayList;


public class Peminjaman {
    private int idpeminjaman, idanggota, idbuku;
    private String tglPinjam, tglKembali;

    public Peminjaman() {
    }

    public Peminjaman(int idpeminjaman, int idanggota, int idbuku, String tglPinjam, String tglKembali) {
        this.idpeminjaman = idpeminjaman;
        this.idanggota = idanggota;
        this.idbuku = idbuku;
        this.tglPinjam = tglPinjam;
        this.tglKembali = tglKembali;
    }

    public int getIdpeminjaman() {
        return this.idpeminjaman;
    }

    public void setIdpeminjaman(int idpeminjaman) {
        this.idpeminjaman = idpeminjaman;
    }

    public int getIdanggota() {
        return this.idanggota;
    }

    public void setIdanggota(int idanggota) {
        this.idanggota = idanggota;
    }

    public int getIdbuku() {
        return this.idbuku;
    }

    public void setIdbuku(int idbuku) {
        this.idbuku = idbuku;
    }

    public String getTglPinjam() {
        return this.tglPinjam;
    }

    public void setTglPinjam(String tglPinjam) {
        this.tglPinjam = tglPinjam;
    }

    public String getTglKembali() {
        return this.tglKembali;
    }

    public void setTglKembali(String tglKembali) {
        this.tglKembali = tglKembali;
    }

    public Peminjaman getById(int id){
        Peminjaman pmj = new Peminjaman();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM peminjaman WHERE idpeminjaman = '"+id+"'");
        
        try{
            while(rs.next()){
                pmj = new Peminjaman();
                pmj.setIdpeminjaman(rs.getInt("idpeminjaman"));
                pmj.setIdanggota(rs.getInt("idanggota"));
                pmj.setIdbuku(rs.getInt("idbuku"));
                pmj.setTglPinjam(rs.getString("tanggalpinjam"));
                pmj.setTglKembali(rs.getString("tanggalkembali"));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return pmj;
    }
    
    public ArrayList<Peminjaman> getAll(){
        ArrayList<Peminjaman> ListPeminjaman = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM peminjaman");
        try{
            while(rs.next()){
                Peminjaman pmj = new Peminjaman();
                pmj.setIdpeminjaman(rs.getInt("idpeminjaman"));
                pmj.setIdanggota(rs.getInt("idanggota"));
                pmj.setIdbuku(rs.getInt("idbuku"));
                pmj.setTglPinjam(rs.getString("tanggalpinjam"));
                pmj.setTglKembali(rs.getString("tanggalkembali"));
                ListPeminjaman.add(pmj);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return ListPeminjaman;
    }
    

public void save(){
    if (getById(idpeminjaman).getIdpeminjaman() == 0) {
        // Corrected SQL syntax with proper quotes around date values
        String sql = "INSERT INTO peminjaman (idanggota, idbuku, tanggalpinjam, tanggalkembali) VALUES ('"
                + this.idanggota + "', '"
                + this.idbuku + "', '"
                + this.tglPinjam + "', '"
                + this.tglKembali + "')";
        this.idpeminjaman = DBHelper.insertQueryGetId(sql);
    } else {
        String sql = "UPDATE peminjaman SET idanggota = '"
                + this.idanggota + "', idbuku = '"
                + this.idbuku + "', tanggalpinjam = '"
                + this.tglPinjam + "', tanggalkembali = '"
                + this.tglKembali + "' WHERE idpeminjaman = '"
                + this.idpeminjaman + "'";
        DBHelper.executeQuery(sql);
    }
}

    public void delete(){
        String sql = "DELETE FROM peminjaman WHERE idpeminjaman = '"+this.idpeminjaman+"'";
        DBHelper.executeQuery(sql);
    }

}
