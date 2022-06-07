package pkg;
import java.util.Scanner;
import java.util.Random;


public class Hangman {
	private String guessingWord;
	private int numTries;
	private String generateWord();
	public Hangman() {
		guessingWord = generateWord();
		numTries = 5;
	}
	public Hangman(int a){
		guesingWord = generateWord();
		numTries = a;
	}
	public int guessCheck(String letter, int start){
		for(int a = 0; a < guessingWord.length(); a++){
		if(letter == guessingWord.substring(a, a+1) || letter == guessingWord.substring(guessingWord.length())){
			return guessingWord.indexOf(letter);
		}
		}
		else{
			return (start-1);
		}
	}
	public boolean checkWin(boolean[] arr){
		for(int c = 0; c < arr.length; c++){
			if(arr[c] == guessingWord.indexOf(c, c+1)){
				return true;
			}
			if(arr[c] != guessingWord.indexOf(c, c+1)){
				return false;
			}
		
	}

}

