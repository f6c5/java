public class primary_teacher extends teacher{
	private static String school_type="primary school";
	private static double salary=6000;
	
	public primary_teacher(int id1,String n1,String s1){
		super(id1,n1,s1, salary);
	}
	public void print(){
		System.out.println("Id:"+id+" Name:"+name+" school:"+school+" school type:"+school_type+"salary"+salary);
	}
	public String getschool_type(){
		return school_type;
	}
	public double salary(){
		return salary;
	}

}