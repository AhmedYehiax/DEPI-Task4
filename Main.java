class DVDPlayer{
    void play(){
        System.out.println("DVD Playing");
    }
    void stop(){
        System.out.println("DVD Stopped");
    }
}
class Projector{
    void on(){
        System.out.println("Projector on");
    }
    void off(){
        System.out.println("Projector off");
    }
}
class Screen{
    void down(){
        System.out.println("Screen down");
    }
    void up(){
        System.out.println("Screen up");
    }
}
class SoundSystem {
    void on(){
        System.out.println("Sound system on");
    }
    void off(){
        System.out.println("Sound system off");
    }
}
class LightSystem {
    void on(){
        System.out.println("Light system on");
    }
    void off(){
        System.out.println("Light system off");
    }
}
class HomeTheaterFacade{
 private DVDPlayer dvd;
 private Projector proj;
 private LightSystem light;
 private Screen scr;

 public HomeTheaterFacade(DVDPlayer dvd,Projector proj ,LightSystem light, Screen scr){
    this.dvd=dvd;
    this.light=light;
    this.proj=proj;
    this.scr=scr;

}
 public void playMovie(){
    light.on();
    scr.down();
    proj.on();
    dvd.play();
 } 
 public void end(){
    light.off();
    scr.up();
    proj.off();
    dvd.stop();
 } 
}

public class Main {
    public static void main(String[] args){
        DVDPlayer dvd =new DVDPlayer();
        Projector projector =new Projector();
        LightSystem Light = new LightSystem();
        Screen screen = new Screen(); 

        HomeTheaterFacade homeThea = new HomeTheaterFacade(dvd, projector, Light, screen);
        homeThea.playMovie();
        System.out.println("-------------------------------------------------");
        homeThea.end();
    }
  
}
