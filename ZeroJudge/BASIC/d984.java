package BASIC;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;

public class d984 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			Candidate[] candidates = new Candidate[3];
			for (int i = 0; i < candidates.length; ++i) {
				candidates[i] = new Candidate(
						new Character((char) (i + 'A')).toString(),
						input.nextInt());
			}

			Arrays.sort(candidates, new CandidateComparator());
			
			if(candidates[0].voteGot + candidates[1].voteGot > candidates[2].voteGot){
				System.out.println(candidates[1].name);
			}
			else{
				System.out.println(candidates[2].name);
			}
		}
	}

}

class Candidate {
	String name;
	long voteGot;

	Candidate(String name, int voteGot) {
		this.name = name;
		this.voteGot = voteGot;
	}
}

class CandidateComparator implements Comparator<Candidate> {
	@Override
	public int compare(Candidate c1, Candidate c2) {
		if (c1.voteGot < c2.voteGot) {
			return -1;
		} else if (c1.voteGot > c2.voteGot) {
			return 1;
		}

		return 0;
	}
}
