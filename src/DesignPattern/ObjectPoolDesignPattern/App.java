package DesignPattern.ObjectPoolDesignPattern;

public class App {
	public static void main(String[] args) {
			// DBConnectionPoolManager dbConnectionPoolManager = new DBConnectionPoolManager();
			
			DBConnectionPoolManager dbConnectionPoolManager = DBConnectionPoolManager.getInstance();
			
			DBConnection dbConnection1 = dbConnectionPoolManager.getDBConnection();
			DBConnection dbConnection2 = dbConnectionPoolManager.getDBConnection();
			DBConnection dbConnection3 = dbConnectionPoolManager.getDBConnection();
			DBConnection dbConnection4 = dbConnectionPoolManager.getDBConnection();
			DBConnection dbConnection5 = dbConnectionPoolManager.getDBConnection();
			DBConnection dbConnection6 = dbConnectionPoolManager.getDBConnection();
			
			// Cannot create more connections, maximum pool size reached.

			DBConnection dbConnection7 = dbConnectionPoolManager.getDBConnection();
			
			
			// Cannot create more connections, maximum pool size reached.

			DBConnectionPoolManager.getInstance().getDBConnection();
			
			
	}
}
