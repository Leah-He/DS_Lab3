public class HeroFactory
{
   public static HeroInterface createHero(String raceName, String jobName)   
   {
	   HeroJob job = null;
	   HeroRace race = null;
	   
	   //race:
	   if (raceName.equalsIgnoreCase("ELF")) {
		   race = new Elf();
	   } else if (raceName.equalsIgnoreCase("DWARF")) {
		   race = new Dwarf();
	   } else if (raceName.equalsIgnoreCase("ROBOT")) {
		   race = new Robot();
	   } else {
		   return null;
	   }
	   
	   //Job:
	   if (jobName.equalsIgnoreCase("WARRIOR")) {
		   job = new Warrior();
	   } else if (jobName.equalsIgnoreCase("ARCHER")) {
		   job = new Archer();
	   } else if (jobName.equalsIgnoreCase("MAGE")) {
		   job = new Mage();
	   } else {
		   return null;
	   }
	  
	   return new Hero(job, race);
	   
   }
   
   







}