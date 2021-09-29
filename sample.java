package myprograms;

import java.lang.*;//default package in java. import all the classes packages...

import java.lang.System;//import specific classes! improves the performance of the JVM!
import java.lang.String;

//Compiler :: convert the java code to byte code
//Interpreter:: convert the byte code to machine code
/*
 * Package:
 * group of similar types  of classes , interfaces and sub-packages.
 * used for preventing naming conflicts!

 * void::the particular method does not return any value
 * main: entry point method for java 
 * static::doesnt require any object! used for memory management!memory allocated by default by the JVM
 */
//Windows->Show view->.Console,ProjectExplorer menu
//bytecode file takes the classname.class!!(Sample.class)

//class default access specifier is "default"!!!

//public access specifier:: filename and classname must be same!!
//public class Sample123//compilation error

//package,import,class

class sample //Bytecode:: Sample.class
{
	public static void main(String[] args)//Command line arguments(String array!)
	{
		//System is a built in class
		//out is a reserved object of java.io.PrintStream class
		//println is a method of PrintStream class

	System.out.println("Hello Java!");
	
	}

}
