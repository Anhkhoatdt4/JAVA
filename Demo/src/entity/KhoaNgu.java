package entity;

public class KhoaNgu {
	int iq;
	
	public KhoaNgu() {
	}
	
	public KhoaNgu(int iq) {
		this.iq = iq;
	}

	public void checkIq() {
		if (iq < 20) {
			System.out.println("Khoa ngu lam");
		}
		else {
			System.out.println("thong minh hon may thang ngu xi");
		}
	}
	@Override
	public String toString() {
		super.toString();
		return "KhoaNgu [iq=" + iq + "]";
	}
	
}
