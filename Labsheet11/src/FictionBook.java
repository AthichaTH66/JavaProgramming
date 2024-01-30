import java.time.Year;
public class FictionBook implements Author,book{
	private String Author_name;
	private String email;
	private String title;
	private int publicYear;
	
	FictionBook(String title,int publicYear){
		this.title = title;
		this.publicYear = publicYear;
	}
	public void setAuthorName(String name) {
		this.Author_name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean checkFormatName() {
		if(Author_name.indexOf(" ") !=-1) {
			return true;
		}
		else return false;
	}
	public String toString() {
		return title + " Writed by " + getLastName().indexOf(0) + getFirstName() + "(" + email + ")\n" + "Published for " +  getPublicYear();
	}
	@Override
	public String getLastName() {
		return Author_name.substring(Author_name.indexOf(" ") + 1 );
	}
	@Override
	public String getFirstName() {
		return Author_name.substring(0,Author_name.indexOf(" "));
	}
	@Override
	public boolean checkEmail() {
		 if(email.endsWith("@hotmail.com") || email.endsWith("windowslive.com"))
		return true;
		 else return false;
	}
	@Override
	public String getTitle() {
		return title;
	}
	@Override
	public int getPublicYear() {
		return Year.now().getValue() - publicYear;
	}
}