package facades;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class StudentFacadeSessionUtil {

	public static StudentFacadeSessionLocal getLocal() throws NamingException {
		StudentFacadeSessionLocal result = null;
		InitialContext ic = new InitialContext();
		try {
			ic = new InitialContext();
			result = (StudentFacadeSessionLocal) ic.lookup(StudentFacadeSessionLocal.JNDI_NAME);
		} finally {
			ic.close();
		}
		return result;
	}
}
