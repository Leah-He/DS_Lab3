
public class Warrior extends HeroJob {

	@Override
	public String getJobName() {
		// TODO Auto-generated method stub
		return "WARRIOR";
	}

	@Override
	public int attack(int val, HeroRace race) {
		// TODO Auto-generated method stub
		return race.getSTR() * val +race.getDEX();
	}

}
