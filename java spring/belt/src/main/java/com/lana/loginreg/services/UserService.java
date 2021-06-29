package com.lana.loginreg.services;


import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.lana.loginreg.models.Attend;
import com.lana.loginreg.models.Event;
import com.lana.loginreg.models.Message;
import com.lana.loginreg.models.State;
import com.lana.loginreg.models.User;
import com.lana.loginreg.repositories.AttendRepo;
import com.lana.loginreg.repositories.EventRepo;
import com.lana.loginreg.repositories.MessageRepo;
import com.lana.loginreg.repositories.StateRepo;
import com.lana.loginreg.repositories.UserRepository;



@Service
public class UserService {
    private final UserRepository userRepository;
    private final StateRepo stateRepo;
    private final MessageRepo messageRepo;
    private final EventRepo eventRepo;
    private final AttendRepo attendRepo;
    
    
    public UserService(UserRepository userRepository , StateRepo stateRepo ,MessageRepo messageRepo , EventRepo eventRepo , AttendRepo attendRepo ) {
        this.userRepository = userRepository;
        this.stateRepo = stateRepo;
        this.messageRepo = messageRepo;
        this.eventRepo = eventRepo;
        this.attendRepo = attendRepo;
        
        
    }
    

    public User registerUser(User user) {
        String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
        user.setPassword(hashed);
        return userRepository.save(user);
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    
    // find user by id
    public User findUserById(Long id) {
    	Optional<User> u = userRepository.findById(id);
    	
    	if(u.isPresent()) {
            return u.get();
    	} else {
    	    return null;
    	}
    }
    

    public boolean authenticateUser(String email, String password) {
        // first find the user by email
        User user = userRepository.findByEmail(email);
        // if we can't find it by email, return false
        if(user == null) {
            return false;
        } else {

            if(BCrypt.checkpw(password, user.getPassword())) {
                return true;
            } else {
                return false;
            }
        }
    }
    
  ////////////////////////////////////////////////////////////////////////  
    
public Event createEvent(Event E) {
		
		return eventRepo.save(E);
		
	}
	
public Event findEvent(Long id) {
	
	return eventRepo.findById(id).orElse(null);
}
public List<Event> stateEvents(State state){
	return eventRepo.findByState(state);
}

////////////////////////////////////////////////////////////////////////////
public Attend createAttend(Attend A) {
	
	return attendRepo.save(A);
	
}

public Attend findAttend(Long id) {

return attendRepo.findById(id).orElse(null);
}

////////////////////////////////////////////////////////////////////////////////

public Message createMessage(Message A) {
	
	return messageRepo.save(A);
	
}

public Message findMessage(Long id) {

return messageRepo.findById(id).orElse(null);
}

////////////////////////////////////////////////////////////////////////////////////////

public State createState(State S) {
	
	return stateRepo.save(S);
	
}

public State findState(Long id) {

return stateRepo.findById(id).orElse(null);
}



public List <State> findallStates(){
	return stateRepo.findAll();
}

public List <State> allStatesExcept(Long id){
	return stateRepo.findByIdNotContains(id);
}


 
/////////////////////////////////////////////////////////////////////////////////
    
    
    
    
    
    
}
