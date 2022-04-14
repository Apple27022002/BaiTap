package Human;

public abstract class Nguoi {
    private int ma;
    private String ten;
    private int age;
    public Nguoi(){}

    public Nguoi(int ma, String ten, int age) {
        this.ma = ma;
        this.ten = ten;
        this.age = age;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "ma=" + ma +
                ", ten='" + ten + '\'' +
                ", age=" + age +
                '}';
    }
}
