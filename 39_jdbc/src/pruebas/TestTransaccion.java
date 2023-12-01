package pruebas;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestTransaccion {

	
		//llamada a setAutoCommit(false) desactiva las transacciones. 
		//Con esto las transaciones se pueden quedar a medias y hay que hacer el commit de forma manual (commit())

		public static void main(String[] args) {
			String url="jdbc:mysql://localhost:3306/comercio";
			String user="root";
			String pwd="root";
			try(Connection c=DriverManager.getConnection(url, user, pwd)){
				c.setAutoCommit(false); //Desactiva las transacciones automaticas, y hay que poner al final el commit()
				String sql="delete from pedidos";
				Statement st=c.createStatement();
				st.execute(sql);
				//c.commit();
			}
			catch(SQLException ex) {
				ex.printStackTrace();
			}
		
			
			

			
	}

}
