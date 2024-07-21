package src.com.demo.InterfacesClasses;


public class NiceCar {

    // Interface initialization
    private Engine engine;
    private Media mediaPlayer;

    public NiceCar(){
        this.engine = new DieselEngine();
        this.mediaPlayer = new MusicPlayer();
    }

    public NiceCar(Engine engine){
        this.engine = engine;
        this.mediaPlayer = new MusicPlayer();
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void acc(){
        engine.acc();
    }

    public void mediaStart(){
        mediaPlayer.start();
    }

    public void mediaStop(){
        mediaPlayer.stop();
    }
}
