import java.time.LocalTime;
import java.util.Observable;
import java.util.Observer;

public  class BasicReporter implements Observer
{
    
	protected IPopularVote popVote;
	protected IElectoralVote electVote;
	private State [] states;
	private String popVoteReport;
	private String electVoteReport;
	protected int reporterNum;
	
	public BasicReporter (Observable observable)
   {
	  observable.addObserver(this);
	  
   }
	
	public void update (Observable observable, Object stateObj)
	{
		if (stateObj instanceof ElectionData.ElectionStats)
		{
			ElectionData.ElectionStats electionStats = (ElectionData.ElectionStats)  stateObj;
			
			states = electionStats.getStates();
			
			// now call the methods that will distort the data - different implementation will be called 
			// based on how popVote and electVote were instantiated.
			popVoteReport = popVote.reportPopularVote(states);
			electVoteReport = electVote.reportElectoralVote(states);
			
			String legalMessage = legalMessage();
			display(popVoteReport,electVoteReport);
			
			
			
		}
	}
	
	
	
	
	
	public String legalMessage()
	{
		LocalTime currentTime= LocalTime.now();
		
		String legalMessage = ("\nThe time is now " + currentTime + ". \nAll reports are purely observational and are not legally binding in any way.");
		return legalMessage;
	}
	
	
	//abstract String display(String electVoteReport);
	public void display(String popVoteReport,String electVoteReport)
	{  
		
		System.out.println("\nReporter #" + reporterNum + " :");
		System.out.println("\n" + popVoteReport + "\n\n" + electVoteReport);
		System.out.println(legalMessage());
	}
   
   
}










