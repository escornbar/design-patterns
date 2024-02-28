/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package templatemethod;

/**
 *
 * @author syaamil
 */
public class TemplateMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CardValidator[] cardArray = {new VisaCardValidator("1234123412341234", 11, 2004),
            new VisaCardValidator("1234567890123456", 11, 2024),
            new VisaCardValidator("4234567890123456", 11, 2023),
            new MasterCardValidator("5448755330349315", 11, 2024),
            new DinersClubCardValidator("30263720264678", 11, 2024)
        };

        for(int i=0;i<cardArray.length;i++){
            System.out.println(cardArray[i]);
            if(cardArray[i].validate() == true){
                System.out.println("Card is valid");
            }
        }
    }

}
