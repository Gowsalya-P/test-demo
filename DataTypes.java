package myprograms;


/*
 * Primitive data types::
 * 
 * boolean(true or false)ex:boolean attendance;boolean result;
 * byte(1 byte)
 * short(2 byte)
 * int (4 bytes) EX: int salary;
 * long(8 bytes)
 * float (4 bytes)
 * double(8 bytes)
 * char(2 bytes)->UNICODE CHARACTER SET->0 TO 65535(0 to 255 c,c++)
 */

public class DataTypes 
{

	public static void main(String[] args) 
	{
		byte amount=50;
		short amount1=565;
		int salary=565699;
		long score=545456465;//considering as a INT DATA TYPE
		
		/*
		 * int is the default integral datatype in java
		 * If the value exceeds the int limit,then long
		 * datatype expect suffix either L or l.
		 */
		
		long score1=45345435435L;//now its exactly as LONG!
		
		long rating=4L;//long data type
		
		boolean attendance=false;
		
		String name="Karpagavalli";//Built in class
		String location="Tambaram" + " "+" Tamilnadu" + " "+" India";
//Here string is a class..name,location is a reference variable.
		
		//C,C++=>ASCII CHARACTER SET, 1 bytes
		//JAVA=>UNICODE CHARACTER SET , 2 BYTES , 0 TO 65535(stand alone application+enterprise(web) 
		//application)

		char grade='A';
		System.out.println("Attendance:: "+attendance);
		System.out.println("Integral values:: "+amount + " "+amount1 + " "+salary+ " "+score + " "+rating + " "+score1);
	
		System.out.println("Grade:: "+grade + " "+"Name:: "+name + " "+"Location:: "+location);

		//default floating point is DOUBLE!!!
		//suffix F or f is mandatory for float values!!
		//double suffix D or d is optional!

		float price=5600.50f;
		double rate=56050.34;//d is optional
		double rate1=56050.34D;//d is optional

		float rate2=4545;//no decimal points so suffix f is not required
		System.out.println("Floating point:: "+price+ " "+rate+ " "+rate1+ " "+rate2);
			
	}

}