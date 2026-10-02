public class array1 {
    public static void main(String[]args)
    {
        // int[] number;            // declaration
        // number = new int [10];   // creation

        int[] number = new int[10];   // declaration and creation
        
        // array initialize 
        number[0] = 10;         
        number[1] = 20;
        number[2] = 30;
        number[3] = 40;
        number[4] = 50;

        int len = number.length;

        int sum = 0;

        for(int i=0 ; i<len ; i++)
        {
            sum += number[i];
        }

        System.out.println("Sum : "+sum);
    }
}
