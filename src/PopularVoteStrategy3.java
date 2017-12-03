
public class PopularVoteStrategy3 implements IPopularVote
{
  public PopularVoteStrategy3()
  {
	  
  }
  
  public String reportPopularVote(State [] states)
  {
	  int ttlRepubVotes = 0;
	  int ttlDemVotes =0;
	  
	  StringBuilder output = new StringBuilder();
	  
	  int index = 0;
	  
	  while (index < 5)
	  {
		  output.append("\n\tRepublican votes for " + states[index].getStateName() + ": " + states[index].getRepublicanVotes());
	      ttlRepubVotes += states[index].getRepublicanVotes();
	      index ++;
	  }
	  
	  output.append("\n");
	  index = 0;
	  
	  while (index < 5)
	  {
		  output.append("\n\tDemocrat votes for " + states[index].getStateName() + ": " + states[index].getDemocratVotes());
	      ttlDemVotes += states[index].getDemocratVotes();
	      index ++;
	  }
	  
	  output.append("\n\n\t\tTotal Republican Votes: " + ttlRepubVotes + "\n\t\tTotal Democrat Votes: " + ttlDemVotes);
	  return output.toString();
	  
	  
  }
}
