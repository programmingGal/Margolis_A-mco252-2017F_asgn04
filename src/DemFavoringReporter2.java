
// Observer #2 favors Democrat

public class DemFavoringReporter2 extends BasicReporter
{
   public DemFavoringReporter2(ElectionData electionData)
   {
	   super(electionData); 
   	// call strategies that favor democrat candidates
   	
  	 popVote = new PopularVoteStrategy2();
  	 electVote = new ElectoralCollegeFavorDemStrategy4();
  	 reporterNum = 2;
   }
}
