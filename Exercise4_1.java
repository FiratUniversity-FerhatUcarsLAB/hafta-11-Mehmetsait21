
public class SimpleDateFormatter {

   
    public static void printAmerican(String day, String month, int date, int year) {
        
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }


    public static void printEuropean(String day, String month, int date, int year) {
        
        System.out.println(date + " " + month + " " + year + ", " + day + ".");
    }

    public static void main(String[] args) {
        String day = "Monday";
        String month = "July";
        int date = 22;
        int year = 2019;

        System.out.println("Amerikan Formatı:");
        printAmerican(day, month, date, year);

        System.out.println("Avrupa Formatı:");
        printEuropean(day, month, date, year);
    }
}
cıktı 
    merikan Format?:
Monday, July 22, 2019

Avrupa Format?:
22 July 2019, Monday.
