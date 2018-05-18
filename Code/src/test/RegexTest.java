package test;

public class RegexTest {
	public static void main(String[] args) {
		String str = " select * from [dbo].[MapCasinoJurisdiction] map INNER JOIN dbo.Casino casino ON  map.CasinoId = casino.CasinoId and casino.CasinoCode= 'cds_italy' ;";
		
		String query =str.replaceFirst("^'", "abc");
		System.out.println(query);
		System.out.println(str);
	}
}
