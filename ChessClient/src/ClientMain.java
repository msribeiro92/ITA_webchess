import java.net.Socket;

public class ClientMain{
    public static void main(String[] args){
        try{
            Socket soc = new Socket("192.168.0.36", 3000);
            new Client(soc).run();
            soc.close();
        }
        catch(Exception e){
        	System.out.println("Conex?o perdida com o servidor.");
        }
        System.exit(0);
    }
}