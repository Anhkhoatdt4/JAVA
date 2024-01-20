package persistance;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/*
 * jpa : annotation to mapping
 * hibernate : type , method annotation to mapping + processing data
 * holding properties to mapping/receiving data from table item_group
 */
@Entity
@Table(name = "item_group")
public class ItemGroup {
	
	@Id
	@Column(name = "ID")
	private Integer id ; 
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "`DESC`")
	private String description;
	
	/*
	 * tu @ManyToOne -> biet duoc nhieu item thuoc cung 1 item group
	 * Ben @OneToMany -> dung mappedBy = '' de group by items theo item group 
	   Gia tri cua mappedBy la ten cua thuoc tinh da mapping ben bang @ManyToOne
	 */
	
	
	@OneToMany(mappedBy = "itemGroup")
	
	private List<Item> items;
	
	/*
	 * JPA/Hibernate require constructor
	 */
	public ItemGroup() {
	}

	
	public ItemGroup(Integer id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	public List<Item> getItems() {
		return items;
	}
	
	@Override
	public String toString() {
		return "ItemGroup [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
	
	
}
