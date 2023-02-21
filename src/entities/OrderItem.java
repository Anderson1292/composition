package entities;

public class OrderItem {

	private int quantity;
	private double price;
	private Product product;
	
	public OrderItem() {
	}
	public OrderItem(int quantity, double price,Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}
	public double getPrice() {
		return price;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getQuantity() {
		return quantity;
	}
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public double subTotal() {
		return price * quantity;
	}
	public String toString() {
		return getProduct().getName()
				+ ", $"
				+ String.format("%.2f", price)
				+ ", Quantity: "
				+ quantity
				+ ", Subtottal: $"
				+ String.format("%.2f", subTotal());
	}
}
