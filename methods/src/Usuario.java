public class Usuario {
    public static void main(String[] args) throws Exception{
        
        SmartTV smartTV = new SmartTV();

        System.out.println("Tv on = " + smartTV.on);
        System.out.println("Channel current = " + smartTV.channel);
        System.out.println("Volume current = " + smartTV.volume);
        
        
        smartTV.on();
        System.out.println("New status Tv on = " + smartTV.on);
        
        smartTV.turnUpVolume();
        System.out.println("New status volume Tv = " + smartTV.volume);
        
        smartTV.changeChannel(10);
        System.out.println("New channel current = " + smartTV.channel);



    }
}
