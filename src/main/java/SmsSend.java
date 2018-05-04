/*
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;

import java.io.OutputStream;

public class SmsSend {

    public void enviar(){

        try
        {
            CommPortIdentifier portIdentifier = CommPortIdentifier.getPortIdentifier("COM1");
            SerialPort serialPort = (SerialPort) portIdentifier.open("ListPortClass", 2000);
            serialPort.setSerialPortParams(115200, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_EVEN);
            OutputStream mOutputToPort = serialPort.getOutputStream();

            String mValue = "AT\r";// strating to communicate with port starts here!
            mOutputToPort.write(mValue.getBytes());
            mOutputToPort.flush();
            Thread.sleep(500);
            mInputFromPort.read(mBytesIn);
            value = new String(mBytesIn);
            System.out.println("Response from Serial Device: "+value);
            mValue = "AT+cmgf=1\r";
            mOutputToPort.write(mValue.getBytes());
            mOutputToPort.flush();
            mValue="at+cmgs=\" Mobile number\"\r";
            System.out.print(mValue);
            mOutputToPort.write(mValue.getBytes());
            mOutputToPort.flush();
            mValue="at+cmgs="\032";//calling ctrl+z
            System.out.print(mValue);
            mOutputToPort.write(mValue.getBytes());
            mOutputToPort.flush();
            mOutputToPort.close();
            mInputFromPort.close();

        }
        catch (Exception e) {
            e.printStackTrace();
        }




    }


}
*/
