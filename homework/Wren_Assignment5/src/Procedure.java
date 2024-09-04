import java.util.Date;

/**
 * 
 */

/**
 * @author Richy
 *
 */
public class Procedure extends Patient {
	
	String procName;
	String docName;
	int procFee;
	java.util.Date procDate;
	
	/**
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 * @param phoneNum
	 * @param emerContactNum
	 * @param emerContName
	 * @param procName
	 * @param docName
	 * @param procFee
	 * @param procDate
	 */
	public Procedure(String firstName, String middleName, String lastName, String phoneNum, String emerContactNum,
			String emerContName, String procName, String docName, int procFee, Date procDate) {
		super(firstName, middleName, lastName, phoneNum, emerContactNum, emerContName);
		this.procName = procName;
		this.docName = docName;
		this.procFee = procFee;
		this.procDate = procDate;
	}
	/**
	 * @return the procName
	 */
	public String getProcName() {
		return procName;
	}
	/**
	 * @return the docName
	 */
	public String getDocName() {
		return docName;
	}
	/**
	 * @return the procFee
	 */
	public int getProcFee() {
		return procFee;
	}
	/**
	 * @return the procDate
	 */
	public java.util.Date getProcDate() {
		return procDate;
	}
	/**
	 * @param procName the procName to set
	 */
	public void setProcName(String procName) {
		this.procName = procName;
	}
	/**
	 * @param docName the docName to set
	 */
	public void setDocName(String docName) {
		this.docName = docName;
	}
	/**
	 * @param procFee the procFee to set
	 */
	public void setProcFee(int procFee) {
		this.procFee = procFee;
	}
	/**
	 * @param procDate the procDate to set
	 */
	public void setProcDate(java.util.Date procDate) {
		this.procDate = procDate;
	}
	 

	

}
