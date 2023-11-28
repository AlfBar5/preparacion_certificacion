module service.module {
	
	exports service;
	requires model.module;
	
	requires com.google.gson;	
	requires java.persistence;
	requires java.sql;
	requires lombok;
	requires mysql.connector.j;	
	
	
}


