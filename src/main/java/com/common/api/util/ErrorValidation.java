package com.common.api.util;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import com.common.api.constant.APIFixedConstant;
import com.common.api.resource.DepartmentService;
import com.common.api.response.Department;
import com.common.api.resource.StudentService;
import com.common.api.response.Student;

@Component
public class ErrorValidation extends APIFixedConstant {
	   
	   @Autowired
	   DepartmentService departmentService;
	   
	   @Autowired
	   NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	   @Autowired
	   private StudentService studentDao;
		
	   private final List<String> errors = new ArrayList<>();
	   
	    public void addError(String error) {
	            errors.add(error);
	    }
	    
	    public void addErrors(List<String> error) {
            errors.addAll(error);
    }

	    public List<String> getErrors() {
	        return errors;
	    }
    
	  
	    
    public ErrorValidation validateInput(Optional<Integer> id, Optional<Object> input) {
 	
        ErrorValidation errorResponse = new ErrorValidation();      
        ValidateUtil validateUtil = new ValidateUtil();
        
        if (id.isPresent()) {
            Integer idValue = id.get();
            if (idValue < 0) {
                errorResponse.addError(INVALID_ID_FORMAT);
            } 
        }
	    
   
        if(input.isPresent()){
        	input.ifPresent(inputValue -> {           
            if(inputValue instanceof Department) {
    			Department department = (Department) inputValue;
    			validateUtil.validateStringField(department.getDepartmentName(), "department_name", Optional.of(NAME_REGEX));
    			errorResponse.addErrors(validateUtil.getErrors());
    		}
                       
        });
    
        }	
	    
         if(input.isPresent()){
        	input.ifPresent(inputValue -> {           
            
            if(inputValue instanceof Student) {
            	Student student = (Student) inputValue;
            	validateUtil.validateIntegerField(student.getDepartmentId(),"Department_id",Optional.of(ID_REGEX));
            	validateUtil.validateStringField(student.getStudentName(), "Student_name", Optional.of(NAME_REGEX));
            	validateUtil.validateDateField(student.getDateOfBirth(), "Date_of_birth", "yyyy-MM-dd", Optional.of(DATE_REGEX));
            	validateUtil.validateStringField(student.getGender(), "Gender", Optional.of(GENDER_REGEX));            	
            	validateUtil.validateLongField(student.getContactNumber(), "Contact Number", Optional.of(PHONE_NUMBER_REGEX));
            	validateUtil.validateStringField(student.getEmail(), "Email", Optional.of(EMAIL_ADDRESS_REGEX));
            	errorResponse.addErrors(validateUtil.getErrors());
            }
                       
        });
    }
        
	  
        return errorResponse;
    }

 
}
