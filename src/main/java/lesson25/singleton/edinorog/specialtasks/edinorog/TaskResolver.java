package lesson25.singleton.edinorog.specialtasks.edinorog;

public class TaskResolver {

    public static String resolveOneCase(String caseInput) {
	// e.g. caseInput = 6 2 0 2 0 2 0
	String[] inputAsArray = caseInput.split(" ");
	int N = Integer.parseInt(inputAsArray[0]); // кол-во единорогов
	int R = Integer.parseInt(inputAsArray[1]); // кол-во красногривых
	int O = Integer.parseInt(inputAsArray[2]); // кол-во оранжевогривых
	int Y = Integer.parseInt(inputAsArray[3]); // кол-во желтогривых
	int G = Integer.parseInt(inputAsArray[4]); // кол-во зеленогривых
	int B = Integer.parseInt(inputAsArray[5]); // кол-во голубогривых
	int V = Integer.parseInt(inputAsArray[6]); // кол-во фиолетовогривых

	String answer = resolveTask(N, R, O, Y, G, B, V);

	return answer;
    }

    private static String resolveTask(int N, int R, int O, int Y, int G, int B, int V) {
	char[] stall = new char[N];

	if (R >= Y && R >= B) {
	    stall[0] = 'R';
	    R--;
	} else if (Y > R && Y >= B) {
	    stall[0] = 'Y';
	    Y--;
	} else {
	    stall[0] = 'B';
	    B--;
	}

	for (int i = 1; i < stall.length; i++) {
	    if (stall[i - 1] == 'R') {
		if (Y > B) {
		    stall[i] = 'Y';
		    Y--;
		} else {
		    stall[i] = 'B';
		    B--;
		}
	    } else if (stall[i - 1] == 'Y') {
		if (R > B) {
		    stall[i] = 'R';
		    R--;
		} else {
		    stall[i] = 'B';
		    B--;
		}
	    } else if (stall[i - 1] == 'B') {
		if (Y > R) {
		    stall[i] = 'Y';
		    Y--;
		} else {
		    stall[i] = 'R';
		    R--;
		}
	    }
	    if (Y < 0 || B < 0 || R < 0) {
		return "IMPOSSIBLE";
	    }
	}
	
	if (stall[0] == stall[stall.length - 1]) {
	    char temp = stall[stall.length - 1];
	    stall[stall.length - 1] = stall[stall.length - 2];
	    stall[stall.length - 2] = temp;
	}
	
	if (stall[stall.length - 3] == stall[stall.length - 2]) {
	    return "IMPOSSIBLE";
	}
	return new String(stall);
    }
}
