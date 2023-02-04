package HomeWork;

public class LoopsHomework04 {
    public static void main(String[] args) {

        boolean workDay=true;
        int day=1;

        while(workDay){
            System.out.println("I need a day off");
            day++;
            if(day>=6){
                System.out.println("I don't need a day off");
                workDay=false;
            }
        }



    }
}
