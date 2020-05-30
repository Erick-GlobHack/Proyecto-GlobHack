package paquete;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 * @author LPG LojaPonce
 */
public class Proceso2 extends Thread {
    public Proceso2(String msg){
    super(msg);
    }
    @Override
    public void run(){
        while(true){
////            System.out.println(this.getName()+"   "+"Soy del Hilo 2");      Este es el mensaje del Hilo
            Connection conexion = null;
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String Url = "jdbc:sqlserver://DESKTOP-JD4OQ1D:1433;databaseName=master;user=testjava;password=testjava;";
                conexion=DriverManager.getConnection(Url);
//////////                JOptionPane.showMessageDialog(null, "CONECCION A BASE DE DATOS EXITOSA");
                Statement ejecutor = conexion.createStatement();
                ResultSet respuesta = ejecutor.executeQuery("select * from mensajeria");
                while (respuesta.next()) {
                    String Datos[]=new String[2];
                    Datos[0]=respuesta.getString("Nombre");
                    Datos[1]=respuesta.getString("Mensaje");
                    MainGeneral.jLabelConfirmacion.setText(Datos[0]);
                    MainGeneral.jTextAreaConversacion.append(Datos[0]+" : "+Datos[1]);
                    MainGeneral.jTextAreaConversacion.append("\n");
                }
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL CONECTAR BASE DE DATOS "+e);     
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Proceso.class.getName()).log(Level.SEVERE, null, ex);
            }
            MainGeneral.jTextAreaConversacion.setText(null);
        }
    }
}
