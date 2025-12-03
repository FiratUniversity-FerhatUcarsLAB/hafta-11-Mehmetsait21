public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber();Metot calisir, 42 degerini uretir ancak bu deger hicbir degiskene
         atanmadigi veya kullanilmadigi icin hemen atilir goz ardi edilir.
        Program herhangi bir hata vermeden calismaya devam eder.


        

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7); Bu satir derleme hatasina neden olur.
         sayHello() metodu void hicbir deger dondurur. Java, void bir degeri
         +7 gibi bir ifade icinde kullanmaya calisirken bir tur (type) hatasi verir.
        Cunku 'void' bir degere sahip degildir.



            

        // Cevaplarinizi yorum olarak ekleyin.
    }
}
