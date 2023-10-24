public class Degiskenler {

    public static void main(String[] args) {
        System.out.println("değişkenler");
        final String kimlik="TC";
        String isim="ayşe";
        int yas=31; //tamsayı tipinde değişken
        double boy=1.67; // büyük ondalıklı sayılar
        float kilo= 81.5F; //küçük ondalıklı sayılar
        char cinsiyet='K'; // karakter tipinde
        boolean evliMi=false; //doğru ya da yanlış

        isim="Zeynep";
        kimlik="EU";

        System.out.println("Kişinin Uyruğu :"+kimlik);
        System.out.println("Kişinin Adı :"+isim);
        System.out.println("Kişinin Yaşı:"+yas);
        System.out.println("Kişinin Boyu:"+boy);
        System.out.println("Kişinin Kilosu:"+kilo);
        System.out.println("Kişinin Cinsiyeti:"+cinsiyet);
        System.out.println("Kişinin Medeni Durumu:"+evliMi);
    }
}
