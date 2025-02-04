package com.example.mvc.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

	private String firstName;
	
	@NotNull(message = "last name is required")  
	@Size(min=2, message = "last name size >=2 is required")  
	private String lastName="";
	
	@Min(value=0, message="must be greater than or equal to zero")  
	@Max(value=10, message="must be less than or equal to 10")  
	private int freePasses;

	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 chars/digits")  
	private String postalCode;

}
