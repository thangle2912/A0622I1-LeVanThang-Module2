package src.case_module2.models;

public class OTo extends PhuongTien{
    private int  soChoNgoi;
    private String loaiDongCo;

    public OTo() {
    }

    public OTo(String maPhuongTien, String tenPhuongTien, String hangSanXuat, int namSanXuat, String congSuat, String dungTich, int loaiPhuongTien, int soChoNgoi, String loaiDongCo) {
        super(maPhuongTien,
                tenPhuongTien,
                hangSanXuat,
                namSanXuat,
                congSuat,
                dungTich,
                loaiPhuongTien);
        this.soChoNgoi = soChoNgoi;
        this.loaiDongCo = loaiDongCo;
    }

    public OTo(String line) {
        String[] data = line.split(",");
        this.setMaPhuongTien(data[0]);
        this.setTenPhuongTien(data[1]);
        this.setHangSanXuat(data[2]);
        this.setNamSanXuat(Integer.parseInt(data[3]));
        this.setCongSuat(data[4]);
        this.setDungTich(data[5]);
        this.setLoaiPhuongTien(Integer.parseInt(data[6]));
        this.setSoChoNgoi(Integer.parseInt(data[7]));
        this.setLoaiDongCo(data[8]);
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getLoaiDongCo() {
        return loaiDongCo;
    }

    public void setLoaiDongCo(String loaiDongCo) {
        this.loaiDongCo = loaiDongCo;
    }

    @Override
    public String toString() {
        return super.toString()+ "OTo{" +
                "soChoNgoi=" + soChoNgoi +
                ", loaiDongCo='" + loaiDongCo + '\'' +
                '}';
    }
}
