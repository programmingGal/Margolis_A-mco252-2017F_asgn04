
// favors Republicans

public class PopularVoteStrategy1 implements IPopularVote
{
  public PopularVoteStrategy1()
  {
	  
  }
  
  public String reportPopularVote(State [] states)
  {
	  int index=0;
	  StringBuilder output = new StringBuilder ();
	  int ttlRepubVotes=0;
	  int ttlDemVotes=0;
	  
	  while (index<5)
	  {
		  output.append("\n\tRepublican Votes for " +states[index].getStateName() + ": " + states[index].getRepublicanVotes());
		  ttlRepubVotes += states[index].getRepublicanVotes();
		  
		  index++;
	  }
	  
	  output.append("\n");
	  
	  index =0;     // reset index for next loop
	  
	  while (index < 5)
	  {
	   output.append(String.format("\n\tDemocrat Votes for " + states[index].getStateName() + ": %.0f" ,states[index].getDemocratVotes()*.95 ));
	   ttlDemVotes += states[index].getDemocratVotes()*.95;
	    index++;
	  }
	  
	  output.append("\n\n\t\tTotal Republican Votes: " + ttlRepubVotes + "\n\t\tTotal Democrat Votes: " + ttlDemVotes);
	  
	  return output.toString();
  }
}
