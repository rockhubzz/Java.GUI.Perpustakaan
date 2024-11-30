package backend;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Anggota {
    private int idanggota;
    private String nama, alamat, telepon;

    public Anggota() {
    }

    public Anggota(int idanggota, String nama, String alamat, String telepon) {
        this.idanggota = idanggota;
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    public int getIdanggota() {
        return this.idanggota;
    }

    public void setIdanggota(int idanggota) {
        this.idanggota = idanggota;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return this.telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public Anggota getById(int id){
        Anggota ang = new Anggota();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM anggota WHERE idanggota = '"+id+"'");
        
        try{
            while(rs.next()){
                ang = new Anggota();
                ang.setIdanggota(rs.getInt("idanggota"));
                ang.setNama(rs.getString("nama"));
                ang.setAlamat(rs.getString("alamat"));
                ang.setTelepon(rs.getString("telepon"));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return ang;
    }
    
    public ArrayList<Anggota> getAll(){
        ArrayList<Anggota> ListAnggota = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM anggota");
        try{
            while(rs.next()){
                Anggota ang = new Anggota();
                ang.setIdanggota(rs.getInt("idanggota"));
                ang.setNama(rs.getString("nama"));
                ang.setAlamat(rs.getString("alamat"));
                ang.setTelepon(rs.getString("telepon"));
                ListAnggota.add(ang);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return ListAnggota;
    }

    public ArrayList<Anggota> search(String keyword){
        ArrayList<Anggota> ListAnggota = new ArrayList<Anggota>();
        String sql = "SELECT * FROM anggota WHERE nama LIKE '%"+keyword+"%'";
        ResultSet rs = DBHelper.selectQuery(sql);
        try{
            while(rs.next()){
                Anggota ang = new Anggota();
                ang.setIdanggota(rs.getInt("idanggota"));
                ang.setNama(rs.getString("nama"));
                ang.setAlamat(rs.getString("alamat"));
                ang.setTelepon(rs.getString("telepon"));
                ListAnggota.add(ang);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return ListAnggota;
    }

    public void save(){
        if(getById(idanggota).getIdanggota() == 0){
            String sql = "INSERT INTO anggota (nama, alamat, telepon) VALUES('"+this.nama+"', '"+this.alamat+"', '"+this.telepon+"')";
            this.idanggota = DBHelper.insertQueryGetId(sql);
        }else{
            String sql = "UPDATE kategori SET nama = '"+this.nama+"', alamat = '"+this.alamat+"', telepon = '"+this.telepon+"' WHERE idanggota = '"+this.idanggota+"'";
            DBHelper.executeQuery(sql);
        }
    }

    public void delete(){
        String sql = "DELETE FROM anggota WHERE idanggota = '"+this.idanggota+"'";
        DBHelper.executeQuery(sql);
    }
}
