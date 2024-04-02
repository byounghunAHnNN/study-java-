package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�Է��� �ֹ��� ������ �Է��ϼ���: ");
		int n = scanner.nextInt();
		scanner.nextLine();
		
		ProductOrder[] orders = new ProductOrder[n];
		
		for (int i =0; i<orders.length; i++) {
			System.out.println((i + 1) + "��° �ֹ� ������ �Է��ϼ���. ");
			
			System.out.println("��ǰ�� :");
			String productName = scanner.nextLine();
			
			System.out.println("���� :");
			int price = scanner.nextInt();
			
			System.out.println("���� :");
			int quantity = scanner.nextInt();
			
			scanner.nextLine(); 
			
			orders[i] = createOrder(productName,  price, quantity);
		}
		
		 printOrders(orders);
		 int totalAmount = getTotalAmount(orders);
		 System.out.println("�� ���� �ݾ�: " + totalAmount);
		
	}
		static ProductOrder createOrder(String productName, int price, int quantity) {
			ProductOrder order1 = new ProductOrder();
			order1.productName = productName;
			order1.price = price;
			order1.quantity = quantity;
			
			return order1;
		}
		
		static void printOrders(ProductOrder[] orders) {
			for (ProductOrder order : orders) {
				System.out.println("��ǰ�� :" + order.productName + ", ����: " + order.price + ", ���� " + order.quantity);
			}
		}
		
		 static int getTotalAmount(ProductOrder[] orders) {
			 int totalAmount = 0;
			 for (ProductOrder order : orders) {
			            totalAmount += order.price * order.quantity;
			        }
			 return totalAmount;
		 }
	}


