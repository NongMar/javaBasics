package WeekdayClassTuesday24;

public class ReplaceAllMethodDemo {
    public static void main(String[] args) {
        String str="kdjAKDKDJjdhkjhaHDHKAJhkjdhAHJ378HDJHkjdhsDJ17648928362718@&*^#*(@#*@*&*!&^#&^$";
        System.out.println(str.replaceAll("[A-Z]","#"));
        System.out.println(str.replaceAll("[a-z]","@"));
        System.out.println(str.replaceAll("[0-9]","!"));
        System.out.println(str.replaceAll("[A-Za-z]","#"));
        System.out.println(str.replaceAll("[A-Za-z0-9]","@"));
        System.out.println(str.replaceAll("[^A-Za-z0-9]","%"));//^ not












        //End
    }
}
