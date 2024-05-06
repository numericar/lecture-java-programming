package L14_interfaces;

class Phone {
    public void call() {
        System.out.println("Phone call");
    }

    public void sms() {
        System.out.println("Phone sending SMS");
    }
}

interface ICamera {
    void click();
    void record();
}

interface IMusicPlayer {
    void play();
    void stop();
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer {
    public void videoCall() {
        System.out.println("Smart phone video calling");
    }

    @Override
    public void play() {
        System.out.println("Smart phone playing music");
    }

    @Override
    public void stop() {
        System.out.println("Smart phone stopping music");
    }

    @Override
    public void click() {
        System.out.println("Smart phone clicking photo");
    }

    @Override
    public void record() {
        System.out.println("Smart phone recording vide");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.call();
        smartPhone.play();

        Phone phone = new SmartPhone();
        phone.sms();
        phone.call();

        ICamera camera = new SmartPhone();
        camera.click();
        camera.record();

        IMusicPlayer musicPlayer = new SmartPhone();
        musicPlayer.play();
        musicPlayer.stop();
    }
}