
// favors Republicans

public class ElectoralCollege1StateRepubStrategy1 implements IElectoralVote {

	public ElectoralCollege1StateRepubStrategy1 ()
	{
		
	}
	
	public String reportElectoralVote(State [] states)
	{   
		int index=0;
		StringBuilder output = new StringBuilder();
		
		int repElectVotes = 0 ;
		int demElectVotes = 0;
		
		while (index < 5)
		{  
			if (index == 2)  // state of Florida is programmed to go republican no matter what.
			{
				output.append("\n\t" + states[index].getStateName() + ": Republican party is winning.");
				repElectVotes += states[index].getElectoralVotes();
			}
			
			else if (states[index].getDemocratVotes() > states[index].getRepublicanVotes())
			{
		     output.append("\n\t" + states[index].getStateName() + ": Democrat Party is winning." );
		     demElectVotes += states[index].getElectoralVotes();
			}
			
			else // republican votes are more than democrat votes for that state
			{
				output.append("\n\t" + states[index].getStateName() + ": Republican Party is winning." );
				repElectVotes += states[index].getElectoralVotes();
			}
			
			
			index++;
		}
		
		
		output.append("\n\n\tFor the states combined: Republicans have " + repElectVotes + " electoral votes, Democrats have " + demElectVotes+" electoral votes.");
		
		return output.toString();
	}

}
