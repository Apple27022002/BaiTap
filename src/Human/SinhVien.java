package Human;

public class SinhVien extends Nguoi{
    private int diem;
    public SinhVien(){}


    public SinhVien(int ma, String ten, int age, int diem) {
        super(ma, ten, age);
        this.diem = diem;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "SinhVien{" +" Sinh viên tên là "+getTen()+
                " , tuổi sv là "+getAge()+
                " , Có mã sv là "+getMa()+
                " có điểm là = " + diem +
                '}';
    }
}
