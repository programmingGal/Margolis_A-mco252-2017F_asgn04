
//Observer #3: Favors democrat for popular vote and republican for electoral vote


public class DemPopularRepElectoralReporter3 extends BasicReporter
{
   public DemPopularRepElectoralReporter3(ElectionData electionData)
   {
	   super(electionData); 
	   
   	// call strategies that favor Democrat party for popular vote and Republican party for electoral vote
   	
  	 popVote = new PopularVoteStrategy2();
  	 electVote = new ElectoralCollegeFavorRepubStrategy2();
  	 reporterNum = 3;
   }
}
