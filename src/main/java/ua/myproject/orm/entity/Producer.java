package ua.myproject.orm.entity;

import java.util.*;

import javax.persistence.*;


import lombok.*;


@Entity
@Table(name="producer")
@NoArgsConstructor
@Setter @Getter
public class Producer extends BaseEntity {
	
	
	@Column(name="first_name",length=25)
	private String firstName;
	
	
	
	@Column(name="last_name",length=25)
	private String lastName;
	
	
	
	@Column(name="number_of_certificate")
	private String numberOfСertificate;
	
	
	
	@OneToMany(mappedBy="producer")
	
	
	private List<Commodity> commodities=new ArrayList<>();

}
