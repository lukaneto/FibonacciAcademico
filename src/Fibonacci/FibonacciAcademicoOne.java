package Fibonacci;

public class FibonacciAcademicoOne {

	public static void main(String[] args) {
		int n = 100;
		int atual = 0;
		int anterior = 0;
		
		for(int i = 0;i<=n;i++){
			if(i==1){
				atual = 1;
				anterior = 0;
			}else{
				atual+=anterior;
				anterior  = atual - anterior;
			}
			
			System.out.print(" "+atual);
		}
	}

}
