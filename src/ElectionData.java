import java.util.Observable;

public class ElectionData extends Observable
{   
	private State[] states;
	

	
    public ElectionData ()
    {
    	states = new State[5];
    	 states[0] = new State ("New York");
   	     states[1] = new State("New Jersey");
         states[2] = new State ("Florida");
         states[3] = new State ("Texas");
         states[4] = new State ("Maryland");
         
    }
    
    public void setData (int [] demVotes, int [] repubVotes, int [] electoralVotes)
    {
    	
    	setChanged();
    	// uses push - sends it the updated object to use
    	notifyObservers(new ElectionStats(demVotes,repubVotes,electoralVotes));
    }
    
    
    
   
	
    
	
	// uses push method so creates object for new information that will be pushed
    public  class ElectionStats
     {
    	 
    	 // constructor to set all the values
    	 public ElectionStats (int [] demVotes, int [] repubVotes, int [] electoralVotes)
    	 {
    		 int index = 0;
    		 while (index < 5)
    		 {
    			 states[index].setDemocratVotes(demVotes[index]);
    			 states[index].setRepublicanVotes(repubVotes[index]);
    			 states[index].setElectoralVotes(electoralVotes[index]);
    			 index++;
    		 }
    	 }
    	 
    	 public State [] getStates()
    	 {   
    		 return states;
    			 
    	 }
    	 
    	 
     }
    
    
    
    
    
    
    
    
    
}
