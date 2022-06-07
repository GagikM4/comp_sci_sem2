package pkg;
import java.util.Scanner;
import java.util.Random;

public interface Role {
	public void attack(Warrior a);
	public void attack(Wizard a);
	public void setHealth(int health);
	public void setName(String name);
	public int getHealth();
	public String getName();
}