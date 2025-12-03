public class Exercise4_3 {

    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }

    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }

    public static void baffle() {
        System.out.print("wug");
        ping();
    }

    public static void ping() {
        System.out.println(".");
    }
}
Satır No,Metot,Komut,Çıktı Akışı
7,main,(Başlangıç),
8,main,"System.out.print ( "" No , I "" ) ;","No, I"
9,main,zoop () ; → Satır 2,
2,zoop,baffle () ; → Satır 15,
15,baffle,"System.out.print ( "" wug "" ) ;","No, I wug"
16,baffle,ping () ; → Satır 20,
20,ping,"System.out.println ( "" . "" ) ;","No, I wug . (Satır sonu)"
17,baffle,(Bitti) → Satır 3,
3,zoop,"System.out.print ( "" You wugga "" ) ;",You wugga
4,zoop,baffle () ; → Satır 15,
15,baffle,"System.out.print ( "" wug "" ) ;",You wugga wug
16,baffle,ping () ; → Satır 20,
20,ping,"System.out.println ( "" . "" ) ;",You wugga wug . (Satır sonu)
17,baffle,(Bitti) → Satır 5,
5,zoop,(Bitti) → Satır 10,
10,main,"System.out.print ( "" I "" ) ;",I
11,main,baffle () ; → Satır 15,
15,baffle,"System.out.print ( "" wug "" ) ;",I wug
16,baffle,ping () ; → Satır 20,
20,ping,"System.out.println ( "" . "" ) ;",I wug . (Satır sonu)
17,baffle,(Bitti) → Satır 12,
12,main,(Bitti),

cıktı 
    No, I wug .
You wugga wug .
I wug .
