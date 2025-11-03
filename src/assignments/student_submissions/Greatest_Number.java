package assignments.student_submissions;
//greatest number from digits
public class Greatest_Number {
    static void main() {
        int num = 9215;
        int max = -1;
        for (; num > 0; num = num / 10) {
           int digit=num%10;
           if(digit>max){
               max=digit;
           }
        }
        System.out.println("Greatest number of all "+max);
        int num1=9210;
        int max1=-1;
        while(num1!=0){
            int digit=num1%10;
            if(digit>max1){
                max1=digit;
            }
            num1=num1/10;
        }
        System.out.println("max "+max1);
    }
}
