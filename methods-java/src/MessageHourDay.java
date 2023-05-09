import java.util.Random;

public class MessageHourDay {
    public static void main(String[] args) {
        
        Random rdm = new Random();

        int hour = rdm.nextInt(23);
        System.out.println("");
        System.out.println("It´s hour: " + hour+ "h");

        obterMensagem(hour);
    }

    public static void messagerGodMorning(){
        System.out.println("Good Morning!");
    }

    public static void messagerGodAfternoon(){
        System.out.println("Good Afternoon!");
    }
  
    public static void messagerGodNight(){
        System.out.println("Good Night!");
    }

    public static void obterMensagem(int hour) {
        
        switch (hour){
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                messagerGodMorning();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                messagerGodAfternoon();
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                messagerGodNight();
                break;
            default:
            System.out.println("Enter is value valide!");
            }
        }      

}
