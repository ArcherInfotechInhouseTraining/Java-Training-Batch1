class BooleanWrapperExample 
{
	public static void main(String[] args) 
	{
		Boolean ob = new Boolean(true);
		Boolean ob1 = new Boolean("false");
		System.out.println("ob: "+ob+"\t ob1: "+ob1);

		//Logical AND
		
		System.out.println("------ LogicalAnd -------\n");
		System.out.println(Boolean.logicalAnd(ob,ob1));
		System.out.println(Boolean.logicalAnd(false,ob1));
		System.out.println(Boolean.logicalAnd(ob,true));
		System.out.println(Boolean.logicalAnd(false,ob));

		System.out.println("------ LogicalOr -------\n");
		System.out.println(Boolean.logicalOr(ob,ob1));
		System.out.println(Boolean.logicalOr(false,ob1));
		System.out.println(Boolean.logicalOr(ob,true));
		System.out.println(Boolean.logicalOr(false,ob));

		System.out.println("------ LogicalXor -------\n");
		System.out.println(Boolean.logicalXor(ob,ob1));
		System.out.println(Boolean.logicalXor(false,ob1));
		System.out.println(Boolean.logicalXor(ob,true));
		System.out.println(Boolean.logicalXor(false,ob));

		System.out.println("toString of ob1: "+Boolean.toString(ob1));
		


		
	}
}
