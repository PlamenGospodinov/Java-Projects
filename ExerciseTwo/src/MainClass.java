public class MainClass {
    static int [][] initialArray = {{7, 8, 23, 3}, {721, 6, 29, 53}, {87, 455, 91, 57}};
    static public int[] columnSum(int [][] array){
        int index = 0;
        int temp[] = new int[array[index].length];

        for (int i = 0; i < array[0].length; i++){
            int sum = 0;

            for (int j = 0; j < array.length; j++){
                sum += array[j][i];

            }
            temp[index] = sum;
            System.out.println("Index is: " + index + " Sum is: "+sum);
            index++;

        }

        return temp;
    }

    public static void main(String[] args) {
        System.out.println(columnSum(initialArray));

    }
}
