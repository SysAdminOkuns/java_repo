
public enum MusicType {
	CLASSIC(1), JAZZ(4), ROCK(5), METAL(11);

	private int earDamageFactor;

	MusicType(int earDamageFactor) {
		this.earDamageFactor = earDamageFactor;
	}
	
	
	public int calcHearLoss(int hours) {
		return hours * this.earDamageFactor;
	}
	
	public String toString() {
		return this.name() + " - " + this.ordinal() + " - " + this.earDamageFactor;
 	}
	

}
