package user.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import user.security.dao.UserDao;
import user.security.domain.Users;

@Service
public class BoardUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users user = userDao.findById(username);
		if (user == null) {
			throw new UsernameNotFoundException(username + "사용자 없음");
		}else {
			return new SecurityUser(user);
		}
	}
}
