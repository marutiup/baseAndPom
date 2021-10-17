package com.helper;

public class File_Reader_Manager {
	
	private File_Reader_Manager() {
	}
	
	
	public static File_Reader_Manager getInstanceFRM() {
		File_Reader_Manager frm=new File_Reader_Manager();
		return frm;
		
	}
	
	
	public Configuraction_Reader getInstanceCR() throws Throwable {
		//create a object for configuration manager

		Configuraction_Reader cr=new Configuraction_Reader();
		return cr;
	}

}
