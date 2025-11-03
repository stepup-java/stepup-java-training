package assignments.student_submissions;

public class Palindrome {
    static void main() {

        int n=12321;
        int org_num=n;
        int rev=0;

//        for(;n!=0;n=n/10){
//            int digit=n%10;
//            rev=rev*10+digit;
//        }
//        System.out.println(rev);
//
//        if(org_num==rev) {
//            System.out.println("Palindrome");
//        }
//        else {
//            System.out.println("Non Palindrome");
//        }
//        System.out.println(rev);
//        while(n!=0){
//            int digit=n%10;
//            rev=rev*10+digit;
//            n=n/10;
//        }
//        if(org_num==rev) {
//            System.out.println("Palindrome");
//        }
//        else {
//            System.out.println("Non Palindrome");
//        }
//        System.out.println(rev);
        do{
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }while(n!=0);
        if(org_num==rev) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Non Palindrome");
        }
//            }
//        }

    }
}
