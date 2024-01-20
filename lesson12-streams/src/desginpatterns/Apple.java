package desginpatterns;

import java.util.Objects;

public class Apple {
		private String id;
		private String color ;
		private double weight; 
		private String original;
		
		public Apple() {
			
		}

		public Apple(String id, String color, double weight, String original) {
			super();
			this.id = id;
			this.color = color;
			this.weight = weight;
			this.original = original;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public double getWeight() {
			return weight;
		}

		public void setWeight(double weight) {
			this.weight = weight;
		}

		public String getOriginal() {
			return original;
		}

		public void setOriginal(String original) {
			this.original = original;
		}

		@Override
		public String toString() {
			return "Apple [id=" + id + ", color=" + color + ", weight=" + weight + ", original=" + original + "]";
		}
		
		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (! (o instanceof Apple))return false;
			
			Apple that = (Apple)o;
			return getId().equals(that.getId());
		
		}
		
		@Override
		public int hashCode() {
		return Objects.hash(getId());
		}
		
	
	
}