package controller;

public class cModulos {
	public int somaNaturais (int n, int s) {
		if (n == 0) {
			return s;
		} else {
			s = s + n;
			return somaNaturais(n-1, s);
		}
	}

}
