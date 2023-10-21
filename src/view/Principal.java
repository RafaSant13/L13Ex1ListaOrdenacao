package view;

import model.Lista;

public class Principal {

	public static void main(String[] args) {
		Lista<Integer> l = new Lista<Integer>();
		
		l.addFirst(6);
		l.addFirst(3);
		l.addFirst(7);
		l.addFirst(4);
		l.addFirst(2);
		l.addFirst(9);
		l.addFirst(1);
		l.addFirst(8);
		l.addFirst(5);
		l.addFirst(10);
		
		int tamanho = l.size();
		int a, b, i, j;
		for (i = 0; i<tamanho;i++) {
			try {
				a = l.get(0);
				l.removeFirst();
				b = l.get(0);
				l.removeFirst();
				for (j = tamanho-2; j>0;j--) {
					if (a>b) {
						l.addLast(b);
						b = l.get(0);
						l.removeFirst();
					}
					else {
						l.addLast(a);
						a = l.get(0);
						l.removeFirst();
					}
				}
				if (a>b) {
					l.addLast(b);
					l.addLast(a);
				}
				else {
					l.addLast(a);
					l.addLast(b);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		for (i = 0; i<tamanho; i++) {
			try {
				a = l.get(i);
				System.out.print(a + " ");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
	}

}
