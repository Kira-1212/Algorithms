package LCS;

public class Minimum_Del_Ins {
	public static void main(String[] args) {
		String a = "geeksforgeeks";
		String b = "geeks";
		
		
		int lcs = LCS(a,b);
		System.out.println("Minimum Deletions " + (a.length() - lcs));
		System.out.println("Minimum Insertions " + (b.length() - lcs));
	}




	public static int LCS(String a, String b) {
		// TODO Auto-generated method stub
		int[][] t = new int[a.length()+1][b.length()+1];
		
		for(int i = 0; i< b.length()+1; i++)
			t[0][i] = 0;
		
		for(int i = 0; i< a.length()+1; i++)
			t[i][0] = 0;
		
		for(int i = 1; i< a.length()+1; i++)
			for(int j = 1; j<b.length()+1; j++) {
				if(a.charAt(i-1) == b.charAt(j-1))
					t[i][j] = 1 + t[i-1][j-1];
				else
					t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
			}
		return t[a.length()][b.length()];
	}
}