package persistance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "item")
public class Item {
	
	@Id
	@Column(name = "id")
	private Integer id ;
	@Column(name = "name")
	private String name;
	@Column(name = "color")
	private String color;
	@Column(name = "buy_Price")
	private Double buyPrice;
	@Column(name = "sell_price")
	private Double sellPrice;
	@Column(name = "meterial")
	private String meterial;
	
	/*
	 * JPA/Hibernate require constructor
	 */
	public Item() {
	}

	
	
	
	
	public Item(Integer id, String name, String color, Double buyPrice, Double sellPrice, String meterial,
			ItemGroup itemGroup) {
		this.id = id;
		this.name = name;
		this.color = color;
		this.buyPrice = buyPrice;
		this.sellPrice = sellPrice;
		this.meterial = meterial;
		this.itemGroup = itemGroup;
	}





	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(Double buyPrice) {
		this.buyPrice = buyPrice;
	}

	public Double getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(Double sellPrice) {
		this.sellPrice = sellPrice;
	}

	public String getMeterial() {
		return meterial;
	}

	public void setMeterial(String meterial) {
		this.meterial = meterial;
	}
	public ItemGroup getItemGroup() {
		return itemGroup;
		}
	
	

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", color=" + color + ", buyPrice=" + buyPrice + ", sellPrice="
				+ sellPrice + ", meterial=" + meterial + "] , itemGroup= "+ itemGroup;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ITEM_GROUP_ID", referencedColumnName = "ID", nullable = false)
//	@Transient
	private ItemGroup itemGroup;
	
	
}
