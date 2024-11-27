import java.util.*;
class Student 
{
	private int id;
	private int age;
	private double per;

	//setters
	public void setId(int id)
	{
		this.id=id;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setPer(double per)
	{
		this.per=per;
	}
	//getters
	public int getId()
	{
		return id;
	}
	public int getAge()
	{
		return age;
	}
	public double getPer()
	{
		return per;
	}
}
class FindElderSetterGetter
{
	public static void main(String []args)
	{
		//Scanner sc=new Scanner(System.in);
		Student s1=new Student();
		s1.setId(1);
		s1.setAge(21);
		s1.setPer(93.80);

		System.out.println("Student Id: "+s1.getId()+"\t Age: "+s1.getAge()+" \t Percentage: "+s1.getPer());

		Scanner sc=new Scanner(System.in);
		Student s2=new Student();
		s2.setId(2);
		s2.setAge(23);
		s2.setPer(90.80);

		System.out.println("Student Id: "+s2.getId()+"\t Age: "+s2.getAge()+" \t Percentage: "+s2.getPer());

		System.out.println("\n Elder student details: ");
		if(s1.getAge()>s2.getAge())
			System.out.println("Student Id: "+s1.getId()+"\t Age: "+s1.getAge()+" \t Percentage: "+s1.getPer());
		else
			System.out.println("Student Id: "+s2.getId()+"\t Age: "+s2.getAge()+" \t Percentage: "+s2.getPer());
	}

}
