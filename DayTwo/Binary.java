public class Binary{
    public static void main(String[] args){

        System.out.println(getBinary(1000));
    }

    public static String getBinary(int number){

        int numberOne = 0;
        int numberTwo = 0;
        int numberThree = 0;
        String store = "";
        int originalNumber = Math.abs(number);
        int length = Math.abs(number);

        if (number == 0){
            return "0";
        }
    
        for (int count = 0; count < length; count++){
            numberOne = originalNumber / 2;
            numberTwo = numberOne * 2;
            numberThree = originalNumber - numberTwo;

            store += numberThree + "";

            if (numberOne == 0){
                break;   
            }  
            originalNumber = numberOne;
        }

        String reverse = "";
        for (int index = store.length() - 1; index >= 0; index--){
            reverse += store.charAt(index);
        }
    
        return reverse;
    }
}
