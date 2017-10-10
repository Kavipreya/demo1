package interfacedemo;

public class Interfaceinh extends Mybase implements I2 {
public double circle_circum (double r)
{
	return(2*PI*r);
}


	@Override
	public void method11() {
		System.out.println("call to meth11");// TODO Auto-generated method stub

	}

	@Override
	public void method12() {
		System.out.println("call to meth12");// TODO Auto-generated method stub
	}
public static void main(String args[])
{
	Interfaceinh obj=new Interfaceinh();
	double ans=obj.circle_circum(4);
	System.out.println("circumfrence="+ans);
}
}

