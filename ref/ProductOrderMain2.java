package ref;

public class ProductOrderMain2 {

	public static void main(String[] args) {

		ProductOrder productOrder1 = new ProductOrder();
		initProduct(productOrder1, "두부" , 2000, 2);

		ProductOrder productOrder2 = new ProductOrder();
		initProduct(productOrder2, "김치" , 5000, 1);

		ProductOrder productOrder3 = new ProductOrder();
		initProduct(productOrder3, "콜라" , 1500, 2);

		
		int totalAmount = getTotalAmount();
		System.out.println("총 결제 금액: " + totalAmount);

//		printOrders(orders);
//		 int totalAmount = getTotalAmount();
//
//		 System.out.println("총 결제금액 = " + totalAmount);
	}

	static void initProduct ( ProductOrder productOrder, String productName, int price, int quantity ) {
		productOrder.productName = productName;
		productOrder.price = price;
		productOrder.quantity = quantity;

		System.out.println("상품명 :"+productOrder.productName + " 가격 :"+ productOrder.price  + " 수량 :" + productOrder.quantity );
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
//		 System.out.println("상품명: " + order.productName + ", 가격: " + 
//		order.price + ", 수량: " + order.quantity);
//		        }
//		    }
}
