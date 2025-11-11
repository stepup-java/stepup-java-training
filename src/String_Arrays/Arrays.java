package String_Arrays;

public class Arrays {
    public static void main(String []args) {
        int[] numbers={10,20,30};
        int[] number2=new int[3];//read
        System.out.println(number2[0]);
        number2[0]=100;            //update
        System.out.println(number2[0]);
        number2[10]=500;       //exception outof index
        System.out.println(number2[10]);

        try{
            //risky code that can throw exception
        int a=10/0;
        }
        catch(ArithmeticException ae){
            //handling code for exception
            System.out.println("Exception occurred:"+ae.getMessage());

        }

        catch(Exception e){
            //handling code for exception
            System.out.println("Exception occurred:"+e.getMessage());

        }
        finally{
            //finally is always execute
            System.out.println("this block always executes");
        }
        System.out.println("end of program");






    }

}
