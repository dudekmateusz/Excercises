package objects.carParts;

public class ExhaustPart extends Part{

	public ExhaustPart(int id, String producer, String model, int seriesNumber) {
		super(id, producer, model, seriesNumber);
	}

	private boolean isCompatibleWithTheEuropeanEmissionStandard;

	public boolean isCompatibleWithTheEuropeanEmissionStandard() {
		return isCompatibleWithTheEuropeanEmissionStandard;
	}

	public void setCompatibleWithTheEuropeanEmissionStandard(boolean isCompatibleWithTheEuropeanEmissionStandard) {
		this.isCompatibleWithTheEuropeanEmissionStandard = isCompatibleWithTheEuropeanEmissionStandard;
	}

	public ExhaustPart(int id, String producer, String model, int seriesNumber,
			boolean isCompatibleWithTheEuropeanEmissionStandard) {
		super(id, producer, model, seriesNumber);
		this.isCompatibleWithTheEuropeanEmissionStandard = isCompatibleWithTheEuropeanEmissionStandard;
	}
	
	@Override
	public String toString() {
		return "ID: " +getId()+", Producent: "+getProducer()+", Model: "+getModel()+", Numer seryjny produktu: "+getSeriesNumber()+", Zgodność z europejskim standardem emisji spalin: "+isCompatibleWithTheEuropeanEmissionStandard();
	}
}
