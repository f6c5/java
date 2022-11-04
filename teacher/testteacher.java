public class testteacher{
    public static void main(String args[]){
        teaching t[]=new teaching[4];

        teacher t1=new teacher();
        teacher t2=new teacher(1,"asdf saf","ksfhasf",124.0);
        primary_teacher pt1=new primary_teacher(3,"mahmut tuncer","halay ilkokulu");
        college_teacher ct1=new college_teacher(5,"arzu gül","beykent üniversitesi");
        t[0]=t1;
        t[1]=pt1;
        t[2]=ct1;
        t[3]=t2;
        for(int i=0; i<t.length; i++){
			t[i].print();
            System.out.println("school teype:"+t[i].getschool_type());
			System.out.println("salary:"+t[i].getsalary());
	}    
}
}