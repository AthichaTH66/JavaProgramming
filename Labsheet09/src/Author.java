
public class Author {
   private String name ;
   private String email;
   private char gender;
   
   public Author(String name,String email,char gender) {
	   this.email = email;
	   this.name = name;
	   this.gender = gender;
   }
   public Author(String name,String email) {
	   this.email = email;
	   this.name = name;
   }
   public Author() {
	   
   }
   public String getName() {
	   return name;
   }
   public String getEmail() {
	   return email;
   }
   public String getGenderName() {
	    if(gender == 'M') {
		   return  "male";
	   }
	    else if(gender =='F') 
		   return  "Female";
	    
		if(gender!= 'M'&& gender !='F') 
			   return  "null";
		return null;
   }
   public String toString() {
	   return name + "(" + email + ";" + getGenderName() +")";
   }
   
   
	
}
