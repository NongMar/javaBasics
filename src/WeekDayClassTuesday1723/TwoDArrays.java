package WeekDayClassTuesday1723;

public class TwoDArrays {
    public static void main(String[] args) {
        String[][] Train=new String[3][3];
        String[] cabin0={"Bob","Tom","Don"};
        String[] cabin1={"Will","John","Frank"};
        String[] cabin2={"Hank","Josh","Sam"};

        Train[0]=cabin0;
        Train[1]=cabin1;
        Train[2]=cabin2;
        System.out.println(Train[1][2]);
    }
}
