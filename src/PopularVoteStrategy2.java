
// this strategy favors democrat

public class PopularVoteStrategy2 implements IPopularVote

{
	public PopularVoteStrategy2()
	{
		
	}
	
	//favors democrat by not reporting the state with most republican votes
	
	public String reportPopularVote(State [] states)
	{
		StringBuilder output = new StringBuilder();
		
		String maxState = states[0].getStateName();
		int max=states[0].getRepublicanVotes();   // set the max to the 1st one
		int index = 1;
		int ttlRepubVotes = 0;
		int ttlDemVotes = 0;
		
		while (index < 5)
		{
			if (states[index].getRepublicanVotes() > max )
			{
				max = states[index].getRepublicanVotes();
				maxState = states[index].getStateName();
			}
			
			index ++;
		}
		
		index =0;
		while (index < 5)
		{
			if (!states[index].getStateName().equals(maxState))
					{
				      output.append("\n\tRepublican votes for " + states[index].getStateName() + ": "+ states[index].getRepublicanVotes());
				      ttlRepubVotes += states[index].getRepublicanVotes();
					}
			
			index++;
		}
		
		output.append("\n");
		
		index = 0;
		
		while (index < 5)
		{
			output.append("\n\tDemocrat votes for " + states[index].getStateName() + ": " + states[index].getDemocratVotes());
			ttlDemVotes += states[index].getDemocratVotes();
			index++;
		}
		
		output.append("\n\n\t\tTotal Republican Votes: " + ttlRepubVotes + "\n\t\tTotal Democrat Votes: " + ttlDemVotes);
		
		
		return output.toString();
	}

}
