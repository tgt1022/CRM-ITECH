package org.POJO;

// Generated 16-Jul-2014 02:41:33 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * UserView generated by hbm2java
 */
@Entity
@Table(name = "user_view", catalog = "itechcrm")
public class UserView implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8807911196779705795L;
	private Integer viewid;
	private UserAccounts userAccounts;
	private Set<UserViewDetails> userViewDetailses = new HashSet<UserViewDetails>(
			0);

	public UserView() {
	}

	public UserView(UserAccounts userAccounts,
			Set<UserViewDetails> userViewDetailses) {
		this.userAccounts = userAccounts;
		this.userViewDetailses = userViewDetailses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "viewid", unique = true, nullable = false)
	public Integer getViewid() {
		return this.viewid;
	}

	public void setViewid(Integer viewid) {
		this.viewid = viewid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userid")
	public UserAccounts getUserAccounts() {
		return this.userAccounts;
	}

	public void setUserAccounts(UserAccounts userAccounts) {
		this.userAccounts = userAccounts;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userView")
	public Set<UserViewDetails> getUserViewDetailses() {
		return this.userViewDetailses;
	}

	public void setUserViewDetailses(Set<UserViewDetails> userViewDetailses) {
		this.userViewDetailses = userViewDetailses;
	}

}
