package com.common.api.constant;

public class APIFixedConstant {
	 
	/** Database Engine */
	public static final String GC_DB_ENGINE_MS_SQL = "MS_SQL"; 
	
	/** Database Engine */
	public static final String GC_REFERRED_BY_ANDROID = "ANDROID";
	public static final String GC_REFERRED_BY_WEB     = "WEB";     
	public static final String GC_REFERRED_BY_IOS     = "IOS";       
	
	/** Log Package */      
	public static final String GC_LOG_PACKAGE_NAME = "com.common.api";     
	/** Resource Package */    
	public static final String GC_RSOURCE_PACKAGE_NAME = "com.common.api.resource";  
	 
	/** Time zone */
	public static final String GC_GLOBAL_TIME_ZONE_ID = "UTC";        
	/** Status */      
	public static final String GC_STATUS_SUCCESS  = "SUCCESS";
	public static final String GC_STATUS_ERROR    = "ERROR";      
	public static final String GC_STATUS_SESSION_FAILED = "SESSION_FAILED";     
	public static final String GC_STATUS_ACCESS_FAILED  = "ACCESS_FAILED";    
	public static final String GC_STRING_SEPERATOR_COMMA = ",";  
  
	/** Date and Time */ 
	public static final String GC_DATE_FORMAT = "yyyy-MM-dd";                  
	public static final String GC_TIME_FORMAT = "HH:mm:ss";       
	public static final String GC_DATE_TIME_FORMAT   = GC_DATE_FORMAT + " " + GC_TIME_FORMAT;
	
	/** Date Time */
	public static final String DV_TIME_ZONE_ID = "UTC";    
	public static final String DV_TIME_ZONE_ID_ASIA_KOLKATA = "Asia/Kolkata";  
	
	/** Action */    
	public static final String GC_ACTION_PLUS    = "PLUS";   	 
	public static final String GC_ACTION_MINUS   = "MINUS";	
	
	/** Method */    
	public static final String GC_METHOD_GET    = "GET";  	 
	public static final String GC_METHOD_POST   = "POST"; 	 
	public static final String GC_METHOD_PUT    = "PUT"; 
	public static final String GC_METHOD_DELETE = "DELETE";	  
	
	/** Action */    
	public static final String GC_ACTION_CREATE = "CREATE";   	 
	public static final String GC_ACTION_VIEW   = "VIEW"; 
	public static final String GC_ACTION_UPDATE = "UPDATE"; 	 
	public static final String GC_ACTION_DELETE = "DELETE";
	public static final String GC_ACTION_YES 	= "YES";	  
	
	/** Sorting */
	public static final String GC_SORT_ASC  = "ASC";  
	public static final String GC_SORT_DESC	= "DESC";
	
	public static final String GC_SORT_BY_CREATED_BY = "createdAt";   
	public static final String GC_STATUS_REGISTERED	 = "REGISTERED";
	public static final String GC_STAtUS_DEFAULT	 = "DEFAULT";    
	public static final String GC_STATUS_AUDIT   	 = "AUDIT";     
	
	public static final String GC_TIME_ZONE_UTC = "UTC";  
	public static final String GC_TIME_ZONE_ISD = "IST";  
	
	public static final String GC_HTTP_SUCCESS_MESSAGE = "Request Process Successfully";
	public static final String GC_HTTP_FAILED_MESSAGE  = "Request Process Failed";
	
	/** Provider */
	public static final String DS_SEPARATOR_SLASH = "/";
	
	/** HTTP Status Code Constants */         
	public static final String SM_STATUS_OK		       		= "Request Success";    
	public static final String SM_STATUS_CREATED	    	= "Request Success";
	public static final String SM_STATUS_ACCEPTED       	= "Request Success"; 
	public static final String SM_STATUS_FORBIDDEN    		= "Access Bocked";  	   
	public static final String SM_STATUS_CONFLICT     		= "Conflict Error(s)";        
	public static final String SM_STATUS_PRE_CONDITION  	= "Validation Error(s)";
	public static final String SM_STATUS_FAILED_DEPENDENCY 	= "Failed Dependency"; 
	public static final String SM_STATUS_SESSION      		= "Session Timeout";       
	public static final String SM_STATUS_INTERNAL     		= "Internal Server Error(s)";   
	public static final String SM_STATUS_EXTERNAL_ERR 		= "External API Error(s)";  
	
	public static final int SC_STATUS_OK		   		= 200;
	public static final int SC_STATUS_CREATED      		= 201; 
	public static final int SC_STATUS_ACCEPTED     		= 202;        
	public static final int SC_STATUS_FORBIDDEN			= 403;        
	public static final int SC_STATUS_CONFLICT     		= 409;         
	public static final int SC_STATUS_PRE_CONDITION		= 412;   
	public static final int SC_STATUS_FAILED_DEPENDENCY = 424; 
	public static final int SC_STATUS_SESSION      		= 440;             
	public static final int SC_STATUS_INTERNAL     		= 500; 
	public static final int SC_STATUS_EXTERNAL_ERR 		= 502;
	     
	/** Regular Expression Constants */   
	public static final String RE_USERNAME		= "^[0-9]+$";      
	public static final String RE_PASSWORD 	   	= "^(?=.*[0-9])(?=.*[a-z])(?=.*[!@#$%^&*+=?-]).{8,15}$";   
	public static final String RE_MOBILE_PIN   	= "^[a-zA-Z0-9@]+$";  
	public static final String RE_EMAIL   	   	= "^[_a-z0-9-\\+]+(\\.[_a-z0-9-]+)*@+[a-z0-9-]+(\\.[a-z0-9]+)*(\\.[a-z]{2,})$"; 

	public static final String RE_DEVICE_FIELD	= "[a-zA-z0-9/,-/s ]+$";      
	
	public static final String RE_ID           	= "^[a-zA-Z0-9]+$";   
	public static final String RE_YES_NO 	   	= "^[A-Z0-9]+$";  
	public static final String RE_NUMBER	   	= "^[0-9]+$"; 
	public static final String RE_NAME         	= "[a-zA-Z 0-9]+$";  
	public static final String RE_TYPE		   	= "^[A-Z0-9_]+$";  
	public static final String RE_STATUS	   	= "^[A-Z0-9_]+$";
	public static final String RE_MULTI_TYPE   	= "^[A-Z0-9_/,]+$"; 
	public static final String RE_CODE         	= "^[a-zA-Z0-9+]+$"; 
	public static final String RE_SYSTEM_CODE  	= "^[a-zA-Z0-9+]+$"; 
 	public static final String RE_DATE         	= "^[0-9]{4}-[0-9]{2}-[0-9]{2}";  
	public static final String RE_DESCRIPTION  	= "[a-zA-z0-9/,-/s ]+$"; 
  	public static final String RE_DATE_TIME    	= "^[0-9]{4}-[0-9]{2}-[0-9]{2} [0-9]{2}:[0-9]{2}:[0-9]{2}";
	public static final String RE_TIME         	= "(?:[01][0-9]|2[0123]):(?:[012345][0-9]):(?:[012345][0-9])"; 
	public static final String RE_UNIQUE_ID  	= "[a-zA-Z:0-9]+$"; 
	public static final String RE_UNIQUE_CODE  	= "[a-zA-Z:0-9]+$"; 
	public static final String RE_APPLICATION_TYPE 	= "^[A-Z0-9_]+$"; 
	  
	/** Validation Type Constants */ 
	public static final String VT_NUMBER 	= "number";   
	public static final String VT_NAME  	= "name";     
	public static final String VT_DATE  	= "date";     
	public static final String VT_TIME  	= "time";    
	public static final String VT_TYPE 		= "type";   
	public static final String VT_DATE_TIME   = "dateTime";     
	public static final String VT_PASSWORD	  = "password";   
	public static final String VT_AUTO_GEN_ID = "autoGenerateId";
	public static final String VT_DESCRIPTION = "description";   
	public static final String VT_UNIQUE_CODE = "uniqueCode";  
	
	/** Run Time Validation Error(s) */ 
	public static final String RTVE_COMPANY_NOT_EXISTS 		  = "Company does not exist";
	public static final String RTVE_COUNTRY_NOT_EXISTS 		  = "Country does not exist"; 
	public static final String RTVE_USERNAME_NOT_AVAILABLE    = "Username does not available";
	public static final String RTVE_USER_VERIFI_NOT_MATCHED   = "User verification does not mismatched";
	public static final String RTVE_USER_FEEDBACK_NOT_MATCHED = "User feedback does not mismatched";
	public static final String RTVE_USER_COMPANY_NOT_MATCHED  = "User company does not mismatched"; 
	public static final String RTVE_USER_DIVISION_NOT_MATCHED = "User division does not mismatched";
	public static final String RTVE_USER_MODULE_NOT_MATCHED   = "User module does not mismatched";
	public static final String RTVE_USER_PREFER_NOT_MATCHED   = "User preference does not mismatched";
	public static final String RTVE_PROPERTY_NOT_MATCHED   	  = "Property does not mismatched";
	public static final String RTVE_SECTION_NOT_MATCHED   	  = "Section does not mismatched";
	public static final String RTVE_PROTION_NOT_MATCHED   	  = "Portion does not mismatched";  
	public static final String RTVE_DEVICE_NOT_MATCHED   	  = "Device does not mismatched"; 
	public static final String RTVE_DEVICE_DATA_NOT_MATCHED   = "Device data does not mismatched"; 
	public static final String RTVE_MEMBER_NOT_MATCHED   	  = "Member does not mismatched";  
	public static final String RTVE_MEMBER_DEV_NOT_MATCHED    = "Member device does not mismatched"; 
	
	/** Table Name Constants */ 
	public static final String TABLE_STUDENTS 				= "tb_students";

  

	/** Regular Expression Constants */ 
	public static final String ID_REGEX 					= "^(0|[1-9]\\d*)$";
	public static final String NAME_REGEX					= "^[A-Za-z ]+$";  
	public static final String DATE_REGEX					= "^(19[7-9][0-9]|20[0-2][0-9]|20[3][0-2])-((0[1-9]|1[0-2])-([0-2][0-9]|3[0-1]))$\r\n";  
	public static final String GENDER_REGEX					= "^(m(?:ale)?|f(?:emale)?|o(?:thers)?|M(?:ale)?|F(?:emale)?|O(?:thers)?|M(?:ALE)?|F(?:EMALE)?|O(?:THERS)?)?+$"; 
	public static final String EMAIL_ADDRESS_REGEX 			= "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$";	
	public static final String PHONE_NUMBER_REGEX 			= "^[6-9]\\d{9}$";				

	/** Validation Constants */ 
	public static final String INVALID_ID_FORMAT 			= "Invalid id format. id must contains only numbers and greater than zero";	
	public static final String INVALID_STUDENT_ID_FORMAT 	= "Invalid student_id format. id must contains only numbers and greater than zero";	
	public static final String INVALID_SEMESTER_ID_FORMAT 	= "Invalid semester_id format. id must contains only numbers and greater than zero";
	public static final String INVALID_NAME_FORMAT	 		= "Invalid name. Name must contain only letters (A-Z, a-z).";
	public static final String INVALID_EMAIL_FORMAT 		= "Invalid email format. Please enter a valid email address.";	
	public static final String INVALID_PHONE_FORMAT 		= "Invalid Phone Number. Phone number must be 10 digits in length and consist of numbers (0-9) only.";
	public static final String INAVLID_DEPARTMENT			= "Invalid department_id. department id doesn't match";	
	public static final String INAVLID_SEMESTER				= "Invalid semester_id. semester id doesn't match";
	public static final String JSON_ERROR 					= "Error converting List to JSON";	
	public static final String RECORD_NOT_FOUND				= "No Record found";	
	public static final String DEPARTMENT_NOT_FOUND			= "Department id not exist";	
	public static final String SEMESTER_NOT_FOUND			= "Semester id not exist";	
	public static final String STUDENT_NOT_FOUND			= "Student id not exist";

	
}
