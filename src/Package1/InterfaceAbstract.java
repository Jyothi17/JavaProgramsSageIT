package Package1;

public class InterfaceAbstract extends AbstractClass {
	
	int id;
	public InterfaceAbstract(String companyName, int salary,int id) {
		super(companyName, salary);
		this.id = id;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int id() 
	{
		// TODO Auto-generated method stub
		return id;
	}
	
	public static void main(String[] args)
	{
		InterfaceAbstract ia = new InterfaceAbstract("Java",10000,20);
		System.out.println("Company Name is: "+ia.CompanyName);
		System.out.println("Id is "+ia.id);
		System.out.println("Bonus is "+ ia.bonus());
		
		
		InterfaceAbstract ia2 = new InterfaceAbstract("Nova",9698,50);
		System.out.println("Company Name is: "+ia2.CompanyName);
		System.out.println("Id is "+ia2.id);
		System.out.println("Bonus is "+ ia2.bonus());
		
		
	}
}
