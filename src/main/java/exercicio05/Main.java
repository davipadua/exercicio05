package exercicio05;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main app = new Main();
		app.start();

	}

	private void start() {
		// TODO Auto-generated method stub
		
		for(int i = 0; i <= 5; i++) {
			
			switch(i) {
			
			case 1:
				System.out.println("primeira condi��o");
				break;
				
			case 4:
				System.out.println("segunda condi��o");
				break;
				
				default:
					System.out.println("nao encontrou nenhuma condi��o");
					break;
			}
			
		}
		
	}

}
