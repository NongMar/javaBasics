package HomeWork;

public class ArrayHomeWork03 {
    public static void main(String[] args) {

        String[] names={"John","George","Paul","Ringo","Marcin"};

        for(int i=0;i<names.length;i++){
            if(names[i].equals("Marcin")){
                System.out.println(names[i]);
            }
        }

        String[] n= new String[5];

        n[0]="John";
        n[1]="George";
        n[2]="Paul";
        n[3]="Ringo";
        n[4]="Marcin";


        for(String name:n){
           if(name.equals("Marcin")){
               System.out.println(name);
           }


        }




    }

}
