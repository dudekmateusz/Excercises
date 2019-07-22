package objects.carParts;

public class Part {
	
	private int id;
	private String producer;
	private String model;
	private int seriesNumber;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSeriesNumber() {
		return seriesNumber;
	}
	public void setSeriesNumber(int seriesNumber) {
		this.seriesNumber = seriesNumber;
	}
	public Part(int id, String producer, String model, int seriesNumber) {
		super();
		this.id = id;
		this.producer = producer;
		this.model = model;
		this.seriesNumber = seriesNumber;
	}
	@Override
	public String toString() {
		
		return "ID: " +getId()+", Producent: "+getProducer()+", Model: "+getModel()+", Numer seryjny produktu: "+getSeriesNumber();
	}
	

}
