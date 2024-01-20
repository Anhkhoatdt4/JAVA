package view;

public class ClassicalBook extends Book{
	private boolean status;
	public ClassicalBook() {
	}
//	
//	this : doi tuong hien tai , cac thuoc tinh o class hien tai va class / interface cha
//	super : doi tuong cha , goi cac thuoc tinh, ham` o class / interface cha
	public ClassicalBook(String id , double price , String publisher ,boolean status) {
		super(id , price , publisher);
		this.status = status;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return super.toString() + " , " + status;
	}
	
	
}
