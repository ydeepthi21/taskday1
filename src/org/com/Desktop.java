package org.com;

public class Desktop implements Hardware,Software {
	
	public void desktopModel1() {
System.out.println("model is Dell");
	}
	
	@Override
	public void hardwareResources() {
	System.out.println("it is of hardware");	
	}
	
	@Override
	public void softwareResources() {
	System.out.println("it is of software");	
	}
	
	public static void main(String[] args) {
		
Desktop d=new Desktop();
d.desktopModel1();
d.softwareResources();
d.hardwareResources();

	}

}
