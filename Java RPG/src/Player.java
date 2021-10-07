
public class Player
	{
		private String name;
		private int hitPoints;
		private int executionPoints;
		private int levelOfViolence;
		private int gold;
		private int weapon;
		private int armor;
		public Player (String n, int hp, int exp, int lv, int g, int wea, int arm)
			{
				name = n;
				hitPoints = hp;
				executionPoints = exp;
				levelOfViolence = lv;
				gold = g;
				weapon = wea;
				armor = arm;
			}
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name = name;
			}
		public int getHitPoints()
			{
				return hitPoints;
			}
		public void setHitPoints(int hitPoints)
			{
				this.hitPoints = hitPoints;
			}
		public int getExecutionPoints()
			{
				return executionPoints;
			}
		public void setExecutionPoints(int executionPoints)
			{
				this.executionPoints = executionPoints;
			}
		public int getLevelOfViolence()
			{
				return levelOfViolence;
			}
		public void setLevelOfViolence(int levelOfViolence)
			{
				this.levelOfViolence = levelOfViolence;
			}
		public int getWeapon()
			{
				return weapon;
			}
		public void setWeapon(int weapon)
			{
				this.weapon = weapon;
			}
		public int getArmor()
			{
				return armor;
			}
		public void setArmor(int armor)
			{
				this.armor = armor;
			}
		public int getGold()
			{
				return gold;
			}
		public void setGold(int gold)
			{
				this.gold = gold;
			}		
	}
