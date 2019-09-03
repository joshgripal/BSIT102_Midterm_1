import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
 

public class gripal {
 
    public static void main(String[] args) throws Exception {
        System.out.print("Please enter your birthday : YYYY-MM-DD: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
 
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar dob = Calendar.getInstance();
        dob.setTime(sdf.parse(input));
        System.out.println("your age is:" + getAge(dob));
    }
 

    public static int getAge(Calendar dob) throws Exception {
        Calendar today = Calendar.getInstance();
 
        int curYear = today.get(Calendar.YEAR);
        int dobYear = dob.get(Calendar.YEAR);
 
        int age = curYear - dobYear;
 
     
        
        int curMonth = today.get(Calendar.MONTH);
        int dobMonth = dob.get(Calendar.MONTH);
        if (dobMonth > curMonth) { 
            age--;
        } else if (dobMonth == curMonth) {
            int curDay = today.get(Calendar.DAY_OF_MONTH);
            int dobDay = dob.get(Calendar.DAY_OF_MONTH);
            if (dobDay > curDay) { 
                age--;
            }
        }
 
        return age;
    }
}