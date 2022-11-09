package src.case_module2.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GiayDangKy {
    private String soDangKy;
    private String tenChuXe;
    private Date ngayDangKy;
    private String maPhuongTien;


    public GiayDangKy() {
    }


    public GiayDangKy(String soDangKy, String tenChuXe, Date ngayDangKy, String maPhuongTien) {
        this.soDangKy = soDangKy;
        this.tenChuXe = tenChuXe;
        this.ngayDangKy = ngayDangKy;
        this.maPhuongTien = maPhuongTien;
    }

    public GiayDangKy(String line){
        String[] data = line.split(",");
        setSoDangKy(data[1]);
        setTenChuXe(data[2]);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try {
            date = format.parse(data[3]);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        setNgayDangKy(date);
        setMaPhuongTien(data[4]);
    }
    public String getInfo(){
        Date date = new Date();
        date = this.ngayDangKy;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = formatter.format(date);
        return this.soDangKy+","+this.tenChuXe+","+strDate+","+this.maPhuongTien;
    }

    @Override
    public String toString() {
        return "GiayDangKy{" +
                "soDangKy='" + soDangKy + '\'' +
                ", tenChuXe='" + tenChuXe + '\'' +
                ", ngayDangKy=" + ngayDangKy +
                ", maPhuongTien='" + maPhuongTien + '\'' +
                '}';
    }

    public String getSoDangKy() {
        return soDangKy;
    }

    public void setSoDangKy(String soDangKy) {
        this.soDangKy = soDangKy;
    }

    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public Date getNgayDangKy() {
        return ngayDangKy;
    }

    public void setNgayDangKy(Date ngayDangKy) {
        this.ngayDangKy = ngayDangKy;
    }

    public String getMaPhuongTien() {
        return maPhuongTien;
    }

    public void setMaPhuongTien(String maPhuongTien) {
        this.maPhuongTien = maPhuongTien;
    }
}
