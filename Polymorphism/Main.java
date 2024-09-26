public class Main { 
    public static void main(String[] args) {
        // Membuat objek Handphone
        Handphone hp = new Handphone("Asus", "Zenfone 1");
        hp.nyalakan();
        hp.kirimPesan("08123456789", "Halo, ini pesan dari Handphone.");
        hp.kirimPesan("089523218965", "0812853329122", "Pesan dari Handphone.");
        hp.matikan();
        
        System.out.println();

        // Membuat objek Smartphone
        Smartphone smartphone = new Smartphone("Poco", "X3 Pro");
        smartphone.nyalakan();
        smartphone.kirimPesan("0895383321212","Halo, ini pesan dari Smartphone.");
        smartphone.kirimPesan("zidanferdian32@gmail.com", "PBO Teori", "Ini pesan untuk email.");
        smartphone.aksesInternet();
        smartphone.matikan();
        
        System.out.println();

        // Membuat objek FeaturePhone
        FeaturePhone featurePhone = new FeaturePhone("Nokia", "999");
        featurePhone.nyalakan();
        featurePhone.mainGameSnake();
        featurePhone.matikan();
    }
}
