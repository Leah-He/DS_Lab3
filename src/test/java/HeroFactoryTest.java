import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HeroFactoryTest {
	HeroInterface hero1;
	HeroInterface hero2;
	HeroInterface hero3;
	
	
	@BeforeEach
	void setUp() throws Exception {
		hero1 = HeroFactory.createHero("ELF", "WARRIOR");
		hero2 = HeroFactory.createHero("DWARF", "ARCHER");
		hero3 = HeroFactory.createHero("ROBOT", "MAGE");
	}

	@Test
	void testcreateHero() {
		
		//hero1 = HeroFactory.createHero("ELF", "WARRIOR");
		assertNotNull(hero1);// 检查是否为空
		assertEquals(25, hero1.getDEX());//20+5
		assertEquals(20, hero1.getSTR());
		assertEquals(20, hero1.getINT());
		assertEquals("ELF", hero1.getRaceName());
		assertEquals("WARRIOR", hero1.getJobName());
		
		//hero2 = HeroFactory.createHero("DWARF", "ARCHER");
		assertNotNull(hero2);// 检查是否为空
		assertEquals(20, hero2.getDEX());
		assertEquals(25, hero2.getSTR());//20+5
		assertEquals(20, hero2.getINT());
		assertEquals("DWARF", hero2.getRaceName());
		assertEquals("ARCHER", hero2.getJobName());
		
		//hero3 = HeroFactory.createHero("ROBOT", "MAGE");
		assertNotNull(hero3);// 检查是否为空
		assertEquals(20, hero3.getDEX());
		assertEquals(20, hero3.getSTR());
		assertEquals(25, hero3.getINT());//20+5
		assertEquals("ROBOT", hero3.getRaceName());
		assertEquals("MAGE", hero3.getJobName());
		
		HeroInterface hero4 = HeroFactory.createHero("ELF", "ARCHER");
	    assertNotNull(hero4);
	    assertEquals("ELF", hero4.getRaceName());
	    assertEquals("ARCHER", hero4.getJobName());
	    
	    HeroInterface hero5 = HeroFactory.createHero("DWARF", "WARRIOR");
	    assertNotNull(hero5);
	    assertEquals("DWARF", hero5.getRaceName());
	    assertEquals("WARRIOR", hero5.getJobName());
	    
	    HeroInterface hero6 = HeroFactory.createHero("ROBOT", "WARRIOR");
	    assertNotNull(hero6);
	    assertEquals("ROBOT", hero6.getRaceName());
	    assertEquals("WARRIOR", hero6.getJobName());
	    
	    HeroInterface hero8 = HeroFactory.createHero("DWARF", "MAGE");
	    assertNotNull(hero8);
	    assertEquals("DWARF", hero8.getRaceName());
	    assertEquals("MAGE", hero8.getJobName());
	    
	    HeroInterface hero7 = HeroFactory.createHero("ELF", "MAGE");
	    assertNotNull(hero7);
	    assertEquals("ELF", hero7.getRaceName());
	    assertEquals("MAGE", hero7.getJobName());
	    
	    HeroInterface hero9 = HeroFactory.createHero("ROBOT", "ARCHER");
	    assertNotNull(hero9);
	    assertEquals("ROBOT", hero9.getRaceName());
	    assertEquals("ARCHER", hero9.getJobName());
		
		
	}
	
	@Test
	void testheroAttack() {
		//WARRIOR: STR*VAL+DEX
		hero1 = HeroFactory.createHero("ELF", "WARRIOR");
		int attack1 = hero1.getSTR() * 5 + hero1.getDEX();
		assertEquals(attack1, hero1.attack(5));
		
		//ARCHER: DEX * 1.5 * Val:
		hero2 = HeroFactory.createHero("DWARF", "ARCHER");
		int attack2 = (int) (hero2.getDEX() * 1.5 * 5);
		assertEquals(attack2, hero2.attack(5));
		
		//MAGE：DEX+INT * VAL
		hero3 = HeroFactory.createHero("ROBOT", "MAGE");
		int attack3 = hero3.getDEX() + hero3.getINT() * 5;
		assertEquals(attack3, hero3.attack(5));	
	}
	
	@Test
	void testBadInput() {
		HeroInterface badhero1 = HeroFactory.createHero("BADRACE", "WARRIOR");
		assertNull(badhero1);
		
		HeroInterface badhero2 = HeroFactory.createHero("ELF", "BADJOB");
		assertNull(badhero2);
		
		HeroInterface badhero3 = HeroFactory.createHero("", "ARCHER");
		assertNull(badhero3);
		
		HeroInterface badhero4 = HeroFactory.createHero("ELF", "");
		assertNull(badhero4);		
	}
 
	@Test
	void testJobNames() {//again？？？？
        // Testing WARRIOR job name
        assertEquals("WARRIOR", hero1.getJobName());

        // Testing ARCHER job name
        assertEquals("ARCHER", hero2.getJobName());

        // Testing MAGE job name
        assertEquals("MAGE", hero3.getJobName());
    }

}
