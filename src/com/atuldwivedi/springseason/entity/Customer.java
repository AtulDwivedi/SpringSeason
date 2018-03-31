package com.atuldwivedi.springseason.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.atuldwivedi.springseason.mvc.valid.BatchCode;

import lombok.Data;

@Data
@Entity
@Table(name = "CUSTOMER")
public class Customer {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	@NotNull(message = "is required")
	@Column(name = "EMAIL")
	private String email;

	@NotNull(message = "is required")
	@Size(min = 2, message = "minimum lenght is 2")
	@Column(name = "FIRST_NAME")
	private String firstName;

	@Size(min = 2, message = "minimum lenght is 2")
	@Column(name = "LAST_NAME")
	private String lastName;

	/*
	 * @NotNull(message="is required")
	 * 
	 * @Min(value=18,
	 * message="customer age should be greater than or equal to 18 years")
	 * 
	 * @Max(value=100,
	 * message="customer age should be less than or equal to 100 years") private
	 * int age;
	 */

	@Min(value = 18, message = "customer age should be greate than or equal to 18 years")
	@Max(value = 100, message = "customer age should be less than or equal to 100 years")
	@Column(name = "AGE")
	private Integer age;

	@Pattern(regexp = "^[a-zA-Z0-9]{10}", message = "only 10 chars/digits")
	@Column(name = "PAN_CARD_NBR")
	private String panCardNumber;

	@BatchCode(value = "Male", message = "Suffix should be Male")
	@Column(name = "GENDER")
	private String gender;

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@Past
	@Column(name = "DOB")
	private Date dob;

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@Future
	@Column(name = "MEM_EXPR_DATE")
	private Date membershipExpiryDate;
}
