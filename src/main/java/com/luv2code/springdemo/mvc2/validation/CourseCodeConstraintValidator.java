package com.luv2code.springdemo.mvc2.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator
	implements ConstraintValidator<CourseCode, String> {
	
	private String[] coursePrefixes;

	@Override
	public void initialize(CourseCode theCourseCode) {
		// TODO Auto-generated method stub
		coursePrefixes = theCourseCode.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {
		// TODO Auto-generated method stub
		if (theCode != null) {
			for (String tempPrefix : coursePrefixes) {
				if (theCode.startsWith(tempPrefix)) {
					return true;
				}
			}
		} else {
			return true;
		}
		
		return false;
	}

	
}
