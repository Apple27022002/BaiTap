package Human;

public class QuanLySinhVien implements QuanLy<SinhVien>{
    private SinhVien[] danhSach=new SinhVien[20];
    private int size =0;

    @Override
    public void them(SinhVien sinhVien) {
        danhSach[size]=sinhVien;
        size++;

    }

    @Override
    public void sua(String name, SinhVien sinhVien) {
        danhSach[timKiem(name)]=sinhVien;

    }

    @Override
    public void hienThi() {
        for (int t=0 ;t<size;t++){
            System.out.println(danhSach[t]);
        }
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

    }

    @Override
    public int timKiem(String name) {
        for (int l=0;l<size;l++){
            if(danhSach[l].getTen().equals(name)){
                System.out.println("Vi tri sinh vien la "+l);
                return l;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        QuanLySinhVien ql=new QuanLySinhVien();
        SinhVien sv1 =new SinhVien(54,"Nam",21,9);
        SinhVien sv2 =new SinhVien(69,"Long",22,7);
        SinhVien sv3 =new SinhVien(59,"linh",19,10);
        ql.them(sv1);
        ql.them(sv2);
        ql.them(sv3);
        ql.hienThi();
        SinhVien sv4 =new SinhVien(55,"Tam",19,8);
        ql.sua("Long",sv4);
        ql.hienThi();
    }
}

