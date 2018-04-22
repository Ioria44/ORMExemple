package ua.myproject.orm.entity;

import java.util.*;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name="commodity")
@NoArgsConstructor
@Setter @Getter
public class Commodity extends BaseEntity {
	
	
	@Column(name="model",length=30)
	private String model;
	
	



	@Column(name="date_of_produce")
	private String dateOfProduce;
	
	
	
	@Column(name="guarantee")
	private double guarantee;
	
	
	@Column(name="price")
	private double price;
	
	


	
	
	@ManyToOne
	@JoinColumn(name="producer_id")
	
	private Producer producer;
	
	
	
	@ManyToOne
	@JoinColumn(name="name_of_commodity_id")
	private NameOfCommodity nameOfCommodity;
	
	
	
	
	
	@OneToOne
	@JoinColumn(name="storage_id")
	private Storage storage;
	
	
	
	
	@OneToMany(mappedBy="commodity")
	
	private List<NewOrder> orders=new ArrayList<>();
	
	

}
