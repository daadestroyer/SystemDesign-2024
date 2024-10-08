package DesignPattern.ObjectPoolDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class DBConnectionPoolManager {
	private List<DBConnection> freeConnections = new ArrayList<>();
	private List<DBConnection> connectionsInUse = new ArrayList<>();
	private int INITIAL_MAX_POOLSIZE = 3;
	private int MAXIMUM_MAX_POOLSIZE = 6;
	private static DBConnectionPoolManager connectionPoolManager = null;

	private DBConnectionPoolManager() {
		for (int i = 0; i < INITIAL_MAX_POOLSIZE; i++) {
			freeConnections.add(new DBConnection());
		}
	}

	public static DBConnectionPoolManager getInstance() {
		if (connectionPoolManager == null) {
			synchronized (DBConnectionPoolManager.class) {
				connectionPoolManager = new DBConnectionPoolManager();
			}
		}
		return connectionPoolManager;
	}

	public synchronized DBConnection getDBConnection() {
		// if there are free connections available make them available
		if (!freeConnections.isEmpty()) {
			DBConnection dbConnection = freeConnections.remove(freeConnections.size() - 1);
			connectionsInUse.add(dbConnection);
			System.out.println("Reusing a free connection from the pool. In-use pool size: " + connectionsInUse.size());
			return dbConnection;
		}
		// if we have space to create new connection then create new connections
		else if (connectionsInUse.size() < MAXIMUM_MAX_POOLSIZE) {
			DBConnection dbConnection = new DBConnection();
			connectionsInUse.add(dbConnection);
			System.out.println("Created a new connection. In-use pool size: " + connectionsInUse.size());
			return dbConnection;
		}
		// if max limit is reached don't allow to create any more
		else {
			System.out.println("Cannot create more connections, maximum pool size reached.");
			return null;
		}
	}

	public synchronized void releaseDBConnection(DBConnection dbConnection) {
		if (dbConnection != null && connectionsInUse.contains(dbConnection)) {
			connectionsInUse.remove(dbConnection);
			System.out.println("Connection removed : " + connectionsInUse.size());
			freeConnections.add(dbConnection);
			System.out.println("Connection released back to the pool. Free pool size: " + freeConnections.size());
		}
	}

}
