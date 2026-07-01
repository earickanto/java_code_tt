package polymorphism;

class Notification {

    void send() {
        System.out.println("Sending Notification");
    }
}

class Email extends Notification {

    @Override
    void send() {
        System.out.println("Sending Email Notification");
    }
}

class SMS extends Notification {

    @Override
    void send() {
        System.out.println("Sending SMS Notification");
    }
}

class WhatsApp extends Notification {

    @Override
    void send() {
        System.out.println("Sending WhatsApp Notification");
    }
}

public class NotificationSystem {

    public static void main(String[] args) {

        Notification n;
8
        n = new Email();
        n.send();

        n = new SMS();
        n.send();

        n = new WhatsApp();
        n.send();
    }
}