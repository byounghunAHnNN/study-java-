package ref;

public class ProductOrderMain2 {

	public static void main(String[] args) {

		ProductOrder productOrder1 = new ProductOrder();
		initProduct(productOrder1, "�κ�" , 2000, 2);

		ProductOrder productOrder2 = new ProductOrder();
		initProduct(productOrder2, "��ġ" , 5000, 1);

		ProductOrder productOrder3 = new ProductOrder();
		initProduct(productOrder3, "�ݶ�" , 1500, 2);

		
		int totalAmount = getTotalAmount();
		System.out.println("�� ���� �ݾ�: " + totalAmount);

//		printOrders(orders);
//		 int totalAmount = getTotalAmount();
//
//		 System.out.println("�� �����ݾ� = " + totalAmount);
	}

	static void initProduct ( ProductOrder productOrder, String productName, int price, int quantity ) {
		productOrder.productName = productName;
		productOrder.price = price;
		productOrder.quantity = quantity;

		System.out.println("��ǰ�� :"+productOrder.productName + " ���� :"+ productOrder.price  + " ���� :" + productOrder.quantity );
	}

	static int getTotalAmount() {
		
		ProductOrder productOrder = new ProductOrder();
		
		int totalAmount = productOrder.price * productOrder.quantity;
		
		
//		for (ProductOrder order : orders) {totalAmount += order.price * order.quantity;
//		}
		return totalAmount;
	}
	
//	 static void printOrders(ProductOrder orders) {
//		 for (ProductOrder order : orders) {
//		 System.out.println("��ǰ��: " + order.productName + ", ����: " + 
//		order.price + ", ����: " + order.quantity);
//		        }
//		    }
}
