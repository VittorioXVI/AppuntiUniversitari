package pq;

public class EccezioneElementoGiąPresente extends RuntimeException{
	
	EccezioneElementoGiąPresente(){
		
	}

	EccezioneElementoGiąPresente(String messaggio){
		super(messaggio);
	}


}
