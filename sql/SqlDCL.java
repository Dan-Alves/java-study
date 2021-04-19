package sql;

public interface SqlDCL {
	void grant(String query);
	void revoke(String query);
}
