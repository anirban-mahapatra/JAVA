/*
WRITE A JAVA PROGRAM TO FILL IN A LETTER TEMPLATE WHICH LOOK LIKE BELOW:
    LETTER = "DEAR <|NAME|>, THANKS A LOT"
    REPLACE <|NAME|> WITH A STRING
 */

import java.util.Scanner;
public class ReplaceString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letter="\"DEAR <|NAME|>, THANKS A LOT\"";
        System.out.print("\"DEAR <|NAME|>, THANKS A LOT\"\nEnter the name you want to replace with <|NAME|> :-");
        String a=sc.nextLine();
        String name=a.toUpperCase();
        System.out.println("\n"+letter.replace("<|NAME|>",name));
    }
}
