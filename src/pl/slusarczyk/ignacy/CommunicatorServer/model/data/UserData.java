package pl.slusarczyk.ignacy.CommunicatorServer.model.data;

import java.io.Serializable;
import java.util.HashSet;

import pl.slusarczyk.ignacy.CommunicatorServer.model.UserId;

/**
 * Klasa opakowująca klasę User, wysyłana do klienta
 * 
 * @author Ignacy Ślusarczyk
 */
public class UserData implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**Id użytkownika**/
	final private UserId userId;
	/**Zbiór opakowanych wiadomości użytkownika**/
	final private HashSet<MessageData> usersMessages;
	
	public UserData(final UserId userId, final HashSet<MessageData> userMessages)
	{
		this.userId = userId;
		this.usersMessages = userMessages;
	}

	/**
	 * Metoda zwracająca userID użytkownika
	 * 
	 * @return userId ID użytkownika
	 */
	public UserId getUserId() 
	{
		return userId;
	}

	/**
	 * Metoda zwracająca zbiór opakowanych wiadomości użytkownika
	 * 
	 * @return usersMessages set opakowanych widomości
	 */
	public HashSet<MessageData> getUsersMessages() 
	{
		return usersMessages;
	}
}
