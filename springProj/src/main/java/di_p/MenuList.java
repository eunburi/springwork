package di_p;

public class MenuList {
	
	public Menu order_am() {
		System.out.println("아침드세용~");
		return new Menu("밥","국");
	}
	
	public Menu order_an() {
		System.out.println("점심드세용~");
		return new Menu("밥","국");
	}
	
	public Menu order_dn() {
		System.out.println("저녁드세용~");
		return new Menu("밥","국");
	}
	
	public Menu desert() {
		System.out.println();
		return new Menu("케이크","사과");
	
	}

}
