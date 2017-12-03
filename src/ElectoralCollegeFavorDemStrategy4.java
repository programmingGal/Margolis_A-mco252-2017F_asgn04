
// favors democrat by making 2% of republican votes democrat in every state.


public class ElectoralCollegeFavorDemStrategy4 implements IElectoralVote
{
  public ElectoralCollegeFavorDemStrategy4()
  {
	  
  }
  
  public String reportElectoralVote(State [] states)
  {   
	  int repPopular=0;
	  int demPopular=0;
	  int repElectVotes =0;
	  int demElectVotes =0;
		
	   int index =0;
	   
	   StringBuilder output = new StringBuilder();
	   
	   while (index < 5)
	   {  
		   demPopular = (int) (states[index].getDemocratVotes() +  ( .02*states[index].getRepublicanVotes())); 
		   repPopular = (int) (states[index].getRepublicanVotes() -  ( .02*states[index].getRepublicanVotes())); 
		   
		   
		   if (demPopular > repPopular)
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

