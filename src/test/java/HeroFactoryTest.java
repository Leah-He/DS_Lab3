import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HeroFactoryTest {
	HeroInterface hero1;
	HeroInterface hero2;
	HeroInterface hero3;
	
	
	
	
	
	@BeforeEach
	void setUp() throws Exception {
		hero1 = HeroFactory.createHero("ELF", "WARROR");
		hero2 = HeroFactory.createHero("DWARE", "ARCHE");
		hero3 = HeroFactory.createHero("ROBOT", "MAGE");
	}

	@Test
	void testcreateHero() {
		fail("Not yet implemented");
		hero1 = HeroFactory.createHero("ELF", "WARROR");
		assertNotNull(hero1);// 检查是否为空
		assertEquals(25, hero1.getDEX());
		assertEquals(20, hero1.getSTR());
		assertEquals(20, hero1.getINT());
		assertEquals("ELF", hero1.getRaceName());
		assertEquals("WARRIOR", hero1.getJobName());
		
		hero2 = HeroFactory.createHero("DWARF", "ARCHER");
		assertNotNull(hero2);// 检查是否为空
		assertEquals(25, hero2.getDEX());
		assertEquals(20, hero2.getSTR());
		assertEquals(20, hero2.getINT());
		assertEquals("DWARF", hero2.getRaceName());
		assertEquals("ARCHER", hero2.getJobName());
		
		hero1 = HeroFactory.createHero("ROBOT", "MAGE");
		assertNotNull(hero1);// 检查是否为空
		assertEquals(25, hero3.getDEX());
		assertEquals(20, hero3.getSTR());
		assertEquals(20, hero3.getINT());
		assertEquals("ROBOT", hero3.getRaceName());
		assertEquals("MAGE", hero3.getJobName());
	}
	
	@Test
	void testheroAttack() {
		hero1 = HeroFactory.createHero("ELF", "WARROR");
		int attack1 = hero1.getSTR() * 2 + hero1.getDEX();
		assertEquals(attack1, hero1.attack(2));
		
		hero2 = HeroFactory.createHero("DWARF", "ARCHER");
		int attack2 = hero2.getSTR() * 2 + hero2.getDEX();
		assertEquals(attack2, hero2.attack(2));
		
		hero3 = HeroFactory.createHero("ROBOT", "MAGE");
		int attack3 = hero3.getSTR() * 2 + hero3.getDEX();
		assertEquals(attack3, hero3.attack(2));
	}

}
