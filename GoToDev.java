public class GoToDev {
    private String nama;
    private boolean gender;
    private double tanggalLahir;
    private double pendapatan;
    private double tanggalMasuk;
    private String project;

    public GoToDev(String nama, boolean gender, double tanggalLahir, double pendapatan, double tanggalMasuk, String project) {
        this.nama = nama;
        this.gender = gender;
        this.tanggalLahir = tanggalLahir;
        this.pendapatan = pendapatan;
        this.tanggalMasuk = tanggalMasuk;
        this.project = project;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void getGender() {
        if (gender) {
            System.out.println("Laki-Laki");
        } else System.out.println("Perempuan");
    }
    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public double getTanggalLahir() {
        return tanggalLahir;
    }
    public void setTanggalLahir(double tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public double getPendapatan() {
        return pendapatan;
    }
    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    public double getTanggalMasuk() {
        return tanggalMasuk;
    }
    public void setTanggalMasuk(double tanggalMasuk) {
        this.tanggalMasuk = tanggalMasuk;
    }

    public String getProject() {
        return project;
    }
    public void setProject(String project) {
        this.project = project;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Nama : " + getNama()
                +"Gender : " + getGender()+
                "";
    }
}