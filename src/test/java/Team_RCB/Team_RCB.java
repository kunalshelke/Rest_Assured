package Team_RCB;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class Team_RCB 
{
	int foreignPlayers=0;
	int wicketKeeper=0;
	@Test
	public void RCBparcing()
	{
		String jsonStringPayload=
				"{\r\n" + 
				"\"name\":\"Royal Challengers Bangalore\",\r\n" + 
				"\"location\":\"Bangalore\",\r\n" + 
				"\"player\":[\r\n" + 
				"{\r\n" + 
				" \"name\":\"Faf Du Plessis\",\r\n" + 
				" \"country\":\"South Africa\",\r\n" + 
				" \"role\":\"Batsman\",\r\n" + 
				" \"price-in-crores\":\"7\"\r\n" + 
				" },\r\n" + 
				" {\r\n" + 
				" \"name\":\"Virat Kohli\",\r\n" + 
				" \"country\":\"India\",\r\n" + 
				" \"role\":\"Batsman\",\r\n" + 
				" \"price-in-crores\":\"15\"\r\n" + 
				" },\r\n" + 
				" {\r\n" + 
				" \"name\":\"Glenn Maxwell\",\r\n" + 
				" \"country\":\"Australia\",\r\n" + 
				" \"role\":\"Batsman\",\r\n" + 
				" \"price-in-crores\":\"11\"\r\n" + 
				" },\r\n" + 
				" {\r\n" + 
				" \"name\":\"Mohammad Siraj\",\r\n" + 
				" \"country\":\"India\",\r\n" + 
				" \"role\":\"Bowler\",\r\n" + 
				" \"price-in-crores\":\"7\"\r\n" + 
				" },\r\n" + 
				" {\r\n" + 
				" \"name\":\"Harshal Patel\",\r\n" + 
				" \"country\":\"India\",\r\n" + 
				" \"role\":\"Bowler\",\r\n" + 
				" \"price-in-crores\":\"10.75\"\r\n" + 
				" },\r\n" + 
				" {\r\n" + 
				" \"name\":\"Wanindu Hasaranga\",\r\n" + 
				" \"country\":\"Srilanka\",\r\n" + 
				" \"role\":\"Bowler\",\r\n" + 
				" \"price-in-crores\":\"10.75\"\r\n" + 
				" },\r\n" + 
				" {\r\n" + 
				" \"name\":\"Dinesh Karthik\",\r\n" + 
				" \"country\":\"India\",\r\n" + 
				" \"role\":\"Wicket-keeper\",\r\n" + 
				" \"price-in-crores\":\"5.5\"\r\n" + 
				" },\r\n" + 
				" {\r\n" + 
				" \"name\":\"Shahbaz Ahmed\",\r\n" + 
				" \"country\":\"India\",\r\n" + 
				" \"role\":\"All-Rounder\",\r\n" + 
				" \"price-in-crores\":\"2.4\"\r\n" + 
				" },\r\n" + 
				" {\r\n" + 
				" \"name\":\"Rajat Patidar\",\r\n" + 
				" \"country\":\"India\",\r\n" + 
				" \"role\":\"Batsman\",\r\n" + 
				" \"price-in-crores\":\"0.20\"\r\n" + 
				" },\r\n" + 
				" {\r\n" + 
				" \"name\":\"Josh Hazlewood\",\r\n" + 
				" \"country\":\"Australia\",\r\n" + 
				" \"role\":\"Bowler\",\r\n" + 
				" \"price-in-crores\":\"7.75\"\r\n" + 
				" },\r\n" + 
				" {\r\n" + 
				" \"name\":\"Manipal Lomror\",\r\n" + 
				" \"country\":\"India\",\r\n" + 
				" \"role\":\"Bowler\",\r\n" + 
				" \"price-in-crores\":\"7.75\"\r\n" + 
				" }\r\n" + 
				" ]\r\n" + 
				" }";
		
		JsonPath J=new JsonPath(jsonStringPayload);
		
		List<Object> L=J.getList("player");
		System.err.println(L);
		
		
//		Test Case Number: 1
		
		List<Object> C=J.getList("player.country");
		
		for(int i=0;i<C.size();i++) 
		{
			System.out.println(C.get(i));
			
			if(!C.get(i).equals("India")) 
			{
				foreignPlayers++;			
			}		
		}
		
		if (foreignPlayers==4)
		{
			System.out.println("Test Case Nuber: 1 is Pass");
			
		}
	

		
		
		
//		Test Case Number: 2
		
		List<Object> W=J.getList("player.role");	
		
		for(int i=0;i<W.size();i++) 
		{
			if(W.get(i).equals("Wicket-keeper")) 
			{
				wicketKeeper++;
				
			}		
		}
		
		if (wicketKeeper<=1)
		{
			System.out.println("Test Case Number: 2 is Pass");
			
		}
		
		
    }

}