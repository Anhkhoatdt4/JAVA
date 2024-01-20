package example;

public class MouseAppDemo {
	public static void main(String[] args) {
		MouseEvent event = new MouseClickEvent() {
			
			@Override
			public void onMousePress() {
			System.out.println("hello");
				
			}
		};
		button(event);
	}
	private static void button (MouseEvent event) {
		event.onMousePress();
	}
}
