package sql;

public interface Database extends SqlDCL, SqlDML, SqlDDL{
	void openConnection();
	void closeConnection();
}
