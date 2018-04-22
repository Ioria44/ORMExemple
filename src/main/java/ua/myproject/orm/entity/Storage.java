package ua.myproject.orm.entity;

import javax.persistence.*;


import lombok.*;


@Entity
@Table(name="storage")
@NoArgsConstructor
@Setter @Getter
public class Storage extends BaseEntity {
	
	
	
	@Column(name="number_commodity")
	private int numberCommodity;
	

}
