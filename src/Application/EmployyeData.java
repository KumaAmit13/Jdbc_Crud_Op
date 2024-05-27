
public class EmployyeData {
	private int id;
	private String name;
	private String email;
	private int ctc;
	
	public EmployyeData(int id,String name, String email ,int ctc)
	{
		this.id=id;
		this.name=name;
		this.email=email;
		this.ctc=ctc;
	}

	public int getId() {
		return id;
	}

	
	public String getName() {
		return name;
	}

		public String getEmail() {
		return email;
	}

		public int getCtc() {
		return ctc;
	}

		@Override
	public String toString() {
			return "EmployyeData [id=" + id + " name=" + name + ", email=" + email + ", ctc=" + ctc + "]";
		}
		
       public static void main(String[] args)
       {
    	   @SuppressWarnings("unused")
		EmployyeData e1;
       }
	

}
