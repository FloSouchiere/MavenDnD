package warriors.engine;

import java.sql.Connection;
import java.sql.DriverManager;

public class Singleton {
	
	private static String url = "jdbc:mysql://localhost:3306/sqlhero?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static String user = "test";
	private static String pwd = "test";
	private static Connection connect;
    
    private Singleton()
    {
    	try {
    		connect = DriverManager.getConnection(url, user, pwd);
    	}
    	
    	catch (Exception e) {
    		e.printStackTrace();
    		
    	}

    }
    
    public static final Connection getInstance()
    {
    	if(connect == null) {
    		new Singleton();
    	}
    	return connect;
    }
}