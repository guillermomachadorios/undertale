
public class Monster
	{
		private String name;
		private int hitPoints;
		private int sparePoints;
		private int executionPoints;
		private int goldGiven;
		private int attack;
		private int defence;
		private boolean alive;
		public Monster (String n, int hp, int sp, int exp, int gg, int atk, int def, boolean al)
			{
				name = n;
				hitPoints = hp;
				sparePoints = sp;
				executionPoints = exp;
				goldGiven = gg;
				attack = atk;
				defence = def;
				alive = al;
			}
		public boolean isAlive()
			{
				return alive;
			}
		public void setAlive(boolean alive)
			{
				this.alive = alive;
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
		public int getDefence()
			{
				return defence;
			}
		public void setDefence(int defence)
			{
				this.defence = defence;
			}
		public int getGoldGiven()
			{
				return goldGiven;
			}
		public void setGoldGiven(int goldGiven)
			{
				this.goldGiven = goldGiven;
			}
		public int getSparePoints()
			{
				return sparePoints;
			}
		public void setSparePoints(int sparePoints)
			{
				this.sparePoints = sparePoints;
			}
		public int getAttack()
			{
				return attack;
			}
		public void setAttack(int attack)
			{
				this.attack = attack;
			}
		
		
		
		
	}
