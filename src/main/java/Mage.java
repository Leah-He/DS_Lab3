
public class Mage extends HeroJob {

	@Override
	public String getJobName() {
		// TODO Auto-generated method stub
		return "MAGE";
	}

	@Override
	public int attack(int val, HeroRace race) {
		// TODO Auto-generated method stub
		return race.getDEX() +race.getINT() * val;
	}

}
