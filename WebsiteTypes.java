/*
WRITE A PROGRAM TO FIND OUT THE TYPES OF WEBSITE FROM THE URL
    .com= COMMERCIAL WEBSITE
    .org= ORGANISATION WEBSITE
    .in= INDIAN WEBSITE
 */

import java.util.Scanner;
public class WebsiteTypes {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the URL:-");
        String u=sc.next();
        String url=u.toLowerCase();
        if(url.endsWith(".com")){
            System.out.println("\n"+url+" is a Commercial Website");
        }
        else if(url.endsWith(".org")){
            System.out.println("\n"+url+" is a Organisation Website");
        }
        else if(url.endsWith(".in")){
            System.out.println("\n"+url+" is a Indian Website");
        }
        else{
            System.out.println("\nWrong URL");
        }
    }
}
