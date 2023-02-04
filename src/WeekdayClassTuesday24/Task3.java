package WeekdayClassTuesday24;

public class Task3 {
    public static void main(String[] args) {

      String dadName="John";
      String momName="Yoko";
      String expect="Girl";
      String firstHalf="";
      String secondHalf="";

      if(expect.equalsIgnoreCase("boy")){
         firstHalf=dadName.substring(0,dadName.length()/2);
         secondHalf=momName.substring(momName.length()/2);

      }else{
          firstHalf=momName.substring(0,momName.length()/2);
          secondHalf=dadName.substring(dadName.length()/2);

      }
        System.out.println(firstHalf+secondHalf);







    }
}
