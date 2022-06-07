import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What Is Your Name Adventurer?");
		String name = sc.nextLine();
		System.out.println("Welcome Back Lord " + name);
		int x = 25;
		int Strenght = 10;
		int Dexterity = 10;
		int Intelligence = 15;
		int Constitution = 10;
		int Charisma = 15;
		int a = x - Strenght;
		int b = x - Dexterity;
		int c = x - Intelligence;
		int d = x - Constitution;
		int e = x - Charisma;
		int f = a - Strenght;
		int g = b - Dexterity;
		int h = c - Intelligence;
		int i = d - Constitution;
		int j = e - Charisma;
		String wizard = new String("Healing, Fire Spells, Morale Boost, Beast Summoning");
		String warrior = new String("Max Health, Resistance To Physical Attacks, Increased Chance Of Critical Strikes");
		String rouge = new String("Improved Agaility, Dual Blades, Quick Recovery, Dash, Small Distance Teleportation");
		System.out.println("Choose Your Path:");
		System.out.println("Wizard/Warrior/Rouge");
		String character = sc.nextLine();
		if(character.equals("Wizard") || character.equals("wizard"))
		{
			System.out.println("Your Abilities Are:");
			System.out.println(wizard);
		}
		else if(character.equals("Warrior") || character.equals("warrior"))
		{
			System.out.println("Your Abilities Are:");
			System.out.println(warrior);
		}
		else if(character.equals("Rouge") || character.equals("rouge"))
		{
			System.out.println("Your Abilities Are:");
			System.out.println(rouge);
		}
		else
		System.out.println("Invalid Character");
		System.out.println("Would You Like To Purchase More Skills? (Y/N)");
		String choice1 = sc.nextLine();
		if(choice1.equals("Y"))
		{
			System.out.println("Welcome To Your Character Skill Shop!");
			System.out.println("You Have " + x + " Points To Spend!");
			System.out.println("Choose Your Additional Skills:");
			System.out.println("1 – STRENGHT (Increase Strenght by 5%) – " + Strenght + " POINTS");
			System.out.println("2 – DEXTERITY (Increase Agility by 5%) – " + Dexterity + " POINTS");
			System.out.println("3 – INTELLIGENCE (Enables Your Character To Cast Magic Spells) – " + Intelligence + " POINTS");
			System.out.println("4 – CONSTITUTION (Increase Health by 10%) – " + Constitution + " POINTS");
			System.out.println("5 – CHARISMA (Enables Your Character To Have More NPC Support) – " + Charisma + " POINTS");
			System.out.println("Pick The Number Of The Skill You Would Like To Purchase My Lord");
			String skill1 = sc.nextLine();
				if(skill1.equals("1"))
				{
				System.out.println("You Have " + (x - Strenght) + " Points Left!");	
				}
				else if(skill1.equals("2"))
				{
				System.out.println("You Have " + (x - Dexterity) + " Points Left!");
				}
				else if(skill1.equals("3"))
				{
				System.out.println("You Have " + (x - Intelligence) + " Points Left!");
				}
				else if(skill1.equals("4"))
				{
				System.out.println("You Have " + (x - Constitution) + " Points Left!");
				}
				else if(skill1.equals("5"))
				{
				System.out.println("You Have " + (x - Charisma) + " Points Left!");
				}
				else 
				System.out.println("Please Choose A Valid Skill");
			System.out.println("Would You Like Purchase More Skills For Your Character? (Y/N)");
			String choice2 = sc.nextLine();
			if(choice2.equals("Y"))
			{
				System.out.println("Choose Your Additional Skills:");
				System.out.println("1 – STRENGHT (Increase Strenght by 5%) – " + Strenght + " POINTS");
				System.out.println("2 – DEXTERITY (Increase Agility by 5%) – " + Dexterity + " POINTS");
				System.out.println("3 – INTELLIGENCE (Enables Your Character To Cast Magic Spells) – " + Intelligence + " POINTS");
				System.out.println("4 – CONSTITUTION (Increase Health by 10%) – " + Constitution + " POINTS");
				System.out.println("5 – CHARISMA (Enables Your Character To Have More NPC Support) – " + Charisma + " POINTS");
				System.out.println("Pick The Number Of The Skill You Would Like To Purchase My Lord");
				String skill2 = sc.nextLine();	
					if(skill2.equals("1"))
					{
						System.out.println("You Have " + (a - Strenght) + " Points Left!");
					}
					else if(skill2.equals("2"))
					{
						System.out.println("You Have " + (b - Dexterity) + " Points Left!");
					}
					else if(skill2.equals("3"))
					{
						if(c-Intelligence<5)
						{
							System.out.println("Insufficient Amount Of Points");
						}
						else if(c-Intelligence>=5)
							System.out.println("You Have " + (c - Intelligence) + " Points Left!");
					}
					else if(skill2.equals("4"))
					{
						System.out.println("You Have " + (d - Constitution) + " Points Left!");
					}
					else if(skill2.equals("5"))
					{
						if(e-Charisma<5)
						{
							System.out.println("Insufficient Amount Of Points");
						}
						else if(c-Charisma>=5)
							System.out.println("You Have " + (e - Charisma) + " Points Left!");
					}
					else
					System.out.println("Please Choose A Valid Skill");
				System.out.println("Would You Like Purchase More Skills For Your Character? (Y/N)");
				String choice3 = sc.nextLine();
				if(choice3.equals("Y"))
				{
					System.out.println("Choose Your Additional Skills:");
					System.out.println("1 – STRENGHT (Increase Strenght by 5%) – " + Strenght + " POINTS");
					System.out.println("2 – DEXTERITY (Increase Agility by 5%) – " + Dexterity + " POINTS");
					System.out.println("3 – INTELLIGENCE (Enables Your Character To Cast Magic Spells) – " + Intelligence + " POINTS");
					System.out.println("4 – CONSTITUTION (Increase Health by 10%) – " + Constitution + " POINTS");
					System.out.println("5 – CHARISMA (Enables Your Character To Have More NPC Support) – " + Charisma + " POINTS");
						System.out.println("Pick The Number Of The Skill You Would Like To Purchase My Lord");
						String skill3 = sc.nextLine();	
						if(skill3.equals("1"))
						{
							if(f-Strenght<5)
							{
								System.out.println("Insufficient Amount Of Points");
							}
							else
								System.out.println("You Have " + (f - Strenght) + " Points Left!");
						}
						else if(skill3.equals("2"))
						{
							if(g-Dexterity<5)
							{
								System.out.println("Insufficient Amount Of Points");
							}
							else
								System.out.println("You Have " + (g - Dexterity) + " Points Left!");
						}
						else if(skill3.equals("3"))
						{
							if(h-Intelligence<5)
							{
								System.out.println("Insufficient Amount Of Points");
							}
							else if(h-Intelligence>=5)
								System.out.println("You Have " + (h - Intelligence) + " Points Left!");
						}
						else if(skill3.equals("4"))
						{
							if(i-Constitution<5)
							{
								System.out.println("Insufficient Amount Of Points");
							}
							else if(i-Constitution>=5)
								System.out.println("You Have " + (i - Constitution) + " Points Left!");
						}
						else if(skill3.equals("5"))
						{
							if(j-Charisma<5)
							{
								System.out.println("Insufficient Amount Of Points");
							}
							else if(j-Charisma>=5)
								System.out.println("You Have " + (j - Charisma) + " Points Left!");
						}
						else
						System.out.println("Please Choose A Valid Skill");
				}
				else if(choice3.equals("N"))
				System.out.println("Goodbye My Lord");
			}
			else if(choice2.equals("N"))
			System.out.println("Goodbye My Lord");
		}
		else if(choice1.equals("N"))
		System.out.println("Goodbye My Lord");

	}
}
