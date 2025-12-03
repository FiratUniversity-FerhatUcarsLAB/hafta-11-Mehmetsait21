public class Exercise4_5 {

    public static void zoop(String fred, int bob) {
        System.out.println(fred);
        if (bob == 5) {
            ping("not ");
        } else {
            System.out.println("!");
        }
    }

    public static void main(String[] args) {
        int bizz = 5;
        int buzz = 2;
        zoop("just for", bizz);
        clink(2 * buzz);
    }

    public static void clink(int fork) {
        System.out.print("It's ");
        zoop("breakfast ", fork);
    }

    public static void ping(String strangStrung) {
        System.out.println("any " + strangStrung + "more ");
    }
}
Sıra,Metot Çerçevesi,Parametreler,Yerel Değişkenler
3,ping() (Aktif),"strangStrung: ""not """,Yok
2,zoop(),"fred: ""just for"", bob: 5",Yok
1,main(String[] args),args: (Dizi),"bizz: 5, buzz: 2" 

 Sıra,Metot Çerçevesi,Parametreler,Yerel Değişkenler
3,zoop() (Aktif),"fred: ""breakfast "", bob: 4",Yok
2,clink(),fork: 4,Yok
1,main(String[] args),args: (Dizi),"bizz: 5, buzz: 2"
cıktı 
    just for
any not more 
It's breakfast 
!
