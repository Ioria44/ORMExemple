package ua.myproject.orm.entity;

import java.util.*;

import javax.persistence.*;


import lombok.*;

@Entity
@Table(name="client")
@NoArgsConstructor
@Setter @Getter
public class Client extends BaseEntity {
	
	





	@Column(name="first_name")
	private String firstName;
	
	
	@Column(name="last_name")
	private String lastName;
	
	
	
	
	@Column(name="country")
	private String country;
	
	
	
	
	
	@Column(name="number_of_passport")
	private String numberOfPassport;
	
	
	
	
	@Column(name="number_of_phone")
	private String numberOfPhone;
	
	
	
	
	
	@OneToMany(mappedBy="client")
	
	
	private List<NewOrder> orders=new ArrayList<>();
	
	
	
	
	

}
