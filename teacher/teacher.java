public class teacher extends teaching{
    protected int id;
	protected String name,school;
    protected double salary;
    public teacher(){
        id=0; name="ttttt"; school="sssss"; salary=00;
    }
    public teacher(int id1,String n1,String s1,Double sa1){
        id=id1;name=n1;school=s1;salary=sa1;
    }
	public void print(){
		System.out.println("Id:"+id+" Name:"+name+" school:"+school);
	}
    public String getschool(){
		return school;
	}
    public double getsalary(){
		return salary;
	}
    @Override
    public String getschool_type() {
        // TODO Auto-generated method stub
        return null;
    }
}
