package demo.rxtx;

import gnu.io.CommPortIdentifier;
import org.marre.SmsSender;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoRxtxApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoRxtxApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        CommPortIdentifier portIdentifier = CommPortIdentifier.getPortIdentifier("usbserial");

        // Send SMS with clickatell
        SmsSender smsSender = SmsSender.getGsmSender("ttyS0");

      //  Thread.sleep(5000);

        // The message that you want to send.
        String msg = "TESTE de SMS.";

        // International number to reciever without leading "+"
        String reciever = "558199001795";

        // Number of sender (not supported on all transports)
        String sender = "5581981230078";

        smsSender.connect();

        smsSender.sendTextSms(msg,reciever, sender);

      //  String msgids[] = smsSender.sendTextSms(msg, reciever, sender);

        smsSender.disconnect();
        
        System.out.println("FIM");

    }
}
