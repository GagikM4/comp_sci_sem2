package pkg;

public class Robot {		
	private int[] hall;
	private int pos;
	private boolean facingRight;
	int i = 0;
	
	private boolean forwardMoveBlocked(){
		if(pos == hall.length || pos == 0){
			return true;
		}
		else
		return false;
	}
	private void move(){
		if(hall[pos] == 0){
			if(pos == hall.length){
				facingRight = false;
				while(hall[pos] == 0){
					i++;
					pos--;
				}
				return;
			}
			if(facingRight == true){
				i++;
				pos++;
				return;
			}
		}
		else
		hall[pos] = hall[pos] - 1;
		i++;
		return;
	}
	public int clearHall(){
		int c = i;
		for(int l = 0; l<hall.length; l++){
			if(hall[pos] != 0){
				break;
			}
			else
			return c;
		}
		return c;
	}
	public boolean hallsClear(){
		int c = i;
		for(int l = 0; l<hall.length; l++){
			if(hall[pos] != 0){
				return false;
			}
			else
			return true;
		}
		return false;
	}
}