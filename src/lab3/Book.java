package lab3;

public class Book {
	private String name,author;
	private float price;
	private int numberOfPages;
	public Book(String name, String author, float price, int numberOfPages) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.numberOfPages = numberOfPages;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	@Override
	public String toString() {
		return "Book [Name=" + name + ", Author=" + author + ", Price=" + price + ", Pages=" + numberOfPages
				+ "]";
	}
}
