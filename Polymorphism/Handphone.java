public class Handphone {
    protected String merk;
    protected String model;

    public Handphone(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }

    public void nyalakan() {
        System.out.println("Handphone dinyalakan.");
    }

    public void matikan() {
        System.out.println("Handphone dimatikan.");
    }

    public void kirimPesan(String nomorTujuan, String pesan) {
        System.out.println("Mengirim pesan ke nomor " + nomorTujuan);
    }

    public void kirimPesan(String nomorTujuan1, String nomorTujuan2, String pesan){
        System.out.println("Mengirim Pesan Ke nomor tujuan 1 " + nomorTujuan1);
        System.out.println("Mengirim pesan ke nomor tujuan 2 " + nomorTujuan2);
    }

    public void kirimPesan(String[] daftarNomor, String pesan){
        System.out.println("Mengirim Pesan");
    }


}