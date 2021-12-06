/**
 * 
 */

/**
 * @author Richy
 *
 */
public class Patient {

	/**
	 * 
	 */
	String firstName;
	String middleName;
	String lastName;
	String phoneNum;
	String emerContName;
	String emerContactNum;
	
	
	/**
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 * @param phoneNum
	 * @param emerContactNum
	 */
	public Patient(String firstName, String middleName, String lastName, String phoneNum, String emerContactNum, String emerContName) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
		this.emerContName = emerContName;
		this.emerContactNum = emerContactNum;
	}

	/**
	 * @return the emerContName
	 */
	public String getEmerContName() {
		return emerContName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}
	
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * @return the phoneNum
	 */
	public String getPhoneNum() {
		return phoneNum;
	}
	
	/**
	 * @return the emerContactNum
	 */
	public String getEmerContactNum() {
		return emerContactNum;
	}
	
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * @param phoneNum the phoneNum to set
	 */
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	/**
	 * @param emerContactNum the emerContactNum to set
	 */
	public void setEmerContactNum(String emerContactNum) {
		this.emerContactNum = emerContactNum;
	}
	
	/**
	 * @param emerContName the emerContName to set
	 */
	public void setEmerContName(String emerContName) {
		this.emerContName = emerContName;
	}


}
