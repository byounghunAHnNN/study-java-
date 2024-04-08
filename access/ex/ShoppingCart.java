package access.ex;

public class ShoppingCart {

	private Item[] items = new Item[10];
	private int itemCount;


	public void addItem(Item item ) {
		
		if (itemCount >= items.length) {
			System.out.println("��ٱ��ϰ� ���� á���ϴ�.");
			return;
		}
		
		items[itemCount] = item;
		itemCount++;
	}
	
	public void displayItems() {
		System.out.println("��ٱ��� ��ǰ ���");
		
		for (int i = 0; i < itemCount; i++) {
			Item item = items[i];
			System.out.println("��ǰ�� : " + item.getName() + ", �հ�: " + item.getTotalPrice());
		}
		System.out.println("��ü ���� �� :" + calculateTotalPrice());
	}
	
	private int calculateTotalPrice() {
		int totalPrice =0;
		for (int i = 0; i < itemCount; i++) {
			Item item = items[i];
			totalPrice += item.getTotalPrice();
		}
		
		return totalPrice;
	}
}
