// favors democrat - state with most electoral votes will go democrat


public class ElectoralCollegeFavorDemStrategy3 implements IElectoralVote
{
	   public ElectoralCollegeFavorDemStrategy3()
	   {
		   
	   }
	   
	   public String reportElectoralVote(State [] states)
	   {
		   int indexOfState = 0;                           // to keep track of index of state with the most electoral votes
		   int max = states[0].getElectoralVotes();        // set max to # of electoral votes of first state
		   int repElectVotes =0;
		   int demElectVotes =0;
			
		   int index =1;
		   
		   StringBuilder output = new StringBuilder();
		   
		   while (index < 5)
		   {
			   if (states[index].getElectoralVotes()> max)
			   {
				   max = states[index].getElectoralVotes();
				   indexOfState = index;
			   }
			   
			   index++;
	       }
		   
		   
		   
		   index =0;
		   
		   
		   while (index < 5)
		   {
			   if (index != indexOfState)
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
			   
			   else                    // we've entered our special case - state with the most electoral votes
			   {
				   output.append("\n\t" + states[index].getStateName() + ": Democrat Party is winning.");
				   demElectVotes += states[index].getElectoralVotes();
			   }
			   
			   
			   index++;
		   }
		   
		   output.append("\nFor the states combined: Republicans have " + repElectVotes + ", Democrats have " + demElectVotes+".");
		   
		   return output.toString();
       }
}

















