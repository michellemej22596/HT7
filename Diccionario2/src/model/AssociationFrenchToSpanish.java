package model;
//Codigo de referencia https://www.edureka.co/blog/association-in-java/#:~:text=Association%20in%20Java%20is%20a,and%20many%2Dto%2Dmany.
public class AssociationFrenchToSpanish {
	
	String frenchWord;
	String spanishMeaning;
	/**
	 * @return the frenchWord
	 */
	public String getFrenchWord() {
		return frenchWord;
	}
	/**
	 * @param frenchWord the frenchWord to set
	 */
	public void setFrenchWord(String frenchWord) {
		this.frenchWord = frenchWord;
	}
	/**
	 * @return the spanishMeaning
	 */
	public String getSpanishMeaning() {
		return spanishMeaning;
	}
	/**
	 * @param spanishMeaning the spanishMeaning to set
	 */
	public void setSpanishMeaning(String spanishMeaning) {
		this.spanishMeaning = spanishMeaning;
	}

}
