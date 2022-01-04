import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your array separated by ,");
        String str = myObj.nextLine();
        String items[] = str.split(",");
        int ent[] = new int[items.length];
        for(int i=0;i<items.length;i++){
            try{
                ent[i] = Integer.parseInt(items[i]);
                System.out.println("#"+i+": "+ent[i]);
            }catch(NumberFormatException e){
                System.out.println("Problem with parsing!");
            }
        }
        int maxElement = ent[0];
        for(int element : ent){
            if(element > maxElement){
                maxElement = element;
            }
        }
        int counter = 0;
        for(int element : ent){
            if(element == maxElement){
                counter++;
            }
        }

        System.out.println("The number of elements in the array equal to the biggest number are: "+ counter);
    }
}
