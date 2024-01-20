package bean;

public class ItemGroup {
	private Integer id ;
	private String name ;
	private String desc ;
	public ItemGroup() {
	
	}
	public ItemGroup(Integer id, String name, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
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
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "ItemGroup [id=" + id + ", name=" + name + ", description=" + desc + "]";
	}
	
}
