package yash.company;
interface PhoneModel{
    int modelNo = 17700;
    void ring();
    void call(String number);
}
interface PhoneFeature{
    void song(String songName);
    void play(String gameName);
}
class PhoneTime{
    void time(String time){
        System.out.println("Time is "+time);
    }
    void date(String date){
        System.out.println("Today date is "+date);
    }
}
 class Phone extends PhoneTime implements PhoneModel, PhoneFeature { // Here multiple inheritance is implemented by using interfaces
    void camera(){
        System.out.println("Clicking pictures");
    }
   public void ring(){
       System.out.println("This phone is ringing ");
   }
   public void call(String number){
       System.out.println("calling to the number "+ number);
   }
    public void song(String songName){ // Whenever we implement mehtods of a interface we have to make them public
         System.out.println("Playing the song "+ songName);
     }
     public void play(String gameName){
         System.out.println("Launching the game "+ gameName);
     }

}
public class Interfaces {
    public static void main(String[] args) {
        Phone vivo = new Phone();
        vivo.call("7819057210");
        System.out.println(vivo.modelNo);
       //  vivo.modelNo = 345; -> It will throw an error as the variables create in an interface is always final

    }
}
