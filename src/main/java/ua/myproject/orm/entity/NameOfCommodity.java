package ua.myproject.orm.entity;

import java.util.*;

import javax.persistence.*;


import lombok.*;


@Entity
@Table(name="name_of_commodity")
@NoArgsConstructor
@Setter @Getter

public class NameOfCommodity extends BaseEntity {
	
	
	
	
	
	@Column(name="full_name_of_commodity",length=30)
	private String fullNameOfCommodity;
	
	
	
	
	@OneToMany(mappedBy="nameOfCommodity")
	private List<Commodity> commodities=new ArrayList<>();
	
	
	
	

}
