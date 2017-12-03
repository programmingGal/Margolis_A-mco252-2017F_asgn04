
// Favors Republican: takes the state with the smallest democratic lead and splits the electoral votes in 1/2. (extra goes Republican!)


public class ElectoralCollegeFavorRepubStrategy2  implements IElectoralVote
{
	
	public ElectoralCollegeFavorRepubStrategy2()
	{
		
	}
	
	public String reportElectoralVote(State [] states)
	{
		int minLead= Integer.MAX_VALUE;         // to hold the current smallest democrat lead
		int index = 0;
		int indexOfState=0;
		int repElectVotes =0;
		int demElectVotes =0;
		
		StringBuilder output = new StringBuilder();
		
		
		
		while (index<5)
		{
			if (states[index].getDemocratVotes()> states[index].getRepublicanVotes())
					{
				         if (states[index].getDemocratVotes()- states[index].getRepublicanVotes() < minLead)
				         {
				        	 minLead = states[index].getDemocratVotes()- states[index].getRepublicanVotes();
				        	 indexOfState = index;
				         }
					}
			
			index++;
		}
		
		
		
		index = 0;
		
		while (index<5)
		{
				if (index!=indexOfState)
				{
					
				
						if (states[index].getDemocratVotes() > states[index].getRepublicanVotes())
						{
					     output.append("\n\t" + states[index].getStateName() + ": Democrat Party is winning." );
					     demElectVotes += states[index].getElectoralVotes();
						}
						
						else // republican votes are more than democrat votes for that state
						{
							output.append("\n\t" + states[index].getStateName() + ": Republican Party is winning." );
							repElectVotes += states[index].getElectoralVotes();
						}
				
				}
				
				else   // we're at the special case - state with smallest democrat lead
				{
						if ((states[index].getElectoralVotes()%2)==0)     // if there's even amount of electoral votes for that state
						{
							repElectVotes += (.5*states[index].getElectoralVotes());    // give 1/2 to each party
							demElectVotes += (.5*states[index].getElectoralVotes());
							
							output.append("\n\t" + states[index].getStateName() + ": Tie between Republican and Democrat parties." );
						}
						
						else                                             // odd amount - extra goes to republican
						{
							repElectVotes += ((states[index].getElectoralVotes()/2) + 1);
							demElectVotes += (states[index].getElectoralVotes()/2);
							
							output.append("\n\t" + states[index].getStateName() + ": Republican Party is winning." );
						}
						
						
				}
				
				index++;
		}
		
		
		output.append("\n\n\tFor the states combined: Republicans have " + repElectVotes + " electoral votes, Democrats have " + demElectVotes+" electoral votes.");
		
		return output.toString();
		
		
	}

}











