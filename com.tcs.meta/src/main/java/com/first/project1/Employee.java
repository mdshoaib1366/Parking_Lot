package com.first.project1;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
*/
@Data
@RequiredArgsConstructor
public class Employee {
	@NonNull
	private String empId;
	
	private String empName;
//	private long mobile;
//	private long AdhaarNumber;
}
