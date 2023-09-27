//CREATE A CLASS CELL PHONE WITH METHOD TO PRINT RINGING..... , VIBRATING..... , ETC.
package question_solution;
import java.util.*;

class CellPhone{
    public void Ring(){
        System.out.println("\nRinging.....\n");
    }

    public void Vibrate(){
        System.out.println("\nVibrating.......\n");
    }

    public void Call(){
        System.out.println("\nCalling Friend....\n");
    }
}

public class CellPhonePrintUsingClass {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        CellPhone phone=new CellPhone();
        while(true){
            System.out.print("Press 1 for Ringing\n\t  2 for vibrating\n\t  3 for call\n\t  0 for exit\nEnter your Choice: ");
            int cho=sc.nextInt();
            if(cho==1){
                phone.Ring();
            }
            else if(cho==2){
                phone.Vibrate();
            }
            else if(cho==3){
                phone.Call();
            }
            else if(cho==0){
                break;
            }
            else{
                System.out.println("\nWrong Input\n");
            }
        }
    }
}
