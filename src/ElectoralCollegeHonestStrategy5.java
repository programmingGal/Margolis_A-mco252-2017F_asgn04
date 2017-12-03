// just displays what it got - no distortion


public class ElectoralCollegeHonestStrategy5 implements IElectoralVote
{
   public ElectoralCollegeHonestStrategy5()
   {
	   
   }
   
   public String reportElectoralVote(State [] states)
   {
	      int repElectVotes =0;
		  int demElectVotes =0;
			
		   int index =0;
		   
		   StringBuilder output = new StringBuilder();
		   
		   while (index < 5)
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
			   
			   index++;
		   }
		   
		   output.append("\n\n\tFor the states combined: Republicans have " + repElectVotes + " electoral votes, Democrats have " + demElectVotes+" electoral votes.");
		   
		   return output.toString();
   }
}
