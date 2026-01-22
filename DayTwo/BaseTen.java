public class BaseTen{
    public static void main(String[] args){

        System.out.println(convertToBaseTen(1010));
    }

    public static int convertToBaseTen(int number){

        String value = number + "";
        int baseTen = 0;

        if (number < 0){
            number *= -1;
        }

        for (int count = 0; count < value.length(); count++){
            baseTen += (number %  10) * Math.pow(2,count);
            number /= 10; 
        }
        return baseTen;
    }
}
