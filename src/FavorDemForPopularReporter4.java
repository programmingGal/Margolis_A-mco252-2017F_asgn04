// Observer #4 favors democrat for popular vote, but reports on Electoral College honestly


public class FavorDemForPopularReporter4 extends BasicReporter
{
   public FavorDemForPopularReporter4(ElectionData electionData)
   {
	   super(electionData); 
	   
   	// call appropriate strategies
   	
  	 popVote = new PopularVoteStrategy2();
  	 electVote = new ElectoralCollegeHonestStrategy5();
  	 reporterNum = 4;
   }
}
