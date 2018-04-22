package ua.myproject.orm.entity;

import javax.persistence.*;

import lombok.*;


@Entity
@Table(name="neworder")
@NoArgsConstructor
@Setter @Getter
public class NewOrder extends BaseEntity {
	
	@Column(name="number_of_order")
	private String numberOfOrder;
	
	
	
	@Column(name="date_of_order")
	private String dateOfOrder;
	
	
	
	@ManyToOne
	@JoinColumn(name="commodity_id")
	
	private Commodity commodity; 
	
	
	
	
	@ManyToOne
	@JoinColumn(name="client_id")
	
	private Client client;
	
	
	
	
	

}
