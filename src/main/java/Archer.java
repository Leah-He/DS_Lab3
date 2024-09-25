
public class Archer extends HeroJob {

	@Override
	public String getJobName() {
		// TODO Auto-generated method stub
		return "ARCHER";
	}

	@Override
	public int attack(int val, HeroRace race) {
		// TODO Auto-generated method stub
		return (int)(race.getDEX() * 1.5 * val);
	}

}
