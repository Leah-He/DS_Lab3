
public class Hero implements HeroInterface{
	private HeroJob job;
	private HeroRace race;//为什么是private？？？？
	
	public Hero(HeroJob job, HeroRace race) {
		this.job = job;
		this.race = race;
		
	}

	@Override
	public int attack(int val) {
		// TODO Auto-generated method stub
		return job.attack(val, race);
	}

	@Override
	public int getSTR() {
		// TODO Auto-generated method stub
		return race.getSTR();
	}

	@Override
	public int getDEX() {
		// TODO Auto-generated method stub
		return race.getDEX();
	}

	@Override
	public int getINT() {
		// TODO Auto-generated method stub
		return race.getINT();
	}

	@Override
	public String getRaceName() {
		// TODO Auto-generated method stub
		return race.getRaceName();
	}

	@Override
	public String getJobName() {
		// TODO Auto-generated method stub
		return job.getJobName();
	}
	

}
