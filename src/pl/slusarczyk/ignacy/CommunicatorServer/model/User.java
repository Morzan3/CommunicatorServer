package pl.slusarczyk.ignacy.CommunicatorServer.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;

import pl.slusarczyk.ignacy.CommunicatorClient.serverhandeledevent.NewMessage;

/**Klasa User zawiera wszystkie informacje o konkretnym użytkowniku
 * Na te informacji składa się jego userId oraz zbiór wiadomości typu Message, które reprezentują wszystkie wiadomości wysłane przez niego
 *  
 * @author Ignacy ŚLusarczyk
 *
 */

class User implements Serializable
{
	private static final long serialVersionUID = 1L;
	/** ID danego użytkownika **/
	private final UserId userID;
	/**Zbiór wysłanych przez użytkownika wiadomości **/
	private final HashSet<Message> messageHistory;
	
	/**Konstruktor tworzący użytkownika o podanym imieniu
	 * 
	 * @param userName Nazwa użytkownika, którego tworzymy
	 */
	public User (final UserId userId)
	{
		this.userID = userId;
		messageHistory = new HashSet<Message>();
	}
	
	
	/**Metoda zwracająca nazwę danego użytkownika**/
	public UserId getUserID ()
	{
		return userID;
	}
	
	/**Metoda zwracająca zbiór wiadomości wysłanych przez danego użytkowniak **/
	public HashSet<Message> getUserMessageHistory ()
	{
		return messageHistory;
	}
	
	/**Metoda dodająca wiadomość do zbioru wiadomości danego użytkownika
	 * 
	 * @param textMessage Treść dodawanej wiadomości
	 * @param timestamp Znacznik czasowy dodawanej wiadomości
	 */
	public void addMessage (final NewMessage newMessageinformation,final Date timestamp)
	{
		messageHistory.add(new Message(newMessageinformation.getMessage(),timestamp));
	}
	
	
}