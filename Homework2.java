package secondTask;

import java.util.ArrayList;
import java.util.Observer;

public class Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public class Boxing implements Subject {
		
		private ArrayList<Observer> boxers = new ArrayList<>();

		@Override
		public void addObserver(Observer o) {
			// TODO Auto-generated method stub
			this.boxers.add(o);
		}

		@Override
		public void removeObserver(Observer o) {
			// TODO Auto-generated method stub
			boxers.remove(boxers.indexOf(o));
		}

		@Override
		public void notifyObservers() {
			// TODO Auto-generated method stub
			
		}	
	}
}
