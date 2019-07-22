package objects.carParts;

public class Tire extends Part {
	
	public Tire(int id, String producer, String model, int seriesNumber) {
		super(id, producer, model, seriesNumber);
	}
	private String size;
	private int width;
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public Tire(int id, String producer, String model, int seriesNumber, String size, int width) {
		super(id, producer, model, seriesNumber);
		this.size = size;
		this.width = width;
	}
	
	@Override
	public String toString() {
		return "ID: " +getId()+", Producent: "+getProducer()+", Model: "+getModel()+", Numer seryjny produktu: "+getSeriesNumber()+", Rozmiar: "+getSize()+", Wielkość: "+getWidth();
	}

}
