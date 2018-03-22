package Package1;

public abstract class AbstractClass implements Interface1{

	String CompanyName;
	int salary;
	
	
	public AbstractClass(String companyName,int salary)
	{
		this.CompanyName =companyName;
		this.salary = salary;
	}
	@Override
	public void companyName(String companyName) {
		// TODO Auto-generated method stub
		this.CompanyName = companyName;
	}
	public abstract int id();
	
    public int bonus()
    {
      	return ((salary*10)/100);
    }
    
}
