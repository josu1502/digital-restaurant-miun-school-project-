/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import beans.entities.MessageLog;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author Joakim
 */
@Named(value = "messageMethods")
@SessionScoped
public class MessageMethods implements Serializable {

    @PersistenceContext(unitName = "WebGuestBookPU")
    private EntityManager em;
    @Resource
    private javax.transaction.UserTransaction utx;
    
    private String name = "";
    private String message = "";

    
    private String name;
    private String message;
    /**
     * Creates a new instance of MessageMethods
     */
    public MessageMethods() {
    }
    
<<<<<<< HEAD
    
=======
>>>>>>> 046a51201cf6ad0cb3a65484573073fa63b18261
    public void sendMessage() {
        MessageLog msglog = new MessageLog();
        msglog.setName(name);
        msglog.setMessage(message);
        
        persist(msglog);
        
<<<<<<< HEAD
        name = "";
        message = "";
=======
        setName("");
        setMessage("");
>>>>>>> 046a51201cf6ad0cb3a65484573073fa63b18261
    }
    
    public String getMessages() {
        TypedQuery<MessageLog> q = em.createNamedQuery("getAll", MessageLog.class);
        List<MessageLog> resultList = q.getResultList();
        
        String allMessages = "";
        
        for (int i = 0; i < resultList.size(); i++) {
            MessageLog nameAndMessage = resultList.get(i);
            allMessages += nameAndMessage.getName();
            allMessages += ": ";
            allMessages += nameAndMessage.getMessage();
            allMessages += "\n";
            //nameAndMessage.
            //allMessages += System.getProperty("line.Seperator");
        }
        
        return allMessages;
    }

    public void persist(Object object) {
        try {
            utx.begin();
            em.persist(object);
            utx.commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            throw new RuntimeException(e);
        }
    }

<<<<<<< HEAD
    /**
     * @return the name
     */
=======
>>>>>>> 046a51201cf6ad0cb3a65484573073fa63b18261
    public String getName() {
        return name;
    }

<<<<<<< HEAD
    /**
     * @param name the name to set
     */
=======
>>>>>>> 046a51201cf6ad0cb3a65484573073fa63b18261
    public void setName(String name) {
        this.name = name;
    }

<<<<<<< HEAD
    /**
     * @return the message
     */
=======
>>>>>>> 046a51201cf6ad0cb3a65484573073fa63b18261
    public String getMessage() {
        return message;
    }

<<<<<<< HEAD
    /**
     * @param message the message to set
     */
=======
>>>>>>> 046a51201cf6ad0cb3a65484573073fa63b18261
    public void setMessage(String message) {
        this.message = message;
    }
    
}
